//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.08.10 at 06:03:02 PM MSK 
//


package com.integriks.smev.nwxRewrite.client.src.serverApi.autogenerated.bussines;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ServiceOrFunctionType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ServiceOrFunctionType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="SERVICE"/>
 *     &lt;enumeration value="FUNCTION"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ServiceOrFunctionType")
@XmlEnum
public enum ServiceOrFunctionType {


    /**
     * Запрос послан в ходе оказания госуслуги.
     * 
     */
    SERVICE,

    /**
     * Запрос послан в ходе выполнения госфункции.
     * 
     */
    FUNCTION;

    public String value() {
        return name();
    }

    public static ServiceOrFunctionType fromValue(String v) {
        return valueOf(v);
    }

}
