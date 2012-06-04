//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.5-b10 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.05.30 at 03:11:16 PM CEST 
//


package com.telefonica.schemas.unica.rest.mms.v1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.telefonica.schemas.unica.rest.common.v1.SimpleReferenceType;
import com.telefonica.schemas.unica.rest.common.v1.UserIdType;


/**
 * <p>Java class for MessageNotificationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MessageNotificationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="reference" type="{http://www.telefonica.com/schemas/UNICA/REST/common/v1}SimpleReferenceType"/>
 *         &lt;element name="destinationAddress" type="{http://www.telefonica.com/schemas/UNICA/REST/common/v1}UserIdType" maxOccurs="unbounded"/>
 *         &lt;element name="criteria" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="useAttachmentURLs" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MessageNotificationType", propOrder = {
    "reference",
    "destinationAddress",
    "criteria",
    "useAttachmentURLs"
})
public class MessageNotificationType {

    @XmlElement(required = true)
    protected SimpleReferenceType reference;
    @XmlElement(required = true)
    protected List<UserIdType> destinationAddress;
    protected String criteria;
    protected Boolean useAttachmentURLs;

    /**
     * Gets the value of the reference property.
     * 
     * @return
     *     possible object is
     *     {@link SimpleReferenceType }
     *     
     */
    public SimpleReferenceType getReference() {
        return reference;
    }

    /**
     * Sets the value of the reference property.
     * 
     * @param value
     *     allowed object is
     *     {@link SimpleReferenceType }
     *     
     */
    public void setReference(SimpleReferenceType value) {
        this.reference = value;
    }

    /**
     * Gets the value of the destinationAddress property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the destinationAddress property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDestinationAddress().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link UserIdType }
     * 
     * 
     */
    public List<UserIdType> getDestinationAddress() {
        if (destinationAddress == null) {
            destinationAddress = new ArrayList<UserIdType>();
        }
        return this.destinationAddress;
    }

    /**
     * Gets the value of the criteria property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCriteria() {
        return criteria;
    }

    /**
     * Sets the value of the criteria property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCriteria(String value) {
        this.criteria = value;
    }

    /**
     * Gets the value of the useAttachmentURLs property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUseAttachmentURLs() {
        return useAttachmentURLs;
    }

    /**
     * Sets the value of the useAttachmentURLs property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUseAttachmentURLs(Boolean value) {
        this.useAttachmentURLs = value;
    }

    /**
     * Sets the value of the destinationAddress property.
     * 
     * @param destinationAddress
     *     allowed object is
     *     {@link UserIdType }
     *     
     */
    public void setDestinationAddress(List<UserIdType> destinationAddress) {
        this.destinationAddress = destinationAddress;
    }

}
