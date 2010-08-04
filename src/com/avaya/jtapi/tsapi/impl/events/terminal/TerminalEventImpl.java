/*    */ package com.avaya.jtapi.tsapi.impl.events.terminal;
/*    */ 
/*    */ import com.avaya.jtapi.tsapi.impl.events.TsapiListenerEvent;
/*    */ import javax.telephony.Terminal;
/*    */ import javax.telephony.TerminalEvent;
/*    */ 
/*    */ public class TerminalEventImpl extends TsapiListenerEvent
/*    */   implements TerminalEvent
/*    */ {
/*    */   private Terminal terminal;
/*    */ 
/*    */   public TerminalEventImpl(int eventId, int _cause, Terminal _device, Object privateData)
/*    */   {
/* 34 */     super(eventId, _cause, null, _device, privateData);
/* 35 */     this.terminal = _device;
/*    */   }
/*    */ 
/*    */   public Terminal getTerminal() {
/* 39 */     return this.terminal;
/*    */   }
/*    */ }

/* Location:           C:\Documents and Settings\Daniel Jurado\Meus documentos\My Dropbox\install\Avaya\jtapi-sdk-5.2.2.483\lib\ecsjtapia.jar
 * Qualified Name:     com.avaya.jtapi.tsapi.impl.events.terminal.TerminalEventImpl
 * JD-Core Version:    0.5.4
 */