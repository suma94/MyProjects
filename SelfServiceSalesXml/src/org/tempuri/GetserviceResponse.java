
package org.tempuri;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="getserviceResult" type="{http://tempuri.org/}ArrayOfClass2" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "getserviceResult"
})
@XmlRootElement(name = "getserviceResponse")
public class GetserviceResponse {

    protected ArrayOfClass2 getserviceResult;

    /**
     * Gets the value of the getserviceResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfClass2 }
     *     
     */
    public ArrayOfClass2 getGetserviceResult() {
        return getserviceResult;
    }

    /**
     * Sets the value of the getserviceResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfClass2 }
     *     
     */
    public void setGetserviceResult(ArrayOfClass2 value) {
        this.getserviceResult = value;
    }

}
