package vista;

import controlador.ControladorEquipos;
import java.awt.Image;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.Equipos;
import modelo.conexion;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author Kevin Fajardo Casas
 */
public class MenuEquipos extends javax.swing.JInternalFrame {

    DefaultTableModel modelo = new DefaultTableModel();
    DefaultTableModel modelo2 = new DefaultTableModel();
    SimpleDateFormat fecha = new SimpleDateFormat("dd-MM-yyyy");
    FileInputStream fis;
    int longitudBytes;
    ControladorEquipos equipoController = new ControladorEquipos();
    int fila1;
    InputStream is;
    String ident = menu.getIdent();

    public MenuEquipos() {
        initComponents();
        fechainin.setText("<html><p>Fecha de inicio</p><p>de operacion</p></html>");
        freman.setText("<html><p>Fr. Recomendada</p><p>Mantenimiento P:</p></html>");
        verirecomen.setText("<html><p>Fr. Recomendada</p><p>Verificación</p></html>");
        calirecomen.setText("<html><p>Fr. Recomendada</p><p>Calibración:</p></html>");
        TXTNu.setValue(0);
        TXTNu.setVisible(false);
        limpiarFormulario();
        TXTFechacompra.setDateFormatString("dd-MM-yyyy");
        TXTFechainicion.setDateFormatString("dd-MM-yyyy");
        modelo.addColumn("Tipo Documento");
        modelo.addColumn("Idioma");
        jTable1.setModel(modelo);

        BTNEliminar.setEnabled(false);
        BTNingresarnuuevod.setVisible(false);
        jDialog1.setLocationRelativeTo(null);

        modelo2.addColumn("Tipo Documento");
        modelo2.addColumn("Idioma");
        jTable2.setModel(modelo2);

    }

    private void limpiarFormulario() {
        String rols = menu.getRol();
        if (rols.equals("Director técnico")) {
            BTNInsertar.setEnabled(false);
            BTNModificar.setEnabled(false);
        } else if (rols.equals("Líder de calidad")) {
            BTNInsertar.setEnabled(true);
            BTNModificar.setEnabled(false);
        } else if (rols.equals("Analista")) {
            BTNInsertar.setEnabled(false);
            BTNModificar.setEnabled(false);
        } else if (rols.equals("Técnico")) {
            BTNInsertar.setEnabled(false);
            BTNModificar.setEnabled(false);
        } else {
            BTNInsertar.setEnabled(false);
            BTNModificar.setEnabled(false);
        }
        TXTNomequipo.setText("");
        TXTMarcaequi.setText("");
        TXTModeloequi.setText("");
        TXTNoserie.setText("");
        TXTProveedorequi.setText("");
        TXTArea.setText("");
        TXTPlacasena.setText("");
        TXTContratono.setText("");
        TXTGarantiaequi.setText("");
        TXTFechacompra.setDate(null);
        TXTFechainicion.setDate(null);
        BTNingresarnuuevod.setVisible(false);
        TXTAccesorios.setText("");
        TXTFrerecomante.setSelectedItem("Seleccionar");
        TXTFrerecorevi.setSelectedItem("Seleccionar");
        TXTFrerecocali.setSelectedItem("Seleccionar");
        TXTPreventivoequi.setSelectedItem("Seleccione");
        TXTVerificacionequi.setSelectedItem("Seleccione");
        TXTCalibracionequi.setSelectedItem("Seleccione");
        TXTEspecificaciones.setText("");
        TXTFuncionequi.setText("");
        TXTTempmax.setText("");
        TXTTempmin.setText("");
        TXTHumax.setText("");
        TXTHumin.setText("");
        TXTObserequi.setText("");
        jTextField1.setText("");
        modelo.setRowCount(0);
        lblfoto.setIcon(null);
        BTNModificar.setEnabled(false);

        TXTVoltajemin.setText("");
        TXTVoltajemax.setText("");
        TXTamperajemax.setText("");
        TXTamperajemin.setText("");
        TXTpotenciamax.setText("");
        TXTpotenciamin.setText("");
        //BTNEliminar.setEnabled(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDialog1 = new javax.swing.JDialog();
        jScrollPane6 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jTextField2 = new javax.swing.JTextField();
        jComboBox2 = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        panelImage1 = new org.edisoncor.gui.panel.PanelImage();
        jPanel1 = new javax.swing.JPanel();
        BTNInsertar = new javax.swing.JButton();
        BTNModificar = new javax.swing.JButton();
        BTNBuscar = new javax.swing.JButton();
        jLabel28 = new javax.swing.JLabel();
        TXTBuscarEquipo = new javax.swing.JTextField();
        jLabel30 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        TXTMarcaequi = new javax.swing.JTextField();
        TXTNu = new javax.swing.JFormattedTextField();
        TXTNomequipo = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        TXTModeloequi = new javax.swing.JTextField();
        TXTNoserie = new javax.swing.JTextField();
        TXTProveedorequi = new javax.swing.JTextField();
        TXTArea = new javax.swing.JTextField();
        TXTPlacasena = new javax.swing.JTextField();
        TXTContratono = new javax.swing.JTextField();
        TXTGarantiaequi = new javax.swing.JTextField();
        lblfoto = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        fechainin = new javax.swing.JLabel();
        freman = new javax.swing.JLabel();
        verirecomen = new javax.swing.JLabel();
        calirecomen = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        TXTAccesorios = new javax.swing.JTextArea();
        TXTFechacompra = new com.toedter.calendar.JDateChooser();
        TXTFechainicion = new com.toedter.calendar.JDateChooser();
        TXTFrerecomante = new javax.swing.JComboBox<>();
        TXTFrerecorevi = new javax.swing.JComboBox<>();
        TXTFrerecocali = new javax.swing.JComboBox<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        TXTObserequi = new javax.swing.JTextArea();
        jLabel27 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel23 = new javax.swing.JLabel();
        TXTTempmax = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        TXTTempmin = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        TXTHumax = new javax.swing.JTextField();
        jLabel29 = new javax.swing.JLabel();
        TXTHumin = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        TXTEspecificaciones = new javax.swing.JTextArea();
        TXTPreventivoequi = new javax.swing.JComboBox<>();
        TXTVerificacionequi = new javax.swing.JComboBox<>();
        TXTCalibracionequi = new javax.swing.JComboBox<>();
        jScrollPane5 = new javax.swing.JScrollPane();
        TXTFuncionequi = new javax.swing.JTextArea();
        jLabel31 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        TXTVoltajemin = new javax.swing.JTextField();
        TXTVoltajemax = new javax.swing.JTextField();
        TXTamperajemax = new javax.swing.JTextField();
        TXTamperajemin = new javax.swing.JTextField();
        TXTpotenciamax = new javax.swing.JTextField();
        TXTpotenciamin = new javax.swing.JTextField();
        jPanel5 = new javax.swing.JPanel();
        jButton3 = new javax.swing.JButton();
        jLabel32 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel37 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        BTNEliminar = new javax.swing.JButton();
        BTNingresarnuuevod = new javax.swing.JButton();

        jDialog1.setTitle("Ingresar Nuevos Documentos");
        jDialog1.setMinimumSize(new java.awt.Dimension(456, 363));

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane6.setViewportView(jTable2);

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione Idioma", "Español", "Ingles", "Frances" }));

        jLabel10.setText("Nombre Documento:");

        jLabel12.setText("Idioma:");

        jButton5.setText("Ingresar");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setText("Ingresar Documentos");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jDialog1Layout = new javax.swing.GroupLayout(jDialog1.getContentPane());
        jDialog1.getContentPane().setLayout(jDialog1Layout);
        jDialog1Layout.setHorizontalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane6)
            .addGroup(jDialog1Layout.createSequentialGroup()
                .addGroup(jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jDialog1Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10)
                            .addComponent(jLabel12))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextField2)
                            .addComponent(jComboBox2, 0, 173, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addComponent(jButton5))
                    .addGroup(jDialog1Layout.createSequentialGroup()
                        .addGap(152, 152, 152)
                        .addComponent(jButton6)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jDialog1Layout.setVerticalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDialog1Layout.createSequentialGroup()
                .addGroup(jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jDialog1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12)))
                    .addGroup(jDialog1Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jButton5)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8)
                .addComponent(jButton6)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        setClosable(true);
        setIconifiable(true);
        setTitle("EQUIPOS");
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
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelImage1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/reg.jpg"))); // NOI18N

        jPanel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel1.setOpaque(false);
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BTNInsertar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/editar-archivo-de-salvar-en-disco-icono-4876-32.png"))); // NOI18N
        BTNInsertar.setToolTipText("Insertar");
        BTNInsertar.setContentAreaFilled(false);
        BTNInsertar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNInsertarActionPerformed(evt);
            }
        });
        jPanel1.add(BTNInsertar, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 350, -1, -1));

        BTNModificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/editar-usuario-icono-9786-32.png"))); // NOI18N
        BTNModificar.setToolTipText("Modificar");
        BTNModificar.setContentAreaFilled(false);
        BTNModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNModificarActionPerformed(evt);
            }
        });
        jPanel1.add(BTNModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 350, -1, -1));

        BTNBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/zoom-icono-9136-32.png"))); // NOI18N
        BTNBuscar.setToolTipText("Buscar");
        BTNBuscar.setContentAreaFilled(false);
        BTNBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNBuscarActionPerformed(evt);
            }
        });
        jPanel1.add(BTNBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 350, -1, -1));

        jLabel28.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(102, 102, 102));
        jLabel28.setText("Búsqueda");
        jPanel1.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 360, -1, -1));
        jPanel1.add(TXTBuscarEquipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 360, 197, -1));

        jLabel30.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(102, 102, 102));
        jLabel30.setText("REGISTRO DE EQUIPOS");
        jPanel1.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 10, 209, -1));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/eliminar-cancelar-icono-4935-16.png"))); // NOI18N
        jButton1.setToolTipText("Limpiar");
        jButton1.setContentAreaFilled(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 350, -1, 41));

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/portapapeles-icono-9080-32.png"))); // NOI18N
        jButton4.setToolTipText("Generar Reporte");
        jButton4.setContentAreaFilled(false);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 350, -1, -1));

        jTabbedPane1.setForeground(new java.awt.Color(102, 102, 102));
        jTabbedPane1.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        jTabbedPane1.addContainerListener(new java.awt.event.ContainerAdapter() {
            public void componentAdded(java.awt.event.ContainerEvent evt) {
                jTabbedPane1ComponentAdded(evt);
            }
        });

        jPanel2.setOpaque(false);

        jLabel1.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 102, 102));
        jLabel1.setText("Nombre");

        jLabel2.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 102, 102));
        jLabel2.setText("Marca/Fabricante");

        TXTMarcaequi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TXTMarcaequiActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 102, 102));
        jLabel3.setText("Modelo");

        jLabel4.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(102, 102, 102));
        jLabel4.setText("N° Serie");

        jLabel5.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(102, 102, 102));
        jLabel5.setText("Proveedor");

        jLabel6.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(102, 102, 102));
        jLabel6.setText("Ubicación");

        jLabel7.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(102, 102, 102));
        jLabel7.setText("N° Placa SENA");

        jLabel9.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(102, 102, 102));
        jLabel9.setText("Contrato N°");

        jLabel8.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(102, 102, 102));
        jLabel8.setText("Garantía");

        TXTProveedorequi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TXTProveedorequiActionPerformed(evt);
            }
        });

        TXTContratono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TXTContratonoActionPerformed(evt);
            }
        });

        TXTGarantiaequi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TXTGarantiaequiActionPerformed(evt);
            }
        });

        lblfoto.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        lblfoto.setForeground(new java.awt.Color(102, 102, 102));
        lblfoto.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblfoto.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jButton2.setText("Cargar imagen");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(69, 69, 69)
                                .addComponent(TXTProveedorequi, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel4))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(TXTNoserie, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(TXTModeloequi, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(TXTMarcaequi, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(TXTNomequipo, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(15, 15, 15)
                        .addComponent(TXTNu, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9)
                            .addComponent(jLabel7)
                            .addComponent(jLabel6))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(TXTArea, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TXTContratono, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TXTGarantiaequi, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TXTPlacasena, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(lblfoto, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(59, 59, 59))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(97, 97, 97))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(TXTArea, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel6)
                                        .addComponent(TXTNu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel7)
                                    .addComponent(TXTPlacasena, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(11, 11, 11)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel9)
                                    .addComponent(TXTContratono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(TXTGarantiaequi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel8)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel1)
                                    .addComponent(TXTNomequipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel2)
                                    .addComponent(TXTMarcaequi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(11, 11, 11)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(TXTModeloequi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(TXTNoserie, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(TXTProveedorequi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5)))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblfoto, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton2)
                .addContainerGap(556, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Datos básicos", jPanel2);

        jPanel3.setOpaque(false);

        jLabel14.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(102, 102, 102));
        jLabel14.setText("Fecha compra");

        fechainin.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        fechainin.setForeground(new java.awt.Color(102, 102, 102));
        fechainin.setText("fe");

        freman.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        freman.setForeground(new java.awt.Color(102, 102, 102));
        freman.setText("df ");

        verirecomen.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        verirecomen.setForeground(new java.awt.Color(102, 102, 102));
        verirecomen.setText("er");

        calirecomen.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        calirecomen.setForeground(new java.awt.Color(102, 102, 102));
        calirecomen.setText("ef");

        jLabel11.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(102, 102, 102));
        jLabel11.setText("Accesorios");

        TXTAccesorios.setColumns(20);
        TXTAccesorios.setLineWrap(true);
        TXTAccesorios.setRows(5);
        jScrollPane3.setViewportView(TXTAccesorios);

        TXTFrerecomante.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar", "Anual", "Mensual", "Diaria" }));

        TXTFrerecorevi.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar", "Anual", "Mensual", "Diaria" }));
        TXTFrerecorevi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TXTFrerecoreviActionPerformed(evt);
            }
        });

        TXTFrerecocali.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar", "Anual", "Mensual", "Diaria" }));

        TXTObserequi.setColumns(20);
        TXTObserequi.setLineWrap(true);
        TXTObserequi.setRows(5);
        jScrollPane2.setViewportView(TXTObserequi);

        jLabel27.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(102, 102, 102));
        jLabel27.setText("Observación");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel14)
                            .addComponent(fechainin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(TXTFechacompra, javax.swing.GroupLayout.DEFAULT_SIZE, 132, Short.MAX_VALUE)
                            .addComponent(TXTFechainicion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(verirecomen, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(freman, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 122, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(TXTFrerecomante, 0, 114, Short.MAX_VALUE)
                            .addComponent(TXTFrerecorevi, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(calirecomen, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TXTFrerecocali, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 192, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel27)
                        .addGap(9, 9, 9)))
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(79, 79, 79))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(jLabel14)
                                        .addGap(8, 8, 8)
                                        .addComponent(fechainin, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(TXTFechacompra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(TXTFechainicion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(freman, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(TXTFrerecomante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel27))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(verirecomen, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TXTFrerecorevi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(calirecomen, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TXTFrerecocali, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(586, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Datos básicos 2", jPanel3);

        jPanel4.setOpaque(false);

        jLabel23.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(102, 102, 102));
        jLabel23.setText("T. Máxima (°C)");

        TXTTempmax.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TXTTempmaxKeyTyped(evt);
            }
        });

        jLabel24.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(102, 102, 102));
        jLabel24.setText("T. Mínima (°C)");

        TXTTempmin.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TXTTempminKeyTyped(evt);
            }
        });

        jLabel25.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(102, 102, 102));
        jLabel25.setText("H. Máxima (%HR)");

        TXTHumax.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TXTHumaxKeyTyped(evt);
            }
        });

        jLabel29.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(102, 102, 102));
        jLabel29.setText("H. Mínima (%HR)");

        TXTHumin.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TXTHuminKeyTyped(evt);
            }
        });

        jLabel18.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(102, 102, 102));
        jLabel18.setText("Calibración");

        jLabel19.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(102, 102, 102));
        jLabel19.setText("Función");

        jLabel17.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(102, 102, 102));
        jLabel17.setText("Preventivo");

        jLabel35.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        jLabel35.setForeground(new java.awt.Color(102, 102, 102));
        jLabel35.setText("Verificación");

        jLabel36.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        jLabel36.setForeground(new java.awt.Color(102, 102, 102));
        jLabel36.setText("Especificaciones");

        TXTEspecificaciones.setColumns(20);
        TXTEspecificaciones.setLineWrap(true);
        TXTEspecificaciones.setRows(5);
        TXTEspecificaciones.setMinimumSize(new java.awt.Dimension(85, 22));
        TXTEspecificaciones.setPreferredSize(new java.awt.Dimension(85, 94));
        jScrollPane4.setViewportView(TXTEspecificaciones);

        TXTPreventivoequi.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione", "Si", "No" }));

        TXTVerificacionequi.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione", "Si", "No" }));

        TXTCalibracionequi.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione", "Si", "No" }));

        TXTFuncionequi.setColumns(20);
        TXTFuncionequi.setLineWrap(true);
        TXTFuncionequi.setRows(5);
        jScrollPane5.setViewportView(TXTFuncionequi);

        jLabel31.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        jLabel31.setForeground(new java.awt.Color(102, 102, 102));
        jLabel31.setText("V. Máximo (V)");

        jLabel33.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        jLabel33.setForeground(new java.awt.Color(102, 102, 102));
        jLabel33.setText("V. Mínimo (V)");

        jLabel34.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        jLabel34.setForeground(new java.awt.Color(102, 102, 102));
        jLabel34.setText("A. Máximo (A)");

        jLabel38.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        jLabel38.setForeground(new java.awt.Color(102, 102, 102));
        jLabel38.setText("A. Mínimo (A)");

        jLabel39.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        jLabel39.setForeground(new java.awt.Color(102, 102, 102));
        jLabel39.setText("P. Mínimo (W)");

        jLabel40.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        jLabel40.setForeground(new java.awt.Color(102, 102, 102));
        jLabel40.setText("P. Máximo (W)");

        TXTVoltajemin.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TXTVoltajeminKeyTyped(evt);
            }
        });

        TXTVoltajemax.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TXTVoltajemaxKeyTyped(evt);
            }
        });

        TXTamperajemax.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TXTamperajemaxKeyTyped(evt);
            }
        });

        TXTamperajemin.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TXTamperajeminKeyTyped(evt);
            }
        });

        TXTpotenciamax.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TXTpotenciamaxKeyTyped(evt);
            }
        });

        TXTpotenciamin.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TXTpotenciaminKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel18)
                    .addComponent(jLabel17)
                    .addComponent(jLabel35)
                    .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(TXTVerificacionequi, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(TXTCalibracionequi, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(TXTPreventivoequi, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel36)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel23)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(TXTTempmax, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel25)
                                    .addComponent(jLabel29))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(TXTHumax, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(TXTHumin, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel24)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(TXTTempmin, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(35, 35, 35)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel31)
                    .addComponent(jLabel33)
                    .addComponent(jLabel34)
                    .addComponent(jLabel38)
                    .addComponent(jLabel40)
                    .addComponent(jLabel39))
                .addGap(28, 28, 28)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TXTpotenciamin, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TXTpotenciamax, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TXTamperajemin, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TXTamperajemax, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TXTVoltajemax, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TXTVoltajemin, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(454, 454, 454))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel17)
                            .addComponent(TXTPreventivoequi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(8, 8, 8)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel35)
                            .addComponent(TXTVerificacionequi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel18)
                            .addComponent(TXTCalibracionequi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel19)
                            .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel36))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(TXTTempmax, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel23))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel24)
                                    .addComponent(TXTTempmin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel25)
                                    .addComponent(TXTHumax, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel31)
                                    .addComponent(TXTVoltajemin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel33)
                                    .addComponent(TXTVoltajemax, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel34)
                                    .addComponent(TXTamperajemax, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel38)
                                    .addComponent(TXTamperajemin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel40)
                                    .addComponent(TXTpotenciamax, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(10, 10, 10)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(TXTpotenciamin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel39))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TXTHumin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel29))))
                .addContainerGap(564, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Datos básicos 3", jPanel4);

        jPanel5.setOpaque(false);

        jButton3.setText("Nuevo documento");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel32.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        jLabel32.setForeground(new java.awt.Color(102, 102, 102));
        jLabel32.setText("Elija idioma:");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione", "Inglés", "Español", "Francés" }));

        jLabel37.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        jLabel37.setForeground(new java.awt.Color(102, 102, 102));
        jLabel37.setText("Documentación asociada");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Tipo Documento", "Idioma"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        BTNEliminar.setText("Eliminar");
        BTNEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNEliminarActionPerformed(evt);
            }
        });

        BTNingresarnuuevod.setText("Ingresar nuevo documento");
        BTNingresarnuuevod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNingresarnuuevodActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel37)
                    .addComponent(jLabel32))
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)))
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BTNEliminar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(44, 44, 44)
                .addComponent(BTNingresarnuuevod)
                .addGap(247, 247, 247))
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(127, 127, 127)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 584, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel37)
                    .addComponent(jButton3)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BTNingresarnuuevod))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel32)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(BTNEliminar))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(589, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Datos básicos 4", jPanel5);

        jPanel1.add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, 890, -1));

        javax.swing.GroupLayout panelImage1Layout = new javax.swing.GroupLayout(panelImage1);
        panelImage1.setLayout(panelImage1Layout);
        panelImage1Layout.setHorizontalGroup(
            panelImage1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelImage1Layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 950, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 30, Short.MAX_VALUE))
        );
        panelImage1Layout.setVerticalGroup(
            panelImage1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelImage1Layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 422, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        getContentPane().add(panelImage1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 980, 430));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TXTMarcaequiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TXTMarcaequiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TXTMarcaequiActionPerformed

    private void TXTContratonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TXTContratonoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TXTContratonoActionPerformed

    private void BTNInsertarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNInsertarActionPerformed
        equipoController.controlarAccion("Insertar", obtenerEquipo());
        for (int i = 0; i < modelo.getRowCount(); i++) {
            try {
                PreparedStatement sql = conexion.connection.prepareStatement("INSERT INTO documentacionasoci (documento, idioma, noserie)"
                        + "VALUES (?,?,?)");
                sql.setString(1, (String) jTable1.getValueAt(i, 0));
                sql.setString(2, (String) jTable1.getValueAt(i, 1));
                sql.setString(3, TXTNoserie.getText());
                sql.executeUpdate();
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "Hubo un problema al insertar los documentos " + e.getMessage());
            }
        }
        limpiarFormulario();
    }//GEN-LAST:event_BTNInsertarActionPerformed

    private void BTNModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNModificarActionPerformed
        equipoController.controlarAccion("Modificar", obtenerEquipo());
        limpiarFormulario();
    }//GEN-LAST:event_BTNModificarActionPerformed

    private void BTNBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNBuscarActionPerformed
        String rols = menu.getRol();
        if (rols.equals("Director técnico")) {
            BTNInsertar.setEnabled(false);
            BTNModificar.setEnabled(false);
        } else if (rols.equals("Líder de calidad")) {
            BTNInsertar.setEnabled(false);
            BTNModificar.setEnabled(true);
        } else if (rols.equals("Analista")) {
            BTNInsertar.setEnabled(false);
            BTNModificar.setEnabled(false);
        } else if (rols.equals("Técnico")) {
            BTNInsertar.setEnabled(false);
            BTNModificar.setEnabled(false);
        } else {
            BTNInsertar.setEnabled(false);
            BTNModificar.setEnabled(false);
        }

        ImageIcon foto;
        Equipos e = new Equipos();
        Iterator<Equipos> itequi = e.buscar(TXTBuscarEquipo.getText());
        while (itequi.hasNext()) {
            e = itequi.next();
            TXTNu.setValue(e.getNu());
            TXTNomequipo.setText(e.getNomequipo());
            TXTMarcaequi.setText(e.getMarcaequi());
            TXTModeloequi.setText(e.getModeloequi());
            TXTNoserie.setText(e.getNoserie());
            TXTProveedorequi.setText(e.getProveedorequi());
            TXTArea.setText(e.getArea());
            TXTPlacasena.setText(e.getPlacasena());
            TXTContratono.setText(e.getContratono());
            TXTGarantiaequi.setText(e.getGarantiaequi());
            try {
                TXTFechacompra.setDate(fecha.parse(e.getFechacompra()));
                TXTFechainicion.setDate(fecha.parse(e.getFechainicion()));
            } catch (ParseException ex) {
                Logger.getLogger(MenuEquipos.class.getName()).log(Level.SEVERE, null, ex);
            }
            TXTAccesorios.setText(e.getAccesorios());
            TXTFrerecomante.setSelectedItem(e.getFrerecomante());
            TXTFrerecorevi.setSelectedItem(e.getFrerecorevi());
            TXTFrerecocali.setSelectedItem(e.getFrerecocali());
            TXTPreventivoequi.setSelectedItem(e.getPreventivoequi());
            TXTVerificacionequi.setSelectedItem(e.getVerificacionequi());
            TXTCalibracionequi.setSelectedItem(e.getCalibracionequi());
            TXTEspecificaciones.setText(e.getEspecificaciones());
            TXTFuncionequi.setText(e.getFuncionequi());
            TXTTempmax.setText(e.getTempmax());
            TXTTempmin.setText(e.getTempmin());
            TXTHumax.setText(e.getHumax());
            TXTHumin.setText(e.getHumin());
            TXTObserequi.setText(e.getObserequi());
            TXTVoltajemax.setText(e.getVoltajemax());
            TXTVoltajemin.setText(e.getVoltajemin());
            TXTamperajemax.setText(e.getAmperajemax());
            TXTamperajemin.setText(e.getAmperajemin());
            TXTpotenciamax.setText(e.getPotenciamax());
            TXTpotenciamin.setText(e.getPotenciamin());
            try {
                PreparedStatement sql = conexion.connection.prepareStatement("SELECT foto FROM equipos WHERE noserie = ?");
                sql.setString(1, e.getNoserie());
                ResultSet rs = sql.executeQuery();
                rs.next();
                is = rs.getBinaryStream(1);
                BufferedImage bi = ImageIO.read(is);
                foto = new ImageIcon(bi);
                Image img = foto.getImage();
                Image newimg = img.getScaledInstance(140, 170, java.awt.Image.SCALE_SMOOTH);
                ImageIcon newicon = new ImageIcon(newimg);
                lblfoto.setIcon(newicon);
            } catch (IOException ex) {
                System.err.println("Hubo un error con la imagen " + ex.getMessage());
            } catch (SQLException ex) {
                System.err.println("Hubo un error al hacer la consulta " + ex.getMessage());
            }
        }
        try {
            modelo.setRowCount(0);
            PreparedStatement sql = conexion.connection.prepareStatement("SELECT * FROM documentacionasoci WHERE noserie = ?");
            sql.setString(1, e.getNoserie());
            ResultSet rs = sql.executeQuery();
            while (rs.next()) {
                Object docu[] = new Object[2];
                docu[0] = rs.getString("documento");
                docu[1] = rs.getString("idioma");
                modelo.addRow(docu);
            }
        } catch (SQLException ex) {
            System.err.println("Hubo un error al traer los documentos ");
            System.out.println(ex);
        }
        jButton3.setEnabled(false);
        BTNingresarnuuevod.setVisible(true);
    }//GEN-LAST:event_BTNBuscarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        limpiarFormulario();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void TXTProveedorequiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TXTProveedorequiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TXTProveedorequiActionPerformed

    private void jTabbedPane1ComponentAdded(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_jTabbedPane1ComponentAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_jTabbedPane1ComponentAdded

    private void TXTGarantiaequiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TXTGarantiaequiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TXTGarantiaequiActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        lblfoto.setIcon(null);
        JFileChooser j = new JFileChooser();
        j.setFileSelectionMode(JFileChooser.FILES_ONLY);//solo archivos y no carpetas
        int estado = j.showOpenDialog(null);
        if (estado == JFileChooser.APPROVE_OPTION) {
            try {
                fis = new FileInputStream(j.getSelectedFile());
                //necesitamos saber la cantidad de bytes
                longitudBytes = (int) j.getSelectedFile().length();
                try {
                    Image icono = ImageIO.read(j.getSelectedFile()).getScaledInstance(lblfoto.getWidth(), lblfoto.getHeight(), Image.SCALE_DEFAULT);
                    lblfoto.setIcon(new ImageIcon(icono));
                    lblfoto.updateUI();

                } catch (IOException ex) {
                    JOptionPane.showMessageDialog(rootPane, "imagen: " + ex);
                }
            } catch (FileNotFoundException ex) {
                ex.printStackTrace();
            }
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void TXTTempmaxKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TXTTempmaxKeyTyped
        int k = (int) evt.getKeyChar();
        if (k >= 97 && k <= 122 || k >= 65 && k <= 90) {
            evt.setKeyChar((char) KeyEvent.VK_CLEAR);
            JOptionPane.showMessageDialog(null, "No debe ingresar letras!!!", "Ventana Error Datos", JOptionPane.ERROR_MESSAGE);
        }
        if (k == 241 || k == 209) {
            evt.setKeyChar((char) KeyEvent.VK_CLEAR);
            JOptionPane.showMessageDialog(null, "No debe ingresar letras!!!", "Ventana Error Datos", JOptionPane.ERROR_MESSAGE);
        }
        if (k == 10) {
            TXTTempmax.transferFocus();
        }
    }//GEN-LAST:event_TXTTempmaxKeyTyped

    private void TXTTempminKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TXTTempminKeyTyped
        int k = (int) evt.getKeyChar();
        if (k >= 97 && k <= 122 || k >= 65 && k <= 90) {
            evt.setKeyChar((char) KeyEvent.VK_CLEAR);
            JOptionPane.showMessageDialog(null, "No debe ingresar letras!!!", "Ventana Error Datos", JOptionPane.ERROR_MESSAGE);
        }
        if (k == 241 || k == 209) {
            evt.setKeyChar((char) KeyEvent.VK_CLEAR);
            JOptionPane.showMessageDialog(null, "No debe ingresar letras!!!", "Ventana Error Datos", JOptionPane.ERROR_MESSAGE);
        }
        if (k == 10) {
            TXTTempmin.transferFocus();
        }
    }//GEN-LAST:event_TXTTempminKeyTyped

    private void TXTHumaxKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TXTHumaxKeyTyped
        int k = (int) evt.getKeyChar();
        if (k >= 97 && k <= 122 || k >= 65 && k <= 90) {
            evt.setKeyChar((char) KeyEvent.VK_CLEAR);
            JOptionPane.showMessageDialog(null, "No debe ingresar letras!!!", "Ventana Error Datos", JOptionPane.ERROR_MESSAGE);
        }
        if (k == 241 || k == 209) {
            evt.setKeyChar((char) KeyEvent.VK_CLEAR);
            JOptionPane.showMessageDialog(null, "No debe ingresar letras!!!", "Ventana Error Datos", JOptionPane.ERROR_MESSAGE);
        }
        if (k == 10) {
            TXTHumax.transferFocus();
        }
    }//GEN-LAST:event_TXTHumaxKeyTyped

    private void TXTHuminKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TXTHuminKeyTyped
        int k = (int) evt.getKeyChar();
        if (k >= 97 && k <= 122 || k >= 65 && k <= 90) {
            evt.setKeyChar((char) KeyEvent.VK_CLEAR);
            JOptionPane.showMessageDialog(null, "No debe ingresar letras!!!", "Ventana Error Datos", JOptionPane.ERROR_MESSAGE);
        }
        if (k == 241 || k == 209) {
            evt.setKeyChar((char) KeyEvent.VK_CLEAR);
            JOptionPane.showMessageDialog(null, "No debe ingresar letras!!!", "Ventana Error Datos", JOptionPane.ERROR_MESSAGE);
        }
        if (k == 10) {
            TXTHumin.transferFocus();
        }
    }//GEN-LAST:event_TXTHuminKeyTyped

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        JasperReport jrReporte = null;
        try {
            jrReporte = (JasperReport) JRLoader.loadObject(getClass().getClassLoader().getResource("reportes/hojadevida.jasper"));
            Map params = new HashMap();
            params.put("buscarequipo", TXTNoserie.getText());
            params.put("SUBREPORT_DIR", System.getProperty("user.dir"));
            JasperPrint jpReporte = JasperFillManager.fillReport(jrReporte, params, conexion.connection);
            JasperViewer jReporteViewer = new JasperViewer(jpReporte, false);
            jReporteViewer.setVisible(true);
        } catch (JRException e) {
            System.err.println("Hubo un problema con el jasper " + e);
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void TXTFrerecoreviActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TXTFrerecoreviActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TXTFrerecoreviActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        if (jTextField1.getText().equals("") || jComboBox1.getSelectedItem().equals("Seleccione")) {
            JOptionPane.showMessageDialog(null, "Debe ingresar datos");

        } else {
            Object[] documentos = new Object[2];
            documentos[0] = jTextField1.getText();
            documentos[1] = jComboBox1.getSelectedItem();
            modelo.addRow(documentos);
            jTextField1.setText("");
            jComboBox1.setSelectedItem("Seleccione");
        }

    }//GEN-LAST:event_jButton3ActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        fila1 = jTable1.rowAtPoint(evt.getPoint());
        if (fila1 > -1) {
            BTNEliminar.setEnabled(true);
        }

    }//GEN-LAST:event_jTable1MouseClicked

    private void BTNEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNEliminarActionPerformed
        modelo.removeRow(fila1);
        BTNEliminar.setEnabled(false);
    }//GEN-LAST:event_BTNEliminarActionPerformed

    private void TXTVoltajeminKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TXTVoltajeminKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_TXTVoltajeminKeyTyped

    private void TXTVoltajemaxKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TXTVoltajemaxKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_TXTVoltajemaxKeyTyped

    private void TXTamperajemaxKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TXTamperajemaxKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_TXTamperajemaxKeyTyped

    private void TXTamperajeminKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TXTamperajeminKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_TXTamperajeminKeyTyped

    private void TXTpotenciamaxKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TXTpotenciamaxKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_TXTpotenciamaxKeyTyped

    private void TXTpotenciaminKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TXTpotenciaminKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_TXTpotenciaminKeyTyped

    private void BTNingresarnuuevodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNingresarnuuevodActionPerformed
        jDialog1.setVisible(true);
    }//GEN-LAST:event_BTNingresarnuuevodActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        if (jTextField2.getText().equals("") || jComboBox2.getSelectedItem().equals("Seleccione Idioma")) {
            JOptionPane.showMessageDialog(null, "Debe ingresar datos");

        } else {
            Object[] documentos = new Object[2];
            documentos[0] = jTextField2.getText();
            documentos[1] = jComboBox2.getSelectedItem();
            modelo2.addRow(documentos);
            jTextField2.setText("");
            jComboBox2.setSelectedItem("Seleccione Idioma");
        }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        for (int i = 0; i < modelo2.getRowCount(); i++) {
            try {
                PreparedStatement sql = conexion.connection.prepareStatement("INSERT INTO documentacionasoci (documento, idioma, noserie)"
                        + "VALUES (?,?,?)");
                sql.setString(1, (String) jTable2.getValueAt(i, 0));
                sql.setString(2, (String) jTable2.getValueAt(i, 1));
                sql.setString(3, TXTNoserie.getText());
                sql.executeUpdate();
                JOptionPane.showMessageDialog(null, "Los documentos nuevos han sido ingresados");
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "Hubo un problema al insertar los documentos ");
                System.out.println(e);
            }
        }
        modelo2.setRowCount(0);
        jDialog1.setVisible(false);
    }//GEN-LAST:event_jButton6ActionPerformed

    private void formInternalFrameIconified(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameIconified
        this.toFront();
    }//GEN-LAST:event_formInternalFrameIconified

    private Equipos obtenerEquipo() {
        Equipos elEquipo = new Equipos();
        elEquipo.setNu((Integer) TXTNu.getValue());
        elEquipo.setNomequipo(TXTNomequipo.getText());
        elEquipo.setMarcaequi(TXTMarcaequi.getText());
        elEquipo.setModeloequi(TXTModeloequi.getText());
        elEquipo.setNoserie(TXTNoserie.getText());
        elEquipo.setProveedorequi(TXTProveedorequi.getText());
        elEquipo.setArea(TXTArea.getText());
        elEquipo.setPlacasena(TXTPlacasena.getText());
        elEquipo.setContratono(TXTContratono.getText());
        elEquipo.setGarantiaequi(TXTGarantiaequi.getText());
        elEquipo.setFechacompra(fecha.format(TXTFechacompra.getDate()));
        elEquipo.setFechainicion(fecha.format(TXTFechainicion.getDate()));
        elEquipo.setAccesorios(TXTAccesorios.getText());
        elEquipo.setFrerecomante((String) TXTFrerecomante.getSelectedItem());
        elEquipo.setFrerecorevi((String) TXTFrerecorevi.getSelectedItem());
        elEquipo.setFrerecocali((String) TXTFrerecocali.getSelectedItem());
        elEquipo.setPreventivoequi((String) TXTPreventivoequi.getSelectedItem());
        elEquipo.setVerificacionequi((String) TXTVerificacionequi.getSelectedItem());
        elEquipo.setCalibracionequi((String) TXTCalibracionequi.getSelectedItem());
        elEquipo.setEspecificaciones(TXTEspecificaciones.getText());
        elEquipo.setFuncionequi(TXTFuncionequi.getText());
        elEquipo.setTempmax(TXTTempmax.getText());
        elEquipo.setTempmin(TXTTempmin.getText());
        elEquipo.setHumax(TXTHumax.getText());
        elEquipo.setHumin(TXTHumin.getText());
        elEquipo.setObserequi(TXTObserequi.getText());
        elEquipo.setFoto1(fis);
        elEquipo.setFoto2(longitudBytes);
        elEquipo.setVoltajemax(TXTVoltajemax.getText());
        elEquipo.setVoltajemin(TXTVoltajemin.getText());
        elEquipo.setAmperajemax(TXTamperajemax.getText());
        elEquipo.setAmperajemin(TXTamperajemin.getText());
        elEquipo.setPotenciamax(TXTpotenciamax.getText());
        elEquipo.setPotenciamin(TXTpotenciamin.getText());
        elEquipo.setIndet(ident);
        return elEquipo;
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BTNBuscar;
    private javax.swing.JButton BTNEliminar;
    private javax.swing.JButton BTNInsertar;
    private javax.swing.JButton BTNModificar;
    private javax.swing.JButton BTNingresarnuuevod;
    private javax.swing.JTextArea TXTAccesorios;
    private javax.swing.JTextField TXTArea;
    private javax.swing.JTextField TXTBuscarEquipo;
    private javax.swing.JComboBox<String> TXTCalibracionequi;
    private javax.swing.JTextField TXTContratono;
    private javax.swing.JTextArea TXTEspecificaciones;
    private com.toedter.calendar.JDateChooser TXTFechacompra;
    private com.toedter.calendar.JDateChooser TXTFechainicion;
    private javax.swing.JComboBox<String> TXTFrerecocali;
    private javax.swing.JComboBox<String> TXTFrerecomante;
    private javax.swing.JComboBox<String> TXTFrerecorevi;
    private javax.swing.JTextArea TXTFuncionequi;
    private javax.swing.JTextField TXTGarantiaequi;
    private javax.swing.JTextField TXTHumax;
    private javax.swing.JTextField TXTHumin;
    private javax.swing.JTextField TXTMarcaequi;
    private javax.swing.JTextField TXTModeloequi;
    private javax.swing.JTextField TXTNomequipo;
    private javax.swing.JTextField TXTNoserie;
    private javax.swing.JFormattedTextField TXTNu;
    private javax.swing.JTextArea TXTObserequi;
    private javax.swing.JTextField TXTPlacasena;
    private javax.swing.JComboBox<String> TXTPreventivoequi;
    private javax.swing.JTextField TXTProveedorequi;
    private javax.swing.JTextField TXTTempmax;
    private javax.swing.JTextField TXTTempmin;
    private javax.swing.JComboBox<String> TXTVerificacionequi;
    private javax.swing.JTextField TXTVoltajemax;
    private javax.swing.JTextField TXTVoltajemin;
    private javax.swing.JTextField TXTamperajemax;
    private javax.swing.JTextField TXTamperajemin;
    private javax.swing.JTextField TXTpotenciamax;
    private javax.swing.JTextField TXTpotenciamin;
    private javax.swing.JLabel calirecomen;
    private javax.swing.JLabel fechainin;
    private javax.swing.JLabel freman;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
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
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JLabel lblfoto;
    private org.edisoncor.gui.panel.PanelImage panelImage1;
    private javax.swing.JLabel verirecomen;
    // End of variables declaration//GEN-END:variables
}
