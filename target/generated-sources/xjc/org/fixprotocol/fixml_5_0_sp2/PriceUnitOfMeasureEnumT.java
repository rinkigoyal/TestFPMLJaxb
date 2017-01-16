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
 * <p>Java class for PriceUnitOfMeasure_enum_t.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PriceUnitOfMeasure_enum_t"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Bbl"/&gt;
 *     &lt;enumeration value="Bcf"/&gt;
 *     &lt;enumeration value="Bu"/&gt;
 *     &lt;enumeration value="lbs"/&gt;
 *     &lt;enumeration value="Gal"/&gt;
 *     &lt;enumeration value="MMbbl"/&gt;
 *     &lt;enumeration value="MMBtu"/&gt;
 *     &lt;enumeration value="MWh"/&gt;
 *     &lt;enumeration value="oz_tr"/&gt;
 *     &lt;enumeration value="t"/&gt;
 *     &lt;enumeration value="tn"/&gt;
 *     &lt;enumeration value="USD"/&gt;
 *     &lt;enumeration value="Alw"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "PriceUnitOfMeasure_enum_t")
@XmlEnum
public enum PriceUnitOfMeasureEnumT {

    @XmlEnumValue("Bbl")
    BBL("Bbl"),
    @XmlEnumValue("Bcf")
    BCF("Bcf"),
    @XmlEnumValue("Bu")
    BU("Bu"),
    @XmlEnumValue("lbs")
    LBS("lbs"),
    @XmlEnumValue("Gal")
    GAL("Gal"),
    @XmlEnumValue("MMbbl")
    M_MBBL("MMbbl"),
    @XmlEnumValue("MMBtu")
    MM_BTU("MMBtu"),
    @XmlEnumValue("MWh")
    M_WH("MWh"),
    @XmlEnumValue("oz_tr")
    OZ_TR("oz_tr"),
    @XmlEnumValue("t")
    T("t"),
    @XmlEnumValue("tn")
    TN("tn"),
    USD("USD"),
    @XmlEnumValue("Alw")
    ALW("Alw");
    private final String value;

    PriceUnitOfMeasureEnumT(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PriceUnitOfMeasureEnumT fromValue(String v) {
        for (PriceUnitOfMeasureEnumT c: PriceUnitOfMeasureEnumT.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
