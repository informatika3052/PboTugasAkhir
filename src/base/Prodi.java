/***********************************************************************
 * Module:  Prodi.java
 * Author:  renol
 * Purpose: Defines the Class Prodi
 ***********************************************************************/

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

}