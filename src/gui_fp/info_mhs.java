package gui_fp;

public class info_mhs extends javax.swing.JFrame {

    public info_mhs() {
        initComponents();
        setLocationRelativeTo(this);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        jLabel2 = new javax.swing.JLabel();
        jMenuBar2 = new javax.swing.JMenuBar();
        kp1 = new javax.swing.JMenu();
        daftarKP2 = new javax.swing.JMenuItem();
        daftarKP3 = new javax.swing.JMenuItem();
        regiter_otw = new javax.swing.JMenuItem();
        exit = new javax.swing.JMenuItem();

        jMenuItem1.setText("jMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setBackground(new java.awt.Color(255, 153, 153));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar1/d1.jpg"))); // NOI18N
        jLabel2.setText("jLabel2");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 640, 470));

        kp1.setText("KERJA PRAKTEK ");

        daftarKP2.setText("DAFTAR KERJA PRAKTEK");
        daftarKP2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                daftarKP2ActionPerformed(evt);
            }
        });
        kp1.add(daftarKP2);

        daftarKP3.setText("INFORMASI KERJA PRAKTEK");
        daftarKP3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                daftarKP3ActionPerformed(evt);
            }
        });
        kp1.add(daftarKP3);

        regiter_otw.setText("REGISTRASI KERJA PRAKTEK");
        regiter_otw.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regiter_otwActionPerformed(evt);
            }
        });
        kp1.add(regiter_otw);

        exit.setText("EXIT");
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });
        kp1.add(exit);

        jMenuBar2.add(kp1);

        setJMenuBar(jMenuBar2);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void daftarKP2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_daftarKP2ActionPerformed
                    daftarKPrak1 oii = new daftarKPrak1();
                    oii.setVisible(true);		 //PINDAH JFRAME
                    this.setVisible(false);
    }//GEN-LAST:event_daftarKP2ActionPerformed

    private void daftarKP3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_daftarKP3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_daftarKP3ActionPerformed

    private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed
                     login_user oii = new login_user();
                     oii.setVisible(true);		// PINDAH JFRAME
                     this.setVisible(false);  
    }//GEN-LAST:event_exitActionPerformed

    private void regiter_otwActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regiter_otwActionPerformed
                register_mhs oii = new register_mhs();
                oii.setVisible(true);			 // PINDAH JFRAME
                this.setVisible(false);
    }//GEN-LAST:event_regiter_otwActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new info_mhs().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem daftarKP2;
    private javax.swing.JMenuItem daftarKP3;
    private javax.swing.JMenuItem exit;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenu kp1;
    private javax.swing.JMenuItem regiter_otw;
    // End of variables declaration//GEN-END:variables
}
