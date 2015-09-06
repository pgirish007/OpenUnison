//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.09.05 at 08:30:41 PM EDT 
//


package com.tremolosecurity.config.xml;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for escalationPolicyType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="escalationPolicyType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="escalationFailure" type="{http://www.tremolosecurity.com/tremoloConfig}escalationFailureType"/>
 *         &lt;element name="escalation" type="{http://www.tremolosecurity.com/tremoloConfig}escalationType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "escalationPolicyType", propOrder = {
    "escalationFailure",
    "escalation"
})
public class EscalationPolicyType {

    @XmlElement(required = true)
    protected EscalationFailureType escalationFailure;
    protected List<EscalationType> escalation;

    /**
     * Gets the value of the escalationFailure property.
     * 
     * @return
     *     possible object is
     *     {@link EscalationFailureType }
     *     
     */
    public EscalationFailureType getEscalationFailure() {
        return escalationFailure;
    }

    /**
     * Sets the value of the escalationFailure property.
     * 
     * @param value
     *     allowed object is
     *     {@link EscalationFailureType }
     *     
     */
    public void setEscalationFailure(EscalationFailureType value) {
        this.escalationFailure = value;
    }

    /**
     * Gets the value of the escalation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the escalation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEscalation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EscalationType }
     * 
     * 
     */
    public List<EscalationType> getEscalation() {
        if (escalation == null) {
            escalation = new ArrayList<EscalationType>();
        }
        return this.escalation;
    }

}
