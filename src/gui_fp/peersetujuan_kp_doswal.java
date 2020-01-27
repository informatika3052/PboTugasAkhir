package gui_fp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import koneksi.*;
import codingan.*;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.TableModel;


public class peersetujuan_kp_doswal extends javax.swing.JFrame {	
	Persetujuan_Dosen_Wali oi = new Persetujuan_Dosen_Wali();

public peersetujuan_kp_doswal() {
        initComponents();     
        setLocationRelativeTo(this);
    }      
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane5 = new javax.swing.JScrollPane();
        tabelKP = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        exit2 = new javax.swing.JButton();
        save_doswal = new javax.swing.JButton();
        CheckBox3 = new javax.swing.JCheckBox();
        cekbox1 = new javax.swing.JCheckBox();
        CheckBox2 = new javax.swing.JCheckBox();
        jCheckBox4 = new javax.swing.JCheckBox();
        jCheckBox5 = new javax.swing.JCheckBox();
        jCheckBox6 = new javax.swing.JCheckBox();
        jCheckBox7 = new javax.swing.JCheckBox();
        cari2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tabelKP.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "NAMA", "NIM", "SEMESTER", "INSTANSI KP"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane5.setViewportView(tabelKP);

        getContentPane().add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 190, 510, 160));

        jLabel2.setFont(new java.awt.Font("Sitka Heading", 1, 36)); // NOI18N
        jLabel2.setText("PERSETUJUAN KERJA PRAKTEK");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 20, -1, 40));

        exit2.setBackground(new java.awt.Color(0, 102, 153));
        exit2.setFont(new java.awt.Font("Sitka Small", 1, 14)); // NOI18N
        exit2.setText("EXIT");
        exit2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exit2ActionPerformed(evt);
            }
        });
        getContentPane().add(exit2, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 380, 90, -1));

        save_doswal.setBackground(new java.awt.Color(0, 102, 153));
        save_doswal.setFont(new java.awt.Font("Sitka Small", 1, 14)); // NOI18N
        save_doswal.setText("SAVE");
        save_doswal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                save_doswalActionPerformed(evt);
            }
        });
        getContentPane().add(save_doswal, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 380, 90, -1));

        CheckBox3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CheckBox3ActionPerformed(evt);
            }
        });
        getContentPane().add(CheckBox3, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 250, -1, 20));

        cekbox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cekbox1ActionPerformed(evt);
            }
        });
        getContentPane().add(cekbox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 210, -1, -1));

        CheckBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CheckBox2ActionPerformed(evt);
            }
        });
        getContentPane().add(CheckBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 230, -1, -1));
        getContentPane().add(jCheckBox4, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 270, -1, 20));
        getContentPane().add(jCheckBox5, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 290, -1, 20));
        getContentPane().add(jCheckBox6, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 310, -1, 20));
        getContentPane().add(jCheckBox7, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 330, -1, 20));

        cari2.setBackground(new java.awt.Color(0, 102, 153));
        cari2.setFont(new java.awt.Font("Sitka Heading", 1, 14)); // NOI18N
        cari2.setText("VIEW");
        cari2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cari2ActionPerformed(evt);
            }
        });
        getContentPane().add(cari2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 380, 100, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar1/d1.jpg"))); // NOI18N
        jLabel1.setBorder(new javax.swing.border.MatteBorder(null));
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 690, 500));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cari2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cari2ActionPerformed
	
	    // MENAMPILKAN INFORMASI KERJA PRAKTEK MELALUI DATABASE
	    
	    Persetujuan_Dosen_Wali oi = new Persetujuan_Dosen_Wali();
	    DefaultTableModel modelTablePersetujuan = (DefaultTableModel) tabelKP.getModel();
            modelTablePersetujuan.setRowCount(0);
            Object[] atributPer = new Object[5];
	
        try {
            ArrayList persetujuanAll = oi.viewAll(); //harus dikasih try catch
            Iterator listPersetujuan = persetujuanAll.iterator();
            int i = 0;
	    while(i < persetujuanAll.size()){      // PERULANGAN
        Persetujuan_Dosen_Wali eachPersetujuan;
        eachPersetujuan = (Persetujuan_Dosen_Wali) listPersetujuan.next();
        atributPer[0] = eachPersetujuan.getNama(); // MENAMPILKAN NAMA DARI CLASS Persetujuan_Dosen_Wali (database)
        atributPer[1] = eachPersetujuan.getNim();  // MENAMPILKAN NIM DARI CLASS Persetujuan_Dosen_Wali (database)
        atributPer[2] = eachPersetujuan.getSemester();//MENAMPILKAN SEM DARI CLASS Persetujuan_Dosen_Wali(database)
        atributPer[3] = eachPersetujuan.getinstansi();// MENAMPILKAN INSTANSI DARI CLASS Persetujuan_Dosen_Wali (database)
		
            modelTablePersetujuan.addRow(atributPer);		
	    i++;
        }
            tabelKP.setModel(modelTablePersetujuan);
        } catch (Exception ex) {
            Logger.getLogger(peersetujuan_kp_doswal.class.getName()).log(Level.SEVERE, null, ex);
        }	
    }//GEN-LAST:event_cari2ActionPerformed
	    
    private void exit2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exit2ActionPerformed
        info_doswal oii = new info_doswal();
        oii.setVisible(true);		// PINDAH JFRAME 
        this.setVisible(false);
    }//GEN-LAST:event_exit2ActionPerformed

    private void cekbox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cekbox1ActionPerformed
        if (cekbox1.isSelected()) {
		cekbox1.setText("DISETUJUI");	    
		DefaultTableModel model = (DefaultTableModel) tabelKP.getModel();
		oi.setNim(model.getValueAt(0,1).toString());    // INPUT DATA KE DATABASE persetujua_kp_doswal
		oi.setStatus_Layak(cekbox1.getText());
		try {
        oi.update_kp_doswal1();         
       }catch (Exception s){          
       }
       }  
	else {	     
		cekbox1.setText("BELUM DISETUJUI");		    
		DefaultTableModel model = (DefaultTableModel) tabelKP.getModel();
	        oi.setNim(model.getValueAt(0,1).toString());    // INPUT DATA KE DATABASE persetujua_kp_doswal
                oi.setStatus_Layak(cekbox1.getText());
		try {
        oi.update_kp_doswal1();
       }catch (Exception s){		    	 
       }
       }
    }//GEN-LAST:event_cekbox1ActionPerformed

    private void save_doswalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_save_doswalActionPerformed
                 JOptionPane.showMessageDialog(null,"DATA TERSIMPAN \n TERIMA KASIH");
	
    }//GEN-LAST:event_save_doswalActionPerformed

        private void CheckBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CheckBox2ActionPerformed
        if (CheckBox2.isSelected()) {
            CheckBox2.setText("DISETUJUI");
	    DefaultTableModel model = (DefaultTableModel) tabelKP.getModel();
		 oi.setNim(model.getValueAt(1,1).toString());   // INPUT DATA KE DATABASE persetujua_kp_doswal 
		 oi.setStatus_Layak(CheckBox2.getText());
		 try {
           oi.update_kp_doswal1();
        }catch (Exception s){
        }
        }  
	else 
	{
	    CheckBox2.setText("BELUM DISETUJUI");
		    
	    DefaultTableModel model = (DefaultTableModel) tabelKP.getModel();
		 oi.setNim(model.getValueAt(1,1).toString());   // INPUT DATA KE DATABASE persetujua_kp_doswal 
		 oi.setStatus_Layak(CheckBox2.getText());
		 try {
           oi.update_kp_doswal1();
	}catch (Exception s){
        }    
        }
        }//GEN-LAST:event_CheckBox2ActionPerformed

        private void CheckBox3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CheckBox3ActionPerformed
        if (CheckBox3.isSelected()) {
            CheckBox3.setText("DISETUJUI"); 
	    DefaultTableModel model = (DefaultTableModel) tabelKP.getModel();
		 oi.setNim(model.getValueAt(2,1).toString());   // INPUT DATA KE DATABASE persetujua_kp_doswal 
		 oi.setStatus_Layak(cekbox1.getText());
		 try {
           oi.update_kp_doswal1();
        }catch (Exception s){
        }
        }  
	else 	
	{
	    CheckBox3.setText("BELUM DISETUJUI");		    
	    DefaultTableModel model = (DefaultTableModel) tabelKP.getModel();
		 oi.setNim(model.getValueAt(2,1).toString());   // INPUT DATA KE DATABASE persetujua_kp_doswal 
		 oi.setStatus_Layak(cekbox1.getText());
		 try {
           oi.update_kp_doswal1();
        }catch (Exception s){
        }
        }		         
        }//GEN-LAST:event_CheckBox3ActionPerformed

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
            java.util.logging.Logger.getLogger(peersetujuan_kp_doswal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(peersetujuan_kp_doswal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(peersetujuan_kp_doswal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(peersetujuan_kp_doswal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new peersetujuan_kp_doswal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox CheckBox2;
    private javax.swing.JCheckBox CheckBox3;
    private javax.swing.JButton cari2;
    private javax.swing.JCheckBox cekbox1;
    private javax.swing.JButton exit2;
    private javax.swing.JCheckBox jCheckBox4;
    private javax.swing.JCheckBox jCheckBox5;
    private javax.swing.JCheckBox jCheckBox6;
    private javax.swing.JCheckBox jCheckBox7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JButton save_doswal;
    private javax.swing.JTable tabelKP;
    // End of variables declaration//GEN-END:variables


}
     
