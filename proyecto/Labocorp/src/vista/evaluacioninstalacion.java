/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this instalacioneslate file, choose Tools | Templates
 * and open the instalacioneslate in the editor.
 */
package vista;

import controlador.controladorinstalacion;
import java.sql.Time;
import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.instalaciones;

/**
 *
 * @author GLOBAL
 */
public class evaluacioninstalacion extends javax.swing.JInternalFrame {

    DefaultListModel model = new DefaultListModel();
    DefaultTableModel modelo = new DefaultTableModel();
    controladorinstalacion controlar = new controladorinstalacion();
    listainspeccion listaR;

    SimpleDateFormat formato = new SimpleDateFormat("MM/dd/yy HH:mm:ss");
    SimpleDateFormat formato2 = new SimpleDateFormat("HH:mm:ss");
    SimpleDateFormat formato3 = new SimpleDateFormat("MM/dd/yy");
    Timestamp ts;
    String text;
    int np = 35;

    /**
     * Creates new form evaluacioninstalacion
     */
    public evaluacioninstalacion() {
        initComponents();
        limpiarformulario();
        listaR = new listainspeccion();
        menu.escritorio.add(listaR);

    }

    private instalaciones obtnerresultado() {

        Date f = new Date();
        String c = formato.format(f);
        String c2 = formato2.format(f);
        Date f2 = null;
        Time f3 = null;
        try {
            f2 = formato3.parse(c);
            f3 = Time.valueOf(c2);

        } catch (ParseException ex) {
            Logger.getLogger(evaluacioninstalacion.class.getName()).log(Level.SEVERE, null, ex);
        }
        java.util.Date utildate = f2;
        java.sql.Date sqldate = new java.sql.Date(utildate.getTime());

        instalaciones unasinstalaciones = new instalaciones();
        unasinstalaciones.setArea(area.getText());
        unasinstalaciones.setFecharevision(sqldate);
        unasinstalaciones.setHoraderevision(f3);
        unasinstalaciones.setIdentificacion(identifi.getText());
        unasinstalaciones.setObservacion(obser.getText());
        unasinstalaciones.setResultadoinspec(ri.getText());
        return unasinstalaciones;
    }

    private void limpiarformulario() {
        String rols = menu.getRol();
        if (rols.equals("Director técnico")) {
            eveluar.setEnabled(false);
            Guardar.setEnabled(false);
        } else if (rols.equals("Líder de calidad")) {
            eveluar.setEnabled(false);
            Guardar.setEnabled(false);
        } else if (rols.equals("Analista")) {
            valid.setEnabled(true);
            Guardar.setEnabled(false);
        } else if (rols.equals("Técnico")) {
            valid.setEnabled(true);
            Guardar.setEnabled(false);
        } else {
            eveluar.setEnabled(false);
            Guardar.setEnabled(false);
        }
        panel1.setVisible(false);
        panelLocal.setVisible(false);
        panelResiduos.setVisible(false);
        panelEquiposProteccion.setVisible(false);
        panelMaterial.setVisible(false);
        panelAlmacenaje.setVisible(false);
        panelPiso.setVisible(false);
        panelEquipos.setVisible(false);
        cs.setVisible(false);
        cn.setVisible(false);
        ri.setVisible(false);
        identifi.setText(menu.getIdent());
        identifi.setVisible(false);
        idinsp.setValue(0);
        idinsp.setVisible(false);
        area.setText("Escriba el área");
        obser.setText("Escriba la observacion");
        buttonGroup1.clearSelection();
        buttonGroup2.clearSelection();
        buttonGroup10.clearSelection();
        buttonGroup11.clearSelection();
        buttonGroup12.clearSelection();
        buttonGroup13.clearSelection();
        buttonGroup14.clearSelection();
        buttonGroup15.clearSelection();
        buttonGroup16.clearSelection();
        buttonGroup17.clearSelection();
        buttonGroup18.clearSelection();
        buttonGroup19.clearSelection();
        buttonGroup20.clearSelection();
        buttonGroup21.clearSelection();
        buttonGroup22.clearSelection();
        buttonGroup23.clearSelection();
        buttonGroup24.clearSelection();
        buttonGroup25.clearSelection();
        buttonGroup26.clearSelection();
        buttonGroup27.clearSelection();
        buttonGroup28.clearSelection();
        buttonGroup29.clearSelection();
        buttonGroup30.clearSelection();
        buttonGroup31.clearSelection();
        buttonGroup32.clearSelection();
        buttonGroup33.clearSelection();
        buttonGroup34.clearSelection();
        buttonGroup35.clearSelection();
        buttonGroup36.clearSelection();
        buttonGroup37.clearSelection();
        buttonGroup38.clearSelection();
        buttonGroup39.clearSelection();
        buttonGroup40.clearSelection();
        buttonGroup41.clearSelection();
        buttonGroup42.clearSelection();
        buttonGroup43.clearSelection();
        buttonGroup44.clearSelection();
        buttonGroup45.clearSelection();
        buttonGroup46.clearSelection();
        buttonGroup47.clearSelection();
        buttonGroup4.clearSelection();
        buttonGroup3.clearSelection();
        buttonGroup5.clearSelection();
        buttonGroup6.clearSelection();
        buttonGroup7.clearSelection();
        buttonGroup8.clearSelection();
        buttonGroup9.clearSelection();
        model.clear();
        lista.setModel(model);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        buttonGroup4 = new javax.swing.ButtonGroup();
        buttonGroup5 = new javax.swing.ButtonGroup();
        buttonGroup6 = new javax.swing.ButtonGroup();
        buttonGroup7 = new javax.swing.ButtonGroup();
        buttonGroup8 = new javax.swing.ButtonGroup();
        tablaresul = new javax.swing.JInternalFrame();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        buttonGroup9 = new javax.swing.ButtonGroup();
        buttonGroup10 = new javax.swing.ButtonGroup();
        buttonGroup11 = new javax.swing.ButtonGroup();
        buttonGroup12 = new javax.swing.ButtonGroup();
        buttonGroup13 = new javax.swing.ButtonGroup();
        buttonGroup14 = new javax.swing.ButtonGroup();
        buttonGroup15 = new javax.swing.ButtonGroup();
        buttonGroup16 = new javax.swing.ButtonGroup();
        buttonGroup17 = new javax.swing.ButtonGroup();
        buttonGroup18 = new javax.swing.ButtonGroup();
        buttonGroup19 = new javax.swing.ButtonGroup();
        buttonGroup20 = new javax.swing.ButtonGroup();
        buttonGroup21 = new javax.swing.ButtonGroup();
        buttonGroup22 = new javax.swing.ButtonGroup();
        buttonGroup23 = new javax.swing.ButtonGroup();
        buttonGroup24 = new javax.swing.ButtonGroup();
        buttonGroup25 = new javax.swing.ButtonGroup();
        buttonGroup26 = new javax.swing.ButtonGroup();
        buttonGroup27 = new javax.swing.ButtonGroup();
        buttonGroup28 = new javax.swing.ButtonGroup();
        buttonGroup29 = new javax.swing.ButtonGroup();
        buttonGroup30 = new javax.swing.ButtonGroup();
        buttonGroup31 = new javax.swing.ButtonGroup();
        buttonGroup32 = new javax.swing.ButtonGroup();
        buttonGroup33 = new javax.swing.ButtonGroup();
        buttonGroup34 = new javax.swing.ButtonGroup();
        buttonGroup35 = new javax.swing.ButtonGroup();
        buttonGroup36 = new javax.swing.ButtonGroup();
        buttonGroup37 = new javax.swing.ButtonGroup();
        buttonGroup38 = new javax.swing.ButtonGroup();
        buttonGroup39 = new javax.swing.ButtonGroup();
        buttonGroup40 = new javax.swing.ButtonGroup();
        buttonGroup41 = new javax.swing.ButtonGroup();
        buttonGroup42 = new javax.swing.ButtonGroup();
        buttonGroup43 = new javax.swing.ButtonGroup();
        buttonGroup44 = new javax.swing.ButtonGroup();
        buttonGroup45 = new javax.swing.ButtonGroup();
        buttonGroup46 = new javax.swing.ButtonGroup();
        buttonGroup47 = new javax.swing.ButtonGroup();
        panelImage1 = new org.edisoncor.gui.panel.PanelImage();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        area = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        identifi = new javax.swing.JFormattedTextField();
        idinsp = new javax.swing.JFormattedTextField();
        jTabbedPane10 = new javax.swing.JTabbedPane();
        jPanel10 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        panelLocal = new javax.swing.JPanel();
        jCheckBox94 = new javax.swing.JCheckBox();
        jCheckBox96 = new javax.swing.JCheckBox();
        jCheckBox97 = new javax.swing.JCheckBox();
        jCheckBox99 = new javax.swing.JCheckBox();
        jCheckBox100 = new javax.swing.JCheckBox();
        jCheckBox102 = new javax.swing.JCheckBox();
        jCheckBox103 = new javax.swing.JCheckBox();
        jCheckBox105 = new javax.swing.JCheckBox();
        jCheckBox106 = new javax.swing.JCheckBox();
        jCheckBox108 = new javax.swing.JCheckBox();
        jPanel42 = new javax.swing.JPanel();
        jCheckBox145 = new javax.swing.JCheckBox();
        jCheckBox200 = new javax.swing.JCheckBox();
        valid9 = new javax.swing.JButton();
        jPanel11 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jPanel36 = new javax.swing.JPanel();
        jCheckBox74 = new javax.swing.JCheckBox();
        jCheckBox75 = new javax.swing.JCheckBox();
        valid3 = new javax.swing.JButton();
        panelPiso = new javax.swing.JPanel();
        jCheckBox176 = new javax.swing.JCheckBox();
        jCheckBox178 = new javax.swing.JCheckBox();
        jCheckBox179 = new javax.swing.JCheckBox();
        jCheckBox181 = new javax.swing.JCheckBox();
        jCheckBox182 = new javax.swing.JCheckBox();
        jCheckBox184 = new javax.swing.JCheckBox();
        jPanel2 = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jPanel37 = new javax.swing.JPanel();
        jCheckBox93 = new javax.swing.JCheckBox();
        jCheckBox109 = new javax.swing.JCheckBox();
        valid4 = new javax.swing.JButton();
        panelAlmacenaje = new javax.swing.JPanel();
        jCheckBox161 = new javax.swing.JCheckBox();
        jCheckBox163 = new javax.swing.JCheckBox();
        jCheckBox164 = new javax.swing.JCheckBox();
        jCheckBox166 = new javax.swing.JCheckBox();
        jCheckBox167 = new javax.swing.JCheckBox();
        jCheckBox169 = new javax.swing.JCheckBox();
        jCheckBox170 = new javax.swing.JCheckBox();
        jCheckBox172 = new javax.swing.JCheckBox();
        jPanel3 = new javax.swing.JPanel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jPanel41 = new javax.swing.JPanel();
        jCheckBox143 = new javax.swing.JCheckBox();
        jCheckBox144 = new javax.swing.JCheckBox();
        valid8 = new javax.swing.JButton();
        panelEquipos = new javax.swing.JPanel();
        jCheckBox191 = new javax.swing.JCheckBox();
        jCheckBox193 = new javax.swing.JCheckBox();
        jCheckBox194 = new javax.swing.JCheckBox();
        jCheckBox196 = new javax.swing.JCheckBox();
        jCheckBox197 = new javax.swing.JCheckBox();
        jCheckBox199 = new javax.swing.JCheckBox();
        jPanel4 = new javax.swing.JPanel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jPanel39 = new javax.swing.JPanel();
        jCheckBox112 = new javax.swing.JCheckBox();
        jCheckBox113 = new javax.swing.JCheckBox();
        valid6 = new javax.swing.JButton();
        panelMaterial = new javax.swing.JPanel();
        jCheckBox146 = new javax.swing.JCheckBox();
        jCheckBox148 = new javax.swing.JCheckBox();
        jCheckBox149 = new javax.swing.JCheckBox();
        jCheckBox151 = new javax.swing.JCheckBox();
        jCheckBox152 = new javax.swing.JCheckBox();
        jCheckBox154 = new javax.swing.JCheckBox();
        jPanel5 = new javax.swing.JPanel();
        jPanel34 = new javax.swing.JPanel();
        jCheckBox68 = new javax.swing.JCheckBox();
        jCheckBox69 = new javax.swing.JCheckBox();
        valid = new javax.swing.JButton();
        jLabel31 = new javax.swing.JLabel();
        panel1 = new javax.swing.JPanel();
        jCheckBox70 = new javax.swing.JCheckBox();
        jCheckBox72 = new javax.swing.JCheckBox();
        jCheckBox73 = new javax.swing.JCheckBox();
        jCheckBox77 = new javax.swing.JCheckBox();
        jCheckBox78 = new javax.swing.JCheckBox();
        jCheckBox80 = new javax.swing.JCheckBox();
        jCheckBox81 = new javax.swing.JCheckBox();
        jCheckBox83 = new javax.swing.JCheckBox();
        jCheckBox84 = new javax.swing.JCheckBox();
        jCheckBox86 = new javax.swing.JCheckBox();
        jCheckBox87 = new javax.swing.JCheckBox();
        jCheckBox89 = new javax.swing.JCheckBox();
        jCheckBox90 = new javax.swing.JCheckBox();
        jCheckBox92 = new javax.swing.JCheckBox();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jPanel38 = new javax.swing.JPanel();
        jCheckBox110 = new javax.swing.JCheckBox();
        jCheckBox111 = new javax.swing.JCheckBox();
        valid5 = new javax.swing.JButton();
        panelEquiposProteccion = new javax.swing.JPanel();
        jCheckBox131 = new javax.swing.JCheckBox();
        jCheckBox133 = new javax.swing.JCheckBox();
        jCheckBox134 = new javax.swing.JCheckBox();
        jCheckBox136 = new javax.swing.JCheckBox();
        jCheckBox137 = new javax.swing.JCheckBox();
        jCheckBox139 = new javax.swing.JCheckBox();
        jCheckBox140 = new javax.swing.JCheckBox();
        jCheckBox142 = new javax.swing.JCheckBox();
        jLabel39 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jPanel40 = new javax.swing.JPanel();
        jCheckBox114 = new javax.swing.JCheckBox();
        jCheckBox115 = new javax.swing.JCheckBox();
        valid7 = new javax.swing.JButton();
        panelResiduos = new javax.swing.JPanel();
        jCheckBox116 = new javax.swing.JCheckBox();
        jCheckBox118 = new javax.swing.JCheckBox();
        jCheckBox119 = new javax.swing.JCheckBox();
        jCheckBox121 = new javax.swing.JCheckBox();
        jCheckBox122 = new javax.swing.JCheckBox();
        jCheckBox124 = new javax.swing.JCheckBox();
        jCheckBox125 = new javax.swing.JCheckBox();
        jCheckBox127 = new javax.swing.JCheckBox();
        jCheckBox128 = new javax.swing.JCheckBox();
        jCheckBox130 = new javax.swing.JCheckBox();
        jCheckBox19 = new javax.swing.JCheckBox();
        jCheckBox17 = new javax.swing.JCheckBox();
        jLabel44 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();
        jLabel48 = new javax.swing.JLabel();
        jLabel49 = new javax.swing.JLabel();
        jLabel50 = new javax.swing.JLabel();
        eveluar = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        Guardar = new javax.swing.JButton();
        cs = new javax.swing.JFormattedTextField();
        cn = new javax.swing.JFormattedTextField();
        ri = new javax.swing.JFormattedTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        obser = new javax.swing.JTextArea();
        regis = new javax.swing.JButton();
        si = new javax.swing.JLabel();
        no = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        lista = new javax.swing.JList<>();

        tablaresul.setVisible(true);

        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Laboratorio", "Fech y Hora de revision", "area", "R.nombre", "R.cargo", "Observaciones"
            }
        ));
        jScrollPane1.setViewportView(tabla);

        javax.swing.GroupLayout tablaresulLayout = new javax.swing.GroupLayout(tablaresul.getContentPane());
        tablaresul.getContentPane().setLayout(tablaresulLayout);
        tablaresulLayout.setHorizontalGroup(
            tablaresulLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tablaresulLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 736, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        tablaresulLayout.setVerticalGroup(
            tablaresulLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tablaresulLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(35, Short.MAX_VALUE))
        );

        setClosable(true);
        setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);
        setIconifiable(true);
        setTitle("EVALUACIÓN INSTALACIÓN");
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

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "INSTALACIONES", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Cambria", 1, 18), new java.awt.Color(102, 102, 102))); // NOI18N
        jPanel1.setOpaque(false);

        jLabel3.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 102, 102));
        jLabel3.setText("Observaciones");

        area.setText("Escriba el área");
        area.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                areaFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                areaFocusLost(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(102, 102, 102));
        jLabel13.setText("Área");

        jTabbedPane10.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Aspectos", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Cambria", 1, 18), new java.awt.Color(102, 102, 102))); // NOI18N
        jTabbedPane10.setForeground(new java.awt.Color(102, 102, 102));
        jTabbedPane10.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N

        jPanel10.setOpaque(false);
        jPanel10.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 102, 102));
        jLabel1.setText("Aplica");
        jPanel10.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 11, 519, -1));

        jLabel2.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 102, 102));
        jLabel2.setText("Las paredes están limpias y en buen estado");
        jPanel10.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 68, -1, -1));

        jLabel4.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(102, 102, 102));
        jLabel4.setText("Las ventanas y tragaluces están limpios sin impedir la entrada de luz natural  ");
        jPanel10.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 94, -1, -1));

        jLabel5.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(102, 102, 102));
        jLabel5.setText("El sistema de iluminación está mantenido de forma eficiente y limpia ");
        jPanel10.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, -1, -1));

        jLabel6.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(102, 102, 102));
        jLabel6.setText("Las señales de seguridad están visibles y correctamente distribuidas");
        jPanel10.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, -1, -1));

        jLabel7.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(102, 102, 102));
        jLabel7.setText("Los extintores están en su lugar de ubicación y visibles");
        jPanel10.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, -1, -1));

        panelLocal.setForeground(new java.awt.Color(102, 102, 102));
        panelLocal.setOpaque(false);

        buttonGroup2.add(jCheckBox94);
        jCheckBox94.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jCheckBox94.setForeground(new java.awt.Color(102, 102, 102));
        jCheckBox94.setText("Si");
        jCheckBox94.setOpaque(false);

        buttonGroup2.add(jCheckBox96);
        jCheckBox96.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jCheckBox96.setForeground(new java.awt.Color(102, 102, 102));
        jCheckBox96.setText("No");
        jCheckBox96.setOpaque(false);

        buttonGroup3.add(jCheckBox97);
        jCheckBox97.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jCheckBox97.setForeground(new java.awt.Color(102, 102, 102));
        jCheckBox97.setText("Si");
        jCheckBox97.setOpaque(false);

        buttonGroup3.add(jCheckBox99);
        jCheckBox99.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jCheckBox99.setForeground(new java.awt.Color(102, 102, 102));
        jCheckBox99.setText("No");
        jCheckBox99.setOpaque(false);

        buttonGroup4.add(jCheckBox100);
        jCheckBox100.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jCheckBox100.setForeground(new java.awt.Color(102, 102, 102));
        jCheckBox100.setText("Si");
        jCheckBox100.setOpaque(false);

        buttonGroup4.add(jCheckBox102);
        jCheckBox102.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jCheckBox102.setForeground(new java.awt.Color(102, 102, 102));
        jCheckBox102.setText("No");
        jCheckBox102.setOpaque(false);

        buttonGroup5.add(jCheckBox103);
        jCheckBox103.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jCheckBox103.setForeground(new java.awt.Color(102, 102, 102));
        jCheckBox103.setText("Si");
        jCheckBox103.setOpaque(false);

        buttonGroup5.add(jCheckBox105);
        jCheckBox105.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jCheckBox105.setForeground(new java.awt.Color(102, 102, 102));
        jCheckBox105.setText("No");
        jCheckBox105.setOpaque(false);

        buttonGroup6.add(jCheckBox106);
        jCheckBox106.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jCheckBox106.setForeground(new java.awt.Color(102, 102, 102));
        jCheckBox106.setText("Si");
        jCheckBox106.setOpaque(false);

        buttonGroup6.add(jCheckBox108);
        jCheckBox108.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jCheckBox108.setForeground(new java.awt.Color(102, 102, 102));
        jCheckBox108.setText("No");
        jCheckBox108.setOpaque(false);

        javax.swing.GroupLayout panelLocalLayout = new javax.swing.GroupLayout(panelLocal);
        panelLocal.setLayout(panelLocalLayout);
        panelLocalLayout.setHorizontalGroup(
            panelLocalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLocalLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelLocalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelLocalLayout.createSequentialGroup()
                        .addComponent(jCheckBox100)
                        .addGap(18, 18, 18)
                        .addComponent(jCheckBox102))
                    .addGroup(panelLocalLayout.createSequentialGroup()
                        .addComponent(jCheckBox97)
                        .addGap(18, 18, 18)
                        .addComponent(jCheckBox99))
                    .addGroup(panelLocalLayout.createSequentialGroup()
                        .addComponent(jCheckBox103)
                        .addGap(18, 18, 18)
                        .addComponent(jCheckBox105))
                    .addGroup(panelLocalLayout.createSequentialGroup()
                        .addComponent(jCheckBox106)
                        .addGap(18, 18, 18)
                        .addComponent(jCheckBox108))
                    .addGroup(panelLocalLayout.createSequentialGroup()
                        .addComponent(jCheckBox94)
                        .addGap(18, 18, 18)
                        .addComponent(jCheckBox96)))
                .addContainerGap(8, Short.MAX_VALUE))
        );
        panelLocalLayout.setVerticalGroup(
            panelLocalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLocalLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelLocalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jCheckBox96, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jCheckBox94))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelLocalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCheckBox97)
                    .addComponent(jCheckBox99))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelLocalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCheckBox100)
                    .addComponent(jCheckBox102))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelLocalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jCheckBox105)
                    .addComponent(jCheckBox103))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelLocalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCheckBox106)
                    .addComponent(jCheckBox108))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel10.add(panelLocal, new org.netbeans.lib.awtextra.AbsoluteConstraints(548, 59, 110, -1));

        jPanel42.setForeground(new java.awt.Color(102, 102, 102));
        jPanel42.setOpaque(false);

        buttonGroup1.add(jCheckBox145);
        jCheckBox145.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jCheckBox145.setForeground(new java.awt.Color(102, 102, 102));
        jCheckBox145.setText("Si");
        jCheckBox145.setOpaque(false);

        buttonGroup1.add(jCheckBox200);
        jCheckBox200.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jCheckBox200.setForeground(new java.awt.Color(102, 102, 102));
        jCheckBox200.setText("No");
        jCheckBox200.setOpaque(false);

        valid9.setText("Validar");
        valid9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                valid9ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel42Layout = new javax.swing.GroupLayout(jPanel42);
        jPanel42.setLayout(jPanel42Layout);
        jPanel42Layout.setHorizontalGroup(
            jPanel42Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel42Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jCheckBox145)
                .addGap(18, 18, 18)
                .addComponent(jCheckBox200)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(valid9)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel42Layout.setVerticalGroup(
            jPanel42Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel42Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel42Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCheckBox145)
                    .addComponent(jCheckBox200)
                    .addComponent(valid9))
                .addGap(0, 5, Short.MAX_VALUE))
        );

        jPanel10.add(jPanel42, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 10, 170, 40));

        jTabbedPane10.addTab("1.Local", jPanel10);

        jPanel11.setOpaque(false);
        jPanel11.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        jLabel8.setText("Aplica");
        jPanel11.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, -1, 46));

        jLabel9.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(102, 102, 102));
        jLabel9.setText("El piso esta limpio, seco, sin desperdicios ni material innecesario ");
        jPanel11.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 520, -1));

        jLabel10.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(102, 102, 102));
        jLabel10.setText("Las vías de circulación de personas y vehículos están diferenciadas y señalizadas ");
        jPanel11.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, -1, 20));

        jLabel17.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(102, 102, 102));
        jLabel17.setText("Los pasillos y zonas de tránsito están libres de obstáculos ");
        jPanel11.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, -1, -1));

        jPanel36.setOpaque(false);

        buttonGroup7.add(jCheckBox74);
        jCheckBox74.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jCheckBox74.setForeground(new java.awt.Color(102, 102, 102));
        jCheckBox74.setText("Si");
        jCheckBox74.setOpaque(false);

        buttonGroup7.add(jCheckBox75);
        jCheckBox75.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jCheckBox75.setForeground(new java.awt.Color(102, 102, 102));
        jCheckBox75.setText("No");
        jCheckBox75.setOpaque(false);

        valid3.setText("Validar");
        valid3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                valid3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel36Layout = new javax.swing.GroupLayout(jPanel36);
        jPanel36.setLayout(jPanel36Layout);
        jPanel36Layout.setHorizontalGroup(
            jPanel36Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel36Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jCheckBox74)
                .addGap(18, 18, 18)
                .addComponent(jCheckBox75)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(valid3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel36Layout.setVerticalGroup(
            jPanel36Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel36Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel36Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCheckBox74)
                    .addComponent(jCheckBox75)
                    .addComponent(valid3))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel11.add(jPanel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 10, 180, -1));

        panelPiso.setForeground(new java.awt.Color(102, 102, 102));
        panelPiso.setOpaque(false);

        buttonGroup8.add(jCheckBox176);
        jCheckBox176.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jCheckBox176.setForeground(new java.awt.Color(102, 102, 102));
        jCheckBox176.setText("Si");
        jCheckBox176.setOpaque(false);

        buttonGroup8.add(jCheckBox178);
        jCheckBox178.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jCheckBox178.setForeground(new java.awt.Color(102, 102, 102));
        jCheckBox178.setText("No");
        jCheckBox178.setOpaque(false);

        buttonGroup9.add(jCheckBox179);
        jCheckBox179.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jCheckBox179.setForeground(new java.awt.Color(102, 102, 102));
        jCheckBox179.setText("Si");
        jCheckBox179.setOpaque(false);

        buttonGroup9.add(jCheckBox181);
        jCheckBox181.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jCheckBox181.setForeground(new java.awt.Color(102, 102, 102));
        jCheckBox181.setText("No");
        jCheckBox181.setOpaque(false);

        buttonGroup10.add(jCheckBox182);
        jCheckBox182.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jCheckBox182.setForeground(new java.awt.Color(102, 102, 102));
        jCheckBox182.setText("Si");
        jCheckBox182.setOpaque(false);

        buttonGroup10.add(jCheckBox184);
        jCheckBox184.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jCheckBox184.setForeground(new java.awt.Color(102, 102, 102));
        jCheckBox184.setText("No");
        jCheckBox184.setOpaque(false);

        javax.swing.GroupLayout panelPisoLayout = new javax.swing.GroupLayout(panelPiso);
        panelPiso.setLayout(panelPisoLayout);
        panelPisoLayout.setHorizontalGroup(
            panelPisoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPisoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelPisoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelPisoLayout.createSequentialGroup()
                        .addComponent(jCheckBox176)
                        .addGap(18, 18, 18)
                        .addComponent(jCheckBox178)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(panelPisoLayout.createSequentialGroup()
                        .addGroup(panelPisoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelPisoLayout.createSequentialGroup()
                                .addComponent(jCheckBox182)
                                .addGap(18, 18, 18)
                                .addComponent(jCheckBox184))
                            .addGroup(panelPisoLayout.createSequentialGroup()
                                .addComponent(jCheckBox179)
                                .addGap(18, 18, 18)
                                .addComponent(jCheckBox181)))
                        .addGap(0, 8, Short.MAX_VALUE))))
        );
        panelPisoLayout.setVerticalGroup(
            panelPisoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPisoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelPisoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCheckBox176)
                    .addComponent(jCheckBox178))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelPisoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCheckBox179)
                    .addComponent(jCheckBox181))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelPisoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jCheckBox182)
                    .addComponent(jCheckBox184))
                .addContainerGap())
        );

        jPanel11.add(panelPiso, new org.netbeans.lib.awtextra.AbsoluteConstraints(548, 66, 110, -1));

        jTabbedPane10.addTab("2.Piso Y Pasillos", jPanel11);

        jPanel2.setOpaque(false);
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel18.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(102, 102, 102));
        jLabel18.setText("Aplica");
        jPanel2.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 11, 59, 30));

        jLabel19.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(102, 102, 102));
        jLabel19.setText("Las áreas de almacenamiento y deposición de materiales están señalizadas");
        jPanel2.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 75, -1, -1));

        jLabel20.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(102, 102, 102));
        jLabel20.setText("Los materiales y agentes químicos almacenados se encuentran correctamente identificados");
        jPanel2.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, -1, -1));

        jLabel21.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(102, 102, 102));
        jLabel21.setText("Los materiales están colocados en su sitio, sin invadir zonas de paso");
        jPanel2.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 125, -1, -1));

        jLabel22.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(102, 102, 102));
        jLabel22.setText("Los materiales se colocan de manera segura, limpia y ordenada");
        jPanel2.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, -1, -1));

        jPanel37.setOpaque(false);

        buttonGroup11.add(jCheckBox93);
        jCheckBox93.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jCheckBox93.setForeground(new java.awt.Color(102, 102, 102));
        jCheckBox93.setText("Si");
        jCheckBox93.setOpaque(false);

        buttonGroup11.add(jCheckBox109);
        jCheckBox109.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jCheckBox109.setForeground(new java.awt.Color(102, 102, 102));
        jCheckBox109.setText("No");
        jCheckBox109.setOpaque(false);

        valid4.setText("Validar");
        valid4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                valid4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel37Layout = new javax.swing.GroupLayout(jPanel37);
        jPanel37.setLayout(jPanel37Layout);
        jPanel37Layout.setHorizontalGroup(
            jPanel37Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel37Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jCheckBox93)
                .addGap(10, 10, 10)
                .addComponent(jCheckBox109)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(valid4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel37Layout.setVerticalGroup(
            jPanel37Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel37Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel37Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCheckBox93)
                    .addComponent(jCheckBox109)
                    .addComponent(valid4))
                .addContainerGap())
        );

        jPanel2.add(jPanel37, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 10, 170, 40));

        panelAlmacenaje.setOpaque(false);

        buttonGroup12.add(jCheckBox161);
        jCheckBox161.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jCheckBox161.setForeground(new java.awt.Color(102, 102, 102));
        jCheckBox161.setText("Si");
        jCheckBox161.setOpaque(false);

        buttonGroup12.add(jCheckBox163);
        jCheckBox163.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jCheckBox163.setForeground(new java.awt.Color(102, 102, 102));
        jCheckBox163.setText("No");
        jCheckBox163.setOpaque(false);

        buttonGroup13.add(jCheckBox164);
        jCheckBox164.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jCheckBox164.setForeground(new java.awt.Color(102, 102, 102));
        jCheckBox164.setText("Si");
        jCheckBox164.setOpaque(false);

        buttonGroup13.add(jCheckBox166);
        jCheckBox166.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jCheckBox166.setForeground(new java.awt.Color(102, 102, 102));
        jCheckBox166.setText("No");
        jCheckBox166.setOpaque(false);

        buttonGroup14.add(jCheckBox167);
        jCheckBox167.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jCheckBox167.setForeground(new java.awt.Color(102, 102, 102));
        jCheckBox167.setText("Si");
        jCheckBox167.setOpaque(false);

        buttonGroup14.add(jCheckBox169);
        jCheckBox169.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jCheckBox169.setForeground(new java.awt.Color(102, 102, 102));
        jCheckBox169.setText("No");
        jCheckBox169.setOpaque(false);

        buttonGroup15.add(jCheckBox170);
        jCheckBox170.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jCheckBox170.setForeground(new java.awt.Color(102, 102, 102));
        jCheckBox170.setText("Si");
        jCheckBox170.setOpaque(false);

        buttonGroup15.add(jCheckBox172);
        jCheckBox172.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jCheckBox172.setForeground(new java.awt.Color(102, 102, 102));
        jCheckBox172.setText("No");
        jCheckBox172.setOpaque(false);

        javax.swing.GroupLayout panelAlmacenajeLayout = new javax.swing.GroupLayout(panelAlmacenaje);
        panelAlmacenaje.setLayout(panelAlmacenajeLayout);
        panelAlmacenajeLayout.setHorizontalGroup(
            panelAlmacenajeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelAlmacenajeLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelAlmacenajeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelAlmacenajeLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jCheckBox161)
                        .addGap(18, 18, 18)
                        .addComponent(jCheckBox163)
                        .addGap(69, 69, 69))
                    .addGroup(panelAlmacenajeLayout.createSequentialGroup()
                        .addGroup(panelAlmacenajeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelAlmacenajeLayout.createSequentialGroup()
                                .addComponent(jCheckBox167)
                                .addGap(18, 18, 18)
                                .addComponent(jCheckBox169))
                            .addGroup(panelAlmacenajeLayout.createSequentialGroup()
                                .addComponent(jCheckBox164)
                                .addGap(18, 18, 18)
                                .addComponent(jCheckBox166))
                            .addGroup(panelAlmacenajeLayout.createSequentialGroup()
                                .addComponent(jCheckBox170)
                                .addGap(18, 18, 18)
                                .addComponent(jCheckBox172)))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        panelAlmacenajeLayout.setVerticalGroup(
            panelAlmacenajeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelAlmacenajeLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelAlmacenajeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jCheckBox163, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jCheckBox161))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelAlmacenajeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCheckBox164)
                    .addComponent(jCheckBox166))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelAlmacenajeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCheckBox167)
                    .addComponent(jCheckBox169))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelAlmacenajeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCheckBox170)
                    .addComponent(jCheckBox172))
                .addContainerGap())
        );

        jPanel2.add(panelAlmacenaje, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 60, 110, -1));

        jTabbedPane10.addTab("3.Almacenaje", jPanel2);

        jPanel3.setOpaque(false);
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel23.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(102, 102, 102));
        jLabel23.setText("Aplica");
        jPanel3.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 31, -1, -1));

        jLabel24.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(102, 102, 102));
        jLabel24.setText("Se encuentran limpios y libres en su entorno de todo material innecesario");
        jPanel3.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, -1, -1));

        jLabel25.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(102, 102, 102));
        jLabel25.setText("Se encuentran libres de filtraciones innecesarias de aceites y grasas");
        jPanel3.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, -1, -1));

        jLabel26.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(102, 102, 102));
        jLabel26.setText("Poseen las protecciones adecuadas y los dispositivos de seguridad en funcionamiento");
        jPanel3.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, -1, -1));

        jPanel41.setOpaque(false);

        buttonGroup44.add(jCheckBox143);
        jCheckBox143.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        jCheckBox143.setForeground(new java.awt.Color(102, 102, 102));
        jCheckBox143.setText("Si");
        jCheckBox143.setOpaque(false);

        buttonGroup44.add(jCheckBox144);
        jCheckBox144.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        jCheckBox144.setForeground(new java.awt.Color(102, 102, 102));
        jCheckBox144.setText("No");
        jCheckBox144.setOpaque(false);

        valid8.setText("Validar");
        valid8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                valid8ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel41Layout = new javax.swing.GroupLayout(jPanel41);
        jPanel41.setLayout(jPanel41Layout);
        jPanel41Layout.setHorizontalGroup(
            jPanel41Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel41Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jCheckBox143)
                .addGap(18, 18, 18)
                .addComponent(jCheckBox144)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(valid8)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel41Layout.setVerticalGroup(
            jPanel41Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel41Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel41Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCheckBox144)
                    .addComponent(jCheckBox143)
                    .addComponent(valid8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 5, Short.MAX_VALUE))
        );

        jPanel3.add(jPanel41, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 10, 170, 40));

        panelEquipos.setForeground(new java.awt.Color(102, 102, 102));
        panelEquipos.setOpaque(false);

        buttonGroup45.add(jCheckBox191);
        jCheckBox191.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        jCheckBox191.setForeground(new java.awt.Color(102, 102, 102));
        jCheckBox191.setText("Si");
        jCheckBox191.setOpaque(false);

        buttonGroup45.add(jCheckBox193);
        jCheckBox193.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        jCheckBox193.setForeground(new java.awt.Color(102, 102, 102));
        jCheckBox193.setText("No");
        jCheckBox193.setOpaque(false);

        buttonGroup46.add(jCheckBox194);
        jCheckBox194.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        jCheckBox194.setForeground(new java.awt.Color(102, 102, 102));
        jCheckBox194.setText("Si");
        jCheckBox194.setOpaque(false);

        buttonGroup46.add(jCheckBox196);
        jCheckBox196.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        jCheckBox196.setForeground(new java.awt.Color(102, 102, 102));
        jCheckBox196.setText("No");
        jCheckBox196.setOpaque(false);

        buttonGroup47.add(jCheckBox197);
        jCheckBox197.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        jCheckBox197.setForeground(new java.awt.Color(102, 102, 102));
        jCheckBox197.setText("Si");
        jCheckBox197.setOpaque(false);

        buttonGroup47.add(jCheckBox199);
        jCheckBox199.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        jCheckBox199.setForeground(new java.awt.Color(102, 102, 102));
        jCheckBox199.setText("No");
        jCheckBox199.setOpaque(false);

        javax.swing.GroupLayout panelEquiposLayout = new javax.swing.GroupLayout(panelEquipos);
        panelEquipos.setLayout(panelEquiposLayout);
        panelEquiposLayout.setHorizontalGroup(
            panelEquiposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelEquiposLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelEquiposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelEquiposLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jCheckBox191)
                        .addGap(18, 18, 18)
                        .addComponent(jCheckBox193)
                        .addGap(73, 73, 73))
                    .addGroup(panelEquiposLayout.createSequentialGroup()
                        .addGroup(panelEquiposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelEquiposLayout.createSequentialGroup()
                                .addComponent(jCheckBox197)
                                .addGap(18, 18, 18)
                                .addComponent(jCheckBox199))
                            .addGroup(panelEquiposLayout.createSequentialGroup()
                                .addComponent(jCheckBox194)
                                .addGap(18, 18, 18)
                                .addComponent(jCheckBox196)))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        panelEquiposLayout.setVerticalGroup(
            panelEquiposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelEquiposLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelEquiposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCheckBox191)
                    .addComponent(jCheckBox193))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelEquiposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCheckBox194)
                    .addComponent(jCheckBox196))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelEquiposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCheckBox197)
                    .addComponent(jCheckBox199))
                .addContainerGap())
        );

        jPanel3.add(panelEquipos, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 70, 120, -1));

        jTabbedPane10.addTab("4.Equipos", jPanel3);

        jPanel4.setOpaque(false);
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel27.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(102, 102, 102));
        jLabel27.setText("Aplica");
        jPanel4.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 11, 91, 30));

        jLabel28.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(102, 102, 102));
        jLabel28.setText("Esta almacenado en los armarios o paneles adecuados");
        jPanel4.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, -1, -1));

        jLabel29.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(102, 102, 102));
        jLabel29.setText("Se encuentra limpio y sin rastro de productos químicos en el área de almacenamiento ");
        jPanel4.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 114, -1, -1));

        jLabel30.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(102, 102, 102));
        jLabel30.setText("Están en condiciones seguras para el trabajo, no defectuosas u oxidadas");
        jPanel4.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, -1, -1));

        jPanel39.setOpaque(false);

        buttonGroup20.add(jCheckBox112);
        jCheckBox112.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        jCheckBox112.setForeground(new java.awt.Color(102, 102, 102));
        jCheckBox112.setText("Si");
        jCheckBox112.setOpaque(false);

        buttonGroup20.add(jCheckBox113);
        jCheckBox113.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        jCheckBox113.setForeground(new java.awt.Color(102, 102, 102));
        jCheckBox113.setText("No");
        jCheckBox113.setOpaque(false);

        valid6.setText("Validar");
        valid6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                valid6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel39Layout = new javax.swing.GroupLayout(jPanel39);
        jPanel39.setLayout(jPanel39Layout);
        jPanel39Layout.setHorizontalGroup(
            jPanel39Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel39Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jCheckBox112)
                .addGap(18, 18, 18)
                .addComponent(jCheckBox113)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(valid6)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel39Layout.setVerticalGroup(
            jPanel39Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel39Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel39Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCheckBox112)
                    .addComponent(jCheckBox113)
                    .addComponent(valid6))
                .addContainerGap())
        );

        jPanel4.add(jPanel39, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 10, 200, 40));

        panelMaterial.setOpaque(false);

        buttonGroup21.add(jCheckBox146);
        jCheckBox146.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        jCheckBox146.setForeground(new java.awt.Color(102, 102, 102));
        jCheckBox146.setText("Si");
        jCheckBox146.setOpaque(false);

        buttonGroup21.add(jCheckBox148);
        jCheckBox148.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        jCheckBox148.setForeground(new java.awt.Color(102, 102, 102));
        jCheckBox148.setText("No");
        jCheckBox148.setOpaque(false);

        buttonGroup22.add(jCheckBox149);
        jCheckBox149.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        jCheckBox149.setForeground(new java.awt.Color(102, 102, 102));
        jCheckBox149.setText("Si");
        jCheckBox149.setOpaque(false);

        buttonGroup22.add(jCheckBox151);
        jCheckBox151.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        jCheckBox151.setForeground(new java.awt.Color(102, 102, 102));
        jCheckBox151.setText("No");
        jCheckBox151.setOpaque(false);

        buttonGroup23.add(jCheckBox152);
        jCheckBox152.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        jCheckBox152.setForeground(new java.awt.Color(102, 102, 102));
        jCheckBox152.setText("Si");
        jCheckBox152.setOpaque(false);

        buttonGroup23.add(jCheckBox154);
        jCheckBox154.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        jCheckBox154.setForeground(new java.awt.Color(102, 102, 102));
        jCheckBox154.setText("No");
        jCheckBox154.setOpaque(false);

        javax.swing.GroupLayout panelMaterialLayout = new javax.swing.GroupLayout(panelMaterial);
        panelMaterial.setLayout(panelMaterialLayout);
        panelMaterialLayout.setHorizontalGroup(
            panelMaterialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMaterialLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelMaterialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelMaterialLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jCheckBox146)
                        .addGap(18, 18, 18)
                        .addComponent(jCheckBox148)
                        .addGap(73, 73, 73))
                    .addGroup(panelMaterialLayout.createSequentialGroup()
                        .addGroup(panelMaterialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelMaterialLayout.createSequentialGroup()
                                .addComponent(jCheckBox152)
                                .addGap(18, 18, 18)
                                .addComponent(jCheckBox154))
                            .addGroup(panelMaterialLayout.createSequentialGroup()
                                .addComponent(jCheckBox149)
                                .addGap(18, 18, 18)
                                .addComponent(jCheckBox151)))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        panelMaterialLayout.setVerticalGroup(
            panelMaterialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMaterialLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelMaterialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCheckBox146)
                    .addComponent(jCheckBox148))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelMaterialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCheckBox149)
                    .addComponent(jCheckBox151))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelMaterialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCheckBox152)
                    .addComponent(jCheckBox154))
                .addContainerGap())
        );

        jPanel4.add(panelMaterial, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 70, 120, -1));

        jTabbedPane10.addTab("5.Material de Laboratorio", jPanel4);

        jPanel5.setOpaque(false);
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel34.setOpaque(false);

        buttonGroup24.add(jCheckBox68);
        jCheckBox68.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        jCheckBox68.setForeground(new java.awt.Color(102, 102, 102));
        jCheckBox68.setText("Si");
        jCheckBox68.setOpaque(false);

        buttonGroup24.add(jCheckBox69);
        jCheckBox69.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        jCheckBox69.setForeground(new java.awt.Color(102, 102, 102));
        jCheckBox69.setText("No");
        jCheckBox69.setOpaque(false);

        valid.setText("Validar");
        valid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                validActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel34Layout = new javax.swing.GroupLayout(jPanel34);
        jPanel34.setLayout(jPanel34Layout);
        jPanel34Layout.setHorizontalGroup(
            jPanel34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel34Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jCheckBox68)
                .addGap(18, 18, 18)
                .addComponent(jCheckBox69)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(valid)
                .addContainerGap(15, Short.MAX_VALUE))
        );
        jPanel34Layout.setVerticalGroup(
            jPanel34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel34Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCheckBox68)
                    .addComponent(jCheckBox69)
                    .addComponent(valid))
                .addContainerGap())
        );

        jPanel5.add(jPanel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 20, 190, 40));

        jLabel31.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        jLabel31.setForeground(new java.awt.Color(102, 102, 102));
        jLabel31.setText("Aplica");
        jPanel5.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 11, 57, 30));

        panel1.setOpaque(false);

        buttonGroup25.add(jCheckBox70);
        jCheckBox70.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        jCheckBox70.setForeground(new java.awt.Color(102, 102, 102));
        jCheckBox70.setText("Si");
        jCheckBox70.setOpaque(false);

        buttonGroup25.add(jCheckBox72);
        jCheckBox72.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        jCheckBox72.setForeground(new java.awt.Color(102, 102, 102));
        jCheckBox72.setText("No");
        jCheckBox72.setOpaque(false);

        buttonGroup26.add(jCheckBox73);
        jCheckBox73.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        jCheckBox73.setForeground(new java.awt.Color(102, 102, 102));
        jCheckBox73.setText("Si");
        jCheckBox73.setOpaque(false);

        buttonGroup26.add(jCheckBox77);
        jCheckBox77.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        jCheckBox77.setForeground(new java.awt.Color(102, 102, 102));
        jCheckBox77.setText("No");
        jCheckBox77.setOpaque(false);

        buttonGroup27.add(jCheckBox78);
        jCheckBox78.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        jCheckBox78.setForeground(new java.awt.Color(102, 102, 102));
        jCheckBox78.setText("Si");
        jCheckBox78.setOpaque(false);

        buttonGroup27.add(jCheckBox80);
        jCheckBox80.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        jCheckBox80.setForeground(new java.awt.Color(102, 102, 102));
        jCheckBox80.setText("No");
        jCheckBox80.setOpaque(false);

        buttonGroup28.add(jCheckBox81);
        jCheckBox81.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        jCheckBox81.setForeground(new java.awt.Color(102, 102, 102));
        jCheckBox81.setText("Si");
        jCheckBox81.setOpaque(false);

        buttonGroup28.add(jCheckBox83);
        jCheckBox83.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        jCheckBox83.setForeground(new java.awt.Color(102, 102, 102));
        jCheckBox83.setText("No");
        jCheckBox83.setOpaque(false);

        buttonGroup29.add(jCheckBox84);
        jCheckBox84.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        jCheckBox84.setForeground(new java.awt.Color(102, 102, 102));
        jCheckBox84.setText("Si");
        jCheckBox84.setOpaque(false);

        buttonGroup29.add(jCheckBox86);
        jCheckBox86.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        jCheckBox86.setForeground(new java.awt.Color(102, 102, 102));
        jCheckBox86.setText("No");
        jCheckBox86.setOpaque(false);

        buttonGroup30.add(jCheckBox87);
        jCheckBox87.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        jCheckBox87.setForeground(new java.awt.Color(102, 102, 102));
        jCheckBox87.setText("Si");
        jCheckBox87.setOpaque(false);

        buttonGroup30.add(jCheckBox89);
        jCheckBox89.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        jCheckBox89.setForeground(new java.awt.Color(102, 102, 102));
        jCheckBox89.setText("No");
        jCheckBox89.setOpaque(false);

        buttonGroup31.add(jCheckBox90);
        jCheckBox90.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        jCheckBox90.setForeground(new java.awt.Color(102, 102, 102));
        jCheckBox90.setText("Si");
        jCheckBox90.setOpaque(false);

        buttonGroup31.add(jCheckBox92);
        jCheckBox92.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        jCheckBox92.setForeground(new java.awt.Color(102, 102, 102));
        jCheckBox92.setText("No");
        jCheckBox92.setOpaque(false);

        javax.swing.GroupLayout panel1Layout = new javax.swing.GroupLayout(panel1);
        panel1.setLayout(panel1Layout);
        panel1Layout.setHorizontalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jCheckBox70)
                        .addGap(18, 18, 18)
                        .addComponent(jCheckBox72)
                        .addGap(73, 73, 73))
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panel1Layout.createSequentialGroup()
                                .addComponent(jCheckBox78)
                                .addGap(18, 18, 18)
                                .addComponent(jCheckBox80))
                            .addGroup(panel1Layout.createSequentialGroup()
                                .addComponent(jCheckBox73)
                                .addGap(18, 18, 18)
                                .addComponent(jCheckBox77))
                            .addGroup(panel1Layout.createSequentialGroup()
                                .addComponent(jCheckBox81)
                                .addGap(18, 18, 18)
                                .addComponent(jCheckBox83))
                            .addGroup(panel1Layout.createSequentialGroup()
                                .addComponent(jCheckBox84)
                                .addGap(18, 18, 18)
                                .addComponent(jCheckBox86))
                            .addGroup(panel1Layout.createSequentialGroup()
                                .addComponent(jCheckBox87)
                                .addGap(18, 18, 18)
                                .addComponent(jCheckBox89))
                            .addGroup(panel1Layout.createSequentialGroup()
                                .addComponent(jCheckBox90)
                                .addGap(18, 18, 18)
                                .addComponent(jCheckBox92)))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        panel1Layout.setVerticalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCheckBox70)
                    .addComponent(jCheckBox72))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCheckBox73)
                    .addComponent(jCheckBox77))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCheckBox78)
                    .addComponent(jCheckBox80))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCheckBox81)
                    .addComponent(jCheckBox83))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCheckBox84)
                    .addComponent(jCheckBox86))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCheckBox87)
                    .addComponent(jCheckBox89))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCheckBox90)
                    .addComponent(jCheckBox92))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel5.add(panel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 70, -1, -1));

        jLabel32.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        jLabel32.setForeground(new java.awt.Color(102, 102, 102));
        jLabel32.setText("Reactivos y/o productos químicos se encuentran claramente identificados ");
        jPanel5.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, -1, -1));

        jLabel33.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        jLabel33.setForeground(new java.awt.Color(102, 102, 102));
        jLabel33.setText("Los reactivos se encuentran en las zonas respectivas y/o adecuadas de almacenamiento");
        jPanel5.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 111, 449, -1));

        jLabel34.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        jLabel34.setForeground(new java.awt.Color(102, 102, 102));
        jLabel34.setText("Los contenedores están colocados próximos y accesibles a los lugares de trabajo    ");
        jPanel5.add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, -1, -1));

        jLabel35.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        jLabel35.setForeground(new java.awt.Color(102, 102, 102));
        jLabel35.setText("Están las zonas de trabajo y cabinas libres de envases de productos y materiales ");
        jPanel5.add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, -1, -1));

        jLabel36.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        jLabel36.setForeground(new java.awt.Color(102, 102, 102));
        jLabel36.setText("Se almacenan los productos en armarios o recintos especialmente indicados para ello");
        jPanel5.add(jLabel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, -1, -1));

        jLabel37.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        jLabel37.setForeground(new java.awt.Color(102, 102, 102));
        jLabel37.setText("Están las cabinas, mesas o lugares de trabajo limpias de derrames de productos");
        jPanel5.add(jLabel37, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, -1, -1));

        jLabel38.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        jLabel38.setForeground(new java.awt.Color(102, 102, 102));
        jLabel38.setText("Existen materiales absorbentes y/o equipos para el control de posibles derrames ");
        jPanel5.add(jLabel38, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 260, -1, -1));

        jTabbedPane10.addTab("6.Reactivos y/o productos químicos", jPanel5);

        jPanel6.setOpaque(false);
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel38.setOpaque(false);

        buttonGroup32.add(jCheckBox110);
        jCheckBox110.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        jCheckBox110.setForeground(new java.awt.Color(102, 102, 102));
        jCheckBox110.setText("Si");
        jCheckBox110.setOpaque(false);

        buttonGroup32.add(jCheckBox111);
        jCheckBox111.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        jCheckBox111.setForeground(new java.awt.Color(102, 102, 102));
        jCheckBox111.setText("No");
        jCheckBox111.setOpaque(false);

        valid5.setText("Validar");
        valid5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                valid5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel38Layout = new javax.swing.GroupLayout(jPanel38);
        jPanel38.setLayout(jPanel38Layout);
        jPanel38Layout.setHorizontalGroup(
            jPanel38Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel38Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jCheckBox110)
                .addGap(18, 18, 18)
                .addComponent(jCheckBox111)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(valid5)
                .addContainerGap())
        );
        jPanel38Layout.setVerticalGroup(
            jPanel38Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel38Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel38Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCheckBox110)
                    .addComponent(jCheckBox111)
                    .addComponent(valid5))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel6.add(jPanel38, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 10, 170, -1));

        panelEquiposProteccion.setEnabled(false);
        panelEquiposProteccion.setOpaque(false);

        buttonGroup33.add(jCheckBox131);
        jCheckBox131.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        jCheckBox131.setForeground(new java.awt.Color(102, 102, 102));
        jCheckBox131.setText("Si");
        jCheckBox131.setOpaque(false);

        buttonGroup33.add(jCheckBox133);
        jCheckBox133.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        jCheckBox133.setForeground(new java.awt.Color(102, 102, 102));
        jCheckBox133.setText("No");
        jCheckBox133.setOpaque(false);

        buttonGroup34.add(jCheckBox134);
        jCheckBox134.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        jCheckBox134.setForeground(new java.awt.Color(102, 102, 102));
        jCheckBox134.setText("Si");
        jCheckBox134.setOpaque(false);

        buttonGroup34.add(jCheckBox136);
        jCheckBox136.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        jCheckBox136.setForeground(new java.awt.Color(102, 102, 102));
        jCheckBox136.setText("No");
        jCheckBox136.setOpaque(false);

        buttonGroup35.add(jCheckBox137);
        jCheckBox137.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        jCheckBox137.setForeground(new java.awt.Color(102, 102, 102));
        jCheckBox137.setText("Si");
        jCheckBox137.setOpaque(false);

        buttonGroup35.add(jCheckBox139);
        jCheckBox139.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        jCheckBox139.setForeground(new java.awt.Color(102, 102, 102));
        jCheckBox139.setText("No");
        jCheckBox139.setOpaque(false);

        buttonGroup36.add(jCheckBox140);
        jCheckBox140.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        jCheckBox140.setForeground(new java.awt.Color(102, 102, 102));
        jCheckBox140.setText("Si");
        jCheckBox140.setOpaque(false);

        buttonGroup36.add(jCheckBox142);
        jCheckBox142.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        jCheckBox142.setForeground(new java.awt.Color(102, 102, 102));
        jCheckBox142.setText("No");
        jCheckBox142.setOpaque(false);

        javax.swing.GroupLayout panelEquiposProteccionLayout = new javax.swing.GroupLayout(panelEquiposProteccion);
        panelEquiposProteccion.setLayout(panelEquiposProteccionLayout);
        panelEquiposProteccionLayout.setHorizontalGroup(
            panelEquiposProteccionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelEquiposProteccionLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelEquiposProteccionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelEquiposProteccionLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jCheckBox131)
                        .addGap(18, 18, 18)
                        .addComponent(jCheckBox133)
                        .addGap(73, 73, 73))
                    .addGroup(panelEquiposProteccionLayout.createSequentialGroup()
                        .addGroup(panelEquiposProteccionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelEquiposProteccionLayout.createSequentialGroup()
                                .addComponent(jCheckBox137)
                                .addGap(18, 18, 18)
                                .addComponent(jCheckBox139))
                            .addGroup(panelEquiposProteccionLayout.createSequentialGroup()
                                .addComponent(jCheckBox134)
                                .addGap(18, 18, 18)
                                .addComponent(jCheckBox136))
                            .addGroup(panelEquiposProteccionLayout.createSequentialGroup()
                                .addComponent(jCheckBox140)
                                .addGap(18, 18, 18)
                                .addComponent(jCheckBox142)))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        panelEquiposProteccionLayout.setVerticalGroup(
            panelEquiposProteccionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelEquiposProteccionLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelEquiposProteccionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCheckBox131)
                    .addComponent(jCheckBox133))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelEquiposProteccionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCheckBox134)
                    .addComponent(jCheckBox136))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelEquiposProteccionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCheckBox137)
                    .addComponent(jCheckBox139))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelEquiposProteccionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCheckBox140)
                    .addComponent(jCheckBox142))
                .addContainerGap(33, Short.MAX_VALUE))
        );

        jPanel6.add(panelEquiposProteccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 60, 120, -1));

        jLabel39.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        jLabel39.setForeground(new java.awt.Color(102, 102, 102));
        jLabel39.setText("Se encuentran marcados o codificados para poderlos identificar por su usuario    ");
        jPanel6.add(jLabel39, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 77, -1, -1));

        jLabel40.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        jLabel40.setForeground(new java.awt.Color(102, 102, 102));
        jLabel40.setText("Se guardan en los lugares específicos de uso personalizado (armarios o taquillas) ");
        jPanel6.add(jLabel40, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, -1, -1));

        jLabel41.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        jLabel41.setForeground(new java.awt.Color(102, 102, 102));
        jLabel41.setText("Se encuentran limpios y en buen estado ");
        jPanel6.add(jLabel41, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, -1, -1));

        jLabel42.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        jLabel42.setForeground(new java.awt.Color(102, 102, 102));
        jLabel42.setText("Cuando son desechables, se depositan en los contenedores adecuados ");
        jPanel6.add(jLabel42, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, -1, -1));

        jLabel43.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        jLabel43.setForeground(new java.awt.Color(102, 102, 102));
        jLabel43.setText("Aplica");
        jPanel6.add(jLabel43, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 18, -1, 29));

        jTabbedPane10.addTab("7.Equipos de protección individual ", jPanel6);

        jPanel7.setOpaque(false);
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel40.setOpaque(false);

        buttonGroup37.add(jCheckBox114);
        jCheckBox114.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        jCheckBox114.setForeground(new java.awt.Color(102, 102, 102));
        jCheckBox114.setText("Si");
        jCheckBox114.setOpaque(false);

        buttonGroup37.add(jCheckBox115);
        jCheckBox115.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        jCheckBox115.setForeground(new java.awt.Color(102, 102, 102));
        jCheckBox115.setText("No");
        jCheckBox115.setOpaque(false);

        valid7.setText("Validar");
        valid7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                valid7ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel40Layout = new javax.swing.GroupLayout(jPanel40);
        jPanel40.setLayout(jPanel40Layout);
        jPanel40Layout.setHorizontalGroup(
            jPanel40Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel40Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jCheckBox114)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 1, Short.MAX_VALUE)
                .addComponent(jCheckBox115)
                .addGap(18, 18, 18)
                .addComponent(valid7)
                .addContainerGap())
        );
        jPanel40Layout.setVerticalGroup(
            jPanel40Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel40Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel40Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCheckBox114)
                    .addComponent(jCheckBox115)
                    .addComponent(valid7))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel7.add(jPanel40, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 10, 180, 40));

        panelResiduos.setOpaque(false);

        buttonGroup38.add(jCheckBox116);
        jCheckBox116.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        jCheckBox116.setForeground(new java.awt.Color(102, 102, 102));
        jCheckBox116.setText("Si");
        jCheckBox116.setOpaque(false);

        buttonGroup38.add(jCheckBox118);
        jCheckBox118.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        jCheckBox118.setForeground(new java.awt.Color(102, 102, 102));
        jCheckBox118.setText("No");
        jCheckBox118.setOpaque(false);

        buttonGroup39.add(jCheckBox119);
        jCheckBox119.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        jCheckBox119.setForeground(new java.awt.Color(102, 102, 102));
        jCheckBox119.setText("Si");
        jCheckBox119.setOpaque(false);

        buttonGroup39.add(jCheckBox121);
        jCheckBox121.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        jCheckBox121.setForeground(new java.awt.Color(102, 102, 102));
        jCheckBox121.setText("No");
        jCheckBox121.setOpaque(false);

        buttonGroup40.add(jCheckBox122);
        jCheckBox122.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        jCheckBox122.setForeground(new java.awt.Color(102, 102, 102));
        jCheckBox122.setText("Si");
        jCheckBox122.setOpaque(false);

        buttonGroup40.add(jCheckBox124);
        jCheckBox124.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        jCheckBox124.setForeground(new java.awt.Color(102, 102, 102));
        jCheckBox124.setText("No");
        jCheckBox124.setOpaque(false);

        buttonGroup41.add(jCheckBox125);
        jCheckBox125.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        jCheckBox125.setForeground(new java.awt.Color(102, 102, 102));
        jCheckBox125.setText("Si");
        jCheckBox125.setOpaque(false);

        buttonGroup41.add(jCheckBox127);
        jCheckBox127.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        jCheckBox127.setForeground(new java.awt.Color(102, 102, 102));
        jCheckBox127.setText("No");
        jCheckBox127.setOpaque(false);

        buttonGroup42.add(jCheckBox128);
        jCheckBox128.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        jCheckBox128.setForeground(new java.awt.Color(102, 102, 102));
        jCheckBox128.setText("Si");
        jCheckBox128.setOpaque(false);

        buttonGroup42.add(jCheckBox130);
        jCheckBox130.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        jCheckBox130.setForeground(new java.awt.Color(102, 102, 102));
        jCheckBox130.setText("No");
        jCheckBox130.setOpaque(false);

        buttonGroup43.add(jCheckBox19);
        jCheckBox19.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        jCheckBox19.setForeground(new java.awt.Color(102, 102, 102));
        jCheckBox19.setText("No");
        jCheckBox19.setOpaque(false);

        buttonGroup43.add(jCheckBox17);
        jCheckBox17.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        jCheckBox17.setForeground(new java.awt.Color(102, 102, 102));
        jCheckBox17.setText("Si");
        jCheckBox17.setOpaque(false);

        javax.swing.GroupLayout panelResiduosLayout = new javax.swing.GroupLayout(panelResiduos);
        panelResiduos.setLayout(panelResiduosLayout);
        panelResiduosLayout.setHorizontalGroup(
            panelResiduosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelResiduosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelResiduosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelResiduosLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jCheckBox116)
                        .addGap(18, 18, 18)
                        .addComponent(jCheckBox118)
                        .addGap(73, 73, 73))
                    .addGroup(panelResiduosLayout.createSequentialGroup()
                        .addGroup(panelResiduosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelResiduosLayout.createSequentialGroup()
                                .addComponent(jCheckBox122)
                                .addGap(18, 18, 18)
                                .addComponent(jCheckBox124))
                            .addGroup(panelResiduosLayout.createSequentialGroup()
                                .addComponent(jCheckBox119)
                                .addGap(18, 18, 18)
                                .addComponent(jCheckBox121))
                            .addGroup(panelResiduosLayout.createSequentialGroup()
                                .addComponent(jCheckBox125)
                                .addGap(18, 18, 18)
                                .addComponent(jCheckBox127))
                            .addGroup(panelResiduosLayout.createSequentialGroup()
                                .addComponent(jCheckBox128)
                                .addGap(18, 18, 18)
                                .addComponent(jCheckBox130))
                            .addGroup(panelResiduosLayout.createSequentialGroup()
                                .addComponent(jCheckBox17)
                                .addGap(18, 18, 18)
                                .addComponent(jCheckBox19)))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        panelResiduosLayout.setVerticalGroup(
            panelResiduosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelResiduosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelResiduosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCheckBox116)
                    .addComponent(jCheckBox118))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelResiduosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCheckBox119)
                    .addComponent(jCheckBox121))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelResiduosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCheckBox122)
                    .addComponent(jCheckBox124))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelResiduosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCheckBox125)
                    .addComponent(jCheckBox127))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelResiduosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCheckBox128)
                    .addComponent(jCheckBox130))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelResiduosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCheckBox19)
                    .addComponent(jCheckBox17))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        jPanel7.add(panelResiduos, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 60, 120, -1));

        jLabel44.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        jLabel44.setForeground(new java.awt.Color(102, 102, 102));
        jLabel44.setText("Aplica");
        jPanel7.add(jLabel44, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, 30));

        jLabel45.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        jLabel45.setForeground(new java.awt.Color(102, 102, 102));
        jLabel45.setText("Los contenedores están colocados próximos y accesibles a los lugares de trabajo    ");
        jPanel7.add(jLabel45, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 528, -1));

        jLabel46.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        jLabel46.setForeground(new java.awt.Color(102, 102, 102));
        jLabel46.setText("Están claramente identificados los contenedores de residuos especiales y/o peligrosos");
        jPanel7.add(jLabel46, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, -1, -1));

        jLabel47.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        jLabel47.setForeground(new java.awt.Color(102, 102, 102));
        jLabel47.setText("Los residuos incompatibles se recogen en contenedores separados");
        jPanel7.add(jLabel47, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, -1, -1));

        jLabel48.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        jLabel48.setForeground(new java.awt.Color(102, 102, 102));
        jLabel48.setText("Se evita el rebose de los contenedores");
        jPanel7.add(jLabel48, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, -1, -1));

        jLabel49.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        jLabel49.setForeground(new java.awt.Color(102, 102, 102));
        jLabel49.setText("La zona de alrededor de los contenedores de residuos está limpia ");
        jPanel7.add(jLabel49, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, -1, -1));

        jLabel50.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        jLabel50.setForeground(new java.awt.Color(102, 102, 102));
        jLabel50.setText("Existen los medios de limpieza a disposición del personal del área");
        jPanel7.add(jLabel50, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, -1, -1));

        jTabbedPane10.addTab("8.Residuos", jPanel7);

        eveluar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/vigilar-el-cambio-icono-8152-32.png"))); // NOI18N
        eveluar.setToolTipText("Evaluar");
        eveluar.setContentAreaFilled(false);
        eveluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eveluarActionPerformed(evt);
            }
        });

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/vacio-icono-5458-32.png"))); // NOI18N
        jButton2.setToolTipText("Limpiar");
        jButton2.setContentAreaFilled(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        Guardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/guardar-documento-icono-9312-32.png"))); // NOI18N
        Guardar.setToolTipText("Guardar");
        Guardar.setContentAreaFilled(false);
        Guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GuardarActionPerformed(evt);
            }
        });

        obser.setColumns(20);
        obser.setLineWrap(true);
        obser.setRows(5);
        jScrollPane3.setViewportView(obser);

        regis.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/listaaa.png"))); // NOI18N
        regis.setToolTipText("Registros");
        regis.setContentAreaFilled(false);
        regis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regisActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(Guardar)
                                .addGap(18, 18, 18)
                                .addComponent(jButton2)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(16, 16, 16)
                                .addComponent(eveluar)
                                .addGap(18, 18, 18)
                                .addComponent(regis))
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(area, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(idinsp, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(identifi, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(cs, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(cn, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(ri, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(6, 6, Short.MAX_VALUE)
                .addComponent(jTabbedPane10, javax.swing.GroupLayout.PREFERRED_SIZE, 800, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(65, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(idinsp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13)
                    .addComponent(identifi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(area, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cs, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(cn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(ri, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton2)
                    .addComponent(eveluar)
                    .addComponent(regis, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Guardar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jTabbedPane10, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 393, Short.MAX_VALUE)
        );

        no.setText(" ");

        lista.setToolTipText("");
        lista.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jScrollPane2.setViewportView(lista);

        javax.swing.GroupLayout panelImage1Layout = new javax.swing.GroupLayout(panelImage1);
        panelImage1.setLayout(panelImage1Layout);
        panelImage1Layout.setHorizontalGroup(
            panelImage1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelImage1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelImage1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelImage1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 562, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(456, 456, 456)
                        .addComponent(no, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(si, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelImage1Layout.setVerticalGroup(
            panelImage1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelImage1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelImage1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelImage1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(si, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(panelImage1Layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(panelImage1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelImage1Layout.createSequentialGroup()
                                .addGap(106, 106, 106)
                                .addComponent(no, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panelImage1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap())))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(panelImage1, javax.swing.GroupLayout.PREFERRED_SIZE, 1323, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(panelImage1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:

        limpiarformulario();

    }//GEN-LAST:event_jButton2ActionPerformed

    private void eveluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eveluarActionPerformed
        // TODO add your handling code here:

        validacioncheck();

    }//GEN-LAST:event_eveluarActionPerformed

    public void validacioncheck() {

        int vs = 0, vn = 0, va = 0;
        double r;

        if (panelLocal.isVisible()) {
            if (jCheckBox94.isSelected()) {
                vs = vs + 1;

            } else if (jCheckBox96.isSelected()) {
                vn = vn + 1;
                model.addElement("Las paredes están limpias y en buen estado");
            }

            if (jCheckBox97.isSelected()) {
                vs = vs + 1;
            } else if (jCheckBox99.isSelected()) {
                vn = vn + 1;
                model.addElement("Las ventanas y tragaluces están limpios sin impedir la entrada de luz natural  ");
            }

            if (jCheckBox100.isSelected()) {
                vs = vs + 1;
            } else if (jCheckBox102.isSelected()) {
                vn = vn + 1;
                model.addElement("El sistema de iluminación está mantenido de forma eficiente y limpia ");
            }

            if (jCheckBox103.isSelected()) {
                vs = vs + 1;
            } else if (jCheckBox105.isSelected()) {
                vn = vn + 1;
                model.addElement("Las señales de seguridad están visibles y correctamente distribuidas");
            }

            if (jCheckBox106.isSelected()) {
                vs = vs + 1;
            } else if (jCheckBox108.isSelected()) {
                vn = vn + 1;
                model.addElement("Los extintores están en su lugar de ubicación y visibles ");
            }
        }

        if (panelPiso.isVisible()) {
            if (jCheckBox176.isSelected()) {
                vs = vs + 1;
            } else if (jCheckBox178.isSelected()) {
                vn = vn + 1;
                model.addElement("El piso esta limpio, seco, sin desperdicios ni material innecesario ");
            }

            if (jCheckBox179.isSelected()) {
                vs = vs + 1;
            } else if (jCheckBox181.isSelected()) {
                vn = vn + 1;
                model.addElement("Las vías de circulación de personas y vehículos están diferenciadas y señalizadas ");
            }

            if (jCheckBox182.isSelected()) {
                vs = vs + 1;
            } else if (jCheckBox184.isSelected()) {
                vn = vn + 1;
                model.addElement("Los pasillos y zonas de tránsito están libres de obstáculos ");
            }
        }

        if (panelAlmacenaje.isVisible()) {
            if (jCheckBox161.isSelected()) {
                vs = vs + 1;
            } else if (jCheckBox163.isSelected()) {
                vn = vn + 1;
                model.addElement("Las áreas de almacenamiento y deposición de materiales están señalizadas");
            }

            if (jCheckBox164.isSelected()) {
                vs = vs + 1;
            } else if (jCheckBox166.isSelected()) {
                vn = vn + 1;
                model.addElement("Los materiales y agentes químicos almacenados se encuentran correctamente identificados");
            }

            if (jCheckBox167.isSelected()) {
                vs = vs + 1;
            } else if (jCheckBox169.isSelected()) {
                vn = vn + 1;
                model.addElement("Los materiales están colocados en su sitio, sin invadir zonas de paso");
            }

            if (jCheckBox170.isSelected()) {
                vs = vs + 1;
            } else if (jCheckBox172.isSelected()) {
                vn = vn + 1;
                model.addElement("Los materiales se colocan de manera segura, limpia y ordenada");
            }
        }

        if (panelEquipos.isVisible()) {
            if (jCheckBox191.isSelected()) {
                vs = vs + 1;
            } else if (jCheckBox193.isSelected()) {
                vn = vn + 1;
                model.addElement("Se encuentran limpios y libres en su entorno de todo material innecesario");
            }

            if (jCheckBox194.isSelected()) {
                vs = vs + 1;
            } else if (jCheckBox196.isSelected()) {
                vn = vn + 1;
                model.addElement("Se encuentran libres de filtraciones innecesarias de aceites y grasas");
            }

            if (jCheckBox197.isSelected()) {
                vs = vs + 1;
            } else if (jCheckBox199.isSelected()) {
                vn = vn + 1;
                model.addElement("Poseen las protecciones adecuadas y los dispositivos de seguridad en funcionamiento");
            }
        }

        if (panelMaterial.isVisible()) {
            if (jCheckBox146.isSelected()) {
                vs = vs + 1;
            } else if (jCheckBox148.isSelected()) {
                vn = vn + 1;
                model.addElement("Esta almacenado en los armarios o paneles adecuados");
            }

            if (jCheckBox149.isSelected()) {
                vs = vs + 1;
            } else if (jCheckBox151.isSelected()) {
                vn = vn + 1;
                model.addElement("Se encuentra limpio y sin rastro de productos químicos en el área de almacenamiento ");
            }

            if (jCheckBox152.isSelected()) {
                vs = vs + 1;
            } else if (jCheckBox154.isSelected()) {
                vn = vn + 1;
                model.addElement("Están en condiciones seguras para el trabajo, no defectuosas u oxidadas");
            }
        }

        if (panel1.isVisible()) {
            if (jCheckBox70.isSelected()) {
                vs = vs + 1;
            } else if (jCheckBox72.isSelected()) {
                vn = vn + 1;
                model.addElement("Reactivos y/o productos químicos se encuentran claramente identificados ");
            }

            if (jCheckBox73.isSelected()) {
                vs = vs + 1;
            } else if (jCheckBox77.isSelected()) {
                vn = vn + 1;
                model.addElement("Los reactivos se encuentran en las zonas respectivas y/o adecuadas de almacenamiento");
            }

            if (jCheckBox78.isSelected()) {
                vs = vs + 1;
            } else if (jCheckBox80.isSelected()) {
                vn = vn + 1;
                model.addElement("Los contenedores están colocados próximos y accesibles a los lugares de trabajo    ");
            }

            if (jCheckBox81.isSelected()) {
                vs = vs + 1;
            } else if (jCheckBox83.isSelected()) {
                vn = vn + 1;
                model.addElement("Están las zonas de trabajo y cabinas libres de envases de productos y materiales ");
            }

            if (jCheckBox84.isSelected()) {
                vs = vs + 1;
            } else if (jCheckBox86.isSelected()) {
                vn = vn + 1;
                model.addElement("Se almacenan los productos en armarios o recintos especialmente indicados para ello");
            }

            if (jCheckBox87.isSelected()) {
                vs = vs + 1;
            } else if (jCheckBox89.isSelected()) {
                vn = vn + 1;
                model.addElement("Están las cabinas, mesas o lugares de trabajo limpias de derrames de productos");
            }

            if (jCheckBox90.isSelected()) {
                vs = vs + 1;
            } else if (jCheckBox92.isSelected()) {
                vn = vn + 1;
                model.addElement("Existen materiales absorbentes y/o equipos para el control de posibles derrames ");
            }
        }

        if (panelEquiposProteccion.isVisible()) {
            if (jCheckBox131.isSelected()) {
                vs = vs + 1;
            } else if (jCheckBox133.isSelected()) {
                vn = vn + 1;
                model.addElement("Se encuentran marcados o codificados para poderlos identificar por su usuario    ");
            }

            if (jCheckBox134.isSelected()) {
                vs = vs + 1;
            } else if (jCheckBox136.isSelected()) {
                vn = vn + 1;
                model.addElement("Se guardan en los lugares específicos de uso personalizado (armarios o taquillas) ");
            }

            if (jCheckBox137.isSelected()) {
                vs = vs + 1;
            } else if (jCheckBox139.isSelected()) {
                vn = vn + 1;
                model.addElement("Se encuentran limpios y en buen estado ");
            }

            if (jCheckBox140.isSelected()) {
                vs = vs + 1;
            } else if (jCheckBox142.isSelected()) {
                vn = vn + 1;
                model.addElement("Cuando son desechables, se depositan en los contenedores adecuados ");
            }
        }

        if (panelResiduos.isVisible()) {
            if (jCheckBox116.isSelected()) {
                vs = vs + 1;
            } else if (jCheckBox118.isSelected()) {
                vn = vn + 1;
                model.addElement("Los contenedores están colocados próximos y accesibles a los lugares de trabajo    ");
            }

            if (jCheckBox119.isSelected()) {
                vs = vs + 1;
            } else if (jCheckBox121.isSelected()) {
                vn = vn + 1;
                model.addElement("Están claramente identificados los contenedores de residuos especiales y/o peligrosos");
            }

            if (jCheckBox122.isSelected()) {
                vs = vs + 1;
            } else if (jCheckBox124.isSelected()) {
                vn = vn + 1;
                model.addElement("Los residuos incompatibles se recogen en contenedores separados");
            }

            if (jCheckBox125.isSelected()) {
                vs = vs + 1;
            } else if (jCheckBox127.isSelected()) {
                vn = vn + 1;
                model.addElement("Se evita el rebose de los contenedores");
            }

            if (jCheckBox128.isSelected()) {
                vs = vs + 1;
            } else if (jCheckBox130.isSelected()) {
                vn = vn + 1;
                model.addElement("La zona de alrededor de los contenedores de residuos está limpia ");
            }

            if (jCheckBox17.isSelected()) {
                vs = vs + 1;
            } else if (jCheckBox19.isSelected()) {
                vn = vn + 1;
                model.addElement("Existen los medios de limpieza a disposición del personal del área");
            }
        }

        if (np != 0 && ((np != 35 || vs != 0) || vn != 0)) {
            vs = 2 * vs;
            vn = 2 * vn;
            np = 2 * np;
            if (np == 0) {
                np = 1;
            }
            if (vn == 0) {
                vn = 1;
            }
            if (vs == 0) {
                vs = 1;
            }
            int r2 = np / vn;
            r = vs / r2;
            lista.setModel(model);
            ri.setValue(r);
            cs.setValue(vs);
            cn.setValue(vn);
            Guardar.setEnabled(true);
            np = 35;
        } else {
            JOptionPane.showMessageDialog(rootPane, "El reporte debe cumplir con almenos un parametro");
            limpiarformulario();
        }
    }


    private void validActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_validActionPerformed
        // TODO add your handling code here:
        if (jCheckBox68.isSelected()) {
            panel1.setVisible(true);
        } else if (jCheckBox69.isSelected()) {
            panel1.setVisible(false);
            np = np - 7;
        }

    }//GEN-LAST:event_validActionPerformed

    private void valid3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_valid3ActionPerformed
        // TODO add your handling code here:
        if (jCheckBox74.isSelected()) {
            panelPiso.setVisible(true);
        } else if (jCheckBox75.isSelected()) {
            panelPiso.setVisible(false);
            np = np - 3;
        }
    }//GEN-LAST:event_valid3ActionPerformed

    private void valid4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_valid4ActionPerformed
        // TODO add your handling code here:
        if (jCheckBox93.isSelected()) {
            panelAlmacenaje.setVisible(true);
        } else if (jCheckBox109.isSelected()) {
            panelAlmacenaje.setVisible(false);
            np = np - 4;
        }
    }//GEN-LAST:event_valid4ActionPerformed

    private void valid5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_valid5ActionPerformed
        // TODO add your handling code here:
        if (jCheckBox110.isSelected()) {
            panelEquiposProteccion.setVisible(true);
        } else if (jCheckBox111.isSelected()) {
            panelEquiposProteccion.setVisible(false);
            np = np - 4;
        }
    }//GEN-LAST:event_valid5ActionPerformed

    private void valid6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_valid6ActionPerformed
        // TODO add your handling code here:
        if (jCheckBox112.isSelected()) {
            panelMaterial.setVisible(true);
        } else if (jCheckBox113.isSelected()) {
            panelMaterial.setVisible(false);
            np = np - 3;
        }
    }//GEN-LAST:event_valid6ActionPerformed

    private void valid7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_valid7ActionPerformed
        // TODO add your handling code here:
        if (jCheckBox114.isSelected()) {
            panelResiduos.setVisible(true);
        } else if (jCheckBox115.isSelected()) {
            panelResiduos.setVisible(false);
            np = np - 6;
        }
    }//GEN-LAST:event_valid7ActionPerformed

    private void valid8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_valid8ActionPerformed
        // TODO add your handling code here:
        if (jCheckBox143.isSelected()) {
            panelEquipos.setVisible(true);
        } else if (jCheckBox144.isSelected()) {
            panelEquipos.setVisible(false);
            np = np - 3;
        }
    }//GEN-LAST:event_valid8ActionPerformed

    private void valid9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_valid9ActionPerformed
        // TODO add your handling code here:
        if (jCheckBox145.isSelected()) {
            panelLocal.setVisible(true);
        } else if (jCheckBox200.isSelected()) {
            panelLocal.setVisible(false);
            np = np - 5;
        }
    }//GEN-LAST:event_valid9ActionPerformed

    private void GuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GuardarActionPerformed
        // TODO add your handling code here:     
        controlar.controladoraccion("Guardar", obtnerresultado());
        listainspeccion.llenarTabla();
        limpiarformulario();

    }//GEN-LAST:event_GuardarActionPerformed

    private void areaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_areaFocusGained
        // TODO add your handling code here:
        if (area.getText().equals("Escriba el área")) {
            area.setText("");
        }
    }//GEN-LAST:event_areaFocusGained

    private void areaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_areaFocusLost
        // TODO add your handling code here:
        if (area.getText().equals("")) {
            area.setText("Escriba el área");
        }
    }//GEN-LAST:event_areaFocusLost

    private void regisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regisActionPerformed
        // TODO add your handling code here:
        listaR.setVisible(true);
        listaR.toFront();
        listainspeccion.llenarTabla();
    }//GEN-LAST:event_regisActionPerformed

    private void formInternalFrameIconified(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameIconified
        this.toFront();
    }//GEN-LAST:event_formInternalFrameIconified

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Guardar;
    private javax.swing.JTextField area;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup10;
    private javax.swing.ButtonGroup buttonGroup11;
    private javax.swing.ButtonGroup buttonGroup12;
    private javax.swing.ButtonGroup buttonGroup13;
    private javax.swing.ButtonGroup buttonGroup14;
    private javax.swing.ButtonGroup buttonGroup15;
    private javax.swing.ButtonGroup buttonGroup16;
    private javax.swing.ButtonGroup buttonGroup17;
    private javax.swing.ButtonGroup buttonGroup18;
    private javax.swing.ButtonGroup buttonGroup19;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup20;
    private javax.swing.ButtonGroup buttonGroup21;
    private javax.swing.ButtonGroup buttonGroup22;
    private javax.swing.ButtonGroup buttonGroup23;
    private javax.swing.ButtonGroup buttonGroup24;
    private javax.swing.ButtonGroup buttonGroup25;
    private javax.swing.ButtonGroup buttonGroup26;
    private javax.swing.ButtonGroup buttonGroup27;
    private javax.swing.ButtonGroup buttonGroup28;
    private javax.swing.ButtonGroup buttonGroup29;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.ButtonGroup buttonGroup30;
    private javax.swing.ButtonGroup buttonGroup31;
    private javax.swing.ButtonGroup buttonGroup32;
    private javax.swing.ButtonGroup buttonGroup33;
    private javax.swing.ButtonGroup buttonGroup34;
    private javax.swing.ButtonGroup buttonGroup35;
    private javax.swing.ButtonGroup buttonGroup36;
    private javax.swing.ButtonGroup buttonGroup37;
    private javax.swing.ButtonGroup buttonGroup38;
    private javax.swing.ButtonGroup buttonGroup39;
    private javax.swing.ButtonGroup buttonGroup4;
    private javax.swing.ButtonGroup buttonGroup40;
    private javax.swing.ButtonGroup buttonGroup41;
    private javax.swing.ButtonGroup buttonGroup42;
    private javax.swing.ButtonGroup buttonGroup43;
    private javax.swing.ButtonGroup buttonGroup44;
    private javax.swing.ButtonGroup buttonGroup45;
    private javax.swing.ButtonGroup buttonGroup46;
    private javax.swing.ButtonGroup buttonGroup47;
    private javax.swing.ButtonGroup buttonGroup5;
    private javax.swing.ButtonGroup buttonGroup6;
    private javax.swing.ButtonGroup buttonGroup7;
    private javax.swing.ButtonGroup buttonGroup8;
    private javax.swing.ButtonGroup buttonGroup9;
    private javax.swing.JFormattedTextField cn;
    private javax.swing.JFormattedTextField cs;
    private javax.swing.JButton eveluar;
    private javax.swing.JFormattedTextField identifi;
    private javax.swing.JFormattedTextField idinsp;
    private javax.swing.JButton jButton2;
    private javax.swing.JCheckBox jCheckBox100;
    private javax.swing.JCheckBox jCheckBox102;
    private javax.swing.JCheckBox jCheckBox103;
    private javax.swing.JCheckBox jCheckBox105;
    private javax.swing.JCheckBox jCheckBox106;
    private javax.swing.JCheckBox jCheckBox108;
    private javax.swing.JCheckBox jCheckBox109;
    private javax.swing.JCheckBox jCheckBox110;
    private javax.swing.JCheckBox jCheckBox111;
    private javax.swing.JCheckBox jCheckBox112;
    private javax.swing.JCheckBox jCheckBox113;
    private javax.swing.JCheckBox jCheckBox114;
    private javax.swing.JCheckBox jCheckBox115;
    private javax.swing.JCheckBox jCheckBox116;
    private javax.swing.JCheckBox jCheckBox118;
    private javax.swing.JCheckBox jCheckBox119;
    private javax.swing.JCheckBox jCheckBox121;
    private javax.swing.JCheckBox jCheckBox122;
    private javax.swing.JCheckBox jCheckBox124;
    private javax.swing.JCheckBox jCheckBox125;
    private javax.swing.JCheckBox jCheckBox127;
    private javax.swing.JCheckBox jCheckBox128;
    private javax.swing.JCheckBox jCheckBox130;
    private javax.swing.JCheckBox jCheckBox131;
    private javax.swing.JCheckBox jCheckBox133;
    private javax.swing.JCheckBox jCheckBox134;
    private javax.swing.JCheckBox jCheckBox136;
    private javax.swing.JCheckBox jCheckBox137;
    private javax.swing.JCheckBox jCheckBox139;
    private javax.swing.JCheckBox jCheckBox140;
    private javax.swing.JCheckBox jCheckBox142;
    private javax.swing.JCheckBox jCheckBox143;
    private javax.swing.JCheckBox jCheckBox144;
    private javax.swing.JCheckBox jCheckBox145;
    private javax.swing.JCheckBox jCheckBox146;
    private javax.swing.JCheckBox jCheckBox148;
    private javax.swing.JCheckBox jCheckBox149;
    private javax.swing.JCheckBox jCheckBox151;
    private javax.swing.JCheckBox jCheckBox152;
    private javax.swing.JCheckBox jCheckBox154;
    private javax.swing.JCheckBox jCheckBox161;
    private javax.swing.JCheckBox jCheckBox163;
    private javax.swing.JCheckBox jCheckBox164;
    private javax.swing.JCheckBox jCheckBox166;
    private javax.swing.JCheckBox jCheckBox167;
    private javax.swing.JCheckBox jCheckBox169;
    private javax.swing.JCheckBox jCheckBox17;
    private javax.swing.JCheckBox jCheckBox170;
    private javax.swing.JCheckBox jCheckBox172;
    private javax.swing.JCheckBox jCheckBox176;
    private javax.swing.JCheckBox jCheckBox178;
    private javax.swing.JCheckBox jCheckBox179;
    private javax.swing.JCheckBox jCheckBox181;
    private javax.swing.JCheckBox jCheckBox182;
    private javax.swing.JCheckBox jCheckBox184;
    private javax.swing.JCheckBox jCheckBox19;
    private javax.swing.JCheckBox jCheckBox191;
    private javax.swing.JCheckBox jCheckBox193;
    private javax.swing.JCheckBox jCheckBox194;
    private javax.swing.JCheckBox jCheckBox196;
    private javax.swing.JCheckBox jCheckBox197;
    private javax.swing.JCheckBox jCheckBox199;
    private javax.swing.JCheckBox jCheckBox200;
    private javax.swing.JCheckBox jCheckBox68;
    private javax.swing.JCheckBox jCheckBox69;
    private javax.swing.JCheckBox jCheckBox70;
    private javax.swing.JCheckBox jCheckBox72;
    private javax.swing.JCheckBox jCheckBox73;
    private javax.swing.JCheckBox jCheckBox74;
    private javax.swing.JCheckBox jCheckBox75;
    private javax.swing.JCheckBox jCheckBox77;
    private javax.swing.JCheckBox jCheckBox78;
    private javax.swing.JCheckBox jCheckBox80;
    private javax.swing.JCheckBox jCheckBox81;
    private javax.swing.JCheckBox jCheckBox83;
    private javax.swing.JCheckBox jCheckBox84;
    private javax.swing.JCheckBox jCheckBox86;
    private javax.swing.JCheckBox jCheckBox87;
    private javax.swing.JCheckBox jCheckBox89;
    private javax.swing.JCheckBox jCheckBox90;
    private javax.swing.JCheckBox jCheckBox92;
    private javax.swing.JCheckBox jCheckBox93;
    private javax.swing.JCheckBox jCheckBox94;
    private javax.swing.JCheckBox jCheckBox96;
    private javax.swing.JCheckBox jCheckBox97;
    private javax.swing.JCheckBox jCheckBox99;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel34;
    private javax.swing.JPanel jPanel36;
    private javax.swing.JPanel jPanel37;
    private javax.swing.JPanel jPanel38;
    private javax.swing.JPanel jPanel39;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel40;
    private javax.swing.JPanel jPanel41;
    private javax.swing.JPanel jPanel42;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTabbedPane jTabbedPane10;
    private javax.swing.JList<String> lista;
    private javax.swing.JLabel no;
    private javax.swing.JTextArea obser;
    private javax.swing.JPanel panel1;
    private javax.swing.JPanel panelAlmacenaje;
    private javax.swing.JPanel panelEquipos;
    private javax.swing.JPanel panelEquiposProteccion;
    private org.edisoncor.gui.panel.PanelImage panelImage1;
    private javax.swing.JPanel panelLocal;
    private javax.swing.JPanel panelMaterial;
    private javax.swing.JPanel panelPiso;
    private javax.swing.JPanel panelResiduos;
    private javax.swing.JButton regis;
    private javax.swing.JFormattedTextField ri;
    private javax.swing.JLabel si;
    private javax.swing.JTable tabla;
    private javax.swing.JInternalFrame tablaresul;
    private javax.swing.JButton valid;
    private javax.swing.JButton valid3;
    private javax.swing.JButton valid4;
    private javax.swing.JButton valid5;
    private javax.swing.JButton valid6;
    private javax.swing.JButton valid7;
    private javax.swing.JButton valid8;
    private javax.swing.JButton valid9;
    // End of variables declaration//GEN-END:variables
}
