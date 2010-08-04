/*    */ package com.avaya.jtapi.tsapi.csta1;
/*    */ 
/*    */ import java.io.InputStream;
/*    */ import java.io.OutputStream;
/*    */ 
/*    */ public final class LucentV7QueryDeviceNameConfEvent extends LucentV5QueryDeviceNameConfEvent
/*    */ {
/*    */   public static final int PDU = 125;
/*    */ 
/*    */   public static LucentQueryDeviceNameConfEvent decode(InputStream in)
/*    */   {
/* 15 */     LucentV7QueryDeviceNameConfEvent _this = new LucentV7QueryDeviceNameConfEvent();
/* 16 */     _this.doDecode(in);
/*    */ 
/* 18 */     return _this;
/*    */   }
/*    */ 
/*    */   public void decodeMembers(InputStream memberStream)
/*    */   {
/* 23 */     super.decodeMembers(memberStream);
/*    */   }
/*    */ 
/*    */   public void encodeMembers(OutputStream memberStream) {
/* 27 */     super.encodeMembers(memberStream);
/*    */   }
/*    */ 
/*    */   public int getPDU() {
/* 31 */     return 125;
/*    */   }
/*    */ }

/* Location:           C:\Documents and Settings\Daniel Jurado\Meus documentos\My Dropbox\install\Avaya\jtapi-sdk-5.2.2.483\lib\ecsjtapia.jar
 * Qualified Name:     com.avaya.jtapi.tsapi.csta1.LucentV7QueryDeviceNameConfEvent
 * JD-Core Version:    0.5.4
 */