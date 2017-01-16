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
 * <p>Java class for BenchmarkCurveName_enum_t.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="BenchmarkCurveName_enum_t"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="EONIA"/&gt;
 *     &lt;enumeration value="EUREPO"/&gt;
 *     &lt;enumeration value="Euribor"/&gt;
 *     &lt;enumeration value="FutureSWAP"/&gt;
 *     &lt;enumeration value="LIBID"/&gt;
 *     &lt;enumeration value="LIBOR"/&gt;
 *     &lt;enumeration value="MuniAAA"/&gt;
 *     &lt;enumeration value="OTHER"/&gt;
 *     &lt;enumeration value="Pfandbriefe"/&gt;
 *     &lt;enumeration value="SONIA"/&gt;
 *     &lt;enumeration value="SWAP"/&gt;
 *     &lt;enumeration value="Treasury"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "BenchmarkCurveName_enum_t")
@XmlEnum
public enum BenchmarkCurveNameEnumT {

    EONIA("EONIA"),
    EUREPO("EUREPO"),
    @XmlEnumValue("Euribor")
    EURIBOR("Euribor"),
    @XmlEnumValue("FutureSWAP")
    FUTURE_SWAP("FutureSWAP"),
    LIBID("LIBID"),
    LIBOR("LIBOR"),
    @XmlEnumValue("MuniAAA")
    MUNI_AAA("MuniAAA"),
    OTHER("OTHER"),
    @XmlEnumValue("Pfandbriefe")
    PFANDBRIEFE("Pfandbriefe"),
    SONIA("SONIA"),
    SWAP("SWAP"),
    @XmlEnumValue("Treasury")
    TREASURY("Treasury");
    private final String value;

    BenchmarkCurveNameEnumT(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static BenchmarkCurveNameEnumT fromValue(String v) {
        for (BenchmarkCurveNameEnumT c: BenchmarkCurveNameEnumT.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
