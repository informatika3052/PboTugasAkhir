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
public class FrameProdi extends javax.swing.JFrame {
    private User user = new User();
    private Prodi prodi = new Prodi();
    private Dosen dosen = new Dosen();
    private JadwalKerjaPraktek  jadwalKerjaPraktek = new JadwalKerjaPraktek();
    private Mahasiswa mahasiswa = new Mahasiswa();
    private PersetujuanDosen persetujuanDosen = new PersetujuanDosen();
    private PersetujuanProdi persetujuanProdi = new PersetujuanProdi();
    private Bimbingan bimbingan = new Bimbingan();
    /**
     * Creates new form FrameProdi
     */
    public FrameProdi() {
        initComponents();
	setComboBox();
    }

    public FrameProdi(User user) {
        super("Prodi : " + (new Prodi().satuDB(user.getusername())).getnamaProdi());
        setUser(user);
	setProdi(new Prodi().satuDB(user.getusername()));
	setComboBox();
        
        initComponents();
      }
    
     public void setComboBox()
     {
        ArrayList<Dosen> list = new Dosen().semuaDB();
	Iterator<Dosen> tiaplist = list.iterator();
	dsnComboBox.removeAllItems();
	while(tiaplist.hasNext()){
		Dosen dos = tiaplist.next();
		if (dos.getnidn().equals(getDosen().getnidn())){
			dsnComboBox.addItem(dos.getnidn() + " - " + dos.getnama());
		}
	}
     }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
        // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
        private void initComponents() {

                jScrollPane1 = new javax.swing.JScrollPane();
                tabelPro = new javax.swing.JTable();
                jadwalMulai = new javax.swing.JLabel();
                jadwalAkhir = new javax.swing.JLabel();
                mulaiKP = new com.toedter.calendar.JDateChooser();
                akhirKP = new com.toedter.calendar.JDateChooser();
                KPCheckBox = new javax.swing.JCheckBox();
                dsnPembLabel = new javax.swing.JLabel();
                dsnComboBox = new javax.swing.JComboBox<>();
                btn_simpan = new javax.swing.JButton();
                btn_logout = new javax.swing.JButton();
                btn_simpan1 = new javax.swing.JButton();
                jLabel1 = new javax.swing.JLabel();

                setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

                tabelPro.setModel(new javax.swing.table.DefaultTableModel(
                        new Object [][] {

                        },
                        new String [] {
                                "Nama Mahasiswa", "NIM", "NamaKegiatan", "Instasnsi KP"
                        }
                ) {
                        Class[] types = new Class [] {
                                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
                        };

                        public Class getColumnClass(int columnIndex) {
                                return types [columnIndex];
                        }
                });
                jScrollPane1.setViewportView(tabelPro);

                jadwalMulai.setText("Jadwal Mulai KP");

                jadwalAkhir.setText("Jadwal Akhir KP");

                mulaiKP.setToolTipText("dd-MM-YYYY");

                akhirKP.setToolTipText("dd-MM-YYYY");

                KPCheckBox.setText("Kelayakan KP");
                KPCheckBox.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                KPCheckBoxActionPerformed(evt);
                        }
                });

                dsnPembLabel.setText("Dosen Pembimbing");

                dsnComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-Pilih Dosen Pembimbing-" }));
                dsnComboBox.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                dsnComboBoxActionPerformed(evt);
                        }
                });

                btn_simpan.setText("VIEW");
                btn_simpan.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                btn_simpanActionPerformed(evt);
                        }
                });

                btn_logout.setText("LOGOUT");
                btn_logout.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                btn_logoutActionPerformed(evt);
                        }
                });

                btn_simpan1.setText("SIMPAN");
                btn_simpan1.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                btn_simpan1ActionPerformed(evt);
                        }
                });

                jLabel1.setText("Lihat list mahasiswa");

                javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
                getContentPane().setLayout(layout);
                layout.setHorizontalGroup(
                        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(33, 33, 33)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addGap(0, 0, Short.MAX_VALUE)
                                                .addComponent(dsnComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(257, 257, 257))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(dsnPembLabel)
                                                        .addComponent(KPCheckBox)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(18, 18, 18)
                                                                .addComponent(btn_simpan)))
                                                .addContainerGap(359, Short.MAX_VALUE))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addComponent(jadwalMulai)
                                                                .addGap(18, 18, 18)
                                                                .addComponent(mulaiKP, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(18, 18, 18)
                                                                .addComponent(jadwalAkhir)
                                                                .addGap(18, 18, 18)
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addGroup(layout.createSequentialGroup()
                                                                                .addComponent(btn_simpan1)
                                                                                .addGap(18, 18, 18)
                                                                                .addComponent(btn_logout))
                                                                        .addComponent(akhirKP, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                                .addGap(0, 28, Short.MAX_VALUE))))
                );
                layout.setVerticalGroup(
                        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(107, 107, 107)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(btn_simpan)
                                        .addComponent(jLabel1))
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(KPCheckBox)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(dsnPembLabel)
                                                        .addComponent(dsnComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGap(32, 32, 32)
                                                                .addComponent(jadwalAkhir))
                                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(jadwalMulai)))
                                                .addGap(8, 8, 8))
                                        .addComponent(mulaiKP, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(akhirKP, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 64, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(btn_logout)
                                        .addComponent(btn_simpan1))
                                .addGap(59, 59, 59))
                );

                pack();
        }// </editor-fold>//GEN-END:initComponents

    private void KPCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_KPCheckBoxActionPerformed
        // TODO add your handling code here:
        if(KPCheckBox.isSelected()){
        }
        else{
            }
    }//GEN-LAST:event_KPCheckBoxActionPerformed

    private void dsnComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dsnComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dsnComboBoxActionPerformed

    private void btn_logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_logoutActionPerformed
        new login_user().setVisible(true);
    }//GEN-LAST:event_btn_logoutActionPerformed

    private void btn_simpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_simpanActionPerformed
        
	    
	    jadwalKerjaPraktek.setmulai(mulaiKP.getDate());
	    jadwalKerjaPraktek.setakhir(akhirKP.getDate());
	    
	    
	    //JOptionPane.showMessageDialog(null, "data tersimpan");
    }//GEN-LAST:event_btn_simpanActionPerformed

    private void btn_simpan1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_simpan1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_simpan1ActionPerformed

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
            java.util.logging.Logger.getLogger(FrameProdi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrameProdi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrameProdi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrameProdi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrameProdi().setVisible(true);
            }
        });
    }

        // Variables declaration - do not modify//GEN-BEGIN:variables
        private javax.swing.JCheckBox KPCheckBox;
        private com.toedter.calendar.JDateChooser akhirKP;
        private javax.swing.JButton btn_logout;
        private javax.swing.JButton btn_simpan;
        private javax.swing.JButton btn_simpan1;
        private javax.swing.JComboBox<String> dsnComboBox;
        private javax.swing.JLabel dsnPembLabel;
        private javax.swing.JLabel jLabel1;
        private javax.swing.JScrollPane jScrollPane1;
        private javax.swing.JLabel jadwalAkhir;
        private javax.swing.JLabel jadwalMulai;
        private com.toedter.calendar.JDateChooser mulaiKP;
        private javax.swing.JTable tabelPro;
        // End of variables declaration//GEN-END:variables

	 public void getPersetujuanFromDatabase(){
        DefaultTableModel modelTableKelayakan = (DefaultTableModel) tabelPro.getModel();
        modelTableKelayakan.setRowCount(0);
        Object[] atributKerjaPraktek = new Object[5];
        try {
            ArrayList KelayakanAll = new KerjaPraktek().semuaDB();
            Iterator listRevisi = KelayakanAll.iterator();
            while(listRevisi.hasNext()){
                KerjaPraktek eachKerjaPraktek;
                eachKerjaPraktek = (KerjaPraktek) listRevisi.next();
                atributKerjaPraktek[0] = eachKerjaPraktek.getidKp() + " | " + eachKerjaPraktek.mahasiswa.getnama();
                atributKerjaPraktek[1] = eachKerjaPraktek.getidKp() + " | " + eachKerjaPraktek.mahasiswa.getnama();
                atributKerjaPraktek[2] = new SimpleDateFormat("dd-MM-yyyy").format(eachKerjaPraktek.getnamaKegiatan());
                atributKerjaPraktek[3] = eachKerjaPraktek.getidKp() + " | " + eachKerjaPraktek.getinstansi();
        
                modelTableKelayakan.addRow(atributKerjaPraktek);
            }
            tabelPro.setModel(modelTableKelayakan);
        } catch (Exception ex) {
            Logger.getLogger(FrameDoswal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
	
    public Dosen getDosen() {
        return dosen;
    }
    public void setDosen(Dosen dosen) {
        this.dosen = dosen;
    }
    public User getUser() {
        return user;
    }
    public void setUser(User user) {
        this.user = user;
    }
    public Prodi getProdi() {
        return prodi;
    }
    public void setProdi(Prodi prodi) {
        this.prodi = prodi;
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
    public JadwalKerjaPraktek getJadwalKerjaPraktek() {
        return jadwalKerjaPraktek;
    }

    public void setJadwalKerjaPraktek(JadwalKerjaPraktek jadwalKerjaPraktek) {
        this.jadwalKerjaPraktek = jadwalKerjaPraktek;
    }
}
