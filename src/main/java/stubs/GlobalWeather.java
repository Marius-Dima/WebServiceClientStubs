/**
 * GlobalWeather.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package stubs;

public interface GlobalWeather extends javax.xml.rpc.Service {
    public java.lang.String getGlobalWeatherSoapAddress();

    public stubs.GlobalWeatherSoap_PortType getGlobalWeatherSoap() throws javax.xml.rpc.ServiceException;

    public stubs.GlobalWeatherSoap_PortType getGlobalWeatherSoap(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
    public java.lang.String getGlobalWeatherSoap12Address();

    public stubs.GlobalWeatherSoap_PortType getGlobalWeatherSoap12() throws javax.xml.rpc.ServiceException;

    public stubs.GlobalWeatherSoap_PortType getGlobalWeatherSoap12(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
