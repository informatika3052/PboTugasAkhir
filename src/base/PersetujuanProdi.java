package base;

/***********************************************************************
 * Module:  PersetujuanProdi.java
 * Author:  renol
 * Purpose: Defines the Class PersetujuanProdi
 ***********************************************************************/

import connect.connect;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.*;

/** @pdOid e33117e4-f866-4fd5-af14-7d7c6d48e744 */
public class PersetujuanProdi {
   /** @pdOid 401585be-9849-429b-95d4-5acf016495b4 */
   private int idAccProdi;
   /** @pdOid 9a7994a8-9cf7-4445-bb9e-b82de67fa9c7 */
   private boolean accProdi;
   
   /** @pdRoleInfo migr=no name=Prodi assc=association6 coll=java.util.Collection impl=java.util.HashSet mult=0..1 */
   public Prodi prodi;
   /** @pdRoleInfo migr=no name=PersetujuanDosen assc=association9 coll=java.util.Collection impl=java.util.HashSet mult=0..1 side=A */
   public PersetujuanDosen persetujuanDosen;
   
   /** @pdOid 32eb752d-202d-4e01-9151-83527405759f */
   public PersetujuanProdi() {
      // TODO: implement
   }
   
   public PersetujuanProdi(String idProdi, int idAccDosen, boolean accProdi) {
      // TODO: implement
      prodi = new Prodi().satuDB(idProdi);
      persetujuanDosen = new PersetujuanDosen().satuDB(idAccDosen);
      setAccProdi(accProdi);
   }

    public boolean getAccProdi() {
        return accProdi;
    }

    public void setAccProdi(boolean accProdi) {
        this.accProdi = accProdi;
    }
   
   
   /** @pdOid 75887080-3ad1-44a7-8a0b-39ed4d44a436 */
   public int getidAccProdi() {
      return idAccProdi;
   }
   
   /** @param newIdAccProdi
    * @pdOid db5c636d-554b-4e1e-805d-f704d164bbf3 */
   public void setidAccProdi(int newIdAccProdi) {
      idAccProdi = newIdAccProdi;
   }

   public PersetujuanProdi satuDB(int idAccProdi){
       PersetujuanProdi pp = new PersetujuanProdi();
       String query = "SELECT * FROM persetujuanprodi WHERE idAccProdi = (?)";
       try{
           PreparedStatement statement = connect.getConnection().prepareStatement(query);
           statement.setInt(1, idAccProdi);
           ResultSet rs = statement.executeQuery();
           
           if(rs.next()){
               pp.setidAccProdi(rs.getInt("idAccProdi"));
               pp.prodi = new Prodi().satuDB(rs.getString("idProdi"));
               pp.persetujuanDosen = new PersetujuanDosen().satuDB(rs.getInt("idAccDosen"));
               pp.setAccProdi(rs.getBoolean("accProdi"));
           }
           statement.close();
           rs.close();
       }
       catch(SQLException e){
           
       }
       return pp;
   }
   
   public ArrayList<PersetujuanProdi> semuaDB(){
       ArrayList<PersetujuanProdi> list = new ArrayList<>();
       String query = "SELECT * FROM persetujuanprodi";
       try{
           PreparedStatement statement = connect.getConnection().prepareStatement(query);
           ResultSet rs = statement.executeQuery();
           while(rs.next()){
               PersetujuanProdi pp = new PersetujuanProdi();
               pp.setidAccProdi(rs.getInt("idAccProdi"));
               pp.prodi = new Prodi().satuDB(rs.getString("idProdi"));
               pp.persetujuanDosen = new PersetujuanDosen().satuDB(rs.getInt("idAccDosen"));
               pp.setAccProdi(rs.getBoolean("accProdi"));
               list.add(pp);
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
           String query = "INSERT INTO persetujuanprodi VALUES (null, ?, ?, ?)";
           PreparedStatement statement = connect.getConnection().prepareStatement(query);
           statement.setString(1, prodi.getidProdi());
           statement.setInt(2, persetujuanDosen.getidAccDosen());
	   statement.setBoolean(2, getAccProdi());
	   
           statement.execute();
           statement.close();
       }
       catch(SQLException e){
           
       }
   }
}