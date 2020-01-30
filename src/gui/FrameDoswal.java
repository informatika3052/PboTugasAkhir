/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import base.*;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Jempol
 */
public class FrameDoswal extends javax.swing.JFrame {
    private User user = new User();
    private Dosen dosen = new Dosen();
    private Mahasiswa mahasiswa = new Mahasiswa();
    private KerjaPraktek kerjaPraktek = new KerjaPraktek();
    private PersetujuanDosen persetujuanDosen = new PersetujuanDosen();
    private PersetujuanProdi persetujuanProdi = new PersetujuanProdi();
    private Bimbingan bimbingan = new Bimbingan();
    
    /**
     * Creates new form FrameDoswal
     */
    public FrameDoswal() {
        initComponents();
	setComboBox();
    }
     public FrameDoswal(User user) {
        super("Dosen : " + (new Dosen().satuDB(user.getusername())).getnama());
        setUser(user);
        setDosen(new Dosen().satuDB(user.getusername()));
        initComponents();
        nidnLabel1.setText("NIDN                            : " + getDosen().getnidn());
        namaDosenLabel1.setText("Nama Dosen                : " + getDosen().getnama());
	setComboBox();
    }
     public void setComboBox()
     {
        ArrayList<Mahasiswa> list = new Mahasiswa ().semuaDB();
	Iterator<Mahasiswa> tiaplist = list.iterator();
	nimNamaComboBox.removeAllItems();
	while(tiaplist.hasNext()){
		Mahasiswa maha = tiaplist.next();
		if (maha.dosen.getnidn().equals(getDosen().getnidn())){
			nimNamaComboBox.addItem(maha.getnim() + " - " + maha.getnama());
		}
	}
     }
     public void KerjaPraktekDB(){
        setKerjaPraktek(new KerjaPraktek());
        //getKerjaPraktek().setidKp().toString();
        getKerjaPraktek().setnamaKegiatan("");
        getKerjaPraktek().setinstansi("");
       
     }
    @SuppressWarnings("unchecked")
        // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
        private void initComponents() {

                nidnLabel1 = new javax.swing.JLabel();
                namaDosenLabel1 = new javax.swing.JLabel();
                mahasiswaLabel = new javax.swing.JLabel();
                nimNamaComboBox = new javax.swing.JComboBox<>();
                jScrollPane1 = new javax.swing.JScrollPane();
                tabelKP1 = new javax.swing.JTable();
                konfirmCheckbox1 = new javax.swing.JCheckBox();
                jButton1 = new javax.swing.JButton();
                exitDos = new javax.swing.JButton();

                setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

                nidnLabel1.setText("NIDN                            : ");

                namaDosenLabel1.setText("Nama Dosen                : ");

                mahasiswaLabel.setText("Nama Mahasiswa        : ");

                nimNamaComboBox.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                nimNamaComboBoxActionPerformed(evt);
                        }
                });

                tabelKP1.setModel(new javax.swing.table.DefaultTableModel(
                        new Object [][] {

                        },
                        new String [] {
                                "Instansi KP", "Kegiatan KP"
                        }
                ) {
                        Class[] types = new Class [] {
                                java.lang.String.class, java.lang.Object.class
                        };

                        public Class getColumnClass(int columnIndex) {
                                return types [columnIndex];
                        }
                });
                jScrollPane1.setViewportView(tabelKP1);

                konfirmCheckbox1.setText("Setujui KP");
                konfirmCheckbox1.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                konfirmCheckbox1ActionPerformed(evt);
                        }
                });

                jButton1.setText("SIMPAN");
                jButton1.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                jButton1ActionPerformed(evt);
                        }
                });

                exitDos.setText("LOGOUT");
                exitDos.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                exitDosActionPerformed(evt);
                        }
                });

                javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
                getContentPane().setLayout(layout);
                layout.setHorizontalGroup(
                        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(28, 28, 28)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 561, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(nidnLabel1)
                                        .addComponent(konfirmCheckbox1)
                                        .addComponent(namaDosenLabel1)
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(mahasiswaLabel)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(nimNamaComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton1)
                                .addGap(18, 18, 18)
                                .addComponent(exitDos)
                                .addContainerGap())
                );
                layout.setVerticalGroup(
                        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(148, 148, 148)
                                .addComponent(nidnLabel1)
                                .addGap(6, 6, 6)
                                .addComponent(namaDosenLabel1)
                                .addGap(6, 6, 6)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(nimNamaComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(mahasiswaLabel))
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                                .addComponent(konfirmCheckbox1)
                                .addGap(38, 38, 38)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jButton1)
                                        .addComponent(exitDos))
                                .addGap(51, 51, 51))
                );

                pack();
        }// </editor-fold>//GEN-END:initComponents

    private void nimNamaComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nimNamaComboBoxActionPerformed
        KerjaPraktekDB();
    }//GEN-LAST:event_nimNamaComboBoxActionPerformed

    private void konfirmCheckbox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_konfirmCheckbox1ActionPerformed
         if(konfirmCheckbox1.isSelected()){
                 PersetujuanDosen perDos = new PersetujuanDosen(getKerjaPraktek().getidKp() , true);
            perDos.masukDB();
        }
        else{
		 PersetujuanDosen perDos = new PersetujuanDosen(getKerjaPraktek().getidKp() , false);
            perDos.masukDB();
 
        }
    }//GEN-LAST:event_konfirmCheckbox1ActionPerformed

    private void exitDosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitDosActionPerformed
        System.exit(0);
    }//GEN-LAST:event_exitDosActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        JOptionPane.showMessageDialog(null,"Data Tersimpan");
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(FrameDoswal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrameDoswal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrameDoswal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrameDoswal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrameDoswal().setVisible(true);
            }
        });
    }

        // Variables declaration - do not modify//GEN-BEGIN:variables
        private javax.swing.JButton exitDos;
        private javax.swing.JButton jButton1;
        private javax.swing.JScrollPane jScrollPane1;
        private javax.swing.JCheckBox konfirmCheckbox1;
        private javax.swing.JLabel mahasiswaLabel;
        private javax.swing.JLabel namaDosenLabel1;
        private javax.swing.JLabel nidnLabel1;
        private javax.swing.JComboBox<String> nimNamaComboBox;
        private javax.swing.JTable tabelKP1;
        // End of variables declaration//GEN-END:variables

    public void getPersetujuanFromDatabase(int idJadwal){
        DefaultTableModel modelTablePersetujuan = (DefaultTableModel) tabelKP1.getModel();
        modelTablePersetujuan.setRowCount(0);
        Object[] atributKerjaPraktek = new Object[2];
        try {
            ArrayList PersetujuanDosenAll = new KerjaPraktek().semuaDB();
            Iterator listRevisi = PersetujuanDosenAll.iterator();
            while(listRevisi.hasNext()){
                KerjaPraktek eachKerjaPraktek;
                eachKerjaPraktek = (KerjaPraktek) listRevisi.next();
                atributKerjaPraktek[0] = eachKerjaPraktek.getidKp() + " | " + eachKerjaPraktek.getinstansi();
                atributKerjaPraktek[1] = new SimpleDateFormat("dd-MM-yyyy").format(eachKerjaPraktek.getnamaKegiatan());
        
                modelTablePersetujuan.addRow(atributKerjaPraktek);
            }
            tabelKP1.setModel(modelTablePersetujuan);
        } catch (Exception ex) {
            Logger.getLogger(FrameDoswal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public User getUser() {
        return user;
    }
    public void setUser(User user) {
        this.user = user;
    }
    public Dosen getDosen() {
        return dosen;
    }
    public void setDosen(Dosen dosen) {
        this.dosen = dosen;
    }
    public KerjaPraktek getKerjaPraktek() {
        return kerjaPraktek;
    }
    public void setKerjaPraktek(KerjaPraktek kerjaPraktek) {
        this.kerjaPraktek = kerjaPraktek;
    }
    public Mahasiswa getMahasiswa() {
        return mahasiswa;
    }
    public void setMahasiswa(Mahasiswa mahasiswa) {
        this.mahasiswa = mahasiswa;
    }
    public PersetujuanDosen getPersetujuanDosen() {
        return persetujuanDosen;
    }

    public void setPersetujuanDosen(PersetujuanDosen persetujuanDosen) {
        this.persetujuanDosen = persetujuanDosen;
    }
    public PersetujuanProdi getPersetujuanProdi() {
        return persetujuanProdi;
    }

    public void setPersetujuanProdi(PersetujuanProdi persetujuanProdi) {
        this.persetujuanProdi = persetujuanProdi;
    }

    public Bimbingan getbimbingan() {
        return bimbingan;
    }

    public void setBimbingan(Bimbingan bimbingan) {
        this.bimbingan = bimbingan;
    }
}
    
