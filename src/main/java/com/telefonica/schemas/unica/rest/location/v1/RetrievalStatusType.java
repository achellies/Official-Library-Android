//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.5-b10 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.05.30 at 03:11:16 PM CEST 
//


package com.telefonica.schemas.unica.rest.location.v1;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RetrievalStatusType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="RetrievalStatusType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Retrieved"/>
 *     &lt;enumeration value="NotRetrieved"/>
 *     &lt;enumeration value="Error"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "RetrievalStatusType")
@XmlEnum
public enum RetrievalStatusType {


    /**
     * 
     *     					Item retrieved successfully
     *     				
     * 
     */
    @XmlEnumValue("Retrieved")
    RETRIEVED("Retrieved"),

    /**
     * 
     *     					Item not retrieved, Information is not provided (does not indicate an error, no attempt may have been made).
     *     				
     * 
     */
    @XmlEnumValue("NotRetrieved")
    NOT_RETRIEVED("NotRetrieved"),

    /**
     * 
     *     					Error retrieving item.
     *     				
     * 
     */
    @XmlEnumValue("Error")
    ERROR("Error");
    private final String value;

    RetrievalStatusType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static RetrievalStatusType fromValue(String v) {
        for (RetrievalStatusType c: RetrievalStatusType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
