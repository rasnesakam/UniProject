/**
 * KPSPublic.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package tr.gov.nvi.tckimlik.WS;

import javax.xml.rpc.Service;

public interface KPSPublic extends Service {
    public java.lang.String getKPSPublicSoapAddress();

    public tr.gov.nvi.tckimlik.WS.KPSPublicSoap getKPSPublicSoap() throws javax.xml.rpc.ServiceException;

    public tr.gov.nvi.tckimlik.WS.KPSPublicSoap getKPSPublicSoap(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
