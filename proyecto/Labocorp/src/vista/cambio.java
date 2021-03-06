package vista;

import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import modelo.cambio_C;
import modelo.cambio_DAO;
import modelo.conexion;

/**
 *
 * @author Andrés Felipe Rincón Sánchez
 */
public class cambio extends javax.swing.JInternalFrame {

    /**
     * Creates new form cambio
     */
    public cambio() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelImage1 = new org.edisoncor.gui.panel.PanelImage();
        cambios = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        Idus = new javax.swing.JTextField();
        nom = new javax.swing.JTextField();
        apell = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        nuevo = new javax.swing.JTextField();
        cancel = new javax.swing.JButton();
        tipos = new javax.swing.JComboBox<>();

        setTitle("ACTUALIZAR DATOS");

        panelImage1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/reg.jpg"))); // NOI18N

        cambios.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "ACTUALIZAR N° IDENTIFICACIÓN", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 18), new java.awt.Color(102, 102, 102))); // NOI18N
        cambios.setOpaque(false);

        jLabel1.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 102, 102));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel1.setText("Tipo Documento");

        jLabel5.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(102, 102, 102));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel5.setText("Apellidos");

        Idus.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                IdusKeyTyped(evt);
            }
        });

        nom.setEnabled(false);

        apell.setEnabled(false);
        apell.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                apellActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 102, 102));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel2.setText("Nombres");

        jLabel3.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 102, 102));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel3.setText("N° Identificación");

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/editar-usuario-icono-9786-32.png"))); // NOI18N
        jButton1.setToolTipText("MODIFICAR");
        jButton1.setContentAreaFilled(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/zoom-icono-9136-32.png"))); // NOI18N
        jButton2.setToolTipText("BUSCAR");
        jButton2.setContentAreaFilled(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/salir-de-mi-perfil-icono-3964-16.png"))); // NOI18N
        jButton3.setToolTipText("Regresar");
        jButton3.setContentAreaFilled(false);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(102, 102, 102));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel4.setText("Nuevo N° Identificación");

        nuevo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                nuevoKeyTyped(evt);
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

        tipos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione Documento", "Cédula de Ciudadanía", "Tarjeta de Identidad", "Cédula de Extranjería", "Registro Civil" }));

        javax.swing.GroupLayout cambiosLayout = new javax.swing.GroupLayout(cambios);
        cambios.setLayout(cambiosLayout);
        cambiosLayout.setHorizontalGroup(
            cambiosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 396, Short.MAX_VALUE)
            .addGroup(cambiosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(cambiosLayout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(cambiosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(cambiosLayout.createSequentialGroup()
                            .addComponent(jLabel3)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Idus, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, cambiosLayout.createSequentialGroup()
                            .addGroup(cambiosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel5)
                                .addComponent(jLabel2)
                                .addComponent(jLabel1)
                                .addComponent(jLabel4))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                            .addGroup(cambiosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, cambiosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(nuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(apell)
                                    .addComponent(nom, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(tipos, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(cambiosLayout.createSequentialGroup()
                            .addComponent(jButton2)
                            .addGap(18, 18, 18)
                            .addComponent(cancel, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE)
                            .addGap(31, 31, 31)
                            .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(jButton1)))
                    .addContainerGap()))
        );
        cambiosLayout.setVerticalGroup(
            cambiosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 225, Short.MAX_VALUE)
            .addGroup(cambiosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(cambiosLayout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(cambiosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3)
                        .addComponent(Idus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addGroup(cambiosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1)
                        .addComponent(tipos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(cambiosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(nom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addGroup(cambiosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel5)
                        .addComponent(apell, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addGroup(cambiosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel4)
                        .addComponent(nuevo))
                    .addGap(18, 18, 18)
                    .addGroup(cambiosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jButton2)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton1)
                        .addComponent(cancel, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addContainerGap()))
        );

        javax.swing.GroupLayout panelImage1Layout = new javax.swing.GroupLayout(panelImage1);
        panelImage1.setLayout(panelImage1Layout);
        panelImage1Layout.setHorizontalGroup(
            panelImage1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelImage1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(cambios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelImage1Layout.setVerticalGroup(
            panelImage1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelImage1Layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(cambios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelImage1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelImage1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelActionPerformed
        limpiar();
    }//GEN-LAST:event_cancelActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        dispose();
        ingresar cm = new ingresar();
        menu.escritorio.add(cm);
        cm.show();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        buscar();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if (this.Idus.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "INGRESE UN N° DE IDENTIFICACIÓN");
        } else if (this.nom.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "INGRESE LOS NOMBRES");
        } else if (this.tipos.getSelectedItem().equals("Seleccione Documento")) {
            System.out.println("SELECCIONE EL TIPO DE DOCUMENTO");
        } else if (this.apell.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "INGRESE LOS APELLIDOS");
        } else {
            try {
                String inden = this.Idus.getText();
                String tipo = (String) this.tipos.getSelectedItem();
                String nombre = this.nom.getText();
                String apellido = this.apell.getText();
                String nuevoident = this.nuevo.getText();

                cambio_C cmb = new cambio_C(inden, tipo, nombre, apellido, nuevoident);
                cambio_DAO dao = new cambio_DAO();
                dao.modificar(cmb);

                limpiar();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Error al Actualizar");
                System.out.println(e);
            }
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void apellActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_apellActionPerformed

    }//GEN-LAST:event_apellActionPerformed

    private void IdusKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_IdusKeyTyped
       int code = (int) evt.getKeyChar();
        if (code >= 48 && code <= 57 || code == 8) {

        } else {
            evt.consume();
            getToolkit().beep();
            JOptionPane.showMessageDialog(null, "Solo Números", "ALERTA", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_IdusKeyTyped

    private void nuevoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nuevoKeyTyped
       int code = (int) evt.getKeyChar();
        if (code >= 48 && code <= 57 || code == 8) {

        } else {
            evt.consume();
            getToolkit().beep();
            JOptionPane.showMessageDialog(null, "Solo Números", "ALERTA", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_nuevoKeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Idus;
    private javax.swing.JTextField apell;
    private javax.swing.JPanel cambios;
    private javax.swing.JButton cancel;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField nom;
    private javax.swing.JTextField nuevo;
    private org.edisoncor.gui.panel.PanelImage panelImage1;
    private javax.swing.JComboBox<String> tipos;
    // End of variables declaration//GEN-END:variables
 void limpiar() {
        Idus.setText("");
        tipos.setSelectedItem("Seleccione Documento");
        apell.setText("");
        nom.setText("");
        Idus.enable(true);
        nuevo.setText("");
    }

    public void buscar() {
        Idus.enable(false);
        if (this.Idus.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "INGRESE UN N° DE IDENTIFICACIÓN");
            Idus.enable(true);
        } else {
            String id = this.Idus.getText();
            try {
                Statement st = conexion.connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
                ResultSet rs = st.executeQuery("SELECT * FROM usuario where identificacion ='" + id + "'");
                if (rs.next()) {
                    this.nom.setText(rs.getString("nombresus"));
                    this.apell.setText(rs.getString("apellidous"));
                    this.tipos.setSelectedItem(rs.getString("tipo"));
                } else {
                    JOptionPane.showMessageDialog(null, "Usuario no existe");
                    limpiar();
                }
            } catch (Exception e) {
                System.out.println("Error de busqueda");
                System.out.println(e);
            }
        }
    }
}
