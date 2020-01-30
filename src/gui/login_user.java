package gui;

import connect.*;
import java.awt.Color;
import javax.swing.*;
import base.*;

public class login_user extends javax.swing.JFrame {
     
     private User u = new User();
     public login_user() {
	super("Login Page"); 
        initComponents();
         setLocationRelativeTo(this);
    }

    @SuppressWarnings("unchecked")
        // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
        private void initComponents() {

                pass = new javax.swing.JTextField();
                username1 = new javax.swing.JTextField();
                masuk1 = new javax.swing.JButton();
                jLabel2 = new javax.swing.JLabel();
                jLabel4 = new javax.swing.JLabel();
                exit_login = new javax.swing.JButton();
                jLabel1 = new javax.swing.JLabel();

                setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
                getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

                pass.setBackground(new java.awt.Color(0, 0, 21));
                pass.setFont(new java.awt.Font("Sitka Heading", 1, 14)); // NOI18N
                pass.setForeground(new java.awt.Color(102, 102, 102));
                pass.setText("   Password");
                pass.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 255)));
                pass.addMouseListener(new java.awt.event.MouseAdapter() {
                        public void mouseClicked(java.awt.event.MouseEvent evt) {
                                passMouseClicked(evt);
                        }
                });
                pass.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                passActionPerformed(evt);
                        }
                });
                getContentPane().add(pass, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 300, 380, 40));

                username1.setBackground(new java.awt.Color(0, 0, 21));
                username1.setFont(new java.awt.Font("Sitka Heading", 1, 14)); // NOI18N
                username1.setForeground(new java.awt.Color(102, 102, 102));
                username1.setText("   Username");
                username1.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 255)));
                username1.addMouseListener(new java.awt.event.MouseAdapter() {
                        public void mouseClicked(java.awt.event.MouseEvent evt) {
                                username1MouseClicked(evt);
                        }
                });
                getContentPane().add(username1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 250, 380, 40));

                masuk1.setBackground(new java.awt.Color(11, 10, 10));
                masuk1.setFont(new java.awt.Font("Sitka Small", 1, 14)); // NOI18N
                masuk1.setForeground(new java.awt.Color(0, 204, 0));
                masuk1.setText("LOGIN");
                masuk1.setBorder(new javax.swing.border.MatteBorder(null));
                masuk1.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                masuk1ActionPerformed(evt);
                        }
                });
                getContentPane().add(masuk1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 390, 180, 30));

                jLabel2.setFont(new java.awt.Font("Sitka Heading", 1, 30)); // NOI18N
                jLabel2.setForeground(new java.awt.Color(0, 204, 0));
                jLabel2.setText(" LOGIN");
                getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 100, 100, 40));

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

    private void passActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passActionPerformed
            
    }//GEN-LAST:event_passActionPerformed

    private void username1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_username1MouseClicked
        
        
    }//GEN-LAST:event_username1MouseClicked

    private void passMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_passMouseClicked
        
    }//GEN-LAST:event_passMouseClicked

    private void exit_loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exit_loginActionPerformed
                System.exit(0);
    }//GEN-LAST:event_exit_loginActionPerformed

        private void masuk1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_masuk1ActionPerformed
		if ((getU().cekLogin(username1.getText(), pass.getText())) && (getU().gettipeUser() != null)) {
            switch (getU().gettipeUser())
            {
                case "admin" :
                {
                    new FrameAdmin(getU()).setVisible(true);
                    break;
                }
                
                case "Prodi" :
                {
                    new FrameProdi(getU()).setVisible(true);
                    break;
                }
                
                case "Dosen" :
                {
                    new FrameDoswal(getU()).setVisible(true);
                    break;
                }

                case "Mahasiswa" :
                {
                    new FrameMahasiswa(getU()).setVisible(true);
                    break;
                }
                
                default :
                {
                    JOptionPane.showMessageDialog(null, "Data login tidak ditemukan!");
                }
            }
            setVisible(false);
        }
        }//GEN-LAST:event_masuk1ActionPerformed

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
        private javax.swing.JButton exit_login;
        private javax.swing.JLabel jLabel1;
        private javax.swing.JLabel jLabel2;
        private javax.swing.JLabel jLabel4;
        private javax.swing.JButton masuk1;
        private javax.swing.JTextField pass;
        private javax.swing.JTextField username1;
        // End of variables declaration//GEN-END:variables


    /**
     * @return the u
     */
    public User getU() {
        return u;
    }
    public void setU(User u) {
        this.u = u;
    }
}
