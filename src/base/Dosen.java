package base;

/***********************************************************************
 * Module:  Dosen.java
 * Author:  renol
 * Purpose: Defines the Class Dosen
 ***********************************************************************/

import connect.connect;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.*;

/** @pdOid 8186c57c-5bc3-4f83-aa60-393ff3e6a440 */
public class Dosen extends Manusia {
   /** @pdOid 2e584c1c-3f6b-4a31-b993-8ddea237ca10 */
   private String nidn;
   
   /** @pdOid 0150758a-f997-403e-94d7-d8d2b55333fe */
   public Dosen() {
      // TODO: implement
   }
   
   public Dosen(String nama, String nik, String agama, String jenisKelamin, String email, Date tanggalLahir, String alamat, String nidn) {
      // TODO: implement
      super(nama, nik, agama, jenisKelamin, email, tanggalLahir, alamat);
       setnidn(nidn);
   }
   
   /** @pdOid 3020d748-b8dc-480e-a1cb-5b993e29352a */
   public String getnidn() {
      return nidn;
   }
   
   /** @param newNidn
    * @pdOid da46d4f8-d4c8-4f7a-8922-a28dc34982a2 */
   public void setnidn(String newNidn) {
      nidn = newNidn;
   }

   public Dosen satuDB(String nidn){
       Dosen dos = new Dosen();
       String query = "SELECT * FROM dosen WHERE nidn = (?)";
       try{
           PreparedStatement statement = connect.getConnection().prepareStatement(query);
           statement.setString(1, nidn);
           ResultSet rs = statement.executeQuery();
           
           if(rs.next()){
               dos.setnidn(rs.getString("nidn"));
               dos.setnama(rs.getString("nama"));
               dos.setnik(rs.getString("nik"));
               dos.setagama(rs.getString("agama:"));
               dos.setjenisKelamin(rs.getString("jenisKelamin"));
               dos.setemail(rs.getString("email"));
               dos.settanggalLahir(rs.getDate("tanggalLahir"));
               dos.setalamat(rs.getString("alamat"));
           }
           statement.close();
           rs.close();
       }
       catch(SQLException e){
           
       }
       return dos;
   }
   
   public ArrayList<Dosen> semuaDB(){
       ArrayList<Dosen> list = new ArrayList<>();
       String query = "SELECT * FROM dosen";
       try{
           PreparedStatement statement = connect.getConnection().prepareStatement(query);
           ResultSet rs = statement.executeQuery();
           while(rs.next()){
               Dosen dos = new Dosen();
               dos.setnidn(rs.getString("nidn"));
               dos.setnama(rs.getString("nama"));
               dos.setnik(rs.getString("nik"));
               dos.setagama(rs.getString("agama:"));
               dos.setjenisKelamin(rs.getString("jenisKelamin"));
               dos.setemail(rs.getString("email"));
               dos.settanggalLahir(rs.getDate("tanggalLahir"));
               dos.setalamat(rs.getString("alamat"));
               list.add(dos);
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
           String query = "INSERT INTO dosen VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
           PreparedStatement statement = connect.getConnection().prepareStatement(query);
           statement.setString(1, getnidn());
           statement.setString(2, getnama());
           statement.setString(3, getnik());
           statement.setString(4, getagama());
           statement.setString(5, getjenisKelamin());
           statement.setString(6, getemail());
           java.sql.Date sqlDate = new java.sql.Date(gettanggalLahir().getTime());
           statement.setDate(7, sqlDate);
           statement.setString(8, getalamat());
           
           statement.execute();
           statement.close();
       }
       catch(SQLException e){
           
       }
   }
   public void updateDB(){
       try{
           String query = "UPDATE dosen SET nidn = (?), nama = (?), nik = (?), agama = (?),"
                   + " jenisKelamin = (?), email = (?), tanggalLahir, alamat = (?) WHERE nim"
                   + " = (?)";
           PreparedStatement statement = connect.getConnection().prepareStatement(query);
           
           statement.setString(1, getnidn());
           statement.setString(2, getnama());
           statement.setString(3, getnik());
           statement.setString(4, getagama());
           statement.setString(5, ""+getjenisKelamin());
           statement.setString(6, getemail());
           java.sql.Date sqlDate = new java.sql.Date(gettanggalLahir().getTime());
           statement.setDate(7, sqlDate);
           statement.setString(8, getalamat());
           
           statement.execute();
           statement.close();
       }
       catch(SQLException e){
           
       }
   }

}