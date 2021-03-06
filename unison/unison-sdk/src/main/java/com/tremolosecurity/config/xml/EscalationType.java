/*******************************************************************************
 * Copyright 2020 Tremolo Security, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *******************************************************************************/
//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.08.17 at 01:43:06 PM EDT 
//


package com.tremolosecurity.config.xml;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * If an approval is not acted on in a certain amount of
 * 				time, an escalation can be used to re-assign the approval
 * 			
 * 
 * <p>Java class for escalationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="escalationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="azRules" type="{http://www.tremolosecurity.com/tremoloConfig}azRulesType"/>
 *       &lt;/sequence>
 *       &lt;attribute name="executeAfterTime" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="validateEscalationClass" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="executeAfterUnits">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;enumeration value="sec"/>
 *             &lt;enumeration value="min"/>
 *             &lt;enumeration value="hr"/>
 *             &lt;enumeration value="wk"/>
 *             &lt;enumeration value="day"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "escalationType", propOrder = {
    "azRules"
})
public class EscalationType {

    @XmlElement(required = true)
    protected AzRulesType azRules;
    @XmlAttribute(name = "executeAfterTime")
    protected Integer executeAfterTime;
    @XmlAttribute(name = "validateEscalationClass")
    protected String validateEscalationClass;
    @XmlAttribute(name = "executeAfterUnits")
    protected String executeAfterUnits;

    /**
     * Gets the value of the azRules property.
     * 
     * @return
     *     possible object is
     *     {@link AzRulesType }
     *     
     */
    public AzRulesType getAzRules() {
        return azRules;
    }

    /**
     * Sets the value of the azRules property.
     * 
     * @param value
     *     allowed object is
     *     {@link AzRulesType }
     *     
     */
    public void setAzRules(AzRulesType value) {
        this.azRules = value;
    }

    /**
     * Gets the value of the executeAfterTime property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getExecuteAfterTime() {
        return executeAfterTime;
    }

    /**
     * Sets the value of the executeAfterTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setExecuteAfterTime(Integer value) {
        this.executeAfterTime = value;
    }

    /**
     * Gets the value of the validateEscalationClass property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValidateEscalationClass() {
        return validateEscalationClass;
    }

    /**
     * Sets the value of the validateEscalationClass property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValidateEscalationClass(String value) {
        this.validateEscalationClass = value;
    }

    /**
     * Gets the value of the executeAfterUnits property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExecuteAfterUnits() {
        return executeAfterUnits;
    }

    /**
     * Sets the value of the executeAfterUnits property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExecuteAfterUnits(String value) {
        this.executeAfterUnits = value;
    }

}
