/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import base.*;
import java.util.ArrayList;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.StringTokenizer;
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
	setComboxAll();
        mulaiKP.setDateFormatString("dd-MM-yyyy");
        akhirKP.setDateFormatString("dd-MM-yyyy");
    }

    public FrameProdi(User user) {
        super("Prodi : " + (new Prodi().satuDB(user.getusername())).getnamaProdi());
        setUser(user);
	setProdi(new Prodi().satuDB(user.getusername()));
        initComponents();
	setComboxAll();
        mulaiKP.setDateFormatString("dd-MM-yyyy");
        akhirKP.setDateFormatString("dd-MM-yyyy");
      }
    
    public void setDosenCombox(ArrayList<Dosen> list){
        Iterator<Dosen> tiapList = list.iterator();
        
        while(tiapList.hasNext()){
            Dosen d = tiapList.next();
            dsnComboBox.addItem(d.getnama());
        }  
    }
        
    public void setComboxAll(){
        dsnComboBox.removeAllItems();
        dsnComboBox.addItem("-Pilih Dosen Wali-");
	
     setDosenCombox(getDosen().semuaDB());
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
                jadwalAkhir = new javax.swing.JLabel();
                mulaiKP = new com.toedter.calendar.JDateChooser();
                akhirKP = new com.toedter.calendar.JDateChooser();
                KPCheckBox = new javax.swing.JCheckBox();
                dsnPembLabel = new javax.swing.JLabel();
                dsnComboBox = new javax.swing.JComboBox<>();
                btn_view = new javax.swing.JButton();
                btn_logout = new javax.swing.JButton();
                btn_simpan1 = new javax.swing.JButton();
                jLabel1 = new javax.swing.JLabel();
                AturToggleButton = new javax.swing.JToggleButton();
                SimpanKpButton = new javax.swing.JButton();
                jSeparator1 = new javax.swing.JSeparator();

                setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

                tabelPro.setModel(new javax.swing.table.DefaultTableModel(
                        new Object [][] {

                        },
                        new String [] {
                                "NIM - Nama", "Id - Nama Kegiatan", "Instasnsi KP"
                        }
                ) {
                        Class[] types = new Class [] {
                                java.lang.String.class, java.lang.String.class, java.lang.String.class
                        };
                        boolean[] canEdit = new boolean [] {
                                false, false, false
                        };

                        public Class getColumnClass(int columnIndex) {
                                return types [columnIndex];
                        }

                        public boolean isCellEditable(int rowIndex, int columnIndex) {
                                return canEdit [columnIndex];
                        }
                });
                jScrollPane1.setViewportView(tabelPro);

                jadwalAkhir.setText("Sampai");

                mulaiKP.setToolTipText("dd-MM-YYYY");

                akhirKP.setToolTipText("dd-MM-YYYY");

                KPCheckBox.setText("Kelayakan KP");
                KPCheckBox.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                KPCheckBoxActionPerformed(evt);
                        }
                });

                dsnPembLabel.setText("Dosen Pembimbing");

                dsnComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-" }));
                dsnComboBox.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                dsnComboBoxActionPerformed(evt);
                        }
                });

                btn_view.setText("VIEW");
                btn_view.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                btn_viewActionPerformed(evt);
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

                AturToggleButton.setText("Atur Jadwal KP");
                AturToggleButton.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                AturToggleButtonActionPerformed(evt);
                        }
                });

                SimpanKpButton.setText("Simpan");
                SimpanKpButton.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                SimpanKpButtonActionPerformed(evt);
                        }
                });

                javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
                getContentPane().setLayout(layout);
                layout.setHorizontalGroup(
                        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(dsnComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(282, 282, 282))
                        .addGroup(layout.createSequentialGroup()
                                .addGap(33, 33, 33)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(dsnPembLabel)
                                                        .addComponent(KPCheckBox)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(18, 18, 18)
                                                                .addComponent(btn_view)))
                                                .addContainerGap(370, Short.MAX_VALUE))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                                .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 516, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGroup(layout.createSequentialGroup()
                                                                        .addComponent(btn_simpan1)
                                                                        .addGap(18, 18, 18)
                                                                        .addComponent(btn_logout)))
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addComponent(AturToggleButton)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(mulaiKP, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(3, 3, 3)
                                                                .addComponent(jadwalAkhir)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(akhirKP, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(SimpanKpButton))
                                                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 539, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(0, 0, Short.MAX_VALUE))))
                );
                layout.setVerticalGroup(
                        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(59, 59, 59)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                        .addComponent(SimpanKpButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(AturToggleButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(mulaiKP, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                                                        .addComponent(akhirKP, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE))
                                                .addGap(4, 4, 4))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addContainerGap()
                                                .addComponent(jadwalAkhir)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(4, 4, 4)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(btn_view)
                                        .addComponent(jLabel1))
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(KPCheckBox)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(dsnPembLabel)
                                        .addComponent(dsnComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 118, Short.MAX_VALUE)
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
		PersetujuanProdi perPro = new PersetujuanProdi(prodi.getidProdi(),getPersetujuanDosen().getidAccDosen() , true);
            perPro.masukDB();
        }
        else{
		PersetujuanProdi perPro = new PersetujuanProdi(prodi.getidProdi(),getPersetujuanDosen().getidAccDosen() , false);
            perPro.masukDB();
            }
    }//GEN-LAST:event_KPCheckBoxActionPerformed

    private void dsnComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dsnComboBoxActionPerformed
	 
    }//GEN-LAST:event_dsnComboBoxActionPerformed

    private void btn_logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_logoutActionPerformed
        new login_user().setVisible(true);
    }//GEN-LAST:event_btn_logoutActionPerformed

    private void btn_viewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_viewActionPerformed
        
	getPersetujuanFromDatabase();
	    
	    //JOptionPane.showMessageDialog(null, "data tersimpan");
    }//GEN-LAST:event_btn_viewActionPerformed

    private void btn_simpan1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_simpan1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_simpan1ActionPerformed

    private void SimpanKpButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SimpanKpButtonActionPerformed
        // TODO add your handling code here:
        Date jadwal1 = mulaiKP.getDate();
        Date jadwal2 = akhirKP.getDate();
        setJadwalKerjaPraktek(new JadwalKerjaPraktek(getProdi().getidProdi(), jadwal1 , jadwal2));
        getJadwalKerjaPraktek().masukDB();
        
//        JadwalKerjaPraktek jkp = new JadwalKerjaPraktek();
//        ArrayList<JadwalKerjaPraktek> list = new JadwalKerjaPraktek().semuaDB();
//        Iterator<JadwalKerjaPraktek> tiapList = list.iterator();
//        
//        while(tiapList.hasNext()){
//            JadwalKerjaPraktek temp = tiapList.next();
//            if (temp.prodi.getidProdi().equals(getProdi().getidProdi())){
//                jkp = temp;
//                break;
//            }
//        }
//        
//	jkp.prodi =  getProdi().getidProdi();
//        jkp.setmulai(mulaiKP.getDate());
//        jkp.setakhir(akhirKP.getDate());
//            
//        if(jkp != null){
//            jkp.updateDB();
//        }
//        else
//        {
//            jkp.masukDB();
//        }
        JOptionPane.showMessageDialog(null, "Jadwal berhasil di atur");
    }//GEN-LAST:event_SimpanKpButtonActionPerformed

    private void AturToggleButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AturToggleButtonActionPerformed
        // TODO add your handling code here:
        if(AturToggleButton.isSelected()){
            mulaiKP.getDate();
            akhirKP.getDate();
//            jadwalKerjaPraktek.masukDB();
            
        }
        else
        {
            
        }
    }//GEN-LAST:event_AturToggleButtonActionPerformed

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
        private javax.swing.JToggleButton AturToggleButton;
        private javax.swing.JCheckBox KPCheckBox;
        private javax.swing.JButton SimpanKpButton;
        private com.toedter.calendar.JDateChooser akhirKP;
        private javax.swing.JButton btn_logout;
        private javax.swing.JButton btn_simpan1;
        private javax.swing.JButton btn_view;
        private javax.swing.JComboBox<String> dsnComboBox;
        private javax.swing.JLabel dsnPembLabel;
        private javax.swing.JLabel jLabel1;
        private javax.swing.JScrollPane jScrollPane1;
        private javax.swing.JSeparator jSeparator1;
        private javax.swing.JLabel jadwalAkhir;
        private com.toedter.calendar.JDateChooser mulaiKP;
        private javax.swing.JTable tabelPro;
        // End of variables declaration//GEN-END:variables

	 public void getPersetujuanFromDatabase(){
        DefaultTableModel modelTableKelayakan = (DefaultTableModel) tabelPro.getModel();
        modelTableKelayakan.setRowCount(0);
        Object[] atributKerjaPraktek = new Object[3];
        try {
            ArrayList KelayakanAll = new KerjaPraktek().semuaDB();
            Iterator listRevisi = KelayakanAll.iterator();
            while(listRevisi.hasNext()){
                KerjaPraktek eachKerjaPraktek;
                eachKerjaPraktek = (KerjaPraktek) listRevisi.next();
                atributKerjaPraktek[0] = eachKerjaPraktek.mahasiswa.getnim() + " - " + eachKerjaPraktek.mahasiswa.getnama();
                atributKerjaPraktek[1] = eachKerjaPraktek.getidKp() + " - " + eachKerjaPraktek.getnamaKegiatan();
                atributKerjaPraktek[3] = eachKerjaPraktek.getinstansi();
        
                modelTableKelayakan.addRow(atributKerjaPraktek);
            }
            tabelPro.setModel(modelTableKelayakan);
        } catch (Exception ex) {
            Logger.getLogger(FrameDoswal.class.getName()).log(Level.SEVERE, null, ex);
        }
    
	   
	    }
    public void hideJadwal(Boolean bool){
        mulaiKP.setVisible(bool);
        jadwalAkhir.setVisible(bool);
        akhirKP.setVisible(bool);
        SimpanKpButton.setVisible(bool);
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
