/*    */ package com.avaya.jtapi.tsapi.csta1;
/*    */ 
/*    */ import com.avaya.jtapi.tsapi.asn1.TsapiPDU;
/*    */ 
/*    */ public abstract class CSTAUnsolicited extends TsapiPDU
/*    */ {
/*    */   int monitorCrossRefID;
/*    */ 
/*    */   public int getPDUClass()
/*    */   {
/* 19 */     return 4;
/*    */   }
/*    */ 
/*    */   public int getMonitorCrossRefID()
/*    */   {
/* 26 */     return this.monitorCrossRefID;
/*    */   }
/*    */ 
/*    */   public void setMonitorCrossRefID(int monitorCrossRefID)
/*    */   {
/* 34 */     this.monitorCrossRefID = monitorCrossRefID;
/*    */   }
/*    */ }

/* Location:           C:\Documents and Settings\Daniel Jurado\Meus documentos\My Dropbox\install\Avaya\jtapi-sdk-5.2.2.483\lib\ecsjtapia.jar
 * Qualified Name:     com.avaya.jtapi.tsapi.csta1.CSTAUnsolicited
 * JD-Core Version:    0.5.4
 */