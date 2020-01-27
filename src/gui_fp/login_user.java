package gui_fp;

import java.awt.Color;
import javax.swing.*;
public class login_user extends javax.swing.JFrame {

    public String cukk;
    public int fakk;
    public login_user() {
        initComponents();
         setLocationRelativeTo(this);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        login2 = new javax.swing.JTextField();
        login1 = new javax.swing.JTextField();
        login3 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        box1 = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        exit_login = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        login2.setBackground(new java.awt.Color(0, 0, 21));
        login2.setFont(new java.awt.Font("Sitka Heading", 1, 14)); // NOI18N
        login2.setForeground(new java.awt.Color(102, 102, 102));
        login2.setText("   Password");
        login2.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 255)));
        login2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                login2MouseClicked(evt);
            }
        });
        login2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                login2ActionPerformed(evt);
            }
        });
        getContentPane().add(login2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 300, 380, 40));

        login1.setBackground(new java.awt.Color(0, 0, 21));
        login1.setFont(new java.awt.Font("Sitka Heading", 1, 14)); // NOI18N
        login1.setForeground(new java.awt.Color(102, 102, 102));
        login1.setText("   Username");
        login1.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 255)));
        login1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                login1MouseClicked(evt);
            }
        });
        getContentPane().add(login1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 250, 380, 40));

        login3.setBackground(new java.awt.Color(11, 10, 10));
        login3.setFont(new java.awt.Font("Sitka Small", 1, 14)); // NOI18N
        login3.setForeground(new java.awt.Color(0, 204, 0));
        login3.setText("LOGIN");
        login3.setBorder(new javax.swing.border.MatteBorder(null));
        login3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                login3ActionPerformed(evt);
            }
        });
        getContentPane().add(login3, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 390, 180, 30));

        jLabel2.setFont(new java.awt.Font("Sitka Heading", 1, 30)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 204, 0));
        jLabel2.setText(" LOGIN");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 100, 100, 40));

        box1.setBackground(new java.awt.Color(11, 10, 10));
        box1.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        box1.setForeground(new java.awt.Color(0, 204, 0));
        box1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "MAHASISWA", "PRODI", "DOSEN WALI", "DOSEN PEMBIMBING" }));
        box1.setBorder(new javax.swing.border.MatteBorder(null));
        box1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                box1ActionPerformed(evt);
            }
        });
        getContentPane().add(box1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 180, 220, 30));

        jLabel4.setFont(new java.awt.Font("Sitka Heading", 1, 30)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(102, 102, 102));
        jLabel4.setText("USER");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 100, 90, 40));

        exit_login.setBackground(new java.awt.Color(11, 10, 10));
        exit_login.setFont(new java.awt.Font("Sitka Small", 1, 14)); // NOI18N
        exit_login.setForeground(new java.awt.Color(0, 204, 0));
        exit_login.setText("EXIT");
        exit_login.setBorder(new javax.swing.border.MatteBorder(null));
        exit_login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exit_loginActionPerformed(evt);
            }
        });
        getContentPane().add(exit_login, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 390, 180, 30));

        jLabel1.setForeground(new java.awt.Color(0, 204, 0));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar1/i1.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 690, 520));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void login2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_login2ActionPerformed
            
    }//GEN-LAST:event_login2ActionPerformed

    private void login1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_login1MouseClicked
        login1.setText("");
        
    }//GEN-LAST:event_login1MouseClicked

    private void login2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_login2MouseClicked
        login2.setText("");
    }//GEN-LAST:event_login2MouseClicked

    private void box1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_box1ActionPerformed
    
    }//GEN-LAST:event_box1ActionPerformed

    private void login3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_login3ActionPerformed
    cukk = (String) box1.getSelectedItem();
 
  if (cukk == "MAHASISWA") {
    info_mhs oi = new info_mhs();
     oi.setVisible(true);
     this.setVisible(false);
             }
 
 else if
     (cukk == "PRODI")  {  
     info_prodi oi = new info_prodi();
     oi.setVisible(true);
     this.setVisible(false);
           }
     else if
     (cukk == "DOSEN WALI")  {  
     info_doswal oi = new info_doswal();
     oi.setVisible(true);
     this.setVisible(false);
     }
     
     else { 
    // (cukk == "DOSEN PEMBIMBING")  {  
     //daftarKPrak oi = new daftarKPrak();
     //oi.setVisible(true);
   //  this.setVisible(false);
 }
    }//GEN-LAST:event_login3ActionPerformed

    private void exit_loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exit_loginActionPerformed
                System.exit(0);
    }//GEN-LAST:event_exit_loginActionPerformed

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
            java.util.logging.Logger.getLogger(login_user.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(login_user.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(login_user.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(login_user.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new login_user().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> box1;
    private javax.swing.JButton exit_login;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField login1;
    private javax.swing.JTextField login2;
    private javax.swing.JButton login3;
    // End of variables declaration//GEN-END:variables
}
