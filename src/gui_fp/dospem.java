/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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

public class dospem extends javax.swing.JFrame {

   dospemC oi  = new dospemC();

   
    public dospem() {
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
                false, false, false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane5.setViewportView(tabelKP);

        getContentPane().add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, 690, 160));

        jLabel2.setFont(new java.awt.Font("Sitka Heading", 1, 36)); // NOI18N
        jLabel2.setText("DAFTAR MAHASISWA");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 20, -1, 40));

        exit2.setBackground(new java.awt.Color(0, 102, 153));
        exit2.setFont(new java.awt.Font("Sitka Heading", 1, 18)); // NOI18N
        exit2.setText("EXIT");
        exit2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exit2ActionPerformed(evt);
            }
        });
        getContentPane().add(exit2, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 360, 160, 30));

        cari2.setBackground(new java.awt.Color(0, 102, 153));
        cari2.setFont(new java.awt.Font("Sitka Heading", 1, 18)); // NOI18N
        cari2.setText("VIEW");
        cari2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cari2ActionPerformed(evt);
            }
        });
        getContentPane().add(cari2, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 360, 170, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar1/d2.jpg"))); // NOI18N
        jLabel1.setBorder(new javax.swing.border.MatteBorder(null));
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 750, 500));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cari2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cari2ActionPerformed
	  
	    // MENAMPILKAN INFORMASI KERJA PRAKTEK MELALUI DATABASE
	    
	    
	    dospemC oi  = new dospemC();
	     
	    DefaultTableModel modelTableKelayakan = (DefaultTableModel) tabelKP.getModel();
	    modelTableKelayakan.setRowCount(0);
            Object[] atributPer = new Object[5];
	
        try {
            ArrayList dospemAll = oi.viewAll(); //harus dikasih try catch
            Iterator listPersetujuan = dospemAll.iterator();
            int i = 0;
	    while(i < dospemAll.size()){
                dospemC eachKelayakan;
                eachKelayakan = (dospemC) listPersetujuan.next();
                atributPer[0] = eachKelayakan.getNama();  // MENAMPILKAN NAMA DARI CLASS dospemC (database)
                atributPer[1] = eachKelayakan.getNim();	  // MENAMPILKAN NIM DARI CLASS dospemC (database)
                atributPer[2] = eachKelayakan.getSemester(); // MENAMPILKAN SEM DARI CLASS dospemC (database)
                atributPer[3] = eachKelayakan.getinstansi(); // MENAMPILKAN INSTANSI DARI CLASS dospemC (database)
		atributPer[4] = eachKelayakan.getpersetujuan(); // MENAMPILKAN PERSETUJUAN DARI CLASS dospemC (database)
                modelTableKelayakan.addRow(atributPer);
		
		i++;
        }
            tabelKP.setModel(modelTableKelayakan);
        } catch (Exception ex) {
            Logger.getLogger(dospem.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_cari2ActionPerformed

    private void exit2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exit2ActionPerformed
        info_dospem oii = new info_dospem();
        oii.setVisible(true);	// PINDAH JFRAME 
        this.setVisible(false);
    }//GEN-LAST:event_exit2ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new dospem().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cari2;
    private javax.swing.JButton exit2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTable tabelKP;
    // End of variables declaration//GEN-END:variables
}
