package gui_fp;

//import koneksi.koneksi_fp1;
import codingan.Mahasiswa;
import javax.swing.JOptionPane;
import java.awt.event.ActionEvent;
import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.ResultSet;
import koneksi.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import java.sql.DriverManager;
import javax.swing.JTable;
import java.awt.event.KeyEvent;

public class register_mhs extends javax.swing.JFrame {
public  Connection con;
public  java.sql.Statement stm;

   

    public register_mhs() {
         initComponents();
         setLocationRelativeTo(this);
      
    }
   
  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        nim2 = new javax.swing.JLabel();
        ttl2 = new javax.swing.JLabel();
        alamat2 = new javax.swing.JLabel();
        agama2 = new javax.swing.JLabel();
        nama11 = new javax.swing.JTextField();
        nim11 = new javax.swing.JTextField();
        alamat11 = new javax.swing.JTextField();
        ttl11 = new javax.swing.JTextField();
        agama11 = new javax.swing.JComboBox<>();
        save_mhs = new javax.swing.JButton();
        cancel1 = new javax.swing.JButton();
        hapus1 = new javax.swing.JButton();
        nama3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jPanel2.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Sitka Heading", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 204, 0));
        jLabel1.setText("DATA MAHASISWA");
        jPanel2.add(jLabel1);
        jLabel1.setBounds(140, 10, 350, 46);

        nim2.setFont(new java.awt.Font("Sitka Heading", 1, 18)); // NOI18N
        nim2.setForeground(new java.awt.Color(0, 204, 0));
        nim2.setText("NIM");
        jPanel2.add(nim2);
        nim2.setBounds(80, 150, 175, 30);

        ttl2.setFont(new java.awt.Font("Sitka Heading", 1, 18)); // NOI18N
        ttl2.setForeground(new java.awt.Color(0, 204, 0));
        ttl2.setText("TTL");
        jPanel2.add(ttl2);
        ttl2.setBounds(80, 250, 175, 30);

        alamat2.setFont(new java.awt.Font("Sitka Heading", 1, 18)); // NOI18N
        alamat2.setForeground(new java.awt.Color(0, 204, 0));
        alamat2.setText("ALAMAT");
        jPanel2.add(alamat2);
        alamat2.setBounds(80, 200, 175, 30);

        agama2.setFont(new java.awt.Font("Sitka Heading", 1, 18)); // NOI18N
        agama2.setForeground(new java.awt.Color(0, 204, 0));
        agama2.setText("AGAMA");
        jPanel2.add(agama2);
        agama2.setBounds(80, 300, 175, 30);

        nama11.setBackground(new java.awt.Color(76, 136, 234));
        nama11.setFont(new java.awt.Font("Sitka Heading", 1, 14)); // NOI18N
        nama11.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                nama11KeyPressed(evt);
            }
        });
        jPanel2.add(nama11);
        nama11.setBounds(290, 100, 330, 30);

        nim11.setBackground(new java.awt.Color(76, 136, 234));
        nim11.setFont(new java.awt.Font("Sitka Heading", 1, 14)); // NOI18N
        nim11.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                nim11KeyPressed(evt);
            }
        });
        jPanel2.add(nim11);
        nim11.setBounds(290, 150, 330, 30);

        alamat11.setBackground(new java.awt.Color(76, 136, 234));
        alamat11.setFont(new java.awt.Font("Sitka Heading", 1, 14)); // NOI18N
        alamat11.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                alamat11KeyPressed(evt);
            }
        });
        jPanel2.add(alamat11);
        alamat11.setBounds(290, 200, 330, 30);

        ttl11.setBackground(new java.awt.Color(76, 136, 234));
        ttl11.setFont(new java.awt.Font("Sitka Heading", 1, 14)); // NOI18N
        ttl11.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                ttl11KeyPressed(evt);
            }
        });
        jPanel2.add(ttl11);
        ttl11.setBounds(290, 250, 330, 30);

        agama11.setBackground(new java.awt.Color(76, 136, 234));
        agama11.setEditable(true);
        agama11.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ISLAM", "KRISTEN", "HINDHU", "BUDHA" }));
        agama11.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                agama11ItemStateChanged(evt);
            }
        });
        agama11.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                agama11KeyPressed(evt);
            }
        });
        jPanel2.add(agama11);
        agama11.setBounds(290, 300, 330, 30);

        save_mhs.setBackground(new java.awt.Color(11, 10, 10));
        save_mhs.setFont(new java.awt.Font("Sitka Heading", 1, 18)); // NOI18N
        save_mhs.setForeground(new java.awt.Color(0, 204, 0));
        save_mhs.setText("SAVE");
        save_mhs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                save_mhsActionPerformed(evt);
            }
        });
        jPanel2.add(save_mhs);
        save_mhs.setBounds(400, 390, 90, 30);

        cancel1.setBackground(new java.awt.Color(11, 10, 10));
        cancel1.setFont(new java.awt.Font("Sitka Heading", 1, 18)); // NOI18N
        cancel1.setForeground(new java.awt.Color(0, 204, 0));
        cancel1.setText("EXIT");
        cancel1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancel1ActionPerformed(evt);
            }
        });
        jPanel2.add(cancel1);
        cancel1.setBounds(509, 390, 80, 31);

        hapus1.setBackground(new java.awt.Color(11, 10, 10));
        hapus1.setFont(new java.awt.Font("Sitka Heading", 1, 18)); // NOI18N
        hapus1.setForeground(new java.awt.Color(0, 204, 0));
        hapus1.setText("HAPUS");
        hapus1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hapus1ActionPerformed(evt);
            }
        });
        jPanel2.add(hapus1);
        hapus1.setBounds(290, 390, 90, 30);

        nama3.setFont(new java.awt.Font("Sitka Heading", 1, 18)); // NOI18N
        nama3.setForeground(new java.awt.Color(0, 204, 0));
        nama3.setText("NAMA");
        jPanel2.add(nama3);
        nama3.setBounds(80, 100, 175, 30);

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar1/g1.jpg"))); // NOI18N
        jLabel2.setText("jLabel2");
        jPanel2.add(jLabel2);
        jLabel2.setBounds(0, 0, 650, 550);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 639, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 544, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cancel1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancel1ActionPerformed
                          info_mhs oii = new info_mhs();
                         oii.setVisible(true);
                         this.setVisible(false);   
    }//GEN-LAST:event_cancel1ActionPerformed
         
    private void save_mhsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_save_mhsActionPerformed
                  
		// INPUT DATA MAHASISWA KE DATABASE
	    
		    Mahasiswa oi = new Mahasiswa();
                    oi.setNama(nama11.getText());
                    oi.setNim(nim11.getText());
                    oi.setAlamat(alamat11.getText());
                    oi.setTtl(ttl11.getText());
                    oi.setAgama((String) agama11.getSelectedItem());
          try{ 
               oi.insert_mhs1();
        JOptionPane.showMessageDialog(null,"DATA TERSIMPAN");
       }catch (Exception s){
           JOptionPane.showMessageDialog(null,"DATA GAGAL DISIMPAN");
       }
                    if (nama11.getText().equals("")) {
      JOptionPane.showMessageDialog(null, "Kolom Nama Tidak Boleh Kosong!!", "Peringatan", JOptionPane.WARNING_MESSAGE);
 } else if (nim11.getText().equals("")) {
      JOptionPane.showMessageDialog(null, "Kolom Nim Tidak Boleh Kosong!!", "Peringatan", JOptionPane.WARNING_MESSAGE);
 } else if (alamat11.getText().equals("")) {
      JOptionPane.showMessageDialog(null, "Kolom Alamat Tidak Boleh Kosong!!", "Peringatan", JOptionPane.WARNING_MESSAGE);
 } else if (ttl11.getText().equals("")) {
      JOptionPane.showMessageDialog(null, "Kolom TTL Besar Tidak Boleh Kosong!!", "Peringatan", JOptionPane.WARNING_MESSAGE);
 }else{
 }
    }//GEN-LAST:event_save_mhsActionPerformed
            
    private void agama11KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_agama11KeyPressed
       
     if (evt.getKeyCode() == KeyEvent.VK_ENTER  || evt.getKeyCode() == KeyEvent.VK_TAB) {
            save_mhs.requestFocus();
        }
    }//GEN-LAST:event_agama11KeyPressed

    private void agama11ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_agama11ItemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_agama11ItemStateChanged

    private void ttl11KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ttl11KeyPressed
        
        if (evt.getKeyCode() == KeyEvent.VK_ENTER  || evt.getKeyCode() == KeyEvent.VK_TAB) {
            agama11.requestFocus();
        }
    }//GEN-LAST:event_ttl11KeyPressed

    private void alamat11KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_alamat11KeyPressed
        
        if (evt.getKeyCode() == KeyEvent.VK_ENTER  || evt.getKeyCode() == KeyEvent.VK_TAB) {
            ttl11.requestFocus();
       }
    }//GEN-LAST:event_alamat11KeyPressed

    private void nim11KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nim11KeyPressed
       
        if (evt.getKeyCode() == KeyEvent.VK_ENTER  || evt.getKeyCode() == KeyEvent.VK_TAB) {
            alamat11.requestFocus();
        }
    }//GEN-LAST:event_nim11KeyPressed

    private void nama11KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nama11KeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER  || evt.getKeyCode() == KeyEvent.VK_TAB) {
            nim11.requestFocus();
        }
    }//GEN-LAST:event_nama11KeyPressed

    private void hapus1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hapus1ActionPerformed
               
                   nama11.setText(" ");
                   nim11.setText(" ");
                   ttl11.setText(" ");
                   alamat11.setText(" ");
    }//GEN-LAST:event_hapus1ActionPerformed
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new register_mhs().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> agama11;
    private javax.swing.JLabel agama2;
    private javax.swing.JTextField alamat11;
    private javax.swing.JLabel alamat2;
    public javax.swing.JButton cancel1;
    private javax.swing.JButton hapus1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField nama11;
    private javax.swing.JLabel nama3;
    private javax.swing.JTextField nim11;
    private javax.swing.JLabel nim2;
    public javax.swing.JButton save_mhs;
    private javax.swing.JTextField ttl11;
    private javax.swing.JLabel ttl2;
    // End of variables declaration//GEN-END:variables


   

}
