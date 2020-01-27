/***********************************************************************
 * Module:  Manusia.java
 * Author:  renol
 * Purpose: Defines the Class Manusia
 ***********************************************************************/

import java.util.*;

/** @pdOid a034eb84-4243-4770-b354-ad38a6c54396 */
public class Manusia {
   /** @pdOid 9b87bbce-5bb5-4259-aeed-24b15bce6977 */
   private String nama;
   /** @pdOid 5fefd759-f015-4954-a73c-8f89a8eb9e5b */
   private String nik;
   /** @pdOid a46068ed-a307-46f6-9bb3-7aac6785637d */
   private String agama;
   /** @pdOid afa222f2-ebff-4ccb-a2e5-fd6284a855c9 */
   private String jenisKelamin;
   /** @pdOid 52b4e0d6-917c-4023-b778-ce380159a752 */
   private String email;
   /** @pdOid e146d07e-0199-4712-a8c3-220a48e94770 */
   private Date tanggalLahir;
   /** @pdOid e6a632bf-66d3-48f4-a0e1-65514d4b4075 */
   private String alamat;
   
   /** @pdOid cd45335a-b1b1-45a0-89bb-7d6e38f2d04c */
   public Manusia() {
      // TODO: implement
   }
   
   /** @pdOid 03dd3bbd-cff1-4f97-b620-1d0fb9c93a9b */
   public String getnama() {
      return nama;
   }
   
   /** @param newNama
    * @pdOid f35f66b2-0c22-4fec-83b8-615fc79b23cd */
   public void setnama(String newNama) {
      nama = newNama;
   }
   
   /** @pdOid e81da5c6-5023-42fa-999e-c64be153f961 */
   public String getnik() {
      return nik;
   }
   
   /** @param newNik
    * @pdOid 44856dd8-3943-4f4b-a687-683b4ce3e785 */
   public void setnik(String newNik) {
      nik = newNik;
   }
   
   /** @pdOid 06510c3a-5dfb-4d03-b490-ea683b7f325e */
   public String getagama() {
      return agama;
   }
   
   /** @param newAgama
    * @pdOid fd516a69-514e-4cc8-abb8-0ba9f53a4893 */
   public void setagama(String newAgama) {
      agama = newAgama;
   }
   
   /** @pdOid 08ab7c6e-5c61-4f7a-b8bc-db03514703dd */
   public String getjenisKelamin() {
      return jenisKelamin;
   }
   
   /** @param newJenisKelamin
    * @pdOid b3a55e4a-41bf-4d60-ad73-1a22ad4a22c0 */
   public void setjenisKelamin(String newJenisKelamin) {
      jenisKelamin = newJenisKelamin;
   }
   
   /** @pdOid 7be1cc73-75a2-4688-8f58-cfc7eec41dd0 */
   public String getemail() {
      return email;
   }
   
   /** @param newEmail
    * @pdOid b56924b3-e190-488b-b06a-47f279cd6b45 */
   public void setemail(String newEmail) {
      email = newEmail;
   }
   
   /** @pdOid afbd14ef-4d8e-4d58-b2ed-0609f1112222 */
   public Date gettanggalLahir() {
      return tanggalLahir;
   }
   
   /** @param newTanggalLahir
    * @pdOid a9f51910-67c4-4665-99df-d0ff4ebdac6a */
   public void settanggalLahir(Date newTanggalLahir) {
      tanggalLahir = newTanggalLahir;
   }
   
   /** @pdOid 63326a3a-3ee5-40cc-a91e-48c9743a0c6c */
   public String getalamat() {
      return alamat;
   }
   
   /** @param newAlamat
    * @pdOid 855405c5-71e5-413c-aba4-8e3b9214eeaf */
   public void setalamat(String newAlamat) {
      alamat = newAlamat;
   }

}