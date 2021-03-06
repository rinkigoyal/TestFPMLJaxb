//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.01.17 at 02:08:33 AM SGT 
//


package org.fixprotocol.fixml_5_0_sp2;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
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
 * MassQuote can be found in Volume 3 of the
 * 						specification
 * 
 * <p>Java class for MassQuote_message_t complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MassQuote_message_t"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.fixprotocol.org/FIXML-5-0-SP2}Abstract_message_t"&gt;
 *       &lt;sequence&gt;
 *         &lt;group ref="{http://www.fixprotocol.org/FIXML-5-0-SP2}MassQuoteElements"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attGroup ref="{http://www.fixprotocol.org/FIXML-5-0-SP2}MassQuoteAttributes"/&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MassQuote_message_t", propOrder = {
    "pty",
    "quotSet"
})
public class MassQuoteMessageT
    extends AbstractMessageT
    implements Equals, HashCode, ToString
{

    @XmlElement(name = "Pty")
    protected List<PartiesBlockT> pty;
    @XmlElement(name = "QuotSet", required = true)
    protected List<QuotSetGrpBlockT> quotSet;
    @XmlAttribute(name = "ReqID")
    protected String reqID;
    @XmlAttribute(name = "QID", required = true)
    protected String qid;
    @XmlAttribute(name = "Typ")
    protected BigInteger typ;
    @XmlAttribute(name = "RspLvl")
    protected BigInteger rspLvl;
    @XmlAttribute(name = "Acct")
    protected String acct;
    @XmlAttribute(name = "AcctIDSrc")
    protected String acctIDSrc;
    @XmlAttribute(name = "AcctTyp")
    protected BigInteger acctTyp;
    @XmlAttribute(name = "DefBidSz")
    protected BigDecimal defBidSz;
    @XmlAttribute(name = "DefOfrSz")
    protected BigDecimal defOfrSz;

    /**
     * Gets the value of the pty property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pty property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPty().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PartiesBlockT }
     * 
     * 
     */
    public List<PartiesBlockT> getPty() {
        if (pty == null) {
            pty = new ArrayList<PartiesBlockT>();
        }
        return this.pty;
    }

    /**
     * Gets the value of the quotSet property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the quotSet property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getQuotSet().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link QuotSetGrpBlockT }
     * 
     * 
     */
    public List<QuotSetGrpBlockT> getQuotSet() {
        if (quotSet == null) {
            quotSet = new ArrayList<QuotSetGrpBlockT>();
        }
        return this.quotSet;
    }

    /**
     * Gets the value of the reqID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReqID() {
        return reqID;
    }

    /**
     * Sets the value of the reqID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReqID(String value) {
        this.reqID = value;
    }

    /**
     * Gets the value of the qid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQID() {
        return qid;
    }

    /**
     * Sets the value of the qid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQID(String value) {
        this.qid = value;
    }

    /**
     * Gets the value of the typ property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTyp() {
        return typ;
    }

    /**
     * Sets the value of the typ property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTyp(BigInteger value) {
        this.typ = value;
    }

    /**
     * Gets the value of the rspLvl property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getRspLvl() {
        return rspLvl;
    }

    /**
     * Sets the value of the rspLvl property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setRspLvl(BigInteger value) {
        this.rspLvl = value;
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

    /**
     * Gets the value of the acctTyp property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getAcctTyp() {
        return acctTyp;
    }

    /**
     * Sets the value of the acctTyp property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setAcctTyp(BigInteger value) {
        this.acctTyp = value;
    }

    /**
     * Gets the value of the defBidSz property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDefBidSz() {
        return defBidSz;
    }

    /**
     * Sets the value of the defBidSz property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDefBidSz(BigDecimal value) {
        this.defBidSz = value;
    }

    /**
     * Gets the value of the defOfrSz property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDefOfrSz() {
        return defOfrSz;
    }

    /**
     * Sets the value of the defOfrSz property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDefOfrSz(BigDecimal value) {
        this.defOfrSz = value;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof MassQuoteMessageT)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        if (!super.equals(thisLocator, thatLocator, object, strategy)) {
            return false;
        }
        final MassQuoteMessageT that = ((MassQuoteMessageT) object);
        {
            List<PartiesBlockT> lhsPty;
            lhsPty = (((this.pty!= null)&&(!this.pty.isEmpty()))?this.getPty():null);
            List<PartiesBlockT> rhsPty;
            rhsPty = (((that.pty!= null)&&(!that.pty.isEmpty()))?that.getPty():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "pty", lhsPty), LocatorUtils.property(thatLocator, "pty", rhsPty), lhsPty, rhsPty)) {
                return false;
            }
        }
        {
            List<QuotSetGrpBlockT> lhsQuotSet;
            lhsQuotSet = (((this.quotSet!= null)&&(!this.quotSet.isEmpty()))?this.getQuotSet():null);
            List<QuotSetGrpBlockT> rhsQuotSet;
            rhsQuotSet = (((that.quotSet!= null)&&(!that.quotSet.isEmpty()))?that.getQuotSet():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "quotSet", lhsQuotSet), LocatorUtils.property(thatLocator, "quotSet", rhsQuotSet), lhsQuotSet, rhsQuotSet)) {
                return false;
            }
        }
        {
            String lhsReqID;
            lhsReqID = this.getReqID();
            String rhsReqID;
            rhsReqID = that.getReqID();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "reqID", lhsReqID), LocatorUtils.property(thatLocator, "reqID", rhsReqID), lhsReqID, rhsReqID)) {
                return false;
            }
        }
        {
            String lhsQID;
            lhsQID = this.getQID();
            String rhsQID;
            rhsQID = that.getQID();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "qid", lhsQID), LocatorUtils.property(thatLocator, "qid", rhsQID), lhsQID, rhsQID)) {
                return false;
            }
        }
        {
            BigInteger lhsTyp;
            lhsTyp = this.getTyp();
            BigInteger rhsTyp;
            rhsTyp = that.getTyp();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "typ", lhsTyp), LocatorUtils.property(thatLocator, "typ", rhsTyp), lhsTyp, rhsTyp)) {
                return false;
            }
        }
        {
            BigInteger lhsRspLvl;
            lhsRspLvl = this.getRspLvl();
            BigInteger rhsRspLvl;
            rhsRspLvl = that.getRspLvl();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "rspLvl", lhsRspLvl), LocatorUtils.property(thatLocator, "rspLvl", rhsRspLvl), lhsRspLvl, rhsRspLvl)) {
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
        {
            BigInteger lhsAcctTyp;
            lhsAcctTyp = this.getAcctTyp();
            BigInteger rhsAcctTyp;
            rhsAcctTyp = that.getAcctTyp();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "acctTyp", lhsAcctTyp), LocatorUtils.property(thatLocator, "acctTyp", rhsAcctTyp), lhsAcctTyp, rhsAcctTyp)) {
                return false;
            }
        }
        {
            BigDecimal lhsDefBidSz;
            lhsDefBidSz = this.getDefBidSz();
            BigDecimal rhsDefBidSz;
            rhsDefBidSz = that.getDefBidSz();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "defBidSz", lhsDefBidSz), LocatorUtils.property(thatLocator, "defBidSz", rhsDefBidSz), lhsDefBidSz, rhsDefBidSz)) {
                return false;
            }
        }
        {
            BigDecimal lhsDefOfrSz;
            lhsDefOfrSz = this.getDefOfrSz();
            BigDecimal rhsDefOfrSz;
            rhsDefOfrSz = that.getDefOfrSz();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "defOfrSz", lhsDefOfrSz), LocatorUtils.property(thatLocator, "defOfrSz", rhsDefOfrSz), lhsDefOfrSz, rhsDefOfrSz)) {
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
            List<PartiesBlockT> thePty;
            thePty = (((this.pty!= null)&&(!this.pty.isEmpty()))?this.getPty():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "pty", thePty), currentHashCode, thePty);
        }
        {
            List<QuotSetGrpBlockT> theQuotSet;
            theQuotSet = (((this.quotSet!= null)&&(!this.quotSet.isEmpty()))?this.getQuotSet():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "quotSet", theQuotSet), currentHashCode, theQuotSet);
        }
        {
            String theReqID;
            theReqID = this.getReqID();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "reqID", theReqID), currentHashCode, theReqID);
        }
        {
            String theQID;
            theQID = this.getQID();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "qid", theQID), currentHashCode, theQID);
        }
        {
            BigInteger theTyp;
            theTyp = this.getTyp();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "typ", theTyp), currentHashCode, theTyp);
        }
        {
            BigInteger theRspLvl;
            theRspLvl = this.getRspLvl();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "rspLvl", theRspLvl), currentHashCode, theRspLvl);
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
        {
            BigInteger theAcctTyp;
            theAcctTyp = this.getAcctTyp();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "acctTyp", theAcctTyp), currentHashCode, theAcctTyp);
        }
        {
            BigDecimal theDefBidSz;
            theDefBidSz = this.getDefBidSz();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "defBidSz", theDefBidSz), currentHashCode, theDefBidSz);
        }
        {
            BigDecimal theDefOfrSz;
            theDefOfrSz = this.getDefOfrSz();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "defOfrSz", theDefOfrSz), currentHashCode, theDefOfrSz);
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
            List<PartiesBlockT> thePty;
            thePty = (((this.pty!= null)&&(!this.pty.isEmpty()))?this.getPty():null);
            strategy.appendField(locator, this, "pty", buffer, thePty);
        }
        {
            List<QuotSetGrpBlockT> theQuotSet;
            theQuotSet = (((this.quotSet!= null)&&(!this.quotSet.isEmpty()))?this.getQuotSet():null);
            strategy.appendField(locator, this, "quotSet", buffer, theQuotSet);
        }
        {
            String theReqID;
            theReqID = this.getReqID();
            strategy.appendField(locator, this, "reqID", buffer, theReqID);
        }
        {
            String theQID;
            theQID = this.getQID();
            strategy.appendField(locator, this, "qid", buffer, theQID);
        }
        {
            BigInteger theTyp;
            theTyp = this.getTyp();
            strategy.appendField(locator, this, "typ", buffer, theTyp);
        }
        {
            BigInteger theRspLvl;
            theRspLvl = this.getRspLvl();
            strategy.appendField(locator, this, "rspLvl", buffer, theRspLvl);
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
        {
            BigInteger theAcctTyp;
            theAcctTyp = this.getAcctTyp();
            strategy.appendField(locator, this, "acctTyp", buffer, theAcctTyp);
        }
        {
            BigDecimal theDefBidSz;
            theDefBidSz = this.getDefBidSz();
            strategy.appendField(locator, this, "defBidSz", buffer, theDefBidSz);
        }
        {
            BigDecimal theDefOfrSz;
            theDefOfrSz = this.getDefOfrSz();
            strategy.appendField(locator, this, "defOfrSz", buffer, theDefOfrSz);
        }
        return buffer;
    }

}
