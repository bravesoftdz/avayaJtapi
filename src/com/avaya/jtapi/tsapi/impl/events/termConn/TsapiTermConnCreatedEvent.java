/*    */ package com.avaya.jtapi.tsapi.impl.events.termConn;
/*    */ 
/*    */ import javax.telephony.events.TermConnCreatedEv;
/*    */ 
/*    */ public final class TsapiTermConnCreatedEvent extends TsapiTermConnEvent
/*    */   implements TermConnCreatedEv
/*    */ {
/*    */   public int getID()
/*    */   {
/* 16 */     return 116;
/*    */   }
/*    */ 
/*    */   public TsapiTermConnCreatedEvent(TermConnEventParams params)
/*    */   {
/* 22 */     super(params);
/*    */   }
/*    */ }

/* Location:           C:\Documents and Settings\Daniel Jurado\Meus documentos\My Dropbox\install\Avaya\jtapi-sdk-5.2.2.483\lib\ecsjtapia.jar
 * Qualified Name:     com.avaya.jtapi.tsapi.impl.events.termConn.TsapiTermConnCreatedEvent
 * JD-Core Version:    0.5.4
 */