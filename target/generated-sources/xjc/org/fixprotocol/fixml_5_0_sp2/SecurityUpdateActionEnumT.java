//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.01.17 at 02:08:33 AM SGT 
//


package org.fixprotocol.fixml_5_0_sp2;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SecurityUpdateAction_enum_t.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SecurityUpdateAction_enum_t"&gt;
 *   &lt;restriction base="{http://www.fixprotocol.org/FIXML-5-0-SP2}char"&gt;
 *     &lt;enumeration value="A"/&gt;
 *     &lt;enumeration value="D"/&gt;
 *     &lt;enumeration value="M"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "SecurityUpdateAction_enum_t")
@XmlEnum
public enum SecurityUpdateActionEnumT {

    A,
    D,
    M;

    public String value() {
        return name();
    }

    public static SecurityUpdateActionEnumT fromValue(String v) {
        return valueOf(v);
    }

}
