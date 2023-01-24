
package esfera.com;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para volumen complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="volumen"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="radio" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "volumen", propOrder = {
    "radio"
})
public class Volumen {

    protected Double radio;

    /**
     * Obtiene el valor de la propiedad radio.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getRadio() {
        return radio;
    }

    /**
     * Define el valor de la propiedad radio.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setRadio(Double value) {
        this.radio = value;
    }

}
