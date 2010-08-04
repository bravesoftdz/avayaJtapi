/*    */ package com.avaya.jtapi.tsapi.impl;
/*    */ 
/*    */ import com.avaya.jtapi.tsapi.LucentV5Connection;
/*    */ import com.avaya.jtapi.tsapi.impl.core.TSConnection;
/*    */ import com.avaya.jtapi.tsapi.util.TsapiTrace;
/*    */ 
/*    */ final class LucentV5ACDConnectionImpl extends LucentACDConnectionImpl
/*    */   implements LucentV5Connection
/*    */ {
/*    */   public boolean equals(Object obj)
/*    */   {
/* 16 */     if (obj instanceof LucentV5ACDConnectionImpl)
/*    */     {
/* 18 */       return this.tsConnection.equals(((LucentV5ACDConnectionImpl)obj).tsConnection);
/*    */     }
/*    */ 
/* 22 */     return false;
/*    */   }
/*    */ 
/*    */   LucentV5ACDConnectionImpl(TSConnection _tsConnection)
/*    */   {
/* 29 */     super(_tsConnection);
/* 30 */     TsapiTrace.traceConstruction(this, LucentV5ACDConnectionImpl.class);
/*    */   }
/*    */ 
/*    */   protected void finalize()
/*    */     throws Throwable
/*    */   {
/* 36 */     super.finalize();
/* 37 */     TsapiTrace.traceDestruction(this, LucentV5ACDConnectionImpl.class);
/*    */   }
/*    */ }

/* Location:           C:\Documents and Settings\Daniel Jurado\Meus documentos\My Dropbox\install\Avaya\jtapi-sdk-5.2.2.483\lib\ecsjtapia.jar
 * Qualified Name:     com.avaya.jtapi.tsapi.impl.LucentV5ACDConnectionImpl
 * JD-Core Version:    0.5.4
 */