/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import controlador.controladorgrafica;
import controlador.controladornevera;
import java.awt.BorderLayout;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Date;
import java.sql.Time;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.conexion;
import modelo.graficas;
import modelo.temp;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.view.JasperViewer;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.ChartUtilities;
import org.jfree.chart.JFreeChart;
import org.jfree.data.time.Second;
import org.jfree.data.time.TimeSeries;
import org.jfree.data.time.TimeSeriesCollection;

/**
 *
 * @author GLOBAL
 */
public class validacioncon extends javax.swing.JInternalFrame {

    TimeSeries series = new TimeSeries("Temperatura máxima", Second.class);
    TimeSeries series2 = new TimeSeries("Temperatura mínima", Second.class);
    TimeSeries series3 = new TimeSeries("Temperatura promedio", Second.class);
    TimeSeries series4 = new TimeSeries("Temperatura máxima limite", Second.class);
    TimeSeries series5 = new TimeSeries("Temperatura mínima limite", Second.class);

    TimeSeriesCollection datos = new TimeSeriesCollection();

    TimeSeries series6 = new TimeSeries("Temperatura máxima", Second.class);
    TimeSeries series7 = new TimeSeries("Temperatura mínima", Second.class);
    TimeSeries series8 = new TimeSeries("Temperatura promedio", Second.class);
    TimeSeries series9 = new TimeSeries("Temperatura máxima limite", Second.class);
    TimeSeries series10 = new TimeSeries("Temperatura mínima limite", Second.class);

    TimeSeriesCollection datos2 = new TimeSeriesCollection();

    TimeSeries series11 = new TimeSeries("Humedad máxima", Second.class);
    TimeSeries series12 = new TimeSeries("Humedad mínima", Second.class);
    TimeSeries series13 = new TimeSeries("Humedad promedio", Second.class);
    TimeSeries series14 = new TimeSeries("Humedad máxima limite", Second.class);
    TimeSeries series15 = new TimeSeries("Humedad mínima limite", Second.class);

    TimeSeriesCollection datos3 = new TimeSeriesCollection();

    SimpleDateFormat formato = new SimpleDateFormat("MM/dd/yy HH:mm:ss");
    SimpleDateFormat formato2 = new SimpleDateFormat("HH:mm:ss");
    SimpleDateFormat formato3 = new SimpleDateFormat("MM/dd/yy");

    controladornevera controlar = new controladornevera();
    controladorgrafica controlar2 = new controladorgrafica();
    String ident = menu.getIdent();

    JLabel l1 = new JLabel();
    JLabel l2 = new JLabel();
    JLabel l3 = new JLabel();

    JFileChooser seleccionar = new JFileChooser();

    byte[] imagen;
    File archivo;
    FileInputStream entrada;
    int longitudBytes;
    FileInputStream entrada2;
    int longitudbytes2;

    JFreeChart grafica = ChartFactory.createTimeSeriesChart("Gráfica de Temperatura", "Tiempo", "Temperatura", datos, true, true, true);
    JFreeChart grafica2 = ChartFactory.createTimeSeriesChart("Gráfica de temperatura", "Tiempo", "Temperatura", datos2, true, true, true);
    JFreeChart grafica3 = ChartFactory.createTimeSeriesChart("Gráfica de Humedad", "Tiempo", "Humedad", datos3, true, true, true);

    /**
     * Creates new form validacioncon
     *
     * @throws java.text.ParseException
     */
    public validacioncon() throws ParseException, IOException {
        conexion.getInstance();

        initComponents();
        setSize(1200, 620);
        setLocation(100, 20);
        llenarymostrargrafica();
        limpiarformulario();

    }

    public void guardarimagen() {

        String ruta;
        JFileChooser jFileChooser = new JFileChooser();
        jFileChooser.setApproveButtonText("Guardar");
        jFileChooser.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);
        int estado = jFileChooser.showOpenDialog(null);
        if (estado == JFileChooser.APPROVE_OPTION) {
            ruta = jFileChooser.getSelectedFile().getAbsolutePath();
            if (!ruta.endsWith(".png")) {
                ruta = ruta + ".png";
            }
            try {
                ChartUtilities.saveChartAsPNG(new File(ruta), grafica, getWidth(), getHeight());

            } catch (IOException ex) {
                JOptionPane.showMessageDialog(rootPane, "imagen: " + ex);
            }
        }

    }

    public void guardarimagendoble() {

        String ruta;
        String ruta2;
        JFileChooser jFileChooser = new JFileChooser();
        jFileChooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
        int estado = jFileChooser.showOpenDialog(null);
        if (estado == JFileChooser.APPROVE_OPTION) {
            ruta = jFileChooser.getSelectedFile().getAbsolutePath();
            ruta2 = jFileChooser.getSelectedFile().getAbsolutePath();
            if (!ruta.endsWith(".png")) {
                ruta = ruta + "temperatura" + ".png";
                ruta2 = ruta2 + "humedad" + ".png";
            }
            try {

                ChartUtilities.saveChartAsPNG(new File(ruta), grafica2, getWidth(), getHeight());
                ChartUtilities.saveChartAsPNG(new File(ruta2), grafica3, getWidth(), getHeight());

            } catch (IOException ex) {
                JOptionPane.showMessageDialog(rootPane, "imagen: " + ex);
            }
        }

    }

    public void llenarymostrargrafica() throws IOException {

        datos.addSeries(series);
        datos.addSeries(series2);
        datos.addSeries(series3);
        datos.addSeries(series4);
        datos.addSeries(series5);

        ChartPanel mg1 = new ChartPanel(grafica);

        mg1.setBounds(10, 10, 600, 380);
        mg1.setLayout(new BorderLayout(0, 0));
        l1.setBounds(8, 8, 630, 410);
        l1.setLayout(new BorderLayout(0, 0));
        l1.add(mg1, BorderLayout.CENTER);
        gn.add(l1, BorderLayout.CENTER);

        datos2.addSeries(series6);
        datos2.addSeries(series7);
        datos2.addSeries(series8);
        datos2.addSeries(series9);
        datos2.addSeries(series10);

        ChartPanel mg2 = new ChartPanel(grafica2);
        mg2.setBounds(10, 10, 620, 400);
        mg2.setLayout(new BorderLayout(0, 0));
        l2.setBounds(8, 8, 630, 410);
        l2.setLayout(new BorderLayout(0, 0));
        l2.add(mg2, BorderLayout.CENTER);
        datalo.add(l2, BorderLayout.CENTER);

        datos3.addSeries(series11);
        datos3.addSeries(series12);
        datos3.addSeries(series13);
        datos3.addSeries(series14);
        datos3.addSeries(series15);

        ChartPanel mg3 = new ChartPanel(grafica3);
        mg3.setBounds(10, 10, 620, 400);
        mg3.setLayout(new BorderLayout(0, 0));
        l3.setBounds(8, 8, 630, 410);
        l3.setLayout(new BorderLayout(0, 0));
        l3.add(mg3, BorderLayout.CENTER);
        datalo2.add(l3, BorderLayout.CENTER);

    }

    private void limpiarformulario() throws ParseException {

        String rols = menu.getRol();

        if (rols.equals("Director técnico")) {
            valid.setEnabled(false);
            Insertar.setEnabled(false);
        } else if (rols.equals("Líder de calidad")) {
            valid.setEnabled(false);
            Insertar.setEnabled(false);
        } else if (rols.equals("Analista")) {
            valid.setEnabled(true);
            Insertar.setEnabled(false);
        } else if (rols.equals("Técnico")) {
            valid.setEnabled(true);
            Insertar.setEnabled(false);
        } else {
            valid.setEnabled(false);
            Insertar.setEnabled(false);
        }

        id.setValue(0);
        tm.setText("Ingrese temperatura máxima");
        tmn.setText("ingrese temperatura mínima");
        hummax.setText("Ingrese humedad máxima");
        hummin.setText("Ingrese humedad mínima");
        obser.setText("Ingrese la observación");
        tm.setEnabled(false);
        tmn.setEnabled(false);
        tml.setValue(0);
        tmnl.setValue(0);
        re.setEnabled(false);
        re.setVisible(false);
        id.setVisible(false);
        id.setValue(0);
        tml.setVisible(false);
        tml.setValue(0);
        tmnl.setVisible(false);
        tmnl.setValue(0);
        obser.setEnabled(false);
        tmd.setVisible(false);
        tmnd.setVisible(false);
        tpd.setVisible(false);
        nor.setValue(0);
        fechaini.setEnabled(false);
        fechafin.setEnabled(false);
        tmp.setEnabled(false);
        tmp.setText("");
        nor.setVisible(false);
        hummax.setEnabled(false);
        hummin.setEnabled(false);
        hump.setEnabled(false);
        hump.setText("");
        huml.setValue(0);
        humlm.setValue(0);
        huml.setVisible(false);
        humlm.setVisible(false);
        fechaini.setText("");
        fechafin.setText("");
        ggrafica.setEnabled(false);
        insertarg.setEnabled(false);
        report.setEnabled(false);
        jComboBox1.setSelectedIndex(0);
        tpt.setSelectedIndex(0);
        llenarTabla(title);

    }

    public void llenarTabla(String text) {

        temp unTemp = new temp();
        DefaultTableModel tabla = (DefaultTableModel) this.TABLAT.getModel();
        Iterator<temp> itTemp = unTemp.listar();
        Object[] filatemp = new Object[TABLAT.getColumnCount()];
        tabla.setRowCount(0);
        while (itTemp.hasNext()) {
            unTemp = itTemp.next();

            filatemp[0] = unTemp.getNoreporte();
            filatemp[1] = unTemp.getTempmax();
            filatemp[2] = unTemp.getTempmin();
            filatemp[3] = unTemp.getTempp();
            filatemp[4] = unTemp.getTemplm();
            filatemp[5] = unTemp.getTemplmn();
            filatemp[6] = unTemp.getHummax();
            filatemp[7] = unTemp.getHummin();
            filatemp[8] = unTemp.getHump();
            filatemp[9] = unTemp.getHumlm();
            filatemp[10] = unTemp.getHumlmn();
            filatemp[11] = unTemp.getTc();
            filatemp[12] = unTemp.getFfin();
            filatemp[13] = unTemp.getObser();
            filatemp[14] = unTemp.getTipodetoma();
            tabla.addRow(filatemp);

        }
    }

    public void llenargrafica() throws ParseException {

        series.clear();
        series2.clear();
        series3.clear();
        series4.clear();
        series5.clear();
        series6.clear();
        series7.clear();
        series8.clear();
        series9.clear();
        series10.clear();
        series11.clear();
        series12.clear();
        series13.clear();
        series14.clear();
        series15.clear();

        String f1 = formato3.format(fecha1.getDate());
        String f2 = formato3.format(fecha2.getDate());

        Date r1 = formato3.parse(f1);
        Date r3 = formato3.parse(f2);

        SimpleDateFormat e1 = new SimpleDateFormat("MM");
        SimpleDateFormat e2 = new SimpleDateFormat("dd");

        int m = Integer.parseInt(e1.format(fecha1.getDate()));
        int m2 = Integer.parseInt(e1.format(fecha2.getDate()));
        int d1 = Integer.parseInt(e2.format(fecha1.getDate()));
        int d2 = Integer.parseInt(e2.format(fecha2.getDate()));

        int mf;
        int df = 0;

        if (m > m2) {
            mf = m - m2;
        } else {
            mf = m2 - m;
        }

        if (mf == 1) {
            for (int z = 0; d1 < 31; z++) {
                d1 = d1 + 1;
                df = df + 1;
            }
            df = df + d2;
        } else if (mf == 0) {
            if (d1 > d2) {
                df = d1 - d2;
            } else {
                df = d2 - d1;
            }
        }

        if (mf <= 1 && df <= 31) {
            for (int i = 0; i < TABLAT.getRowCount(); i++) {
                if (TABLAT.getValueAt(i, 14).equals("Nevera")) {

                    Date d = formato.parse((String) TABLAT.getValueAt(i, 11));
                    Date d3 = formato3.parse((String) TABLAT.getValueAt(i, 11));

                    if (d3.compareTo(r1) == 0) {
                        series.addOrUpdate(new Second(d), (Double.parseDouble((String) TABLAT.getValueAt(i, 1))));
                        series2.addOrUpdate(new Second(d), (Double.parseDouble((String) TABLAT.getValueAt(i, 2))));
                        series3.addOrUpdate(new Second(d), (Double.parseDouble((String) TABLAT.getValueAt(i, 3))));
                        series4.addOrUpdate(new Second(d), (Integer.parseInt((String) TABLAT.getValueAt(i, 4))));
                        series5.addOrUpdate(new Second(d), (Integer.parseInt((String) TABLAT.getValueAt(i, 5))));
                        System.out.println(d3);
                    } else if (d3.compareTo(r3) == 0) {
                        series.addOrUpdate(new Second(d), (Double.parseDouble((String) TABLAT.getValueAt(i, 1))));
                        series2.addOrUpdate(new Second(d), (Double.parseDouble((String) TABLAT.getValueAt(i, 2))));
                        series3.addOrUpdate(new Second(d), (Double.parseDouble((String) TABLAT.getValueAt(i, 3))));
                        series4.addOrUpdate(new Second(d), (Integer.parseInt((String) TABLAT.getValueAt(i, 4))));
                        series5.addOrUpdate(new Second(d), (Integer.parseInt((String) TABLAT.getValueAt(i, 5))));
                        System.out.println(d3);
                    } else if (d3.after(r1) && d3.before(r3)) {
                        series.addOrUpdate(new Second(d), (Double.parseDouble((String) TABLAT.getValueAt(i, 1))));
                        series2.addOrUpdate(new Second(d), (Double.parseDouble((String) TABLAT.getValueAt(i, 2))));
                        series3.addOrUpdate(new Second(d), (Double.parseDouble((String) TABLAT.getValueAt(i, 3))));
                        series4.addOrUpdate(new Second(d), (Integer.parseInt((String) TABLAT.getValueAt(i, 4))));
                        series5.addOrUpdate(new Second(d), (Integer.parseInt((String) TABLAT.getValueAt(i, 5))));
                        System.out.println(d3);
                    }

                } else if (TABLAT.getValueAt(i, 14).equals("Dataloyed")) {

                    Date d = formato.parse((String) TABLAT.getValueAt(i, 11));
                    Date d3 = formato3.parse((String) TABLAT.getValueAt(i, 11));

                    if (d3.compareTo(r1) == 0) {
                        series6.addOrUpdate(new Second(d), (Double.parseDouble((String) TABLAT.getValueAt(i, 1))));
                        series7.addOrUpdate(new Second(d), (Double.parseDouble((String) TABLAT.getValueAt(i, 2))));
                        series8.addOrUpdate(new Second(d), (Double.parseDouble((String) TABLAT.getValueAt(i, 3))));
                        series9.addOrUpdate(new Second(d), (Integer.parseInt((String) TABLAT.getValueAt(i, 4))));
                        series10.addOrUpdate(new Second(d), (Integer.parseInt((String) TABLAT.getValueAt(i, 5))));
                        series11.addOrUpdate(new Second(d), (Double.parseDouble((String) TABLAT.getValueAt(i, 6))));
                        series12.addOrUpdate(new Second(d), (Double.parseDouble((String) TABLAT.getValueAt(i, 7))));
                        series13.addOrUpdate(new Second(d), (Double.parseDouble((String) TABLAT.getValueAt(i, 8))));
                        series14.addOrUpdate(new Second(d), (Integer.parseInt((String) TABLAT.getValueAt(i, 9))));
                        series15.addOrUpdate(new Second(d), (Integer.parseInt((String) TABLAT.getValueAt(i, 10))));
                    } else if (d3.compareTo(r3) == 0) {
                        series6.addOrUpdate(new Second(d), (Double.parseDouble((String) TABLAT.getValueAt(i, 1))));
                        series7.addOrUpdate(new Second(d), (Double.parseDouble((String) TABLAT.getValueAt(i, 2))));
                        series8.addOrUpdate(new Second(d), (Double.parseDouble((String) TABLAT.getValueAt(i, 3))));
                        series9.addOrUpdate(new Second(d), (Integer.parseInt((String) TABLAT.getValueAt(i, 4))));
                        series10.addOrUpdate(new Second(d), (Integer.parseInt((String) TABLAT.getValueAt(i, 5))));
                        series11.addOrUpdate(new Second(d), (Double.parseDouble((String) TABLAT.getValueAt(i, 6))));
                        series12.addOrUpdate(new Second(d), (Double.parseDouble((String) TABLAT.getValueAt(i, 7))));
                        series13.addOrUpdate(new Second(d), (Double.parseDouble((String) TABLAT.getValueAt(i, 8))));
                        series14.addOrUpdate(new Second(d), (Integer.parseInt((String) TABLAT.getValueAt(i, 9))));
                        series15.addOrUpdate(new Second(d), (Integer.parseInt((String) TABLAT.getValueAt(i, 10))));
                    } else if (d3.after(r1) && d3.before(r3)) {
                        series6.addOrUpdate(new Second(d), (Double.parseDouble((String) TABLAT.getValueAt(i, 1))));
                        series7.addOrUpdate(new Second(d), (Double.parseDouble((String) TABLAT.getValueAt(i, 2))));
                        series8.addOrUpdate(new Second(d), (Double.parseDouble((String) TABLAT.getValueAt(i, 3))));
                        series9.addOrUpdate(new Second(d), (Integer.parseInt((String) TABLAT.getValueAt(i, 4))));
                        series10.addOrUpdate(new Second(d), (Integer.parseInt((String) TABLAT.getValueAt(i, 5))));
                        series11.addOrUpdate(new Second(d), (Double.parseDouble((String) TABLAT.getValueAt(i, 6))));
                        series12.addOrUpdate(new Second(d), (Double.parseDouble((String) TABLAT.getValueAt(i, 7))));
                        series13.addOrUpdate(new Second(d), (Double.parseDouble((String) TABLAT.getValueAt(i, 8))));
                        series14.addOrUpdate(new Second(d), (Integer.parseInt((String) TABLAT.getValueAt(i, 9))));
                        series15.addOrUpdate(new Second(d), (Integer.parseInt((String) TABLAT.getValueAt(i, 10))));
                    }

                }

            }

        } else if (mf > 1 || df > 31) {
            JOptionPane.showMessageDialog(rootPane, "No se puede graficar un rango de más de 31 dias");
        }

    }

    private temp obtenertemp() {

        Date fc = null;

        Time t1 = null;

        try {
            Date f = formato.parse(fecha.getText());
            String text = formato2.format(f);
            t1 = Time.valueOf(text);

            fc = formato.parse(fecha.getText());
            String tc = formato3.format(fc);
            fc = formato3.parse(tc);

        } catch (ParseException ex) {
            Logger.getLogger(validacioncon.class.getName()).log(Level.SEVERE, null, ex);
        }

        java.util.Date utildate = fc;
        java.sql.Date sqldate = new java.sql.Date(utildate.getTime());
        if (obser.getText().equals("Ingrese la observación")) {
            obser.setText("Campo Vacío");
        } else {
        }
        temp lostemp = new temp();
        lostemp.setTempmax(tm.getText());
        lostemp.setTempmin(tmn.getText());
        lostemp.setTempp(tmp.getText());
        lostemp.setTemplm(tml.getText());
        lostemp.setTemplmn(tmnl.getText());
        lostemp.setFinicio(sqldate);
        lostemp.setObser(obser.getText());
        lostemp.setTipodetoma((String) tpt.getSelectedItem());
        lostemp.setIdentificacion(this.ident);
        lostemp.setTinicio(t1);
        return lostemp;

    }

    private temp obtenertemp2() {

        Time t1 = null;
        Time t2 = null;
        Date fc = null;
        Date fc2 = null;
        try {
            Date f = formato.parse(fechaini.getText());
            String text = formato2.format(f);
            t1 = Time.valueOf(text);
            Date f2 = formato.parse(fechafin.getText());
            String text2 = formato2.format(f2);
            t2 = Time.valueOf(text2);

            fc = formato.parse(fechaini.getText());
            String tc = formato3.format(fc);
            fc = formato3.parse(tc);
            fc2 = formato.parse(fechafin.getText());
            String tc2 = formato3.format(fc2);
            fc2 = formato3.parse(tc2);

        } catch (ParseException ex) {
            Logger.getLogger(validacioncon.class.getName()).log(Level.SEVERE, null, ex);
        }
        java.util.Date utildate = fc;
        java.sql.Date sqldate = new java.sql.Date(utildate.getTime());
        java.util.Date utildate2 = fc2;
        java.sql.Date sqldate2 = new java.sql.Date(utildate2.getTime());
        if (obser.getText().equals("Ingrese la observación")) {
            obser.setText("Campo Vacío");
        } else {
        }
        temp lostemp = new temp();
        lostemp.setTempmax(tm.getText());
        lostemp.setTempmin(tmn.getText());
        lostemp.setTempp(tmp.getText());
        lostemp.setTemplm(tml.getText());
        lostemp.setTemplmn(tmnl.getText());
        lostemp.setHummax(hummax.getText());
        lostemp.setHummin(hummin.getText());
        lostemp.setHump(hump.getText());
        lostemp.setHumlm(huml.getText());
        lostemp.setHumlmn(humlm.getText());
        lostemp.setFinicio(sqldate);
        lostemp.setFfin(sqldate2);
        lostemp.setObser(obser.getText());
        lostemp.setTipodetoma((String) tpt.getSelectedItem());
        lostemp.setIdentificacion(this.ident);
        lostemp.setTinicio(t1);
        lostemp.setTfin(t2);
        return lostemp;
    }

    public void funciones() {

        double v = Double.parseDouble(tm.getText());
        double v2 = Double.parseDouble(tmn.getText());
        double v3 = (v + v2) / 2;

        Date fe = new Date();

        fecha.setText("" + fe);
        tmp.setText("" + v3);
        fecha.setText("" + formato.format(fe));

    }

    public void funciones2() {
        double v = Double.parseDouble(tm.getText());
        double v2 = Double.parseDouble(tmn.getText());
        double v3 = (v + v2) / 2;
        double v4 = Double.parseDouble(hummax.getText());
        double v5 = Double.parseDouble(hummin.getText());
        double v6 = (v4 + v5) / 2;

        Date fe = new Date();

        fecha.setText("" + fe);
        tmp.setText("" + v3);
        hump.setText("" + v6);
        fecha.setText("" + formato.format(fe));

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tabladouble = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablaenteros = new javax.swing.JTable();
        jScrollPane4 = new javax.swing.JScrollPane();
        TABLAT = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        FileChooser = new javax.swing.JFileChooser();
        panelImage1 = new org.edisoncor.gui.panel.PanelImage();
        jPanel1 = new javax.swing.JPanel();
        tmn = new javax.swing.JTextField();
        tm = new javax.swing.JTextField();
        id = new javax.swing.JFormattedTextField();
        tml = new javax.swing.JFormattedTextField();
        tmnl = new javax.swing.JFormattedTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        obser = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();
        fechaini = new javax.swing.JFormattedTextField();
        fechafin = new javax.swing.JFormattedTextField();
        nor = new javax.swing.JFormattedTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        tpt = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        tmp = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        hummax = new javax.swing.JTextField();
        hummin = new javax.swing.JTextField();
        hump = new javax.swing.JTextField();
        huml = new javax.swing.JFormattedTextField();
        humlm = new javax.swing.JFormattedTextField();
        valid = new javax.swing.JButton();
        Insertar = new javax.swing.JButton();
        re = new javax.swing.JTextField();
        never = new javax.swing.JTabbedPane();
        datalo = new javax.swing.JPanel();
        datalo2 = new javax.swing.JPanel();
        gn = new javax.swing.JPanel();
        tmd = new javax.swing.JFormattedTextField();
        tmnd = new javax.swing.JFormattedTextField();
        tpd = new javax.swing.JFormattedTextField();
        fecha = new javax.swing.JTextField();
        r2 = new javax.swing.JLabel();
        fecha1 = new com.toedter.calendar.JDateChooser();
        fecha2 = new com.toedter.calendar.JDateChooser();
        jButton1 = new javax.swing.JButton();
        ggrafica = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox<>();
        insertarg = new javax.swing.JButton();
        report = new javax.swing.JButton();

        tabladouble.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "tempmax", "tempmin", "tempp"
            }
        ));
        jScrollPane1.setViewportView(tabladouble);

        tablaenteros.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "id", "templm", "templmn", "dia", "año", "hora", "min", "seg"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tablaenteros);

        TABLAT.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "id", "tempm", "tempmn", "tempp", "templm", "templmn", "hummax", "hummin", "hump", "huml", "hulmn", "finicio", "ffin", "obser", "Tipotoma"
            }
        ));
        jScrollPane4.setViewportView(TABLAT);
        if (TABLAT.getColumnModel().getColumnCount() > 0) {
            TABLAT.getColumnModel().getColumn(0).setResizable(false);
            TABLAT.getColumnModel().getColumn(1).setResizable(false);
            TABLAT.getColumnModel().getColumn(2).setResizable(false);
            TABLAT.getColumnModel().getColumn(3).setResizable(false);
            TABLAT.getColumnModel().getColumn(4).setResizable(false);
            TABLAT.getColumnModel().getColumn(5).setResizable(false);
            TABLAT.getColumnModel().getColumn(6).setResizable(false);
            TABLAT.getColumnModel().getColumn(7).setResizable(false);
            TABLAT.getColumnModel().getColumn(8).setResizable(false);
            TABLAT.getColumnModel().getColumn(9).setResizable(false);
            TABLAT.getColumnModel().getColumn(10).setResizable(false);
            TABLAT.getColumnModel().getColumn(11).setResizable(false);
            TABLAT.getColumnModel().getColumn(12).setResizable(false);
            TABLAT.getColumnModel().getColumn(13).setResizable(false);
            TABLAT.getColumnModel().getColumn(14).setResizable(false);
        }

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        FileChooser.setApproveButtonText("Guardar");

        setClosable(true);
        setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);
        setIconifiable(true);
        setTitle("VALIDACIÓN");
        addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosed(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosing(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeactivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeiconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameIconified(javax.swing.event.InternalFrameEvent evt) {
                formInternalFrameIconified(evt);
            }
            public void internalFrameOpened(javax.swing.event.InternalFrameEvent evt) {
            }
        });

        panelImage1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/reg.jpg"))); // NOI18N

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "FORMULARIO", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Cambria", 1, 18), new java.awt.Color(102, 102, 102))); // NOI18N
        jPanel1.setOpaque(false);

        tmn.setText("ingrese temperatura mínima");
        tmn.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tmnFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                tmnFocusLost(evt);
            }
        });
        tmn.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tmnKeyTyped(evt);
            }
        });

        tm.setText("Ingrese temperatura máxima");
        tm.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tmFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                tmFocusLost(evt);
            }
        });
        tm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tmActionPerformed(evt);
            }
        });
        tm.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tmKeyTyped(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 102, 102));
        jLabel1.setText("Temperatura máxima °C");

        jLabel2.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 102, 102));
        jLabel2.setText("Temperatura mínima °C");

        obser.setColumns(20);
        obser.setLineWrap(true);
        obser.setRows(5);
        jScrollPane3.setViewportView(obser);

        jLabel3.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 102, 102));
        jLabel3.setText("Observación");

        fechaini.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        fechaini.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                fechainiKeyTyped(evt);
            }
        });

        fechafin.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                fechafinKeyTyped(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(102, 102, 102));
        jLabel5.setText("Fecha inicio");

        jLabel6.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(102, 102, 102));
        jLabel6.setText("Fecha fin");

        tpt.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione el tipo de unidad", "Nevera", "Dataloyed" }));
        tpt.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                tptItemStateChanged(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(102, 102, 102));
        jLabel7.setText("Tipo de Toma");

        jLabel8.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(102, 102, 102));
        jLabel8.setText("Temperaturta promedio °C");

        tmp.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tmpKeyTyped(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(102, 102, 102));
        jLabel4.setText("Humedad máxima");

        jLabel9.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(102, 102, 102));
        jLabel9.setText("Humedad mínima");

        jLabel10.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(102, 102, 102));
        jLabel10.setText("Humedad promedio");

        hummax.setText("Ingrese humedad máxima");
        hummax.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                hummaxFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                hummaxFocusLost(evt);
            }
        });
        hummax.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                hummaxKeyTyped(evt);
            }
        });

        hummin.setText("Ingrese humedad mínima");
        hummin.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                humminFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                humminFocusLost(evt);
            }
        });
        hummin.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                humminKeyTyped(evt);
            }
        });

        hump.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                humpKeyTyped(evt);
            }
        });

        valid.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/aceptar-verde-ok-si-icono-8925-32.png"))); // NOI18N
        valid.setToolTipText("VALIDAR");
        valid.setContentAreaFilled(false);
        valid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                validActionPerformed(evt);
            }
        });

        Insertar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/anadir-la-linea-grafica-icono-4590-32.png"))); // NOI18N
        Insertar.setToolTipText("INSERTAR");
        Insertar.setContentAreaFilled(false);
        Insertar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InsertarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8)
                            .addComponent(jLabel4)
                            .addComponent(jLabel9)
                            .addComponent(jLabel10))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(fechaini, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(fechafin, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tpt, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(177, 177, 177))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tmn, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tmp, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(hump, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(hummin, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(hummax, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tm, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(30, 30, 30)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Insertar)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(valid)
                                            .addComponent(nor, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(tml, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(humlm, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(tmnl, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(huml, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(id, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(78, 78, 78)
                        .addComponent(Insertar))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tm, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1)
                            .addComponent(nor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tml, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(humlm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(valid)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(tmn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel2))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabel8)
                                            .addComponent(tmp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(tmnl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(huml, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(hummax, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addComponent(hummin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(hump, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(fechaini, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(fechafin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(tpt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tmn.getAccessibleContext().setAccessibleName("");
        tm.getAccessibleContext().setAccessibleName("");
        fechaini.getAccessibleContext().setAccessibleName("");
        fechafin.getAccessibleContext().setAccessibleName("");
        tmp.getAccessibleContext().setAccessibleName("");
        hummax.getAccessibleContext().setAccessibleName("");
        hummin.getAccessibleContext().setAccessibleName("");
        hump.getAccessibleContext().setAccessibleName("");

        never.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Gráficas", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Cambria", 1, 18), new java.awt.Color(102, 102, 102))); // NOI18N
        never.setForeground(new java.awt.Color(102, 102, 102));
        never.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N

        datalo.setOpaque(false);

        javax.swing.GroupLayout dataloLayout = new javax.swing.GroupLayout(datalo);
        datalo.setLayout(dataloLayout);
        dataloLayout.setHorizontalGroup(
            dataloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 650, Short.MAX_VALUE)
        );
        dataloLayout.setVerticalGroup(
            dataloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 425, Short.MAX_VALUE)
        );

        never.addTab("Dataloyed Temperatura", datalo);

        datalo2.setOpaque(false);

        javax.swing.GroupLayout datalo2Layout = new javax.swing.GroupLayout(datalo2);
        datalo2.setLayout(datalo2Layout);
        datalo2Layout.setHorizontalGroup(
            datalo2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 650, Short.MAX_VALUE)
        );
        datalo2Layout.setVerticalGroup(
            datalo2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 425, Short.MAX_VALUE)
        );

        never.addTab("Dataloyed Humedad", datalo2);

        gn.setOpaque(false);

        javax.swing.GroupLayout gnLayout = new javax.swing.GroupLayout(gn);
        gn.setLayout(gnLayout);
        gnLayout.setHorizontalGroup(
            gnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 650, Short.MAX_VALUE)
        );
        gnLayout.setVerticalGroup(
            gnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 425, Short.MAX_VALUE)
        );

        never.addTab("Nevera", gn);

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/anadir-la-linea-grafica-icono-4590-32.png"))); // NOI18N
        jButton1.setToolTipText("Graficar");
        jButton1.setContentAreaFilled(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        ggrafica.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/vigilar-el-cambio-icono-8152-32.png"))); // NOI18N
        ggrafica.setToolTipText("Guardar en sistema");
        ggrafica.setContentAreaFilled(false);
        ggrafica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ggraficaActionPerformed(evt);
            }
        });

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione", "Nevera", "Dataloyed" }));
        jComboBox1.setToolTipText("");
        jComboBox1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBox1ItemStateChanged(evt);
            }
        });

        insertarg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/actualizar-la-base-de-datos-icono-7326-32.png"))); // NOI18N
        insertarg.setToolTipText("Guardar en base de datos");
        insertarg.setContentAreaFilled(false);
        insertarg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                insertargActionPerformed(evt);
            }
        });

        report.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/portapapeles-icono-9080-32.png"))); // NOI18N
        report.setToolTipText("Generar Reporte");
        report.setContentAreaFilled(false);
        report.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reportActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelImage1Layout = new javax.swing.GroupLayout(panelImage1);
        panelImage1.setLayout(panelImage1Layout);
        panelImage1Layout.setHorizontalGroup(
            panelImage1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelImage1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelImage1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelImage1Layout.createSequentialGroup()
                        .addGroup(panelImage1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tmd, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tmnd, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panelImage1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelImage1Layout.createSequentialGroup()
                                .addComponent(fecha, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(r2, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panelImage1Layout.createSequentialGroup()
                                .addComponent(tpd, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(re, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 484, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelImage1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelImage1Layout.createSequentialGroup()
                        .addComponent(fecha1, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(fecha2, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ggrafica)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(insertarg, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(report)
                        .addGap(18, 18, 18)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(never, javax.swing.GroupLayout.PREFERRED_SIZE, 667, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        panelImage1Layout.setVerticalGroup(
            panelImage1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelImage1Layout.createSequentialGroup()
                .addGroup(panelImage1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelImage1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(panelImage1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton1)
                            .addComponent(ggrafica)
                            .addComponent(insertarg)
                            .addComponent(report)
                            .addGroup(panelImage1Layout.createSequentialGroup()
                                .addGap(9, 9, 9)
                                .addGroup(panelImage1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(panelImage1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(fecha1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(fecha2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(never, javax.swing.GroupLayout.PREFERRED_SIZE, 493, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelImage1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panelImage1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelImage1Layout.createSequentialGroup()
                                .addComponent(fecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(panelImage1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(tpd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(re, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tmnd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(panelImage1Layout.createSequentialGroup()
                                .addComponent(tmd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(30, 30, 30)
                                .addComponent(r2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(37, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelImage1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelImage1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tmnFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tmnFocusGained
        // TODO add your handling code here:
        if (tmn.getText().equals("ingrese temperatura mínima")) {
            tmn.setText("");
        }
    }//GEN-LAST:event_tmnFocusGained

    private void tmnFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tmnFocusLost
        // TODO add your handling code here:
        if (tmn.getText().equals("")) {
            tmn.setText("ingrese temperatura mínima");
        }
    }//GEN-LAST:event_tmnFocusLost

    private void tmFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tmFocusGained
        // TODO add your handling code here:
        if (tm.getText().equals("Ingrese temperatura máxima")) {
            tm.setText("");
        }
    }//GEN-LAST:event_tmFocusGained

    private void tmFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tmFocusLost
        // TODO add your handling code here:
        if (tm.getText().equals("")) {
            tm.setText("Ingrese temperatura máxima");
        }
    }//GEN-LAST:event_tmFocusLost

    private void InsertarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InsertarActionPerformed
        // TODO add your handling code here:

        if (tpt.getSelectedItem().equals("Nevera")) {

            funciones();
            controlar.controladoraccion("Insertar", obtenertemp());

        } else if (tpt.getSelectedItem().equals("Dataloyed")) {

            funciones2();
            controlar.controladoraccion("Insertar", obtenertemp2());

        }
        try {
            limpiarformulario();
        } catch (ParseException ex) {
            Logger.getLogger(validacioncon.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_InsertarActionPerformed


    private void validActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_validActionPerformed

        String txt1 = fechaini.getText();
        String txt2 = fechafin.getText();

        if (tpt.getSelectedItem().equals("Nevera")) {

            if (tm.getText().equals("Ingrese temperatura máxima") || tmn.getText().equals("ingrese temperatura mínima")) {
                JOptionPane.showMessageDialog(rootPane, "Debe ingresar las temperaturas");
            } else if (Double.parseDouble(tm.getText()) > 4 || Double.parseDouble(tmn.getText()) < 2) {
                obser.setEnabled(true);
                Insertar.setEnabled(true);
            } else if (Double.parseDouble(tm.getText()) <= 4 || Double.parseDouble(tmn.getText()) >= 2) {
                obser.setEnabled(false);
                Insertar.setEnabled(true);
            } else if (Double.parseDouble(tm.getText()) > 4 && Double.parseDouble(tmn.getText()) < 2) {
                obser.setEnabled(true);
                Insertar.setEnabled(true);
            } else if (Double.parseDouble(tm.getText()) <= 4 && Double.parseDouble(tmn.getText()) >= 2) {
                obser.setEnabled(false);
                Insertar.setEnabled(true);
            }

        } else if (tpt.getSelectedItem().equals("Dataloyed")) {

            if (txt1.length() != 17 || txt2.length() != 17 || txt1.charAt(2) != '/' || txt1.charAt(5) != '/' || txt1.charAt(11) != ':' || txt1.charAt(14) != ':'
                    || txt2.charAt(2) != '/' || txt2.charAt(5) != '/' || txt2.charAt(11) != ':' || txt2.charAt(14) != ':') {
                JOptionPane.showMessageDialog(rootPane, "Debe ingresar correctamente el formato de las fechas");
            } else if (tm.getText().isEmpty() || tmn.getText().isEmpty() || tm.getText().equals("Ingrese temperatura máxima") || tmn.getText().equals("ingrese temperatura mínima")
                    || fechaini.getText().isEmpty() || fechafin.getText().isEmpty() || hummin.getText().isEmpty() || hummax.getText().isEmpty() || hummin.getText().equals("Ingrese humedad mínima")
                    || hummax.getText().equals("Ingrese humedad máxima")) {
                JOptionPane.showMessageDialog(rootPane, "Debe ingresar las temperaturas y la fechas ");
            } else if (Double.parseDouble(tm.getText()) > 30 || Double.parseDouble(tmn.getText()) < 15 || Double.parseDouble(hummax.getText()) > 80 || Double.parseDouble(hummin.getText()) < 30) {
                obser.setEnabled(true);
                Insertar.setEnabled(true);
            } else if (Double.parseDouble(tm.getText()) <= 30 || Double.parseDouble(tmn.getText()) >= 15 || Double.parseDouble(hummax.getText()) <= 80 || Double.parseDouble(hummin.getText()) >= 30) {
                obser.setEnabled(false);
                Insertar.setEnabled(true);
            } else if (Double.parseDouble(tm.getText()) > 30 && Double.parseDouble(tmn.getText()) < 15 && Double.parseDouble(hummax.getText()) > 80 && Double.parseDouble(hummin.getText()) < 30) {
                obser.setEnabled(true);
                Insertar.setEnabled(true);
            } else if (Double.parseDouble(tm.getText()) <= 30 && Double.parseDouble(tmn.getText()) >= 15 && Double.parseDouble(hummax.getText()) <= 80 && Double.parseDouble(hummin.getText()) >= 30) {
                obser.setEnabled(false);
                Insertar.setEnabled(true);
            }

        }


    }//GEN-LAST:event_validActionPerformed

    private void tmnKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tmnKeyTyped
        // TODO add your handling code here:           int k=(int)evt.getKeyChar();
        int k = (int) evt.getKeyChar();
        if (k >= 58 || k >= 33 && k <= 45) {
            evt.setKeyChar((char) KeyEvent.VK_CLEAR);
            JOptionPane.showMessageDialog(null, "Este campo solo permite valores numéricos enteros o decimales, No debe ingresar letras!!!", "Datos incompatibles", JOptionPane.ERROR_MESSAGE);
            tmn.setText("");
        }
        if (k == 10) {
            tmn.transferFocus();
        }
    }//GEN-LAST:event_tmnKeyTyped

    private void tptItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_tptItemStateChanged
        // TODO add your handling code here:
        if (tpt.getSelectedItem().equals("Nevera")) {
            tm.setEnabled(true);
            tmn.setEnabled(true);
            fechaini.setEnabled(false);
            fechafin.setEnabled(false);
            tmp.setEnabled(false);
            hummax.setEnabled(false);
            hummin.setEnabled(false);
            hump.setEnabled(false);
            valid.setEnabled(true);
            tml.setValue(4);
            tmnl.setValue(2);
        } else if (tpt.getSelectedItem().equals("Dataloyed")) {
            tm.setEnabled(true);
            tmn.setEnabled(true);
            fechaini.setEnabled(true);
            fechafin.setEnabled(true);
            tmp.setEnabled(true);
            hummax.setEnabled(true);
            hummin.setEnabled(true);
            hump.setEnabled(true);
            valid.setEnabled(true);
            tml.setValue(30);
            tmnl.setValue(15);
            huml.setValue(80);
            humlm.setValue(30);
        } else if (tpt.getSelectedItem().equals("Seleccione el tipo de unidad")) {
            tm.setEnabled(false);
            tmn.setEnabled(false);
            fechaini.setEnabled(false);
            fechafin.setEnabled(false);
            tmp.setEnabled(false);
            hummax.setEnabled(false);
            hummin.setEnabled(false);
            hump.setEnabled(false);
            valid.setEnabled(false);
            tml.setValue(0);
            tmnl.setValue(0);
        }

    }//GEN-LAST:event_tptItemStateChanged

    private void hummaxFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_hummaxFocusGained
        // TODO add your handling code here:
        if (hummax.getText().equals("Ingrese humedad máxima")) {
            hummax.setText("");
        }
    }//GEN-LAST:event_hummaxFocusGained

    private void hummaxFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_hummaxFocusLost
        // TODO add your handling code here:}
        if (hummax.getText().equals("")) {
            hummax.setText("Ingrese humedad máxima");
        }
    }//GEN-LAST:event_hummaxFocusLost

    private void humminFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_humminFocusGained
        // TODO add your handling code here:
        if (hummin.getText().equals("Ingrese humedad mínima")) {
            hummin.setText("");
        }
    }//GEN-LAST:event_humminFocusGained

    private void humminFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_humminFocusLost
        // TODO add your handling code here:
        if (hummin.getText().equals("")) {
            hummin.setText("Ingrese humedad mínima");
        }
    }//GEN-LAST:event_humminFocusLost

    private void hummaxKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_hummaxKeyTyped
        // TODO add your handling code here:
        int k = (int) evt.getKeyChar();
        if (k >= 58 || k >= 33 && k <= 45) {
            evt.setKeyChar((char) KeyEvent.VK_CLEAR);
            JOptionPane.showMessageDialog(null, "Este campo solo permite valores numéricos enteros o decimales, No debe ingresar letras !!!", "Datos incompatibles", JOptionPane.ERROR_MESSAGE);
            hummax.setText("");
        }
        if (k == 10) {
            hummax.transferFocus();
        }
    }//GEN-LAST:event_hummaxKeyTyped

    private void humminKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_humminKeyTyped
        // TODO add your handling code here:
        int k = (int) evt.getKeyChar();
        if (k >= 58 || k >= 33 && k <= 45) {
            evt.setKeyChar((char) KeyEvent.VK_CLEAR);
            JOptionPane.showMessageDialog(null, "Este campo solo permite valores numéricos enteros o decimales, No debe ingresar letras!!!", "Datos incompatibles", JOptionPane.ERROR_MESSAGE);
            hummin.setText("");
        }
        if (k == 10) {
            hummin.transferFocus();
        }
    }//GEN-LAST:event_humminKeyTyped

    private void humpKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_humpKeyTyped
        // TODO add your handling code here:
        int k = (int) evt.getKeyChar();
        if (k >= 58 || k >= 33 && k <= 45) {
            evt.setKeyChar((char) KeyEvent.VK_CLEAR);
            JOptionPane.showMessageDialog(null, "Este campo solo permite valores numéricos enteros o decimales, No debe ingresar letras!!!", "Datos incompatibles", JOptionPane.ERROR_MESSAGE);
            hump.setText("");
        }
        if (k == 10) {
            hump.transferFocus();
        }
    }//GEN-LAST:event_humpKeyTyped

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        try {

            if (fecha1.getDate() == null || fecha2.getDate() == null) {
                JOptionPane.showMessageDialog(rootPane, "Debe ingresar las fechas para graficar");
            } else {
                llenargrafica();
                limpiarformulario();
            }

        } catch (ParseException ex) {
            Logger.getLogger(validacioncon.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_jButton1ActionPerformed

    private void fechainiKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_fechainiKeyTyped
        // TODO add your handling code here:
        int k = (int) evt.getKeyChar();

        if (k >= 59 || k >= 33 && k <= 46) {
            evt.setKeyChar((char) KeyEvent.VK_CLEAR);
            JOptionPane.showMessageDialog(null, "Este campo solo permite valores con formato de fecha, No debe ingresar valores erroneos!!!", "Datos incompatibles", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_fechainiKeyTyped

    private void tmpKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tmpKeyTyped
        // TODO add your handling code here:
        int k = (int) evt.getKeyChar();

        if (k >= 58 || k >= 33 && k <= 45) {
            evt.setKeyChar((char) KeyEvent.VK_CLEAR);
            JOptionPane.showMessageDialog(null, "Este campo solo permite valores numéricos enteros o decimales, No debe ingresar letras!!!", "Datos incompatibles", JOptionPane.ERROR_MESSAGE);
            hummax.setText("");
        }
        if (k == 10) {
            hummax.transferFocus();
        }
    }//GEN-LAST:event_tmpKeyTyped

    private void tmKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tmKeyTyped
        // TODO add your handling code here:
        int k = (int) evt.getKeyChar();
        if (k >= 58 || k >= 33 && k <= 45) {
            evt.setKeyChar((char) KeyEvent.VK_CLEAR);
            JOptionPane.showMessageDialog(null, "Este campo solo permite valores numéricos enteros o decimales, No debe ingresar letras!!!", "Datos incompatibles", JOptionPane.ERROR_MESSAGE);
            tm.setText("");
        }
        if (k == 10) {
            tm.transferFocus();
        }
    }//GEN-LAST:event_tmKeyTyped

    private void fechafinKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_fechafinKeyTyped
        // TODO add your handling code here:
        int k = (int) evt.getKeyChar();

        if (k >= 59 || k >= 33 && k <= 46) {
            evt.setKeyChar((char) KeyEvent.VK_CLEAR);
            JOptionPane.showMessageDialog(null, "Este campo solo permite valores con formato de fecha, No debe ingresar valores erroneos!!!", "Datos incompatibles", JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_fechafinKeyTyped

    private void ggraficaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ggraficaActionPerformed

        if (jComboBox1.getSelectedItem().equals("Nevera")) {
            guardarimagen();
        } else if (jComboBox1.getSelectedItem().equals("Dataloyed")) {
            guardarimagendoble();
        }

    }//GEN-LAST:event_ggraficaActionPerformed

    private void insertargActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_insertargActionPerformed
        // TODO add your handling code here:

        if (jComboBox1.getSelectedItem().equals("Nevera")) {
            JFileChooser j = new JFileChooser();
            j.setFileSelectionMode(JFileChooser.FILES_ONLY);
            int estado = j.showOpenDialog(null);
            if (estado == JFileChooser.APPROVE_OPTION) {
                try {
                    entrada = new FileInputStream(j.getSelectedFile());
                    longitudBytes = (int) j.getSelectedFile().length();
                } catch (FileNotFoundException ex) {
                }
            }
        } else if (jComboBox1.getSelectedItem().equals("Dataloyed")) {
            JFileChooser j = new JFileChooser();
            j.setFileSelectionMode(JFileChooser.FILES_ONLY);
            int estado = j.showOpenDialog(null);
            JFileChooser j2 = new JFileChooser();
            j2.setFileSelectionMode(JFileChooser.FILES_ONLY);
            int estado2 = j2.showOpenDialog(null);
            if (estado == JFileChooser.APPROVE_OPTION && estado2 == JFileChooser.APPROVE_OPTION) {
                try {
                    entrada = new FileInputStream(j.getSelectedFile());
                    longitudBytes = (int) j.getSelectedFile().length();
                    entrada2 = new FileInputStream(j2.getSelectedFile());
                    longitudbytes2 = (int) j2.getSelectedFile().length();
                } catch (FileNotFoundException ex) {
                }
            }
        }

        if (fecha1.getDate() == null || fecha2.getDate() == null) {
            JOptionPane.showMessageDialog(rootPane, "Debe ingresar las fechas para graficar");
        } else if (jComboBox1.getSelectedItem().equals("Nevera")) {
            controlar2.controladoraccion("Insertar", obtenergrafica());
        } else if (jComboBox1.getSelectedItem().equals("Dataloyed")) {
            controlar2.controladoraccion("Insertar", obtenergrafica2());
        } else if (jComboBox1.equals("Seleccione")) {
            JOptionPane.showMessageDialog(rootPane, "debe seleccionar un tipo de toma");
        }

    }//GEN-LAST:event_insertargActionPerformed

    private void jComboBox1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBox1ItemStateChanged
        // TODO add your handling code here:
        if (jComboBox1.getSelectedItem().equals("Seleccione")) {
            ggrafica.setEnabled(false);
            insertarg.setEnabled(false);
            report.setEnabled(false);

        } else {
            ggrafica.setEnabled(true);
            insertarg.setEnabled(true);
            report.setEnabled(true);
        }
    }//GEN-LAST:event_jComboBox1ItemStateChanged

    private void reportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reportActionPerformed
        // TODO add your handling code here:

        JasperReport jrReporte = null;
        try {
            if (fecha1.getDate() == null) {
                JOptionPane.showMessageDialog(rootPane, "Seleccione una fecha inicial");
            } else {
                Date ft = null;
                java.util.Date utildate = fecha1.getDate();
                java.sql.Date sqldate = new java.sql.Date(utildate.getTime());
                graficas g = new graficas();
                Iterator<graficas> itequi = g.buscar(sqldate, (String) jComboBox1.getSelectedItem());
                while (itequi.hasNext()) {
                    g = itequi.next();
                    ft = g.getFechaterm();
                }
                if (jComboBox1.getSelectedItem().equals("Nevera")) {
                    jrReporte = (JasperReport) JRLoader.loadObject(getClass().getClassLoader().getResource("reportes/reporteambiental.jasper"));
                    Map params = new HashMap();
                    params.put("parameter1", fecha1.getDate());
                    params.put("parameter2", ft);
                    params.put("toma", jComboBox1.getSelectedItem());
                    params.put("rutasub", System.getProperty("user.dir"));
                    JasperPrint jpReporte = JasperFillManager.fillReport(jrReporte, params, conexion.connection);
                    JasperViewer jReporteViewer = new JasperViewer(jpReporte, false);
                    jReporteViewer.setVisible(true);
                } else if (jComboBox1.getSelectedItem().equals("Dataloyed")) {
                    jrReporte = (JasperReport) JRLoader.loadObject(getClass().getClassLoader().getResource("reportes/reporteambiental2.jasper"));
                    Map params = new HashMap();
                    params.put("parameter1", fecha1.getDate());
                    params.put("parameter2", ft);
                    params.put("toma", jComboBox1.getSelectedItem());
                    params.put("rutasub", System.getProperty("user.dir"));
                    JasperPrint jpReporte = JasperFillManager.fillReport(jrReporte, params, conexion.connection);
                    JasperViewer jReporteViewer = new JasperViewer(jpReporte, false);
                    jReporteViewer.setVisible(true);
                } else if (jComboBox1.getSelectedItem().equals("seleccione")) {
                    JOptionPane.showMessageDialog(rootPane, "Debe sleccionar un tipo");
                }
            }

        } catch (JRException e) {
            System.err.println("Hubo un problema con el jasper " + e);
        }


    }//GEN-LAST:event_reportActionPerformed

    private void formInternalFrameIconified(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameIconified
        this.toFront();
    }//GEN-LAST:event_formInternalFrameIconified

    private void tmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tmActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tmActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JFileChooser FileChooser;
    private javax.swing.JButton Insertar;
    private javax.swing.JTable TABLAT;
    private javax.swing.JPanel datalo;
    private javax.swing.JPanel datalo2;
    private javax.swing.JTextField fecha;
    private com.toedter.calendar.JDateChooser fecha1;
    private com.toedter.calendar.JDateChooser fecha2;
    private javax.swing.JFormattedTextField fechafin;
    private javax.swing.JFormattedTextField fechaini;
    private javax.swing.JButton ggrafica;
    private javax.swing.JPanel gn;
    private javax.swing.JFormattedTextField huml;
    private javax.swing.JFormattedTextField humlm;
    private javax.swing.JTextField hummax;
    private javax.swing.JTextField hummin;
    private javax.swing.JTextField hump;
    private javax.swing.JFormattedTextField id;
    private javax.swing.JButton insertarg;
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTabbedPane never;
    private javax.swing.JFormattedTextField nor;
    private javax.swing.JTextArea obser;
    private org.edisoncor.gui.panel.PanelImage panelImage1;
    private javax.swing.JLabel r2;
    private javax.swing.JTextField re;
    private javax.swing.JButton report;
    private javax.swing.JTable tabladouble;
    private javax.swing.JTable tablaenteros;
    private javax.swing.JTextField tm;
    private javax.swing.JFormattedTextField tmd;
    private javax.swing.JFormattedTextField tml;
    private javax.swing.JTextField tmn;
    private javax.swing.JFormattedTextField tmnd;
    private javax.swing.JFormattedTextField tmnl;
    private javax.swing.JTextField tmp;
    private javax.swing.JFormattedTextField tpd;
    private javax.swing.JComboBox<String> tpt;
    private javax.swing.JButton valid;
    // End of variables declaration//GEN-END:variables

    private graficas obtenergrafica() {

        java.util.Date utildate = fecha1.getDate();
        java.sql.Date sqldate = new java.sql.Date(utildate.getTime());
        java.util.Date utildate2 = fecha2.getDate();
        java.sql.Date sqldate2 = new java.sql.Date(utildate2.getTime());

        graficas lasgraficas = new graficas();

        lasgraficas.setFechacre(sqldate);
        lasgraficas.setFechaterm(sqldate2);
        lasgraficas.setGrafic(entrada);
        lasgraficas.setTamaño(longitudBytes);
        lasgraficas.setTpt((String) jComboBox1.getSelectedItem());
        return lasgraficas;

    }

    private graficas obtenergrafica2() {

        java.util.Date utildate = fecha1.getDate();
        java.sql.Date sqldate = new java.sql.Date(utildate.getTime());
        java.util.Date utildate2 = fecha2.getDate();
        java.sql.Date sqldate2 = new java.sql.Date(utildate2.getTime());

        graficas lasgraficas = new graficas();

        lasgraficas.setFechacre(sqldate);
        lasgraficas.setFechaterm(sqldate2);
        lasgraficas.setGrafic(entrada);
        lasgraficas.setTamaño(longitudBytes);
        lasgraficas.setGrafic2(entrada2);
        lasgraficas.setTamaño2(longitudbytes2);
        lasgraficas.setTpt((String) jComboBox1.getSelectedItem());
        return lasgraficas;

    }
}
