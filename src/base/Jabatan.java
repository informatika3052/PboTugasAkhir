package base;

/***********************************************************************
 * Module:  Jabatan.java
 * Author:  renol
 * Purpose: Defines the Class Jabatan
 ***********************************************************************/

import java.util.*;

/** @pdOid 07373666-57f0-47e5-8e2d-c6c66b38439b */
public class Jabatan {
   /** @pdOid 2c3fc45e-9952-4911-a107-ece9327662e8 */
   private int idJabatan;
   /** @pdOid 0004d37d-46db-4937-aec8-ce401afbad7b */
   private String namaJabatan;
   
   /** @pdOid 1a076ff7-1cb5-4152-90d8-3e9846181012 */
   public Jabatan() {
      // TODO: implement
   }
   
   /** @pdOid 5f35ca23-0702-4126-910f-52ea55fca236 */
   public int getidJabatan() {
      return idJabatan;
   }
   
   /** @param newIdJabatan
    * @pdOid 5c79bee8-b473-4c0c-8815-7c4509e5b233 */
   public void setidJabatan(int newIdJabatan) {
      idJabatan = newIdJabatan;
   }
   
   /** @pdOid 6260442b-3dec-47d5-ad35-4c7d27743c30 */
   public String getnamaJabatan() {
      return namaJabatan;
   }
   
   /** @param newNamaJabatan
    * @pdOid 5b3197b6-949b-4542-ba53-14834ab2bdf4 */
   public void setnamaJabatan(String newNamaJabatan) {
      namaJabatan = newNamaJabatan;
   }

}