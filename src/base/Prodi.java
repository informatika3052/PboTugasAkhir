package base;

/***********************************************************************
 * Module:  Prodi.java
 * Author:  renol
 * Purpose: Defines the Class Prodi
 ***********************************************************************/

import connect.connect;
import java.sql.*;
import java.util.*;

/** @pdOid 0828658f-b4e0-49f0-9ce1-462ee86fbd46 */
public class Prodi {
   /** @pdOid 9c6b44db-7e46-4e86-8541-e5d3fa1ea972 */
   private String idProdi;
   /** @pdOid f6e54356-167e-48fc-8d70-6313c15c6c0a */
   private String namaProdi;
   
   /** @pdOid aa63581d-19ec-47b1-8d71-b2a5d8977b7a */
   public Prodi() {
      // TODO: implement
   }
   
   public Prodi(String idProdi, String namaProdi) {
      // TODO: implement
       setidProdi(idProdi);
       setnamaProdi(namaProdi);
   }
   
   /** @pdOid 82cdfb94-3a8c-45f1-a6e4-12be5e16b0f6 */
   public String getidProdi() {
      return idProdi;
   }
   
   /** @param newIdProdi
    * @pdOid 797fbe5f-68f5-4722-a3e3-bf86a95bfbeb */
   public void setidProdi(String newIdProdi) {
      idProdi = newIdProdi;
   }
   
   /** @pdOid 30ae907f-fb72-4bd8-a7d9-cec3f81f6900 */
   public String getnamaProdi() {
      return namaProdi;
   }
   
   /** @param newNamaProdi
    * @pdOid e297d28e-5f90-4a39-8a8f-1038a8ca6b0d */
   public void setnamaProdi(String newNamaProdi) {
      namaProdi = newNamaProdi;
   }

   public Prodi satuDB(String idProdi){
       Prodi pro = new Prodi();
       String query = "SELECT * FROM prodi WHERE idProdi = (?)";
       try{
           PreparedStatement statement = connect.getConnection().prepareStatement(query);
           statement.setString(1, idProdi);
           ResultSet rs = statement.executeQuery();
           
           if(rs.next()){
               pro.setidProdi(rs.getString("idProdi"));
               pro.setnamaProdi(rs.getString("namaProdi"));
           }
           statement.close();
           rs.close();
       }
       catch(SQLException e){
           
       }
       return pro;
   }
   
   public ArrayList<Prodi> semuaDB(){
       ArrayList<Prodi> list = new ArrayList<>();
       String query = "SELECT * FROM prodi";
       try{
           PreparedStatement statement = connect.getConnection().prepareStatement(query);
           ResultSet rs = statement.executeQuery();
           while(rs.next()){
               Prodi pro = new Prodi();
               pro.setidProdi(rs.getString("idProdi"));
               pro.setnamaProdi(rs.getString("namaProdi"));
               list.add(pro);
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
           String query = "INSERT INTO prodi VALUES (?, ?)";
           PreparedStatement statement = connect.getConnection().prepareStatement(query);
           statement.setString(1, getidProdi());
           statement.setString(2, getnamaProdi());
           
           statement.execute();
           statement.close();
       }
       catch(SQLException e){
           
       }
   }
}