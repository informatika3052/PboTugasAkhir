package gui_fp;

import codingan.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import koneksi.*;

public class kelayakan_kp_prodi extends javax.swing.JFrame {

    Kelayakan_Prodi oi = new Kelayakan_Prodi();    
    public kelayakan_kp_prodi() {
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
        save_prodi = new javax.swing.JButton();
        jCheckBox1 = new javax.swing.JCheckBox();
        cb1 = new javax.swing.JCheckBox();
        cb3 = new javax.swing.JCheckBox();
        jCheckBox4 = new javax.swing.JCheckBox();
        cb4 = new javax.swing.JCheckBox();
        jCheckBox6 = new javax.swing.JCheckBox();
        cb2 = new javax.swing.JCheckBox();
        cari2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tabelKP.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "NAMA", "NIM", "SEMESTER", "INSTANSI KP", "STATUS"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane5.setViewportView(tabelKP);

        getContentPane().add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 150, 620, 160));

        jLabel2.setFont(new java.awt.Font("Sitka Heading", 1, 36)); // NOI18N
        jLabel2.setText("KELAYAKAN KERJA PRAKTEK");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 20, -1, 40));

        exit2.setBackground(new java.awt.Color(0, 102, 153));
        exit2.setFont(new java.awt.Font("Sitka Heading", 1, 18)); // NOI18N
        exit2.setText("EXIT");
        exit2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exit2ActionPerformed(evt);
            }
        });
        getContentPane().add(exit2, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 370, 100, 30));

        save_prodi.setBackground(new java.awt.Color(0, 102, 153));
        save_prodi.setFont(new java.awt.Font("Sitka Heading", 1, 18)); // NOI18N
        save_prodi.setText("SAVE");
        save_prodi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                save_prodiActionPerformed(evt);
            }
        });
        getContentPane().add(save_prodi, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 370, 90, 30));
        getContentPane().add(jCheckBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 290, -1, 20));

        cb1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb1ActionPerformed(evt);
            }
        });
        getContentPane().add(cb1, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 170, -1, -1));

        cb3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb3ActionPerformed(evt);
            }
        });
        getContentPane().add(cb3, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 210, -1, -1));
        getContentPane().add(jCheckBox4, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 250, -1, 20));
        getContentPane().add(cb4, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 230, -1, 20));
        getContentPane().add(jCheckBox6, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 270, -1, 20));

        cb2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb2ActionPerformed(evt);
            }
        });
        getContentPane().add(cb2, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 190, -1, 20));

        cari2.setBackground(new java.awt.Color(0, 102, 153));
        cari2.setFont(new java.awt.Font("Sitka Heading", 1, 18)); // NOI18N
        cari2.setText("VIEW");
        cari2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cari2ActionPerformed(evt);
            }
        });
        getContentPane().add(cari2, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 370, 110, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar1/d2.jpg"))); // NOI18N
        jLabel1.setBorder(new javax.swing.border.MatteBorder(null));
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 750, 500));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cari2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cari2ActionPerformed
            
		// MENAMPILKAN DATA INFORMASI KERJA PRAKTEK DARI CLASS KELAYAKAN PRODI
	    
	    Kelayakan_Prodi oi = new Kelayakan_Prodi();
	    DefaultTableModel modelTableKelayakan = (DefaultTableModel) tabelKP.getModel();
	    modelTableKelayakan.setRowCount(0);
            Object[] atributPer = new Object[5];
	
        try {
            ArrayList persetujuanAll = oi.viewAll(); //harus dikasih try catch
            Iterator listPersetujuan = persetujuanAll.iterator();
            int i = 0;
	    while(i < persetujuanAll.size()){
                Kelayakan_Prodi eachKelayakan;
        eachKelayakan = (Kelayakan_Prodi) listPersetujuan.next();
        atributPer[0] = eachKelayakan.getNama(); // MENAMPILKAN NAMA DARI CLASS Kelayakan_Prodi (database)
        atributPer[1] = eachKelayakan.getNim();  // MENAMPILKAN NIM DARI CLASS Kelayakan_Prodi (database)
        atributPer[2] = eachKelayakan.getSemester(); // MENAMPILKAN SEM DARI CLASS Kelayakan_Prodi (database)
        atributPer[3] = eachKelayakan.getinstansi(); // MENAMPILKAN INSTANSI DARI CLASS Kelayakan_Prodi (database)
        atributPer[4] = eachKelayakan.getpersetujuan(); // MENAMPILKAN PERSETUJUAN DARI CLASS Kelayakan_Prodi (database)
		
                modelTableKelayakan.addRow(atributPer);
		
		i++;
        }
            tabelKP.setModel(modelTableKelayakan);
        } catch (Exception ex) {
            Logger.getLogger(kelayakan_kp_prodi.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_cari2ActionPerformed

    private void exit2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exit2ActionPerformed
        info_prodi oii = new info_prodi();
        oii.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_exit2ActionPerformed

    private void cb1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb1ActionPerformed
       if (cb1.isSelected()) {
           cb1.setText("LAYAK"); 
	    DefaultTableModel model = (DefaultTableModel) tabelKP.getModel();
		oi.setNim(model.getValueAt(0,1).toString());    
		oi.setsetuju_tidak(cb1.getText());
		try {
        oi.update_kp_prodi();         
       }catch (Exception s){          
       }
       }
       else 
       {
	       cb1.setText(" BELUM LAYAK ");
	       DefaultTableModel model = (DefaultTableModel) tabelKP.getModel();
		oi.setNim(model.getValueAt(0,1).toString());    
		oi.setsetuju_tidak(cb1.getText());
		try {
        oi.update_kp_prodi();         
       }catch (Exception s){          
       }
       }      
    }//GEN-LAST:event_cb1ActionPerformed

    private void save_prodiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_save_prodiActionPerformed
      
           JOptionPane.showMessageDialog(null,"DATA TERSIMPAN");
      
    }//GEN-LAST:event_save_prodiActionPerformed

        private void cb2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb2ActionPerformed
                if (cb2.isSelected()) {
                cb2.setText("LAYAK"); 
	        DefaultTableModel model = (DefaultTableModel) tabelKP.getModel();
		oi.setNim(model.getValueAt(0,1).toString());    
		oi.setsetuju_tidak(cb2.getText());
		try {
        oi.update_kp_prodi();         
       }catch (Exception s){          
       }
       }
       else 
       {
	       cb2.setText(" BELUM LAYAK ");
	       DefaultTableModel model = (DefaultTableModel) tabelKP.getModel();
	       oi.setNim(model.getValueAt(0,1).toString());    
	       oi.setsetuju_tidak(cb2.getText());
		try {
               oi.update_kp_prodi();         
       }catch (Exception s){          
       }
       }
        }//GEN-LAST:event_cb2ActionPerformed

        private void cb3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb3ActionPerformed
                 if (cb3.isSelected()) {
            cb3.setText("LAYAK"); 
	    DefaultTableModel model = (DefaultTableModel) tabelKP.getModel();
		oi.setNim(model.getValueAt(2,1).toString());    
		oi.setsetuju_tidak(cb3.getText());
		try {
        oi.update_kp_prodi();         
       }catch (Exception s){          
       }
       }
       else 
       {
	       cb3.setText(" BELUM LAYAK ");
	       DefaultTableModel model = (DefaultTableModel) tabelKP.getModel();
		oi.setNim(model.getValueAt(2,1).toString());    
		oi.setsetuju_tidak(cb3.getText());
		try {
        oi.update_kp_prodi();         
       }catch (Exception s){          
       }
       }
        }//GEN-LAST:event_cb3ActionPerformed

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
            java.util.logging.Logger.getLogger(kelayakan_kp_prodi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(kelayakan_kp_prodi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(kelayakan_kp_prodi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(kelayakan_kp_prodi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new kelayakan_kp_prodi().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cari2;
    private javax.swing.JCheckBox cb1;
    private javax.swing.JCheckBox cb2;
    private javax.swing.JCheckBox cb3;
    private javax.swing.JCheckBox cb4;
    private javax.swing.JButton exit2;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox4;
    private javax.swing.JCheckBox jCheckBox6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JButton save_prodi;
    private javax.swing.JTable tabelKP;
    // End of variables declaration//GEN-END:variables
}
