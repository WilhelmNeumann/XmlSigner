
package com.integriks.smev.nwxRewrite.client.src.serverApi.autogenerated.types.fault;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;
import com.integriks.smev.nwxRewrite.client.src.serverApi.autogenerated.types.basic.SmevFault;
import com.integriks.smev.nwxRewrite.client.src.serverApi.autogenerated.types.basic.Void;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.integriks.smev.nwxRewrite.client.src.serverApi.autogenerated.types.fault package.
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _BusinessDataTypeIsNotSupported_QNAME = new QName("urn://x-artefacts-smev-gov-ru/services/message-exchange/types/faults/1.1", "BusinessDataTypeIsNotSupported");
    private final static QName _InvalidMessageIdFormat_QNAME = new QName("urn://x-artefacts-smev-gov-ru/services/message-exchange/types/faults/1.1", "InvalidMessageIdFormat");
    private final static QName _MessageIsAlreadySent_QNAME = new QName("urn://x-artefacts-smev-gov-ru/services/message-exchange/types/faults/1.1", "MessageIsAlreadySent");
    private final static QName _RecipientIsNotFound_QNAME = new QName("urn://x-artefacts-smev-gov-ru/services/message-exchange/types/faults/1.1", "RecipientIsNotFound");
    private final static QName _DestinationOverflow_QNAME = new QName("urn://x-artefacts-smev-gov-ru/services/message-exchange/types/faults/1.1", "DestinationOverflow");
    private final static QName _AttachmentSizeLimitExceeded_QNAME = new QName("urn://x-artefacts-smev-gov-ru/services/message-exchange/types/faults/1.1", "AttachmentSizeLimitExceeded");
    private final static QName _SMEVFailure_QNAME = new QName("urn://x-artefacts-smev-gov-ru/services/message-exchange/types/faults/1.1", "SMEVFailure");
    private final static QName _SenderIsNotRegistered_QNAME = new QName("urn://x-artefacts-smev-gov-ru/services/message-exchange/types/faults/1.1", "SenderIsNotRegistered");
    private final static QName _QuoteLimitExceeded_QNAME = new QName("urn://x-artefacts-smev-gov-ru/services/message-exchange/types/faults/1.1", "QuoteLimitExceeded");
    private final static QName _SignatureVerificationFault_QNAME = new QName("urn://x-artefacts-smev-gov-ru/services/message-exchange/types/faults/1.1", "SignatureVerificationFault");
    private final static QName _EndOfLifeReached_QNAME = new QName("urn://x-artefacts-smev-gov-ru/services/message-exchange/types/faults/1.1", "EndOfLifeReached");
    private final static QName _AccessDenied_QNAME = new QName("urn://x-artefacts-smev-gov-ru/services/message-exchange/types/faults/1.1", "AccessDenied");
    private final static QName _IncorrectResponseContentType_QNAME = new QName("urn://x-artefacts-smev-gov-ru/services/message-exchange/types/faults/1.1", "IncorrectResponseContentType");
    private final static QName _RequestIsNotFound_QNAME = new QName("urn://x-artefacts-smev-gov-ru/services/message-exchange/types/faults/1.1", "RequestIsNotFound");
    private final static QName _StaleMessageId_QNAME = new QName("urn://x-artefacts-smev-gov-ru/services/message-exchange/types/faults/1.1", "StaleMessageId");
    private final static QName _TargetMessageIsNotFound_QNAME = new QName("urn://x-artefacts-smev-gov-ru/services/message-exchange/types/faults/1.1", "TargetMessageIsNotFound");
    private final static QName _TransactionCodeInvalid_QNAME = new QName("urn://x-artefacts-smev-gov-ru/services/message-exchange/types/faults/1.1", "TransactionCodeInvalid");
    private final static QName _AttachmentContentMiscoordination_QNAME = new QName("urn://x-artefacts-smev-gov-ru/services/message-exchange/types/faults/1.1", "AttachmentContentMiscoordination");
    private final static QName _InvalidContent_QNAME = new QName("urn://x-artefacts-smev-gov-ru/services/message-exchange/types/faults/1.1", "InvalidContent");
    private final static QName _UnknownMessageType_QNAME = new QName("urn://x-artefacts-smev-gov-ru/services/message-exchange/types/faults/1.1", "UnknownMessageType");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.integriks.smev.nwxRewrite.client.src.serverApi.autogenerated.types.fault
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link InvalidContent }
     * 
     */
    public InvalidContent createInvalidContent() {
        return new InvalidContent();
    }

    /**
     * Create an instance of {@link SignatureVerificationFault }
     * 
     */
    public SignatureVerificationFault createSignatureVerificationFault() {
        return new SignatureVerificationFault();
    }

    /**
     * Create an instance of {@link DestinationOverflow }
     * 
     */
    public DestinationOverflow createDestinationOverflow() {
        return new DestinationOverflow();
    }

    /**
     * Create an instance of {@link QuoteLimitExceeded }
     * 
     */
    public QuoteLimitExceeded createQuoteLimitExceeded() {
        return new QuoteLimitExceeded();
    }

    /**
     * Create an instance of {@link AttachmentSizeLimitExceeded }
     * 
     */
    public AttachmentSizeLimitExceeded createAttachmentSizeLimitExceeded() {
        return new AttachmentSizeLimitExceeded();
    }

    /**
     * Create an instance of {@link BusinessDataTypeIsNotSupported }
     * 
     */
    public BusinessDataTypeIsNotSupported createBusinessDataTypeIsNotSupported() {
        return new BusinessDataTypeIsNotSupported();
    }

    /**
     * Create an instance of {@link InvalidContent.ValidationError }
     * 
     */
    public InvalidContent.ValidationError createInvalidContentValidationError() {
        return new InvalidContent.ValidationError();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BusinessDataTypeIsNotSupported }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn://x-artefacts-smev-gov-ru/services/message-exchange/types/faults/1.1", name = "BusinessDataTypeIsNotSupported")
    public JAXBElement<BusinessDataTypeIsNotSupported> createBusinessDataTypeIsNotSupported(BusinessDataTypeIsNotSupported value) {
        return new JAXBElement<BusinessDataTypeIsNotSupported>(_BusinessDataTypeIsNotSupported_QNAME, BusinessDataTypeIsNotSupported.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Void }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn://x-artefacts-smev-gov-ru/services/message-exchange/types/faults/1.1", name = "InvalidMessageIdFormat")
    public JAXBElement<Void> createInvalidMessageIdFormat(Void value) {
        return new JAXBElement<Void>(_InvalidMessageIdFormat_QNAME, Void.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Void }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn://x-artefacts-smev-gov-ru/services/message-exchange/types/faults/1.1", name = "MessageIsAlreadySent")
    public JAXBElement<Void> createMessageIsAlreadySent(Void value) {
        return new JAXBElement<Void>(_MessageIsAlreadySent_QNAME, Void.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Void }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn://x-artefacts-smev-gov-ru/services/message-exchange/types/faults/1.1", name = "RecipientIsNotFound")
    public JAXBElement<Void> createRecipientIsNotFound(Void value) {
        return new JAXBElement<Void>(_RecipientIsNotFound_QNAME, Void.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DestinationOverflow }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn://x-artefacts-smev-gov-ru/services/message-exchange/types/faults/1.1", name = "DestinationOverflow")
    public JAXBElement<DestinationOverflow> createDestinationOverflow(DestinationOverflow value) {
        return new JAXBElement<DestinationOverflow>(_DestinationOverflow_QNAME, DestinationOverflow.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AttachmentSizeLimitExceeded }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn://x-artefacts-smev-gov-ru/services/message-exchange/types/faults/1.1", name = "AttachmentSizeLimitExceeded")
    public JAXBElement<AttachmentSizeLimitExceeded> createAttachmentSizeLimitExceeded(AttachmentSizeLimitExceeded value) {
        return new JAXBElement<AttachmentSizeLimitExceeded>(_AttachmentSizeLimitExceeded_QNAME, AttachmentSizeLimitExceeded.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Void }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn://x-artefacts-smev-gov-ru/services/message-exchange/types/faults/1.1", name = "SMEVFailure")
    public JAXBElement<Void> createSMEVFailure(Void value) {
        return new JAXBElement<Void>(_SMEVFailure_QNAME, Void.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Void }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn://x-artefacts-smev-gov-ru/services/message-exchange/types/faults/1.1", name = "SenderIsNotRegistered")
    public JAXBElement<Void> createSenderIsNotRegistered(Void value) {
        return new JAXBElement<Void>(_SenderIsNotRegistered_QNAME, Void.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QuoteLimitExceeded }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn://x-artefacts-smev-gov-ru/services/message-exchange/types/faults/1.1", name = "QuoteLimitExceeded")
    public JAXBElement<QuoteLimitExceeded> createQuoteLimitExceeded(QuoteLimitExceeded value) {
        return new JAXBElement<QuoteLimitExceeded>(_QuoteLimitExceeded_QNAME, QuoteLimitExceeded.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SignatureVerificationFault }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn://x-artefacts-smev-gov-ru/services/message-exchange/types/faults/1.1", name = "SignatureVerificationFault")
    public JAXBElement<SignatureVerificationFault> createSignatureVerificationFault(SignatureVerificationFault value) {
        return new JAXBElement<SignatureVerificationFault>(_SignatureVerificationFault_QNAME, SignatureVerificationFault.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Void }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn://x-artefacts-smev-gov-ru/services/message-exchange/types/faults/1.1", name = "EndOfLifeReached")
    public JAXBElement<Void> createEndOfLifeReached(Void value) {
        return new JAXBElement<Void>(_EndOfLifeReached_QNAME, Void.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Void }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn://x-artefacts-smev-gov-ru/services/message-exchange/types/faults/1.1", name = "AccessDenied")
    public JAXBElement<Void> createAccessDenied(Void value) {
        return new JAXBElement<Void>(_AccessDenied_QNAME, Void.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Void }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn://x-artefacts-smev-gov-ru/services/message-exchange/types/faults/1.1", name = "IncorrectResponseContentType")
    public JAXBElement<Void> createIncorrectResponseContentType(Void value) {
        return new JAXBElement<Void>(_IncorrectResponseContentType_QNAME, Void.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Void }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn://x-artefacts-smev-gov-ru/services/message-exchange/types/faults/1.1", name = "RequestIsNotFound")
    public JAXBElement<Void> createRequestIsNotFound(Void value) {
        return new JAXBElement<Void>(_RequestIsNotFound_QNAME, Void.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Void }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn://x-artefacts-smev-gov-ru/services/message-exchange/types/faults/1.1", name = "StaleMessageId")
    public JAXBElement<Void> createStaleMessageId(Void value) {
        return new JAXBElement<Void>(_StaleMessageId_QNAME, Void.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Void }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn://x-artefacts-smev-gov-ru/services/message-exchange/types/faults/1.1", name = "TargetMessageIsNotFound")
    public JAXBElement<Void> createTargetMessageIsNotFound(Void value) {
        return new JAXBElement<Void>(_TargetMessageIsNotFound_QNAME, Void.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SmevFault }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn://x-artefacts-smev-gov-ru/services/message-exchange/types/faults/1.1", name = "TransactionCodeInvalid")
    public JAXBElement<SmevFault> createTransactionCodeInvalid(SmevFault value) {
        return new JAXBElement<SmevFault>(_TransactionCodeInvalid_QNAME, SmevFault.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Void }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn://x-artefacts-smev-gov-ru/services/message-exchange/types/faults/1.1", name = "AttachmentContentMiscoordination")
    public JAXBElement<Void> createAttachmentContentMiscoordination(Void value) {
        return new JAXBElement<Void>(_AttachmentContentMiscoordination_QNAME, Void.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InvalidContent }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn://x-artefacts-smev-gov-ru/services/message-exchange/types/faults/1.1", name = "InvalidContent")
    public JAXBElement<InvalidContent> createInvalidContent(InvalidContent value) {
        return new JAXBElement<InvalidContent>(_InvalidContent_QNAME, InvalidContent.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Void }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn://x-artefacts-smev-gov-ru/services/message-exchange/types/faults/1.1", name = "UnknownMessageType")
    public JAXBElement<Void> createUnknownMessageType(Void value) {
        return new JAXBElement<Void>(_UnknownMessageType_QNAME, Void.class, null, value);
    }

}
