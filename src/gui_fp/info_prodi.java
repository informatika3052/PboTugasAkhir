package gui_fp;

public class info_prodi extends javax.swing.JFrame {
    public info_prodi() {
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
        persetujuan_kp = new javax.swing.JMenuItem();
        pengisian_kp = new javax.swing.JMenuItem();
        exit_prodi = new javax.swing.JMenuItem();

        jMenuItem1.setText("jMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setBackground(new java.awt.Color(255, 153, 153));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar1/d1.jpg"))); // NOI18N
        jLabel2.setText("jLabel2");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 640, 470));

        kp1.setText("KERJA PRAKTEK ");

        persetujuan_kp.setText("KELAYAKAN KERJA PRAKTEK");
        persetujuan_kp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                persetujuan_kpActionPerformed(evt);
            }
        });
        kp1.add(persetujuan_kp);

        pengisian_kp.setText("INFORMASI KERJA PRAKTEK");
        pengisian_kp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pengisian_kpActionPerformed(evt);
            }
        });
        kp1.add(pengisian_kp);

        exit_prodi.setText("KELUAR");
        exit_prodi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exit_prodiActionPerformed(evt);
            }
        });
        kp1.add(exit_prodi);

        jMenuBar2.add(kp1);

        setJMenuBar(jMenuBar2);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void persetujuan_kpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_persetujuan_kpActionPerformed
        kelayakan_kp_prodi oi = new kelayakan_kp_prodi();
        oi.setVisible(true);			// PINDAH JFRAME			
        this.setVisible(false);    
    }//GEN-LAST:event_persetujuan_kpActionPerformed

    private void pengisian_kpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pengisian_kpActionPerformed
        jadwalKP oi = new  jadwalKP();
        oi.setVisible(true);			// PINDAH JFRAME
        this.setVisible(false);
    }//GEN-LAST:event_pengisian_kpActionPerformed

    private void exit_prodiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exit_prodiActionPerformed
        
	login_user oii = new login_user();
        oii.setVisible(true);			// PINDAH JFRAME
        this.setVisible(false);    
    }//GEN-LAST:event_exit_prodiActionPerformed
   public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new info_prodi().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem exit_prodi;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenu kp1;
    private javax.swing.JMenuItem pengisian_kp;
    private javax.swing.JMenuItem persetujuan_kp;
    // End of variables declaration//GEN-END:variables
}
