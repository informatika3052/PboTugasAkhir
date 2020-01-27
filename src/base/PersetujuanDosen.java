package base;

/***********************************************************************
 * Module:  PersetujuanDosen.java
 * Author:  renol
 * Purpose: Defines the Class PersetujuanDosen
 ***********************************************************************/

import java.util.*;

/** @pdOid 1054d17c-c5e2-4c58-8a5a-c2f247095198 */
public class PersetujuanDosen {
   /** @pdOid 60fa3339-9d88-48ca-b2d6-c9cede2666be */
   private int idAccDosen;
   /** @pdOid 0cc8c78c-6307-4fbf-8a42-356f1cf27be8 */
   private boolean accDosen;
   
   /** @pdRoleInfo migr=no name=KerjaPraktek assc=association2 coll=java.util.Collection impl=java.util.HashSet mult=0..1 side=A */
   public KerjaPraktek kerjaPraktek;
   
   /** @pdOid 37d0dded-e0ea-4233-9112-a8b25ee2e02c */
   public PersetujuanDosen() {
      // TODO: implement
   }
   
   /** @pdOid e9315f44-6aa5-4ba5-86da-653d40696538 */
   public int getidAccDosen() {
      return idAccDosen;
   }
   
   /** @param newIdAccDosen
    * @pdOid 2e0dae4d-5360-4ca1-8fbc-06487e462680 */
   public void setidAccDosen(int newIdAccDosen) {
      idAccDosen = newIdAccDosen;
   }
   
   /** @pdOid 7aacf53d-a544-46ba-b219-78a25593d9ae */
   public boolean getAccDosen() {
      return accDosen;
   }
   
   /** @param newAccDosen
    * @pdOid 1a609a3b-a26b-49bb-ada6-61f1e333eed0 */
   public void setAccDosen(boolean newAccDosen) {
      accDosen = newAccDosen;
   }

}