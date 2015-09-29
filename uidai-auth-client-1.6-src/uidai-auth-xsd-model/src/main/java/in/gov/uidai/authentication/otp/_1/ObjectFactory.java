//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.09.29 at 03:51:07 PM IST 
//


package in.gov.uidai.authentication.otp._1;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the in.gov.uidai.authentication.otp._1 package. 
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

    private final static QName _Otp_QNAME = new QName("http://www.uidai.gov.in/authentication/otp/1.0", "Otp");
    private final static QName _OtpRes_QNAME = new QName("http://www.uidai.gov.in/authentication/otp/1.0", "OtpRes");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: in.gov.uidai.authentication.otp._1
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Otp }
     * 
     */
    public Otp createOtp() {
        return new Otp();
    }

    /**
     * Create an instance of {@link OtpRes }
     * 
     */
    public OtpRes createOtpRes() {
        return new OtpRes();
    }

    /**
     * Create an instance of {@link Opts }
     * 
     */
    public Opts createOpts() {
        return new Opts();
    }

    /**
     * Create an instance of {@link Tkn }
     * 
     */
    public Tkn createTkn() {
        return new Tkn();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Otp }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.uidai.gov.in/authentication/otp/1.0", name = "Otp")
    public JAXBElement<Otp> createOtp(Otp value) {
        return new JAXBElement<Otp>(_Otp_QNAME, Otp.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OtpRes }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.uidai.gov.in/authentication/otp/1.0", name = "OtpRes")
    public JAXBElement<OtpRes> createOtpRes(OtpRes value) {
        return new JAXBElement<OtpRes>(_OtpRes_QNAME, OtpRes.class, null, value);
    }

}
