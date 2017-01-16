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
 * OrderMassActionReport can be found in Volume 4 of the
 * 						specification
 * 
 * <p>Java class for OrderMassActionReport_message_t complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OrderMassActionReport_message_t"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.fixprotocol.org/FIXML-5-0-SP2}Abstract_message_t"&gt;
 *       &lt;sequence&gt;
 *         &lt;group ref="{http://www.fixprotocol.org/FIXML-5-0-SP2}OrderMassActionReportElements"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attGroup ref="{http://www.fixprotocol.org/FIXML-5-0-SP2}OrderMassActionReportAttributes"/&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OrderMassActionReport_message_t", propOrder = {
    "affectOrd",
    "notAffectedOrdersGrp",
    "pty",
    "tgtPty",
    "instrmt",
    "undly"
})
public class OrderMassActionReportMessageT
    extends AbstractMessageT
    implements Equals, HashCode, ToString
{

    @XmlElement(name = "AffectOrd")
    protected List<AffectedOrdGrpBlockT> affectOrd;
    @XmlElement(name = "NotAffectedOrdersGrp")
    protected List<NotAffectedOrdersGrpBlockT> notAffectedOrdersGrp;
    @XmlElement(name = "Pty")
    protected List<PartiesBlockT> pty;
    @XmlElement(name = "TgtPty")
    protected List<TargetPartiesBlockT> tgtPty;
    @XmlElement(name = "Instrmt")
    protected InstrumentBlockT instrmt;
    @XmlElement(name = "Undly")
    protected UnderlyingInstrumentBlockT undly;
    @XmlAttribute(name = "ClOrdID")
    protected String clOrdID;
    @XmlAttribute(name = "ClOrdID2")
    protected String clOrdID2;
    @XmlAttribute(name = "MassActionReportID", required = true)
    protected String massActionReportID;
    @XmlAttribute(name = "MassActionType", required = true)
    protected BigInteger massActionType;
    @XmlAttribute(name = "MassActionScope", required = true)
    protected String massActionScope;
    @XmlAttribute(name = "MassActionResponse", required = true)
    protected BigInteger massActionResponse;
    @XmlAttribute(name = "MassActionRejectReason")
    protected String massActionRejectReason;
    @XmlAttribute(name = "TotAffctdOrds")
    protected BigInteger totAffctdOrds;
    @XmlAttribute(name = "MktID")
    protected String mktID;
    @XmlAttribute(name = "MktSegID")
    protected String mktSegID;
    @XmlAttribute(name = "SesID")
    protected String sesID;
    @XmlAttribute(name = "SesSub")
    protected String sesSub;
    @XmlAttribute(name = "Side")
    protected String side;
    @XmlAttribute(name = "TxnTm")
    protected XMLGregorianCalendar txnTm;
    @XmlAttribute(name = "Txt")
    protected String txt;
    @XmlAttribute(name = "EncTxtLen")
    protected BigInteger encTxtLen;
    @XmlAttribute(name = "EncTxt")
    protected String encTxt;

    /**
     * Gets the value of the affectOrd property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the affectOrd property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAffectOrd().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AffectedOrdGrpBlockT }
     * 
     * 
     */
    public List<AffectedOrdGrpBlockT> getAffectOrd() {
        if (affectOrd == null) {
            affectOrd = new ArrayList<AffectedOrdGrpBlockT>();
        }
        return this.affectOrd;
    }

    /**
     * Gets the value of the notAffectedOrdersGrp property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the notAffectedOrdersGrp property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNotAffectedOrdersGrp().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NotAffectedOrdersGrpBlockT }
     * 
     * 
     */
    public List<NotAffectedOrdersGrpBlockT> getNotAffectedOrdersGrp() {
        if (notAffectedOrdersGrp == null) {
            notAffectedOrdersGrp = new ArrayList<NotAffectedOrdersGrpBlockT>();
        }
        return this.notAffectedOrdersGrp;
    }

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
     * Gets the value of the tgtPty property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tgtPty property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTgtPty().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TargetPartiesBlockT }
     * 
     * 
     */
    public List<TargetPartiesBlockT> getTgtPty() {
        if (tgtPty == null) {
            tgtPty = new ArrayList<TargetPartiesBlockT>();
        }
        return this.tgtPty;
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
     * Gets the value of the undly property.
     * 
     * @return
     *     possible object is
     *     {@link UnderlyingInstrumentBlockT }
     *     
     */
    public UnderlyingInstrumentBlockT getUndly() {
        return undly;
    }

    /**
     * Sets the value of the undly property.
     * 
     * @param value
     *     allowed object is
     *     {@link UnderlyingInstrumentBlockT }
     *     
     */
    public void setUndly(UnderlyingInstrumentBlockT value) {
        this.undly = value;
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
     * Gets the value of the clOrdID2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClOrdID2() {
        return clOrdID2;
    }

    /**
     * Sets the value of the clOrdID2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClOrdID2(String value) {
        this.clOrdID2 = value;
    }

    /**
     * Gets the value of the massActionReportID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMassActionReportID() {
        return massActionReportID;
    }

    /**
     * Sets the value of the massActionReportID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMassActionReportID(String value) {
        this.massActionReportID = value;
    }

    /**
     * Gets the value of the massActionType property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMassActionType() {
        return massActionType;
    }

    /**
     * Sets the value of the massActionType property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMassActionType(BigInteger value) {
        this.massActionType = value;
    }

    /**
     * Gets the value of the massActionScope property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMassActionScope() {
        return massActionScope;
    }

    /**
     * Sets the value of the massActionScope property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMassActionScope(String value) {
        this.massActionScope = value;
    }

    /**
     * Gets the value of the massActionResponse property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMassActionResponse() {
        return massActionResponse;
    }

    /**
     * Sets the value of the massActionResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMassActionResponse(BigInteger value) {
        this.massActionResponse = value;
    }

    /**
     * Gets the value of the massActionRejectReason property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMassActionRejectReason() {
        return massActionRejectReason;
    }

    /**
     * Sets the value of the massActionRejectReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMassActionRejectReason(String value) {
        this.massActionRejectReason = value;
    }

    /**
     * Gets the value of the totAffctdOrds property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTotAffctdOrds() {
        return totAffctdOrds;
    }

    /**
     * Sets the value of the totAffctdOrds property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTotAffctdOrds(BigInteger value) {
        this.totAffctdOrds = value;
    }

    /**
     * Gets the value of the mktID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMktID() {
        return mktID;
    }

    /**
     * Sets the value of the mktID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMktID(String value) {
        this.mktID = value;
    }

    /**
     * Gets the value of the mktSegID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMktSegID() {
        return mktSegID;
    }

    /**
     * Sets the value of the mktSegID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMktSegID(String value) {
        this.mktSegID = value;
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
        if (!(object instanceof OrderMassActionReportMessageT)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        if (!super.equals(thisLocator, thatLocator, object, strategy)) {
            return false;
        }
        final OrderMassActionReportMessageT that = ((OrderMassActionReportMessageT) object);
        {
            List<AffectedOrdGrpBlockT> lhsAffectOrd;
            lhsAffectOrd = (((this.affectOrd!= null)&&(!this.affectOrd.isEmpty()))?this.getAffectOrd():null);
            List<AffectedOrdGrpBlockT> rhsAffectOrd;
            rhsAffectOrd = (((that.affectOrd!= null)&&(!that.affectOrd.isEmpty()))?that.getAffectOrd():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "affectOrd", lhsAffectOrd), LocatorUtils.property(thatLocator, "affectOrd", rhsAffectOrd), lhsAffectOrd, rhsAffectOrd)) {
                return false;
            }
        }
        {
            List<NotAffectedOrdersGrpBlockT> lhsNotAffectedOrdersGrp;
            lhsNotAffectedOrdersGrp = (((this.notAffectedOrdersGrp!= null)&&(!this.notAffectedOrdersGrp.isEmpty()))?this.getNotAffectedOrdersGrp():null);
            List<NotAffectedOrdersGrpBlockT> rhsNotAffectedOrdersGrp;
            rhsNotAffectedOrdersGrp = (((that.notAffectedOrdersGrp!= null)&&(!that.notAffectedOrdersGrp.isEmpty()))?that.getNotAffectedOrdersGrp():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "notAffectedOrdersGrp", lhsNotAffectedOrdersGrp), LocatorUtils.property(thatLocator, "notAffectedOrdersGrp", rhsNotAffectedOrdersGrp), lhsNotAffectedOrdersGrp, rhsNotAffectedOrdersGrp)) {
                return false;
            }
        }
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
            List<TargetPartiesBlockT> lhsTgtPty;
            lhsTgtPty = (((this.tgtPty!= null)&&(!this.tgtPty.isEmpty()))?this.getTgtPty():null);
            List<TargetPartiesBlockT> rhsTgtPty;
            rhsTgtPty = (((that.tgtPty!= null)&&(!that.tgtPty.isEmpty()))?that.getTgtPty():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "tgtPty", lhsTgtPty), LocatorUtils.property(thatLocator, "tgtPty", rhsTgtPty), lhsTgtPty, rhsTgtPty)) {
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
            UnderlyingInstrumentBlockT lhsUndly;
            lhsUndly = this.getUndly();
            UnderlyingInstrumentBlockT rhsUndly;
            rhsUndly = that.getUndly();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "undly", lhsUndly), LocatorUtils.property(thatLocator, "undly", rhsUndly), lhsUndly, rhsUndly)) {
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
            String lhsClOrdID2;
            lhsClOrdID2 = this.getClOrdID2();
            String rhsClOrdID2;
            rhsClOrdID2 = that.getClOrdID2();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "clOrdID2", lhsClOrdID2), LocatorUtils.property(thatLocator, "clOrdID2", rhsClOrdID2), lhsClOrdID2, rhsClOrdID2)) {
                return false;
            }
        }
        {
            String lhsMassActionReportID;
            lhsMassActionReportID = this.getMassActionReportID();
            String rhsMassActionReportID;
            rhsMassActionReportID = that.getMassActionReportID();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "massActionReportID", lhsMassActionReportID), LocatorUtils.property(thatLocator, "massActionReportID", rhsMassActionReportID), lhsMassActionReportID, rhsMassActionReportID)) {
                return false;
            }
        }
        {
            BigInteger lhsMassActionType;
            lhsMassActionType = this.getMassActionType();
            BigInteger rhsMassActionType;
            rhsMassActionType = that.getMassActionType();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "massActionType", lhsMassActionType), LocatorUtils.property(thatLocator, "massActionType", rhsMassActionType), lhsMassActionType, rhsMassActionType)) {
                return false;
            }
        }
        {
            String lhsMassActionScope;
            lhsMassActionScope = this.getMassActionScope();
            String rhsMassActionScope;
            rhsMassActionScope = that.getMassActionScope();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "massActionScope", lhsMassActionScope), LocatorUtils.property(thatLocator, "massActionScope", rhsMassActionScope), lhsMassActionScope, rhsMassActionScope)) {
                return false;
            }
        }
        {
            BigInteger lhsMassActionResponse;
            lhsMassActionResponse = this.getMassActionResponse();
            BigInteger rhsMassActionResponse;
            rhsMassActionResponse = that.getMassActionResponse();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "massActionResponse", lhsMassActionResponse), LocatorUtils.property(thatLocator, "massActionResponse", rhsMassActionResponse), lhsMassActionResponse, rhsMassActionResponse)) {
                return false;
            }
        }
        {
            String lhsMassActionRejectReason;
            lhsMassActionRejectReason = this.getMassActionRejectReason();
            String rhsMassActionRejectReason;
            rhsMassActionRejectReason = that.getMassActionRejectReason();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "massActionRejectReason", lhsMassActionRejectReason), LocatorUtils.property(thatLocator, "massActionRejectReason", rhsMassActionRejectReason), lhsMassActionRejectReason, rhsMassActionRejectReason)) {
                return false;
            }
        }
        {
            BigInteger lhsTotAffctdOrds;
            lhsTotAffctdOrds = this.getTotAffctdOrds();
            BigInteger rhsTotAffctdOrds;
            rhsTotAffctdOrds = that.getTotAffctdOrds();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "totAffctdOrds", lhsTotAffctdOrds), LocatorUtils.property(thatLocator, "totAffctdOrds", rhsTotAffctdOrds), lhsTotAffctdOrds, rhsTotAffctdOrds)) {
                return false;
            }
        }
        {
            String lhsMktID;
            lhsMktID = this.getMktID();
            String rhsMktID;
            rhsMktID = that.getMktID();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "mktID", lhsMktID), LocatorUtils.property(thatLocator, "mktID", rhsMktID), lhsMktID, rhsMktID)) {
                return false;
            }
        }
        {
            String lhsMktSegID;
            lhsMktSegID = this.getMktSegID();
            String rhsMktSegID;
            rhsMktSegID = that.getMktSegID();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "mktSegID", lhsMktSegID), LocatorUtils.property(thatLocator, "mktSegID", rhsMktSegID), lhsMktSegID, rhsMktSegID)) {
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
            List<AffectedOrdGrpBlockT> theAffectOrd;
            theAffectOrd = (((this.affectOrd!= null)&&(!this.affectOrd.isEmpty()))?this.getAffectOrd():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "affectOrd", theAffectOrd), currentHashCode, theAffectOrd);
        }
        {
            List<NotAffectedOrdersGrpBlockT> theNotAffectedOrdersGrp;
            theNotAffectedOrdersGrp = (((this.notAffectedOrdersGrp!= null)&&(!this.notAffectedOrdersGrp.isEmpty()))?this.getNotAffectedOrdersGrp():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "notAffectedOrdersGrp", theNotAffectedOrdersGrp), currentHashCode, theNotAffectedOrdersGrp);
        }
        {
            List<PartiesBlockT> thePty;
            thePty = (((this.pty!= null)&&(!this.pty.isEmpty()))?this.getPty():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "pty", thePty), currentHashCode, thePty);
        }
        {
            List<TargetPartiesBlockT> theTgtPty;
            theTgtPty = (((this.tgtPty!= null)&&(!this.tgtPty.isEmpty()))?this.getTgtPty():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "tgtPty", theTgtPty), currentHashCode, theTgtPty);
        }
        {
            InstrumentBlockT theInstrmt;
            theInstrmt = this.getInstrmt();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "instrmt", theInstrmt), currentHashCode, theInstrmt);
        }
        {
            UnderlyingInstrumentBlockT theUndly;
            theUndly = this.getUndly();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "undly", theUndly), currentHashCode, theUndly);
        }
        {
            String theClOrdID;
            theClOrdID = this.getClOrdID();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "clOrdID", theClOrdID), currentHashCode, theClOrdID);
        }
        {
            String theClOrdID2;
            theClOrdID2 = this.getClOrdID2();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "clOrdID2", theClOrdID2), currentHashCode, theClOrdID2);
        }
        {
            String theMassActionReportID;
            theMassActionReportID = this.getMassActionReportID();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "massActionReportID", theMassActionReportID), currentHashCode, theMassActionReportID);
        }
        {
            BigInteger theMassActionType;
            theMassActionType = this.getMassActionType();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "massActionType", theMassActionType), currentHashCode, theMassActionType);
        }
        {
            String theMassActionScope;
            theMassActionScope = this.getMassActionScope();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "massActionScope", theMassActionScope), currentHashCode, theMassActionScope);
        }
        {
            BigInteger theMassActionResponse;
            theMassActionResponse = this.getMassActionResponse();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "massActionResponse", theMassActionResponse), currentHashCode, theMassActionResponse);
        }
        {
            String theMassActionRejectReason;
            theMassActionRejectReason = this.getMassActionRejectReason();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "massActionRejectReason", theMassActionRejectReason), currentHashCode, theMassActionRejectReason);
        }
        {
            BigInteger theTotAffctdOrds;
            theTotAffctdOrds = this.getTotAffctdOrds();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "totAffctdOrds", theTotAffctdOrds), currentHashCode, theTotAffctdOrds);
        }
        {
            String theMktID;
            theMktID = this.getMktID();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "mktID", theMktID), currentHashCode, theMktID);
        }
        {
            String theMktSegID;
            theMktSegID = this.getMktSegID();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "mktSegID", theMktSegID), currentHashCode, theMktSegID);
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
            List<AffectedOrdGrpBlockT> theAffectOrd;
            theAffectOrd = (((this.affectOrd!= null)&&(!this.affectOrd.isEmpty()))?this.getAffectOrd():null);
            strategy.appendField(locator, this, "affectOrd", buffer, theAffectOrd);
        }
        {
            List<NotAffectedOrdersGrpBlockT> theNotAffectedOrdersGrp;
            theNotAffectedOrdersGrp = (((this.notAffectedOrdersGrp!= null)&&(!this.notAffectedOrdersGrp.isEmpty()))?this.getNotAffectedOrdersGrp():null);
            strategy.appendField(locator, this, "notAffectedOrdersGrp", buffer, theNotAffectedOrdersGrp);
        }
        {
            List<PartiesBlockT> thePty;
            thePty = (((this.pty!= null)&&(!this.pty.isEmpty()))?this.getPty():null);
            strategy.appendField(locator, this, "pty", buffer, thePty);
        }
        {
            List<TargetPartiesBlockT> theTgtPty;
            theTgtPty = (((this.tgtPty!= null)&&(!this.tgtPty.isEmpty()))?this.getTgtPty():null);
            strategy.appendField(locator, this, "tgtPty", buffer, theTgtPty);
        }
        {
            InstrumentBlockT theInstrmt;
            theInstrmt = this.getInstrmt();
            strategy.appendField(locator, this, "instrmt", buffer, theInstrmt);
        }
        {
            UnderlyingInstrumentBlockT theUndly;
            theUndly = this.getUndly();
            strategy.appendField(locator, this, "undly", buffer, theUndly);
        }
        {
            String theClOrdID;
            theClOrdID = this.getClOrdID();
            strategy.appendField(locator, this, "clOrdID", buffer, theClOrdID);
        }
        {
            String theClOrdID2;
            theClOrdID2 = this.getClOrdID2();
            strategy.appendField(locator, this, "clOrdID2", buffer, theClOrdID2);
        }
        {
            String theMassActionReportID;
            theMassActionReportID = this.getMassActionReportID();
            strategy.appendField(locator, this, "massActionReportID", buffer, theMassActionReportID);
        }
        {
            BigInteger theMassActionType;
            theMassActionType = this.getMassActionType();
            strategy.appendField(locator, this, "massActionType", buffer, theMassActionType);
        }
        {
            String theMassActionScope;
            theMassActionScope = this.getMassActionScope();
            strategy.appendField(locator, this, "massActionScope", buffer, theMassActionScope);
        }
        {
            BigInteger theMassActionResponse;
            theMassActionResponse = this.getMassActionResponse();
            strategy.appendField(locator, this, "massActionResponse", buffer, theMassActionResponse);
        }
        {
            String theMassActionRejectReason;
            theMassActionRejectReason = this.getMassActionRejectReason();
            strategy.appendField(locator, this, "massActionRejectReason", buffer, theMassActionRejectReason);
        }
        {
            BigInteger theTotAffctdOrds;
            theTotAffctdOrds = this.getTotAffctdOrds();
            strategy.appendField(locator, this, "totAffctdOrds", buffer, theTotAffctdOrds);
        }
        {
            String theMktID;
            theMktID = this.getMktID();
            strategy.appendField(locator, this, "mktID", buffer, theMktID);
        }
        {
            String theMktSegID;
            theMktSegID = this.getMktSegID();
            strategy.appendField(locator, this, "mktSegID", buffer, theMktSegID);
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
