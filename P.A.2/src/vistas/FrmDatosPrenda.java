/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vistas;

import javax.swing.ButtonGroup;
import javax.swing.JOptionPane;
import principal.*;

/**
 *
 * @author edgar
 */
public class FrmDatosPrenda extends javax.swing.JFrame {

    /**
     * Creates new form DatosPrenda
     */
    public FrmDatosPrenda() {
        initComponents();
        this.setLocationRelativeTo(null);
        ButtonGroup grupo1 = new ButtonGroup();
        grupo1.add(jRBalgodon);
        grupo1.add(jRBlino);
        grupo1.add(jRBmezclilla);
        grupo1.add(jRBpoliester);
        ButtonGroup grupo2 = new ButtonGroup();
        grupo2.add(jRBxch);
        grupo2.add(jRBch);
        grupo2.add(jRBm);
        grupo2.add(jRBl);
        grupo2.add(jRBxl);
        ButtonGroup grupop = new ButtonGroup();
        grupop.add(jCbPantalon);
        grupop.add(jCbPlayera);
        grupop.add(jCbCamisa);
        grupop.add(jCbSudadera1);
        grupop.add(jCbSueter);

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
        jPanel3 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jCbPlayera = new javax.swing.JCheckBox();
        jCbCamisa = new javax.swing.JCheckBox();
        jCbSueter = new javax.swing.JCheckBox();
        jCbSudadera1 = new javax.swing.JCheckBox();
        jCbPantalon = new javax.swing.JCheckBox();
        JLboxPrenda1 = new javax.swing.JLabel();
        JLboxPrenda2 = new javax.swing.JLabel();
        JLboxPrenda3 = new javax.swing.JLabel();
        JLboxPrenda4 = new javax.swing.JLabel();
        JLboxPrenda5 = new javax.swing.JLabel();
        jButtonRegresar = new javax.swing.JButton();
        jButtonNext = new javax.swing.JButton();
        panel1 = new java.awt.Panel();
        jLabel6 = new javax.swing.JLabel();
        jPanelTipoTela = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jRBalgodon = new javax.swing.JRadioButton();
        jRBlino = new javax.swing.JRadioButton();
        jRBmezclilla = new javax.swing.JRadioButton();
        jRBpoliester = new javax.swing.JRadioButton();
        jLabel13 = new javax.swing.JLabel();
        jPanelCantidad = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jTextFieldCantidades = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jPanelTalla = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        jRBch = new javax.swing.JRadioButton();
        jRBm = new javax.swing.JRadioButton();
        jRBxch = new javax.swing.JRadioButton();
        jRBl = new javax.swing.JRadioButton();
        jRBxl = new javax.swing.JRadioButton();
        jCbSudadera = new javax.swing.JCheckBox();
        jLabel18 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("datos de la prenda");
        setResizable(false);

        jPanel3.setBackground(new java.awt.Color(202, 250, 238));
        jPanel3.setMinimumSize(new java.awt.Dimension(1200, 680));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setMinimumSize(new java.awt.Dimension(1150, 630));
        jPanel2.setPreferredSize(new java.awt.Dimension(1150, 630));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jCbPlayera.setContentAreaFilled(false);
        jPanel2.add(jCbPlayera, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 160, 190, 160));

        jCbCamisa.setContentAreaFilled(false);
        jPanel2.add(jCbCamisa, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 160, 190, 160));

        jCbSueter.setContentAreaFilled(false);
        jPanel2.add(jCbSueter, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 160, 190, 160));

        jCbSudadera1.setContentAreaFilled(false);
        jPanel2.add(jCbSudadera1, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 160, 190, 160));

        jCbPantalon.setBorder(null);
        jCbPantalon.setContentAreaFilled(false);
        jPanel2.add(jCbPantalon, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, 190, 160));

        JLboxPrenda1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesUser/boxPantalon.png"))); // NOI18N
        jPanel2.add(JLboxPrenda1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 150, 210, -1));

        JLboxPrenda2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesUser/boxPlayera.png"))); // NOI18N
        jPanel2.add(JLboxPrenda2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 150, -1, -1));

        JLboxPrenda3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesUser/boxCamisa.png"))); // NOI18N
        jPanel2.add(JLboxPrenda3, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 150, -1, -1));

        JLboxPrenda4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesUser/boxSudadera.png"))); // NOI18N
        jPanel2.add(JLboxPrenda4, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 150, -1, -1));

        JLboxPrenda5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesUser/boxSueter.png"))); // NOI18N
        jPanel2.add(JLboxPrenda5, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 150, -1, -1));

        jButtonRegresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesAdmin/ExitLogo.png"))); // NOI18N
        jButtonRegresar.setBorder(null);
        jButtonRegresar.setContentAreaFilled(false);
        jButtonRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRegresarActionPerformed(evt);
            }
        });
        jPanel2.add(jButtonRegresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 540, -1, -1));

        jButtonNext.setBackground(new java.awt.Color(255, 255, 255));
        jButtonNext.setForeground(new java.awt.Color(255, 255, 255));
        jButtonNext.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes1/btnNext (1).png"))); // NOI18N
        jButtonNext.setBorder(null);
        jButtonNext.setBorderPainted(false);
        jButtonNext.setContentAreaFilled(false);
        jButtonNext.setFocusPainted(false);
        jButtonNext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNextActionPerformed(evt);
            }
        });
        jPanel2.add(jButtonNext, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 540, -1, -1));

        panel1.setBackground(new java.awt.Color(96, 204, 225));

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 28)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("A continuacion, ingresa los datos de cada prenda");

        javax.swing.GroupLayout panel1Layout = new javax.swing.GroupLayout(panel1);
        panel1.setLayout(panel1Layout);
        panel1Layout.setHorizontalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel1Layout.createSequentialGroup()
                .addContainerGap(204, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addGap(165, 165, 165))
        );
        panel1Layout.setVerticalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addGap(21, 21, 21))
        );

        jPanel2.add(panel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 1050, 50));

        jPanelTipoTela.setBackground(new java.awt.Color(124, 233, 254));

        jPanel4.setBackground(new java.awt.Color(213, 248, 255));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Ingresa el tipo de tela de la ");
        jPanel4.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 11, 230, 10));

        jLabel14.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("prenda");
        jLabel14.setToolTipText("");
        jPanel4.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 27, 230, -1));

        jRBalgodon.setText("Algodon");
        jPanel4.add(jRBalgodon, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 49, 212, -1));

        jRBlino.setBackground(new java.awt.Color(170, 233, 252));
        jRBlino.setText("Lino");
        jPanel4.add(jRBlino, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 212, -1));

        jRBmezclilla.setText("Mezclilla");
        jPanel4.add(jRBmezclilla, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 212, -1));

        jRBpoliester.setBackground(new java.awt.Color(170, 233, 252));
        jRBpoliester.setText("Políester");
        jPanel4.add(jRBpoliester, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, 212, -1));

        jLabel13.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("Tipo de tela");
        jLabel13.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanelTipoTelaLayout = new javax.swing.GroupLayout(jPanelTipoTela);
        jPanelTipoTela.setLayout(jPanelTipoTelaLayout);
        jPanelTipoTelaLayout.setHorizontalGroup(
            jPanelTipoTelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanelTipoTelaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanelTipoTelaLayout.setVerticalGroup(
            jPanelTipoTelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelTipoTelaLayout.createSequentialGroup()
                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, 192, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel2.add(jPanelTipoTela, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 370, 250, 230));

        jPanelCantidad.setBackground(new java.awt.Color(26, 143, 196));

        jPanel6.setBackground(new java.awt.Color(213, 248, 255));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel15.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setText("(Maximo: 30)");
        jPanel6.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 200, 19));

        jTextFieldCantidades.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextFieldCantidades.setBorder(null);
        jTextFieldCantidades.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldCantidadesActionPerformed(evt);
            }
        });
        jTextFieldCantidades.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldCantidadesKeyTyped(evt);
            }
        });
        jPanel6.add(jTextFieldCantidades, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 64, 190, 40));

        jLabel19.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel19.setText("Ingresa la cantidad de");
        jPanel6.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 200, 19));

        jLabel20.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel20.setText("prendas que deseas calcular");
        jPanel6.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 200, 19));

        jLabel17.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setText("Cantidad");
        jLabel17.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanelCantidadLayout = new javax.swing.GroupLayout(jPanelCantidad);
        jPanelCantidad.setLayout(jPanelCantidadLayout);
        jPanelCantidadLayout.setHorizontalGroup(
            jPanelCantidadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCantidadLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanelCantidadLayout.setVerticalGroup(
            jPanelCantidadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCantidadLayout.createSequentialGroup()
                .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.add(jPanelCantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 370, 220, 150));

        jPanelTalla.setBackground(new java.awt.Color(124, 233, 254));
        jPanelTalla.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel7.setBackground(new java.awt.Color(213, 248, 255));
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel16.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setText("Ingresa la talla de la prenda ");
        jPanel7.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 11, 240, 19));

        jRBch.setBackground(new java.awt.Color(170, 233, 252));
        jRBch.setText("CH");
        jPanel7.add(jRBch, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 70, 220, -1));

        jRBm.setText("M");
        jRBm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRBmActionPerformed(evt);
            }
        });
        jPanel7.add(jRBm, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 100, 220, -1));

        jRBxch.setText("XCH");
        jPanel7.add(jRBxch, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 43, 220, 20));

        jRBl.setBackground(new java.awt.Color(170, 233, 252));
        jRBl.setText("L");
        jPanel7.add(jRBl, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 130, 220, -1));

        jRBxl.setText("XL");
        jPanel7.add(jRBxl, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 160, 220, -1));

        jCbSudadera.setContentAreaFilled(false);
        jPanel7.add(jCbSudadera, new org.netbeans.lib.awtextra.AbsoluteConstraints(-90, 30, 210, 180));

        jPanelTalla.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 27, 240, 190));

        jLabel18.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel18.setText("Talla");
        jLabel18.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanelTalla.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 250, -1));

        jPanel2.add(jPanelTalla, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 370, 250, 230));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes1/base_b.png"))); // NOI18N
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 540, -1, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes1/mc_sup_derecha.png"))); // NOI18N
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 0, -1, -1));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes1/line_b.png"))); // NOI18N
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 520, -1, -1));

        jLabel10.setBackground(new java.awt.Color(255, 255, 255));
        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes1/line_t.png"))); // NOI18N
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 470, -1, -1));

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes1/image (1).png"))); // NOI18N
        jPanel2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 110));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesUser/btnIngresar.png"))); // NOI18N
        jButton1.setBorder(null);
        jButton1.setContentAreaFilled(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 530, -1, -1));

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesUser/btnInfo.png"))); // NOI18N
        jButton2.setBorder(null);
        jButton2.setContentAreaFilled(false);
        jPanel2.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 430, -1, -1));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 1049, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(26, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 1125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonNextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNextActionPerformed
        FrmVistaDatos vistadatos = new FrmVistaDatos();
        vistadatos.setVisible(true);
        this.dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonNextActionPerformed

    private void jButtonRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRegresarActionPerformed
        FrmSeleccionPrenda seleccion = new FrmSeleccionPrenda();
        seleccion.setVisible(true);
        this.dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonRegresarActionPerformed

    private void jTextFieldCantidadesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldCantidadesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldCantidadesActionPerformed

    private void jRBmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRBmActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRBmActionPerformed

    private void jTextFieldCantidadesKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldCantidadesKeyTyped


    }//GEN-LAST:event_jTextFieldCantidadesKeyTyped

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        int prenda = 0;
        int tela = 0;
        int talla = 0;
        int totalprenda = 0;

//Seleccion de prenda
        if (jCbPantalon.isSelected()) {
            Pantalon pantalon = new Pantalon();

            JOptionPane.showMessageDialog(this, "Selecciono Pantalon");
            prenda = 1;

//Selecccion de tela
            if (jRBalgodon.isSelected()) {
                JOptionPane.showMessageDialog(this, "Selecciono Algodon");
                tela = 1;
            } else if (jRBlino.isSelected()) {
                JOptionPane.showMessageDialog(this, "Selecciono Lino");
                tela = 2;
            } else if (jRBmezclilla.isSelected()) {
                JOptionPane.showMessageDialog(this, "Selecciono Mezclilla");
                tela = 3;
            } else if (jRBpoliester.isSelected()) {
                JOptionPane.showMessageDialog(this, "Selecciono Poliester");
                tela = 4;
            } else {
                JOptionPane.showMessageDialog(this, "Seleccione una tela");
            }

//Seleccion de talla
            if (jRBxch.isSelected()) {
                JOptionPane.showMessageDialog(this, "Selecciono XCH");
                talla = 1;
            } else if (jRBch.isSelected()) {
                JOptionPane.showMessageDialog(this, "Selecciono CH");
                talla = 2;
            } else if (jRBm.isSelected()) {
                JOptionPane.showMessageDialog(this, "Selecciono M");
                talla = 3;
            } else if (jRBl.isSelected()) {
                JOptionPane.showMessageDialog(this, "Selecciono L");
                talla = 4;
            } else if (jRBxl.isSelected()) {
                JOptionPane.showMessageDialog(this, "Selecciono XL");
                talla = 5;
            } else {
                JOptionPane.showMessageDialog(this, "Seleccione una talla");
            }
            if (FuncionesProgram.isNumeric(jTextFieldCantidades.getText())) {
                JOptionPane.showMessageDialog(this, "Es numero");
                totalprenda = Integer.parseInt(jTextFieldCantidades.getText());
            } else {
                JOptionPane.showMessageDialog(this, "Ingresa solo numeros o numeros menores a 30");
            }
            JOptionPane.showMessageDialog(this, "tela es: " + tela + "\n" + "talla es: " + talla + "\n" + "cantidad es: " + totalprenda);
            pantalon.DatosPantalon(tela, talla, totalprenda);

        } else if (jCbPlayera.isSelected()) {
            Playera playera = new Playera();
            JOptionPane.showMessageDialog(this, "Selecciono Playera");
            prenda = 2;
//Selecccion de tela
            if (jRBalgodon.isSelected()) {
                JOptionPane.showMessageDialog(this, "Selecciono Algodon");
                tela = 1;
            } else if (jRBlino.isSelected()) {
                JOptionPane.showMessageDialog(this, "Selecciono Lino");
                tela = 2;
            } else if (jRBmezclilla.isSelected()) {
                JOptionPane.showMessageDialog(this, "Selecciono Mezclilla");
                tela = 3;
            } else if (jRBpoliester.isSelected()) {
                JOptionPane.showMessageDialog(this, "Selecciono Poliester");
                tela = 4;
            } else {
                JOptionPane.showMessageDialog(this, "Seleccione una tela");
            }

//Seleccion de talla
            if (jRBxch.isSelected()) {
                JOptionPane.showMessageDialog(this, "Selecciono XCH");
                talla = 1;
            } else if (jRBch.isSelected()) {
                JOptionPane.showMessageDialog(this, "Selecciono CH");
                talla = 2;
            } else if (jRBm.isSelected()) {
                JOptionPane.showMessageDialog(this, "Selecciono M");
                talla = 3;
            } else if (jRBl.isSelected()) {
                JOptionPane.showMessageDialog(this, "Selecciono L");
                talla = 4;
            } else if (jRBxl.isSelected()) {
                JOptionPane.showMessageDialog(this, "Selecciono XL");
                talla = 5;
            } else {
                JOptionPane.showMessageDialog(this, "Seleccione una talla");
            }

            if (FuncionesProgram.isNumeric(jTextFieldCantidades.getText())) {
                JOptionPane.showMessageDialog(this, "Es numero");
                totalprenda = Integer.parseInt(jTextFieldCantidades.getText());
            } else {
                JOptionPane.showMessageDialog(this, "Ingresa solo numeros o numeros menores a 30");
            }
            JOptionPane.showMessageDialog(this, "tela es: " + tela + "\n" + "talla es: " + talla + "\n" + "cantidad es: " + totalprenda);
            playera.DatosPlayera(tela, talla, totalprenda);

        } else if (jCbCamisa.isSelected()) {
            Camisa camisa = new Camisa();
            JOptionPane.showMessageDialog(this, "Selecciono Camisa");
            prenda = 3;
//Selecccion de tela
            if (jRBalgodon.isSelected()) {
                JOptionPane.showMessageDialog(this, "Selecciono Algodon");
                tela = 1;
            } else if (jRBlino.isSelected()) {
                JOptionPane.showMessageDialog(this, "Selecciono Lino");
                tela = 2;
            } else if (jRBmezclilla.isSelected()) {
                JOptionPane.showMessageDialog(this, "Selecciono Mezclilla");
                tela = 3;
            } else if (jRBpoliester.isSelected()) {
                JOptionPane.showMessageDialog(this, "Selecciono Poliester");
                tela = 4;
            } else {
                JOptionPane.showMessageDialog(this, "Seleccione una tela");
            }

//Seleccion de talla
            if (jRBxch.isSelected()) {
                JOptionPane.showMessageDialog(this, "Selecciono XCH");
                talla = 1;
            } else if (jRBch.isSelected()) {
                JOptionPane.showMessageDialog(this, "Selecciono CH");
                talla = 2;
            } else if (jRBm.isSelected()) {
                JOptionPane.showMessageDialog(this, "Selecciono M");
                talla = 3;
            } else if (jRBl.isSelected()) {
                JOptionPane.showMessageDialog(this, "Selecciono L");
                talla = 4;
            } else if (jRBxl.isSelected()) {
                JOptionPane.showMessageDialog(this, "Selecciono XL");
                talla = 5;
            } else {
                JOptionPane.showMessageDialog(this, "Seleccione una talla");
            }
            if (FuncionesProgram.isNumeric(jTextFieldCantidades.getText())) {
                JOptionPane.showMessageDialog(this, "Es numero");
                totalprenda = Integer.parseInt(jTextFieldCantidades.getText());
            } else {
                JOptionPane.showMessageDialog(this, "Ingresa solo numeros o numeros menores a 30");
            }
            JOptionPane.showMessageDialog(this, "tela es: " + tela + "\n" + "talla es: " + talla + "\n" + "cantidad es: " + totalprenda);
            camisa.DatosCamisa(tela, talla, totalprenda);


        } else if (jCbSudadera.isSelected()) {
            JOptionPane.showMessageDialog(this, "Selecciono Sudadera");
            prenda = 4;
//Selecccion de tela
            if (jRBalgodon.isSelected()) {
                JOptionPane.showMessageDialog(this, "Selecciono Algodon");
                tela = 1;
            } else if (jRBlino.isSelected()) {
                JOptionPane.showMessageDialog(this, "Selecciono Lino");
                tela = 2;
            } else if (jRBmezclilla.isSelected()) {
                JOptionPane.showMessageDialog(this, "Selecciono Mezclilla");
                tela = 3;
            } else if (jRBpoliester.isSelected()) {
                JOptionPane.showMessageDialog(this, "Selecciono Poliester");
                tela = 4;
            } else {
                JOptionPane.showMessageDialog(this, "Seleccione una tela");
            }

//Seleccion de talla
            if (jRBxch.isSelected()) {
                JOptionPane.showMessageDialog(this, "Selecciono XCH");
                talla = 1;
            } else if (jRBch.isSelected()) {
                JOptionPane.showMessageDialog(this, "Selecciono CH");
                talla = 2;
            } else if (jRBm.isSelected()) {
                JOptionPane.showMessageDialog(this, "Selecciono M");
                talla = 3;
            } else if (jRBl.isSelected()) {
                JOptionPane.showMessageDialog(this, "Selecciono L");
                talla = 4;
            } else if (jRBxl.isSelected()) {
                JOptionPane.showMessageDialog(this, "Selecciono XL");
                talla = 5;
            } else {
                JOptionPane.showMessageDialog(this, "Seleccione una talla");
            }
        } else if (jCbSueter.isSelected()) {
            JOptionPane.showMessageDialog(this, "Selecciono Sueter");
            prenda = 5;
//Selecccion de tela
            if (jRBalgodon.isSelected()) {
                JOptionPane.showMessageDialog(this, "Selecciono Algodon");
                tela = 1;
            } else if (jRBlino.isSelected()) {
                JOptionPane.showMessageDialog(this, "Selecciono Lino");
                tela = 2;
            } else if (jRBmezclilla.isSelected()) {
                JOptionPane.showMessageDialog(this, "Selecciono Mezclilla");
                tela = 3;
            } else if (jRBpoliester.isSelected()) {
                JOptionPane.showMessageDialog(this, "Selecciono Poliester");
                tela = 4;
            } else {
                JOptionPane.showMessageDialog(this, "Seleccione una tela");
            }

//Seleccion de talla
            if (jRBxch.isSelected()) {
                JOptionPane.showMessageDialog(this, "Selecciono XCH");
                talla = 1;
            } else if (jRBch.isSelected()) {
                JOptionPane.showMessageDialog(this, "Selecciono CH");
                talla = 2;
            } else if (jRBm.isSelected()) {
                JOptionPane.showMessageDialog(this, "Selecciono M");
                talla = 3;
            } else if (jRBl.isSelected()) {
                JOptionPane.showMessageDialog(this, "Selecciono L");
                talla = 4;
            } else if (jRBxl.isSelected()) {
                JOptionPane.showMessageDialog(this, "Selecciono XL");
                talla = 5;
            } else {
                JOptionPane.showMessageDialog(this, "Seleccione una talla");
            }
        } else {
            JOptionPane.showMessageDialog(this, "Seleccione alguna de las prendas");
        }

        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FrmDatosPrenda.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmDatosPrenda.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmDatosPrenda.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmDatosPrenda.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmDatosPrenda().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel JLboxPrenda1;
    private javax.swing.JLabel JLboxPrenda2;
    private javax.swing.JLabel JLboxPrenda3;
    private javax.swing.JLabel JLboxPrenda4;
    private javax.swing.JLabel JLboxPrenda5;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButtonNext;
    private javax.swing.JButton jButtonRegresar;
    private javax.swing.JCheckBox jCbCamisa;
    private javax.swing.JCheckBox jCbPantalon;
    private javax.swing.JCheckBox jCbPlayera;
    private javax.swing.JCheckBox jCbSudadera;
    private javax.swing.JCheckBox jCbSudadera1;
    private javax.swing.JCheckBox jCbSueter;
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
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanelCantidad;
    private javax.swing.JPanel jPanelTalla;
    private javax.swing.JPanel jPanelTipoTela;
    private javax.swing.JRadioButton jRBalgodon;
    private javax.swing.JRadioButton jRBch;
    private javax.swing.JRadioButton jRBl;
    private javax.swing.JRadioButton jRBlino;
    private javax.swing.JRadioButton jRBm;
    private javax.swing.JRadioButton jRBmezclilla;
    private javax.swing.JRadioButton jRBpoliester;
    private javax.swing.JRadioButton jRBxch;
    private javax.swing.JRadioButton jRBxl;
    private javax.swing.JTextField jTextFieldCantidades;
    private java.awt.Panel panel1;
    // End of variables declaration//GEN-END:variables
}
