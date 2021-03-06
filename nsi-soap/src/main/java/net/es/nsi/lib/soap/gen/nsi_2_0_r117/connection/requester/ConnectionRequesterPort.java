package net.es.nsi.lib.soap.gen.nsi_2_0_r117.connection.requester;

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
 * 2014-08-13T10:04:38.587-07:00
 * Generated source version: 3.0.1
 * 
 */
@WebService(targetNamespace = "http://schemas.ogf.org/nsi/2013/12/connection/requester", name = "ConnectionRequesterPort")
@XmlSeeAlso({net.es.nsi.lib.soap.gen.nsi_2_0_r117.connection.types.ObjectFactory.class, net.es.nsi.lib.soap.gen.nsi_2_0_r117.framework.headers.ObjectFactory.class, net.es.nsi.lib.soap.gen.saml.assertion.ObjectFactory.class, net.es.nsi.lib.soap.gen.xmlenc.ObjectFactory.class, net.es.nsi.lib.soap.gen.nsi_2_0_r117.framework.types.ObjectFactory.class, net.es.nsi.lib.soap.gen.xmldsig.ObjectFactory.class})
public interface ConnectionRequesterPort {

    /**
     * This reserveFailed message is sent from a Provider NSA to
     * Requester NSA as an indication of a reserve failure. This
     * is in response to an original reserve request from the
     * associated Requester NSA.
     *             
     */
    @WebMethod(action = "http://schemas.ogf.org/nsi/2013/12/connection/service/reserveFailed")
    @RequestWrapper(localName = "reserveFailed", targetNamespace = "http://schemas.ogf.org/nsi/2013/12/connection/types", className = "net.es.nsi.lib.soap.gen.nsi_2_0_r117.connection.types.GenericFailedType")
    @ResponseWrapper(localName = "acknowledgment", targetNamespace = "http://schemas.ogf.org/nsi/2013/12/connection/types", className = "net.es.nsi.lib.soap.gen.nsi_2_0_r117.connection.types.GenericAcknowledgmentType")
    public void reserveFailed(
        @WebParam(name = "connectionId", targetNamespace = "")
        java.lang.String connectionId,
        @WebParam(name = "connectionStates", targetNamespace = "")
        net.es.nsi.lib.soap.gen.nsi_2_0_r117.connection.types.ConnectionStatesType connectionStates,
        @WebParam(name = "serviceException", targetNamespace = "")
        net.es.nsi.lib.soap.gen.nsi_2_0_r117.framework.types.ServiceExceptionType serviceException,
        @WebParam(name = "nsiHeader", targetNamespace = "http://schemas.ogf.org/nsi/2013/12/framework/headers", header = true)
        net.es.nsi.lib.soap.gen.nsi_2_0_r117.framework.headers.CommonHeaderType header,
        @WebParam(mode = WebParam.Mode.OUT, name = "nsiHeader", targetNamespace = "http://schemas.ogf.org/nsi/2013/12/framework/headers", header = true)
        javax.xml.ws.Holder<net.es.nsi.lib.soap.gen.nsi_2_0_r117.framework.headers.CommonHeaderType> header1
    ) throws net.es.nsi.lib.soap.gen.nsi_2_0_r117.connection.ifce.ServiceException;

    /**
     * This querySummaryConfirmed message is sent from the target NSA to
     * requesting NSA as an indication of a successful querySummary
     * operation. This is in response to an original querySummary request
     * from the associated Requester NSA.
     *             
     */
    @WebMethod(action = "http://schemas.ogf.org/nsi/2013/12/connection/service/querySummaryConfirmed")
    @RequestWrapper(localName = "querySummaryConfirmed", targetNamespace = "http://schemas.ogf.org/nsi/2013/12/connection/types", className = "net.es.nsi.lib.soap.gen.nsi_2_0_r117.connection.types.QuerySummaryConfirmedType")
    @ResponseWrapper(localName = "acknowledgment", targetNamespace = "http://schemas.ogf.org/nsi/2013/12/connection/types", className = "net.es.nsi.lib.soap.gen.nsi_2_0_r117.connection.types.GenericAcknowledgmentType")
    public void querySummaryConfirmed(
        @WebParam(name = "reservation", targetNamespace = "")
        java.util.List<net.es.nsi.lib.soap.gen.nsi_2_0_r117.connection.types.QuerySummaryResultType> reservation,
        @WebParam(name = "nsiHeader", targetNamespace = "http://schemas.ogf.org/nsi/2013/12/framework/headers", header = true)
        net.es.nsi.lib.soap.gen.nsi_2_0_r117.framework.headers.CommonHeaderType header,
        @WebParam(mode = WebParam.Mode.OUT, name = "nsiHeader", targetNamespace = "http://schemas.ogf.org/nsi/2013/12/framework/headers", header = true)
        javax.xml.ws.Holder<net.es.nsi.lib.soap.gen.nsi_2_0_r117.framework.headers.CommonHeaderType> header1
    ) throws net.es.nsi.lib.soap.gen.nsi_2_0_r117.connection.ifce.ServiceException;

    /**
     * This provisionConfirmed message is sent from a Provider NSA to
     * Requester NSA as an indication of a successful provision operation.
     * This is in response to an original provision request from the
     * associated Requester NSA.
     *             
     */
    @WebMethod(action = "http://schemas.ogf.org/nsi/2013/12/connection/service/provisionConfirmed")
    @RequestWrapper(localName = "provisionConfirmed", targetNamespace = "http://schemas.ogf.org/nsi/2013/12/connection/types", className = "net.es.nsi.lib.soap.gen.nsi_2_0_r117.connection.types.GenericConfirmedType")
    @ResponseWrapper(localName = "acknowledgment", targetNamespace = "http://schemas.ogf.org/nsi/2013/12/connection/types", className = "net.es.nsi.lib.soap.gen.nsi_2_0_r117.connection.types.GenericAcknowledgmentType")
    public void provisionConfirmed(
        @WebParam(name = "connectionId", targetNamespace = "")
        java.lang.String connectionId,
        @WebParam(name = "nsiHeader", targetNamespace = "http://schemas.ogf.org/nsi/2013/12/framework/headers", header = true)
        net.es.nsi.lib.soap.gen.nsi_2_0_r117.framework.headers.CommonHeaderType header,
        @WebParam(mode = WebParam.Mode.OUT, name = "nsiHeader", targetNamespace = "http://schemas.ogf.org/nsi/2013/12/framework/headers", header = true)
        javax.xml.ws.Holder<net.es.nsi.lib.soap.gen.nsi_2_0_r117.framework.headers.CommonHeaderType> header1
    ) throws net.es.nsi.lib.soap.gen.nsi_2_0_r117.connection.ifce.ServiceException;

    /**
     * The error message is sent from a Provider NSA to Requester
     * NSA as an indication of the occurence of an error condition.
     * This  is in response to an original request from the associated
     * Requester NSA.
     *             
     */
    @WebMethod(action = "http://schemas.ogf.org/nsi/2013/12/connection/service/error")
    @RequestWrapper(localName = "error", targetNamespace = "http://schemas.ogf.org/nsi/2013/12/connection/types", className = "net.es.nsi.lib.soap.gen.nsi_2_0_r117.connection.types.GenericErrorType")
    @ResponseWrapper(localName = "acknowledgment", targetNamespace = "http://schemas.ogf.org/nsi/2013/12/connection/types", className = "net.es.nsi.lib.soap.gen.nsi_2_0_r117.connection.types.GenericAcknowledgmentType")
    public void error(
        @WebParam(name = "serviceException", targetNamespace = "")
        net.es.nsi.lib.soap.gen.nsi_2_0_r117.framework.types.ServiceExceptionType serviceException,
        @WebParam(name = "nsiHeader", targetNamespace = "http://schemas.ogf.org/nsi/2013/12/framework/headers", header = true)
        net.es.nsi.lib.soap.gen.nsi_2_0_r117.framework.headers.CommonHeaderType header,
        @WebParam(mode = WebParam.Mode.OUT, name = "nsiHeader", targetNamespace = "http://schemas.ogf.org/nsi/2013/12/framework/headers", header = true)
        javax.xml.ws.Holder<net.es.nsi.lib.soap.gen.nsi_2_0_r117.framework.headers.CommonHeaderType> header1
    ) throws net.es.nsi.lib.soap.gen.nsi_2_0_r117.connection.ifce.ServiceException;

    /**
     * This terminateConfirmed message is sent from a Provider NSA to
     * Requester NSA as an indication of a successful terminate operation.
     * This is in response to an original terminate request from the
     * associated Requester NSA.
     *             
     */
    @WebMethod(action = "http://schemas.ogf.org/nsi/2013/12/connection/service/terminateConfirmed")
    @RequestWrapper(localName = "terminateConfirmed", targetNamespace = "http://schemas.ogf.org/nsi/2013/12/connection/types", className = "net.es.nsi.lib.soap.gen.nsi_2_0_r117.connection.types.GenericConfirmedType")
    @ResponseWrapper(localName = "acknowledgment", targetNamespace = "http://schemas.ogf.org/nsi/2013/12/connection/types", className = "net.es.nsi.lib.soap.gen.nsi_2_0_r117.connection.types.GenericAcknowledgmentType")
    public void terminateConfirmed(
        @WebParam(name = "connectionId", targetNamespace = "")
        java.lang.String connectionId,
        @WebParam(name = "nsiHeader", targetNamespace = "http://schemas.ogf.org/nsi/2013/12/framework/headers", header = true)
        net.es.nsi.lib.soap.gen.nsi_2_0_r117.framework.headers.CommonHeaderType header,
        @WebParam(mode = WebParam.Mode.OUT, name = "nsiHeader", targetNamespace = "http://schemas.ogf.org/nsi/2013/12/framework/headers", header = true)
        javax.xml.ws.Holder<net.es.nsi.lib.soap.gen.nsi_2_0_r117.framework.headers.CommonHeaderType> header1
    ) throws net.es.nsi.lib.soap.gen.nsi_2_0_r117.connection.ifce.ServiceException;

    /**
     * This releaseConfirmed message is sent from a Provider NSA to
     * Requester NSA as an indication of a successful release operation.
     * This is in response to an original release request from the
     * associated Requester NSA.
     *             
     */
    @WebMethod(action = "http://schemas.ogf.org/nsi/2013/12/connection/service/releaseConfirmed")
    @RequestWrapper(localName = "releaseConfirmed", targetNamespace = "http://schemas.ogf.org/nsi/2013/12/connection/types", className = "net.es.nsi.lib.soap.gen.nsi_2_0_r117.connection.types.GenericConfirmedType")
    @ResponseWrapper(localName = "acknowledgment", targetNamespace = "http://schemas.ogf.org/nsi/2013/12/connection/types", className = "net.es.nsi.lib.soap.gen.nsi_2_0_r117.connection.types.GenericAcknowledgmentType")
    public void releaseConfirmed(
        @WebParam(name = "connectionId", targetNamespace = "")
        java.lang.String connectionId,
        @WebParam(name = "nsiHeader", targetNamespace = "http://schemas.ogf.org/nsi/2013/12/framework/headers", header = true)
        net.es.nsi.lib.soap.gen.nsi_2_0_r117.framework.headers.CommonHeaderType header,
        @WebParam(mode = WebParam.Mode.OUT, name = "nsiHeader", targetNamespace = "http://schemas.ogf.org/nsi/2013/12/framework/headers", header = true)
        javax.xml.ws.Holder<net.es.nsi.lib.soap.gen.nsi_2_0_r117.framework.headers.CommonHeaderType> header1
    ) throws net.es.nsi.lib.soap.gen.nsi_2_0_r117.connection.ifce.ServiceException;

    /**
     * An autonomous error message issued from a Provider NSA to Requester
     * NSA.  The acknowledgment indicates that the Requester NSA has
     * accepted the notification request for processing. There are no
     * associated confirmed or failed messages.
     *             
     */
    @WebMethod(action = "http://schemas.ogf.org/nsi/2013/12/connection/service/errorEvent")
    @RequestWrapper(localName = "errorEvent", targetNamespace = "http://schemas.ogf.org/nsi/2013/12/connection/types", className = "net.es.nsi.lib.soap.gen.nsi_2_0_r117.connection.types.ErrorEventType")
    @ResponseWrapper(localName = "acknowledgment", targetNamespace = "http://schemas.ogf.org/nsi/2013/12/connection/types", className = "net.es.nsi.lib.soap.gen.nsi_2_0_r117.connection.types.GenericAcknowledgmentType")
    public void errorEvent(
        @WebParam(name = "connectionId", targetNamespace = "")
        java.lang.String connectionId,
        @WebParam(name = "notificationId", targetNamespace = "")
        long notificationId,
        @WebParam(name = "timeStamp", targetNamespace = "")
        javax.xml.datatype.XMLGregorianCalendar timeStamp,
        @WebParam(name = "event", targetNamespace = "")
        net.es.nsi.lib.soap.gen.nsi_2_0_r117.connection.types.EventEnumType event,
        @WebParam(name = "originatingConnectionId", targetNamespace = "")
        java.lang.String originatingConnectionId,
        @WebParam(name = "originatingNSA", targetNamespace = "")
        java.lang.String originatingNSA,
        @WebParam(name = "additionalInfo", targetNamespace = "")
        net.es.nsi.lib.soap.gen.nsi_2_0_r117.framework.types.TypeValuePairListType additionalInfo,
        @WebParam(name = "serviceException", targetNamespace = "")
        net.es.nsi.lib.soap.gen.nsi_2_0_r117.framework.types.ServiceExceptionType serviceException,
        @WebParam(name = "nsiHeader", targetNamespace = "http://schemas.ogf.org/nsi/2013/12/framework/headers", header = true)
        net.es.nsi.lib.soap.gen.nsi_2_0_r117.framework.headers.CommonHeaderType header,
        @WebParam(mode = WebParam.Mode.OUT, name = "nsiHeader", targetNamespace = "http://schemas.ogf.org/nsi/2013/12/framework/headers", header = true)
        javax.xml.ws.Holder<net.es.nsi.lib.soap.gen.nsi_2_0_r117.framework.headers.CommonHeaderType> header1
    ) throws net.es.nsi.lib.soap.gen.nsi_2_0_r117.connection.ifce.ServiceException;

    /**
     * An autonomous message issued from a Provider NSA to Requester
     * NSA.  The acknowledgment indicates that the Requester NSA has
     * accepted the notification request for processing. There are no
     * associated confirmed or failed messages.
     *             
     */
    @WebMethod(action = "http://schemas.ogf.org/nsi/2013/12/connection/service/dataPlaneStateChange")
    @RequestWrapper(localName = "dataPlaneStateChange", targetNamespace = "http://schemas.ogf.org/nsi/2013/12/connection/types", className = "net.es.nsi.lib.soap.gen.nsi_2_0_r117.connection.types.DataPlaneStateChangeRequestType")
    @ResponseWrapper(localName = "acknowledgment", targetNamespace = "http://schemas.ogf.org/nsi/2013/12/connection/types", className = "net.es.nsi.lib.soap.gen.nsi_2_0_r117.connection.types.GenericAcknowledgmentType")
    public void dataPlaneStateChange(
        @WebParam(name = "connectionId", targetNamespace = "")
        java.lang.String connectionId,
        @WebParam(name = "notificationId", targetNamespace = "")
        long notificationId,
        @WebParam(name = "timeStamp", targetNamespace = "")
        javax.xml.datatype.XMLGregorianCalendar timeStamp,
        @WebParam(name = "dataPlaneStatus", targetNamespace = "")
        net.es.nsi.lib.soap.gen.nsi_2_0_r117.connection.types.DataPlaneStatusType dataPlaneStatus,
        @WebParam(name = "nsiHeader", targetNamespace = "http://schemas.ogf.org/nsi/2013/12/framework/headers", header = true)
        net.es.nsi.lib.soap.gen.nsi_2_0_r117.framework.headers.CommonHeaderType header,
        @WebParam(mode = WebParam.Mode.OUT, name = "nsiHeader", targetNamespace = "http://schemas.ogf.org/nsi/2013/12/framework/headers", header = true)
        javax.xml.ws.Holder<net.es.nsi.lib.soap.gen.nsi_2_0_r117.framework.headers.CommonHeaderType> header1
    ) throws net.es.nsi.lib.soap.gen.nsi_2_0_r117.connection.ifce.ServiceException;

    /**
     * This reserveAbortConfirmed message is sent from a Provider NSA to
     * Requester NSA as an indication of a successful reserveAbort.
     * This is in response to an original reserveAbort request from the
     * associated Requester NSA.
     *             
     */
    @WebMethod(action = "http://schemas.ogf.org/nsi/2013/12/connection/service/reserveAbortConfirmed")
    @RequestWrapper(localName = "reserveAbortConfirmed", targetNamespace = "http://schemas.ogf.org/nsi/2013/12/connection/types", className = "net.es.nsi.lib.soap.gen.nsi_2_0_r117.connection.types.GenericConfirmedType")
    @ResponseWrapper(localName = "acknowledgment", targetNamespace = "http://schemas.ogf.org/nsi/2013/12/connection/types", className = "net.es.nsi.lib.soap.gen.nsi_2_0_r117.connection.types.GenericAcknowledgmentType")
    public void reserveAbortConfirmed(
        @WebParam(name = "connectionId", targetNamespace = "")
        java.lang.String connectionId,
        @WebParam(name = "nsiHeader", targetNamespace = "http://schemas.ogf.org/nsi/2013/12/framework/headers", header = true)
        net.es.nsi.lib.soap.gen.nsi_2_0_r117.framework.headers.CommonHeaderType header,
        @WebParam(mode = WebParam.Mode.OUT, name = "nsiHeader", targetNamespace = "http://schemas.ogf.org/nsi/2013/12/framework/headers", header = true)
        javax.xml.ws.Holder<net.es.nsi.lib.soap.gen.nsi_2_0_r117.framework.headers.CommonHeaderType> header1
    ) throws net.es.nsi.lib.soap.gen.nsi_2_0_r117.connection.ifce.ServiceException;

    /**
     * An autonomous message issued from a Provider NSA to Requester
     * NSA.  The acknowledgment indicates that the Requester NSA has
     * accepted the notification request for processing. There are no
     * associated confirmed or failed messages.
     *             
     */
    @WebMethod(action = "http://schemas.ogf.org/nsi/2013/12/connection/service/messageDeliveryTimeout")
    @RequestWrapper(localName = "messageDeliveryTimeout", targetNamespace = "http://schemas.ogf.org/nsi/2013/12/connection/types", className = "net.es.nsi.lib.soap.gen.nsi_2_0_r117.connection.types.MessageDeliveryTimeoutRequestType")
    @ResponseWrapper(localName = "acknowledgment", targetNamespace = "http://schemas.ogf.org/nsi/2013/12/connection/types", className = "net.es.nsi.lib.soap.gen.nsi_2_0_r117.connection.types.GenericAcknowledgmentType")
    public void messageDeliveryTimeout(
        @WebParam(name = "connectionId", targetNamespace = "")
        java.lang.String connectionId,
        @WebParam(name = "notificationId", targetNamespace = "")
        long notificationId,
        @WebParam(name = "timeStamp", targetNamespace = "")
        javax.xml.datatype.XMLGregorianCalendar timeStamp,
        @WebParam(name = "correlationId", targetNamespace = "")
        java.lang.String correlationId,
        @WebParam(name = "nsiHeader", targetNamespace = "http://schemas.ogf.org/nsi/2013/12/framework/headers", header = true)
        net.es.nsi.lib.soap.gen.nsi_2_0_r117.framework.headers.CommonHeaderType header,
        @WebParam(mode = WebParam.Mode.OUT, name = "nsiHeader", targetNamespace = "http://schemas.ogf.org/nsi/2013/12/framework/headers", header = true)
        javax.xml.ws.Holder<net.es.nsi.lib.soap.gen.nsi_2_0_r117.framework.headers.CommonHeaderType> header1
    ) throws net.es.nsi.lib.soap.gen.nsi_2_0_r117.connection.ifce.ServiceException;

    /**
     * This reserveCommitFailed message is sent from a Provider NSA to
     * Requester NSA as an indication of a modify failure. This
     * is in response to an original modify request from the
     * associated Requester NSA.
     *             
     */
    @WebMethod(action = "http://schemas.ogf.org/nsi/2013/12/connection/service/reserveCommitFailed")
    @RequestWrapper(localName = "reserveCommitFailed", targetNamespace = "http://schemas.ogf.org/nsi/2013/12/connection/types", className = "net.es.nsi.lib.soap.gen.nsi_2_0_r117.connection.types.GenericFailedType")
    @ResponseWrapper(localName = "acknowledgment", targetNamespace = "http://schemas.ogf.org/nsi/2013/12/connection/types", className = "net.es.nsi.lib.soap.gen.nsi_2_0_r117.connection.types.GenericAcknowledgmentType")
    public void reserveCommitFailed(
        @WebParam(name = "connectionId", targetNamespace = "")
        java.lang.String connectionId,
        @WebParam(name = "connectionStates", targetNamespace = "")
        net.es.nsi.lib.soap.gen.nsi_2_0_r117.connection.types.ConnectionStatesType connectionStates,
        @WebParam(name = "serviceException", targetNamespace = "")
        net.es.nsi.lib.soap.gen.nsi_2_0_r117.framework.types.ServiceExceptionType serviceException,
        @WebParam(name = "nsiHeader", targetNamespace = "http://schemas.ogf.org/nsi/2013/12/framework/headers", header = true)
        net.es.nsi.lib.soap.gen.nsi_2_0_r117.framework.headers.CommonHeaderType header,
        @WebParam(mode = WebParam.Mode.OUT, name = "nsiHeader", targetNamespace = "http://schemas.ogf.org/nsi/2013/12/framework/headers", header = true)
        javax.xml.ws.Holder<net.es.nsi.lib.soap.gen.nsi_2_0_r117.framework.headers.CommonHeaderType> header1
    ) throws net.es.nsi.lib.soap.gen.nsi_2_0_r117.connection.ifce.ServiceException;

    /**
     * This queryNotificationConfirmed message is sent from the Provider NSA to
     * Requester NSA as an indication of a successful queryNotification
     * operation. This is in response to an original queryNotification request
     * from the associated Requester NSA.
     *             
     */
    @WebMethod(action = "http://schemas.ogf.org/nsi/2013/12/connection/service/queryNotificationConfirmed")
    @SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
    @WebResult(name = "acknowledgment", targetNamespace = "http://schemas.ogf.org/nsi/2013/12/connection/types", partName = "acknowledgment")
    public net.es.nsi.lib.soap.gen.nsi_2_0_r117.connection.types.GenericAcknowledgmentType queryNotificationConfirmed(
        @WebParam(partName = "queryNotificationConfirmed", name = "queryNotificationConfirmed", targetNamespace = "http://schemas.ogf.org/nsi/2013/12/connection/types")
        net.es.nsi.lib.soap.gen.nsi_2_0_r117.connection.types.QueryNotificationConfirmedType queryNotificationConfirmed,
        @WebParam(partName = "header", mode = WebParam.Mode.INOUT, name = "nsiHeader", targetNamespace = "http://schemas.ogf.org/nsi/2013/12/framework/headers", header = true)
        javax.xml.ws.Holder<net.es.nsi.lib.soap.gen.nsi_2_0_r117.framework.headers.CommonHeaderType> header
    ) throws net.es.nsi.lib.soap.gen.nsi_2_0_r117.connection.ifce.ServiceException;

    /**
     * This queryResultConfirmed message is sent from the Provider NSA to
     * Requester NSA as an indication of a successful queryResult operation.
     * This is in response to an original queryResult request from the
     * associated Requester NSA.
     *             
     */
    @WebMethod(action = "http://schemas.ogf.org/nsi/2013/12/connection/service/queryResultConfirmed")
    @RequestWrapper(localName = "queryResultConfirmed", targetNamespace = "http://schemas.ogf.org/nsi/2013/12/connection/types", className = "net.es.nsi.lib.soap.gen.nsi_2_0_r117.connection.types.QueryResultConfirmedType")
    @ResponseWrapper(localName = "acknowledgment", targetNamespace = "http://schemas.ogf.org/nsi/2013/12/connection/types", className = "net.es.nsi.lib.soap.gen.nsi_2_0_r117.connection.types.GenericAcknowledgmentType")
    public void queryResultConfirmed(
        @WebParam(name = "result", targetNamespace = "")
        java.util.List<net.es.nsi.lib.soap.gen.nsi_2_0_r117.connection.types.QueryResultResponseType> result,
        @WebParam(name = "nsiHeader", targetNamespace = "http://schemas.ogf.org/nsi/2013/12/framework/headers", header = true)
        net.es.nsi.lib.soap.gen.nsi_2_0_r117.framework.headers.CommonHeaderType header,
        @WebParam(mode = WebParam.Mode.OUT, name = "nsiHeader", targetNamespace = "http://schemas.ogf.org/nsi/2013/12/framework/headers", header = true)
        javax.xml.ws.Holder<net.es.nsi.lib.soap.gen.nsi_2_0_r117.framework.headers.CommonHeaderType> header1
    ) throws net.es.nsi.lib.soap.gen.nsi_2_0_r117.connection.ifce.ServiceException;

    /**
     * This reserveCommitConfirmed message is sent from a Provider NSA to
     * Requester NSA as an indication of a successful reserveCommit request.
     * This is in response to an original reserveCommit request from the
     * associated Requester NSA.
     *             
     */
    @WebMethod(action = "http://schemas.ogf.org/nsi/2013/12/connection/service/reserveCommitConfirmed")
    @RequestWrapper(localName = "reserveCommitConfirmed", targetNamespace = "http://schemas.ogf.org/nsi/2013/12/connection/types", className = "net.es.nsi.lib.soap.gen.nsi_2_0_r117.connection.types.GenericConfirmedType")
    @ResponseWrapper(localName = "acknowledgment", targetNamespace = "http://schemas.ogf.org/nsi/2013/12/connection/types", className = "net.es.nsi.lib.soap.gen.nsi_2_0_r117.connection.types.GenericAcknowledgmentType")
    public void reserveCommitConfirmed(
        @WebParam(name = "connectionId", targetNamespace = "")
        java.lang.String connectionId,
        @WebParam(name = "nsiHeader", targetNamespace = "http://schemas.ogf.org/nsi/2013/12/framework/headers", header = true)
        net.es.nsi.lib.soap.gen.nsi_2_0_r117.framework.headers.CommonHeaderType header,
        @WebParam(mode = WebParam.Mode.OUT, name = "nsiHeader", targetNamespace = "http://schemas.ogf.org/nsi/2013/12/framework/headers", header = true)
        javax.xml.ws.Holder<net.es.nsi.lib.soap.gen.nsi_2_0_r117.framework.headers.CommonHeaderType> header1
    ) throws net.es.nsi.lib.soap.gen.nsi_2_0_r117.connection.ifce.ServiceException;

    /**
     * An autonomous message issued from a Provider NSA to Requester
     * NSA.  The acknowledgment indicates that the Requester NSA has
     * accepted the notification request for processing. There are no
     * associated confirmed or failed messages.
     *             
     */
    @WebMethod(action = "http://schemas.ogf.org/nsi/2013/12/connection/service/reserveTimeout")
    @RequestWrapper(localName = "reserveTimeout", targetNamespace = "http://schemas.ogf.org/nsi/2013/12/connection/types", className = "net.es.nsi.lib.soap.gen.nsi_2_0_r117.connection.types.ReserveTimeoutRequestType")
    @ResponseWrapper(localName = "acknowledgment", targetNamespace = "http://schemas.ogf.org/nsi/2013/12/connection/types", className = "net.es.nsi.lib.soap.gen.nsi_2_0_r117.connection.types.GenericAcknowledgmentType")
    public void reserveTimeout(
        @WebParam(name = "connectionId", targetNamespace = "")
        java.lang.String connectionId,
        @WebParam(name = "notificationId", targetNamespace = "")
        long notificationId,
        @WebParam(name = "timeStamp", targetNamespace = "")
        javax.xml.datatype.XMLGregorianCalendar timeStamp,
        @WebParam(name = "timeoutValue", targetNamespace = "")
        int timeoutValue,
        @WebParam(name = "originatingConnectionId", targetNamespace = "")
        java.lang.String originatingConnectionId,
        @WebParam(name = "originatingNSA", targetNamespace = "")
        java.lang.String originatingNSA,
        @WebParam(name = "nsiHeader", targetNamespace = "http://schemas.ogf.org/nsi/2013/12/framework/headers", header = true)
        net.es.nsi.lib.soap.gen.nsi_2_0_r117.framework.headers.CommonHeaderType header,
        @WebParam(mode = WebParam.Mode.OUT, name = "nsiHeader", targetNamespace = "http://schemas.ogf.org/nsi/2013/12/framework/headers", header = true)
        javax.xml.ws.Holder<net.es.nsi.lib.soap.gen.nsi_2_0_r117.framework.headers.CommonHeaderType> header1
    ) throws net.es.nsi.lib.soap.gen.nsi_2_0_r117.connection.ifce.ServiceException;

    /**
     * This reserveConfirmed message is sent from a Provider NSA to
     * Requester NSA as an indication of a successful reservation. This
     * is in response to an original reserve request from the
     * associated Requester NSA.
     *             
     */
    @WebMethod(action = "http://schemas.ogf.org/nsi/2013/12/connection/service/reserveConfirmed")
    @RequestWrapper(localName = "reserveConfirmed", targetNamespace = "http://schemas.ogf.org/nsi/2013/12/connection/types", className = "net.es.nsi.lib.soap.gen.nsi_2_0_r117.connection.types.ReserveConfirmedType")
    @ResponseWrapper(localName = "acknowledgment", targetNamespace = "http://schemas.ogf.org/nsi/2013/12/connection/types", className = "net.es.nsi.lib.soap.gen.nsi_2_0_r117.connection.types.GenericAcknowledgmentType")
    public void reserveConfirmed(
        @WebParam(name = "connectionId", targetNamespace = "")
        java.lang.String connectionId,
        @WebParam(name = "globalReservationId", targetNamespace = "")
        java.lang.String globalReservationId,
        @WebParam(name = "description", targetNamespace = "")
        java.lang.String description,
        @WebParam(name = "criteria", targetNamespace = "")
        net.es.nsi.lib.soap.gen.nsi_2_0_r117.connection.types.ReservationConfirmCriteriaType criteria,
        @WebParam(name = "nsiHeader", targetNamespace = "http://schemas.ogf.org/nsi/2013/12/framework/headers", header = true)
        net.es.nsi.lib.soap.gen.nsi_2_0_r117.framework.headers.CommonHeaderType header,
        @WebParam(mode = WebParam.Mode.OUT, name = "nsiHeader", targetNamespace = "http://schemas.ogf.org/nsi/2013/12/framework/headers", header = true)
        javax.xml.ws.Holder<net.es.nsi.lib.soap.gen.nsi_2_0_r117.framework.headers.CommonHeaderType> header1
    ) throws net.es.nsi.lib.soap.gen.nsi_2_0_r117.connection.ifce.ServiceException;

    /**
     * This queryRecursiveConfirmed message is sent from the Provider NSA to
     * Requester NSA as an indication of a successful queryRecursive
     * operation. This is in response to an original queryRecursive request
     * from the associated Requester NSA.
     *             
     */
    @WebMethod(action = "http://schemas.ogf.org/nsi/2013/12/connection/service/queryRecursiveConfirmed")
    @RequestWrapper(localName = "queryRecursiveConfirmed", targetNamespace = "http://schemas.ogf.org/nsi/2013/12/connection/types", className = "net.es.nsi.lib.soap.gen.nsi_2_0_r117.connection.types.QueryRecursiveConfirmedType")
    @ResponseWrapper(localName = "acknowledgment", targetNamespace = "http://schemas.ogf.org/nsi/2013/12/connection/types", className = "net.es.nsi.lib.soap.gen.nsi_2_0_r117.connection.types.GenericAcknowledgmentType")
    public void queryRecursiveConfirmed(
        @WebParam(name = "reservation", targetNamespace = "")
        java.util.List<net.es.nsi.lib.soap.gen.nsi_2_0_r117.connection.types.QueryRecursiveResultType> reservation,
        @WebParam(name = "nsiHeader", targetNamespace = "http://schemas.ogf.org/nsi/2013/12/framework/headers", header = true)
        net.es.nsi.lib.soap.gen.nsi_2_0_r117.framework.headers.CommonHeaderType header,
        @WebParam(mode = WebParam.Mode.OUT, name = "nsiHeader", targetNamespace = "http://schemas.ogf.org/nsi/2013/12/framework/headers", header = true)
        javax.xml.ws.Holder<net.es.nsi.lib.soap.gen.nsi_2_0_r117.framework.headers.CommonHeaderType> header1
    ) throws net.es.nsi.lib.soap.gen.nsi_2_0_r117.connection.ifce.ServiceException;
}
