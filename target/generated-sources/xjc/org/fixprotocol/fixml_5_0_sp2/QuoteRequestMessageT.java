//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.01.17 at 02:08:33 AM SGT 
//


package org.fixprotocol.fixml_5_0_sp2;

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
 * QuoteRequest can be found in Volume 3 of the
 * 						specification
 * 
 * <p>Java class for QuoteRequest_message_t complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="QuoteRequest_message_t"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.fixprotocol.org/FIXML-5-0-SP2}Abstract_message_t"&gt;
 *       &lt;sequence&gt;
 *         &lt;group ref="{http://www.fixprotocol.org/FIXML-5-0-SP2}QuoteRequestElements"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attGroup ref="{http://www.fixprotocol.org/FIXML-5-0-SP2}QuoteRequestAttributes"/&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QuoteRequest_message_t", propOrder = {
    "pty",
    "quotReq"
})
public class QuoteRequestMessageT
    extends AbstractMessageT
    implements Equals, HashCode, ToString
{

    @XmlElement(name = "Pty")
    protected List<RootPartiesBlockT> pty;
    @XmlElement(name = "QuotReq", required = true)
    protected List<QuotReqGrpBlockT> quotReq;
    @XmlAttribute(name = "ReqID", required = true)
    protected String reqID;
    @XmlAttribute(name = "RFQReqID")
    protected String rfqReqID;
    @XmlAttribute(name = "ClOrdID")
    protected String clOrdID;
    @XmlAttribute(name = "BkngTyp")
    protected BigInteger bkngTyp;
    @XmlAttribute(name = "Cpcty")
    protected OrderCapacityEnumT cpcty;
    @XmlAttribute(name = "Rstctions")
    protected String rstctions;
    @XmlAttribute(name = "PrvtQt")
    protected PrivateQuoteEnumT prvtQt;
    @XmlAttribute(name = "RspdntTyp")
    protected BigInteger rspdntTyp;
    @XmlAttribute(name = "PrTrdAnon")
    protected String prTrdAnon;
    @XmlAttribute(name = "Txt")
    protected String txt;
    @XmlAttribute(name = "EncTxtLen")
    protected BigInteger encTxtLen;
    @XmlAttribute(name = "EncTxt")
    protected String encTxt;

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
     * {@link RootPartiesBlockT }
     * 
     * 
     */
    public List<RootPartiesBlockT> getPty() {
        if (pty == null) {
            pty = new ArrayList<RootPartiesBlockT>();
        }
        return this.pty;
    }

    /**
     * Gets the value of the quotReq property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the quotReq property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getQuotReq().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link QuotReqGrpBlockT }
     * 
     * 
     */
    public List<QuotReqGrpBlockT> getQuotReq() {
        if (quotReq == null) {
            quotReq = new ArrayList<QuotReqGrpBlockT>();
        }
        return this.quotReq;
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
     * Gets the value of the rfqReqID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRFQReqID() {
        return rfqReqID;
    }

    /**
     * Sets the value of the rfqReqID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRFQReqID(String value) {
        this.rfqReqID = value;
    }

    /**
     * Gets the value of the clOrdID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClOrdID() {
        return clOrdID;
    }

    /**
     * Sets the value of the clOrdID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClOrdID(String value) {
        this.clOrdID = value;
    }

    /**
     * Gets the value of the bkngTyp property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getBkngTyp() {
        return bkngTyp;
    }

    /**
     * Sets the value of the bkngTyp property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setBkngTyp(BigInteger value) {
        this.bkngTyp = value;
    }

    /**
     * Gets the value of the cpcty property.
     * 
     * @return
     *     possible object is
     *     {@link OrderCapacityEnumT }
     *     
     */
    public OrderCapacityEnumT getCpcty() {
        return cpcty;
    }

    /**
     * Sets the value of the cpcty property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrderCapacityEnumT }
     *     
     */
    public void setCpcty(OrderCapacityEnumT value) {
        this.cpcty = value;
    }

    /**
     * Gets the value of the rstctions property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRstctions() {
        return rstctions;
    }

    /**
     * Sets the value of the rstctions property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRstctions(String value) {
        this.rstctions = value;
    }

    /**
     * Gets the value of the prvtQt property.
     * 
     * @return
     *     possible object is
     *     {@link PrivateQuoteEnumT }
     *     
     */
    public PrivateQuoteEnumT getPrvtQt() {
        return prvtQt;
    }

    /**
     * Sets the value of the prvtQt property.
     * 
     * @param value
     *     allowed object is
     *     {@link PrivateQuoteEnumT }
     *     
     */
    public void setPrvtQt(PrivateQuoteEnumT value) {
        this.prvtQt = value;
    }

    /**
     * Gets the value of the rspdntTyp property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getRspdntTyp() {
        return rspdntTyp;
    }

    /**
     * Sets the value of the rspdntTyp property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setRspdntTyp(BigInteger value) {
        this.rspdntTyp = value;
    }

    /**
     * Gets the value of the prTrdAnon property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrTrdAnon() {
        return prTrdAnon;
    }

    /**
     * Sets the value of the prTrdAnon property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrTrdAnon(String value) {
        this.prTrdAnon = value;
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
        if (!(object instanceof QuoteRequestMessageT)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        if (!super.equals(thisLocator, thatLocator, object, strategy)) {
            return false;
        }
        final QuoteRequestMessageT that = ((QuoteRequestMessageT) object);
        {
            List<RootPartiesBlockT> lhsPty;
            lhsPty = (((this.pty!= null)&&(!this.pty.isEmpty()))?this.getPty():null);
            List<RootPartiesBlockT> rhsPty;
            rhsPty = (((that.pty!= null)&&(!that.pty.isEmpty()))?that.getPty():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "pty", lhsPty), LocatorUtils.property(thatLocator, "pty", rhsPty), lhsPty, rhsPty)) {
                return false;
            }
        }
        {
            List<QuotReqGrpBlockT> lhsQuotReq;
            lhsQuotReq = (((this.quotReq!= null)&&(!this.quotReq.isEmpty()))?this.getQuotReq():null);
            List<QuotReqGrpBlockT> rhsQuotReq;
            rhsQuotReq = (((that.quotReq!= null)&&(!that.quotReq.isEmpty()))?that.getQuotReq():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "quotReq", lhsQuotReq), LocatorUtils.property(thatLocator, "quotReq", rhsQuotReq), lhsQuotReq, rhsQuotReq)) {
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
            String lhsRFQReqID;
            lhsRFQReqID = this.getRFQReqID();
            String rhsRFQReqID;
            rhsRFQReqID = that.getRFQReqID();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "rfqReqID", lhsRFQReqID), LocatorUtils.property(thatLocator, "rfqReqID", rhsRFQReqID), lhsRFQReqID, rhsRFQReqID)) {
                return false;
            }
        }
        {
            String lhsClOrdID;
            lhsClOrdID = this.getClOrdID();
            String rhsClOrdID;
            rhsClOrdID = that.getClOrdID();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "clOrdID", lhsClOrdID), LocatorUtils.property(thatLocator, "clOrdID", rhsClOrdID), lhsClOrdID, rhsClOrdID)) {
                return false;
            }
        }
        {
            BigInteger lhsBkngTyp;
            lhsBkngTyp = this.getBkngTyp();
            BigInteger rhsBkngTyp;
            rhsBkngTyp = that.getBkngTyp();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "bkngTyp", lhsBkngTyp), LocatorUtils.property(thatLocator, "bkngTyp", rhsBkngTyp), lhsBkngTyp, rhsBkngTyp)) {
                return false;
            }
        }
        {
            OrderCapacityEnumT lhsCpcty;
            lhsCpcty = this.getCpcty();
            OrderCapacityEnumT rhsCpcty;
            rhsCpcty = that.getCpcty();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "cpcty", lhsCpcty), LocatorUtils.property(thatLocator, "cpcty", rhsCpcty), lhsCpcty, rhsCpcty)) {
                return false;
            }
        }
        {
            String lhsRstctions;
            lhsRstctions = this.getRstctions();
            String rhsRstctions;
            rhsRstctions = that.getRstctions();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "rstctions", lhsRstctions), LocatorUtils.property(thatLocator, "rstctions", rhsRstctions), lhsRstctions, rhsRstctions)) {
                return false;
            }
        }
        {
            PrivateQuoteEnumT lhsPrvtQt;
            lhsPrvtQt = this.getPrvtQt();
            PrivateQuoteEnumT rhsPrvtQt;
            rhsPrvtQt = that.getPrvtQt();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "prvtQt", lhsPrvtQt), LocatorUtils.property(thatLocator, "prvtQt", rhsPrvtQt), lhsPrvtQt, rhsPrvtQt)) {
                return false;
            }
        }
        {
            BigInteger lhsRspdntTyp;
            lhsRspdntTyp = this.getRspdntTyp();
            BigInteger rhsRspdntTyp;
            rhsRspdntTyp = that.getRspdntTyp();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "rspdntTyp", lhsRspdntTyp), LocatorUtils.property(thatLocator, "rspdntTyp", rhsRspdntTyp), lhsRspdntTyp, rhsRspdntTyp)) {
                return false;
            }
        }
        {
            String lhsPrTrdAnon;
            lhsPrTrdAnon = this.getPrTrdAnon();
            String rhsPrTrdAnon;
            rhsPrTrdAnon = that.getPrTrdAnon();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "prTrdAnon", lhsPrTrdAnon), LocatorUtils.property(thatLocator, "prTrdAnon", rhsPrTrdAnon), lhsPrTrdAnon, rhsPrTrdAnon)) {
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
            List<RootPartiesBlockT> thePty;
            thePty = (((this.pty!= null)&&(!this.pty.isEmpty()))?this.getPty():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "pty", thePty), currentHashCode, thePty);
        }
        {
            List<QuotReqGrpBlockT> theQuotReq;
            theQuotReq = (((this.quotReq!= null)&&(!this.quotReq.isEmpty()))?this.getQuotReq():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "quotReq", theQuotReq), currentHashCode, theQuotReq);
        }
        {
            String theReqID;
            theReqID = this.getReqID();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "reqID", theReqID), currentHashCode, theReqID);
        }
        {
            String theRFQReqID;
            theRFQReqID = this.getRFQReqID();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "rfqReqID", theRFQReqID), currentHashCode, theRFQReqID);
        }
        {
            String theClOrdID;
            theClOrdID = this.getClOrdID();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "clOrdID", theClOrdID), currentHashCode, theClOrdID);
        }
        {
            BigInteger theBkngTyp;
            theBkngTyp = this.getBkngTyp();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "bkngTyp", theBkngTyp), currentHashCode, theBkngTyp);
        }
        {
            OrderCapacityEnumT theCpcty;
            theCpcty = this.getCpcty();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "cpcty", theCpcty), currentHashCode, theCpcty);
        }
        {
            String theRstctions;
            theRstctions = this.getRstctions();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "rstctions", theRstctions), currentHashCode, theRstctions);
        }
        {
            PrivateQuoteEnumT thePrvtQt;
            thePrvtQt = this.getPrvtQt();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "prvtQt", thePrvtQt), currentHashCode, thePrvtQt);
        }
        {
            BigInteger theRspdntTyp;
            theRspdntTyp = this.getRspdntTyp();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "rspdntTyp", theRspdntTyp), currentHashCode, theRspdntTyp);
        }
        {
            String thePrTrdAnon;
            thePrTrdAnon = this.getPrTrdAnon();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "prTrdAnon", thePrTrdAnon), currentHashCode, thePrTrdAnon);
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
            List<RootPartiesBlockT> thePty;
            thePty = (((this.pty!= null)&&(!this.pty.isEmpty()))?this.getPty():null);
            strategy.appendField(locator, this, "pty", buffer, thePty);
        }
        {
            List<QuotReqGrpBlockT> theQuotReq;
            theQuotReq = (((this.quotReq!= null)&&(!this.quotReq.isEmpty()))?this.getQuotReq():null);
            strategy.appendField(locator, this, "quotReq", buffer, theQuotReq);
        }
        {
            String theReqID;
            theReqID = this.getReqID();
            strategy.appendField(locator, this, "reqID", buffer, theReqID);
        }
        {
            String theRFQReqID;
            theRFQReqID = this.getRFQReqID();
            strategy.appendField(locator, this, "rfqReqID", buffer, theRFQReqID);
        }
        {
            String theClOrdID;
            theClOrdID = this.getClOrdID();
            strategy.appendField(locator, this, "clOrdID", buffer, theClOrdID);
        }
        {
            BigInteger theBkngTyp;
            theBkngTyp = this.getBkngTyp();
            strategy.appendField(locator, this, "bkngTyp", buffer, theBkngTyp);
        }
        {
            OrderCapacityEnumT theCpcty;
            theCpcty = this.getCpcty();
            strategy.appendField(locator, this, "cpcty", buffer, theCpcty);
        }
        {
            String theRstctions;
            theRstctions = this.getRstctions();
            strategy.appendField(locator, this, "rstctions", buffer, theRstctions);
        }
        {
            PrivateQuoteEnumT thePrvtQt;
            thePrvtQt = this.getPrvtQt();
            strategy.appendField(locator, this, "prvtQt", buffer, thePrvtQt);
        }
        {
            BigInteger theRspdntTyp;
            theRspdntTyp = this.getRspdntTyp();
            strategy.appendField(locator, this, "rspdntTyp", buffer, theRspdntTyp);
        }
        {
            String thePrTrdAnon;
            thePrTrdAnon = this.getPrTrdAnon();
            strategy.appendField(locator, this, "prTrdAnon", buffer, thePrTrdAnon);
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
