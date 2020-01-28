package base;

/***********************************************************************
 * Module:  User.java
 * Author:  renol
 * Purpose: Defines the Class User
 ***********************************************************************/

import connect.connect;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.*;
import javax.swing.JOptionPane;

/** @pdOid 2945f811-1899-4eee-be51-a9c82fd0e3ca */
public class User {
   /** @pdOid 19a65872-cbc1-40dc-83c0-32003d017252 */
   private String username;
   /** @pdOid c28ec4b2-380a-4985-9e1a-235396e1cfd2 */
   private String password;
   /** @pdOid ef66a795-7e48-49c3-9c11-ab15facdb58e */
   private String tipeUser;
   
   /** @pdOid 72b79995-7c46-4bfc-bd3a-45370f1c1608 */
   public User() {
      // TODO: implement
   }
   
   /** @pdOid 46235bbd-03cb-4147-8174-c36e35287b59 */
   public String getusername() {
      return username;
   }
   
   /** @param newUsername
    * @pdOid af0ecc66-3311-450b-974b-c5ba5e91ace8 */
   public void setusername(String newUsername) {
      username = newUsername;
   }
   
   /** @pdOid 7c89b27b-3c3e-4ed8-8c4d-dd23af10e467 */
   public String getpassword() {
      return password;
   }
   
   /** @param newPassword
    * @pdOid 1170b31f-f1ac-4afe-8d4b-b6cd4c379cb4 */
   public void setpassword(String newPassword) {
      password = newPassword;
   }
   
   /** @pdOid f77c170e-147e-4589-af3f-f755d7c15ea2 */
   public String gettipeUser() {
      return tipeUser;
   }
   
   /** @param newTipeUser
    * @pdOid 94ee2240-03eb-44b3-b2d3-67e936fd4891 */
   public void settipeUser(String newTipeUser) {
      tipeUser = newTipeUser;
   }

   public User satuDB(String key){
       User user = new User();
       try{
           String query = "SELECT * FROM User WHERE username = (?)";
           PreparedStatement statement = connect.getConnection().prepareStatement(query);
           statement.setString(1, key);
           ResultSet rs = statement.executeQuery();
           if(rs.next()){
               user.setusername(rs.getString("username"));
               user.setpassword(rs.getString("password"));
               user.settipeUser(rs.getString("tipeUser"));
           }
           statement.close();
           rs.close();
       }
       catch(SQLException e){
           
       }
       return user;
   }
   
   public void masukDB(){
       try{
           String query = "INSERT INTO User VALUES (?, ?, ?)";
           PreparedStatement statement = connect.getConnection().prepareStatement(query);
           statement.setString(1, getusername());
           statement.setString(2, getpassword());
           statement.setString(3, gettipeUser());
           
           statement.execute();
           statement.close();
           }
       catch(SQLException e){
           
       }
   }

public void updateDB(){
       try{
           String query = "UPDATE User SET password = (?), tipeUser = (?) WHERE username = (?)";
           PreparedStatement statement = connect.getConnection().prepareStatement(query);
           statement.setString(1, getpassword());
           statement.setString(2, gettipeUser());
           statement.setString(3, getusername());
           
           statement.execute();
           statement.close();
           }
       catch(SQLException e){
           
       }
   }
public boolean cekLogin(String username, String pass){
       User usr = new User().satuDB(username);
       if((usr.getusername() == null)||(usr.getusername().equals("")))
       {
           JOptionPane.showMessageDialog(null, "Username tidak terdaftar!");
           return false;
       }
       else
       {
           if(usr.getpassword().equals(pass))
           {
               setusername(usr.getusername());
               setpassword(usr.getpassword());
               settipeUser(usr.gettipeUser());
                return true;
           }
           else
           {
               JOptionPane.showMessageDialog(null, "Password Salah!");
               return false;
           }
       }
   }
}
