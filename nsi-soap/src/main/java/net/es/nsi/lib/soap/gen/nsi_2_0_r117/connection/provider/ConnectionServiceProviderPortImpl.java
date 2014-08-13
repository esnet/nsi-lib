
/**
 * Please modify this class to meet your needs
 * This class is not complete
 */

package net.es.nsi.lib.soap.gen.nsi_2_0_r117.connection.provider;

import java.util.logging.Logger;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 3.0.1
 * 2014-08-13T10:03:25.475-07:00
 * Generated source version: 3.0.1
 * 
 */

@javax.jws.WebService(
                      serviceName = "ConnectionServiceProvider",
                      portName = "ConnectionServiceProviderPort",
                      targetNamespace = "http://schemas.ogf.org/nsi/2013/12/connection/provider",
                      wsdlLocation = "file:/Users/haniotak/ij12/nsi/nsi-lib/nsi-soap/schema/r117/ConnectionService/ogf_nsi_connection_provider_v2_0.wsdl",
                      endpointInterface = "net.es.nsi.lib.soap.gen.nsi_2_0_r117.connection.provider.ConnectionProviderPort")
                      
public class ConnectionServiceProviderPortImpl implements ConnectionProviderPort {

    private static final Logger LOG = Logger.getLogger(ConnectionServiceProviderPortImpl.class.getName());

    /* (non-Javadoc)
     * @see net.es.nsi.lib.soap.gen.nsi_2_0_r117.connection.provider.ConnectionProviderPort#provision(java.lang.String  connectionId ,)net.es.nsi.lib.soap.gen.nsi_2_0_r117.framework.headers.CommonHeaderType  header ,)net.es.nsi.lib.soap.gen.nsi_2_0_r117.framework.headers.CommonHeaderType  header1 )*
     */
    public void provision(java.lang.String connectionId,net.es.nsi.lib.soap.gen.nsi_2_0_r117.framework.headers.CommonHeaderType header,javax.xml.ws.Holder<net.es.nsi.lib.soap.gen.nsi_2_0_r117.framework.headers.CommonHeaderType> header1) throws net.es.nsi.lib.soap.gen.nsi_2_0_r117.connection.ifce.ServiceException    { 
        LOG.info("Executing operation provision");
        System.out.println(connectionId);
        System.out.println(header);
        try {
            net.es.nsi.lib.soap.gen.nsi_2_0_r117.framework.headers.CommonHeaderType header1Value = null;
            header1.value = header1Value;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
        //throw new net.es.nsi.lib.soap.gen.nsi_2_0_r117.connection.ifce.ServiceException("serviceException...");
    }

    /* (non-Javadoc)
     * @see net.es.nsi.lib.soap.gen.nsi_2_0_r117.connection.provider.ConnectionProviderPort#querySummarySync(net.es.nsi.lib.soap.gen.nsi_2_0_r117.connection.types.QueryType  querySummarySync ,)net.es.nsi.lib.soap.gen.nsi_2_0_r117.framework.headers.CommonHeaderType  header )*
     */
    public net.es.nsi.lib.soap.gen.nsi_2_0_r117.connection.types.QuerySummaryConfirmedType querySummarySync(net.es.nsi.lib.soap.gen.nsi_2_0_r117.connection.types.QueryType querySummarySync,javax.xml.ws.Holder<net.es.nsi.lib.soap.gen.nsi_2_0_r117.framework.headers.CommonHeaderType> header) throws net.es.nsi.lib.soap.gen.nsi_2_0_r117.connection.ifce.Error    { 
        LOG.info("Executing operation querySummarySync");
        System.out.println(querySummarySync);
        System.out.println(header.value);
        try {
            net.es.nsi.lib.soap.gen.nsi_2_0_r117.connection.types.QuerySummaryConfirmedType _return = null;
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
        //throw new net.es.nsi.lib.soap.gen.nsi_2_0_r117.connection.ifce.Error("error...");
    }

    /* (non-Javadoc)
     * @see net.es.nsi.lib.soap.gen.nsi_2_0_r117.connection.provider.ConnectionProviderPort#queryRecursive(net.es.nsi.lib.soap.gen.nsi_2_0_r117.connection.types.QueryType  queryRecursive ,)net.es.nsi.lib.soap.gen.nsi_2_0_r117.framework.headers.CommonHeaderType  header )*
     */
    public net.es.nsi.lib.soap.gen.nsi_2_0_r117.connection.types.GenericAcknowledgmentType queryRecursive(net.es.nsi.lib.soap.gen.nsi_2_0_r117.connection.types.QueryType queryRecursive,javax.xml.ws.Holder<net.es.nsi.lib.soap.gen.nsi_2_0_r117.framework.headers.CommonHeaderType> header) throws net.es.nsi.lib.soap.gen.nsi_2_0_r117.connection.ifce.ServiceException    { 
        LOG.info("Executing operation queryRecursive");
        System.out.println(queryRecursive);
        System.out.println(header.value);
        try {
            net.es.nsi.lib.soap.gen.nsi_2_0_r117.connection.types.GenericAcknowledgmentType _return = null;
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
        //throw new net.es.nsi.lib.soap.gen.nsi_2_0_r117.connection.ifce.ServiceException("serviceException...");
    }

    /* (non-Javadoc)
     * @see net.es.nsi.lib.soap.gen.nsi_2_0_r117.connection.provider.ConnectionProviderPort#reserveCommit(java.lang.String  connectionId ,)net.es.nsi.lib.soap.gen.nsi_2_0_r117.framework.headers.CommonHeaderType  header ,)net.es.nsi.lib.soap.gen.nsi_2_0_r117.framework.headers.CommonHeaderType  header1 )*
     */
    public void reserveCommit(java.lang.String connectionId,net.es.nsi.lib.soap.gen.nsi_2_0_r117.framework.headers.CommonHeaderType header,javax.xml.ws.Holder<net.es.nsi.lib.soap.gen.nsi_2_0_r117.framework.headers.CommonHeaderType> header1) throws net.es.nsi.lib.soap.gen.nsi_2_0_r117.connection.ifce.ServiceException    { 
        LOG.info("Executing operation reserveCommit");
        System.out.println(connectionId);
        System.out.println(header);
        try {
            net.es.nsi.lib.soap.gen.nsi_2_0_r117.framework.headers.CommonHeaderType header1Value = null;
            header1.value = header1Value;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
        //throw new net.es.nsi.lib.soap.gen.nsi_2_0_r117.connection.ifce.ServiceException("serviceException...");
    }

    /* (non-Javadoc)
     * @see net.es.nsi.lib.soap.gen.nsi_2_0_r117.connection.provider.ConnectionProviderPort#queryNotification(java.lang.String  connectionId ,)java.lang.Long  startNotificationId ,)java.lang.Long  endNotificationId ,)net.es.nsi.lib.soap.gen.nsi_2_0_r117.framework.headers.CommonHeaderType  header ,)net.es.nsi.lib.soap.gen.nsi_2_0_r117.framework.headers.CommonHeaderType  header1 )*
     */
    public void queryNotification(java.lang.String connectionId,java.lang.Long startNotificationId,java.lang.Long endNotificationId,net.es.nsi.lib.soap.gen.nsi_2_0_r117.framework.headers.CommonHeaderType header,javax.xml.ws.Holder<net.es.nsi.lib.soap.gen.nsi_2_0_r117.framework.headers.CommonHeaderType> header1) throws net.es.nsi.lib.soap.gen.nsi_2_0_r117.connection.ifce.ServiceException    { 
        LOG.info("Executing operation queryNotification");
        System.out.println(connectionId);
        System.out.println(startNotificationId);
        System.out.println(endNotificationId);
        System.out.println(header);
        try {
            net.es.nsi.lib.soap.gen.nsi_2_0_r117.framework.headers.CommonHeaderType header1Value = null;
            header1.value = header1Value;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
        //throw new net.es.nsi.lib.soap.gen.nsi_2_0_r117.connection.ifce.ServiceException("serviceException...");
    }

    /* (non-Javadoc)
     * @see net.es.nsi.lib.soap.gen.nsi_2_0_r117.connection.provider.ConnectionProviderPort#terminate(java.lang.String  connectionId ,)net.es.nsi.lib.soap.gen.nsi_2_0_r117.framework.headers.CommonHeaderType  header ,)net.es.nsi.lib.soap.gen.nsi_2_0_r117.framework.headers.CommonHeaderType  header1 )*
     */
    public void terminate(java.lang.String connectionId,net.es.nsi.lib.soap.gen.nsi_2_0_r117.framework.headers.CommonHeaderType header,javax.xml.ws.Holder<net.es.nsi.lib.soap.gen.nsi_2_0_r117.framework.headers.CommonHeaderType> header1) throws net.es.nsi.lib.soap.gen.nsi_2_0_r117.connection.ifce.ServiceException    { 
        LOG.info("Executing operation terminate");
        System.out.println(connectionId);
        System.out.println(header);
        try {
            net.es.nsi.lib.soap.gen.nsi_2_0_r117.framework.headers.CommonHeaderType header1Value = null;
            header1.value = header1Value;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
        //throw new net.es.nsi.lib.soap.gen.nsi_2_0_r117.connection.ifce.ServiceException("serviceException...");
    }

    /* (non-Javadoc)
     * @see net.es.nsi.lib.soap.gen.nsi_2_0_r117.connection.provider.ConnectionProviderPort#reserve(java.lang.String  connectionId ,)java.lang.String  globalReservationId ,)java.lang.String  description ,)net.es.nsi.lib.soap.gen.nsi_2_0_r117.connection.types.ReservationRequestCriteriaType  criteria ,)net.es.nsi.lib.soap.gen.nsi_2_0_r117.framework.headers.CommonHeaderType  header ,)net.es.nsi.lib.soap.gen.nsi_2_0_r117.framework.headers.CommonHeaderType  header1 )*
     */
    public void reserve(javax.xml.ws.Holder<java.lang.String> connectionId,java.lang.String globalReservationId,java.lang.String description,net.es.nsi.lib.soap.gen.nsi_2_0_r117.connection.types.ReservationRequestCriteriaType criteria,net.es.nsi.lib.soap.gen.nsi_2_0_r117.framework.headers.CommonHeaderType header,javax.xml.ws.Holder<net.es.nsi.lib.soap.gen.nsi_2_0_r117.framework.headers.CommonHeaderType> header1) throws net.es.nsi.lib.soap.gen.nsi_2_0_r117.connection.ifce.ServiceException    { 
        LOG.info("Executing operation reserve");
        System.out.println(connectionId.value);
        System.out.println(globalReservationId);
        System.out.println(description);
        System.out.println(criteria);
        System.out.println(header);
        try {
            net.es.nsi.lib.soap.gen.nsi_2_0_r117.framework.headers.CommonHeaderType header1Value = null;
            header1.value = header1Value;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
        //throw new net.es.nsi.lib.soap.gen.nsi_2_0_r117.connection.ifce.ServiceException("serviceException...");
    }

    /* (non-Javadoc)
     * @see net.es.nsi.lib.soap.gen.nsi_2_0_r117.connection.provider.ConnectionProviderPort#queryResultSync(java.lang.String  connectionId ,)java.lang.Long  startResultId ,)java.lang.Long  endResultId ,)net.es.nsi.lib.soap.gen.nsi_2_0_r117.framework.headers.CommonHeaderType  header ,)net.es.nsi.lib.soap.gen.nsi_2_0_r117.framework.headers.CommonHeaderType  header1 )*
     */
    public java.util.List<net.es.nsi.lib.soap.gen.nsi_2_0_r117.connection.types.QueryResultResponseType> queryResultSync(java.lang.String connectionId,java.lang.Long startResultId,java.lang.Long endResultId,net.es.nsi.lib.soap.gen.nsi_2_0_r117.framework.headers.CommonHeaderType header,javax.xml.ws.Holder<net.es.nsi.lib.soap.gen.nsi_2_0_r117.framework.headers.CommonHeaderType> header1) throws net.es.nsi.lib.soap.gen.nsi_2_0_r117.connection.ifce.Error    { 
        LOG.info("Executing operation queryResultSync");
        System.out.println(connectionId);
        System.out.println(startResultId);
        System.out.println(endResultId);
        System.out.println(header);
        try {
            net.es.nsi.lib.soap.gen.nsi_2_0_r117.framework.headers.CommonHeaderType header1Value = null;
            header1.value = header1Value;
            java.util.List<net.es.nsi.lib.soap.gen.nsi_2_0_r117.connection.types.QueryResultResponseType> _return = null;
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
        //throw new net.es.nsi.lib.soap.gen.nsi_2_0_r117.connection.ifce.Error("error...");
    }

    /* (non-Javadoc)
     * @see net.es.nsi.lib.soap.gen.nsi_2_0_r117.connection.provider.ConnectionProviderPort#release(java.lang.String  connectionId ,)net.es.nsi.lib.soap.gen.nsi_2_0_r117.framework.headers.CommonHeaderType  header ,)net.es.nsi.lib.soap.gen.nsi_2_0_r117.framework.headers.CommonHeaderType  header1 )*
     */
    public void release(java.lang.String connectionId,net.es.nsi.lib.soap.gen.nsi_2_0_r117.framework.headers.CommonHeaderType header,javax.xml.ws.Holder<net.es.nsi.lib.soap.gen.nsi_2_0_r117.framework.headers.CommonHeaderType> header1) throws net.es.nsi.lib.soap.gen.nsi_2_0_r117.connection.ifce.ServiceException    { 
        LOG.info("Executing operation release");
        System.out.println(connectionId);
        System.out.println(header);
        try {
            net.es.nsi.lib.soap.gen.nsi_2_0_r117.framework.headers.CommonHeaderType header1Value = null;
            header1.value = header1Value;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
        //throw new net.es.nsi.lib.soap.gen.nsi_2_0_r117.connection.ifce.ServiceException("serviceException...");
    }

    /* (non-Javadoc)
     * @see net.es.nsi.lib.soap.gen.nsi_2_0_r117.connection.provider.ConnectionProviderPort#reserveAbort(java.lang.String  connectionId ,)net.es.nsi.lib.soap.gen.nsi_2_0_r117.framework.headers.CommonHeaderType  header ,)net.es.nsi.lib.soap.gen.nsi_2_0_r117.framework.headers.CommonHeaderType  header1 )*
     */
    public void reserveAbort(java.lang.String connectionId,net.es.nsi.lib.soap.gen.nsi_2_0_r117.framework.headers.CommonHeaderType header,javax.xml.ws.Holder<net.es.nsi.lib.soap.gen.nsi_2_0_r117.framework.headers.CommonHeaderType> header1) throws net.es.nsi.lib.soap.gen.nsi_2_0_r117.connection.ifce.ServiceException    { 
        LOG.info("Executing operation reserveAbort");
        System.out.println(connectionId);
        System.out.println(header);
        try {
            net.es.nsi.lib.soap.gen.nsi_2_0_r117.framework.headers.CommonHeaderType header1Value = null;
            header1.value = header1Value;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
        //throw new net.es.nsi.lib.soap.gen.nsi_2_0_r117.connection.ifce.ServiceException("serviceException...");
    }

    /* (non-Javadoc)
     * @see net.es.nsi.lib.soap.gen.nsi_2_0_r117.connection.provider.ConnectionProviderPort#querySummary(net.es.nsi.lib.soap.gen.nsi_2_0_r117.connection.types.QueryType  querySummary ,)net.es.nsi.lib.soap.gen.nsi_2_0_r117.framework.headers.CommonHeaderType  header )*
     */
    public net.es.nsi.lib.soap.gen.nsi_2_0_r117.connection.types.GenericAcknowledgmentType querySummary(net.es.nsi.lib.soap.gen.nsi_2_0_r117.connection.types.QueryType querySummary,javax.xml.ws.Holder<net.es.nsi.lib.soap.gen.nsi_2_0_r117.framework.headers.CommonHeaderType> header) throws net.es.nsi.lib.soap.gen.nsi_2_0_r117.connection.ifce.ServiceException    { 
        LOG.info("Executing operation querySummary");
        System.out.println(querySummary);
        System.out.println(header.value);
        try {
            net.es.nsi.lib.soap.gen.nsi_2_0_r117.connection.types.GenericAcknowledgmentType _return = null;
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
        //throw new net.es.nsi.lib.soap.gen.nsi_2_0_r117.connection.ifce.ServiceException("serviceException...");
    }

    /* (non-Javadoc)
     * @see net.es.nsi.lib.soap.gen.nsi_2_0_r117.connection.provider.ConnectionProviderPort#queryResult(java.lang.String  connectionId ,)java.lang.Long  startResultId ,)java.lang.Long  endResultId ,)net.es.nsi.lib.soap.gen.nsi_2_0_r117.framework.headers.CommonHeaderType  header ,)net.es.nsi.lib.soap.gen.nsi_2_0_r117.framework.headers.CommonHeaderType  header1 )*
     */
    public void queryResult(java.lang.String connectionId,java.lang.Long startResultId,java.lang.Long endResultId,net.es.nsi.lib.soap.gen.nsi_2_0_r117.framework.headers.CommonHeaderType header,javax.xml.ws.Holder<net.es.nsi.lib.soap.gen.nsi_2_0_r117.framework.headers.CommonHeaderType> header1) throws net.es.nsi.lib.soap.gen.nsi_2_0_r117.connection.ifce.ServiceException    { 
        LOG.info("Executing operation queryResult");
        System.out.println(connectionId);
        System.out.println(startResultId);
        System.out.println(endResultId);
        System.out.println(header);
        try {
            net.es.nsi.lib.soap.gen.nsi_2_0_r117.framework.headers.CommonHeaderType header1Value = null;
            header1.value = header1Value;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
        //throw new net.es.nsi.lib.soap.gen.nsi_2_0_r117.connection.ifce.ServiceException("serviceException...");
    }

    /* (non-Javadoc)
     * @see net.es.nsi.lib.soap.gen.nsi_2_0_r117.connection.provider.ConnectionProviderPort#queryNotificationSync(net.es.nsi.lib.soap.gen.nsi_2_0_r117.connection.types.QueryNotificationType  queryNotificationSync ,)net.es.nsi.lib.soap.gen.nsi_2_0_r117.framework.headers.CommonHeaderType  header )*
     */
    public net.es.nsi.lib.soap.gen.nsi_2_0_r117.connection.types.QueryNotificationConfirmedType queryNotificationSync(net.es.nsi.lib.soap.gen.nsi_2_0_r117.connection.types.QueryNotificationType queryNotificationSync,javax.xml.ws.Holder<net.es.nsi.lib.soap.gen.nsi_2_0_r117.framework.headers.CommonHeaderType> header) throws net.es.nsi.lib.soap.gen.nsi_2_0_r117.connection.ifce.Error    { 
        LOG.info("Executing operation queryNotificationSync");
        System.out.println(queryNotificationSync);
        System.out.println(header.value);
        try {
            net.es.nsi.lib.soap.gen.nsi_2_0_r117.connection.types.QueryNotificationConfirmedType _return = null;
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
        //throw new net.es.nsi.lib.soap.gen.nsi_2_0_r117.connection.ifce.Error("error...");
    }

}
