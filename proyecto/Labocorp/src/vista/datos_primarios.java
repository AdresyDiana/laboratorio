package vista;

import java.sql.*;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
import modelo.*;
import java.util.Date;

public class datos_primarios extends javax.swing.JInternalFrame {

    SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
    Connection con = conexion.connection;
    String rols = menu.getRol();

    public datos_primarios() {
        initComponents();
        limpiar();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelImage1 = new org.edisoncor.gui.panel.PanelImage();
        jPanel4 = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel5 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        ahierro = new javax.swing.JComboBox<>();
        jLabel42 = new javax.swing.JLabel();
        asulfato = new javax.swing.JComboBox<>();
        jLabel31 = new javax.swing.JLabel();
        clororecidu = new javax.swing.JTextField();
        jLabel36 = new javax.swing.JLabel();
        calcio = new javax.swing.JTextField();
        jLabel45 = new javax.swing.JLabel();
        alcalinidad = new javax.swing.JTextField();
        cloruros = new javax.swing.JTextField();
        dureza = new javax.swing.JTextField();
        otros = new javax.swing.JTextField();
        jLabel35 = new javax.swing.JLabel();
        anitrito = new javax.swing.JComboBox<>();
        jLabel39 = new javax.swing.JLabel();
        fhierro = new com.toedter.calendar.JDateChooser();
        anitrato = new javax.swing.JComboBox<>();
        hierro = new javax.swing.JTextField();
        sulfato = new javax.swing.JTextField();
        aAluminio = new javax.swing.JComboBox<>();
        afosfato = new javax.swing.JComboBox<>();
        aclorolibre = new javax.swing.JComboBox<>();
        aotros = new javax.swing.JComboBox<>();
        jLabel49 = new javax.swing.JLabel();
        jLabel50 = new javax.swing.JLabel();
        fph = new com.toedter.calendar.JDateChooser();
        fconduc = new com.toedter.calendar.JDateChooser();
        fcolor = new com.toedter.calendar.JDateChooser();
        fturbi = new com.toedter.calendar.JDateChooser();
        fcalcio = new com.toedter.calendar.JDateChooser();
        fclororeci = new com.toedter.calendar.JDateChooser();
        nitrito = new javax.swing.JTextField();
        falcalinidad = new com.toedter.calendar.JDateChooser();
        nitrato = new javax.swing.JTextField();
        jLabel51 = new javax.swing.JLabel();
        aluminio = new javax.swing.JTextField();
        jLabel46 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jLabel52 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel53 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel54 = new javax.swing.JLabel();
        fcloruros = new com.toedter.calendar.JDateChooser();
        fdureza = new com.toedter.calendar.JDateChooser();
        adureza = new javax.swing.JComboBox<>();
        acloruros = new javax.swing.JComboBox<>();
        acalcio = new javax.swing.JComboBox<>();
        aconduc = new javax.swing.JComboBox<>();
        aclororecidual = new javax.swing.JComboBox<>();
        aph = new javax.swing.JComboBox<>();
        jLabel34 = new javax.swing.JLabel();
        acolor = new javax.swing.JComboBox<>();
        fnitrato = new com.toedter.calendar.JDateChooser();
        aAlcalinidad = new javax.swing.JComboBox<>();
        falumino = new com.toedter.calendar.JDateChooser();
        fFosfato = new com.toedter.calendar.JDateChooser();
        fclorolibre = new com.toedter.calendar.JDateChooser();
        fsulfato = new com.toedter.calendar.JDateChooser();
        jLabel16 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        obsgerenal1 = new javax.swing.JTextArea();
        jLabel12 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        ph = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        obs1 = new javax.swing.JTextArea();
        conduct = new javax.swing.JTextField();
        jLabel30 = new javax.swing.JLabel();
        reponsable1 = new javax.swing.JTextField();
        jLabel33 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        color = new javax.swing.JTextField();
        aturbi = new javax.swing.JComboBox<>();
        turbieda = new javax.swing.JTextField();
        fotros = new com.toedter.calendar.JDateChooser();
        jLabel37 = new javax.swing.JLabel();
        fnitrito = new com.toedter.calendar.JDateChooser();
        jLabel40 = new javax.swing.JLabel();
        fosfato = new javax.swing.JTextField();
        jLabel41 = new javax.swing.JLabel();
        clorolibre = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        hccoliformes = new javax.swing.JTextField();
        hpcoliformes = new javax.swing.JTextField();
        jLabel56 = new javax.swing.JLabel();
        hcmesolitos = new javax.swing.JTextField();
        jLabel43 = new javax.swing.JLabel();
        hpmesolitos = new javax.swing.JTextField();
        coliformes = new javax.swing.JTextField();
        jLabel32 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        obsgeneral2 = new javax.swing.JTextArea();
        escherichia = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        obs2 = new javax.swing.JTextArea();
        mesolitos = new javax.swing.JTextField();
        aescherichia = new javax.swing.JComboBox<>();
        jLabel44 = new javax.swing.JLabel();
        acoliformes = new javax.swing.JComboBox<>();
        amesolitos = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        interno = new javax.swing.JTextField();
        fcoliformes = new com.toedter.calendar.JDateChooser();
        fconteocoliformes = new com.toedter.calendar.JDateChooser();
        fmesolitos = new com.toedter.calendar.JDateChooser();
        fconteomesolitos = new com.toedter.calendar.JDateChooser();
        jLabel7 = new javax.swing.JLabel();
        respon2 = new javax.swing.JTextField();
        jLabel47 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        hcescherichia = new javax.swing.JTextField();
        jLabel28 = new javax.swing.JLabel();
        hpescherichia = new javax.swing.JTextField();
        fpescherichia = new com.toedter.calendar.JDateChooser();
        jLabel48 = new javax.swing.JLabel();
        fcontescerichia = new com.toedter.calendar.JDateChooser();
        jLabel55 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        fecharecep = new com.toedter.calendar.JDateChooser();
        jLabel13 = new javax.swing.JLabel();
        registro = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        hinicio = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        finicio = new com.toedter.calendar.JDateChooser();
        jLabel9 = new javax.swing.JLabel();
        huinicio = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        tinicio = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        hfin = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        ffin = new com.toedter.calendar.JDateChooser();
        jLabel17 = new javax.swing.JLabel();
        hufin = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        tfin = new javax.swing.JTextField();
        guardar = new javax.swing.JButton();
        modificar = new javax.swing.JButton();
        buscar = new javax.swing.JButton();
        limpiar = new javax.swing.JButton();
        jLabel57 = new javax.swing.JLabel();
        numreporte = new javax.swing.JTextField();

        setClosable(true);
        setIconifiable(true);
        setTitle("DATOS PRIMARIOS");
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

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "DATOS PRIMARIOS", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Cambria", 1, 18), new java.awt.Color(102, 102, 102))); // NOI18N
        jPanel4.setOpaque(false);

        jTabbedPane1.setForeground(new java.awt.Color(102, 102, 102));
        jTabbedPane1.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N

        jPanel5.setOpaque(false);

        jPanel6.setOpaque(false);

        ahierro.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Si", "No" }));

        jLabel42.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        jLabel42.setForeground(new java.awt.Color(102, 102, 102));
        jLabel42.setText("Otro:");

        asulfato.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Si", "No" }));

        jLabel31.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        jLabel31.setForeground(new java.awt.Color(102, 102, 102));
        jLabel31.setText("Cloro Residual Libre");

        jLabel36.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        jLabel36.setForeground(new java.awt.Color(102, 102, 102));
        jLabel36.setText("Calcio");

        jLabel45.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        jLabel45.setForeground(new java.awt.Color(102, 102, 102));
        jLabel45.setText("Alcalinidad Total");

        jLabel35.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        jLabel35.setForeground(new java.awt.Color(102, 102, 102));
        jLabel35.setText("Dureza Total");

        anitrito.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Si", "No" }));

        jLabel39.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        jLabel39.setForeground(new java.awt.Color(102, 102, 102));
        jLabel39.setText("Cloruros");

        anitrato.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Si", "No" }));

        aAluminio.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Si", "No" }));

        afosfato.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Si", "No" }));

        aclorolibre.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Si", "No" }));

        aotros.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Si", "No" }));

        jLabel49.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        jLabel49.setForeground(new java.awt.Color(102, 102, 102));
        jLabel49.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel49.setText("FECHA DE ENSAYO");
        jLabel49.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel50.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        jLabel50.setForeground(new java.awt.Color(102, 102, 102));
        jLabel50.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel50.setText("ENSAYO");
        jLabel50.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel51.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        jLabel51.setForeground(new java.awt.Color(102, 102, 102));
        jLabel51.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel51.setText("APLICA");
        jLabel51.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel46.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        jLabel46.setForeground(new java.awt.Color(102, 102, 102));
        jLabel46.setText("Aluminio");

        jLabel38.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        jLabel38.setForeground(new java.awt.Color(102, 102, 102));
        jLabel38.setText("Nitratos");

        jLabel52.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        jLabel52.setForeground(new java.awt.Color(102, 102, 102));
        jLabel52.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel52.setText("FECHA DE ENSAYO");
        jLabel52.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel25.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(102, 102, 102));
        jLabel25.setText("Nitritos");

        jLabel53.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        jLabel53.setForeground(new java.awt.Color(102, 102, 102));
        jLabel53.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel53.setText("ENSAYO");
        jLabel53.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel23.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(102, 102, 102));
        jLabel23.setText("Sulfatos");

        jLabel54.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        jLabel54.setForeground(new java.awt.Color(102, 102, 102));
        jLabel54.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel54.setText("APLICA");
        jLabel54.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        adureza.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Si", "No" }));

        acloruros.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Si", "No" }));

        acalcio.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Si", "No" }));

        aconduc.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Si", "No" }));

        aclororecidual.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Si", "No" }));

        aph.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Si", "No" }));

        jLabel34.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        jLabel34.setForeground(new java.awt.Color(102, 102, 102));
        jLabel34.setText("Hierro");

        acolor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Si", "No" }));

        aAlcalinidad.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Si", "No" }));

        jLabel16.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(102, 102, 102));
        jLabel16.setText("Observaciones generales de la rutina de análisis");

        obsgerenal1.setColumns(20);
        obsgerenal1.setLineWrap(true);
        obsgerenal1.setRows(5);
        jScrollPane4.setViewportView(obsgerenal1);

        jLabel12.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(102, 102, 102));
        jLabel12.setText("OBSERVACIONES ");

        jLabel29.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(102, 102, 102));
        jLabel29.setText("Color");

        obs1.setColumns(20);
        obs1.setLineWrap(true);
        obs1.setRows(5);
        jScrollPane1.setViewportView(obs1);

        jLabel30.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(102, 102, 102));
        jLabel30.setText("Turbiedad");

        jLabel33.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        jLabel33.setForeground(new java.awt.Color(102, 102, 102));
        jLabel33.setText("Conductividad");

        jLabel22.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(102, 102, 102));
        jLabel22.setText("Responsable");

        aturbi.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Si", "No" }));

        jLabel37.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        jLabel37.setForeground(new java.awt.Color(102, 102, 102));
        jLabel37.setText("pH");

        jLabel40.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        jLabel40.setForeground(new java.awt.Color(102, 102, 102));
        jLabel40.setText("Fosfatos");

        jLabel41.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        jLabel41.setForeground(new java.awt.Color(102, 102, 102));
        jLabel41.setText("Cloro Libre");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel12)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel51)
                                    .addComponent(acalcio, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(aAlcalinidad, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(acloruros, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(adureza, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(aclororecidual, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(aph, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(aconduc, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(acolor, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(aturbi, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel6Layout.createSequentialGroup()
                                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel31)
                                            .addComponent(jLabel30)
                                            .addComponent(jLabel33)
                                            .addComponent(jLabel29)
                                            .addComponent(jLabel37))
                                        .addGap(23, 23, 23)
                                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(conduct, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(clororecidu, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(turbieda, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(color, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(ph, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(jPanel6Layout.createSequentialGroup()
                                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addGroup(jPanel6Layout.createSequentialGroup()
                                                .addComponent(jLabel36, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addGap(23, 23, 23))
                                            .addGroup(jPanel6Layout.createSequentialGroup()
                                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jLabel39)
                                                    .addComponent(jLabel45)
                                                    .addComponent(jLabel35, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(14, 14, 14)))
                                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(cloruros, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(alcalinidad, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(calcio, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(dureza, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addComponent(jLabel50, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel49, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(fdureza, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(fph, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(fconduc, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(fcolor, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(fturbi, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(fclororeci, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(fcalcio, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(falcalinidad, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(fcloruros, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(32, 32, 32)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel6Layout.createSequentialGroup()
                            .addComponent(asulfato, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(470, 470, 470))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                            .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(ahierro, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(anitrito, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(469, 469, 469)))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(aotros, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel6Layout.createSequentialGroup()
                                            .addGap(1, 1, 1)
                                            .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(jPanel6Layout.createSequentialGroup()
                                                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jLabel25)
                                                        .addComponent(jLabel23))
                                                    .addGap(39, 39, 39)
                                                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                        .addComponent(sulfato, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(nitrito, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                    .addGap(18, 18, 18)
                                                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(fsulfato, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(fnitrito, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                .addGroup(jPanel6Layout.createSequentialGroup()
                                                    .addComponent(jLabel34)
                                                    .addGap(49, 49, 49)
                                                    .addComponent(hierro, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addGap(18, 18, 18)
                                                    .addComponent(fhierro, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                        .addGroup(jPanel6Layout.createSequentialGroup()
                                            .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel42)
                                                .addComponent(jLabel22))
                                            .addGap(12, 12, 12)
                                            .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(reponsable1, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGroup(jPanel6Layout.createSequentialGroup()
                                                    .addComponent(otros, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addGap(18, 18, 18)
                                                    .addComponent(fotros, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                    .addGroup(jPanel6Layout.createSequentialGroup()
                                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel54, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(anitrato, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(aAluminio, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(afosfato, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(aclorolibre, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(19, 19, 19)
                                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel6Layout.createSequentialGroup()
                                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                    .addComponent(jLabel41)
                                                    .addComponent(jLabel40))
                                                .addGap(19, 19, 19)
                                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                    .addComponent(fosfato, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(clorolibre, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                            .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                .addComponent(jLabel53, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel6Layout.createSequentialGroup()
                                                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jLabel38)
                                                        .addComponent(jLabel46))
                                                    .addGap(32, 32, 32)
                                                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                        .addComponent(aluminio, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(nitrato, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                        .addGap(19, 19, 19)
                                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(fnitrato, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(falumino, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(fFosfato, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(fclorolibre, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel52)))))
                            .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel16)
                                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 402, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(47, 47, 47))))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel51)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel50)
                                    .addComponent(jLabel49))
                                .addGap(16, 16, 16)
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(fdureza, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel6Layout.createSequentialGroup()
                                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                .addComponent(ph, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jLabel37)
                                                .addComponent(aph, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(fph, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                .addComponent(conduct, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jLabel33)
                                                .addComponent(aconduc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(fconduc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                .addComponent(color, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jLabel29)
                                                .addComponent(acolor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(fcolor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                .addComponent(turbieda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jLabel30)
                                                .addComponent(aturbi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(fturbi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel6Layout.createSequentialGroup()
                                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                    .addComponent(jLabel31)
                                                    .addComponent(clororecidu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(aclororecidual, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jLabel45)
                                                        .addComponent(aAlcalinidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                    .addGroup(jPanel6Layout.createSequentialGroup()
                                                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                            .addComponent(fcalcio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                            .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                                .addComponent(calcio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addComponent(jLabel36)
                                                                .addComponent(acalcio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                            .addComponent(alcalinidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                            .addComponent(falcalinidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                            .addComponent(fclororeci, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(11, 11, 11)
                                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                .addComponent(jLabel39)
                                                .addComponent(cloruros, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(acloruros, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(fcloruros, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel6Layout.createSequentialGroup()
                                                .addGap(12, 12, 12)
                                                .addComponent(adureza, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(jPanel6Layout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                    .addComponent(dureza, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(jLabel35))))))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel12)
                        .addGap(11, 11, 11)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel6Layout.createSequentialGroup()
                                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                                                .addComponent(jLabel53)
                                                .addGap(16, 16, 16))
                                            .addGroup(jPanel6Layout.createSequentialGroup()
                                                .addComponent(jLabel52)
                                                .addGap(18, 18, 18)))
                                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                .addComponent(jLabel38)
                                                .addComponent(nitrato, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(anitrato, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(fnitrato, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                .addComponent(jLabel46)
                                                .addComponent(aAluminio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(aluminio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(falumino, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(14, 14, 14)
                                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabel40)
                                            .addComponent(fosfato, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(afosfato, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addComponent(fFosfato, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel41)
                                        .addComponent(clorolibre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(aclorolibre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(fclorolibre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addComponent(jLabel54)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(asulfato, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(anitrito, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(ahierro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(aotros, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel23)
                                        .addComponent(sulfato, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(fsulfato, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel25)
                                        .addComponent(nitrito, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(fnitrito, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel34)
                                        .addComponent(hierro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(fhierro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel42)
                                        .addComponent(otros, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(fotros, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(reponsable1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel22))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel16)
                        .addGap(7, 7, 7)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(13, Short.MAX_VALUE))
        );

        fcolor.getAccessibleContext().setAccessibleName("");
        fturbi.getAccessibleContext().setAccessibleName("");
        fcalcio.getAccessibleContext().setAccessibleName("");
        fclororeci.getAccessibleContext().setAccessibleName("");
        falcalinidad.getAccessibleContext().setAccessibleName("");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, 949, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Resultados fisicoquímicos (Ensayo / unidades)", jPanel5);

        jPanel2.setOpaque(false);

        jLabel56.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        jLabel56.setForeground(new java.awt.Color(102, 102, 102));
        jLabel56.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel56.setText("APLICA");
        jLabel56.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel43.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        jLabel43.setForeground(new java.awt.Color(102, 102, 102));
        jLabel43.setText("Coliformes Totales");

        jLabel32.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        jLabel32.setForeground(new java.awt.Color(102, 102, 102));
        jLabel32.setText("OBSERVACIONES ");

        jLabel4.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(102, 102, 102));
        jLabel4.setText("Escherichia Coli");

        obsgeneral2.setColumns(20);
        obsgeneral2.setLineWrap(true);
        obsgeneral2.setRows(5);
        jScrollPane3.setViewportView(obsgeneral2);

        jLabel8.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(102, 102, 102));
        jLabel8.setText("Mesólitos");

        obs2.setColumns(20);
        obs2.setLineWrap(true);
        obs2.setRows(5);
        jScrollPane2.setViewportView(obs2);

        aescherichia.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Si", "No" }));

        jLabel44.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        jLabel44.setForeground(new java.awt.Color(102, 102, 102));
        jLabel44.setText("OBSERVACIONES GENERALES");

        acoliformes.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Si", "No" }));

        amesolitos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Si", "No" }));

        jLabel2.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 102, 102));
        jLabel2.setText("Interno Muestra");

        jLabel7.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(102, 102, 102));
        jLabel7.setText("Responsable");

        jLabel47.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        jLabel47.setForeground(new java.awt.Color(102, 102, 102));
        jLabel47.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel47.setText("HORA PREPARACIÓN");
        jLabel47.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel26.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(102, 102, 102));
        jLabel26.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel26.setText("FECHA PREPARACIÓN");
        jLabel26.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel28.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(102, 102, 102));
        jLabel28.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel28.setText("FECHA DE CONTEO");
        jLabel28.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel48.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        jLabel48.setForeground(new java.awt.Color(102, 102, 102));
        jLabel48.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel48.setText("HORA DE CONTEO");
        jLabel48.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel55.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        jLabel55.setForeground(new java.awt.Color(102, 102, 102));
        jLabel55.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel55.setText("ENSAYO");
        jLabel55.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel56, javax.swing.GroupLayout.DEFAULT_SIZE, 53, Short.MAX_VALUE)
                            .addComponent(aescherichia, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(acoliformes, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(amesolitos, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(30, 30, 30)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(escherichia, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel43)
                                    .addComponent(jLabel8))
                                .addGap(33, 33, 33)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(mesolitos, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(coliformes, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jLabel55, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(19, 19, 19)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(fmesolitos, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(fcoliformes, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(fpescherichia, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(39, 39, 39)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(fconteomesolitos, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(fconteocoliformes, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(fcontescerichia, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(hpcoliformes, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(hccoliformes, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(hpmesolitos, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(hcmesolitos, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(hpescherichia, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel47, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel48))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(hcescherichia, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(respon2, javax.swing.GroupLayout.PREFERRED_SIZE, 368, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel32)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 455, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(interno, javax.swing.GroupLayout.PREFERRED_SIZE, 374, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane3)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel44)
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addGap(18, 18, 18))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel55)
                    .addComponent(jLabel26)
                    .addComponent(jLabel28)
                    .addComponent(jLabel56)
                    .addComponent(jLabel47)
                    .addComponent(jLabel48))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(fcontescerichia, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(hpescherichia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(hcescherichia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(fconteocoliformes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(hpcoliformes)
                                        .addComponent(hccoliformes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(hpmesolitos)
                                        .addComponent(hcmesolitos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(fconteomesolitos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(fpescherichia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel4)
                                        .addComponent(escherichia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabel43)
                                            .addComponent(coliformes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(fcoliformes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(mesolitos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel8))
                                    .addComponent(fmesolitos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(aescherichia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(acoliformes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(amesolitos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(respon2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(interno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel44)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel32)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(168, 168, 168))
        );

        coliformes.getAccessibleContext().setAccessibleName("");
        escherichia.getAccessibleContext().setAccessibleName("");
        mesolitos.getAccessibleContext().setAccessibleName("");

        jTabbedPane1.addTab("Análisis Microbiológico", jPanel2);

        jPanel7.setInheritsPopupMenu(true);
        jPanel7.setOpaque(false);

        jLabel1.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 102, 102));
        jLabel1.setText("Fecha Recepción");

        jLabel13.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(102, 102, 102));
        jLabel13.setText("Consecutivo Registro");

        jLabel21.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(102, 102, 102));
        jLabel21.setText("Hora Inicio");

        jLabel15.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(102, 102, 102));
        jLabel15.setText("Fecha Inicio");

        jLabel9.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(102, 102, 102));
        jLabel9.setText("Humedad Inicio");

        jLabel18.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(102, 102, 102));
        jLabel18.setText("Temperetura Inicio");

        jLabel14.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(102, 102, 102));
        jLabel14.setText("Hora Final ");

        jLabel3.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 102, 102));
        jLabel3.setText("Fecha Final");

        jLabel17.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(102, 102, 102));
        jLabel17.setText("Humedad Final ");

        jLabel19.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(102, 102, 102));
        jLabel19.setText("Temperatura Final");

        guardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/editar-archivo-de-salvar-en-disco-icono-4876-32.png"))); // NOI18N
        guardar.setToolTipText("GUARDAR");
        guardar.setContentAreaFilled(false);
        guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardarActionPerformed(evt);
            }
        });

        modificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/editar-usuario-icono-9786-32.png"))); // NOI18N
        modificar.setToolTipText("MODIFICAR");
        modificar.setContentAreaFilled(false);
        modificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modificarActionPerformed(evt);
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

        limpiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/eliminar-cancelar-icono-4935-16.png"))); // NOI18N
        limpiar.setToolTipText("CANCELAR");
        limpiar.setContentAreaFilled(false);
        limpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                limpiarActionPerformed(evt);
            }
        });

        jLabel57.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel57.setForeground(new java.awt.Color(102, 102, 102));
        jLabel57.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel57.setText("Número de Reporte");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                                .addComponent(guardar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(modificar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(buscar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(limpiar)
                                .addGap(13, 13, 13))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel7Layout.createSequentialGroup()
                                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(fecharecep, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel13)
                                            .addComponent(registro, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(jPanel7Layout.createSequentialGroup()
                                        .addComponent(huinicio, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(hufin, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel7Layout.createSequentialGroup()
                                        .addComponent(tinicio, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(tfin, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel7Layout.createSequentialGroup()
                                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel21)
                                            .addComponent(hinicio, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel15))
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel3)
                                            .addComponent(hfin, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel14)))
                                    .addGroup(jPanel7Layout.createSequentialGroup()
                                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(finicio, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel9))
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(ffin, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(jPanel7Layout.createSequentialGroup()
                                        .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap())))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(numreporte, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel57, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel13))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(fecharecep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(registro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel21)
                    .addComponent(jLabel14))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(hinicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(hfin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(finicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ffin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addComponent(jLabel17))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(huinicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(hufin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(jLabel19))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tinicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel57, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(numreporte, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(guardar, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(buscar, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(limpiar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(modificar, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(486, 486, 486))
        );

        fecharecep.getAccessibleContext().setAccessibleName("");
        registro.getAccessibleContext().setAccessibleName("");
        hinicio.getAccessibleContext().setAccessibleName("");
        finicio.getAccessibleContext().setAccessibleName("");
        huinicio.getAccessibleContext().setAccessibleName("");
        tinicio.getAccessibleContext().setAccessibleName("");
        hfin.getAccessibleContext().setAccessibleName("");
        ffin.getAccessibleContext().setAccessibleName("");
        hufin.getAccessibleContext().setAccessibleName("");
        tfin.getAccessibleContext().setAccessibleName("");
        numreporte.getAccessibleContext().setAccessibleName("");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTabbedPane1)
                    .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout panelImage1Layout = new javax.swing.GroupLayout(panelImage1);
        panelImage1.setLayout(panelImage1Layout);
        panelImage1Layout.setHorizontalGroup(
            panelImage1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelImage1Layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        panelImage1Layout.setVerticalGroup(
            panelImage1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelImage1Layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(1, 1, 1))
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

    private void guardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardarActionPerformed
        try {
            String fecharecep = formato.format(this.fecharecep.getDate());
            String registro = this.registro.getText();
            String hinicio = this.hinicio.getText();
            String hfin = this.hfin.getText();
            String finicio = formato.format(this.finicio.getDate());
            String ffin = formato.format(this.ffin.getDate());
            String huinicio = this.huinicio.getText();
            String hufin = this.hufin.getText();
            String tinicio = this.tinicio.getText();
            String tfin = this.tfin.getText();

            String aph = (String) this.aph.getSelectedItem();
            String ph = this.ph.getText();
            String fph = formato.format(this.fph.getDate());
            String aconduct = (String) this.aconduc.getSelectedItem();
            String conduct = this.conduct.getText();
            String fconduct = formato.format(this.fconduc.getDate());
            String acolor = (String) this.acolor.getSelectedItem();
            String color = this.color.getText();
            String fcolor = formato.format(this.fcolor.getDate());
            String aturbi = (String) this.aturbi.getSelectedItem();
            String turbi = this.turbieda.getText();
            String fturbi = formato.format(this.fturbi.getDate());
            String aclororecid = (String) this.aclororecidual.getSelectedItem();
            String clororecid = this.clororecidu.getText();
            String fclororecid = formato.format(this.fclororeci.getDate());
            String acalcio = (String) this.acalcio.getSelectedItem();
            String calcio = this.calcio.getText();
            String fcalcio = formato.format(this.fcalcio.getDate());
            String aAlcalinidad = (String) this.aAlcalinidad.getSelectedItem();
            String alcalinidad = this.alcalinidad.getText();
            String falcalinidad = formato.format(this.falcalinidad.getDate());
            String acloruros = (String) this.acloruros.getSelectedItem();
            String cloruros = this.cloruros.getText();
            String fcloruros = formato.format(this.fcloruros.getDate());
            String adureza = (String) this.adureza.getSelectedItem();
            String dureza = this.dureza.getText();
            String fdureza = formato.format(this.fdureza.getDate());
            String anitrato = (String) this.anitrato.getSelectedItem();
            String nitrato = this.nitrato.getText();
            String fnitrato = formato.format(this.fnitrato.getDate());
            String afosfato = (String) this.afosfato.getSelectedItem();
            String fosfato = this.fosfato.getText();
            String fFosfato = formato.format(this.fFosfato.getDate());
            String aAluminio = (String) this.aAluminio.getSelectedItem();
            String aluminio = this.aluminio.getText();
            String faluminio = formato.format(this.falumino.getDate());
            String aclorolibre = (String) this.aclorolibre.getSelectedItem();
            String clorolibre = this.clorolibre.getText();
            String fclorolibre = formato.format(this.fclorolibre.getDate());
            String asulfato = (String) this.asulfato.getSelectedItem();
            String sulfato = this.sulfato.getText();
            String fsulfato = formato.format(this.fsulfato.getDate());
            String anitrito = (String) this.anitrito.getSelectedItem();
            String nitrito = this.nitrito.getText();
            String fnitrito = formato.format(this.fnitrito.getDate());
            String ahierro = (String) this.ahierro.getSelectedItem();
            String hierro = this.hierro.getText();
            String fhierro = formato.format(this.fhierro.getDate());
            String aotros = (String) this.aotros.getSelectedItem();
            String otros = this.otros.getText();
            String fotros = formato.format(this.fotros.getDate());
            String obs1 = this.obs1.getText();
            String obsgeneral1 = this.obsgerenal1.getText();
            String repon1 = this.reponsable1.getText();

            String aescherichia = (String) this.aescherichia.getSelectedItem();
            String acoliformes = (String) this.acoliformes.getSelectedItem();
            String amesolitos = (String) this.amesolitos.getSelectedItem();
            String escherichia = this.escherichia.getText();
            String coliformes = this.coliformes.getText();
            String mesolitos = this.mesolitos.getText();
            String fpescerichia = formato.format(this.fpescherichia.getDate());
            String fpcoliformes = formato.format(this.fcoliformes.getDate());
            String fpmesolitos = formato.format(this.fmesolitos.getDate());
            String fcescherichia = formato.format(this.fcontescerichia.getDate());
            String fccoliformes = formato.format(this.fconteocoliformes.getDate());
            String fcmesolitos = formato.format(this.fconteomesolitos.getDate());
            String hpescherichia = this.hpescherichia.getText();
            String hpcoliformes = this.hpcoliformes.getText();
            String hpmesolitos = this.hpmesolitos.getText();
            String hcescherichia = this.hcescherichia.getText();
            String hccoliformes = this.hccoliformes.getText();
            String hcmesolitos = this.hcmesolitos.getText();
            String obs2 = this.obs2.getText();
            String obsgeneral2 = this.obsgeneral2.getText();
            String repon2 = this.respon2.getText();
            String interno = this.interno.getText();
            String Num_reporte = this.numreporte.getText();
            String indeti = menu.getIdent();

            datos_C da = new datos_C(fecharecep, registro, hinicio, hfin, finicio, ffin, huinicio, hufin, tinicio, tfin, aph, ph, fph, aconduct, conduct, fconduct, acolor, color, fcolor, aturbi, turbi, fturbi, aclororecid, clororecid, fclororecid, acalcio, calcio, fcalcio, aAlcalinidad, alcalinidad, falcalinidad, acloruros, cloruros, fcloruros, adureza, dureza, fdureza, anitrato, nitrato, fnitrato, afosfato, fosfato, fFosfato, aAluminio, aluminio, faluminio, aclorolibre, clorolibre, fclorolibre, asulfato, sulfato, fsulfato, anitrito, nitrito, fnitrito, ahierro, hierro, fhierro, aotros, otros, fotros, obs1, obsgeneral1, repon1, aescherichia, acoliformes, amesolitos, escherichia, coliformes, mesolitos, fpescerichia, fpcoliformes, fpmesolitos, fcescherichia, fccoliformes, fcmesolitos, hpescherichia, hpcoliformes, hpmesolitos, hcescherichia, hccoliformes, hcmesolitos, obs2, obsgeneral2, repon2, interno, Num_reporte, indeti);
            datos_DAO dao = new datos_DAO();
            dao.insertar(da);
            limpiar();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al Guardar Registro");
            System.out.println(e);
        }
    }//GEN-LAST:event_guardarActionPerformed

    private void modificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modificarActionPerformed
        try {
            String fecharecep = formato.format(this.fecharecep.getDate());
            String registro = this.registro.getText();
            String hinicio = this.hinicio.getText();
            String hfin = this.hfin.getText();
            String finicio = formato.format(this.finicio.getDate());
            String ffin = formato.format(this.ffin.getDate());
            String huinicio = this.huinicio.getText();
            String hufin = this.hufin.getText();
            String tinicio = this.tinicio.getText();
            String tfin = this.tfin.getText();

            String aph = (String) this.aph.getSelectedItem();
            String ph = this.ph.getText();
            String fph = formato.format(this.fph.getDate());
            String aconduct = (String) this.aconduc.getSelectedItem();
            String conduct = this.conduct.getText();
            String fconduct = formato.format(this.fconduc.getDate());
            String acolor = (String) this.acolor.getSelectedItem();
            String color = this.color.getText();
            String fcolor = formato.format(this.fcolor.getDate());
            String aturbi = (String) this.aturbi.getSelectedItem();
            String turbi = this.turbieda.getText();
            String fturbi = formato.format(this.fturbi.getDate());
            String aclororecid = (String) this.aclororecidual.getSelectedItem();
            String clororecid = this.clororecidu.getText();
            String fclororecid = formato.format(this.fclororeci.getDate());
            String acalcio = (String) this.acalcio.getSelectedItem();
            String calcio = this.calcio.getText();
            String fcalcio = formato.format(this.fcalcio.getDate());
            String aAlcalinidad = (String) this.aAlcalinidad.getSelectedItem();
            String alcalinidad = this.alcalinidad.getText();
            String falcalinidad = formato.format(this.falcalinidad.getDate());
            String acloruros = (String) this.acloruros.getSelectedItem();
            String cloruros = this.cloruros.getText();
            String fcloruros = formato.format(this.fcloruros.getDate());
            String adureza = (String) this.adureza.getSelectedItem();
            String dureza = this.dureza.getText();
            String fdureza = formato.format(this.fdureza.getDate());
            String anitrato = (String) this.anitrato.getSelectedItem();
            String nitrato = this.nitrato.getText();
            String fnitrato = formato.format(this.fnitrato.getDate());
            String afosfato = (String) this.afosfato.getSelectedItem();
            String fosfato = this.fosfato.getText();
            String fFosfato = formato.format(this.fFosfato.getDate());
            String aAluminio = (String) this.aAluminio.getSelectedItem();
            String aluminio = this.aluminio.getText();
            String faluminio = formato.format(this.falumino.getDate());
            String aclorolibre = (String) this.aclorolibre.getSelectedItem();
            String clorolibre = this.clorolibre.getText();
            String fclorolibre = formato.format(this.fclorolibre.getDate());
            String asulfato = (String) this.asulfato.getSelectedItem();
            String sulfato = this.sulfato.getText();
            String fsulfato = formato.format(this.fsulfato.getDate());
            String anitrito = (String) this.anitrito.getSelectedItem();
            String nitrito = this.nitrito.getText();
            String fnitrito = formato.format(this.fnitrito.getDate());
            String ahierro = (String) this.ahierro.getSelectedItem();
            String hierro = this.hierro.getText();
            String fhierro = formato.format(this.fhierro.getDate());
            String aotros = (String) this.aotros.getSelectedItem();
            String otros = this.otros.getText();
            String fotros = formato.format(this.fotros.getDate());
            String obs1 = this.obs1.getText();
            String obsgeneral1 = this.obsgerenal1.getText();
            String repon1 = this.reponsable1.getText();

            String aescherichia = (String) this.aescherichia.getSelectedItem();
            String acoliformes = (String) this.acoliformes.getSelectedItem();
            String amesolitos = (String) this.amesolitos.getSelectedItem();
            String escherichia = this.escherichia.getText();
            String coliformes = this.coliformes.getText();
            String mesolitos = this.mesolitos.getText();
            String fpescerichia = formato.format(this.fpescherichia.getDate());
            String fpcoliformes = formato.format(this.fcoliformes.getDate());
            String fpmesolitos = formato.format(this.fmesolitos.getDate());
            String fcescherichia = formato.format(this.fcontescerichia.getDate());
            String fccoliformes = formato.format(this.fconteocoliformes.getDate());
            String fcmesolitos = formato.format(this.fconteomesolitos.getDate());
            String hpescherichia = this.hpescherichia.getText();
            String hpcoliformes = this.hpcoliformes.getText();
            String hpmesolitos = this.hpmesolitos.getText();
            String hcescherichia = this.hcescherichia.getText();
            String hccoliformes = this.hccoliformes.getText();
            String hcmesolitos = this.hcmesolitos.getText();
            String obs2 = this.obs2.getText();
            String obsgeneral2 = this.obsgeneral2.getText();
            String repon2 = this.respon2.getText();
            String interno = this.interno.getText();
            String Num_reporte = this.numreporte.getText();
            String indeti = menu.getIdent();

            datos_C da = new datos_C(fecharecep, registro, hinicio, hfin, finicio, ffin, huinicio, hufin, tinicio, tfin, aph, ph, fph, aconduct, conduct, fconduct, acolor, color, fcolor, aturbi, turbi, fturbi, aclororecid, clororecid, fclororecid, acalcio, calcio, fcalcio, aAlcalinidad, alcalinidad, falcalinidad, acloruros, cloruros, fcloruros, adureza, dureza, fdureza, anitrato, nitrato, fnitrato, afosfato, fosfato, fFosfato, aAluminio, aluminio, faluminio, aclorolibre, clorolibre, fclorolibre, asulfato, sulfato, fsulfato, anitrito, nitrito, fnitrito, ahierro, hierro, fhierro, aotros, otros, fotros, obs1, obsgeneral1, repon1, aescherichia, acoliformes, amesolitos, escherichia, coliformes, mesolitos, fpescerichia, fpcoliformes, fpmesolitos, fcescherichia, fccoliformes, fcmesolitos, hpescherichia, hpcoliformes, hpmesolitos, hcescherichia, hccoliformes, hcmesolitos, obs2, obsgeneral2, repon2, interno, Num_reporte, indeti);
            datos_DAO dao = new datos_DAO();
            dao.modificar(da);
            limpiar();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error Al Modificar Registro");
            System.out.println(e);
        }
    }//GEN-LAST:event_modificarActionPerformed

    private void buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarActionPerformed
        try {
            guardar.setEnabled(false);
            this.registro.enable(false);
            this.numreporte.enable(false);
            String fecharecep = formato.format(this.fecharecep.getDate());
            String registro = this.registro.getText();
            String hinicio = this.hinicio.getText();
            String hfin = this.hfin.getText();
            String finicio = formato.format(this.finicio.getDate());
            String ffin = formato.format(this.ffin.getDate());
            String huinicio = this.huinicio.getText();
            String hufin = this.hufin.getText();
            String tinicio = this.tinicio.getText();
            String tfin = this.tfin.getText();

            String aph = (String) this.aph.getSelectedItem();
            String ph = this.ph.getText();
            String fph = formato.format(this.fph.getDate());
            String aconduct = (String) this.aconduc.getSelectedItem();
            String conduct = this.conduct.getText();
            String fconduct = formato.format(this.fconduc.getDate());
            String acolor = (String) this.acolor.getSelectedItem();
            String color = this.color.getText();
            String fcolor = formato.format(this.fcolor.getDate());
            String aturbi = (String) this.aturbi.getSelectedItem();
            String turbi = this.turbieda.getText();
            String fturbi = formato.format(this.fturbi.getDate());
            String aclororecid = (String) this.aclororecidual.getSelectedItem();
            String clororecid = this.clororecidu.getText();
            String fclororecid = formato.format(this.fclororeci.getDate());
            String acalcio = (String) this.acalcio.getSelectedItem();
            String calcio = this.calcio.getText();
            String fcalcio = formato.format(this.fcalcio.getDate());
            String aAlcalinidad = (String) this.aAlcalinidad.getSelectedItem();
            String alcalinidad = this.alcalinidad.getText();
            String falcalinidad = formato.format(this.falcalinidad.getDate());
            String acloruros = (String) this.acloruros.getSelectedItem();
            String cloruros = this.cloruros.getText();
            String fcloruros = formato.format(this.fcloruros.getDate());
            String adureza = (String) this.adureza.getSelectedItem();
            String dureza = this.dureza.getText();
            String fdureza = formato.format(this.fdureza.getDate());
            String anitrato = (String) this.anitrato.getSelectedItem();
            String nitrato = this.nitrato.getText();
            String fnitrato = formato.format(this.fnitrato.getDate());
            String afosfato = (String) this.afosfato.getSelectedItem();
            String fosfato = this.fosfato.getText();
            String fFosfato = formato.format(this.fFosfato.getDate());
            String aAluminio = (String) this.aAluminio.getSelectedItem();
            String aluminio = this.aluminio.getText();
            String faluminio = formato.format(this.falumino.getDate());
            String aclorolibre = (String) this.aclorolibre.getSelectedItem();
            String clorolibre = this.clorolibre.getText();
            String fclorolibre = formato.format(this.fclorolibre.getDate());
            String asulfato = (String) this.asulfato.getSelectedItem();
            String sulfato = this.sulfato.getText();
            String fsulfato = formato.format(this.fsulfato.getDate());
            String anitrito = (String) this.anitrito.getSelectedItem();
            String nitrito = this.nitrito.getText();
            String fnitrito = formato.format(this.fnitrito.getDate());
            String ahierro = (String) this.ahierro.getSelectedItem();
            String hierro = this.hierro.getText();
            String fhierro = formato.format(this.fhierro.getDate());
            String aotros = (String) this.aotros.getSelectedItem();
            String otros = this.otros.getText();
            String fotros = formato.format(this.fotros.getDate());
            String obs1 = this.obs1.getText();
            String obsgeneral1 = this.obsgerenal1.getText();
            String repon1 = this.reponsable1.getText();

            String aescherichia = (String) this.aescherichia.getSelectedItem();
            String acoliformes = (String) this.acoliformes.getSelectedItem();
            String amesolitos = (String) this.amesolitos.getSelectedItem();
            String escherichia = this.escherichia.getText();
            String coliformes = this.coliformes.getText();
            String mesolitos = this.mesolitos.getText();
            String fpescerichia = formato.format(this.fpescherichia.getDate());
            String fpcoliformes = formato.format(this.fcoliformes.getDate());
            String fpmesolitos = formato.format(this.fmesolitos.getDate());
            String fcescherichia = formato.format(this.fcontescerichia.getDate());
            String fccoliformes = formato.format(this.fconteocoliformes.getDate());
            String fcmesolitos = formato.format(this.fconteomesolitos.getDate());
            String hpescherichia = this.hpescherichia.getText();
            String hpcoliformes = this.hpcoliformes.getText();
            String hpmesolitos = this.hpmesolitos.getText();
            String hcescherichia = this.hcescherichia.getText();
            String hccoliformes = this.hccoliformes.getText();
            String hcmesolitos = this.hcmesolitos.getText();
            String obs2 = this.obs2.getText();
            String obsgeneral2 = this.obsgeneral2.getText();
            String repon2 = this.respon2.getText();
            String interno = this.interno.getText();
            String Num_reporte = this.numreporte.getText();
            String indeti = menu.getIdent();

            datos_C da = new datos_C(fecharecep, registro, hinicio, hfin, finicio, ffin, huinicio, hufin, tinicio, tfin, aph, ph, fph, aconduct, conduct, fconduct, acolor, color, fcolor, aturbi, turbi, fturbi, aclororecid, clororecid, fclororecid, acalcio, calcio, fcalcio, aAlcalinidad, alcalinidad, falcalinidad, acloruros, cloruros, fcloruros, adureza, dureza, fdureza, anitrato, nitrato, fnitrato, afosfato, fosfato, fFosfato, aAluminio, aluminio, faluminio, aclorolibre, clorolibre, fclorolibre, asulfato, sulfato, fsulfato, anitrito, nitrito, fnitrito, ahierro, hierro, fhierro, aotros, otros, fotros, obs1, obsgeneral1, repon1, aescherichia, acoliformes, amesolitos, escherichia, coliformes, mesolitos, fpescerichia, fpcoliformes, fpmesolitos, fcescherichia, fccoliformes, fcmesolitos, hpescherichia, hpcoliformes, hpmesolitos, hcescherichia, hccoliformes, hcmesolitos, obs2, obsgeneral2, repon2, interno, Num_reporte, indeti);
            datos_DAO dao = new datos_DAO();
            dao.buscar(da);

            this.registro.setText(da.getRegistro());
            this.hinicio.setText(da.getHinicio());
            this.hfin.setText(da.getHfin());
            this.huinicio.setText(da.getHuinicio());
            this.hufin.setText(da.getHufin());
            this.tinicio.setText(da.getTinicio());
            this.tfin.setText(da.getTfin());
            this.aescherichia.setSelectedItem(da.getAescherichia());
            this.acoliformes.setSelectedItem(da.getAcoliformes());
            this.amesolitos.setSelectedItem(da.getAmesolitos());
            this.escherichia.setText(da.getEscherichia());
            this.coliformes.setText(da.getColiformes());
            this.mesolitos.setText(da.getMesolitos());
            this.hpescherichia.setText(da.getHpescherichia());
            this.hpcoliformes.setText(da.getHpcoliformes());
            this.hpmesolitos.setText(da.getHpmesolitos());
            this.hcescherichia.setText(da.getHcescherichia());
            this.hccoliformes.setText(da.getHccoliformes());
            this.hcmesolitos.setText(da.getHcmesolitos());
            this.respon2.setText(da.getRepon2());
            this.obs2.setText(da.getObs2());
            this.obsgeneral2.setText(da.getObsgeneral2());
            this.interno.setText(da.getInterno());
            this.aph.setSelectedItem(da.getAph());
            this.ph.setText(da.getPh());
            this.aconduc.setSelectedItem(da.getAconduct());
            this.conduct.setText(da.getConduct());
            this.acolor.setSelectedItem(da.getAcolor());
            this.color.setText(da.getColor());
            this.aturbi.setSelectedItem(da.getAturbi());
            this.turbieda.setText(da.getTurbi());
            this.aclororecidual.setSelectedItem(da.getAclororecid());
            this.clororecidu.setText(da.getClororecid());
            this.acalcio.setSelectedItem(da.getAcalcio());
            this.calcio.setText(da.getCalcio());
            this.aAlcalinidad.setSelectedItem(da.getaAlcalinidad());
            this.alcalinidad.setText(da.getAlcalinidad());
            this.acloruros.setSelectedItem(da.getAcloruros());
            this.cloruros.setText(da.getCloruros());
            this.adureza.setSelectedItem(da.getAdureza());
            this.dureza.setText(da.getDureza());
            this.anitrato.setSelectedItem(da.getAnitrato());
            this.nitrato.setText(da.getNitrato());
            this.afosfato.setSelectedItem(da.getAfosfato());
            this.fosfato.setText(da.getFosfato());
            this.aAluminio.setSelectedItem(da.getaAluminio());
            this.aluminio.setText(da.getAluminio());
            this.aclorolibre.setSelectedItem(da.getAclorolibre());
            this.clorolibre.setText(da.getClorolibre());
            this.asulfato.setSelectedItem(da.getAsulfato());
            this.sulfato.setText(da.getSulfato());
            this.anitrito.setSelectedItem(da.getAnitrito());
            this.nitrito.setText(da.getNitrito());
            this.ahierro.setSelectedItem(da.getAhierro());
            this.hierro.setText(da.getHierro());
            this.aotros.setSelectedItem(da.getAotros());
            this.otros.setText(da.getOtros());
            this.obs1.setText(da.getObs1());
            this.obsgerenal1.setText(da.getObsgeneral1());
            this.reponsable1.setText(da.getRepon1());
            this.numreporte.setText(da.getNum_reporte());
            try {
                this.fecharecep.setDate(formato.parse(da.getFecharecep()));
                this.finicio.setDate(formato.parse(da.getFinicio()));
                this.ffin.setDate(formato.parse(da.getFfin()));
                this.fpescherichia.setDate(formato.parse(da.getFpescerichia()));
                this.fcoliformes.setDate(formato.parse(da.getFpcoliformes()));
                this.fmesolitos.setDate(formato.parse(da.getFpmesolitos()));
                this.fcontescerichia.setDate(formato.parse(da.getFcescherichia()));
                this.fconteocoliformes.setDate(formato.parse(da.getFccoliformes()));
                this.fconteomesolitos.setDate(formato.parse(da.getFcmesolitos()));
                this.fph.setDate(formato.parse(da.getFph()));
                this.fconduc.setDate(formato.parse(da.getFconduct()));
                this.fcolor.setDate(formato.parse(da.getFcolor()));
                this.fturbi.setDate(formato.parse(da.getFturbi()));
                this.fclororeci.setDate(formato.parse(da.getFclororecid()));
                this.fcalcio.setDate(formato.parse(da.getFcalcio()));
                this.falcalinidad.setDate(formato.parse(da.getFalcalinidad()));
                this.fcloruros.setDate(formato.parse(da.getFcloruros()));
                this.fdureza.setDate(formato.parse(da.getFdureza()));
                this.fnitrato.setDate(formato.parse(da.getFnitrato()));
                this.fFosfato.setDate(formato.parse(da.getfFosfato()));
                this.falumino.setDate(formato.parse(da.getFaluminio()));
                this.fclorolibre.setDate(formato.parse(da.getFclorolibre()));
                this.fsulfato.setDate(formato.parse(da.getSulfato()));
                this.fnitrito.setDate(formato.parse(da.getFnitrito()));
                this.fhierro.setDate(formato.parse(da.getFhierro()));
                this.fotros.setDate(formato.parse(da.getFotros()));
            } catch (Exception e) {
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error de búsqueda");
            System.out.println(e);
        }
    }//GEN-LAST:event_buscarActionPerformed

    private void limpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limpiarActionPerformed
        limpiar();
    }//GEN-LAST:event_limpiarActionPerformed

    private void formInternalFrameIconified(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameIconified
        this.toFront();
    }//GEN-LAST:event_formInternalFrameIconified

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> aAlcalinidad;
    private javax.swing.JComboBox<String> aAluminio;
    private javax.swing.JComboBox<String> acalcio;
    private javax.swing.JComboBox<String> aclorolibre;
    private javax.swing.JComboBox<String> aclororecidual;
    private javax.swing.JComboBox<String> acloruros;
    private javax.swing.JComboBox<String> acoliformes;
    private javax.swing.JComboBox<String> acolor;
    private javax.swing.JComboBox<String> aconduc;
    private javax.swing.JComboBox<String> adureza;
    private javax.swing.JComboBox<String> aescherichia;
    private javax.swing.JComboBox<String> afosfato;
    private javax.swing.JComboBox<String> ahierro;
    private javax.swing.JTextField alcalinidad;
    private javax.swing.JTextField aluminio;
    private javax.swing.JComboBox<String> amesolitos;
    private javax.swing.JComboBox<String> anitrato;
    private javax.swing.JComboBox<String> anitrito;
    private javax.swing.JComboBox<String> aotros;
    private javax.swing.JComboBox<String> aph;
    private javax.swing.JComboBox<String> asulfato;
    private javax.swing.JComboBox<String> aturbi;
    private javax.swing.JButton buscar;
    private javax.swing.JTextField calcio;
    private javax.swing.JTextField clorolibre;
    private javax.swing.JTextField clororecidu;
    private javax.swing.JTextField cloruros;
    private javax.swing.JTextField coliformes;
    private javax.swing.JTextField color;
    private javax.swing.JTextField conduct;
    private javax.swing.JTextField dureza;
    private javax.swing.JTextField escherichia;
    private com.toedter.calendar.JDateChooser fFosfato;
    private com.toedter.calendar.JDateChooser falcalinidad;
    private com.toedter.calendar.JDateChooser falumino;
    private com.toedter.calendar.JDateChooser fcalcio;
    private com.toedter.calendar.JDateChooser fclorolibre;
    private com.toedter.calendar.JDateChooser fclororeci;
    private com.toedter.calendar.JDateChooser fcloruros;
    private com.toedter.calendar.JDateChooser fcoliformes;
    private com.toedter.calendar.JDateChooser fcolor;
    private com.toedter.calendar.JDateChooser fconduc;
    private com.toedter.calendar.JDateChooser fconteocoliformes;
    private com.toedter.calendar.JDateChooser fconteomesolitos;
    private com.toedter.calendar.JDateChooser fcontescerichia;
    private com.toedter.calendar.JDateChooser fdureza;
    private com.toedter.calendar.JDateChooser fecharecep;
    private com.toedter.calendar.JDateChooser ffin;
    private com.toedter.calendar.JDateChooser fhierro;
    private com.toedter.calendar.JDateChooser finicio;
    private com.toedter.calendar.JDateChooser fmesolitos;
    private com.toedter.calendar.JDateChooser fnitrato;
    private com.toedter.calendar.JDateChooser fnitrito;
    private javax.swing.JTextField fosfato;
    private com.toedter.calendar.JDateChooser fotros;
    private com.toedter.calendar.JDateChooser fpescherichia;
    private com.toedter.calendar.JDateChooser fph;
    private com.toedter.calendar.JDateChooser fsulfato;
    private com.toedter.calendar.JDateChooser fturbi;
    private javax.swing.JButton guardar;
    private javax.swing.JTextField hccoliformes;
    private javax.swing.JTextField hcescherichia;
    private javax.swing.JTextField hcmesolitos;
    private javax.swing.JTextField hfin;
    private javax.swing.JTextField hierro;
    private javax.swing.JTextField hinicio;
    private javax.swing.JTextField hpcoliformes;
    private javax.swing.JTextField hpescherichia;
    private javax.swing.JTextField hpmesolitos;
    private javax.swing.JTextField hufin;
    private javax.swing.JTextField huinicio;
    private javax.swing.JTextField interno;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
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
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JButton limpiar;
    private javax.swing.JTextField mesolitos;
    private javax.swing.JButton modificar;
    private javax.swing.JTextField nitrato;
    private javax.swing.JTextField nitrito;
    private javax.swing.JTextField numreporte;
    private javax.swing.JTextArea obs1;
    private javax.swing.JTextArea obs2;
    private javax.swing.JTextArea obsgeneral2;
    private javax.swing.JTextArea obsgerenal1;
    private javax.swing.JTextField otros;
    private org.edisoncor.gui.panel.PanelImage panelImage1;
    private javax.swing.JTextField ph;
    private javax.swing.JTextField registro;
    private javax.swing.JTextField reponsable1;
    private javax.swing.JTextField respon2;
    private javax.swing.JTextField sulfato;
    private javax.swing.JTextField tfin;
    private javax.swing.JTextField tinicio;
    private javax.swing.JTextField turbieda;
    // End of variables declaration//GEN-END:variables

    public void limpiar() {
        if (rols.equals("Director técnico")) {
            guardar.setEnabled(false);
            modificar.setEnabled(false);
        } else if (rols.equals("Líder de calidad")) {
            guardar.setEnabled(false);
            modificar.setEnabled(false);
        } else if (rols.equals("Analista")) {
            guardar.setEnabled(true);
            modificar.setEnabled(true);
        } else if (rols.equals("Técnico")) {
            guardar.setEnabled(true);
            modificar.setEnabled(true);
        } else {
            guardar.setEnabled(false);
            modificar.setEnabled(false);
        }
        this.registro.enable(true);
        this.numreporte.enable(true);
        this.registro.setText("");
        this.hinicio.setText("");
        this.hfin.setText("");
        this.huinicio.setText("");
        this.hufin.setText("");
        this.tinicio.setText("");
        this.tfin.setText("");
        this.aescherichia.setSelectedItem("Si");
        this.acoliformes.setSelectedItem("Si");
        this.amesolitos.setSelectedItem("Si");
        this.escherichia.setText("");
        this.coliformes.setText("");
        this.mesolitos.setText("");
        this.hpescherichia.setText("");
        this.hpcoliformes.setText("");
        this.hpmesolitos.setText("");
        this.hcescherichia.setText("");
        this.hccoliformes.setText("");
        this.hcmesolitos.setText("");
        this.respon2.setText("");
        this.obs2.setText("");
        this.obsgeneral2.setText("");
        this.interno.setText("");
        this.aph.setSelectedItem("Si");
        this.ph.setText("");
        this.aconduc.setSelectedItem("Si");
        this.conduct.setText("");
        this.acolor.setSelectedItem("Si");
        this.color.setText("");
        this.aturbi.setSelectedItem("Si");
        this.turbieda.setText("");
        this.aclororecidual.setSelectedItem("Si");
        this.clororecidu.setText("");
        this.acalcio.setSelectedItem("Si");
        this.calcio.setText("");
        this.aAlcalinidad.setSelectedItem("Si");
        this.alcalinidad.setText("");
        this.acloruros.setSelectedItem("Si");
        this.cloruros.setText("");
        this.adureza.setSelectedItem("Si");
        this.dureza.setText("");
        this.anitrato.setSelectedItem("Si");
        this.nitrato.setText("");
        this.afosfato.setSelectedItem("Si");
        this.fosfato.setText("");
        this.aAluminio.setSelectedItem("Si");
        this.aluminio.setText("");
        this.aclorolibre.setSelectedItem("Si");
        this.clorolibre.setText("");
        this.asulfato.setSelectedItem("Si");
        this.sulfato.setText("");
        this.anitrito.setSelectedItem("Si");
        this.nitrito.setText("");
        this.ahierro.setSelectedItem("Si");
        this.hierro.setText("");
        this.aotros.setSelectedItem("Si");
        this.otros.setText("");
        this.obs1.setText("");
        this.obsgerenal1.setText("");
        this.reponsable1.setText("");
        this.numreporte.setText("");

        Date hoy = new Date();

        this.fecharecep.setDate(hoy);
        this.finicio.setDate(hoy);
        this.ffin.setDate(hoy);
        this.fpescherichia.setDate(hoy);
        this.fcoliformes.setDate(hoy);
        this.fmesolitos.setDate(hoy);
        this.fcontescerichia.setDate(hoy);
        this.fconteocoliformes.setDate(hoy);
        this.fconteomesolitos.setDate(hoy);
        this.fph.setDate(hoy);
        this.fconduc.setDate(hoy);
        this.fcolor.setDate(hoy);
        this.fturbi.setDate(hoy);
        this.fclororeci.setDate(hoy);
        this.fcalcio.setDate(hoy);
        this.falcalinidad.setDate(hoy);
        this.fcloruros.setDate(hoy);
        this.fdureza.setDate(hoy);
        this.fnitrato.setDate(hoy);
        this.fFosfato.setDate(hoy);
        this.falumino.setDate(hoy);
        this.fclorolibre.setDate(hoy);
        this.fsulfato.setDate(hoy);
        this.fnitrito.setDate(hoy);
        this.fhierro.setDate(hoy);
        this.fotros.setDate(hoy);
    }

}
