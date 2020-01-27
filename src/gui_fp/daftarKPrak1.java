package gui_fp;

import codingan.*;
import koneksi.koneksii;
import java.awt.Color;
import javax.swing.JOptionPane;
import java.util.Calendar;
import java.time.LocalDate;
import java.sql.Date;
import java.text.SimpleDateFormat;
import java.awt.event.KeyEvent;

public class daftarKPrak1 extends javax.swing.JFrame {

public daftarKPrak1() {
        initComponents();
       setLocationRelativeTo(this);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        pil1_kp = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        nim1_kp = new javax.swing.JTextField();
        sem1_kp = new javax.swing.JTextField();
        nama1_kp = new javax.swing.JTextField();
        keg1 = new javax.swing.JTextField();
        save_kp1 = new javax.swing.JButton();
        preview1_kp = new javax.swing.JButton();
        exit1_kp = new javax.swing.JButton();
        nama1_kp1 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setSize(new java.awt.Dimension(0, 0));

        jPanel1.setEnabled(false);
        jPanel1.setLayout(null);

        jLabel2.setFont(new java.awt.Font("Lucida Sans Unicode", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 38, 76));
        jLabel2.setText("PENDAFTARAN KERJA PRAKTEK");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(120, 20, 400, 40);

        pil1_kp.setBackground(new java.awt.Color(0, 102, 153));
        pil1_kp.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "PT.TELKOM", "PT.MAHAKARYA", "PT.INDO PRIMA", "PT.DIAN MAKMUR" }));
        jPanel1.add(pil1_kp);
        pil1_kp.setBounds(340, 300, 290, 30);

        jLabel3.setFont(new java.awt.Font("Sitka Heading", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 38, 76));
        jLabel3.setText("NIM");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(90, 150, 150, 30);

        jLabel4.setFont(new java.awt.Font("Sitka Heading", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 38, 76));
        jLabel4.setText("SEMESTER");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(90, 200, 150, 30);

        jLabel5.setFont(new java.awt.Font("Sitka Heading", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 38, 76));
        jLabel5.setText("PILIHAN TEMPAT KP");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(90, 300, 170, 30);

        jLabel6.setFont(new java.awt.Font("Sitka Heading", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 38, 76));
        jLabel6.setText("NAMA   ");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(90, 100, 150, 30);

        nim1_kp.setBackground(new java.awt.Color(0, 102, 153));
        nim1_kp.setFont(new java.awt.Font("Sitka Heading", 1, 14)); // NOI18N
        nim1_kp.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                nim1_kpKeyPressed(evt);
            }
        });
        jPanel1.add(nim1_kp);
        nim1_kp.setBounds(340, 150, 290, 30);

        sem1_kp.setBackground(new java.awt.Color(0, 102, 153));
        sem1_kp.setFont(new java.awt.Font("Sitka Heading", 1, 14)); // NOI18N
        sem1_kp.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                sem1_kpKeyPressed(evt);
            }
        });
        jPanel1.add(sem1_kp);
        sem1_kp.setBounds(340, 200, 290, 30);

        nama1_kp.setBackground(new java.awt.Color(0, 102, 153));
        nama1_kp.setFont(new java.awt.Font("Sitka Heading", 1, 14)); // NOI18N
        jPanel1.add(nama1_kp);
        nama1_kp.setBounds(340, 100, 290, 30);

        keg1.setBackground(new java.awt.Color(0, 102, 153));
        keg1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                keg1KeyPressed(evt);
            }
        });
        jPanel1.add(keg1);
        keg1.setBounds(340, 250, 290, 30);

        save_kp1.setBackground(new java.awt.Color(0, 102, 153));
        save_kp1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        save_kp1.setText("SAVE");
        save_kp1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        save_kp1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                save_kp1ActionPerformed(evt);
            }
        });
        jPanel1.add(save_kp1);
        save_kp1.setBounds(230, 380, 120, 30);

        preview1_kp.setBackground(new java.awt.Color(0, 102, 153));
        preview1_kp.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        preview1_kp.setText("PREVIEW");
        preview1_kp.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        preview1_kp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                preview1_kpActionPerformed(evt);
            }
        });
        jPanel1.add(preview1_kp);
        preview1_kp.setBounds(370, 380, 120, 30);

        exit1_kp.setBackground(new java.awt.Color(0, 102, 153));
        exit1_kp.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        exit1_kp.setText("EXIT");
        exit1_kp.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        exit1_kp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exit1_kpActionPerformed(evt);
            }
        });
        jPanel1.add(exit1_kp);
        exit1_kp.setBounds(510, 380, 120, 30);

        nama1_kp1.setBackground(new java.awt.Color(0, 102, 153));
        nama1_kp1.setFont(new java.awt.Font("Sitka Heading", 1, 14)); // NOI18N
        nama1_kp1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nama1_kp1ActionPerformed(evt);
            }
        });
        nama1_kp1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                nama1_kp1KeyPressed(evt);
            }
        });
        jPanel1.add(nama1_kp1);
        nama1_kp1.setBounds(340, 100, 290, 30);

        jLabel7.setFont(new java.awt.Font("Sitka Heading", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 38, 76));
        jLabel7.setText("KEGIATAN");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(90, 250, 150, 30);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar1/b1.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, 0, 640, 520);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 643, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 525, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void save_kp1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_save_kp1ActionPerformed
                  daftarKP_mhs oi = new daftarKP_mhs();
       
                   oi.setNama(nama1_kp.getText());
                   oi.setNim(nim1_kp.getText());
                   oi.setPeriode_Semester(sem1_kp.getText());
                   oi.setinstansi((String)pil1_kp.getSelectedItem());
                   oi.setNama_Kegiatan(keg1.getText());
          try{ 
              oi.update_daftarKP();
              oi.update_daftarKP1();
        JOptionPane.showMessageDialog(null,"DATA TERSIMPAN");
       }catch (Exception s){
           JOptionPane.showMessageDialog(null,"DATA GAGAL DISIMPAN");
       }
   if (nama1_kp.getText().equals("")) {
      JOptionPane.showMessageDialog(null, "Kolom Nama Tidak Boleh Kosong!!", "Peringatan", JOptionPane.WARNING_MESSAGE);
 } else if (nim1_kp.getText().equals("")) {
      JOptionPane.showMessageDialog(null, "Kolom Nim Tidak Boleh Kosong!!", "Peringatan", JOptionPane.WARNING_MESSAGE);
 } else if (sem1_kp.getText().equals("")) {
      JOptionPane.showMessageDialog(null, "Kolom Alamat Tidak Boleh Kosong!!", "Peringatan", JOptionPane.WARNING_MESSAGE);
 }else if (keg1.getText().equals("")) {
      JOptionPane.showMessageDialog(null, "Kolom Kegiatan Tidak Boleh Kosong!!", "Peringatan", JOptionPane.WARNING_MESSAGE);
 }else{
     
 }
    }//GEN-LAST:event_save_kp1ActionPerformed

    private void preview1_kpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_preview1_kpActionPerformed
        
       JOptionPane.showMessageDialog(this, " NAMA  : "+ nama1_kp.getText()+"\n"+"NIM :  " + nim1_kp.getText()+"\n"+
                " SEMESTER : " + sem1_kp.getText()+"\n"+" PILIHAN TEMPAT KP : " +  pil1_kp.getSelectedItem()+"\n"+
             "KEGIATAN"+  keg1.getText());
    }//GEN-LAST:event_preview1_kpActionPerformed

    private void exit1_kpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exit1_kpActionPerformed
        info_mhs oii = new info_mhs();
        oii.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_exit1_kpActionPerformed

    private void nim1_kpKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nim1_kpKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER  || evt.getKeyCode() == KeyEvent.VK_TAB) {
            sem1_kp.requestFocus();
        }
    }//GEN-LAST:event_nim1_kpKeyPressed

    private void sem1_kpKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_sem1_kpKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER  || evt.getKeyCode() == KeyEvent.VK_TAB) {
            keg1.requestFocus();
        }
    }//GEN-LAST:event_sem1_kpKeyPressed

    private void nama1_kp1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nama1_kp1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nama1_kp1ActionPerformed

    private void nama1_kp1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nama1_kp1KeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER  || evt.getKeyCode() == KeyEvent.VK_TAB) {
            nim1_kp.requestFocus();
        }
    }//GEN-LAST:event_nama1_kp1KeyPressed

        private void keg1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_keg1KeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER  || evt.getKeyCode() == KeyEvent.VK_TAB) {
            save_kp1.requestFocus();
        }
        }//GEN-LAST:event_keg1KeyPressed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new daftarKPrak1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton exit1_kp;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField keg1;
    private javax.swing.JTextField nama1_kp;
    private javax.swing.JTextField nama1_kp1;
    private javax.swing.JTextField nim1_kp;
    private javax.swing.JComboBox<String> pil1_kp;
    private javax.swing.JButton preview1_kp;
    private javax.swing.JButton save_kp1;
    private javax.swing.JTextField sem1_kp;
    // End of variables declaration//GEN-END:variables
}
