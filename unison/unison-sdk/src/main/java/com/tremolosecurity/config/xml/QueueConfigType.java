/*******************************************************************************
 * Copyright 2019 Tremolo Security, Inc.
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
// Generated on: 2019.11.16 at 01:31:58 PM EST 
//


package com.tremolosecurity.config.xml;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * Configuration of how Unison will utilize a JMS Queue
 * 			
 * 
 * <p>Java class for queueConfigType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="queueConfigType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="param" type="{http://www.tremolosecurity.com/tremoloConfig}paramType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="isUseInternalQueue" type="{http://www.w3.org/2001/XMLSchema}boolean" default="true" />
 *       &lt;attribute name="maxProducers" type="{http://www.w3.org/2001/XMLSchema}int" default="1" />
 *       &lt;attribute name="connectionFactory" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="maxConsumers" type="{http://www.w3.org/2001/XMLSchema}int" default="1" />
 *       &lt;attribute name="maxSessionsPerConnection" type="{http://www.w3.org/2001/XMLSchema}int" default="10" />
 *       &lt;attribute name="taskQueueName" type="{http://www.w3.org/2001/XMLSchema}string" default="TremoloUnisonTaskQueue" />
 *       &lt;attribute name="smtpQueueName" type="{http://www.w3.org/2001/XMLSchema}string" default="TremoloUnisonSMTPQueue" />
 *       &lt;attribute name="encryptionKeyName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="numQueues" type="{http://www.w3.org/2001/XMLSchema}int" default="1" />
 *       &lt;attribute name="multiTaskQueues" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="keepAliveMillis" type="{http://www.w3.org/2001/XMLSchema}long" default="60000" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "queueConfigType", propOrder = {
    "param"
})
public class QueueConfigType {

    protected List<ParamType> param;
    @XmlAttribute(name = "isUseInternalQueue")
    protected Boolean isUseInternalQueue;
    @XmlAttribute(name = "maxProducers")
    protected Integer maxProducers;
    @XmlAttribute(name = "connectionFactory")
    protected String connectionFactory;
    @XmlAttribute(name = "maxConsumers")
    protected Integer maxConsumers;
    @XmlAttribute(name = "maxSessionsPerConnection")
    protected Integer maxSessionsPerConnection;
    @XmlAttribute(name = "taskQueueName")
    protected String taskQueueName;
    @XmlAttribute(name = "smtpQueueName")
    protected String smtpQueueName;
    @XmlAttribute(name = "encryptionKeyName")
    protected String encryptionKeyName;
    @XmlAttribute(name = "numQueues")
    protected Integer numQueues;
    @XmlAttribute(name = "multiTaskQueues")
    protected Boolean multiTaskQueues;
    @XmlAttribute(name = "keepAliveMillis")
    protected Long keepAliveMillis;

    /**
     * Gets the value of the param property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the param property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getParam().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ParamType }
     * 
     * 
     */
    public List<ParamType> getParam() {
        if (param == null) {
            param = new ArrayList<ParamType>();
        }
        return this.param;
    }

    /**
     * Gets the value of the isUseInternalQueue property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isIsUseInternalQueue() {
        if (isUseInternalQueue == null) {
            return true;
        } else {
            return isUseInternalQueue;
        }
    }

    /**
     * Sets the value of the isUseInternalQueue property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsUseInternalQueue(Boolean value) {
        this.isUseInternalQueue = value;
    }

    /**
     * Gets the value of the maxProducers property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public int getMaxProducers() {
        if (maxProducers == null) {
            return  1;
        } else {
            return maxProducers;
        }
    }

    /**
     * Sets the value of the maxProducers property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMaxProducers(Integer value) {
        this.maxProducers = value;
    }

    /**
     * Gets the value of the connectionFactory property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConnectionFactory() {
        return connectionFactory;
    }

    /**
     * Sets the value of the connectionFactory property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConnectionFactory(String value) {
        this.connectionFactory = value;
    }

    /**
     * Gets the value of the maxConsumers property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public int getMaxConsumers() {
        if (maxConsumers == null) {
            return  1;
        } else {
            return maxConsumers;
        }
    }

    /**
     * Sets the value of the maxConsumers property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMaxConsumers(Integer value) {
        this.maxConsumers = value;
    }

    /**
     * Gets the value of the maxSessionsPerConnection property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public int getMaxSessionsPerConnection() {
        if (maxSessionsPerConnection == null) {
            return  10;
        } else {
            return maxSessionsPerConnection;
        }
    }

    /**
     * Sets the value of the maxSessionsPerConnection property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMaxSessionsPerConnection(Integer value) {
        this.maxSessionsPerConnection = value;
    }

    /**
     * Gets the value of the taskQueueName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaskQueueName() {
        if (taskQueueName == null) {
            return "TremoloUnisonTaskQueue";
        } else {
            return taskQueueName;
        }
    }

    /**
     * Sets the value of the taskQueueName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaskQueueName(String value) {
        this.taskQueueName = value;
    }

    /**
     * Gets the value of the smtpQueueName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSmtpQueueName() {
        if (smtpQueueName == null) {
            return "TremoloUnisonSMTPQueue";
        } else {
            return smtpQueueName;
        }
    }

    /**
     * Sets the value of the smtpQueueName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSmtpQueueName(String value) {
        this.smtpQueueName = value;
    }

    /**
     * Gets the value of the encryptionKeyName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEncryptionKeyName() {
        return encryptionKeyName;
    }

    /**
     * Sets the value of the encryptionKeyName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEncryptionKeyName(String value) {
        this.encryptionKeyName = value;
    }

    /**
     * Gets the value of the numQueues property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public int getNumQueues() {
        if (numQueues == null) {
            return  1;
        } else {
            return numQueues;
        }
    }

    /**
     * Sets the value of the numQueues property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNumQueues(Integer value) {
        this.numQueues = value;
    }

    /**
     * Gets the value of the multiTaskQueues property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isMultiTaskQueues() {
        if (multiTaskQueues == null) {
            return false;
        } else {
            return multiTaskQueues;
        }
    }

    /**
     * Sets the value of the multiTaskQueues property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMultiTaskQueues(Boolean value) {
        this.multiTaskQueues = value;
    }

    /**
     * Gets the value of the keepAliveMillis property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public long getKeepAliveMillis() {
        if (keepAliveMillis == null) {
            return  60000L;
        } else {
            return keepAliveMillis;
        }
    }

    /**
     * Sets the value of the keepAliveMillis property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setKeepAliveMillis(Long value) {
        this.keepAliveMillis = value;
    }

}
