package gui_fp;

import codingan.Mahasiswa;
import codingan.Setting_Jadwal_KP;
import com.sun.java.accessibility.util.AWTEventMonitor;
import java.sql.Date;
import com.sun.java.accessibility.util.EventQueueMonitor;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;

public class jadwalKP extends javax.swing.JFrame {

    public jadwalKP() {
        initComponents();
          setLocationRelativeTo(this);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jadwal_A = new javax.swing.JTextField();
        jadwal_akhir = new javax.swing.JTextField();
        view_prodi1 = new javax.swing.JButton();
        save_prodi = new javax.swing.JButton();
        exit_prodi = new javax.swing.JButton();
        periode_sem1 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setOpaque(false);
        jPanel1.setLayout(null);

        jLabel2.setFont(new java.awt.Font("Imprint MT Shadow", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("INFORMASI KERJA PRAKTEK");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(150, 30, 410, 40);

        jLabel5.setFont(new java.awt.Font("Sitka Heading", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("JADWAL AWAL      ");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(60, 190, 170, 30);

        jLabel6.setFont(new java.awt.Font("Sitka Heading", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("JADWAL AKHIR     ");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(60, 240, 170, 30);

        jadwal_A.setBackground(new java.awt.Color(0, 76, 229));
        jadwal_A.setFont(new java.awt.Font("Sitka Heading", 1, 14)); // NOI18N
        jadwal_A.setText("yyyy-dd-mm");
        jadwal_A.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jadwal_AMouseClicked(evt);
            }
        });
        jadwal_A.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jadwal_AKeyPressed(evt);
            }
        });
        jPanel1.add(jadwal_A);
        jadwal_A.setBounds(260, 190, 350, 30);

        jadwal_akhir.setBackground(new java.awt.Color(0, 76, 229));
        jadwal_akhir.setFont(new java.awt.Font("Sitka Heading", 1, 14)); // NOI18N
        jadwal_akhir.setText("yyyy-dd-mm");
        jadwal_akhir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jadwal_akhirMouseClicked(evt);
            }
        });
        jadwal_akhir.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jadwal_akhirKeyPressed(evt);
            }
        });
        jPanel1.add(jadwal_akhir);
        jadwal_akhir.setBounds(260, 240, 350, 30);

        view_prodi1.setBackground(new java.awt.Color(0, 76, 229));
        view_prodi1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        view_prodi1.setForeground(new java.awt.Color(255, 255, 255));
        view_prodi1.setText("VIEW");
        view_prodi1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        view_prodi1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                view_prodi1ActionPerformed(evt);
            }
        });
        jPanel1.add(view_prodi1);
        view_prodi1.setBounds(370, 370, 110, 30);

        save_prodi.setBackground(new java.awt.Color(0, 76, 229));
        save_prodi.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        save_prodi.setForeground(new java.awt.Color(255, 255, 255));
        save_prodi.setText("SAVE");
        save_prodi.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        save_prodi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                save_prodiActionPerformed(evt);
            }
        });
        jPanel1.add(save_prodi);
        save_prodi.setBounds(230, 370, 120, 30);

        exit_prodi.setBackground(new java.awt.Color(0, 76, 229));
        exit_prodi.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        exit_prodi.setForeground(new java.awt.Color(255, 255, 255));
        exit_prodi.setText("EXIT");
        exit_prodi.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        exit_prodi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exit_prodiActionPerformed(evt);
            }
        });
        jPanel1.add(exit_prodi);
        exit_prodi.setBounds(500, 370, 110, 30);

        periode_sem1.setBackground(new java.awt.Color(0, 76, 229));
        periode_sem1.setFont(new java.awt.Font("Sitka Heading", 1, 14)); // NOI18N
        periode_sem1.setText("semester");
        periode_sem1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                periode_sem1MouseClicked(evt);
            }
        });
        periode_sem1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                periode_sem1KeyPressed(evt);
            }
        });
        jPanel1.add(periode_sem1);
        periode_sem1.setBounds(260, 290, 350, 30);

        jLabel7.setFont(new java.awt.Font("Sitka Heading", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("PERIODE SEMESTER      ");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(60, 290, 220, 30);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar1/g1.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(-10, 0, 650, 503);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 637, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 497, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void exit_prodiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exit_prodiActionPerformed
        info_prodi oii = new info_prodi();
        oii.setVisible(true);   //GANTI JFRAME 
        this.setVisible(false);
    }//GEN-LAST:event_exit_prodiActionPerformed
    private void view_prodi1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_view_prodi1ActionPerformed
//        JOptionPane.showMessageDialog(this,"PERIODE SEMESTER : " + id_kp.getText()+"\n"+jadwal_A.getText()+"\n"+
//                jadwal_akhir.getText());
//         
    }//GEN-LAST:event_view_prodi1ActionPerformed
    private void save_prodiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_save_prodiActionPerformed
                    
			// INPUT JADWAL KERJA PRAKTEK KE DATABASE
	    
		   Setting_Jadwal_KP oi = new Setting_Jadwal_KP();   
                   oi.setJadwal_Mulai(Date.valueOf(jadwal_A.getText()));
                   oi.setJadwal_Akhir(Date.valueOf(jadwal_akhir.getText()));
                   oi.setPeriode_Semester(periode_sem1.getText());                                
          try{ 
               oi.setting_kp();
        JOptionPane.showMessageDialog(null,"DATA TERSIMPAN");
       }catch (Exception s){
           JOptionPane.showMessageDialog(null,"DATA GAGAL DISIMPAN");
    }
//                    if (id_kp.getText().equals("")) {
//      JOptionPane.showMessageDialog(null, "Kolom Nama Tidak Boleh Kosong!!", "Peringatan", JOptionPane.WARNING_MESSAGE);
      if (jadwal_A.getText().equals("")) {
      JOptionPane.showMessageDialog(null, "Kolom JADWAL AWAL Tidak Boleh Kosong!!"
	      , "Peringatan", JOptionPane.WARNING_MESSAGE);
    } else if (jadwal_akhir.getText().equals("")) {
      JOptionPane.showMessageDialog(null, "Kolom JADWAL AKHIR Tidak Boleh Kosong!!"
	      , "Peringatan", JOptionPane.WARNING_MESSAGE);
    } else{
    }        
         JOptionPane.showMessageDialog(null, "DATA BERHASIL DISIMPAN");
    }//GEN-LAST:event_save_prodiActionPerformed

    private void jadwal_AKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jadwal_AKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER || evt.getKeyCode() == KeyEvent.VK_TAB) {
            jadwal_akhir.requestFocus();
    }
    }//GEN-LAST:event_jadwal_AKeyPressed

    private void jadwal_akhirKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jadwal_akhirKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER || evt.getKeyCode() == KeyEvent.VK_TAB) {
           periode_sem1.requestFocus();
    }
    }//GEN-LAST:event_jadwal_akhirKeyPressed

    private void periode_sem1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_periode_sem1MouseClicked
       periode_sem1.setText("");
    }//GEN-LAST:event_periode_sem1MouseClicked

    private void periode_sem1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_periode_sem1KeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER || evt.getKeyCode() == KeyEvent.VK_TAB) {
           save_prodi.requestFocus();
    }
    }//GEN-LAST:event_periode_sem1KeyPressed

        private void jadwal_akhirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jadwal_akhirMouseClicked
               jadwal_akhir.setText("");
        }//GEN-LAST:event_jadwal_akhirMouseClicked

        private void jadwal_AMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jadwal_AMouseClicked
              jadwal_A.setText("");
        }//GEN-LAST:event_jadwal_AMouseClicked
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new jadwalKP().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton exit_prodi;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jadwal_A;
    private javax.swing.JTextField jadwal_akhir;
    private javax.swing.JTextField periode_sem1;
    private javax.swing.JButton save_prodi;
    public javax.swing.JButton view_prodi1;
    // End of variables declaration//GEN-END:variables
}
