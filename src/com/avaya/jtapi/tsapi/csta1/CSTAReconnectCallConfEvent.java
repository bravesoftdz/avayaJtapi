/*    */ package com.avaya.jtapi.tsapi.csta1;
/*    */ 
/*    */ import com.avaya.jtapi.tsapi.asn1.ASNNull;
/*    */ import java.io.InputStream;
/*    */ import java.io.OutputStream;
/*    */ import java.util.ArrayList;
/*    */ import java.util.Collection;
/*    */ 
/*    */ public final class CSTAReconnectCallConfEvent extends CSTAConfirmation
/*    */ {
/*    */   public static final int PDU = 40;
/*    */ 
/*    */   public void encodeMembers(OutputStream memberStream)
/*    */   {
/* 15 */     ASNNull.encode(memberStream);
/*    */   }
/*    */ 
/*    */   public static CSTAReconnectCallConfEvent decode(InputStream in)
/*    */   {
/* 20 */     CSTAReconnectCallConfEvent _this = new CSTAReconnectCallConfEvent();
/* 21 */     _this.doDecode(in);
/*    */ 
/* 23 */     return _this;
/*    */   }
/*    */ 
/*    */   public void decodeMembers(InputStream memberStream)
/*    */   {
/* 28 */     ASNNull.decode(memberStream);
/*    */   }
/*    */ 
/*    */   public Collection<String> print()
/*    */   {
/* 33 */     Collection lines = new ArrayList();
/*    */ 
/* 35 */     lines.add("CSTAReconnectCallConfEvent ::=");
/* 36 */     lines.add("{");
/*    */ 
/* 38 */     String indent = "  ";
/*    */ 
/* 40 */     lines.addAll(ASNNull.print(indent));
/*    */ 
/* 42 */     lines.add("}");
/* 43 */     return lines;
/*    */   }
/*    */ 
/*    */   public int getPDU()
/*    */   {
/* 48 */     return 40;
/*    */   }
/*    */ }

/* Location:           C:\Documents and Settings\Daniel Jurado\Meus documentos\My Dropbox\install\Avaya\jtapi-sdk-5.2.2.483\lib\ecsjtapia.jar
 * Qualified Name:     com.avaya.jtapi.tsapi.csta1.CSTAReconnectCallConfEvent
 * JD-Core Version:    0.5.4
 */