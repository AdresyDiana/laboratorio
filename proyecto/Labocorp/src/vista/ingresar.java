package vista;

import modelo.conexion;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.table.DefaultTableModel;
import modelo.usuario_C;
import modelo.usuario_DAO;
import org.apache.commons.codec.digest.DigestUtils;

/**
 *
 * @author Andrés Felipe Rincón Sánchez
 */
public class ingresar extends javax.swing.JInternalFrame {

    DefaultTableModel modelo;
    String[] titulos = {"N° Id", "Nombres", "Apellidos", "Direccion", "Correo", "Teléfono", "Género", "Cargo"};
    Connection con = conexion.connection;

    public ingresar() {
        initComponents();
        modelo = new DefaultTableModel(null, titulos);
        tabla.setModel(modelo);
        actualizar();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelImage1 = new org.edisoncor.gui.panel.PanelImage();
        jPanel4 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        Idus = new javax.swing.JTextField();
        nom = new javax.swing.JTextField();
        apell = new javax.swing.JTextField();
        direc = new javax.swing.JTextField();
        email = new javax.swing.JTextField();
        ncelu = new javax.swing.JTextField();
        carg = new javax.swing.JTextField();
        usu = new javax.swing.JTextField();
        pass = new javax.swing.JPasswordField();
        rol = new javax.swing.JComboBox<>();
        sexo = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        cancel = new javax.swing.JButton();
        guar = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        tipos = new javax.swing.JComboBox<>();

        setClosable(true);
        setIconifiable(true);
        setResizable(true);
        setTitle("NUEVO USUARIO");
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

        jPanel4.setOpaque(false);

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "REGISTRO DE USUARIOS", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Calibri", 1, 18), new java.awt.Color(102, 102, 102))); // NOI18N
        jPanel3.setOpaque(false);

        tabla.setFont(new java.awt.Font("Cambria", 0, 14)); // NOI18N
        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tabla.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tabla.setEnabled(false);
        tabla.setGridColor(new java.awt.Color(0, 0, 0));
        tabla.setOpaque(false);
        tabla.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabla);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 625, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "FORMULARIO DE REGISTRO", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Calibri", 1, 18), new java.awt.Color(102, 102, 102))); // NOI18N
        jPanel2.setOpaque(false);

        jLabel2.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 102, 102));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel2.setText("Nombres");

        jLabel3.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 102, 102));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel3.setText("N° Identificación");

        jLabel4.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(102, 102, 102));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel4.setText("Dirección");

        jLabel5.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(102, 102, 102));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel5.setText("Apellidos");

        jLabel6.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(102, 102, 102));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel6.setText("Correo");

        jLabel7.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(102, 102, 102));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel7.setText("N° de Celular");

        jLabel8.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(102, 102, 102));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel8.setText("Género");

        jLabel9.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(102, 102, 102));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel9.setText("Cargo");

        jLabel10.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(102, 102, 102));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel10.setText("Usuario");

        jLabel11.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(102, 102, 102));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel11.setText("Contraseña");

        jLabel12.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(102, 102, 102));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel12.setText("Rol");

        Idus.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                IdusKeyTyped(evt);
            }
        });

        apell.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                apellActionPerformed(evt);
            }
        });

        ncelu.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                nceluKeyTyped(evt);
            }
        });

        rol.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione Rol", "Administrador", "Director técnico", "Líder de calidad", "Analista", "Técnico" }));

        sexo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione Género", "Masculino", "Femenino" }));

        jLabel1.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 102, 102));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel1.setText("Tipo Documento");

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/zoom-icono-9136-32.png"))); // NOI18N
        jButton2.setToolTipText("BUSCAR");
        jButton2.setContentAreaFilled(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/editar-usuario-icono-9786-32.png"))); // NOI18N
        jButton1.setToolTipText("MODIFICAR");
        jButton1.setContentAreaFilled(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        cancel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/eliminar-cancelar-icono-4935-16.png"))); // NOI18N
        cancel.setToolTipText("CANCELAR");
        cancel.setContentAreaFilled(false);
        cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelActionPerformed(evt);
            }
        });

        guar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/editar-archivo-de-salvar-en-disco-icono-4876-32.png"))); // NOI18N
        guar.setToolTipText("GUARDAR");
        guar.setContentAreaFilled(false);
        guar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guarActionPerformed(evt);
            }
        });

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/actualizar-la-base-de-datos-icono-7326-32.png"))); // NOI18N
        jButton3.setToolTipText("Actualiza N° identificación");
        jButton3.setContentAreaFilled(false);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        tipos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione Documento", "Cédula de Ciudadanía", "Tarjeta de Identidad", "Cédula de Extranjería", "Registro Civil" }));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 51, Short.MAX_VALUE)
                        .addComponent(Idus, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel11)
                                    .addComponent(jLabel12)
                                    .addComponent(jLabel10)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel8))
                                .addGap(0, 42, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(usu, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(carg, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(apell, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(nom, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(email, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(direc, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(sexo, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(ncelu, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(rol, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(pass, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(tipos, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(31, 31, 31)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(guar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cancel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(Idus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(tipos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(nom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(apell, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(direc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(ncelu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(sexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(carg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(usu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(6, 6, 6)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(pass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12)
                            .addComponent(rol, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(guar)
                        .addGap(18, 18, 18)
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cancel, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(2, 2, 2))
        );

        javax.swing.GroupLayout panelImage1Layout = new javax.swing.GroupLayout(panelImage1);
        panelImage1.setLayout(panelImage1Layout);
        panelImage1Layout.setHorizontalGroup(
            panelImage1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1191, Short.MAX_VALUE)
            .addGroup(panelImage1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panelImage1Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        panelImage1Layout.setVerticalGroup(
            panelImage1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 399, Short.MAX_VALUE)
            .addGroup(panelImage1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panelImage1Layout.createSequentialGroup()
                    .addGap(0, 11, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 11, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelImage1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelImage1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 6, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private void guarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guarActionPerformed
        if (this.Idus.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "INGRESE UN N° DE IDENTIFICACIÓN");
        } else if (this.tipos.getSelectedItem().equals("Seleccione Documento")) {
            JOptionPane.showMessageDialog(null, "SELECCIONE EL TIPO DE DOCUMENTO");
        } else if (this.nom.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "INGRESE LOS NOMBRES");
        } else if (this.apell.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "INGRESE LOS APELLIDOS");
        } else if (this.direc.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "INGRESE LA DIRECCIÓN");
        } else if (this.email.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "INGRESE UN CORREO");
        } else if (this.ncelu.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "INGRESE UN NÚMERO DE CELULAR");
        } else if (this.sexo.getSelectedItem().equals("Seleccione Género")) {
            JOptionPane.showMessageDialog(null, "SELECCIONE EL GÉNERO");
        } else if (this.carg.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "INGRESE UN CARGO");
        } else if (this.usu.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "INGRESE UN NOMBRE DE USUARIO");
        } else if (pass.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "INGRESE UNA CONTRASEÑA");
        } else if (this.rol.getSelectedItem().equals("Seleccione Rol")) {
            JOptionPane.showMessageDialog(null, "INGRESE UN ROL");
        } else {
            try {
                String Inde = this.Idus.getText();
                String nombre = this.nom.getText();
                String apelldio = this.apell.getText();
                String direcc = this.direc.getText();
                String Email = this.email.getText();
                String tele = this.ncelu.getText();
                String genero = (String) this.sexo.getSelectedItem();
                String cargo = this.carg.getText();
                String user = this.usu.getText();
                String pass = DigestUtils.md5Hex(this.pass.getText());
                String rol = (String) this.rol.getSelectedItem();
                String tipo = (String) this.tipos.getSelectedItem();

                usuario_C us = new usuario_C(Inde, nombre, apelldio, direcc, Email, tele, genero, cargo, user, pass, rol, tipo);

                usuario_DAO dao = new usuario_DAO();
                dao.insertar(us);
                limpiar();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Error Al Insertar");
                System.out.println(e);
            }
        }
        actualizar();
    }//GEN-LAST:event_guarActionPerformed
    private void cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelActionPerformed
        limpiar();
    }//GEN-LAST:event_cancelActionPerformed
    private void apellActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_apellActionPerformed
    }//GEN-LAST:event_apellActionPerformed
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if (this.Idus.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "INGRESE UN N° DE IDENTIFICACIÓN");
        } else if (this.tipos.getSelectedItem().equals("Seleccione Documento")) {
            JOptionPane.showMessageDialog(null, "SELECCIONE EL TIPO DE DOCUMENTO");
        } else if (this.nom.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "INGRESE LOS NOMBRES");
        } else if (this.apell.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "INGRESE LOS APELLIDOS");
        } else if (this.direc.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "INGRESE LA DIRECCIÓN");
        } else if (this.email.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "INGRESE UN CORREO");
        } else if (this.ncelu.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "INGRESE UN NÚMERO DE CELULAR");
        } else if (this.sexo.getSelectedItem().equals("Seleccione Género")) {
            JOptionPane.showMessageDialog(null, "SELECCIONE EL GÉNERO");
        } else if (this.carg.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "INGRESE UN CARGO");
        } else if (this.usu.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "INGRESE UN NOMBRE DE USUARIO");
        } else if (pass.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "INGRESE UNA CONTRASEÑA");
        } else if (this.rol.getSelectedItem().equals("Seleccione Rol")) {
            JOptionPane.showMessageDialog(null, "INGRESE UN ROL");
        } else {
            try {
                String Inde = this.Idus.getText();
                String nombre = this.nom.getText();
                String apelldio = this.apell.getText();
                String direcc = this.direc.getText();
                String Email = this.email.getText();
                String tele = this.ncelu.getText();
                String genero = (String) this.sexo.getSelectedItem();
                String cargo = this.carg.getText();
                String user = this.usu.getText();
                String pass = DigestUtils.md5Hex(this.pass.getText());
                String rol = (String) this.rol.getSelectedItem();
                String tipo = (String) this.tipos.getSelectedItem();

                usuario_C us = new usuario_C(Inde, nombre, apelldio, direcc, Email, tele, genero, cargo, user, pass, rol, tipo);

                usuario_DAO dao = new usuario_DAO();
                dao.modificar(us);
                limpiar();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Error al Modificar");
                System.out.println(e);
                System.out.println(e);
            }
        }
        actualizar();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        buscar();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void tablaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaMouseClicked
        int select = tabla.rowAtPoint(evt.getPoint());
        Idus.setText(String.valueOf(tabla.getValueAt(select, 0)));
        Idus.enable(false);
        guar.setEnabled(false);
        buscar();
    }//GEN-LAST:event_tablaMouseClicked

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        String id = menu.getIdent();
        this.setVisible(false);
        JPasswordField passwordField = new JPasswordField();
        Object[] obj = {"Validar Contraseña" + ":\n", passwordField};
        Object stringArray[] = {"Validar", "Cancelar"};
        if (JOptionPane.showOptionDialog(null, obj, "Contraseña",
                JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE,
                null, stringArray, obj) == JOptionPane.YES_OPTION) {
            try {
                char[] arrayC = passwordField.getPassword();
                String password = new String(arrayC);
                String ps = DigestUtils.md5Hex(password);
                String sql = "select * from usuario  where contrasena = '" + ps + "' and identificacion = '" + id + "'";
                Statement st = con.createStatement();
                ResultSet rs = st.executeQuery(sql);
                if (rs.next()) {
                    dispose();
                    cambio cm = new cambio();
                    menu.escritorio.add(cm);
                    cm.show();
                } else {
                    this.setVisible(true);
                }

            } catch (Exception e) {
                System.out.println(e);
            }
        } else {
            this.setVisible(true);
        }

    }//GEN-LAST:event_jButton3ActionPerformed

    private void IdusKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_IdusKeyTyped
        int code = (int) evt.getKeyChar();
        if (code >= 48 && code <= 57 || code == 8) {

        } else {
            evt.consume();
            getToolkit().beep();
            JOptionPane.showMessageDialog(null, "Solo Números", "ALERTA", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_IdusKeyTyped

    private void nceluKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nceluKeyTyped
        int code = (int) evt.getKeyChar();
        if (code >= 48 && code <= 57 || code == 8) {

        } else {
            evt.consume();
            getToolkit().beep();
            JOptionPane.showMessageDialog(null, "Solo Números", "ALERTA", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_nceluKeyTyped

    private void formInternalFrameIconified(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameIconified
        this.toFront();
    }//GEN-LAST:event_formInternalFrameIconified


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Idus;
    private javax.swing.JTextField apell;
    private javax.swing.JButton cancel;
    private javax.swing.JTextField carg;
    private javax.swing.JTextField direc;
    private javax.swing.JTextField email;
    private javax.swing.JButton guar;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField ncelu;
    private javax.swing.JTextField nom;
    private org.edisoncor.gui.panel.PanelImage panelImage1;
    private javax.swing.JPasswordField pass;
    private javax.swing.JComboBox<String> rol;
    private javax.swing.JComboBox<String> sexo;
    private javax.swing.JTable tabla;
    private javax.swing.JComboBox<String> tipos;
    private javax.swing.JTextField usu;
    // End of variables declaration//GEN-END:variables
    void limpiar() {
        Idus.setText("");
        tipos.setSelectedItem("Seleccione Documento");
        apell.setText("");
        carg.setText("");
        direc.setText("");
        email.setText("");
        ncelu.setText("");
        nom.setText("");
        pass.setText("");
        rol.setSelectedItem("Seleccione Rol");
        sexo.setSelectedItem("Seleccione Género");
        usu.setText("");
        Idus.enable(true);
        guar.setEnabled(true);
        tipos.enable(true);
    }

    public void actualizar() {
        modelo = new DefaultTableModel(null, titulos);
        String datos[] = new String[8];
        String sql = "SELECT * FROM  usuario";
        try {
            Statement st = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                datos[0] = rs.getString("identificacion");
                datos[1] = rs.getString("nombresus");
                datos[2] = rs.getString("apellidous");
                datos[3] = rs.getString("direccion");
                datos[4] = rs.getString("email");
                datos[5] = rs.getString("telefono");
                datos[6] = rs.getString("sexo");
                datos[7] = rs.getString("cargo");
                modelo.addRow(datos);
            }
            tabla.setModel(modelo);
        } catch (SQLException ex) {
            System.out.println("error" + ex);
        }
    }

    public void buscar() {
        Idus.enable(false);
        guar.setEnabled(false);
        tipos.enable(false);
        if (this.Idus.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "INGRESE UN N° DE IDENTIFICACIÓN");
            Idus.enable(true);
            guar.setEnabled(true);
        } else {
            try {
                String Inde = this.Idus.getText();
                String nombre = this.nom.getText();
                String apelldio = this.apell.getText();
                String direcc = this.direc.getText();
                String email = this.email.getText();
                String tele = this.ncelu.getText();
                String genero = (String) this.sexo.getSelectedItem();
                String cargo = this.carg.getText();
                String user = this.usu.getText();
                String pass = DigestUtils.md5Hex(this.pass.getText());
                String rol = (String) this.rol.getSelectedItem();
                String tipo = (String) this.tipos.getSelectedItem();

                usuario_C us = new usuario_C(Inde, nombre, apelldio, direcc, email, tele, genero, cargo, user, pass, rol, tipo);
                usuario_DAO dao = new usuario_DAO();
                dao.buscar(us);

                this.Idus.setText(us.getInde());
                this.tipos.setSelectedItem(us.getTipo());
                this.apell.setText(us.getApellido());
                this.carg.setText(us.getCargo());
                this.direc.setText(us.getDirecc());
                this.email.setText(us.getEmail());
                this.ncelu.setText(us.getTelef());
                this.nom.setText(us.getNombre());
                this.pass.setText(us.getPassword());
                this.rol.setSelectedItem(us.getRol());
                this.sexo.setSelectedItem(us.getGenero());
                this.usu.setText(us.getUser());

            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Error de busqueda");
                System.out.println(e);
            }
        }
    }
}
