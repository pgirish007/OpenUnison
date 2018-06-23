//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.06.22 at 10:00:34 PM EDT 
//


package com.tremolosecurity.config.xml;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 				Workflow task for provisioning an account to a target
 * 				type, may not have children
 * 			
 * 
 * <p>Java class for provisionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="provisionType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.tremolosecurity.com/tremoloConfig}workflowTaskType">
 *       &lt;sequence>
 *         &lt;element name="attributes" type="{http://www.tremolosecurity.com/tremoloConfig}listType" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="sync" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="target" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="setPassword" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="onlyPassedInAttributes" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "provisionType", propOrder = {
    "attributes"
})
public class ProvisionType
    extends WorkflowTaskType
{

    protected ListType attributes;
    @XmlAttribute(name = "sync")
    protected Boolean sync;
    @XmlAttribute(name = "target")
    protected String target;
    @XmlAttribute(name = "setPassword")
    protected Boolean setPassword;
    @XmlAttribute(name = "onlyPassedInAttributes")
    protected Boolean onlyPassedInAttributes;

    /**
     * Gets the value of the attributes property.
     * 
     * @return
     *     possible object is
     *     {@link ListType }
     *     
     */
    public ListType getAttributes() {
        return attributes;
    }

    /**
     * Sets the value of the attributes property.
     * 
     * @param value
     *     allowed object is
     *     {@link ListType }
     *     
     */
    public void setAttributes(ListType value) {
        this.attributes = value;
    }

    /**
     * Gets the value of the sync property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSync() {
        return sync;
    }

    /**
     * Sets the value of the sync property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSync(Boolean value) {
        this.sync = value;
    }

    /**
     * Gets the value of the target property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTarget() {
        return target;
    }

    /**
     * Sets the value of the target property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTarget(String value) {
        this.target = value;
    }

    /**
     * Gets the value of the setPassword property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isSetPassword() {
        if (setPassword == null) {
            return false;
        } else {
            return setPassword;
        }
    }

    /**
     * Sets the value of the setPassword property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSetPassword(Boolean value) {
        this.setPassword = value;
    }

    /**
     * Gets the value of the onlyPassedInAttributes property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isOnlyPassedInAttributes() {
        if (onlyPassedInAttributes == null) {
            return false;
        } else {
            return onlyPassedInAttributes;
        }
    }

    /**
     * Sets the value of the onlyPassedInAttributes property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOnlyPassedInAttributes(Boolean value) {
        this.onlyPassedInAttributes = value;
    }

}
