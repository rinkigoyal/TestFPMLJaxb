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
 * <p>Java class for SettlInstTransType_enum_t.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SettlInstTransType_enum_t"&gt;
 *   &lt;restriction base="{http://www.fixprotocol.org/FIXML-5-0-SP2}char"&gt;
 *     &lt;enumeration value="N"/&gt;
 *     &lt;enumeration value="C"/&gt;
 *     &lt;enumeration value="R"/&gt;
 *     &lt;enumeration value="T"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "SettlInstTransType_enum_t")
@XmlEnum
public enum SettlInstTransTypeEnumT {

    N,
    C,
    R,
    T;

    public String value() {
        return name();
    }

    public static SettlInstTransTypeEnumT fromValue(String v) {
        return valueOf(v);
    }

}
