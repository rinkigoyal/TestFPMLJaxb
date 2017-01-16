//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.01.14 at 04:50:28 PM SGT 
//


package org.fixprotocol.fixml_5_0_sp2;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for YieldType_enum_t.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="YieldType_enum_t"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="AFTERTAX"/&gt;
 *     &lt;enumeration value="ANNUAL"/&gt;
 *     &lt;enumeration value="ATISSUE"/&gt;
 *     &lt;enumeration value="AVGMATURITY"/&gt;
 *     &lt;enumeration value="BOOK"/&gt;
 *     &lt;enumeration value="CALL"/&gt;
 *     &lt;enumeration value="CHANGE"/&gt;
 *     &lt;enumeration value="CLOSE"/&gt;
 *     &lt;enumeration value="COMPOUND"/&gt;
 *     &lt;enumeration value="CURRENT"/&gt;
 *     &lt;enumeration value="GOVTEQUIV"/&gt;
 *     &lt;enumeration value="GROSS"/&gt;
 *     &lt;enumeration value="INFLATION"/&gt;
 *     &lt;enumeration value="INVERSEFLOATER"/&gt;
 *     &lt;enumeration value="LASTCLOSE"/&gt;
 *     &lt;enumeration value="LASTMONTH"/&gt;
 *     &lt;enumeration value="LASTQUARTER"/&gt;
 *     &lt;enumeration value="LASTYEAR"/&gt;
 *     &lt;enumeration value="LONGAVGLIFE"/&gt;
 *     &lt;enumeration value="MARK"/&gt;
 *     &lt;enumeration value="MATURITY"/&gt;
 *     &lt;enumeration value="NEXTREFUND"/&gt;
 *     &lt;enumeration value="OPENAVG"/&gt;
 *     &lt;enumeration value="PREVCLOSE"/&gt;
 *     &lt;enumeration value="PROCEEDS"/&gt;
 *     &lt;enumeration value="PUT"/&gt;
 *     &lt;enumeration value="SEMIANNUAL"/&gt;
 *     &lt;enumeration value="SHORTAVGLIFE"/&gt;
 *     &lt;enumeration value="SIMPLE"/&gt;
 *     &lt;enumeration value="TAXEQUIV"/&gt;
 *     &lt;enumeration value="TENDER"/&gt;
 *     &lt;enumeration value="TRUE"/&gt;
 *     &lt;enumeration value="VALUE1_32"/&gt;
 *     &lt;enumeration value="WORST"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "YieldType_enum_t")
@XmlEnum
public enum YieldTypeEnumT {

    AFTERTAX("AFTERTAX"),
    ANNUAL("ANNUAL"),
    ATISSUE("ATISSUE"),
    AVGMATURITY("AVGMATURITY"),
    BOOK("BOOK"),
    CALL("CALL"),
    CHANGE("CHANGE"),
    CLOSE("CLOSE"),
    COMPOUND("COMPOUND"),
    CURRENT("CURRENT"),
    GOVTEQUIV("GOVTEQUIV"),
    GROSS("GROSS"),
    INFLATION("INFLATION"),
    INVERSEFLOATER("INVERSEFLOATER"),
    LASTCLOSE("LASTCLOSE"),
    LASTMONTH("LASTMONTH"),
    LASTQUARTER("LASTQUARTER"),
    LASTYEAR("LASTYEAR"),
    LONGAVGLIFE("LONGAVGLIFE"),
    MARK("MARK"),
    MATURITY("MATURITY"),
    NEXTREFUND("NEXTREFUND"),
    OPENAVG("OPENAVG"),
    PREVCLOSE("PREVCLOSE"),
    PROCEEDS("PROCEEDS"),
    PUT("PUT"),
    SEMIANNUAL("SEMIANNUAL"),
    SHORTAVGLIFE("SHORTAVGLIFE"),
    SIMPLE("SIMPLE"),
    TAXEQUIV("TAXEQUIV"),
    TENDER("TENDER"),
    TRUE("TRUE"),
    @XmlEnumValue("VALUE1_32")
    VALUE_1_32("VALUE1_32"),
    WORST("WORST");
    private final String value;

    YieldTypeEnumT(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static YieldTypeEnumT fromValue(String v) {
        for (YieldTypeEnumT c: YieldTypeEnumT.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}