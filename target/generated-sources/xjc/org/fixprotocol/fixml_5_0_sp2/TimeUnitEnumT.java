//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.01.17 at 02:08:33 AM SGT 
//


package org.fixprotocol.fixml_5_0_sp2;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TimeUnit_enum_t.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TimeUnit_enum_t"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="H"/&gt;
 *     &lt;enumeration value="Min"/&gt;
 *     &lt;enumeration value="S"/&gt;
 *     &lt;enumeration value="D"/&gt;
 *     &lt;enumeration value="Wk"/&gt;
 *     &lt;enumeration value="Mo"/&gt;
 *     &lt;enumeration value="Yr"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "TimeUnit_enum_t")
@XmlEnum
public enum TimeUnitEnumT {

    H("H"),
    @XmlEnumValue("Min")
    MIN("Min"),
    S("S"),
    D("D"),
    @XmlEnumValue("Wk")
    WK("Wk"),
    @XmlEnumValue("Mo")
    MO("Mo"),
    @XmlEnumValue("Yr")
    YR("Yr");
    private final String value;

    TimeUnitEnumT(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TimeUnitEnumT fromValue(String v) {
        for (TimeUnitEnumT c: TimeUnitEnumT.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
