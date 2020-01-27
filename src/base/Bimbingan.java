package base;

/***********************************************************************
 * Module:  Bimbingan.java
 * Author:  renol
 * Purpose: Defines the Class Bimbingan
 ***********************************************************************/

import connect.*;
import java.sql.*;
import java.util.*;

/** @pdOid 65aa89e5-82cf-4d5a-9f6c-4e2ba7ff8f8e */
public class Bimbingan {
   /** @pdOid 4b5d30f6-8386-485f-9c78-9bcba370065c */
   private int idBimbing;
   /** @pdOid 4b0e1b39-300d-4a6f-8536-45237c3d036c */
   private String accPembimbing;
   
   /** @pdRoleInfo migr=no name=PersetujuanProdi assc=association12 coll=java.util.Collection impl=java.util.HashSet mult=0..1 side=A */
   public PersetujuanProdi persetujuanProdi;
   /** @pdRoleInfo migr=no name=Dosen assc=association14 coll=java.util.Collection impl=java.util.HashSet mult=0..1 side=A */
   public Dosen dosen;
   
   /** @pdOid 60ef62e0-138a-4729-9329-cab35970ed68 */
   public Bimbingan() {
      // TODO: implement
   }
   
   public Bimbingan(String accPembimbing, int idAccProdi, String npp) {
      // TODO: implement
       setaccPembimbing(accPembimbing);
       persetujuanProdi = new PersetujuanProdi().satuDB(idAccProdi);
       dosen = new Dosen().satuDB(npp);
   }
   
   /** @pdOid 7391d24d-8c52-4247-9ef6-f647d0ec48bd */
   public int getidBimbing() {
      return idBimbing;
   }
   
   /** @param newIdBimbing
    * @pdOid 107c41f1-29ec-4b26-a153-8ce053c7318b */
   public void setidBimbing(int newIdBimbing) {
      idBimbing = newIdBimbing;
   }
   
   /** @pdOid 5c2da7db-2ddf-493a-837d-87d3682af4c7 */
   public String getaccPembimbing() {
      return accPembimbing;
   }
   
   /** @param newAccPembimbing
    * @pdOid 93aa4b7e-9f0b-433c-be05-4eac9274372c */
   public void setaccPembimbing(String newAccPembimbing) {
      accPembimbing = newAccPembimbing;
   }

   public Bimbingan satuDB(int idBimbing){
       Bimbingan bim = new Bimbingan();
       String query = "SELECT * FROM bimbingan WHERE idBimbing = (?)";
       try{
           PreparedStatement statement = connect.getConnection().prepareStatement(query);
           statement.setInt(1, getidBimbing());
           ResultSet rs = statement.executeQuery();
           
           if(rs.next()){
               bim.setidBimbing(rs.getInt("idBimbing"));
               bim.persetujuanProdi = new PersetujuanProdi().satuDB(rs.getInt("idAccProdi"));
               bim.dosen = new Dosen().satuDB(rs.getString("nidn"));
               bim.setaccPembimbing(rs.getString("accPembimbing"));
               
           }
           statement.close();
           rs.close();
       }
       catch(SQLException e){
           
       }
       return bim;
   }
}