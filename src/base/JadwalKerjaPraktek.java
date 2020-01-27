/***********************************************************************
 * Module:  JadwalKerjaPraktek.java
 * Author:  renol
 * Purpose: Defines the Class JadwalKerjaPraktek
 ***********************************************************************/

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

}