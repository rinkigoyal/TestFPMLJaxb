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
 * OrderCancelRequest can be found in Volume 4 of the
 * 						specification
 * 
 * <p>Java class for OrderCancelRequest_message_t complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OrderCancelRequest_message_t"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.fixprotocol.org/FIXML-5-0-SP2}Abstract_message_t"&gt;
 *       &lt;sequence&gt;
 *         &lt;group ref="{http://www.fixprotocol.org/FIXML-5-0-SP2}OrderCancelRequestElements"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attGroup ref="{http://www.fixprotocol.org/FIXML-5-0-SP2}OrderCancelRequestAttributes"/&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OrderCancelRequest_message_t", propOrder = {
    "pty",
    "instrmt",
    "finDetls",
    "undly",
    "ordQty"
})
public class OrderCancelRequestMessageT
    extends AbstractMessageT
    implements Equals, HashCode, ToString
{

    @XmlElement(name = "Pty")
    protected List<PartiesBlockT> pty;
    @XmlElement(name = "Instrmt", required = true)
    protected InstrumentBlockT instrmt;
    @XmlElement(name = "FinDetls")
    protected FinancingDetailsBlockT finDetls;
    @XmlElement(name = "Undly")
    protected List<UndInstrmtGrpBlockT> undly;
    @XmlElement(name = "OrdQty", required = true)
    protected OrderQtyDataBlockT ordQty;
    @XmlAttribute(name = "OrigID")
    protected String origID;
    @XmlAttribute(name = "OrdID")
    protected String ordID;
    @XmlAttribute(name = "ID", required = true)
    protected String id;
    @XmlAttribute(name = "ID2")
    protected String id2;
    @XmlAttribute(name = "LnkID")
    protected String lnkID;
    @XmlAttribute(name = "ListID")
    protected String listID;
    @XmlAttribute(name = "OrigOrdModTm")
    protected XMLGregorianCalendar origOrdModTm;
    @XmlAttribute(name = "Acct")
    protected String acct;
    @XmlAttribute(name = "AcctIDSrc")
    protected String acctIDSrc;
    @XmlAttribute(name = "AcctTyp")
    protected BigInteger acctTyp;
    @XmlAttribute(name = "Side", required = true)
    protected String side;
    @XmlAttribute(name = "TxnTm", required = true)
    protected XMLGregorianCalendar txnTm;
    @XmlAttribute(name = "ComplianceID")
    protected String complianceID;
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
     * Gets the value of the instrmt property.
     * 
     * @return
     *     possible object is
     *     {@link InstrumentBlockT }
     *     
     */
    public InstrumentBlockT getInstrmt() {
        return instrmt;
    }

    /**
     * Sets the value of the instrmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link InstrumentBlockT }
     *     
     */
    public void setInstrmt(InstrumentBlockT value) {
        this.instrmt = value;
    }

    /**
     * Gets the value of the finDetls property.
     * 
     * @return
     *     possible object is
     *     {@link FinancingDetailsBlockT }
     *     
     */
    public FinancingDetailsBlockT getFinDetls() {
        return finDetls;
    }

    /**
     * Sets the value of the finDetls property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancingDetailsBlockT }
     *     
     */
    public void setFinDetls(FinancingDetailsBlockT value) {
        this.finDetls = value;
    }

    /**
     * Gets the value of the undly property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the undly property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUndly().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link UndInstrmtGrpBlockT }
     * 
     * 
     */
    public List<UndInstrmtGrpBlockT> getUndly() {
        if (undly == null) {
            undly = new ArrayList<UndInstrmtGrpBlockT>();
        }
        return this.undly;
    }

    /**
     * Gets the value of the ordQty property.
     * 
     * @return
     *     possible object is
     *     {@link OrderQtyDataBlockT }
     *     
     */
    public OrderQtyDataBlockT getOrdQty() {
        return ordQty;
    }

    /**
     * Sets the value of the ordQty property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrderQtyDataBlockT }
     *     
     */
    public void setOrdQty(OrderQtyDataBlockT value) {
        this.ordQty = value;
    }

    /**
     * Gets the value of the origID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrigID() {
        return origID;
    }

    /**
     * Sets the value of the origID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrigID(String value) {
        this.origID = value;
    }

    /**
     * Gets the value of the ordID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrdID() {
        return ordID;
    }

    /**
     * Sets the value of the ordID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrdID(String value) {
        this.ordID = value;
    }

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
     * Gets the value of the id2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getID2() {
        return id2;
    }

    /**
     * Sets the value of the id2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setID2(String value) {
        this.id2 = value;
    }

    /**
     * Gets the value of the lnkID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLnkID() {
        return lnkID;
    }

    /**
     * Sets the value of the lnkID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLnkID(String value) {
        this.lnkID = value;
    }

    /**
     * Gets the value of the listID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getListID() {
        return listID;
    }

    /**
     * Sets the value of the listID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setListID(String value) {
        this.listID = value;
    }

    /**
     * Gets the value of the origOrdModTm property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOrigOrdModTm() {
        return origOrdModTm;
    }

    /**
     * Sets the value of the origOrdModTm property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOrigOrdModTm(XMLGregorianCalendar value) {
        this.origOrdModTm = value;
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
     * Gets the value of the txnTm property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTxnTm() {
        return txnTm;
    }

    /**
     * Sets the value of the txnTm property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTxnTm(XMLGregorianCalendar value) {
        this.txnTm = value;
    }

    /**
     * Gets the value of the complianceID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComplianceID() {
        return complianceID;
    }

    /**
     * Sets the value of the complianceID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComplianceID(String value) {
        this.complianceID = value;
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
        if (!(object instanceof OrderCancelRequestMessageT)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        if (!super.equals(thisLocator, thatLocator, object, strategy)) {
            return false;
        }
        final OrderCancelRequestMessageT that = ((OrderCancelRequestMessageT) object);
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
            InstrumentBlockT lhsInstrmt;
            lhsInstrmt = this.getInstrmt();
            InstrumentBlockT rhsInstrmt;
            rhsInstrmt = that.getInstrmt();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "instrmt", lhsInstrmt), LocatorUtils.property(thatLocator, "instrmt", rhsInstrmt), lhsInstrmt, rhsInstrmt)) {
                return false;
            }
        }
        {
            FinancingDetailsBlockT lhsFinDetls;
            lhsFinDetls = this.getFinDetls();
            FinancingDetailsBlockT rhsFinDetls;
            rhsFinDetls = that.getFinDetls();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "finDetls", lhsFinDetls), LocatorUtils.property(thatLocator, "finDetls", rhsFinDetls), lhsFinDetls, rhsFinDetls)) {
                return false;
            }
        }
        {
            List<UndInstrmtGrpBlockT> lhsUndly;
            lhsUndly = (((this.undly!= null)&&(!this.undly.isEmpty()))?this.getUndly():null);
            List<UndInstrmtGrpBlockT> rhsUndly;
            rhsUndly = (((that.undly!= null)&&(!that.undly.isEmpty()))?that.getUndly():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "undly", lhsUndly), LocatorUtils.property(thatLocator, "undly", rhsUndly), lhsUndly, rhsUndly)) {
                return false;
            }
        }
        {
            OrderQtyDataBlockT lhsOrdQty;
            lhsOrdQty = this.getOrdQty();
            OrderQtyDataBlockT rhsOrdQty;
            rhsOrdQty = that.getOrdQty();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "ordQty", lhsOrdQty), LocatorUtils.property(thatLocator, "ordQty", rhsOrdQty), lhsOrdQty, rhsOrdQty)) {
                return false;
            }
        }
        {
            String lhsOrigID;
            lhsOrigID = this.getOrigID();
            String rhsOrigID;
            rhsOrigID = that.getOrigID();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "origID", lhsOrigID), LocatorUtils.property(thatLocator, "origID", rhsOrigID), lhsOrigID, rhsOrigID)) {
                return false;
            }
        }
        {
            String lhsOrdID;
            lhsOrdID = this.getOrdID();
            String rhsOrdID;
            rhsOrdID = that.getOrdID();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "ordID", lhsOrdID), LocatorUtils.property(thatLocator, "ordID", rhsOrdID), lhsOrdID, rhsOrdID)) {
                return false;
            }
        }
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
            String lhsID2;
            lhsID2 = this.getID2();
            String rhsID2;
            rhsID2 = that.getID2();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "id2", lhsID2), LocatorUtils.property(thatLocator, "id2", rhsID2), lhsID2, rhsID2)) {
                return false;
            }
        }
        {
            String lhsLnkID;
            lhsLnkID = this.getLnkID();
            String rhsLnkID;
            rhsLnkID = that.getLnkID();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "lnkID", lhsLnkID), LocatorUtils.property(thatLocator, "lnkID", rhsLnkID), lhsLnkID, rhsLnkID)) {
                return false;
            }
        }
        {
            String lhsListID;
            lhsListID = this.getListID();
            String rhsListID;
            rhsListID = that.getListID();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "listID", lhsListID), LocatorUtils.property(thatLocator, "listID", rhsListID), lhsListID, rhsListID)) {
                return false;
            }
        }
        {
            XMLGregorianCalendar lhsOrigOrdModTm;
            lhsOrigOrdModTm = this.getOrigOrdModTm();
            XMLGregorianCalendar rhsOrigOrdModTm;
            rhsOrigOrdModTm = that.getOrigOrdModTm();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "origOrdModTm", lhsOrigOrdModTm), LocatorUtils.property(thatLocator, "origOrdModTm", rhsOrigOrdModTm), lhsOrigOrdModTm, rhsOrigOrdModTm)) {
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
            String lhsSide;
            lhsSide = this.getSide();
            String rhsSide;
            rhsSide = that.getSide();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "side", lhsSide), LocatorUtils.property(thatLocator, "side", rhsSide), lhsSide, rhsSide)) {
                return false;
            }
        }
        {
            XMLGregorianCalendar lhsTxnTm;
            lhsTxnTm = this.getTxnTm();
            XMLGregorianCalendar rhsTxnTm;
            rhsTxnTm = that.getTxnTm();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "txnTm", lhsTxnTm), LocatorUtils.property(thatLocator, "txnTm", rhsTxnTm), lhsTxnTm, rhsTxnTm)) {
                return false;
            }
        }
        {
            String lhsComplianceID;
            lhsComplianceID = this.getComplianceID();
            String rhsComplianceID;
            rhsComplianceID = that.getComplianceID();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "complianceID", lhsComplianceID), LocatorUtils.property(thatLocator, "complianceID", rhsComplianceID), lhsComplianceID, rhsComplianceID)) {
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
            List<PartiesBlockT> thePty;
            thePty = (((this.pty!= null)&&(!this.pty.isEmpty()))?this.getPty():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "pty", thePty), currentHashCode, thePty);
        }
        {
            InstrumentBlockT theInstrmt;
            theInstrmt = this.getInstrmt();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "instrmt", theInstrmt), currentHashCode, theInstrmt);
        }
        {
            FinancingDetailsBlockT theFinDetls;
            theFinDetls = this.getFinDetls();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "finDetls", theFinDetls), currentHashCode, theFinDetls);
        }
        {
            List<UndInstrmtGrpBlockT> theUndly;
            theUndly = (((this.undly!= null)&&(!this.undly.isEmpty()))?this.getUndly():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "undly", theUndly), currentHashCode, theUndly);
        }
        {
            OrderQtyDataBlockT theOrdQty;
            theOrdQty = this.getOrdQty();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "ordQty", theOrdQty), currentHashCode, theOrdQty);
        }
        {
            String theOrigID;
            theOrigID = this.getOrigID();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "origID", theOrigID), currentHashCode, theOrigID);
        }
        {
            String theOrdID;
            theOrdID = this.getOrdID();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "ordID", theOrdID), currentHashCode, theOrdID);
        }
        {
            String theID;
            theID = this.getID();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "id", theID), currentHashCode, theID);
        }
        {
            String theID2;
            theID2 = this.getID2();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "id2", theID2), currentHashCode, theID2);
        }
        {
            String theLnkID;
            theLnkID = this.getLnkID();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "lnkID", theLnkID), currentHashCode, theLnkID);
        }
        {
            String theListID;
            theListID = this.getListID();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "listID", theListID), currentHashCode, theListID);
        }
        {
            XMLGregorianCalendar theOrigOrdModTm;
            theOrigOrdModTm = this.getOrigOrdModTm();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "origOrdModTm", theOrigOrdModTm), currentHashCode, theOrigOrdModTm);
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
            String theSide;
            theSide = this.getSide();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "side", theSide), currentHashCode, theSide);
        }
        {
            XMLGregorianCalendar theTxnTm;
            theTxnTm = this.getTxnTm();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "txnTm", theTxnTm), currentHashCode, theTxnTm);
        }
        {
            String theComplianceID;
            theComplianceID = this.getComplianceID();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "complianceID", theComplianceID), currentHashCode, theComplianceID);
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
            List<PartiesBlockT> thePty;
            thePty = (((this.pty!= null)&&(!this.pty.isEmpty()))?this.getPty():null);
            strategy.appendField(locator, this, "pty", buffer, thePty);
        }
        {
            InstrumentBlockT theInstrmt;
            theInstrmt = this.getInstrmt();
            strategy.appendField(locator, this, "instrmt", buffer, theInstrmt);
        }
        {
            FinancingDetailsBlockT theFinDetls;
            theFinDetls = this.getFinDetls();
            strategy.appendField(locator, this, "finDetls", buffer, theFinDetls);
        }
        {
            List<UndInstrmtGrpBlockT> theUndly;
            theUndly = (((this.undly!= null)&&(!this.undly.isEmpty()))?this.getUndly():null);
            strategy.appendField(locator, this, "undly", buffer, theUndly);
        }
        {
            OrderQtyDataBlockT theOrdQty;
            theOrdQty = this.getOrdQty();
            strategy.appendField(locator, this, "ordQty", buffer, theOrdQty);
        }
        {
            String theOrigID;
            theOrigID = this.getOrigID();
            strategy.appendField(locator, this, "origID", buffer, theOrigID);
        }
        {
            String theOrdID;
            theOrdID = this.getOrdID();
            strategy.appendField(locator, this, "ordID", buffer, theOrdID);
        }
        {
            String theID;
            theID = this.getID();
            strategy.appendField(locator, this, "id", buffer, theID);
        }
        {
            String theID2;
            theID2 = this.getID2();
            strategy.appendField(locator, this, "id2", buffer, theID2);
        }
        {
            String theLnkID;
            theLnkID = this.getLnkID();
            strategy.appendField(locator, this, "lnkID", buffer, theLnkID);
        }
        {
            String theListID;
            theListID = this.getListID();
            strategy.appendField(locator, this, "listID", buffer, theListID);
        }
        {
            XMLGregorianCalendar theOrigOrdModTm;
            theOrigOrdModTm = this.getOrigOrdModTm();
            strategy.appendField(locator, this, "origOrdModTm", buffer, theOrigOrdModTm);
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
            String theSide;
            theSide = this.getSide();
            strategy.appendField(locator, this, "side", buffer, theSide);
        }
        {
            XMLGregorianCalendar theTxnTm;
            theTxnTm = this.getTxnTm();
            strategy.appendField(locator, this, "txnTm", buffer, theTxnTm);
        }
        {
            String theComplianceID;
            theComplianceID = this.getComplianceID();
            strategy.appendField(locator, this, "complianceID", buffer, theComplianceID);
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
