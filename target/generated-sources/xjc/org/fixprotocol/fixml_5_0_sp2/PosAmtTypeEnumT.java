//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.01.14 at 04:50:28 PM SGT 
//


package org.fixprotocol.fixml_5_0_sp2;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PosAmtType_enum_t.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PosAmtType_enum_t"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="CASH"/&gt;
 *     &lt;enumeration value="CRES"/&gt;
 *     &lt;enumeration value="FMTM"/&gt;
 *     &lt;enumeration value="IMTM"/&gt;
 *     &lt;enumeration value="PREM"/&gt;
 *     &lt;enumeration value="SMTM"/&gt;
 *     &lt;enumeration value="TVAR"/&gt;
 *     &lt;enumeration value="VADJ"/&gt;
 *     &lt;enumeration value="SETL"/&gt;
 *     &lt;enumeration value="ICPN"/&gt;
 *     &lt;enumeration value="ACPN"/&gt;
 *     &lt;enumeration value="CPN"/&gt;
 *     &lt;enumeration value="IACPN"/&gt;
 *     &lt;enumeration value="CMTM"/&gt;
 *     &lt;enumeration value="ICMTM"/&gt;
 *     &lt;enumeration value="DLV"/&gt;
 *     &lt;enumeration value="BANK"/&gt;
 *     &lt;enumeration value="COLAT"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "PosAmtType_enum_t")
@XmlEnum
public enum PosAmtTypeEnumT {

    CASH,
    CRES,
    FMTM,
    IMTM,
    PREM,
    SMTM,
    TVAR,
    VADJ,
    SETL,
    ICPN,
    ACPN,
    CPN,
    IACPN,
    CMTM,
    ICMTM,
    DLV,
    BANK,
    COLAT;

    public String value() {
        return name();
    }

    public static PosAmtTypeEnumT fromValue(String v) {
        return valueOf(v);
    }

}
