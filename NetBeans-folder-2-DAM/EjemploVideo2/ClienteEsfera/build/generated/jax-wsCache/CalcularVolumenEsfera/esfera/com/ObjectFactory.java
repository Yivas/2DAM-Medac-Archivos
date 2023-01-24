
package esfera.com;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the esfera.com package. 
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

    private final static QName _Volumen_QNAME = new QName("http://com.esfera/", "volumen");
    private final static QName _VolumenResponse_QNAME = new QName("http://com.esfera/", "volumenResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: esfera.com
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Volumen }
     * 
     */
    public Volumen createVolumen() {
        return new Volumen();
    }

    /**
     * Create an instance of {@link VolumenResponse }
     * 
     */
    public VolumenResponse createVolumenResponse() {
        return new VolumenResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Volumen }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://com.esfera/", name = "volumen")
    public JAXBElement<Volumen> createVolumen(Volumen value) {
        return new JAXBElement<Volumen>(_Volumen_QNAME, Volumen.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link VolumenResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://com.esfera/", name = "volumenResponse")
    public JAXBElement<VolumenResponse> createVolumenResponse(VolumenResponse value) {
        return new JAXBElement<VolumenResponse>(_VolumenResponse_QNAME, VolumenResponse.class, null, value);
    }

}
