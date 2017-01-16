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
 * NewOrderList can be found in Volume 4 of the
 * 						specification
 * 
 * <p>Java class for NewOrderList_message_t complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NewOrderList_message_t"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.fixprotocol.org/FIXML-5-0-SP2}Abstract_message_t"&gt;
 *       &lt;sequence&gt;
 *         &lt;group ref="{http://www.fixprotocol.org/FIXML-5-0-SP2}NewOrderListElements"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attGroup ref="{http://www.fixprotocol.org/FIXML-5-0-SP2}NewOrderListAttributes"/&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NewOrderList_message_t", propOrder = {
    "pty",
    "ord"
})
public class NewOrderListMessageT
    extends AbstractMessageT
    implements Equals, HashCode, ToString
{

    @XmlElement(name = "Pty")
    protected List<RootPartiesBlockT> pty;
    @XmlElement(name = "Ord", required = true)
    protected List<ListOrdGrpBlockT> ord;
    @XmlAttribute(name = "ID", required = true)
    protected String id;
    @XmlAttribute(name = "BidID")
    protected String bidID;
    @XmlAttribute(name = "ClBidID")
    protected String clBidID;
    @XmlAttribute(name = "ProgRptReqs")
    protected BigInteger progRptReqs;
    @XmlAttribute(name = "BidTyp", required = true)
    protected BigInteger bidTyp;
    @XmlAttribute(name = "ProgPeriodIntvl")
    protected BigInteger progPeriodIntvl;
    @XmlAttribute(name = "CxllationRights")
    protected CancellationRightsEnumT cxllationRights;
    @XmlAttribute(name = "MnyLaunderingStat")
    protected String mnyLaunderingStat;
    @XmlAttribute(name = "RegistID")
    protected String registID;
    @XmlAttribute(name = "ListExecInstTyp")
    protected String listExecInstTyp;
    @XmlAttribute(name = "ListExecInst")
    protected String listExecInst;
    @XmlAttribute(name = "ContingencyType")
    protected String contingencyType;
    @XmlAttribute(name = "EncListExecInstLen")
    protected BigInteger encListExecInstLen;
    @XmlAttribute(name = "EncListExecInst")
    protected String encListExecInst;
    @XmlAttribute(name = "AOSPct")
    protected BigDecimal aosPct;
    @XmlAttribute(name = "AOSValu")
    protected BigDecimal aosValu;
    @XmlAttribute(name = "AOSCurr")
    protected String aosCurr;
    @XmlAttribute(name = "TotNoOrds", required = true)
    protected BigInteger totNoOrds;
    @XmlAttribute(name = "LastFragment")
    protected LastFragmentEnumT lastFragment;

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
     * Gets the value of the ord property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ord property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOrd().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ListOrdGrpBlockT }
     * 
     * 
     */
    public List<ListOrdGrpBlockT> getOrd() {
        if (ord == null) {
            ord = new ArrayList<ListOrdGrpBlockT>();
        }
        return this.ord;
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
     * Gets the value of the bidID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBidID() {
        return bidID;
    }

    /**
     * Sets the value of the bidID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBidID(String value) {
        this.bidID = value;
    }

    /**
     * Gets the value of the clBidID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClBidID() {
        return clBidID;
    }

    /**
     * Sets the value of the clBidID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClBidID(String value) {
        this.clBidID = value;
    }

    /**
     * Gets the value of the progRptReqs property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getProgRptReqs() {
        return progRptReqs;
    }

    /**
     * Sets the value of the progRptReqs property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setProgRptReqs(BigInteger value) {
        this.progRptReqs = value;
    }

    /**
     * Gets the value of the bidTyp property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getBidTyp() {
        return bidTyp;
    }

    /**
     * Sets the value of the bidTyp property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setBidTyp(BigInteger value) {
        this.bidTyp = value;
    }

    /**
     * Gets the value of the progPeriodIntvl property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getProgPeriodIntvl() {
        return progPeriodIntvl;
    }

    /**
     * Sets the value of the progPeriodIntvl property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setProgPeriodIntvl(BigInteger value) {
        this.progPeriodIntvl = value;
    }

    /**
     * Gets the value of the cxllationRights property.
     * 
     * @return
     *     possible object is
     *     {@link CancellationRightsEnumT }
     *     
     */
    public CancellationRightsEnumT getCxllationRights() {
        return cxllationRights;
    }

    /**
     * Sets the value of the cxllationRights property.
     * 
     * @param value
     *     allowed object is
     *     {@link CancellationRightsEnumT }
     *     
     */
    public void setCxllationRights(CancellationRightsEnumT value) {
        this.cxllationRights = value;
    }

    /**
     * Gets the value of the mnyLaunderingStat property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMnyLaunderingStat() {
        return mnyLaunderingStat;
    }

    /**
     * Sets the value of the mnyLaunderingStat property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMnyLaunderingStat(String value) {
        this.mnyLaunderingStat = value;
    }

    /**
     * Gets the value of the registID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegistID() {
        return registID;
    }

    /**
     * Sets the value of the registID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegistID(String value) {
        this.registID = value;
    }

    /**
     * Gets the value of the listExecInstTyp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getListExecInstTyp() {
        return listExecInstTyp;
    }

    /**
     * Sets the value of the listExecInstTyp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setListExecInstTyp(String value) {
        this.listExecInstTyp = value;
    }

    /**
     * Gets the value of the listExecInst property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getListExecInst() {
        return listExecInst;
    }

    /**
     * Sets the value of the listExecInst property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setListExecInst(String value) {
        this.listExecInst = value;
    }

    /**
     * Gets the value of the contingencyType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContingencyType() {
        return contingencyType;
    }

    /**
     * Sets the value of the contingencyType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContingencyType(String value) {
        this.contingencyType = value;
    }

    /**
     * Gets the value of the encListExecInstLen property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getEncListExecInstLen() {
        return encListExecInstLen;
    }

    /**
     * Sets the value of the encListExecInstLen property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setEncListExecInstLen(BigInteger value) {
        this.encListExecInstLen = value;
    }

    /**
     * Gets the value of the encListExecInst property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEncListExecInst() {
        return encListExecInst;
    }

    /**
     * Sets the value of the encListExecInst property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEncListExecInst(String value) {
        this.encListExecInst = value;
    }

    /**
     * Gets the value of the aosPct property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAOSPct() {
        return aosPct;
    }

    /**
     * Sets the value of the aosPct property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAOSPct(BigDecimal value) {
        this.aosPct = value;
    }

    /**
     * Gets the value of the aosValu property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAOSValu() {
        return aosValu;
    }

    /**
     * Sets the value of the aosValu property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAOSValu(BigDecimal value) {
        this.aosValu = value;
    }

    /**
     * Gets the value of the aosCurr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAOSCurr() {
        return aosCurr;
    }

    /**
     * Sets the value of the aosCurr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAOSCurr(String value) {
        this.aosCurr = value;
    }

    /**
     * Gets the value of the totNoOrds property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTotNoOrds() {
        return totNoOrds;
    }

    /**
     * Sets the value of the totNoOrds property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTotNoOrds(BigInteger value) {
        this.totNoOrds = value;
    }

    /**
     * Gets the value of the lastFragment property.
     * 
     * @return
     *     possible object is
     *     {@link LastFragmentEnumT }
     *     
     */
    public LastFragmentEnumT getLastFragment() {
        return lastFragment;
    }

    /**
     * Sets the value of the lastFragment property.
     * 
     * @param value
     *     allowed object is
     *     {@link LastFragmentEnumT }
     *     
     */
    public void setLastFragment(LastFragmentEnumT value) {
        this.lastFragment = value;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof NewOrderListMessageT)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        if (!super.equals(thisLocator, thatLocator, object, strategy)) {
            return false;
        }
        final NewOrderListMessageT that = ((NewOrderListMessageT) object);
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
            List<ListOrdGrpBlockT> lhsOrd;
            lhsOrd = (((this.ord!= null)&&(!this.ord.isEmpty()))?this.getOrd():null);
            List<ListOrdGrpBlockT> rhsOrd;
            rhsOrd = (((that.ord!= null)&&(!that.ord.isEmpty()))?that.getOrd():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "ord", lhsOrd), LocatorUtils.property(thatLocator, "ord", rhsOrd), lhsOrd, rhsOrd)) {
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
            String lhsBidID;
            lhsBidID = this.getBidID();
            String rhsBidID;
            rhsBidID = that.getBidID();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "bidID", lhsBidID), LocatorUtils.property(thatLocator, "bidID", rhsBidID), lhsBidID, rhsBidID)) {
                return false;
            }
        }
        {
            String lhsClBidID;
            lhsClBidID = this.getClBidID();
            String rhsClBidID;
            rhsClBidID = that.getClBidID();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "clBidID", lhsClBidID), LocatorUtils.property(thatLocator, "clBidID", rhsClBidID), lhsClBidID, rhsClBidID)) {
                return false;
            }
        }
        {
            BigInteger lhsProgRptReqs;
            lhsProgRptReqs = this.getProgRptReqs();
            BigInteger rhsProgRptReqs;
            rhsProgRptReqs = that.getProgRptReqs();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "progRptReqs", lhsProgRptReqs), LocatorUtils.property(thatLocator, "progRptReqs", rhsProgRptReqs), lhsProgRptReqs, rhsProgRptReqs)) {
                return false;
            }
        }
        {
            BigInteger lhsBidTyp;
            lhsBidTyp = this.getBidTyp();
            BigInteger rhsBidTyp;
            rhsBidTyp = that.getBidTyp();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "bidTyp", lhsBidTyp), LocatorUtils.property(thatLocator, "bidTyp", rhsBidTyp), lhsBidTyp, rhsBidTyp)) {
                return false;
            }
        }
        {
            BigInteger lhsProgPeriodIntvl;
            lhsProgPeriodIntvl = this.getProgPeriodIntvl();
            BigInteger rhsProgPeriodIntvl;
            rhsProgPeriodIntvl = that.getProgPeriodIntvl();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "progPeriodIntvl", lhsProgPeriodIntvl), LocatorUtils.property(thatLocator, "progPeriodIntvl", rhsProgPeriodIntvl), lhsProgPeriodIntvl, rhsProgPeriodIntvl)) {
                return false;
            }
        }
        {
            CancellationRightsEnumT lhsCxllationRights;
            lhsCxllationRights = this.getCxllationRights();
            CancellationRightsEnumT rhsCxllationRights;
            rhsCxllationRights = that.getCxllationRights();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "cxllationRights", lhsCxllationRights), LocatorUtils.property(thatLocator, "cxllationRights", rhsCxllationRights), lhsCxllationRights, rhsCxllationRights)) {
                return false;
            }
        }
        {
            String lhsMnyLaunderingStat;
            lhsMnyLaunderingStat = this.getMnyLaunderingStat();
            String rhsMnyLaunderingStat;
            rhsMnyLaunderingStat = that.getMnyLaunderingStat();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "mnyLaunderingStat", lhsMnyLaunderingStat), LocatorUtils.property(thatLocator, "mnyLaunderingStat", rhsMnyLaunderingStat), lhsMnyLaunderingStat, rhsMnyLaunderingStat)) {
                return false;
            }
        }
        {
            String lhsRegistID;
            lhsRegistID = this.getRegistID();
            String rhsRegistID;
            rhsRegistID = that.getRegistID();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "registID", lhsRegistID), LocatorUtils.property(thatLocator, "registID", rhsRegistID), lhsRegistID, rhsRegistID)) {
                return false;
            }
        }
        {
            String lhsListExecInstTyp;
            lhsListExecInstTyp = this.getListExecInstTyp();
            String rhsListExecInstTyp;
            rhsListExecInstTyp = that.getListExecInstTyp();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "listExecInstTyp", lhsListExecInstTyp), LocatorUtils.property(thatLocator, "listExecInstTyp", rhsListExecInstTyp), lhsListExecInstTyp, rhsListExecInstTyp)) {
                return false;
            }
        }
        {
            String lhsListExecInst;
            lhsListExecInst = this.getListExecInst();
            String rhsListExecInst;
            rhsListExecInst = that.getListExecInst();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "listExecInst", lhsListExecInst), LocatorUtils.property(thatLocator, "listExecInst", rhsListExecInst), lhsListExecInst, rhsListExecInst)) {
                return false;
            }
        }
        {
            String lhsContingencyType;
            lhsContingencyType = this.getContingencyType();
            String rhsContingencyType;
            rhsContingencyType = that.getContingencyType();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "contingencyType", lhsContingencyType), LocatorUtils.property(thatLocator, "contingencyType", rhsContingencyType), lhsContingencyType, rhsContingencyType)) {
                return false;
            }
        }
        {
            BigInteger lhsEncListExecInstLen;
            lhsEncListExecInstLen = this.getEncListExecInstLen();
            BigInteger rhsEncListExecInstLen;
            rhsEncListExecInstLen = that.getEncListExecInstLen();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "encListExecInstLen", lhsEncListExecInstLen), LocatorUtils.property(thatLocator, "encListExecInstLen", rhsEncListExecInstLen), lhsEncListExecInstLen, rhsEncListExecInstLen)) {
                return false;
            }
        }
        {
            String lhsEncListExecInst;
            lhsEncListExecInst = this.getEncListExecInst();
            String rhsEncListExecInst;
            rhsEncListExecInst = that.getEncListExecInst();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "encListExecInst", lhsEncListExecInst), LocatorUtils.property(thatLocator, "encListExecInst", rhsEncListExecInst), lhsEncListExecInst, rhsEncListExecInst)) {
                return false;
            }
        }
        {
            BigDecimal lhsAOSPct;
            lhsAOSPct = this.getAOSPct();
            BigDecimal rhsAOSPct;
            rhsAOSPct = that.getAOSPct();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "aosPct", lhsAOSPct), LocatorUtils.property(thatLocator, "aosPct", rhsAOSPct), lhsAOSPct, rhsAOSPct)) {
                return false;
            }
        }
        {
            BigDecimal lhsAOSValu;
            lhsAOSValu = this.getAOSValu();
            BigDecimal rhsAOSValu;
            rhsAOSValu = that.getAOSValu();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "aosValu", lhsAOSValu), LocatorUtils.property(thatLocator, "aosValu", rhsAOSValu), lhsAOSValu, rhsAOSValu)) {
                return false;
            }
        }
        {
            String lhsAOSCurr;
            lhsAOSCurr = this.getAOSCurr();
            String rhsAOSCurr;
            rhsAOSCurr = that.getAOSCurr();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "aosCurr", lhsAOSCurr), LocatorUtils.property(thatLocator, "aosCurr", rhsAOSCurr), lhsAOSCurr, rhsAOSCurr)) {
                return false;
            }
        }
        {
            BigInteger lhsTotNoOrds;
            lhsTotNoOrds = this.getTotNoOrds();
            BigInteger rhsTotNoOrds;
            rhsTotNoOrds = that.getTotNoOrds();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "totNoOrds", lhsTotNoOrds), LocatorUtils.property(thatLocator, "totNoOrds", rhsTotNoOrds), lhsTotNoOrds, rhsTotNoOrds)) {
                return false;
            }
        }
        {
            LastFragmentEnumT lhsLastFragment;
            lhsLastFragment = this.getLastFragment();
            LastFragmentEnumT rhsLastFragment;
            rhsLastFragment = that.getLastFragment();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "lastFragment", lhsLastFragment), LocatorUtils.property(thatLocator, "lastFragment", rhsLastFragment), lhsLastFragment, rhsLastFragment)) {
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
            List<ListOrdGrpBlockT> theOrd;
            theOrd = (((this.ord!= null)&&(!this.ord.isEmpty()))?this.getOrd():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "ord", theOrd), currentHashCode, theOrd);
        }
        {
            String theID;
            theID = this.getID();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "id", theID), currentHashCode, theID);
        }
        {
            String theBidID;
            theBidID = this.getBidID();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "bidID", theBidID), currentHashCode, theBidID);
        }
        {
            String theClBidID;
            theClBidID = this.getClBidID();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "clBidID", theClBidID), currentHashCode, theClBidID);
        }
        {
            BigInteger theProgRptReqs;
            theProgRptReqs = this.getProgRptReqs();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "progRptReqs", theProgRptReqs), currentHashCode, theProgRptReqs);
        }
        {
            BigInteger theBidTyp;
            theBidTyp = this.getBidTyp();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "bidTyp", theBidTyp), currentHashCode, theBidTyp);
        }
        {
            BigInteger theProgPeriodIntvl;
            theProgPeriodIntvl = this.getProgPeriodIntvl();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "progPeriodIntvl", theProgPeriodIntvl), currentHashCode, theProgPeriodIntvl);
        }
        {
            CancellationRightsEnumT theCxllationRights;
            theCxllationRights = this.getCxllationRights();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "cxllationRights", theCxllationRights), currentHashCode, theCxllationRights);
        }
        {
            String theMnyLaunderingStat;
            theMnyLaunderingStat = this.getMnyLaunderingStat();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "mnyLaunderingStat", theMnyLaunderingStat), currentHashCode, theMnyLaunderingStat);
        }
        {
            String theRegistID;
            theRegistID = this.getRegistID();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "registID", theRegistID), currentHashCode, theRegistID);
        }
        {
            String theListExecInstTyp;
            theListExecInstTyp = this.getListExecInstTyp();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "listExecInstTyp", theListExecInstTyp), currentHashCode, theListExecInstTyp);
        }
        {
            String theListExecInst;
            theListExecInst = this.getListExecInst();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "listExecInst", theListExecInst), currentHashCode, theListExecInst);
        }
        {
            String theContingencyType;
            theContingencyType = this.getContingencyType();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "contingencyType", theContingencyType), currentHashCode, theContingencyType);
        }
        {
            BigInteger theEncListExecInstLen;
            theEncListExecInstLen = this.getEncListExecInstLen();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "encListExecInstLen", theEncListExecInstLen), currentHashCode, theEncListExecInstLen);
        }
        {
            String theEncListExecInst;
            theEncListExecInst = this.getEncListExecInst();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "encListExecInst", theEncListExecInst), currentHashCode, theEncListExecInst);
        }
        {
            BigDecimal theAOSPct;
            theAOSPct = this.getAOSPct();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "aosPct", theAOSPct), currentHashCode, theAOSPct);
        }
        {
            BigDecimal theAOSValu;
            theAOSValu = this.getAOSValu();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "aosValu", theAOSValu), currentHashCode, theAOSValu);
        }
        {
            String theAOSCurr;
            theAOSCurr = this.getAOSCurr();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "aosCurr", theAOSCurr), currentHashCode, theAOSCurr);
        }
        {
            BigInteger theTotNoOrds;
            theTotNoOrds = this.getTotNoOrds();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "totNoOrds", theTotNoOrds), currentHashCode, theTotNoOrds);
        }
        {
            LastFragmentEnumT theLastFragment;
            theLastFragment = this.getLastFragment();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "lastFragment", theLastFragment), currentHashCode, theLastFragment);
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
            List<ListOrdGrpBlockT> theOrd;
            theOrd = (((this.ord!= null)&&(!this.ord.isEmpty()))?this.getOrd():null);
            strategy.appendField(locator, this, "ord", buffer, theOrd);
        }
        {
            String theID;
            theID = this.getID();
            strategy.appendField(locator, this, "id", buffer, theID);
        }
        {
            String theBidID;
            theBidID = this.getBidID();
            strategy.appendField(locator, this, "bidID", buffer, theBidID);
        }
        {
            String theClBidID;
            theClBidID = this.getClBidID();
            strategy.appendField(locator, this, "clBidID", buffer, theClBidID);
        }
        {
            BigInteger theProgRptReqs;
            theProgRptReqs = this.getProgRptReqs();
            strategy.appendField(locator, this, "progRptReqs", buffer, theProgRptReqs);
        }
        {
            BigInteger theBidTyp;
            theBidTyp = this.getBidTyp();
            strategy.appendField(locator, this, "bidTyp", buffer, theBidTyp);
        }
        {
            BigInteger theProgPeriodIntvl;
            theProgPeriodIntvl = this.getProgPeriodIntvl();
            strategy.appendField(locator, this, "progPeriodIntvl", buffer, theProgPeriodIntvl);
        }
        {
            CancellationRightsEnumT theCxllationRights;
            theCxllationRights = this.getCxllationRights();
            strategy.appendField(locator, this, "cxllationRights", buffer, theCxllationRights);
        }
        {
            String theMnyLaunderingStat;
            theMnyLaunderingStat = this.getMnyLaunderingStat();
            strategy.appendField(locator, this, "mnyLaunderingStat", buffer, theMnyLaunderingStat);
        }
        {
            String theRegistID;
            theRegistID = this.getRegistID();
            strategy.appendField(locator, this, "registID", buffer, theRegistID);
        }
        {
            String theListExecInstTyp;
            theListExecInstTyp = this.getListExecInstTyp();
            strategy.appendField(locator, this, "listExecInstTyp", buffer, theListExecInstTyp);
        }
        {
            String theListExecInst;
            theListExecInst = this.getListExecInst();
            strategy.appendField(locator, this, "listExecInst", buffer, theListExecInst);
        }
        {
            String theContingencyType;
            theContingencyType = this.getContingencyType();
            strategy.appendField(locator, this, "contingencyType", buffer, theContingencyType);
        }
        {
            BigInteger theEncListExecInstLen;
            theEncListExecInstLen = this.getEncListExecInstLen();
            strategy.appendField(locator, this, "encListExecInstLen", buffer, theEncListExecInstLen);
        }
        {
            String theEncListExecInst;
            theEncListExecInst = this.getEncListExecInst();
            strategy.appendField(locator, this, "encListExecInst", buffer, theEncListExecInst);
        }
        {
            BigDecimal theAOSPct;
            theAOSPct = this.getAOSPct();
            strategy.appendField(locator, this, "aosPct", buffer, theAOSPct);
        }
        {
            BigDecimal theAOSValu;
            theAOSValu = this.getAOSValu();
            strategy.appendField(locator, this, "aosValu", buffer, theAOSValu);
        }
        {
            String theAOSCurr;
            theAOSCurr = this.getAOSCurr();
            strategy.appendField(locator, this, "aosCurr", buffer, theAOSCurr);
        }
        {
            BigInteger theTotNoOrds;
            theTotNoOrds = this.getTotNoOrds();
            strategy.appendField(locator, this, "totNoOrds", buffer, theTotNoOrds);
        }
        {
            LastFragmentEnumT theLastFragment;
            theLastFragment = this.getLastFragment();
            strategy.appendField(locator, this, "lastFragment", buffer, theLastFragment);
        }
        return buffer;
    }

}
