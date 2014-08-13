
package net.es.nsi.lib.soap.gen.nsi_2_0_r117.connection.requester;

/**
 * Please modify this class to meet your needs
 * This class is not complete
 */

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
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
 * 2014-08-13T10:04:38.502-07:00
 * Generated source version: 3.0.1
 * 
 */
public final class ConnectionRequesterPort_ConnectionServiceRequesterPort_Client {

    private static final QName SERVICE_NAME = new QName("http://schemas.ogf.org/nsi/2013/12/connection/requester", "ConnectionServiceRequester");

    private ConnectionRequesterPort_ConnectionServiceRequesterPort_Client() {
    }

    public static void main(String args[]) throws java.lang.Exception {
        URL wsdlURL = ConnectionServiceRequester.WSDL_LOCATION;
        if (args.length > 0 && args[0] != null && !"".equals(args[0])) { 
            File wsdlFile = new File(args[0]);
            try {
                if (wsdlFile.exists()) {
                    wsdlURL = wsdlFile.toURI().toURL();
                } else {
                    wsdlURL = new URL(args[0]);
                }
            } catch (MalformedURLException e) {
                e.printStackTrace();
            }
        }
      
        ConnectionServiceRequester ss = new ConnectionServiceRequester(wsdlURL, SERVICE_NAME);
        ConnectionRequesterPort port = ss.getConnectionServiceRequesterPort();  
        
        {
        System.out.println("Invoking reserveFailed...");
        java.lang.String _reserveFailed_connectionId = "";
        net.es.nsi.lib.soap.gen.nsi_2_0_r117.connection.types.ConnectionStatesType _reserveFailed_connectionStates = null;
        net.es.nsi.lib.soap.gen.nsi_2_0_r117.framework.types.ServiceExceptionType _reserveFailed_serviceException = null;
        net.es.nsi.lib.soap.gen.nsi_2_0_r117.framework.headers.CommonHeaderType _reserveFailed_header = null;
        javax.xml.ws.Holder<net.es.nsi.lib.soap.gen.nsi_2_0_r117.framework.headers.CommonHeaderType> _reserveFailed_header1 = new javax.xml.ws.Holder<net.es.nsi.lib.soap.gen.nsi_2_0_r117.framework.headers.CommonHeaderType>();
        try {
            port.reserveFailed(_reserveFailed_connectionId, _reserveFailed_connectionStates, _reserveFailed_serviceException, _reserveFailed_header, _reserveFailed_header1);

            System.out.println("reserveFailed._reserveFailed_header1=" + _reserveFailed_header1.value);
        } catch (net.es.nsi.lib.soap.gen.nsi_2_0_r117.connection.ifce.ServiceException e) { 
            System.out.println("Expected exception: serviceException has occurred.");
            System.out.println(e.toString());
        }
            }
        {
        System.out.println("Invoking querySummaryConfirmed...");
        java.util.List<net.es.nsi.lib.soap.gen.nsi_2_0_r117.connection.types.QuerySummaryResultType> _querySummaryConfirmed_reservation = null;
        net.es.nsi.lib.soap.gen.nsi_2_0_r117.framework.headers.CommonHeaderType _querySummaryConfirmed_header = null;
        javax.xml.ws.Holder<net.es.nsi.lib.soap.gen.nsi_2_0_r117.framework.headers.CommonHeaderType> _querySummaryConfirmed_header1 = new javax.xml.ws.Holder<net.es.nsi.lib.soap.gen.nsi_2_0_r117.framework.headers.CommonHeaderType>();
        try {
            port.querySummaryConfirmed(_querySummaryConfirmed_reservation, _querySummaryConfirmed_header, _querySummaryConfirmed_header1);

            System.out.println("querySummaryConfirmed._querySummaryConfirmed_header1=" + _querySummaryConfirmed_header1.value);
        } catch (net.es.nsi.lib.soap.gen.nsi_2_0_r117.connection.ifce.ServiceException e) { 
            System.out.println("Expected exception: serviceException has occurred.");
            System.out.println(e.toString());
        }
            }
        {
        System.out.println("Invoking provisionConfirmed...");
        java.lang.String _provisionConfirmed_connectionId = "";
        net.es.nsi.lib.soap.gen.nsi_2_0_r117.framework.headers.CommonHeaderType _provisionConfirmed_header = null;
        javax.xml.ws.Holder<net.es.nsi.lib.soap.gen.nsi_2_0_r117.framework.headers.CommonHeaderType> _provisionConfirmed_header1 = new javax.xml.ws.Holder<net.es.nsi.lib.soap.gen.nsi_2_0_r117.framework.headers.CommonHeaderType>();
        try {
            port.provisionConfirmed(_provisionConfirmed_connectionId, _provisionConfirmed_header, _provisionConfirmed_header1);

            System.out.println("provisionConfirmed._provisionConfirmed_header1=" + _provisionConfirmed_header1.value);
        } catch (net.es.nsi.lib.soap.gen.nsi_2_0_r117.connection.ifce.ServiceException e) { 
            System.out.println("Expected exception: serviceException has occurred.");
            System.out.println(e.toString());
        }
            }
        {
        System.out.println("Invoking error...");
        net.es.nsi.lib.soap.gen.nsi_2_0_r117.framework.types.ServiceExceptionType _error_serviceException = null;
        net.es.nsi.lib.soap.gen.nsi_2_0_r117.framework.headers.CommonHeaderType _error_header = null;
        javax.xml.ws.Holder<net.es.nsi.lib.soap.gen.nsi_2_0_r117.framework.headers.CommonHeaderType> _error_header1 = new javax.xml.ws.Holder<net.es.nsi.lib.soap.gen.nsi_2_0_r117.framework.headers.CommonHeaderType>();
        try {
            port.error(_error_serviceException, _error_header, _error_header1);

            System.out.println("error._error_header1=" + _error_header1.value);
        } catch (net.es.nsi.lib.soap.gen.nsi_2_0_r117.connection.ifce.ServiceException e) { 
            System.out.println("Expected exception: serviceException has occurred.");
            System.out.println(e.toString());
        }
            }
        {
        System.out.println("Invoking terminateConfirmed...");
        java.lang.String _terminateConfirmed_connectionId = "";
        net.es.nsi.lib.soap.gen.nsi_2_0_r117.framework.headers.CommonHeaderType _terminateConfirmed_header = null;
        javax.xml.ws.Holder<net.es.nsi.lib.soap.gen.nsi_2_0_r117.framework.headers.CommonHeaderType> _terminateConfirmed_header1 = new javax.xml.ws.Holder<net.es.nsi.lib.soap.gen.nsi_2_0_r117.framework.headers.CommonHeaderType>();
        try {
            port.terminateConfirmed(_terminateConfirmed_connectionId, _terminateConfirmed_header, _terminateConfirmed_header1);

            System.out.println("terminateConfirmed._terminateConfirmed_header1=" + _terminateConfirmed_header1.value);
        } catch (net.es.nsi.lib.soap.gen.nsi_2_0_r117.connection.ifce.ServiceException e) { 
            System.out.println("Expected exception: serviceException has occurred.");
            System.out.println(e.toString());
        }
            }
        {
        System.out.println("Invoking releaseConfirmed...");
        java.lang.String _releaseConfirmed_connectionId = "";
        net.es.nsi.lib.soap.gen.nsi_2_0_r117.framework.headers.CommonHeaderType _releaseConfirmed_header = null;
        javax.xml.ws.Holder<net.es.nsi.lib.soap.gen.nsi_2_0_r117.framework.headers.CommonHeaderType> _releaseConfirmed_header1 = new javax.xml.ws.Holder<net.es.nsi.lib.soap.gen.nsi_2_0_r117.framework.headers.CommonHeaderType>();
        try {
            port.releaseConfirmed(_releaseConfirmed_connectionId, _releaseConfirmed_header, _releaseConfirmed_header1);

            System.out.println("releaseConfirmed._releaseConfirmed_header1=" + _releaseConfirmed_header1.value);
        } catch (net.es.nsi.lib.soap.gen.nsi_2_0_r117.connection.ifce.ServiceException e) { 
            System.out.println("Expected exception: serviceException has occurred.");
            System.out.println(e.toString());
        }
            }
        {
        System.out.println("Invoking errorEvent...");
        java.lang.String _errorEvent_connectionId = "";
        long _errorEvent_notificationId = 0;
        javax.xml.datatype.XMLGregorianCalendar _errorEvent_timeStamp = null;
        net.es.nsi.lib.soap.gen.nsi_2_0_r117.connection.types.EventEnumType _errorEvent_event = null;
        java.lang.String _errorEvent_originatingConnectionId = "";
        java.lang.String _errorEvent_originatingNSA = "";
        net.es.nsi.lib.soap.gen.nsi_2_0_r117.framework.types.TypeValuePairListType _errorEvent_additionalInfo = null;
        net.es.nsi.lib.soap.gen.nsi_2_0_r117.framework.types.ServiceExceptionType _errorEvent_serviceException = null;
        net.es.nsi.lib.soap.gen.nsi_2_0_r117.framework.headers.CommonHeaderType _errorEvent_header = null;
        javax.xml.ws.Holder<net.es.nsi.lib.soap.gen.nsi_2_0_r117.framework.headers.CommonHeaderType> _errorEvent_header1 = new javax.xml.ws.Holder<net.es.nsi.lib.soap.gen.nsi_2_0_r117.framework.headers.CommonHeaderType>();
        try {
            port.errorEvent(_errorEvent_connectionId, _errorEvent_notificationId, _errorEvent_timeStamp, _errorEvent_event, _errorEvent_originatingConnectionId, _errorEvent_originatingNSA, _errorEvent_additionalInfo, _errorEvent_serviceException, _errorEvent_header, _errorEvent_header1);

            System.out.println("errorEvent._errorEvent_header1=" + _errorEvent_header1.value);
        } catch (net.es.nsi.lib.soap.gen.nsi_2_0_r117.connection.ifce.ServiceException e) { 
            System.out.println("Expected exception: serviceException has occurred.");
            System.out.println(e.toString());
        }
            }
        {
        System.out.println("Invoking dataPlaneStateChange...");
        java.lang.String _dataPlaneStateChange_connectionId = "";
        long _dataPlaneStateChange_notificationId = 0;
        javax.xml.datatype.XMLGregorianCalendar _dataPlaneStateChange_timeStamp = null;
        net.es.nsi.lib.soap.gen.nsi_2_0_r117.connection.types.DataPlaneStatusType _dataPlaneStateChange_dataPlaneStatus = null;
        net.es.nsi.lib.soap.gen.nsi_2_0_r117.framework.headers.CommonHeaderType _dataPlaneStateChange_header = null;
        javax.xml.ws.Holder<net.es.nsi.lib.soap.gen.nsi_2_0_r117.framework.headers.CommonHeaderType> _dataPlaneStateChange_header1 = new javax.xml.ws.Holder<net.es.nsi.lib.soap.gen.nsi_2_0_r117.framework.headers.CommonHeaderType>();
        try {
            port.dataPlaneStateChange(_dataPlaneStateChange_connectionId, _dataPlaneStateChange_notificationId, _dataPlaneStateChange_timeStamp, _dataPlaneStateChange_dataPlaneStatus, _dataPlaneStateChange_header, _dataPlaneStateChange_header1);

            System.out.println("dataPlaneStateChange._dataPlaneStateChange_header1=" + _dataPlaneStateChange_header1.value);
        } catch (net.es.nsi.lib.soap.gen.nsi_2_0_r117.connection.ifce.ServiceException e) { 
            System.out.println("Expected exception: serviceException has occurred.");
            System.out.println(e.toString());
        }
            }
        {
        System.out.println("Invoking reserveAbortConfirmed...");
        java.lang.String _reserveAbortConfirmed_connectionId = "";
        net.es.nsi.lib.soap.gen.nsi_2_0_r117.framework.headers.CommonHeaderType _reserveAbortConfirmed_header = null;
        javax.xml.ws.Holder<net.es.nsi.lib.soap.gen.nsi_2_0_r117.framework.headers.CommonHeaderType> _reserveAbortConfirmed_header1 = new javax.xml.ws.Holder<net.es.nsi.lib.soap.gen.nsi_2_0_r117.framework.headers.CommonHeaderType>();
        try {
            port.reserveAbortConfirmed(_reserveAbortConfirmed_connectionId, _reserveAbortConfirmed_header, _reserveAbortConfirmed_header1);

            System.out.println("reserveAbortConfirmed._reserveAbortConfirmed_header1=" + _reserveAbortConfirmed_header1.value);
        } catch (net.es.nsi.lib.soap.gen.nsi_2_0_r117.connection.ifce.ServiceException e) { 
            System.out.println("Expected exception: serviceException has occurred.");
            System.out.println(e.toString());
        }
            }
        {
        System.out.println("Invoking messageDeliveryTimeout...");
        java.lang.String _messageDeliveryTimeout_connectionId = "";
        long _messageDeliveryTimeout_notificationId = 0;
        javax.xml.datatype.XMLGregorianCalendar _messageDeliveryTimeout_timeStamp = null;
        java.lang.String _messageDeliveryTimeout_correlationId = "";
        net.es.nsi.lib.soap.gen.nsi_2_0_r117.framework.headers.CommonHeaderType _messageDeliveryTimeout_header = null;
        javax.xml.ws.Holder<net.es.nsi.lib.soap.gen.nsi_2_0_r117.framework.headers.CommonHeaderType> _messageDeliveryTimeout_header1 = new javax.xml.ws.Holder<net.es.nsi.lib.soap.gen.nsi_2_0_r117.framework.headers.CommonHeaderType>();
        try {
            port.messageDeliveryTimeout(_messageDeliveryTimeout_connectionId, _messageDeliveryTimeout_notificationId, _messageDeliveryTimeout_timeStamp, _messageDeliveryTimeout_correlationId, _messageDeliveryTimeout_header, _messageDeliveryTimeout_header1);

            System.out.println("messageDeliveryTimeout._messageDeliveryTimeout_header1=" + _messageDeliveryTimeout_header1.value);
        } catch (net.es.nsi.lib.soap.gen.nsi_2_0_r117.connection.ifce.ServiceException e) { 
            System.out.println("Expected exception: serviceException has occurred.");
            System.out.println(e.toString());
        }
            }
        {
        System.out.println("Invoking reserveCommitFailed...");
        java.lang.String _reserveCommitFailed_connectionId = "";
        net.es.nsi.lib.soap.gen.nsi_2_0_r117.connection.types.ConnectionStatesType _reserveCommitFailed_connectionStates = null;
        net.es.nsi.lib.soap.gen.nsi_2_0_r117.framework.types.ServiceExceptionType _reserveCommitFailed_serviceException = null;
        net.es.nsi.lib.soap.gen.nsi_2_0_r117.framework.headers.CommonHeaderType _reserveCommitFailed_header = null;
        javax.xml.ws.Holder<net.es.nsi.lib.soap.gen.nsi_2_0_r117.framework.headers.CommonHeaderType> _reserveCommitFailed_header1 = new javax.xml.ws.Holder<net.es.nsi.lib.soap.gen.nsi_2_0_r117.framework.headers.CommonHeaderType>();
        try {
            port.reserveCommitFailed(_reserveCommitFailed_connectionId, _reserveCommitFailed_connectionStates, _reserveCommitFailed_serviceException, _reserveCommitFailed_header, _reserveCommitFailed_header1);

            System.out.println("reserveCommitFailed._reserveCommitFailed_header1=" + _reserveCommitFailed_header1.value);
        } catch (net.es.nsi.lib.soap.gen.nsi_2_0_r117.connection.ifce.ServiceException e) { 
            System.out.println("Expected exception: serviceException has occurred.");
            System.out.println(e.toString());
        }
            }
        {
        System.out.println("Invoking queryNotificationConfirmed...");
        net.es.nsi.lib.soap.gen.nsi_2_0_r117.connection.types.QueryNotificationConfirmedType _queryNotificationConfirmed_queryNotificationConfirmed = null;
        net.es.nsi.lib.soap.gen.nsi_2_0_r117.framework.headers.CommonHeaderType _queryNotificationConfirmed_headerVal = null;
        javax.xml.ws.Holder<net.es.nsi.lib.soap.gen.nsi_2_0_r117.framework.headers.CommonHeaderType> _queryNotificationConfirmed_header = new javax.xml.ws.Holder<net.es.nsi.lib.soap.gen.nsi_2_0_r117.framework.headers.CommonHeaderType>(_queryNotificationConfirmed_headerVal);
        try {
            net.es.nsi.lib.soap.gen.nsi_2_0_r117.connection.types.GenericAcknowledgmentType _queryNotificationConfirmed__return = port.queryNotificationConfirmed(_queryNotificationConfirmed_queryNotificationConfirmed, _queryNotificationConfirmed_header);
            System.out.println("queryNotificationConfirmed.result=" + _queryNotificationConfirmed__return);

            System.out.println("queryNotificationConfirmed._queryNotificationConfirmed_header=" + _queryNotificationConfirmed_header.value);
        } catch (net.es.nsi.lib.soap.gen.nsi_2_0_r117.connection.ifce.ServiceException e) { 
            System.out.println("Expected exception: serviceException has occurred.");
            System.out.println(e.toString());
        }
            }
        {
        System.out.println("Invoking queryResultConfirmed...");
        java.util.List<net.es.nsi.lib.soap.gen.nsi_2_0_r117.connection.types.QueryResultResponseType> _queryResultConfirmed_result = null;
        net.es.nsi.lib.soap.gen.nsi_2_0_r117.framework.headers.CommonHeaderType _queryResultConfirmed_header = null;
        javax.xml.ws.Holder<net.es.nsi.lib.soap.gen.nsi_2_0_r117.framework.headers.CommonHeaderType> _queryResultConfirmed_header1 = new javax.xml.ws.Holder<net.es.nsi.lib.soap.gen.nsi_2_0_r117.framework.headers.CommonHeaderType>();
        try {
            port.queryResultConfirmed(_queryResultConfirmed_result, _queryResultConfirmed_header, _queryResultConfirmed_header1);

            System.out.println("queryResultConfirmed._queryResultConfirmed_header1=" + _queryResultConfirmed_header1.value);
        } catch (net.es.nsi.lib.soap.gen.nsi_2_0_r117.connection.ifce.ServiceException e) { 
            System.out.println("Expected exception: serviceException has occurred.");
            System.out.println(e.toString());
        }
            }
        {
        System.out.println("Invoking reserveCommitConfirmed...");
        java.lang.String _reserveCommitConfirmed_connectionId = "";
        net.es.nsi.lib.soap.gen.nsi_2_0_r117.framework.headers.CommonHeaderType _reserveCommitConfirmed_header = null;
        javax.xml.ws.Holder<net.es.nsi.lib.soap.gen.nsi_2_0_r117.framework.headers.CommonHeaderType> _reserveCommitConfirmed_header1 = new javax.xml.ws.Holder<net.es.nsi.lib.soap.gen.nsi_2_0_r117.framework.headers.CommonHeaderType>();
        try {
            port.reserveCommitConfirmed(_reserveCommitConfirmed_connectionId, _reserveCommitConfirmed_header, _reserveCommitConfirmed_header1);

            System.out.println("reserveCommitConfirmed._reserveCommitConfirmed_header1=" + _reserveCommitConfirmed_header1.value);
        } catch (net.es.nsi.lib.soap.gen.nsi_2_0_r117.connection.ifce.ServiceException e) { 
            System.out.println("Expected exception: serviceException has occurred.");
            System.out.println(e.toString());
        }
            }
        {
        System.out.println("Invoking reserveTimeout...");
        java.lang.String _reserveTimeout_connectionId = "";
        long _reserveTimeout_notificationId = 0;
        javax.xml.datatype.XMLGregorianCalendar _reserveTimeout_timeStamp = null;
        int _reserveTimeout_timeoutValue = 0;
        java.lang.String _reserveTimeout_originatingConnectionId = "";
        java.lang.String _reserveTimeout_originatingNSA = "";
        net.es.nsi.lib.soap.gen.nsi_2_0_r117.framework.headers.CommonHeaderType _reserveTimeout_header = null;
        javax.xml.ws.Holder<net.es.nsi.lib.soap.gen.nsi_2_0_r117.framework.headers.CommonHeaderType> _reserveTimeout_header1 = new javax.xml.ws.Holder<net.es.nsi.lib.soap.gen.nsi_2_0_r117.framework.headers.CommonHeaderType>();
        try {
            port.reserveTimeout(_reserveTimeout_connectionId, _reserveTimeout_notificationId, _reserveTimeout_timeStamp, _reserveTimeout_timeoutValue, _reserveTimeout_originatingConnectionId, _reserveTimeout_originatingNSA, _reserveTimeout_header, _reserveTimeout_header1);

            System.out.println("reserveTimeout._reserveTimeout_header1=" + _reserveTimeout_header1.value);
        } catch (net.es.nsi.lib.soap.gen.nsi_2_0_r117.connection.ifce.ServiceException e) { 
            System.out.println("Expected exception: serviceException has occurred.");
            System.out.println(e.toString());
        }
            }
        {
        System.out.println("Invoking reserveConfirmed...");
        java.lang.String _reserveConfirmed_connectionId = "";
        java.lang.String _reserveConfirmed_globalReservationId = "";
        java.lang.String _reserveConfirmed_description = "";
        net.es.nsi.lib.soap.gen.nsi_2_0_r117.connection.types.ReservationConfirmCriteriaType _reserveConfirmed_criteria = null;
        net.es.nsi.lib.soap.gen.nsi_2_0_r117.framework.headers.CommonHeaderType _reserveConfirmed_header = null;
        javax.xml.ws.Holder<net.es.nsi.lib.soap.gen.nsi_2_0_r117.framework.headers.CommonHeaderType> _reserveConfirmed_header1 = new javax.xml.ws.Holder<net.es.nsi.lib.soap.gen.nsi_2_0_r117.framework.headers.CommonHeaderType>();
        try {
            port.reserveConfirmed(_reserveConfirmed_connectionId, _reserveConfirmed_globalReservationId, _reserveConfirmed_description, _reserveConfirmed_criteria, _reserveConfirmed_header, _reserveConfirmed_header1);

            System.out.println("reserveConfirmed._reserveConfirmed_header1=" + _reserveConfirmed_header1.value);
        } catch (net.es.nsi.lib.soap.gen.nsi_2_0_r117.connection.ifce.ServiceException e) { 
            System.out.println("Expected exception: serviceException has occurred.");
            System.out.println(e.toString());
        }
            }
        {
        System.out.println("Invoking queryRecursiveConfirmed...");
        java.util.List<net.es.nsi.lib.soap.gen.nsi_2_0_r117.connection.types.QueryRecursiveResultType> _queryRecursiveConfirmed_reservation = null;
        net.es.nsi.lib.soap.gen.nsi_2_0_r117.framework.headers.CommonHeaderType _queryRecursiveConfirmed_header = null;
        javax.xml.ws.Holder<net.es.nsi.lib.soap.gen.nsi_2_0_r117.framework.headers.CommonHeaderType> _queryRecursiveConfirmed_header1 = new javax.xml.ws.Holder<net.es.nsi.lib.soap.gen.nsi_2_0_r117.framework.headers.CommonHeaderType>();
        try {
            port.queryRecursiveConfirmed(_queryRecursiveConfirmed_reservation, _queryRecursiveConfirmed_header, _queryRecursiveConfirmed_header1);

            System.out.println("queryRecursiveConfirmed._queryRecursiveConfirmed_header1=" + _queryRecursiveConfirmed_header1.value);
        } catch (net.es.nsi.lib.soap.gen.nsi_2_0_r117.connection.ifce.ServiceException e) { 
            System.out.println("Expected exception: serviceException has occurred.");
            System.out.println(e.toString());
        }
            }

        System.exit(0);
    }

}
