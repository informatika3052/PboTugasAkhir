package base;

/***********************************************************************
 * Module:  KerjaPraktek.java
 * Author:  renol
 * Purpose: Defines the Class KerjaPraktek
 ***********************************************************************/

import connect.connect;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.*;

/** @pdOid b08ea4be-844d-4022-ba87-c241cbdf3dd6 */
public class KerjaPraktek {
   /** @pdOid 4bdf13db-ea99-4f43-ad47-9c29119dd610 */
   private int idKp;
   /** @pdOid 6fe5016b-41de-43da-8c32-8fdb26c5d13a */
   private String namaKegiatan;
   /** @pdOid 277b04cf-2391-4181-9277-e2049bb39592 */
   private String instansi;
   
   /** @pdRoleInfo migr=no name=Mahasiswa assc=association1 mult=0..1 */
   public Mahasiswa mahasiswa;
   /** @pdRoleInfo migr=no name=JadwalKerjaPraktek assc=association10 coll=java.util.Collection impl=java.util.HashSet mult=0..1 */
   public JadwalKerjaPraktek jadwalKerjaPraktek;
   
   /** @pdOid c69ae21d-1eff-4778-8fe0-24c0a515f9d3 */
   public KerjaPraktek() {
      // TODO: implement
   }
   
   public KerjaPraktek(String nim, int idJadwal, String namaKegiatan, String instansi) {
      // TODO: implement
      mahasiswa = new Mahasiswa().satuDB(nim);
      jadwalKerjaPraktek = new JadwalKerjaPraktek().satuDB(idJadwal);
      setnamaKegiatan(namaKegiatan);
      setinstansi(instansi);
   }
   
   /** @pdOid 6a1185ce-607a-4f70-b833-3cfe0186acad */
   public int getidKp() {
      return idKp;
   }
   
   /** @param newIdKp
    * @pdOid aac54d85-75fd-4d7d-bbed-09cd2ea5a9ed */
   public void setidKp(int newIdKp) {
      idKp = newIdKp;
   }
   
   /** @pdOid ef1a74ab-d9dc-4dc2-8b1a-9a531349b0ca */
   public String getnamaKegiatan() {
      return namaKegiatan;
   }
   
   /** @param newNamaKegiatan
    * @pdOid 93a4fe52-29b7-46a1-a083-fc38244db6c3 */
   public void setnamaKegiatan(String newNamaKegiatan) {
      namaKegiatan = newNamaKegiatan;
   }
   
   /** @pdOid 24d0769e-661b-4b9f-8ffb-af4a049001b9 */
   public String getinstansi() {
      return instansi;
   }
   
   /** @param newInstansi
    * @pdOid 0c43bbc3-1610-452e-bdad-04dbb67ad60a */
   public void setinstansi(String newInstansi) {
      instansi = newInstansi;
   }
   
   public KerjaPraktek satuDB(int idKp){
       KerjaPraktek kp = new KerjaPraktek();
       String query = "SELECT * FROM kerjapraktek WHERE idKp = (?)";
       try{
           PreparedStatement statement = connect.getConnection().prepareStatement(query);
           statement.setInt(1, idKp);
           ResultSet rs = statement.executeQuery();
           
           if(rs.next()){
               kp.setidKp(rs.getInt("idKp"));
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
           String query = "INSERT INTO jadwalkerjapraktek VALUES (?, ?, ?, ?)";
           PreparedStatement statement = connect.getConnection().prepareStatement(query);
           statement.setInt(1, getidJadwal());
           statement.setString(2, prodi.getidProdi());
           java.sql.Date sqlDate = new java.sql.Date(getmulai().getTime());
           statement.setDate(3, sqlDate);
           sqlDate = new java.sql.Date(getakhir().getTime());
           statement.setDate(4, sqlDate);
           statement.execute();
           statement.close();
       }
       catch(SQLException e){
           
       }
   }
}