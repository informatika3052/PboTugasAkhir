package base;

/***********************************************************************
 * Module:  Dosen.java
 * Author:  renol
 * Purpose: Defines the Class Dosen
 ***********************************************************************/

import java.util.*;

/** @pdOid 8186c57c-5bc3-4f83-aa60-393ff3e6a440 */
public class Dosen extends Manusia {
   /** @pdOid 2e584c1c-3f6b-4a31-b993-8ddea237ca10 */
   private String nidn;
   
   /** @pdOid 0150758a-f997-403e-94d7-d8d2b55333fe */
   public Dosen() {
      // TODO: implement
   }
   
   /** @pdOid 3020d748-b8dc-480e-a1cb-5b993e29352a */
   public String getnidn() {
      return nidn;
   }
   
   /** @param newNidn
    * @pdOid da46d4f8-d4c8-4f7a-8922-a28dc34982a2 */
   public void setnidn(String newNidn) {
      nidn = newNidn;
   }

}