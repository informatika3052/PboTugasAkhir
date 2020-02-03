package base;

/***********************************************************************
 * Module:  JadwalKerjaPraktek.java
 * Author:  renol
 * Purpose: Defines the Class JadwalKerjaPraktek
 ***********************************************************************/

import connect.connect;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.*;

/** @pdOid 69ed8077-8547-41c2-bfc5-6ca35ace8d3e */
public class JadwalKerjaPraktek {
   /** @pdOid 09ff3d38-79ee-4d0d-b99f-ef9473d993f0 */
   private int idJadwal;
   /** @pdOid 7c9f203d-04ed-4abc-879e-146276a5e591 */
   private Date mulai;
   /** @pdOid fe857b3a-5723-4d13-98d7-9bfee8d13094 */
   private Date akhir;
   
   /** @pdRoleInfo migr=no name=Prodi assc=association11 coll=java.util.Collection impl=java.util.HashSet mult=0..1 side=A */
   public Prodi prodi;
   
   /** @pdOid 95a071b7-7934-43db-8525-cecb1adca784 */
   public JadwalKerjaPraktek() {
      // TODO: implement
   }
   
   public JadwalKerjaPraktek(String idProdi,Date mulai, Date akhir) {
      // TODO: implement
      prodi = new Prodi().satuDB(idProdi);
      setmulai(mulai);
      setakhir(akhir);
   }
   
   /** @pdOid 29fb26ab-d8a3-4d91-aa61-973f68dfdb9f */
   public int getidJadwal() {
      return idJadwal;
   }
   
   /** @param newIdJadwal
    * @pdOid 7bccc038-341a-48da-8c5d-8208d3696f06 */
   public void setidJadwal(int newIdJadwal) {
      idJadwal = newIdJadwal;
   }
   
   /** @pdOid e45dc340-6ae1-448e-bc0f-e2663eefe529 */
   public Date getmulai() {
      return mulai;
   }
   
   /** @param newMulai
    * @pdOid 317b892a-8cd6-4e20-8602-f1acab28b8c2 */
   public void setmulai(Date newMulai) {
      mulai = newMulai;
   }
   
   /** @pdOid b11d01a9-949c-4167-a884-dabf46bbc2c7 */
   public Date getakhir() {
      return akhir;
   }
   
   /** @param newAkhir
    * @pdOid db52d634-79c7-4ee7-8e81-458e46a7208f */
   public void setakhir(Date newAkhir) {
      akhir = newAkhir;
   }

   public JadwalKerjaPraktek satuDB(int idJadwal){
       JadwalKerjaPraktek jkp = new JadwalKerjaPraktek();
       String query = "SELECT * FROM jadwalkerjapraktek WHERE idJadwal = (?)";
       try{
           PreparedStatement statement = connect.getConnection().prepareStatement(query);
           statement.setInt(1, idJadwal);
           ResultSet rs = statement.executeQuery();
           
           if(rs.next()){
               jkp.setidJadwal(rs.getInt("idJadwal"));
               jkp.prodi = new Prodi().satuDB(rs.getString("idProdi"));
               jkp.setmulai(rs.getDate("mulai"));
               jkp.setakhir(rs.getDate("akhir"));
           }
           statement.close();
           rs.close();
       }
       catch(SQLException e){
           
       }
       return jkp;
   }
   
   public ArrayList<JadwalKerjaPraktek> semuaDB(){
       ArrayList<JadwalKerjaPraktek> list = new ArrayList<>();
       String query = "SELECT * FROM jadwalkerjapraktek";
       try{
           PreparedStatement statement = connect.getConnection().prepareStatement(query);
           ResultSet rs = statement.executeQuery();
           while(rs.next()){
               JadwalKerjaPraktek jkp = new JadwalKerjaPraktek();
               jkp.setidJadwal(rs.getInt("idJadwal"));
               jkp.prodi = new Prodi().satuDB(rs.getString("idProdi"));
               jkp.setmulai(rs.getDate("mulai"));
               jkp.setakhir(rs.getDate("akhir"));
               list.add(jkp);
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
           String query = "INSERT INTO jadwalkerjapraktek VALUES (null, ?, ?, ?)";
           PreparedStatement statement = connect.getConnection().prepareStatement(query);
           //statement.setInt(1, getidJadwal());
           if (prodi != null )
               statement.setString(1, prodi.getidProdi());
           else
               statement.setString(1, null);
           java.sql.Date sqlDate = new java.sql.Date(getmulai().getTime());
           statement.setDate(2, sqlDate);
           sqlDate = new java.sql.Date(getakhir().getTime());
           statement.setDate(3, sqlDate);
           statement.execute();
           statement.close();
       }
       catch(SQLException e){
           
       }
   }
   
   public void updateDB(){
       try{
           String query = "UPDATE jadwalkerjapraktek SET idProdi = (?), mulai = (?), akhir = (?) WHERE idJadwal = (?)";
           PreparedStatement statement = connect.getConnection().prepareStatement(query);
           statement.setString(1, prodi.getidProdi());
           java.sql.Date sqlDate = new java.sql.Date(getmulai().getTime());
           statement.setDate(2, sqlDate);
           sqlDate = new java.sql.Date(getakhir().getTime());
           statement.setDate(3, sqlDate);
           statement.setInt(4, getidJadwal());
           statement.execute();
           statement.close();
       }
       catch(SQLException e){
           
       }
   }
}