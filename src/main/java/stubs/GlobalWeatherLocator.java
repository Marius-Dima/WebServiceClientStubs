/**
 * GlobalWeatherLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package stubs;

public class GlobalWeatherLocator extends org.apache.axis.client.Service implements stubs.GlobalWeather {

    public GlobalWeatherLocator() {
    }


    public GlobalWeatherLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public GlobalWeatherLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for GlobalWeatherSoap
    private java.lang.String GlobalWeatherSoap_address = "http://www.webservicex.net/globalweather.asmx";

    public java.lang.String getGlobalWeatherSoapAddress() {
        return GlobalWeatherSoap_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String GlobalWeatherSoapWSDDServiceName = "GlobalWeatherSoap";

    public java.lang.String getGlobalWeatherSoapWSDDServiceName() {
        return GlobalWeatherSoapWSDDServiceName;
    }

    public void setGlobalWeatherSoapWSDDServiceName(java.lang.String name) {
        GlobalWeatherSoapWSDDServiceName = name;
    }

    public stubs.GlobalWeatherSoap_PortType getGlobalWeatherSoap() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(GlobalWeatherSoap_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getGlobalWeatherSoap(endpoint);
    }

    public stubs.GlobalWeatherSoap_PortType getGlobalWeatherSoap(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            stubs.GlobalWeatherSoap_BindingStub _stub = new stubs.GlobalWeatherSoap_BindingStub(portAddress, this);
            _stub.setPortName(getGlobalWeatherSoapWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setGlobalWeatherSoapEndpointAddress(java.lang.String address) {
        GlobalWeatherSoap_address = address;
    }


    // Use to get a proxy class for GlobalWeatherSoap12
    private java.lang.String GlobalWeatherSoap12_address = "http://www.webservicex.net/globalweather.asmx";

    public java.lang.String getGlobalWeatherSoap12Address() {
        return GlobalWeatherSoap12_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String GlobalWeatherSoap12WSDDServiceName = "GlobalWeatherSoap12";

    public java.lang.String getGlobalWeatherSoap12WSDDServiceName() {
        return GlobalWeatherSoap12WSDDServiceName;
    }

    public void setGlobalWeatherSoap12WSDDServiceName(java.lang.String name) {
        GlobalWeatherSoap12WSDDServiceName = name;
    }

    public stubs.GlobalWeatherSoap_PortType getGlobalWeatherSoap12() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(GlobalWeatherSoap12_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getGlobalWeatherSoap12(endpoint);
    }

    public stubs.GlobalWeatherSoap_PortType getGlobalWeatherSoap12(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            stubs.GlobalWeatherSoap12Stub _stub = new stubs.GlobalWeatherSoap12Stub(portAddress, this);
            _stub.setPortName(getGlobalWeatherSoap12WSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setGlobalWeatherSoap12EndpointAddress(java.lang.String address) {
        GlobalWeatherSoap12_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     * This service has multiple ports for a given interface;
     * the proxy implementation returned may be indeterminate.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (stubs.GlobalWeatherSoap_PortType.class.isAssignableFrom(serviceEndpointInterface)) {
                stubs.GlobalWeatherSoap_BindingStub _stub = new stubs.GlobalWeatherSoap_BindingStub(new java.net.URL(GlobalWeatherSoap_address), this);
                _stub.setPortName(getGlobalWeatherSoapWSDDServiceName());
                return _stub;
            }
            if (stubs.GlobalWeatherSoap_PortType.class.isAssignableFrom(serviceEndpointInterface)) {
                stubs.GlobalWeatherSoap12Stub _stub = new stubs.GlobalWeatherSoap12Stub(new java.net.URL(GlobalWeatherSoap12_address), this);
                _stub.setPortName(getGlobalWeatherSoap12WSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("GlobalWeatherSoap".equals(inputPortName)) {
            return getGlobalWeatherSoap();
        }
        else if ("GlobalWeatherSoap12".equals(inputPortName)) {
            return getGlobalWeatherSoap12();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://www.webserviceX.NET", "GlobalWeather");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://www.webserviceX.NET", "GlobalWeatherSoap"));
            ports.add(new javax.xml.namespace.QName("http://www.webserviceX.NET", "GlobalWeatherSoap12"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("GlobalWeatherSoap".equals(portName)) {
            setGlobalWeatherSoapEndpointAddress(address);
        }
        else 
if ("GlobalWeatherSoap12".equals(portName)) {
            setGlobalWeatherSoap12EndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
