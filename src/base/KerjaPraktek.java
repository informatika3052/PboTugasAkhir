package base;

/***********************************************************************
 * Module:  KerjaPraktek.java
 * Author:  renol
 * Purpose: Defines the Class KerjaPraktek
 ***********************************************************************/

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
}