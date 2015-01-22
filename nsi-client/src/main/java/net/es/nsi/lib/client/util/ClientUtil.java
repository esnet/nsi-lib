package net.es.nsi.lib.client.util;

import net.es.nsi.lib.soap.gen.nsi_2_0_r117.connection.provider.ConnectionProviderPort;
import net.es.nsi.lib.soap.gen.nsi_2_0_r117.connection.requester.ConnectionRequesterPort;
import net.es.nsi.lib.soap.gen.nsi_2_0_r117.framework.headers.CommonHeaderType;
import net.es.nsi.lib.client.config.ClientConfig;
import org.apache.cxf.Bus;
import org.apache.cxf.bus.spring.SpringBusFactory;
import org.apache.cxf.interceptor.LoggingInInterceptor;
import org.apache.cxf.interceptor.LoggingOutInterceptor;
import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.ws.Holder;
import java.net.URL;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

/**
 * Utility classes for building clients
 *
 */
public class ClientUtil {
    private static ClientUtil instance;
    private ClientUtil() {}
    final public static String DEFAULT_URL = "https://localhost:8500/nsi-v2/ConnectionServiceProvider";
    final public static String DEFAULT_REQUESTER = "urn:oscars:nsa:client";
    final public static String DEFAULT_PROVIDER = DEFAULT_REQUESTER;
    final public static String DEFAULT_PROTOCOL_VERSION = "application/vdn.ogf.nsi.cs.v2.provider+soap";


    HashMap<URL, ConnectionRequesterPort> requesterPorts = new HashMap<URL, ConnectionRequesterPort>();
    HashMap<URL, ConnectionProviderPort> providerPorts = new HashMap<URL, ConnectionProviderPort>();

    public static ClientUtil getInstance() {
        if (instance == null) {
            instance = new ClientUtil();
        }
        return instance;
    }

    public synchronized ConnectionRequesterPort getRequesterPort(URL url, ClientConfig cc) {
        if (requesterPorts.get(url) == null) {
            requesterPorts.put(url, createRequesterClient(url, cc));
        }
        return requesterPorts.get(url);
    }

    public synchronized ConnectionProviderPort getProviderPort(URL url, ClientConfig cc) {
        if (providerPorts.get(url) == null) {
            providerPorts.put(url, createProviderClient(url, cc));
        }
        return providerPorts.get(url);
    }



    /**
     * Creates a client class can be used to call provider at given URL
     * 
     * @param url the URL of the provider to contact
     * @param cc the client configuration
     * @return the ConnectionProviderPort that you can use as the client
     */
    private ConnectionProviderPort createProviderClient(URL url, ClientConfig cc){

        prepareBus(url, cc);

        // set logging
        LoggingInInterceptor in = new LoggingInInterceptor();
        in.setPrettyLogging(true);

        LoggingOutInterceptor out = new LoggingOutInterceptor();
        out.setPrettyLogging(true);

        JaxWsProxyFactoryBean fb = new JaxWsProxyFactoryBean();
        fb.getInInterceptors().add(in);
        fb.getOutInterceptors().add(out);

        fb.setAddress(url.toString());

        Map props = fb.getProperties();
        if (props == null) {
            props = new HashMap<String, Object>();
        }
        props.put("jaxb.additionalContextClasses",
                new Class[] {
                        net.es.nsi.lib.soap.gen.nsi_2_0_r117.services.point2point.ObjectFactory.class
                });
        fb.setProperties(props);

        fb.setServiceClass(ConnectionProviderPort.class);
        ConnectionProviderPort client = (ConnectionProviderPort) fb.create();
        
        return client;
    }
    

    /**
     * Creates a client for interacting with an NSA requester
     * 
     * @param url the URL of the requester to contact
     * @param cc the client configuration
     * @return the ConnectionRequesterPort that you can use at the client
     */
    private ConnectionRequesterPort createRequesterClient(URL url, ClientConfig cc){

        prepareBus(url, cc);


        // set logging
        LoggingInInterceptor in = new LoggingInInterceptor();
        in.setPrettyLogging(true);

        LoggingOutInterceptor out = new LoggingOutInterceptor();
        out.setPrettyLogging(true);

        JaxWsProxyFactoryBean fb = new JaxWsProxyFactoryBean();

        fb.getInInterceptors().add(in);
        fb.getOutInterceptors().add(out);

        fb.setAddress(url.toString());

        Map props = fb.getProperties();
        if (props == null) {
            props = new HashMap<String, Object>();
        }
        props.put("jaxb.additionalContextClasses",
                new Class[] {
                        net.es.nsi.lib.soap.gen.nsi_2_0_r117.services.point2point.ObjectFactory.class
                });
        fb.setProperties(props);

        fb.setServiceClass(ConnectionRequesterPort.class);
        ConnectionRequesterPort client = (ConnectionRequesterPort) fb.create();
        
        return client;
    }




    /**
     * Configures SSL and other basic client settings
     * @param url the URL of the server to contact
     */
    private void prepareBus(URL url, ClientConfig cc) {

        String busFile = cc.getBusConfigPath();

        if (url.getProtocol().equals("https")) {
            System.setProperty("javax.net.ssl.trustStore","DoNotUsecacerts");
        }

        SpringBusFactory bf = new SpringBusFactory();
        Bus bus = bf.createBus(busFile);
        bf.setDefaultBus(bus);
    }

    
    /**
     * Creates a basic header with a random Correlation ID and dfault requester
     * @return the generated header
     */
    public static  Holder<CommonHeaderType> makeClientHeader(){
        CommonHeaderType hd = new CommonHeaderType();
        hd.setRequesterNSA(DEFAULT_REQUESTER);
        hd.setProviderNSA(DEFAULT_PROVIDER);
        hd.setProtocolVersion(DEFAULT_PROTOCOL_VERSION);
        hd.setCorrelationId("urn:uuid:"+UUID.randomUUID().toString());
        Holder<CommonHeaderType> header = new Holder<CommonHeaderType>();
        header.value = hd;
        
        return header;
    }
    
    /**
     * Converts timestamp to an XML time
     * 
     * @param timestamp the timestamp to convert
     * @return the XMLGregorianCalendar representaion of the given timestamp
     * @throws javax.xml.datatype.DatatypeConfigurationException
     */
    public static XMLGregorianCalendar unixtimeToXMLGregCal(long timestamp) throws DatatypeConfigurationException{
        GregorianCalendar cal = new GregorianCalendar();
        cal.setTimeInMillis(timestamp);
        
        return DatatypeFactory.newInstance().newXMLGregorianCalendar(cal);
    }
}
