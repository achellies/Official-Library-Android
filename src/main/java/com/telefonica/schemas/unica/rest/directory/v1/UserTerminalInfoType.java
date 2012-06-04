//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.5-b10 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.05.30 at 03:11:16 PM CEST 
//


package com.telefonica.schemas.unica.rest.directory.v1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import com.telefonica.schemas.unica.rest.common.v1.ExtensionType;
import com.telefonica.schemas.unica.rest.common.v1.FlagType;
import org.w3c.dom.Element;


/**
 * <p>Java class for UserTerminalInfoType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UserTerminalInfoType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="brand" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="model" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="version" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="screenResolution" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="imei" type="{http://www.telefonica.com/schemas/UNICA/REST/common/v1}ImeiType" minOccurs="0"/>
 *         &lt;element name="mms" type="{http://www.telefonica.com/schemas/UNICA/REST/common/v1}FlagType" minOccurs="0"/>
 *         &lt;element name="ems" type="{http://www.telefonica.com/schemas/UNICA/REST/common/v1}FlagType" minOccurs="0"/>
 *         &lt;element name="smartMessaging" type="{http://www.telefonica.com/schemas/UNICA/REST/common/v1}FlagType" minOccurs="0"/>
 *         &lt;element name="wap" type="{http://www.telefonica.com/schemas/UNICA/REST/common/v1}FlagType" minOccurs="0"/>
 *         &lt;element name="ussdPhase" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="syncMl" type="{http://www.telefonica.com/schemas/UNICA/REST/common/v1}FlagType" minOccurs="0"/>
 *         &lt;element name="syncMlVersion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="emsMaxNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="email" type="{http://www.telefonica.com/schemas/UNICA/REST/common/v1}FlagType" minOccurs="0"/>
 *         &lt;element name="emn" type="{http://www.telefonica.com/schemas/UNICA/REST/common/v1}FlagType" minOccurs="0"/>
 *         &lt;element name="adc_OTA" type="{http://www.telefonica.com/schemas/UNICA/REST/common/v1}FlagType" minOccurs="0"/>
 *         &lt;element name="status" type="{http://www.telefonica.com/schemas/UNICA/REST/directory/v1/}StatusType" minOccurs="0"/>
 *         &lt;element name="lastUpdated" type="{http://www.telefonica.com/schemas/UNICA/REST/common/v1}TimestampType" minOccurs="0"/>
 *         &lt;element name="extension" type="{http://www.telefonica.com/schemas/UNICA/REST/common/v1}ExtensionType" minOccurs="0"/>
 *         &lt;any processContents='lax' namespace='##other' maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="wapPush" type="{http://www.telefonica.com/schemas/UNICA/REST/common/v1}FlagType" minOccurs="0"/>
 *         &lt;element name="mmsVideo" type="{http://www.telefonica.com/schemas/UNICA/REST/common/v1}FlagType" minOccurs="0"/>
 *         &lt;element name="videoStreaming" type="{http://www.telefonica.com/schemas/UNICA/REST/common/v1}FlagType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UserTerminalInfoType", propOrder = {
    "brand",
    "model",
    "version",
    "screenResolution",
    "imei",
    "mms",
    "ems",
    "smartMessaging",
    "wap",
    "ussdPhase",
    "syncMl",
    "syncMlVersion",
    "emsMaxNumber",
    "email",
    "emn",
    "adcOTA",
    "status",
    "lastUpdated",
    "extension",
    "any",
    "wapPush",
    "mmsVideo",
    "videoStreaming"
})
public class UserTerminalInfoType {

    @XmlElementRef(name = "brand", namespace = "http://www.telefonica.com/schemas/UNICA/REST/directory/v1/", type = JAXBElement.class)
    protected JAXBElement<String> brand;
    @XmlElementRef(name = "model", namespace = "http://www.telefonica.com/schemas/UNICA/REST/directory/v1/", type = JAXBElement.class)
    protected JAXBElement<String> model;
    @XmlElementRef(name = "version", namespace = "http://www.telefonica.com/schemas/UNICA/REST/directory/v1/", type = JAXBElement.class)
    protected JAXBElement<String> version;
    @XmlElementRef(name = "screenResolution", namespace = "http://www.telefonica.com/schemas/UNICA/REST/directory/v1/", type = JAXBElement.class)
    protected JAXBElement<String> screenResolution;
    @XmlElementRef(name = "imei", namespace = "http://www.telefonica.com/schemas/UNICA/REST/directory/v1/", type = JAXBElement.class)
    protected JAXBElement<String> imei;
    @XmlElementRef(name = "mms", namespace = "http://www.telefonica.com/schemas/UNICA/REST/directory/v1/", type = JAXBElement.class)
    protected JAXBElement<FlagType> mms;
    @XmlElementRef(name = "ems", namespace = "http://www.telefonica.com/schemas/UNICA/REST/directory/v1/", type = JAXBElement.class)
    protected JAXBElement<FlagType> ems;
    @XmlElementRef(name = "smartMessaging", namespace = "http://www.telefonica.com/schemas/UNICA/REST/directory/v1/", type = JAXBElement.class)
    protected JAXBElement<FlagType> smartMessaging;
    @XmlElementRef(name = "wap", namespace = "http://www.telefonica.com/schemas/UNICA/REST/directory/v1/", type = JAXBElement.class)
    protected JAXBElement<FlagType> wap;
    @XmlElementRef(name = "ussdPhase", namespace = "http://www.telefonica.com/schemas/UNICA/REST/directory/v1/", type = JAXBElement.class)
    protected JAXBElement<String> ussdPhase;
    @XmlElementRef(name = "syncMl", namespace = "http://www.telefonica.com/schemas/UNICA/REST/directory/v1/", type = JAXBElement.class)
    protected JAXBElement<FlagType> syncMl;
    @XmlElementRef(name = "syncMlVersion", namespace = "http://www.telefonica.com/schemas/UNICA/REST/directory/v1/", type = JAXBElement.class)
    protected JAXBElement<String> syncMlVersion;
    @XmlElementRef(name = "emsMaxNumber", namespace = "http://www.telefonica.com/schemas/UNICA/REST/directory/v1/", type = JAXBElement.class)
    protected JAXBElement<String> emsMaxNumber;
    @XmlElementRef(name = "email", namespace = "http://www.telefonica.com/schemas/UNICA/REST/directory/v1/", type = JAXBElement.class)
    protected JAXBElement<FlagType> email;
    @XmlElementRef(name = "emn", namespace = "http://www.telefonica.com/schemas/UNICA/REST/directory/v1/", type = JAXBElement.class)
    protected JAXBElement<FlagType> emn;
    @XmlElementRef(name = "adc_OTA", namespace = "http://www.telefonica.com/schemas/UNICA/REST/directory/v1/", type = JAXBElement.class)
    protected JAXBElement<FlagType> adcOTA;
    @XmlElementRef(name = "status", namespace = "http://www.telefonica.com/schemas/UNICA/REST/directory/v1/", type = JAXBElement.class)
    protected JAXBElement<StatusType> status;
    @XmlElementRef(name = "lastUpdated", namespace = "http://www.telefonica.com/schemas/UNICA/REST/directory/v1/", type = JAXBElement.class)
    protected JAXBElement<XMLGregorianCalendar> lastUpdated;
    protected ExtensionType extension;
    @XmlAnyElement(lax = true)
    protected List<Object> any;
    @XmlElementRef(name = "wapPush", namespace = "http://www.telefonica.com/schemas/UNICA/REST/directory/v1/", type = JAXBElement.class)
    protected JAXBElement<FlagType> wapPush;
    @XmlElementRef(name = "mmsVideo", namespace = "http://www.telefonica.com/schemas/UNICA/REST/directory/v1/", type = JAXBElement.class)
    protected JAXBElement<FlagType> mmsVideo;
    @XmlElementRef(name = "videoStreaming", namespace = "http://www.telefonica.com/schemas/UNICA/REST/directory/v1/", type = JAXBElement.class)
    protected JAXBElement<FlagType> videoStreaming;

    /**
     * Gets the value of the brand property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBrand() {
        return brand;
    }

    /**
     * Sets the value of the brand property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBrand(JAXBElement<String> value) {
        this.brand = value;
    }

    /**
     * Gets the value of the model property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getModel() {
        return model;
    }

    /**
     * Sets the value of the model property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setModel(JAXBElement<String> value) {
        this.model = value;
    }

    /**
     * Gets the value of the version property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getVersion() {
        return version;
    }

    /**
     * Sets the value of the version property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setVersion(JAXBElement<String> value) {
        this.version = value;
    }

    /**
     * Gets the value of the screenResolution property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getScreenResolution() {
        return screenResolution;
    }

    /**
     * Sets the value of the screenResolution property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setScreenResolution(JAXBElement<String> value) {
        this.screenResolution = value;
    }

    /**
     * Gets the value of the imei property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getImei() {
        return imei;
    }

    /**
     * Sets the value of the imei property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setImei(JAXBElement<String> value) {
        this.imei = value;
    }

    /**
     * Gets the value of the mms property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link FlagType }{@code >}
     *     
     */
    public JAXBElement<FlagType> getMms() {
        return mms;
    }

    /**
     * Sets the value of the mms property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link FlagType }{@code >}
     *     
     */
    public void setMms(JAXBElement<FlagType> value) {
        this.mms = value;
    }

    /**
     * Gets the value of the ems property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link FlagType }{@code >}
     *     
     */
    public JAXBElement<FlagType> getEms() {
        return ems;
    }

    /**
     * Sets the value of the ems property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link FlagType }{@code >}
     *     
     */
    public void setEms(JAXBElement<FlagType> value) {
        this.ems = value;
    }

    /**
     * Gets the value of the smartMessaging property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link FlagType }{@code >}
     *     
     */
    public JAXBElement<FlagType> getSmartMessaging() {
        return smartMessaging;
    }

    /**
     * Sets the value of the smartMessaging property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link FlagType }{@code >}
     *     
     */
    public void setSmartMessaging(JAXBElement<FlagType> value) {
        this.smartMessaging = value;
    }

    /**
     * Gets the value of the wap property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link FlagType }{@code >}
     *     
     */
    public JAXBElement<FlagType> getWap() {
        return wap;
    }

    /**
     * Sets the value of the wap property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link FlagType }{@code >}
     *     
     */
    public void setWap(JAXBElement<FlagType> value) {
        this.wap = value;
    }

    /**
     * Gets the value of the ussdPhase property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getUssdPhase() {
        return ussdPhase;
    }

    /**
     * Sets the value of the ussdPhase property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setUssdPhase(JAXBElement<String> value) {
        this.ussdPhase = value;
    }

    /**
     * Gets the value of the syncMl property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link FlagType }{@code >}
     *     
     */
    public JAXBElement<FlagType> getSyncMl() {
        return syncMl;
    }

    /**
     * Sets the value of the syncMl property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link FlagType }{@code >}
     *     
     */
    public void setSyncMl(JAXBElement<FlagType> value) {
        this.syncMl = value;
    }

    /**
     * Gets the value of the syncMlVersion property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSyncMlVersion() {
        return syncMlVersion;
    }

    /**
     * Sets the value of the syncMlVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSyncMlVersion(JAXBElement<String> value) {
        this.syncMlVersion = value;
    }

    /**
     * Gets the value of the emsMaxNumber property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEmsMaxNumber() {
        return emsMaxNumber;
    }

    /**
     * Sets the value of the emsMaxNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEmsMaxNumber(JAXBElement<String> value) {
        this.emsMaxNumber = value;
    }

    /**
     * Gets the value of the email property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link FlagType }{@code >}
     *     
     */
    public JAXBElement<FlagType> getEmail() {
        return email;
    }

    /**
     * Sets the value of the email property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link FlagType }{@code >}
     *     
     */
    public void setEmail(JAXBElement<FlagType> value) {
        this.email = value;
    }

    /**
     * Gets the value of the emn property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link FlagType }{@code >}
     *     
     */
    public JAXBElement<FlagType> getEmn() {
        return emn;
    }

    /**
     * Sets the value of the emn property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link FlagType }{@code >}
     *     
     */
    public void setEmn(JAXBElement<FlagType> value) {
        this.emn = value;
    }

    /**
     * Gets the value of the adcOTA property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link FlagType }{@code >}
     *     
     */
    public JAXBElement<FlagType> getAdcOTA() {
        return adcOTA;
    }

    /**
     * Sets the value of the adcOTA property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link FlagType }{@code >}
     *     
     */
    public void setAdcOTA(JAXBElement<FlagType> value) {
        this.adcOTA = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link StatusType }{@code >}
     *     
     */
    public JAXBElement<StatusType> getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link StatusType }{@code >}
     *     
     */
    public void setStatus(JAXBElement<StatusType> value) {
        this.status = value;
    }

    /**
     * Gets the value of the lastUpdated property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getLastUpdated() {
        return lastUpdated;
    }

    /**
     * Sets the value of the lastUpdated property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setLastUpdated(JAXBElement<XMLGregorianCalendar> value) {
        this.lastUpdated = value;
    }

    /**
     * Gets the value of the extension property.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getExtension() {
        return extension;
    }

    /**
     * Sets the value of the extension property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setExtension(ExtensionType value) {
        this.extension = value;
    }

    /**
     * Gets the value of the any property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the any property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAny().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Element }
     * {@link Object }
     * 
     * 
     */
    public List<Object> getAny() {
        if (any == null) {
            any = new ArrayList<Object>();
        }
        return this.any;
    }

    /**
     * Gets the value of the wapPush property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link FlagType }{@code >}
     *     
     */
    public JAXBElement<FlagType> getWapPush() {
        return wapPush;
    }

    /**
     * Sets the value of the wapPush property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link FlagType }{@code >}
     *     
     */
    public void setWapPush(JAXBElement<FlagType> value) {
        this.wapPush = value;
    }

    /**
     * Gets the value of the mmsVideo property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link FlagType }{@code >}
     *     
     */
    public JAXBElement<FlagType> getMmsVideo() {
        return mmsVideo;
    }

    /**
     * Sets the value of the mmsVideo property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link FlagType }{@code >}
     *     
     */
    public void setMmsVideo(JAXBElement<FlagType> value) {
        this.mmsVideo = value;
    }

    /**
     * Gets the value of the videoStreaming property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link FlagType }{@code >}
     *     
     */
    public JAXBElement<FlagType> getVideoStreaming() {
        return videoStreaming;
    }

    /**
     * Sets the value of the videoStreaming property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link FlagType }{@code >}
     *     
     */
    public void setVideoStreaming(JAXBElement<FlagType> value) {
        this.videoStreaming = value;
    }

    /**
     * Sets the value of the any property.
     * 
     * @param any
     *     allowed object is
     *     {@link Element }
     *     {@link Object }
     *     
     */
    public void setAny(List<Object> any) {
        this.any = any;
    }

}
