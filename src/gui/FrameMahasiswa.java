/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import javax.swing.JOptionPane;
import base.*;
/**
 *
 * @author Jempol
 */
public class FrameMahasiswa extends javax.swing.JFrame {
    private User user = new User();	
    private Dosen dosen = new Dosen();
    private Mahasiswa mahasiswa = new Mahasiswa();
    private KerjaPraktek kerjaPraktek = new KerjaPraktek();
    private PersetujuanDosen persetujuanDosen = new PersetujuanDosen();
    private PersetujuanProdi persetujuanProdi = new PersetujuanProdi();
    private Bimbingan bimbingan = new Bimbingan();
    /**
     * Creates new form FrameMahasiswa
     */
    public FrameMahasiswa() {
        initComponents();
        lb_nama.setVisible(false);
        lb_nim.setVisible(false);
        lb_kegiatan.setVisible(false);
        lb_KP.setVisible(false);
        lb_doswal.setVisible(false);
        lb_dospem.setVisible(false);
        lb_status.setVisible(false);
        txt_nama.setVisible(false);
        txt_nim.setVisible(false);
        txt_kegiatan.setVisible(false);
        txt_instansi.setVisible(false);
        txt_doswal.setVisible(false);
        txt_dospem.setVisible(false);
        txt_status.setVisible(false);
    }
    
     public FrameMahasiswa(User user) {
        super("Mahasiswa : " + (new Mahasiswa().satuDB(user.getusername())).getnama());
        setUser(user);
        setMahasiswa(new Mahasiswa().satuDB(user.getusername()));
        initComponents();
     }
//    public void hideShowAll(boolean bool){
//        
//    }
//    public void ShowDaftar(boolean bool){
//        
//    }
//    public void ViewData(boolean bool){
//        
//    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
        // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
        private void initComponents() {

                btn_daftar = new javax.swing.JButton();
                btn_view = new javax.swing.JButton();
                lb_nama = new javax.swing.JLabel();
                lb_nim = new javax.swing.JLabel();
                lb_kegiatan = new javax.swing.JLabel();
                lb_KP = new javax.swing.JLabel();
                txt_nama = new javax.swing.JTextField();
                txt_nim = new javax.swing.JTextField();
                txt_kegiatan = new javax.swing.JTextField();
                txt_instansi = new javax.swing.JTextField();
                lb_doswal = new javax.swing.JLabel();
                lb_dospem = new javax.swing.JLabel();
                lb_status = new javax.swing.JLabel();
                txt_dospem = new javax.swing.JTextField();
                txt_doswal = new javax.swing.JTextField();
                txt_status = new javax.swing.JTextField();
                btn_logout = new javax.swing.JButton();
                btn_simpan = new javax.swing.JButton();

                setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

                btn_daftar.setText("Daftar KP");
                btn_daftar.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                btn_daftarActionPerformed(evt);
                        }
                });

                btn_view.setText("View Data");
                btn_view.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                btn_viewActionPerformed(evt);
                        }
                });

                lb_nama.setText("Nama");

                lb_nim.setText("NIM");

                lb_kegiatan.setText("Kegiatan");

                lb_KP.setText("Instansi KP");

                txt_instansi.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                txt_instansiActionPerformed(evt);
                        }
                });

                lb_doswal.setText("Dosen Wali");

                lb_dospem.setText("Dosen Pembimbing");

                lb_status.setText("Status KP");

                btn_logout.setText("LOGOUT");
                btn_logout.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                btn_logoutActionPerformed(evt);
                        }
                });

                btn_simpan.setText("SIMPAN");
                btn_simpan.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                btn_simpanActionPerformed(evt);
                        }
                });

                javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
                getContentPane().setLayout(layout);
                layout.setHorizontalGroup(
                        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btn_simpan)
                                .addGap(33, 33, 33)
                                .addComponent(btn_logout)
                                .addGap(44, 44, 44))
                        .addGroup(layout.createSequentialGroup()
                                .addGap(44, 44, 44)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(btn_daftar)
                                                .addGap(33, 33, 33)
                                                .addComponent(btn_view))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addComponent(lb_status, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(0, 0, Short.MAX_VALUE))
                                                        .addComponent(lb_dospem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                .addGap(18, 18, 18)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(txt_dospem, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(txt_status, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(lb_nama)
                                                        .addComponent(lb_nim))
                                                .addGap(112, 112, 112)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addComponent(txt_nama, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(txt_nim, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(lb_KP, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addComponent(lb_kegiatan, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(txt_kegiatan, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGap(60, 60, 60)
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(txt_doswal, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(txt_instansi, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                        .addComponent(lb_doswal, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(248, Short.MAX_VALUE))
                );
                layout.setVerticalGroup(
                        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(101, 101, 101)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(btn_daftar)
                                        .addComponent(btn_view))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(28, 28, 28)
                                                .addComponent(lb_nama))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(txt_nama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(33, 33, 33)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(lb_nim)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(lb_kegiatan))
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(txt_nim, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(32, 32, 32)
                                                .addComponent(txt_kegiatan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(26, 26, 26)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(btn_logout)
                                        .addComponent(btn_simpan)
                                        .addComponent(txt_instansi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(lb_KP))
                                .addGap(32, 32, 32)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(lb_doswal, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txt_doswal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(36, 36, 36)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(lb_dospem)
                                        .addComponent(txt_dospem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(36, 36, 36)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(txt_status, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(lb_status, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(140, 140, 140))
                );

                pack();
        }// </editor-fold>//GEN-END:initComponents

    private void btn_logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_logoutActionPerformed
        new login_user().setVisible(true);
	this.setVisible(false);
    }//GEN-LAST:event_btn_logoutActionPerformed

    private void btn_simpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_simpanActionPerformed
        JOptionPane.showMessageDialog(null,"data tersimpan");
        lb_nama.setVisible(false);
        lb_nim.setVisible(false);
        lb_kegiatan.setVisible(false);
        lb_KP.setVisible(false);
        lb_doswal.setVisible(false);
        lb_dospem.setVisible(false);
        lb_status.setVisible(false);
        txt_nama.setVisible(false);
        txt_nim.setVisible(false);
        txt_kegiatan.setVisible(false);
        txt_instansi.setVisible(false);
	txt_kegiatan.setVisible(false);
        txt_doswal.setVisible(false);
        txt_dospem.setVisible(false);
        txt_status.setVisible(false);
	
	KerjaPraktek kp = new KerjaPraktek();
	kerjaPraktek.setinstansi(txt_instansi.getText());
	kerjaPraktek.setnamaKegiatan(txt_kegiatan.getText());
	   try{ 
               kerjaPraktek.masukDB();
        JOptionPane.showMessageDialog(null,"DATA TERSIMPAN");
       }catch (Exception s){
           JOptionPane.showMessageDialog(null,"DATA GAGAL DISIMPAN");
       }
    }//GEN-LAST:event_btn_simpanActionPerformed

    private void btn_daftarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_daftarActionPerformed
        lb_nama.setVisible(true);
        lb_nim.setVisible(true);
        lb_kegiatan.setVisible(true);
        lb_KP.setVisible(true);
        txt_nama.setVisible(true);
        txt_nim.setVisible(true);
        txt_kegiatan.setVisible(true);
        txt_instansi.setVisible(true);
	
	

    }//GEN-LAST:event_btn_daftarActionPerformed

    private void btn_viewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_viewActionPerformed
        lb_nama.setVisible(true);
        lb_nim.setVisible(true);
        lb_kegiatan.setVisible(true);
        lb_KP.setVisible(true);
        lb_doswal.setVisible(true);
        lb_dospem.setVisible(true);
        lb_status.setVisible(true);
        txt_nama.setVisible(true);
        txt_nim.setVisible(true);
        txt_instansi.setVisible(true);
	txt_kegiatan.setVisible(true);
        txt_doswal.setVisible(true);
        txt_dospem.setVisible(true);
        txt_status.setVisible(true);
	
	txt_nama.setText(getMahasiswa().getnama());
        txt_nim.setText(getMahasiswa().getnim());
        txt_instansi.setText(getKerjaPraktek().getinstansi());
        txt_kegiatan.setText(getKerjaPraktek().getnamaKegiatan());
        txt_doswal.setText(getDosen().getnama());
        txt_dospem.setText(getDosen().getnama());
	
    }//GEN-LAST:event_btn_viewActionPerformed

        private void txt_instansiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_instansiActionPerformed
                // TODO add your handling code here:
        }//GEN-LAST:event_txt_instansiActionPerformed

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
            java.util.logging.Logger.getLogger(FrameMahasiswa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrameMahasiswa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrameMahasiswa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrameMahasiswa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrameMahasiswa().setVisible(true);
            }
        });
    }

        // Variables declaration - do not modify//GEN-BEGIN:variables
        private javax.swing.JButton btn_daftar;
        private javax.swing.JButton btn_logout;
        private javax.swing.JButton btn_simpan;
        private javax.swing.JButton btn_view;
        private javax.swing.JLabel lb_KP;
        private javax.swing.JLabel lb_dospem;
        private javax.swing.JLabel lb_doswal;
        private javax.swing.JLabel lb_kegiatan;
        private javax.swing.JLabel lb_nama;
        private javax.swing.JLabel lb_nim;
        private javax.swing.JLabel lb_status;
        private javax.swing.JTextField txt_dospem;
        private javax.swing.JTextField txt_doswal;
        private javax.swing.JTextField txt_instansi;
        private javax.swing.JTextField txt_kegiatan;
        private javax.swing.JTextField txt_nama;
        private javax.swing.JTextField txt_nim;
        private javax.swing.JTextField txt_status;
        // End of variables declaration//GEN-END:variables

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
