/***********************************************************************
 * Module:  HistoryJabatan.java
 * Author:  renol
 * Purpose: Defines the Class HistoryJabatan
 ***********************************************************************/

import java.util.*;

/** @pdOid 5a43a837-31cd-42bf-8603-4b0967a44ed7 */
public class HistoryJabatan {
   /** @pdOid dba0486f-b92a-44b8-832e-9eef3bc880e2 */
   private int idHistory;
   /** @pdOid 22ed81c0-6e73-4879-a137-356f7e77fa3a */
   private Date startDate;
   /** @pdOid 2b031fea-eca7-47de-8149-b30783499dae */
   private String tahunAjaran;
   /** @pdOid 10fb5eec-757d-42dc-86e2-7e7caf4227ea */
   private boolean statusAktif;
   
   /** @pdRoleInfo migr=no name=Dosen assc=association5 coll=java.util.Collection impl=java.util.HashSet mult=0..1 */
   public Dosen dosen;
   /** @pdRoleInfo migr=no name=Jabatan assc=association4 coll=java.util.Collection impl=java.util.HashSet mult=0..1 side=A */
   public Jabatan jabatan;
   
   /** @pdOid 897b07d0-49db-4dc2-80d6-841060072fdf */
   public HistoryJabatan() {
      // TODO: implement
   }
   
   /** @pdOid 01b06814-5a50-4137-bb1a-2f2365d45884 */
   public int getidHistory() {
      return idHistory;
   }
   
   /** @param newIdHistory
    * @pdOid 24d78721-7d82-4dbe-836e-209bde3f43bb */
   public void setidHistory(int newIdHistory) {
      idHistory = newIdHistory;
   }
   
   /** @pdOid 7c324275-01ac-4337-96a6-79f4a423f693 */
   public Date getstartDate() {
      return startDate;
   }
   
   /** @param newStartDate
    * @pdOid c8b869ea-cdcb-4feb-96cd-b9ae5a021b8a */
   public void setstartDate(Date newStartDate) {
      startDate = newStartDate;
   }
   
   /** @pdOid 205b28ce-fc0b-47e5-8133-85dd507c1b22 */
   public String gettahunAjaran() {
      return tahunAjaran;
   }
   
   /** @param newTahunAjaran
    * @pdOid eb1e679a-f551-414d-82b0-429d06d724ec */
   public void settahunAjaran(String newTahunAjaran) {
      tahunAjaran = newTahunAjaran;
   }
   
   /** @pdOid 9f9c2f8b-3695-48df-b517-53129a851a49 */
   public boolean isstatusAktif() {
      return statusAktif;
   }
   
   /** @param newStatusAktif
    * @pdOid 79b4a705-84f7-48c7-9d87-2e92912dc829 */
   public void setstatusAktif(boolean newStatusAktif) {
      statusAktif = newStatusAktif;
   }

}