package vista;

import java.sql.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.*;
import net.sf.jasperreports.engine.*;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author Andrés Felipe Rincón Sánchez
 */
public class CustodiasM extends javax.swing.JInternalFrame {

    String a;
    DefaultTableModel modelo;
    Connection con = conexion.connection;
    SimpleDateFormat formato = new SimpleDateFormat("yyyy/MM/dd");
    String[] titulos = {"N°registro", "Empresal ", "Solicitante", "Cargo", "Nit o CC", "N° muestra", "Codigo Muestra", "Municipio", "Hora recoleccion"};
    String ident = menu.getIdent();

    public CustodiasM() {
        initComponents();
        limpiar();
        actualizar();
        combo();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        grupo = new javax.swing.ButtonGroup();
        panelImage1 = new org.edisoncor.gui.panel.PanelImage();
        jPanel7 = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        direccion = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        solicitante = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        empresa = new javax.swing.JTextField();
        email = new javax.swing.JTextField();
        numregist = new javax.swing.JTextField();
        telefono = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        cargo = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        nitóCC = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        municipio = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();
        preservacion = new javax.swing.JTextField();
        horaRecepcion = new javax.swing.JTextField();
        jLabel29 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        totalMuestra = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        recepfecha = new com.toedter.calendar.JDateChooser();
        jLabel31 = new javax.swing.JLabel();
        mediorecepc = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        cargolabo = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        descripcion = new javax.swing.JTextArea();
        jLabel26 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        obsAdicional = new javax.swing.JTextArea();
        recibio_Muest = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        vereda = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        areaEv = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        puntoMus = new javax.swing.JTextField();
        jLabel27 = new javax.swing.JLabel();
        tipoM = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        volumM = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        analis = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        numMus = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        codMuestr = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        horaRecolec = new javax.swing.JTextField();
        jLabel30 = new javax.swing.JLabel();
        responsable_toma = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        recolefecha = new com.toedter.calendar.JDateChooser();
        jLabel36 = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        observacionMuestra = new javax.swing.JTextArea();
        jPanel8 = new javax.swing.JPanel();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        numreporte = new javax.swing.JTextField();
        jLabel39 = new javax.swing.JLabel();
        numreferencia = new javax.swing.JTextField();
        estadoCuen = new javax.swing.JTextField();
        numcustod = new javax.swing.JTextField();
        jLabel40 = new javax.swing.JLabel();
        medioEn = new javax.swing.JTextField();
        reciboRepor = new javax.swing.JTextField();
        jLabel41 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        entregaFechaaprox = new com.toedter.calendar.JDateChooser();
        reportefecha = new com.toedter.calendar.JDateChooser();
        jLabel42 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        eliminafecha = new com.toedter.calendar.JDateChooser();
        jLabel18 = new javax.swing.JLabel();
        entregafecha = new com.toedter.calendar.JDateChooser();
        jScrollPane6 = new javax.swing.JScrollPane();
        obs = new javax.swing.JTextArea();
        jLabel47 = new javax.swing.JLabel();
        jLabel48 = new javax.swing.JLabel();
        jLabel49 = new javax.swing.JLabel();
        entrega_reporte = new javax.swing.JTextField();
        jLabel50 = new javax.swing.JLabel();
        si = new javax.swing.JRadioButton();
        no = new javax.swing.JRadioButton();
        guardar = new javax.swing.JButton();
        limpiar = new javax.swing.JButton();
        modificar = new javax.swing.JButton();
        buscar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        reporte = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setTitle("MUESTRAS");
        setToolTipText("");
        setVisible(false);
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

        jPanel7.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "FORMULARIO MUESTRAS", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Calibri", 1, 18), new java.awt.Color(102, 102, 102))); // NOI18N
        jPanel7.setOpaque(false);

        jTabbedPane1.setForeground(new java.awt.Color(102, 102, 102));
        jTabbedPane1.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N

        jPanel2.setForeground(new java.awt.Color(102, 102, 102));
        jPanel2.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        jPanel2.setOpaque(false);

        jPanel3.setOpaque(false);

        jLabel6.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(102, 102, 102));
        jLabel6.setText("Cargo");

        jLabel7.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(102, 102, 102));
        jLabel7.setText("Teléfono");

        jLabel8.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(102, 102, 102));
        jLabel8.setText("Correo ");

        jLabel4.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(102, 102, 102));
        jLabel4.setText("Municipio");

        jLabel3.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 102, 102));
        jLabel3.setText("Dirección");

        jLabel2.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 102, 102));
        jLabel2.setText("Solicitante");

        jLabel1.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 102, 102));
        jLabel1.setText("Empresa");

        jLabel21.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(102, 102, 102));
        jLabel21.setText("N° registro");

        jLabel5.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(102, 102, 102));
        jLabel5.setText("Nit ó CC");

        municipio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                municipioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1)
                    .addComponent(jLabel21))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(empresa, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(numregist, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(solicitante, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(46, 46, 46)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(cargo, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(direccion, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(municipio, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(nitóCC, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(email, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(telefono, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(73, 73, 73))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(telefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(nitóCC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(direccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(municipio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cargo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6)
                            .addComponent(solicitante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel21)
                            .addComponent(numregist, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(empresa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(109, Short.MAX_VALUE))
        );

        direccion.getAccessibleContext().setAccessibleName("");
        solicitante.getAccessibleContext().setAccessibleName("");
        empresa.getAccessibleContext().setAccessibleName("");
        email.getAccessibleContext().setAccessibleName("");
        numregist.getAccessibleContext().setAccessibleName("");
        telefono.getAccessibleContext().setAccessibleName("");
        cargo.getAccessibleContext().setAccessibleName("");
        nitóCC.getAccessibleContext().setAccessibleName("");
        municipio.getAccessibleContext().setAccessibleName("");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("DATOS DEL SOLICITANTE", jPanel2);

        jPanel4.setForeground(new java.awt.Color(102, 102, 102));
        jPanel4.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        jPanel4.setOpaque(false);

        jPanel5.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel5.setOpaque(false);

        jLabel20.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(102, 102, 102));
        jLabel20.setText("Preservación");

        preservacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                preservacionActionPerformed(evt);
            }
        });

        jLabel29.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(102, 102, 102));
        jLabel29.setText("Recibió (Nombre de la persona)");

        jLabel24.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(102, 102, 102));
        jLabel24.setText("Hora recepción");

        jLabel22.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(102, 102, 102));
        jLabel22.setText("Total muestra");

        jLabel45.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel45.setForeground(new java.awt.Color(102, 102, 102));
        jLabel45.setText("Fecha recepción");

        jLabel31.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        jLabel31.setForeground(new java.awt.Color(102, 102, 102));
        jLabel31.setText("Medio recepción");

        jLabel23.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(102, 102, 102));
        jLabel23.setText("Cargo");

        jLabel19.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(102, 102, 102));
        jLabel19.setText("Descripciones");

        descripcion.setColumns(20);
        descripcion.setLineWrap(true);
        descripcion.setRows(5);
        jScrollPane1.setViewportView(descripcion);

        jLabel26.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(102, 102, 102));
        jLabel26.setText("Observaciones o adiciones");

        obsAdicional.setColumns(20);
        obsAdicional.setLineWrap(true);
        obsAdicional.setRows(5);
        jScrollPane4.setViewportView(obsAdicional);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel20)
                            .addComponent(jLabel22))
                        .addGap(47, 47, 47)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(totalMuestra, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(preservacion, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel31)
                            .addComponent(jLabel45, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel24)
                            .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(23, 23, 23)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(mediorecepc, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(recepfecha, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(cargolabo, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(horaRecepcion, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel19)
                    .addComponent(jLabel29)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(recibio_Muest, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel26))
                .addContainerGap(16, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel31)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(mediorecepc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel19)
                            .addComponent(jLabel26))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel5Layout.createSequentialGroup()
                                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(recepfecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel45))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel24)
                                            .addGroup(jPanel5Layout.createSequentialGroup()
                                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                    .addComponent(cargolabo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(jLabel23))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(horaRecepcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(totalMuestra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(preservacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(recibio_Muest, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel20)))
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(45, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("RECEPCIÓN EN LABORATORIO", jPanel4);

        jPanel1.setForeground(new java.awt.Color(102, 102, 102));
        jPanel1.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        jPanel1.setOpaque(false);

        jLabel11.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(102, 102, 102));
        jLabel11.setText("Vereda");

        jLabel9.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(102, 102, 102));
        jLabel9.setText("Área evaluada");

        jLabel13.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(102, 102, 102));
        jLabel13.setText("Punto muestreo");

        puntoMus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                puntoMusActionPerformed(evt);
            }
        });

        jLabel27.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(102, 102, 102));
        jLabel27.setText("Tipo muestra");

        jLabel17.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(102, 102, 102));
        jLabel17.setText("Volumen muestra");

        jLabel16.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(102, 102, 102));
        jLabel16.setText("Análisis solicitado ");

        jLabel10.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(102, 102, 102));
        jLabel10.setText("N° muestras");

        jLabel12.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(102, 102, 102));
        jLabel12.setText("Código muestra");

        jLabel15.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(102, 102, 102));
        jLabel15.setText("Hora recolección");

        jLabel30.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(102, 102, 102));
        jLabel30.setText("Responsable de la");

        jLabel14.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(102, 102, 102));
        jLabel14.setText("Fecha recolección");

        jLabel36.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        jLabel36.setForeground(new java.awt.Color(102, 102, 102));
        jLabel36.setText("toma");

        jLabel46.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        jLabel46.setForeground(new java.awt.Color(102, 102, 102));
        jLabel46.setText("Observación muestra:");

        observacionMuestra.setColumns(20);
        observacionMuestra.setLineWrap(true);
        observacionMuestra.setRows(5);
        jScrollPane5.setViewportView(observacionMuestra);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel13)
                                .addGap(34, 34, 34)
                                .addComponent(puntoMus, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel9)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGap(43, 43, 43)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(numMus, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(vereda, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(areaEv, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel12)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(codMuestr, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel15)
                                    .addComponent(jLabel14)
                                    .addComponent(jLabel27))
                                .addGap(25, 25, 25)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(horaRecolec, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tipoM, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(recolefecha, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel17)
                                    .addComponent(jLabel16))
                                .addGap(25, 25, 25)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(analis, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(volumM, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel30)
                            .addComponent(jLabel36))
                        .addGap(22, 22, 22)
                        .addComponent(responsable_toma, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel46, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 21, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(areaEv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel9)
                                .addComponent(jLabel14))
                            .addComponent(recolefecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel46)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(vereda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11)
                            .addComponent(jLabel15)
                            .addComponent(horaRecolec, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(numMus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel27)
                            .addComponent(tipoM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(13, 13, 13)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(codMuestr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel17)
                                .addComponent(volumM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel12))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(puntoMus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel13)
                                .addComponent(jLabel16)
                                .addComponent(analis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel30)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel36))
                            .addComponent(responsable_toma, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(48, 48, 48))
        );

        vereda.getAccessibleContext().setAccessibleName("");
        areaEv.getAccessibleContext().setAccessibleName("");
        puntoMus.getAccessibleContext().setAccessibleName("");
        tipoM.getAccessibleContext().setAccessibleName("");
        volumM.getAccessibleContext().setAccessibleName("");
        analis.getAccessibleContext().setAccessibleName("");
        numMus.getAccessibleContext().setAccessibleName("");
        codMuestr.getAccessibleContext().setAccessibleName("");
        horaRecolec.getAccessibleContext().setAccessibleName("");
        recolefecha.getAccessibleContext().setAccessibleName("");

        jTabbedPane1.addTab("INFORMACIÓN DE LAS MUESTRAS", jPanel1);

        jPanel8.setForeground(new java.awt.Color(102, 102, 102));
        jPanel8.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        jPanel8.setOpaque(false);

        jLabel34.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel34.setForeground(new java.awt.Color(102, 102, 102));
        jLabel34.setText("Número custodia");

        jLabel35.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel35.setForeground(new java.awt.Color(102, 102, 102));
        jLabel35.setText(" Medio entrega");

        jLabel38.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel38.setForeground(new java.awt.Color(102, 102, 102));
        jLabel38.setText("Número Reporte");

        numreporte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numreporteActionPerformed(evt);
            }
        });

        jLabel39.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel39.setForeground(new java.awt.Color(102, 102, 102));
        jLabel39.setText("Estado cuenta");

        numcustod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numcustodActionPerformed(evt);
            }
        });

        jLabel40.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel40.setForeground(new java.awt.Color(102, 102, 102));
        jLabel40.setText("Recibío reporte");

        medioEn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                medioEnActionPerformed(evt);
            }
        });

        jLabel41.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel41.setForeground(new java.awt.Color(102, 102, 102));
        jLabel41.setText("Número referencia");

        jLabel43.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel43.setForeground(new java.awt.Color(102, 102, 102));
        jLabel43.setText(" Fecha entrega");

        jLabel42.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel42.setForeground(new java.awt.Color(102, 102, 102));
        jLabel42.setText("Fecha del reporte");
        jLabel42.setToolTipText("");

        jLabel44.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel44.setForeground(new java.awt.Color(102, 102, 102));
        jLabel44.setText("Fecha eliminación");

        jLabel18.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(102, 102, 102));
        jLabel18.setText("Fecha de entrega");

        obs.setColumns(20);
        obs.setLineWrap(true);
        obs.setRows(5);
        jScrollPane6.setViewportView(obs);

        jLabel47.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        jLabel47.setForeground(new java.awt.Color(102, 102, 102));
        jLabel47.setText("Observaciones");

        jLabel48.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel48.setForeground(new java.awt.Color(102, 102, 102));
        jLabel48.setText("aproximada");

        jLabel49.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel49.setForeground(new java.awt.Color(102, 102, 102));
        jLabel49.setText("Entrega reporte");

        jLabel50.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel50.setForeground(new java.awt.Color(102, 102, 102));
        jLabel50.setText("Entregado");

        grupo.add(si);
        si.setText("Si");
        si.setActionCommand("");
        si.setOpaque(false);

        grupo.add(no);
        no.setText("No");
        no.setActionCommand("");
        no.setOpaque(false);

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(numcustod, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addComponent(jLabel41)
                                .addGap(8, 8, 8)
                                .addComponent(numreferencia, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel35)
                            .addComponent(jLabel38, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel34)
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel42)
                                    .addComponent(jLabel39))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(reportefecha, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
                                    .addComponent(estadoCuen)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel43, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel48, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                                .addComponent(entregaFechaaprox, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel44)
                            .addComponent(jLabel40, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel49, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel18))))
                .addGap(18, 18, 18)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(entregafecha, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(numreporte, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(reciboRepor, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(medioEn, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(eliminafecha, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(entrega_reporte, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane6, javax.swing.GroupLayout.DEFAULT_SIZE, 357, Short.MAX_VALUE)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel47, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addComponent(jLabel50, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(si)
                                .addGap(18, 18, 18)
                                .addComponent(no)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel8Layout.createSequentialGroup()
                        .addComponent(jLabel47)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel8Layout.createSequentialGroup()
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel35, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(numcustod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel34))
                            .addComponent(medioEn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel38, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(numreporte, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel41)
                                .addComponent(numreferencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(reportefecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel42))
                                    .addComponent(reciboRepor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(eliminafecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(estadoCuen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel39)
                                        .addComponent(jLabel44)))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel8Layout.createSequentialGroup()
                                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(entregafecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel18))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(entrega_reporte, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel50)
                                            .addComponent(si)
                                            .addComponent(no)
                                            .addComponent(jLabel49)))
                                    .addGroup(jPanel8Layout.createSequentialGroup()
                                        .addComponent(jLabel43, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, 0)
                                        .addComponent(jLabel48, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(entregaFechaaprox, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jLabel40))))
                .addContainerGap(44, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("CUSTODIA MUESTRA", jPanel8);

        guardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/editar-archivo-de-salvar-en-disco-icono-4876-32.png"))); // NOI18N
        guardar.setToolTipText("GUARDAR");
        guardar.setContentAreaFilled(false);
        guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardarActionPerformed(evt);
            }
        });

        limpiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/eliminar-cancelar-icono-4935-16.png"))); // NOI18N
        limpiar.setToolTipText("CANCELAR");
        limpiar.setContentAreaFilled(false);
        limpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                limpiarActionPerformed(evt);
            }
        });

        modificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/editar-usuario-icono-9786-32.png"))); // NOI18N
        modificar.setToolTipText("MODIFICAR");
        modificar.setContentAreaFilled(false);
        modificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modificarmodificarActionPerformed(evt);
            }
        });

        buscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/zoom-icono-9136-32.png"))); // NOI18N
        buscar.setToolTipText("BUSCAR");
        buscar.setContentAreaFilled(false);
        buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarActionPerformed(evt);
            }
        });

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(table);

        reporte.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/portapapeles-icono-9080-32.png"))); // NOI18N
        reporte.setToolTipText("GENERAR REPORTE");
        reporte.setContentAreaFilled(false);
        reporte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reporteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 936, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(limpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(guardar, javax.swing.GroupLayout.Alignment.TRAILING))
                            .addComponent(buscar)
                            .addComponent(modificar, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(reporte))
                        .addGap(21, 21, 21))))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(guardar)
                        .addGap(18, 18, 18)
                        .addComponent(buscar)
                        .addGap(18, 18, 18)
                        .addComponent(modificar)
                        .addGap(18, 18, 18)
                        .addComponent(limpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(reporte, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(31, 31, 31)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout panelImage1Layout = new javax.swing.GroupLayout(panelImage1);
        panelImage1.setLayout(panelImage1Layout);
        panelImage1Layout.setHorizontalGroup(
            panelImage1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelImage1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        panelImage1Layout.setVerticalGroup(
            panelImage1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelImage1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelImage1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelImage1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void modificarmodificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modificarmodificarActionPerformed
        if (this.numregist.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Ingrese El Número De registro");
        } else {
            try {
                String numregistro = this.numregist.getText();
                String empresa = this.empresa.getText();
                String solicitante = this.solicitante.getText();
                String direccion = this.direccion.getText();
                String municipio = this.municipio.getText();
                String cargo = this.cargo.getText();
                String telefono = this.telefono.getText();
                String email = this.email.getText();
                String nitcc = this.nitóCC.getText();

                String medio_recep = this.mediorecepc.getText();
                String fecha_recep = formato.format(this.recepfecha.getDate());
                String cargo_lab = this.cargolabo.getText();
                String hora_recep = this.horaRecepcion.getText();
                String total_muestra = this.totalMuestra.getText();
                String preservacion = this.preservacion.getText();
                String descrip = this.descripcion.getText();
                String recibio_muestra = this.recibio_Muest.getText();
                String obs_adicionales = this.obsAdicional.getText();

                String area_evaluada = this.areaEv.getText();
                String vereda = this.vereda.getText();
                String num_muestra = this.numMus.getText();
                String codigo_muestra = this.codMuestr.getText();
                String punto_muest = this.puntoMus.getText();
                String repons_toma = this.responsable_toma.getText();
                String fecha_recolec = formato.format(this.recolefecha.getDate());
                String hora_recolec = this.horaRecolec.getText();
                String tipo_muestra = this.tipoM.getText();
                String volumen_muestra = this.volumM.getText();
                String analisis = this.analis.getText();
                String obsMuestra = this.observacionMuestra.getText();

                String num_custodia = this.numcustod.getText();
                String num_referencia = this.numreferencia.getText();
                String fecha_reporte = formato.format(this.reportefecha.getDate());
                String fecha_entrega_aprox = formato.format(this.entregaFechaaprox.getDate());
                String medio_entrega_repor = this.medioEn.getText();
                String num_reporte = this.numreporte.getText();
                String recib_report = this.reciboRepor.getText();
                String fecha_entrega = formato.format(this.entregafecha.getDate());
                String obs = this.obs.getText();
                if (si.isSelected()) {
                    a = "Si";
                } else if (no.isSelected()) {
                    a = "No";
                } else {
                    a = "No";
                }
                String entregado = a;
                String fecha_eliminacion = formato.format(this.eliminafecha.getDate());
                String estado_cuenta = this.estadoCuen.getText();
                String entrega_repor = this.entrega_reporte.getText();
                String ident = this.ident;
                muestra_C cons = new muestra_C(numregistro, empresa, solicitante, direccion, municipio, cargo, telefono, email, nitcc, medio_recep, fecha_recep, cargo_lab, hora_recep, total_muestra, preservacion, descrip, recibio_muestra, obs_adicionales, area_evaluada, vereda, num_muestra, codigo_muestra, punto_muest, repons_toma, fecha_recolec, hora_recolec, tipo_muestra, volumen_muestra, analisis, obsMuestra, num_custodia, num_referencia, fecha_reporte, fecha_entrega_aprox, medio_entrega_repor, num_reporte, recib_report, fecha_entrega, obs, entregado, fecha_eliminacion, estado_cuenta, entrega_repor, ident);
                muestra_DAO dao = new muestra_DAO();
                dao.modificar(cons);

                limpiar();
                combo();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Error Al Modificar Registro");
                System.out.println(e);
            }
        }
        actualizar();
    }//GEN-LAST:event_modificarmodificarActionPerformed

    private void guardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardarActionPerformed
        if (this.numregist.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Ingrese El Número De Registro");
        } else if (this.numreporte.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Ingrese El Número De Reporte");
        } else {
            try {
                String registro = numregist.getText();
                String sql = "select * from custodia_muestra where numregistro ='" + registro + "' ";
                Statement ts = con.createStatement();
                ResultSet rs = ts.executeQuery(sql);
                if (rs.next()) {
                    JOptionPane.showMessageDialog(null, "Este Registro Ya Existe");
                } else {
                    try {
                        String numregistro = this.numregist.getText();
                        String empresa = this.empresa.getText();
                        String solicitante = this.solicitante.getText();
                        String direccion = this.direccion.getText();
                        String municipio = this.municipio.getText();
                        String cargo = this.cargo.getText();
                        String telefono = this.telefono.getText();
                        String email = this.email.getText();
                        String nitcc = this.nitóCC.getText();

                        String medio_recep = this.mediorecepc.getText();
                        String fecha_recep = formato.format(this.recepfecha.getDate());
                        String cargo_lab = this.cargolabo.getText();
                        String hora_recep = this.horaRecepcion.getText();
                        String total_muestra = this.totalMuestra.getText();
                        String preservacion = this.preservacion.getText();
                        String descrip = this.descripcion.getText();
                        String recibio_muestra = this.recibio_Muest.getText();
                        String obs_adicionales = this.obsAdicional.getText();

                        String area_evaluada = this.areaEv.getText();
                        String vereda = this.vereda.getText();
                        String num_muestra = this.numMus.getText();
                        String codigo_muestra = this.codMuestr.getText();
                        String punto_muest = this.puntoMus.getText();
                        String repons_toma = this.responsable_toma.getText();
                        String fecha_recolec = formato.format(this.recolefecha.getDate());
                        String hora_recolec = this.horaRecolec.getText();
                        String tipo_muestra = this.tipoM.getText();
                        String volumen_muestra = this.volumM.getText();
                        String analisis = this.analis.getText();
                        String obsMuestra = this.observacionMuestra.getText();

                        String num_custodia = this.numcustod.getText();
                        String num_referencia = this.numreferencia.getText();
                        String fecha_reporte = formato.format(this.reportefecha.getDate());
                        String fecha_entrega_aprox = formato.format(this.entregaFechaaprox.getDate());
                        String medio_entrega_repor = this.medioEn.getText();
                        String num_reporte = this.numreporte.getText();
                        String recib_report = this.reciboRepor.getText();
                        String fecha_entrega = formato.format(this.entregafecha.getDate());
                        String obs = this.obs.getText();

                        if (si.isSelected()) {
                            a = "Si";
                        } else if (no.isSelected()) {
                            a = "No";
                        } else {
                            a = "No";
                        }
                        String entregado = a;
                        String fecha_eliminacion = formato.format(this.eliminafecha.getDate());
                        String estado_cuenta = this.estadoCuen.getText();
                        String entrega_repor = this.entrega_reporte.getText();

                        String ident = this.ident;
                        muestra_C cons = new muestra_C(numregistro, empresa, solicitante, direccion, municipio, cargo, telefono, email, nitcc, medio_recep, fecha_recep, cargo_lab, hora_recep, total_muestra, preservacion, descrip, recibio_muestra, obs_adicionales, area_evaluada, vereda, num_muestra, codigo_muestra, punto_muest, repons_toma, fecha_recolec, hora_recolec, tipo_muestra, volumen_muestra, analisis, obsMuestra, num_custodia, num_referencia, fecha_reporte, fecha_entrega_aprox, medio_entrega_repor, num_reporte, recib_report, fecha_entrega, obs, entregado, fecha_eliminacion, estado_cuenta, entrega_repor, ident);
                        muestra_DAO dao = new muestra_DAO();
                        dao.insertar(cons);

                        limpiar();
                        combo();

                    } catch (Exception e) {
                        JOptionPane.showMessageDialog(null, "Error al Guardar Registro");
                        System.out.println(e);
                    }
                }
            } catch (Exception e) {
                System.out.println(e);
            }
        }

        actualizar();
    }//GEN-LAST:event_guardarActionPerformed

    private void limpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limpiarActionPerformed
        limpiar();
    }//GEN-LAST:event_limpiarActionPerformed

    private void buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarActionPerformed
        buscar();
    }//GEN-LAST:event_buscarActionPerformed

    private void medioEnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_medioEnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_medioEnActionPerformed

    private void numcustodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numcustodActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_numcustodActionPerformed

    private void numreporteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numreporteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_numreporteActionPerformed

    private void puntoMusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_puntoMusActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_puntoMusActionPerformed

    private void preservacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_preservacionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_preservacionActionPerformed

    private void municipioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_municipioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_municipioActionPerformed

    private void reporteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reporteActionPerformed
        if (numregist.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Debe Ingresar el Número de Reporte");
        } else {
            JasperReport jrReporte = null;
            try {
                String ruta = "reportes/MuestraReport.jasper";
                jrReporte = (JasperReport) JRLoader.loadObject(getClass().getClassLoader().getResource(ruta));
                Map params = new HashMap();
                params.put("parameter1", numregist.getText());
                params.put("parameter2", System.getProperty("user.dir"));
                JasperPrint jpReporte = JasperFillManager.fillReport(jrReporte, params, con);
                JasperViewer Viewer = new JasperViewer(jpReporte, false);
                Viewer.setTitle("Custodia De Muestras");
                Viewer.setVisible(true);
            } catch (JRException e) {
                System.err.println("Error en el reporte" + e);
            }
        }
    }//GEN-LAST:event_reporteActionPerformed

    private void tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableMouseClicked
        int select = table.rowAtPoint(evt.getPoint());
        numregist.setText(String.valueOf(table.getValueAt(select, 0)));
        buscar();
    }//GEN-LAST:event_tableMouseClicked

    private void formInternalFrameIconified(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameIconified
        this.toFront();
    }//GEN-LAST:event_formInternalFrameIconified


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField analis;
    private javax.swing.JTextField areaEv;
    private javax.swing.JButton buscar;
    private javax.swing.JTextField cargo;
    private javax.swing.JTextField cargolabo;
    private javax.swing.JTextField codMuestr;
    private javax.swing.JTextArea descripcion;
    private javax.swing.JTextField direccion;
    private com.toedter.calendar.JDateChooser eliminafecha;
    private javax.swing.JTextField email;
    private javax.swing.JTextField empresa;
    private com.toedter.calendar.JDateChooser entregaFechaaprox;
    private javax.swing.JTextField entrega_reporte;
    private com.toedter.calendar.JDateChooser entregafecha;
    private javax.swing.JTextField estadoCuen;
    private javax.swing.ButtonGroup grupo;
    private javax.swing.JButton guardar;
    private javax.swing.JTextField horaRecepcion;
    private javax.swing.JTextField horaRecolec;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
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
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JButton limpiar;
    private javax.swing.JTextField medioEn;
    private javax.swing.JTextField mediorecepc;
    private javax.swing.JButton modificar;
    private javax.swing.JTextField municipio;
    private javax.swing.JTextField nitóCC;
    private javax.swing.JRadioButton no;
    private javax.swing.JTextField numMus;
    private javax.swing.JTextField numcustod;
    private javax.swing.JTextField numreferencia;
    private javax.swing.JTextField numregist;
    private javax.swing.JTextField numreporte;
    private javax.swing.JTextArea obs;
    private javax.swing.JTextArea obsAdicional;
    private javax.swing.JTextArea observacionMuestra;
    private org.edisoncor.gui.panel.PanelImage panelImage1;
    private javax.swing.JTextField preservacion;
    private javax.swing.JTextField puntoMus;
    private com.toedter.calendar.JDateChooser recepfecha;
    private javax.swing.JTextField recibio_Muest;
    private javax.swing.JTextField reciboRepor;
    private com.toedter.calendar.JDateChooser recolefecha;
    private javax.swing.JButton reporte;
    private com.toedter.calendar.JDateChooser reportefecha;
    private javax.swing.JTextField responsable_toma;
    private javax.swing.JRadioButton si;
    private javax.swing.JTextField solicitante;
    private javax.swing.JTable table;
    private javax.swing.JTextField telefono;
    private javax.swing.JTextField tipoM;
    private javax.swing.JTextField totalMuestra;
    private javax.swing.JTextField vereda;
    private javax.swing.JTextField volumM;
    // End of variables declaration//GEN-END:variables

    public void limpiar() {
        String rols = menu.getRol();
        if (rols.equals("Director técnico")) {
            guardar.setEnabled(false);
            modificar.setEnabled(false);
        } else if (rols.equals("Líder de calidad")) {
            guardar.setEnabled(true);
            modificar.setEnabled(true);
        } else if (rols.equals("Analista")) {
            guardar.setEnabled(false);
            modificar.setEnabled(false);
        } else {
            guardar.setEnabled(false);
            modificar.setEnabled(false);
        }
        ident = menu.getIdent();
        combo();
        grupo.clearSelection();
        numregist.enable(true);
        numreporte.enable(true);
        numregist.setText("");
        empresa.setText("");
        nitóCC.setText("");
        solicitante.setText("");
        cargo.setText("");
        direccion.setText("");
        telefono.setText("");
        municipio.setText("");
        email.setText("");
        areaEv.setText("");
        vereda.setText("");
        codMuestr.setText("");
        puntoMus.setText("");
        horaRecolec.setText("");
        tipoM.setText("");
        volumM.setText("");
        analis.setText("");
        observacionMuestra.setText("");
        responsable_toma.setText("");
        mediorecepc.setText("");
        horaRecepcion.setText("");
        numMus.setText("");
        preservacion.setText("");
        descripcion.setText("");
        obsAdicional.setText("");
        totalMuestra.setText("");
        numcustod.setText("");
        numreferencia.setText("");
        medioEn.setText("");
        estadoCuen.setText("");
        obs.setText("");
        reciboRepor.setText("");
        numreporte.setText("");
        cargolabo.setText("");
        recibio_Muest.setText("");
        entrega_reporte.setText("");
        
    }

    public void actualizar() {
        modelo = new DefaultTableModel(null, titulos);
        Object datos[] = new Object[9];
        try {
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("select * from custodia_muestra");
            while (rs.next()) {
                datos[0] = rs.getString("numregistro");
                datos[1] = rs.getString("empresa");
                datos[2] = rs.getString("solicitante");
                datos[3] = rs.getString("cargo");
                datos[4] = rs.getString("nitcc");
                datos[5] = rs.getString("num_muestra");
                datos[6] = rs.getString("codigo_muestra");
                datos[7] = rs.getString("municipio");
                datos[8] = rs.getString("hora_recolec");

                modelo.addRow(datos);
            }
            table.setModel(modelo);
        } catch (SQLException e) {
            System.out.println(e);
        }
    }

    public void combo() {
        Date hoy = new Date();
        this.recolefecha.setDate(hoy);
        this.recepfecha.setDate(hoy);
        this.entregaFechaaprox.setDate(hoy);
        this.reportefecha.setDate(hoy);
        this.eliminafecha.setDate(hoy);
        this.entregafecha.setDate(hoy);

    }

    public void buscar() {
        numregist.enable(false);
        numreporte.enable(false);
        guardar.setEnabled(false);
        try {
            String numregistro = this.numregist.getText();
            String empresa = this.empresa.getText();
            String solicitante = this.solicitante.getText();
            String direccion = this.direccion.getText();
            String municipio = this.municipio.getText();
            String cargo = this.cargo.getText();
            String telefono = this.telefono.getText();
            String email = this.email.getText();
            String nitcc = this.nitóCC.getText();

            String medio_recep = this.mediorecepc.getText();
            String fecha_recep = formato.format(this.recepfecha.getDate());
            String cargo_lab = this.cargolabo.getText();
            String hora_recep = this.horaRecepcion.getText();
            String total_muestra = this.totalMuestra.getText();
            String preservacion = this.preservacion.getText();
            String descrip = this.descripcion.getText();
            String recibio_muestra = this.recibio_Muest.getText();
            String obs_adicionales = this.obsAdicional.getText();

            String area_evaluada = this.areaEv.getText();
            String vereda = this.vereda.getText();
            String num_muestra = this.numMus.getText();
            String codigo_muestra = this.codMuestr.getText();
            String punto_muest = this.puntoMus.getText();
            String repons_toma = this.responsable_toma.getText();
            String fecha_recolec = formato.format(this.recolefecha.getDate());
            String hora_recolec = this.horaRecolec.getText();
            String tipo_muestra = this.tipoM.getText();
            String volumen_muestra = this.volumM.getText();
            String analisis = this.analis.getText();
            String obsMuestra = this.observacionMuestra.getText();

            String num_custodia = this.numcustod.getText();
            String num_referencia = this.numreferencia.getText();
            String fecha_reporte = formato.format(this.reportefecha.getDate());
            String fecha_entrega_aprox = formato.format(this.entregaFechaaprox.getDate());
            String medio_entrega_repor = this.medioEn.getText();
            String num_reporte = this.numreporte.getText();
            String recib_report = this.reciboRepor.getText();
            String fecha_entrega = formato.format(this.entregafecha.getDate());
            String obs = this.obs.getText();
            if (si.isSelected()) {
                a = "Si";
            } else if (no.isSelected()) {
                a = "No";
            } else {
                a = "No";
            }
            String entregado = a;
            String fecha_eliminacion = formato.format(this.eliminafecha.getDate());
            String estado_cuenta = this.estadoCuen.getText();
            String entrega_repor = this.entrega_reporte.getText();
            String ident = this.ident;
            muestra_C cons = new muestra_C(numregistro, empresa, solicitante, direccion, municipio, cargo, telefono, email, nitcc, medio_recep, fecha_recep, cargo_lab, hora_recep, total_muestra, preservacion, descrip, recibio_muestra, obs_adicionales, area_evaluada, vereda, num_muestra, codigo_muestra, punto_muest, repons_toma, fecha_recolec, hora_recolec, tipo_muestra, volumen_muestra, analisis, obsMuestra, num_custodia, num_referencia, fecha_reporte, fecha_entrega_aprox, medio_entrega_repor, num_reporte, recib_report, fecha_entrega, obs, entregado, fecha_eliminacion, estado_cuenta, entrega_repor, ident);
            muestra_DAO dao = new muestra_DAO();
            dao.buscar(cons);

            this.numregist.setText(cons.getNumregistro());
            this.empresa.setText(cons.getEmpresa());
            this.nitóCC.setText(cons.getNitcc());
            this.solicitante.setText(cons.getSolicitante());
            this.cargo.setText(cons.getCargo());
            this.direccion.setText(cons.getDireccion());
            this.telefono.setText(cons.getTelefono());
            this.municipio.setText(cons.getMunicipio());
            this.email.setText(cons.getEmail());
            this.areaEv.setText(cons.getArea_evaluada());
            this.vereda.setText(cons.getVereda());
            this.codMuestr.setText(cons.getCodigo_muestra());
            this.puntoMus.setText(cons.getPunto_muest());
            this.horaRecolec.setText(cons.getHora_recolec());
            this.tipoM.setText(cons.getTipo_muestra());
            this.volumM.setText(cons.getVolumen_muestra());
            this.analis.setText(cons.getAnalisis());
            this.observacionMuestra.setText(cons.getObsMuestra());
            this.responsable_toma.setText(cons.getRepons_toma());
            this.mediorecepc.setText(cons.getMedio_recep());
            this.horaRecepcion.setText(cons.getHora_recep());
            this.numMus.setText(cons.getNum_muestra());
            this.preservacion.setText(cons.getPreservacion());
            this.descripcion.setText(cons.getDescrip());
            this.obsAdicional.setText(cons.getObs_adicionales());
            this.totalMuestra.setText(cons.getTotal_muestra());
            this.numcustod.setText(cons.getNum_custodia());
            this.numreferencia.setText(cons.getNum_referencia());
            this.medioEn.setText(cons.getMedio_entrega_repor());
            this.estadoCuen.setText(cons.getEstado_cuenta());
            this.obs.setText(cons.getObs());
            this.reciboRepor.setText(cons.getRecib_report());
            this.numreporte.setText(cons.getNum_reporte());
            this.cargolabo.setText(cons.getCargo_lab());
            this.recibio_Muest.setText(cons.getRecibio_muestra());
            this.entrega_reporte.setText(cons.getEntrega_repor());
            this.a = cons.getEntregado();

            try {
                this.recolefecha.setDate(formato.parse(cons.getFecha_recolec()));
                this.recepfecha.setDate(formato.parse(cons.getFecha_recep()));
                this.entregaFechaaprox.setDate(formato.parse(cons.getFecha_entrega_aprox()));
                this.reportefecha.setDate(formato.parse(cons.getFecha_reporte()));
                this.eliminafecha.setDate(formato.parse(cons.getFecha_eliminacion()));
                this.entregafecha.setDate(formato.parse(cons.getFecha_entrega()));

            } catch (Exception ex) {
                System.out.println("Error Fecha");
                System.out.println(ex);
            }

            if (a.equals("Si")) {
                si.setSelected(true);
            } else if (a.equals("No")) {
                no.setSelected(true);
            }
        } catch (Exception e) {
            System.out.println("Error de busqueda");
            System.out.println(e);
        }
    }

}
