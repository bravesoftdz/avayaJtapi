package com.avaya.jtapi.tsapi.tsapiInterface;

import com.avaya.jtapi.tsapi.csta1.CSTAEvent;

public abstract interface TsapiUnsolicitedHandler
{
  public abstract void acsUnsolicited(CSTAEvent paramCSTAEvent);

  public abstract void cstaUnsolicited(CSTAEvent paramCSTAEvent);

  public abstract void cstaRequest(CSTAEvent paramCSTAEvent);

  public abstract void cstaEventReport(CSTAEvent paramCSTAEvent);

  public abstract void eventDistributorException(Exception paramException);
}

/* Location:           C:\Documents and Settings\Daniel Jurado\Meus documentos\My Dropbox\install\Avaya\jtapi-sdk-5.2.2.483\lib\ecsjtapia.jar
 * Qualified Name:     com.avaya.jtapi.tsapi.tsapiInterface.TsapiUnsolicitedHandler
 * JD-Core Version:    0.5.4
 */