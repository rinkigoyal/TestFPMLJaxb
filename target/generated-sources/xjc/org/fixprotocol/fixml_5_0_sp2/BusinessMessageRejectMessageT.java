//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.01.17 at 02:08:33 AM SGT 
//


package org.fixprotocol.fixml_5_0_sp2;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import org.jvnet.jaxb2_commons.lang.Equals;
import org.jvnet.jaxb2_commons.lang.EqualsStrategy;
import org.jvnet.jaxb2_commons.lang.HashCode;
import org.jvnet.jaxb2_commons.lang.HashCodeStrategy;
import org.jvnet.jaxb2_commons.lang.JAXBEqualsStrategy;
import org.jvnet.jaxb2_commons.lang.JAXBHashCodeStrategy;
import org.jvnet.jaxb2_commons.lang.JAXBToStringStrategy;
import org.jvnet.jaxb2_commons.lang.ToString;
import org.jvnet.jaxb2_commons.lang.ToStringStrategy;
import org.jvnet.jaxb2_commons.locator.ObjectLocator;
import org.jvnet.jaxb2_commons.locator.util.LocatorUtils;


/**
 * BusinessMessageReject can be found in Volume 1 of the
 * 						specification
 * 
 * <p>Java class for BusinessMessageReject_message_t complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BusinessMessageReject_message_t"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.fixprotocol.org/FIXML-5-0-SP2}Abstract_message_t"&gt;
 *       &lt;sequence&gt;
 *         &lt;group ref="{http://www.fixprotocol.org/FIXML-5-0-SP2}BusinessMessageRejectElements"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attGroup ref="{http://www.fixprotocol.org/FIXML-5-0-SP2}BusinessMessageRejectAttributes"/&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BusinessMessageReject_message_t")
public class BusinessMessageRejectMessageT
    extends AbstractMessageT
    implements Equals, HashCode, ToString
{

    @XmlAttribute(name = "RefSeqNum")
    protected BigInteger refSeqNum;
    @XmlAttribute(name = "RefMsgTyp", required = true)
    protected String refMsgTyp;
    @XmlAttribute(name = "RefApplVerID")
    protected String refApplVerID;
    @XmlAttribute(name = "RefApplExtID")
    protected BigInteger refApplExtID;
    @XmlAttribute(name = "RefCstmApplVerID")
    protected String refCstmApplVerID;
    @XmlAttribute(name = "BizRejRefID")
    protected String bizRejRefID;
    @XmlAttribute(name = "BizRejRsn", required = true)
    protected BigInteger bizRejRsn;
    @XmlAttribute(name = "Txt")
    protected String txt;
    @XmlAttribute(name = "EncTxtLen")
    protected BigInteger encTxtLen;
    @XmlAttribute(name = "EncTxt")
    protected String encTxt;

    /**
     * Gets the value of the refSeqNum property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getRefSeqNum() {
        return refSeqNum;
    }

    /**
     * Sets the value of the refSeqNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setRefSeqNum(BigInteger value) {
        this.refSeqNum = value;
    }

    /**
     * Gets the value of the refMsgTyp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRefMsgTyp() {
        return refMsgTyp;
    }

    /**
     * Sets the value of the refMsgTyp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRefMsgTyp(String value) {
        this.refMsgTyp = value;
    }

    /**
     * Gets the value of the refApplVerID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRefApplVerID() {
        return refApplVerID;
    }

    /**
     * Sets the value of the refApplVerID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRefApplVerID(String value) {
        this.refApplVerID = value;
    }

    /**
     * Gets the value of the refApplExtID property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getRefApplExtID() {
        return refApplExtID;
    }

    /**
     * Sets the value of the refApplExtID property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setRefApplExtID(BigInteger value) {
        this.refApplExtID = value;
    }

    /**
     * Gets the value of the refCstmApplVerID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRefCstmApplVerID() {
        return refCstmApplVerID;
    }

    /**
     * Sets the value of the refCstmApplVerID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRefCstmApplVerID(String value) {
        this.refCstmApplVerID = value;
    }

    /**
     * Gets the value of the bizRejRefID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBizRejRefID() {
        return bizRejRefID;
    }

    /**
     * Sets the value of the bizRejRefID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBizRejRefID(String value) {
        this.bizRejRefID = value;
    }

    /**
     * Gets the value of the bizRejRsn property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getBizRejRsn() {
        return bizRejRsn;
    }

    /**
     * Sets the value of the bizRejRsn property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setBizRejRsn(BigInteger value) {
        this.bizRejRsn = value;
    }

    /**
     * Gets the value of the txt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTxt() {
        return txt;
    }

    /**
     * Sets the value of the txt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTxt(String value) {
        this.txt = value;
    }

    /**
     * Gets the value of the encTxtLen property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getEncTxtLen() {
        return encTxtLen;
    }

    /**
     * Sets the value of the encTxtLen property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setEncTxtLen(BigInteger value) {
        this.encTxtLen = value;
    }

    /**
     * Gets the value of the encTxt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEncTxt() {
        return encTxt;
    }

    /**
     * Sets the value of the encTxt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEncTxt(String value) {
        this.encTxt = value;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof BusinessMessageRejectMessageT)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        if (!super.equals(thisLocator, thatLocator, object, strategy)) {
            return false;
        }
        final BusinessMessageRejectMessageT that = ((BusinessMessageRejectMessageT) object);
        {
            BigInteger lhsRefSeqNum;
            lhsRefSeqNum = this.getRefSeqNum();
            BigInteger rhsRefSeqNum;
            rhsRefSeqNum = that.getRefSeqNum();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "refSeqNum", lhsRefSeqNum), LocatorUtils.property(thatLocator, "refSeqNum", rhsRefSeqNum), lhsRefSeqNum, rhsRefSeqNum)) {
                return false;
            }
        }
        {
            String lhsRefMsgTyp;
            lhsRefMsgTyp = this.getRefMsgTyp();
            String rhsRefMsgTyp;
            rhsRefMsgTyp = that.getRefMsgTyp();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "refMsgTyp", lhsRefMsgTyp), LocatorUtils.property(thatLocator, "refMsgTyp", rhsRefMsgTyp), lhsRefMsgTyp, rhsRefMsgTyp)) {
                return false;
            }
        }
        {
            String lhsRefApplVerID;
            lhsRefApplVerID = this.getRefApplVerID();
            String rhsRefApplVerID;
            rhsRefApplVerID = that.getRefApplVerID();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "refApplVerID", lhsRefApplVerID), LocatorUtils.property(thatLocator, "refApplVerID", rhsRefApplVerID), lhsRefApplVerID, rhsRefApplVerID)) {
                return false;
            }
        }
        {
            BigInteger lhsRefApplExtID;
            lhsRefApplExtID = this.getRefApplExtID();
            BigInteger rhsRefApplExtID;
            rhsRefApplExtID = that.getRefApplExtID();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "refApplExtID", lhsRefApplExtID), LocatorUtils.property(thatLocator, "refApplExtID", rhsRefApplExtID), lhsRefApplExtID, rhsRefApplExtID)) {
                return false;
            }
        }
        {
            String lhsRefCstmApplVerID;
            lhsRefCstmApplVerID = this.getRefCstmApplVerID();
            String rhsRefCstmApplVerID;
            rhsRefCstmApplVerID = that.getRefCstmApplVerID();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "refCstmApplVerID", lhsRefCstmApplVerID), LocatorUtils.property(thatLocator, "refCstmApplVerID", rhsRefCstmApplVerID), lhsRefCstmApplVerID, rhsRefCstmApplVerID)) {
                return false;
            }
        }
        {
            String lhsBizRejRefID;
            lhsBizRejRefID = this.getBizRejRefID();
            String rhsBizRejRefID;
            rhsBizRejRefID = that.getBizRejRefID();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "bizRejRefID", lhsBizRejRefID), LocatorUtils.property(thatLocator, "bizRejRefID", rhsBizRejRefID), lhsBizRejRefID, rhsBizRejRefID)) {
                return false;
            }
        }
        {
            BigInteger lhsBizRejRsn;
            lhsBizRejRsn = this.getBizRejRsn();
            BigInteger rhsBizRejRsn;
            rhsBizRejRsn = that.getBizRejRsn();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "bizRejRsn", lhsBizRejRsn), LocatorUtils.property(thatLocator, "bizRejRsn", rhsBizRejRsn), lhsBizRejRsn, rhsBizRejRsn)) {
                return false;
            }
        }
        {
            String lhsTxt;
            lhsTxt = this.getTxt();
            String rhsTxt;
            rhsTxt = that.getTxt();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "txt", lhsTxt), LocatorUtils.property(thatLocator, "txt", rhsTxt), lhsTxt, rhsTxt)) {
                return false;
            }
        }
        {
            BigInteger lhsEncTxtLen;
            lhsEncTxtLen = this.getEncTxtLen();
            BigInteger rhsEncTxtLen;
            rhsEncTxtLen = that.getEncTxtLen();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "encTxtLen", lhsEncTxtLen), LocatorUtils.property(thatLocator, "encTxtLen", rhsEncTxtLen), lhsEncTxtLen, rhsEncTxtLen)) {
                return false;
            }
        }
        {
            String lhsEncTxt;
            lhsEncTxt = this.getEncTxt();
            String rhsEncTxt;
            rhsEncTxt = that.getEncTxt();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "encTxt", lhsEncTxt), LocatorUtils.property(thatLocator, "encTxt", rhsEncTxt), lhsEncTxt, rhsEncTxt)) {
                return false;
            }
        }
        return true;
    }

    public boolean equals(Object object) {
        final EqualsStrategy strategy = JAXBEqualsStrategy.INSTANCE;
        return equals(null, null, object, strategy);
    }

    public int hashCode(ObjectLocator locator, HashCodeStrategy strategy) {
        int currentHashCode = super.hashCode(locator, strategy);
        {
            BigInteger theRefSeqNum;
            theRefSeqNum = this.getRefSeqNum();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "refSeqNum", theRefSeqNum), currentHashCode, theRefSeqNum);
        }
        {
            String theRefMsgTyp;
            theRefMsgTyp = this.getRefMsgTyp();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "refMsgTyp", theRefMsgTyp), currentHashCode, theRefMsgTyp);
        }
        {
            String theRefApplVerID;
            theRefApplVerID = this.getRefApplVerID();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "refApplVerID", theRefApplVerID), currentHashCode, theRefApplVerID);
        }
        {
            BigInteger theRefApplExtID;
            theRefApplExtID = this.getRefApplExtID();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "refApplExtID", theRefApplExtID), currentHashCode, theRefApplExtID);
        }
        {
            String theRefCstmApplVerID;
            theRefCstmApplVerID = this.getRefCstmApplVerID();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "refCstmApplVerID", theRefCstmApplVerID), currentHashCode, theRefCstmApplVerID);
        }
        {
            String theBizRejRefID;
            theBizRejRefID = this.getBizRejRefID();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "bizRejRefID", theBizRejRefID), currentHashCode, theBizRejRefID);
        }
        {
            BigInteger theBizRejRsn;
            theBizRejRsn = this.getBizRejRsn();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "bizRejRsn", theBizRejRsn), currentHashCode, theBizRejRsn);
        }
        {
            String theTxt;
            theTxt = this.getTxt();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "txt", theTxt), currentHashCode, theTxt);
        }
        {
            BigInteger theEncTxtLen;
            theEncTxtLen = this.getEncTxtLen();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "encTxtLen", theEncTxtLen), currentHashCode, theEncTxtLen);
        }
        {
            String theEncTxt;
            theEncTxt = this.getEncTxt();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "encTxt", theEncTxt), currentHashCode, theEncTxt);
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

    public String toString() {
        final ToStringStrategy strategy = JAXBToStringStrategy.INSTANCE;
        final StringBuilder buffer = new StringBuilder();
        append(null, buffer, strategy);
        return buffer.toString();
    }

    public StringBuilder append(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
        strategy.appendStart(locator, this, buffer);
        appendFields(locator, buffer, strategy);
        strategy.appendEnd(locator, this, buffer);
        return buffer;
    }

    public StringBuilder appendFields(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
        super.appendFields(locator, buffer, strategy);
        {
            BigInteger theRefSeqNum;
            theRefSeqNum = this.getRefSeqNum();
            strategy.appendField(locator, this, "refSeqNum", buffer, theRefSeqNum);
        }
        {
            String theRefMsgTyp;
            theRefMsgTyp = this.getRefMsgTyp();
            strategy.appendField(locator, this, "refMsgTyp", buffer, theRefMsgTyp);
        }
        {
            String theRefApplVerID;
            theRefApplVerID = this.getRefApplVerID();
            strategy.appendField(locator, this, "refApplVerID", buffer, theRefApplVerID);
        }
        {
            BigInteger theRefApplExtID;
            theRefApplExtID = this.getRefApplExtID();
            strategy.appendField(locator, this, "refApplExtID", buffer, theRefApplExtID);
        }
        {
            String theRefCstmApplVerID;
            theRefCstmApplVerID = this.getRefCstmApplVerID();
            strategy.appendField(locator, this, "refCstmApplVerID", buffer, theRefCstmApplVerID);
        }
        {
            String theBizRejRefID;
            theBizRejRefID = this.getBizRejRefID();
            strategy.appendField(locator, this, "bizRejRefID", buffer, theBizRejRefID);
        }
        {
            BigInteger theBizRejRsn;
            theBizRejRsn = this.getBizRejRsn();
            strategy.appendField(locator, this, "bizRejRsn", buffer, theBizRejRsn);
        }
        {
            String theTxt;
            theTxt = this.getTxt();
            strategy.appendField(locator, this, "txt", buffer, theTxt);
        }
        {
            BigInteger theEncTxtLen;
            theEncTxtLen = this.getEncTxtLen();
            strategy.appendField(locator, this, "encTxtLen", buffer, theEncTxtLen);
        }
        {
            String theEncTxt;
            theEncTxt = this.getEncTxt();
            strategy.appendField(locator, this, "encTxt", buffer, theEncTxt);
        }
        return buffer;
    }

}
