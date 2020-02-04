package base;

/***********************************************************************
 * Module:  Mahasiswa.java
 * Author:  renol
 * Purpose: Defines the Class Mahasiswa
 ***********************************************************************/

import connect.connect;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.*;
import javax.swing.JOptionPane;

/** @pdOid 11645a66-e67f-4777-b358-9ed77286b806 */
public class Mahasiswa extends Manusia {
   /** @pdOid 64470757-8e68-4347-9f7e-00318e318b83 */
   private String nim;
   
   /** @pdRoleInfo migr=no name=Dosen assc=association13 coll=java.util.Collection impl=java.util.HashSet mult=0..1 */
   public Dosen dosen;
   /** @pdRoleInfo migr=no name=Prodi assc=association8 coll=java.util.Collection impl=java.util.HashSet mult=0..1 side=A */
   public Prodi prodi;
   
   /** @pdOid 1232a4c4-0bfc-48ba-be87-6fffb9ea7072 */
   public Mahasiswa() {
      // TODO: implement
   }
   public Mahasiswa(String nama, String nik, String agama, String jenisKelamin, String email, Date tanggalLahir, String alamat, String nim, String nidn, String idProdi) {
      // TODO: implement
      super(nama, nik, agama, jenisKelamin, email, tanggalLahir, alamat);
      setnim(nim);
      dosen = new Dosen().satuDB(nidn);
      prodi = new Prodi().satuDB(idProdi);
   }
   
   /** @pdOid 9ef885b2-d4b4-45e1-9785-6bca25f12c7f */
   public String getnim() {
      return nim;
   }
   
   /** @param newNim
    * @pdOid 2d0e0b4d-7261-4dac-b1cf-988309b682fa */
   public void setnim(String newNim) {
      nim = newNim;
   }

   public Mahasiswa satuDB(String nim){
       Mahasiswa mah = new Mahasiswa();
       String query = "SELECT * FROM mahasiswa WHERE nim = (?)";
       try{
           PreparedStatement statement = connect.getConnection().prepareStatement(query);
           statement.setString(1, nim);
           ResultSet rs = statement.executeQuery();
           
           if(rs.next()){
		   
               mah.setnim(rs.getString("nim"));
               if (rs.getString("idProdi") !=null){
                   mah.prodi = new Prodi().satuDB(rs.getString("idProdi"));
               }
	       if (rs.getString("nidn") != null){
                   mah.dosen = new Dosen().satuDB(rs.getString("nidn"));
               }
               
	       mah.setnama(rs.getString("nama"));
               mah.setnik(rs.getString("nik"));
               mah.setagama(rs.getString("agama"));
               mah.setjenisKelamin(rs.getString("jenisKelamin"));
               mah.setemail(rs.getString("email"));
               mah.settanggalLahir(rs.getDate("tanggalLahir"));
               mah.setalamat(rs.getString("alamat"));
           }
           statement.close();
           rs.close();
       }
       catch(SQLException e){
           
       }
       return mah;
   }
   
   public ArrayList<Mahasiswa> semuaDB(){
       ArrayList<Mahasiswa> list = new ArrayList<>();
       String query = "SELECT * FROM mahasiswa";
       try{
           PreparedStatement statement = connect.getConnection().prepareStatement(query);
           ResultSet rs = statement.executeQuery();
           while(rs.next()){
               Mahasiswa mah = new Mahasiswa();
               mah.setnim(rs.getString("nim"));
               mah.prodi = new Prodi().satuDB(rs.getString("idProdi"));
               mah.dosen = new Dosen().satuDB(rs.getString("nidn"));
               mah.setnama(rs.getString("nama"));
               mah.setnik(rs.getString("nik"));
               mah.setagama(rs.getString("agama"));
               mah.setjenisKelamin(rs.getString("jenisKelamin"));
               mah.setemail(rs.getString("email"));
               mah.settanggalLahir(rs.getDate("tanggalLahir"));
               mah.setalamat(rs.getString("alamat"));
               list.add(mah);
           }
           statement.close();
           rs.close();
       }
       catch(SQLException e){
           
       }
       return list;
   }
   
   public void masukDB(){
       try{
           String query = "INSERT INTO mahasiswa VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
           PreparedStatement statement = connect.getConnection().prepareStatement(query);
           statement.setString(1, getnim());
           if (prodi != null )
               statement.setString(2, prodi.getidProdi());
           else
               statement.setString(2, null);
           if (dosen != null)
               statement.setString(3, dosen.getnidn());
           else
               statement.setString(3, null);      
           statement.setString(4, getnama());
           statement.setString(5, getnik());
           statement.setString(6, getagama());
           statement.setString(7, getjenisKelamin());
           statement.setString(8, getemail());
           java.sql.Date sqlDate = new java.sql.Date(gettanggalLahir().getTime());
           statement.setDate(9, sqlDate);
           statement.setString(10, getalamat());
           
           statement.execute();
           statement.close();
       }
       catch(SQLException e){
           
       }
   }
   public void updateDB(){
       try{
           String query = "UPDATE Mahasiswa SET idProdi = (?), nidn = (?), nama = (?),"
                   + " nik = (?), agama = (?), jenisKelamin = (?), email = (?), tanggalLahir = (?), alamat = (?) WHERE nim"
                   + " = (?)";
           PreparedStatement statement = connect.getConnection().prepareStatement(query);
           
           
           statement.setString(1, prodi.getidProdi());
           statement.setString(2, dosen.getnidn());
           statement.setString(3, getnama());
           statement.setString(4, getnik());
           statement.setString(5, getagama());          
           statement.setString(6, getjenisKelamin());
           statement.setString(7, getemail());
           java.sql.Date sqlDate = new java.sql.Date(gettanggalLahir().getTime());
           statement.setDate(8, sqlDate);
           statement.setString(9, getalamat());
           statement.setString(10, getnim());
           
           statement.execute();
           statement.close();
       }
       catch(SQLException e){
           JOptionPane.showMessageDialog(null, e);
       }
   }
}