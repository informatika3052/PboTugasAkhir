package gui_fp;

import javax.swing.JOptionPane;
import java.awt.event.ActionEvent;
import java.sql.SQLException;
import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.ResultSet;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import java.sql.DriverManager;
import javax.swing.JTable;
import codingan.*;
import java.awt.event.KeyEvent;

public class pengisian_id extends javax.swing.JFrame {

    public pengisian_id() {
        
        initComponents();
        setLocationRelativeTo(this);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jabatan1 = new javax.swing.JTextField();
        keluar1 = new javax.swing.JButton();
        simpan1 = new javax.swing.JButton();
        nama4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        box1 = new javax.swing.JComboBox<>();
        nidn = new javax.swing.JTextField();
        nama5 = new javax.swing.JLabel();
        nama6 = new javax.swing.JLabel();
        nama_kp2 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jabatan1.setBackground(new java.awt.Color(76, 136, 234));
        jabatan1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jabatan1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jabatan1KeyPressed(evt);
            }
        });
        getContentPane().add(jabatan1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 390, 450, 40));

        keluar1.setBackground(new java.awt.Color(11, 10, 10));
        keluar1.setFont(new java.awt.Font("Sitka Heading", 1, 14)); // NOI18N
        keluar1.setForeground(new java.awt.Color(76, 136, 234));
        keluar1.setText("KELUAR");
        keluar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                keluar1ActionPerformed(evt);
            }
        });
        getContentPane().add(keluar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 460, 110, 30));

        simpan1.setBackground(new java.awt.Color(11, 10, 10));
        simpan1.setFont(new java.awt.Font("Sitka Heading", 1, 14)); // NOI18N
        simpan1.setForeground(new java.awt.Color(76, 136, 234));
        simpan1.setText("SIMPAN");
        simpan1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                simpan1ActionPerformed(evt);
            }
        });
        getContentPane().add(simpan1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 460, 110, 30));

        nama4.setFont(new java.awt.Font("Sitka Heading", 1, 24)); // NOI18N
        nama4.setForeground(new java.awt.Color(255, 255, 255));
        nama4.setText("JABATAN");
        getContentPane().add(nama4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 390, -1, -1));

        jLabel2.setFont(new java.awt.Font("Sitka Heading", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("PENGISIAN DATA");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 130, 300, 50));

        box1.setBackground(new java.awt.Color(11, 10, 10));
        box1.setFont(new java.awt.Font("Sitka Heading", 1, 18)); // NOI18N
        box1.setForeground(new java.awt.Color(76, 136, 234));
        box1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "PRODI", "DOSEN WALI", "DOSEN PEMBIMBING" }));
        box1.setBorder(new javax.swing.border.MatteBorder(null));
        box1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                box1ActionPerformed(evt);
            }
        });
        getContentPane().add(box1, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 140, 140, -1));

        nidn.setBackground(new java.awt.Color(76, 136, 234));
        nidn.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        nidn.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                nidnKeyPressed(evt);
            }
        });
        getContentPane().add(nidn, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 330, 450, 40));

        nama5.setFont(new java.awt.Font("Sitka Heading", 1, 24)); // NOI18N
        nama5.setForeground(new java.awt.Color(255, 255, 255));
        nama5.setText("NIDN/NIM");
        getContentPane().add(nama5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 330, -1, -1));

        nama6.setFont(new java.awt.Font("Sitka Heading", 1, 24)); // NOI18N
        nama6.setForeground(new java.awt.Color(255, 255, 255));
        nama6.setText("NAMA");
        getContentPane().add(nama6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 270, -1, -1));

        nama_kp2.setBackground(new java.awt.Color(76, 136, 234));
        nama_kp2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        nama_kp2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                nama_kp2KeyPressed(evt);
            }
        });
        getContentPane().add(nama_kp2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 270, 450, 40));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar1/h1.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 630, 520));

        pack();
    }// </editor-fold>//GEN-END:initComponents

        public void reset(){
                  
                   nama_kp2.setText(" ");
                    nidn.setText(" ");
                  jabatan1.setText(" ");
    }
    
    private void jabatan1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jabatan1KeyPressed
         if (evt.getKeyCode() == KeyEvent.VK_ENTER || evt.getKeyCode() == KeyEvent.VK_TAB) {
            simpan1.requestFocus();
    }
    }//GEN-LAST:event_jabatan1KeyPressed

    private void keluar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_keluar1ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_keluar1ActionPerformed

    private void simpan1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_simpan1ActionPerformed
        String  cukk = (String) box1.getSelectedItem();
            
	if (  null == cukk) { 
      // (cukk == "DOSEN PEMBIMBING")  {
      //daftarKPrak oi = new daftarKPrak();
      //oi.setVisible(true);
      //  this.setVisible(false);
  }
 
 else   switch (cukk) {
            case "PRODI":
                {
                    Prodi oii = new Prodi();
                    
                    oii.setnama(nama_kp2.getText());
                    oii.setnidn(nidn.getText());
                    oii.setjabatan(jabatan1.getText());
                    try{
                       oii.insert_prodi();
                       oii.insert_prodi1();
		       oii.insert_jabatan1();
                        reset();
                        JOptionPane.showMessageDialog(null,"DATA TERSIMPAN");
                    }catch (Exception s){
                        JOptionPane.showMessageDialog(null,"DATA GAGAL DISIMPAN");
                    }            break;
                }
            case "DOSEN WALI":
                {
                    Dosen oii = new Dosen();
                   
                    oii.setnama(nama_kp2.getText());
                    oii.setnidn(nidn.getText());
                    oii.setjabatan(jabatan1.getText());
                    
                    try{
                        oii.insert_dosen();
                        oii.insert_jabatan();
                        reset();
                        JOptionPane.showMessageDialog(null,"DATA TERSIMPAN");
                    }catch (Exception s){
                        JOptionPane.showMessageDialog(null,"DATA GAGAL DISIMPAN");
                    }            break;
                }
            default:
                break;
        }
    }//GEN-LAST:event_simpan1ActionPerformed

    private void box1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_box1ActionPerformed

    }//GEN-LAST:event_box1ActionPerformed

    private void nidnKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nidnKeyPressed
         if (evt.getKeyCode() == KeyEvent.VK_ENTER || evt.getKeyCode() == KeyEvent.VK_TAB) {
            jabatan1.requestFocus();
    }
    }//GEN-LAST:event_nidnKeyPressed

    private void nama_kp2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nama_kp2KeyPressed
         if (evt.getKeyCode() == KeyEvent.VK_ENTER || evt.getKeyCode() == KeyEvent.VK_TAB) {
            nidn.requestFocus();
    }
    }//GEN-LAST:event_nama_kp2KeyPressed
    
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
            java.util.logging.Logger.getLogger(pengisian_id.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(pengisian_id.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(pengisian_id.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(pengisian_id.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new pengisian_id().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> box1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField jabatan1;
    private javax.swing.JButton keluar1;
    private javax.swing.JLabel nama4;
    private javax.swing.JLabel nama5;
    private javax.swing.JLabel nama6;
    private javax.swing.JTextField nama_kp2;
    private javax.swing.JTextField nidn;
    private javax.swing.JButton simpan1;
    // End of variables declaration//GEN-END:variables
}
