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
import javax.xml.datatype.XMLGregorianCalendar;
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
 * <p>Java class for BidCompReqGrp_Block_t complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BidCompReqGrp_Block_t"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;group ref="{http://www.fixprotocol.org/FIXML-5-0-SP2}BidCompReqGrpElements"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attGroup ref="{http://www.fixprotocol.org/FIXML-5-0-SP2}BidCompReqGrpAttributes"/&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BidCompReqGrp_Block_t")
public class BidCompReqGrpBlockT
    implements Equals, HashCode, ToString
{

    @XmlAttribute(name = "ID")
    protected String id;
    @XmlAttribute(name = "Side")
    protected String side;
    @XmlAttribute(name = "SesID")
    protected String sesID;
    @XmlAttribute(name = "SesSub")
    protected String sesSub;
    @XmlAttribute(name = "NetGrossInd")
    protected BigInteger netGrossInd;
    @XmlAttribute(name = "SettlTyp")
    protected String settlTyp;
    @XmlAttribute(name = "SettlDt")
    protected XMLGregorianCalendar settlDt;
    @XmlAttribute(name = "Acct")
    protected String acct;
    @XmlAttribute(name = "AcctIDSrc")
    protected String acctIDSrc;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getID() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setID(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the side property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSide() {
        return side;
    }

    /**
     * Sets the value of the side property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSide(String value) {
        this.side = value;
    }

    /**
     * Gets the value of the sesID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSesID() {
        return sesID;
    }

    /**
     * Sets the value of the sesID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSesID(String value) {
        this.sesID = value;
    }

    /**
     * Gets the value of the sesSub property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSesSub() {
        return sesSub;
    }

    /**
     * Sets the value of the sesSub property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSesSub(String value) {
        this.sesSub = value;
    }

    /**
     * Gets the value of the netGrossInd property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNetGrossInd() {
        return netGrossInd;
    }

    /**
     * Sets the value of the netGrossInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNetGrossInd(BigInteger value) {
        this.netGrossInd = value;
    }

    /**
     * Gets the value of the settlTyp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSettlTyp() {
        return settlTyp;
    }

    /**
     * Sets the value of the settlTyp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSettlTyp(String value) {
        this.settlTyp = value;
    }

    /**
     * Gets the value of the settlDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getSettlDt() {
        return settlDt;
    }

    /**
     * Sets the value of the settlDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setSettlDt(XMLGregorianCalendar value) {
        this.settlDt = value;
    }

    /**
     * Gets the value of the acct property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcct() {
        return acct;
    }

    /**
     * Sets the value of the acct property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAcct(String value) {
        this.acct = value;
    }

    /**
     * Gets the value of the acctIDSrc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcctIDSrc() {
        return acctIDSrc;
    }

    /**
     * Sets the value of the acctIDSrc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAcctIDSrc(String value) {
        this.acctIDSrc = value;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof BidCompReqGrpBlockT)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final BidCompReqGrpBlockT that = ((BidCompReqGrpBlockT) object);
        {
            String lhsID;
            lhsID = this.getID();
            String rhsID;
            rhsID = that.getID();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "id", lhsID), LocatorUtils.property(thatLocator, "id", rhsID), lhsID, rhsID)) {
                return false;
            }
        }
        {
            String lhsSide;
            lhsSide = this.getSide();
            String rhsSide;
            rhsSide = that.getSide();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "side", lhsSide), LocatorUtils.property(thatLocator, "side", rhsSide), lhsSide, rhsSide)) {
                return false;
            }
        }
        {
            String lhsSesID;
            lhsSesID = this.getSesID();
            String rhsSesID;
            rhsSesID = that.getSesID();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "sesID", lhsSesID), LocatorUtils.property(thatLocator, "sesID", rhsSesID), lhsSesID, rhsSesID)) {
                return false;
            }
        }
        {
            String lhsSesSub;
            lhsSesSub = this.getSesSub();
            String rhsSesSub;
            rhsSesSub = that.getSesSub();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "sesSub", lhsSesSub), LocatorUtils.property(thatLocator, "sesSub", rhsSesSub), lhsSesSub, rhsSesSub)) {
                return false;
            }
        }
        {
            BigInteger lhsNetGrossInd;
            lhsNetGrossInd = this.getNetGrossInd();
            BigInteger rhsNetGrossInd;
            rhsNetGrossInd = that.getNetGrossInd();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "netGrossInd", lhsNetGrossInd), LocatorUtils.property(thatLocator, "netGrossInd", rhsNetGrossInd), lhsNetGrossInd, rhsNetGrossInd)) {
                return false;
            }
        }
        {
            String lhsSettlTyp;
            lhsSettlTyp = this.getSettlTyp();
            String rhsSettlTyp;
            rhsSettlTyp = that.getSettlTyp();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "settlTyp", lhsSettlTyp), LocatorUtils.property(thatLocator, "settlTyp", rhsSettlTyp), lhsSettlTyp, rhsSettlTyp)) {
                return false;
            }
        }
        {
            XMLGregorianCalendar lhsSettlDt;
            lhsSettlDt = this.getSettlDt();
            XMLGregorianCalendar rhsSettlDt;
            rhsSettlDt = that.getSettlDt();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "settlDt", lhsSettlDt), LocatorUtils.property(thatLocator, "settlDt", rhsSettlDt), lhsSettlDt, rhsSettlDt)) {
                return false;
            }
        }
        {
            String lhsAcct;
            lhsAcct = this.getAcct();
            String rhsAcct;
            rhsAcct = that.getAcct();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "acct", lhsAcct), LocatorUtils.property(thatLocator, "acct", rhsAcct), lhsAcct, rhsAcct)) {
                return false;
            }
        }
        {
            String lhsAcctIDSrc;
            lhsAcctIDSrc = this.getAcctIDSrc();
            String rhsAcctIDSrc;
            rhsAcctIDSrc = that.getAcctIDSrc();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "acctIDSrc", lhsAcctIDSrc), LocatorUtils.property(thatLocator, "acctIDSrc", rhsAcctIDSrc), lhsAcctIDSrc, rhsAcctIDSrc)) {
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
        int currentHashCode = 1;
        {
            String theID;
            theID = this.getID();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "id", theID), currentHashCode, theID);
        }
        {
            String theSide;
            theSide = this.getSide();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "side", theSide), currentHashCode, theSide);
        }
        {
            String theSesID;
            theSesID = this.getSesID();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "sesID", theSesID), currentHashCode, theSesID);
        }
        {
            String theSesSub;
            theSesSub = this.getSesSub();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "sesSub", theSesSub), currentHashCode, theSesSub);
        }
        {
            BigInteger theNetGrossInd;
            theNetGrossInd = this.getNetGrossInd();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "netGrossInd", theNetGrossInd), currentHashCode, theNetGrossInd);
        }
        {
            String theSettlTyp;
            theSettlTyp = this.getSettlTyp();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "settlTyp", theSettlTyp), currentHashCode, theSettlTyp);
        }
        {
            XMLGregorianCalendar theSettlDt;
            theSettlDt = this.getSettlDt();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "settlDt", theSettlDt), currentHashCode, theSettlDt);
        }
        {
            String theAcct;
            theAcct = this.getAcct();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "acct", theAcct), currentHashCode, theAcct);
        }
        {
            String theAcctIDSrc;
            theAcctIDSrc = this.getAcctIDSrc();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "acctIDSrc", theAcctIDSrc), currentHashCode, theAcctIDSrc);
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
        {
            String theID;
            theID = this.getID();
            strategy.appendField(locator, this, "id", buffer, theID);
        }
        {
            String theSide;
            theSide = this.getSide();
            strategy.appendField(locator, this, "side", buffer, theSide);
        }
        {
            String theSesID;
            theSesID = this.getSesID();
            strategy.appendField(locator, this, "sesID", buffer, theSesID);
        }
        {
            String theSesSub;
            theSesSub = this.getSesSub();
            strategy.appendField(locator, this, "sesSub", buffer, theSesSub);
        }
        {
            BigInteger theNetGrossInd;
            theNetGrossInd = this.getNetGrossInd();
            strategy.appendField(locator, this, "netGrossInd", buffer, theNetGrossInd);
        }
        {
            String theSettlTyp;
            theSettlTyp = this.getSettlTyp();
            strategy.appendField(locator, this, "settlTyp", buffer, theSettlTyp);
        }
        {
            XMLGregorianCalendar theSettlDt;
            theSettlDt = this.getSettlDt();
            strategy.appendField(locator, this, "settlDt", buffer, theSettlDt);
        }
        {
            String theAcct;
            theAcct = this.getAcct();
            strategy.appendField(locator, this, "acct", buffer, theAcct);
        }
        {
            String theAcctIDSrc;
            theAcctIDSrc = this.getAcctIDSrc();
            strategy.appendField(locator, this, "acctIDSrc", buffer, theAcctIDSrc);
        }
        return buffer;
    }

}
