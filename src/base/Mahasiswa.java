package base;

/***********************************************************************
 * Module:  Mahasiswa.java
 * Author:  renol
 * Purpose: Defines the Class Mahasiswa
 ***********************************************************************/

import java.util.*;

/** @pdOid 11645a66-e67f-4777-b358-9ed77286b806 */
public class Mahasiswa extends Manusia {
   /** @pdOid 64470757-8e68-4347-9f7e-00318e318b83 */
   private String nim;
   
   /** @pdRoleInfo migr=no name=Dosen assc=association13 coll=java.util.Collection impl=java.util.HashSet mult=0..1 */
   public Dosen dosen;
   /** @pdRoleInfo migr=no name=Prodi assc=association8 coll=java.util.Collection impl=java.util.HashSet mult=0..1 side=A */
   public Prodi prodi;
   
   /** @pdOid 1232a4c4-0bfc-48ba-be87-6fffb9ea7072 */
   public Mahasiswa() {
      // TODO: implement
   }
   public Mahasiswa(String nama, String nik, String agama, String jenisKelamin, String email, Date tanggalLahir, String alamat, String nim, String npp, String id) {
      // TODO: implement
      super(nama, nik, agama, jenisKelamin, email, tanggalLahir, alamat);
   }
   
   /** @pdOid 9ef885b2-d4b4-45e1-9785-6bca25f12c7f */
   public String getnim() {
      return nim;
   }
   
   /** @param newNim
    * @pdOid 2d0e0b4d-7261-4dac-b1cf-988309b682fa */
   public void setnim(String newNim) {
      nim = newNim;
   }

}