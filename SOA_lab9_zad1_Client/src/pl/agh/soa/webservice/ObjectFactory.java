
package pl.agh.soa.webservice;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the pl.agh.soa.webservice package. 
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

    private final static QName _OneDayMore_QNAME = new QName("http://webservice.soa.agh.pl/", "oneDayMore");
    private final static QName _ParseException_QNAME = new QName("http://webservice.soa.agh.pl/", "ParseException");
    private final static QName _OneDayMoreResponse_QNAME = new QName("http://webservice.soa.agh.pl/", "oneDayMoreResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: pl.agh.soa.webservice
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link OneDayMoreResponse }
     * 
     */
    public OneDayMoreResponse createOneDayMoreResponse() {
        return new OneDayMoreResponse();
    }

    /**
     * Create an instance of {@link OneDayMore }
     * 
     */
    public OneDayMore createOneDayMore() {
        return new OneDayMore();
    }

    /**
     * Create an instance of {@link ParseException }
     * 
     */
    public ParseException createParseException() {
        return new ParseException();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OneDayMore }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.soa.agh.pl/", name = "oneDayMore")
    public JAXBElement<OneDayMore> createOneDayMore(OneDayMore value) {
        return new JAXBElement<OneDayMore>(_OneDayMore_QNAME, OneDayMore.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ParseException }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.soa.agh.pl/", name = "ParseException")
    public JAXBElement<ParseException> createParseException(ParseException value) {
        return new JAXBElement<ParseException>(_ParseException_QNAME, ParseException.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OneDayMoreResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.soa.agh.pl/", name = "oneDayMoreResponse")
    public JAXBElement<OneDayMoreResponse> createOneDayMoreResponse(OneDayMoreResponse value) {
        return new JAXBElement<OneDayMoreResponse>(_OneDayMoreResponse_QNAME, OneDayMoreResponse.class, null, value);
    }

}
