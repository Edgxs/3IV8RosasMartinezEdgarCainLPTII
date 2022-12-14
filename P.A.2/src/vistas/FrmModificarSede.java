/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vistas;

/**
 *
 * @author edgar
 */
public class FrmModificarSede extends javax.swing.JFrame {

    /**
     * Creates new form FrmModificarSede
     */
    public FrmModificarSede() {
        initComponents();
        this.setLocationRelativeTo(null);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txt_nombreSede = new vistas.JPlaceholderTextField("Nombre de la sede");
        jLabel6 = new javax.swing.JLabel();
        txt_alcaldia = new vistas.JPlaceholderTextField("Alcaldía");
        jLabel7 = new javax.swing.JLabel();
        txt_direccion = new vistas.JPlaceholderTextField("Dirección");
        jLabel9 = new javax.swing.JLabel();
        jBtnNext = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jBtnExit = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel3.setBackground(new java.awt.Color(202, 250, 238));
        jPanel3.setMinimumSize(new java.awt.Dimension(1200, 680));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setMinimumSize(new java.awt.Dimension(1150, 630));
        jPanel2.setPreferredSize(new java.awt.Dimension(1150, 630));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(25, 251, 126));

        jLabel1.setBackground(new java.awt.Color(27, 248, 141));
        jLabel1.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 28)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Ingrese los datos que desea modificar");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1050, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        jPanel2.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 1050, 50));

        txt_nombreSede.setBorder(null);
        jPanel2.add(txt_nombreSede, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 220, 480, 30));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes1/txtNombre1.png"))); // NOI18N
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, -1, -1));

        txt_alcaldia.setBorder(null);
        jPanel2.add(txt_alcaldia, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 340, 480, 30));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes1/txtNombre1.png"))); // NOI18N
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 330, -1, -1));

        txt_direccion.setBorder(null);
        jPanel2.add(txt_direccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 460, 480, 30));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes1/txtNombre1.png"))); // NOI18N
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 450, -1, -1));

        jBtnNext.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes1/btnNext (1).png"))); // NOI18N
        jBtnNext.setBorder(null);
        jBtnNext.setContentAreaFilled(false);
        jPanel2.add(jBtnNext, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 530, -1, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagesSedesReciclaje/SedesReciclajepag.png"))); // NOI18N
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 180, -1, -1));

        jBtnExit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesAdmin/ExitLogo.png"))); // NOI18N
        jBtnExit.setBorder(null);
        jBtnExit.setContentAreaFilled(false);
        jBtnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnExitActionPerformed(evt);
            }
        });
        jPanel2.add(jBtnExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 540, -1, -1));
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 170, -1, -1));
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(904, 520, -1, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes1/mc_sup_derecha.png"))); // NOI18N
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, -10, -1, -1));

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesAdmin/mc_sup.png"))); // NOI18N
        jPanel2.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(-100, 0, 1270, 230));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesUser/mc_derecha.png"))); // NOI18N
        jLabel2.setText(" ");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 0, -1, -1));

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
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 1125, javax.swing.GroupLayout.PREFERRED_SIZE))
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

    private void jBtnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnExitActionPerformed
        FrmAdmin admin = new FrmAdmin();
        admin.setVisible(true);
        this.dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_jBtnExitActionPerformed

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
            java.util.logging.Logger.getLogger(FrmModificarSede.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmModificarSede.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmModificarSede.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmModificarSede.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmModificarSede().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBtnExit;
    private javax.swing.JButton jBtnNext;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel14;
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
    private javax.swing.JPanel jPanel3;
    private vistas.JPlaceholderTextField txt_alcaldia;
    private vistas.JPlaceholderTextField txt_direccion;
    private vistas.JPlaceholderTextField txt_nombreSede;
    // End of variables declaration//GEN-END:variables
}
