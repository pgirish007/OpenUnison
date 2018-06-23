//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.06.22 at 10:00:34 PM EDT 
//


package com.tremolosecurity.config.xml;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * List of events and associated results
 * 
 * <p>Java class for resultRefType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="resultRefType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="auSuccess" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="auFail" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="azSuccess" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="azFail" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "resultRefType", propOrder = {
    "auSuccess",
    "auFail",
    "azSuccess",
    "azFail"
})
public class ResultRefType {

    protected String auSuccess;
    protected String auFail;
    protected String azSuccess;
    protected String azFail;

    /**
     * Gets the value of the auSuccess property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuSuccess() {
        return auSuccess;
    }

    /**
     * Sets the value of the auSuccess property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuSuccess(String value) {
        this.auSuccess = value;
    }

    /**
     * Gets the value of the auFail property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuFail() {
        return auFail;
    }

    /**
     * Sets the value of the auFail property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuFail(String value) {
        this.auFail = value;
    }

    /**
     * Gets the value of the azSuccess property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAzSuccess() {
        return azSuccess;
    }

    /**
     * Sets the value of the azSuccess property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAzSuccess(String value) {
        this.azSuccess = value;
    }

    /**
     * Gets the value of the azFail property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAzFail() {
        return azFail;
    }

    /**
     * Sets the value of the azFail property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAzFail(String value) {
        this.azFail = value;
    }

}
