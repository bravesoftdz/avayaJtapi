/*    */ package com.avaya.jtapi.tsapi.csta1;
/*    */ 
/*    */ import com.avaya.jtapi.tsapi.asn1.ASNSequenceOf;
/*    */ import java.io.InputStream;
/*    */ import java.io.OutputStream;
/*    */ import java.util.ArrayList;
/*    */ import java.util.Collection;
/*    */ import java.util.Vector;
/*    */ 
/*    */ public final class DeviceList extends ASNSequenceOf
/*    */ {
/*    */   String[] array;
/*    */ 
/*    */   public DeviceList()
/*    */   {
/*    */   }
/*    */ 
/*    */   public DeviceList(String[] _array)
/*    */   {
/* 18 */     this.array = _array;
/*    */   }
/*    */ 
/*    */   public static String[] decode(InputStream in)
/*    */   {
/* 23 */     DeviceList _this = new DeviceList();
/* 24 */     _this.doDecode(in);
/* 25 */     return _this.array;
/*    */   }
/*    */ 
/*    */   public void doDecode(InputStream in)
/*    */   {
/* 30 */     super.doDecode(in);
/*    */ 
/* 32 */     this.array = new String[this.vec.size()];
/*    */ 
/* 34 */     for (int i = 0; i < this.array.length; ++i)
/*    */     {
/* 36 */       this.array[i] = ((String)this.vec.elementAt(i));
/*    */     }
/*    */   }
/*    */ 
/*    */   public Object decodeMember(InputStream memberStream)
/*    */   {
/* 42 */     return DeviceID.decode(memberStream);
/*    */   }
/*    */ 
/*    */   public static void encode(String[] array, OutputStream out)
/*    */   {
/* 47 */     DeviceList _this = new DeviceList(array);
/* 48 */     _this.doEncode(array.length, out);
/*    */   }
/*    */ 
/*    */   public void encodeMember(int index, OutputStream memberStream)
/*    */   {
/* 53 */     DeviceID.encode(this.array[index], memberStream);
/*    */   }
/*    */ 
/*    */   public static Collection<String> print(String[] array, String name, String _indent)
/*    */   {
/* 58 */     Collection lines = new ArrayList();
/*    */ 
/* 60 */     if (array == null)
/*    */     {
/* 62 */       lines.add(_indent + name + " <null>");
/* 63 */       return lines;
/*    */     }
/* 65 */     if (name != null) {
/* 66 */       lines.add(_indent + name);
/*    */     }
/* 68 */     lines.add(_indent + "{");
/*    */ 
/* 70 */     String indent = _indent + "  ";
/*    */ 
/* 72 */     for (int i = 0; i < array.length; ++i) {
/* 73 */       lines.addAll(DeviceID.print(array[i], null, indent));
/*    */     }
/* 75 */     lines.add(_indent + "}");
/* 76 */     return lines;
/*    */   }
/*    */ }

/* Location:           C:\Documents and Settings\Daniel Jurado\Meus documentos\My Dropbox\install\Avaya\jtapi-sdk-5.2.2.483\lib\ecsjtapia.jar
 * Qualified Name:     com.avaya.jtapi.tsapi.csta1.DeviceList
 * JD-Core Version:    0.5.4
 */