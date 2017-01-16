//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.01.14 at 04:50:28 PM SGT 
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
 * <p>Java class for InstrmtLegExecGrp_Block_t complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InstrmtLegExecGrp_Block_t"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;group ref="{http://www.fixprotocol.org/FIXML-5-0-SP2}InstrmtLegExecGrpElements"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attGroup ref="{http://www.fixprotocol.org/FIXML-5-0-SP2}InstrmtLegExecGrpAttributes"/&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InstrmtLegExecGrp_Block_t", propOrder = {
    "leg",
    "stip",
    "preAll",
    "pty"
})
public class InstrmtLegExecGrpBlockT
    implements Equals, HashCode, ToString
{

    @XmlElement(name = "Leg")
    protected InstrumentLegBlockT leg;
    @XmlElement(name = "Stip")
    protected List<LegStipulationsBlockT> stip;
    @XmlElement(name = "PreAll")
    protected List<LegPreAllocGrpBlockT> preAll;
    @XmlElement(name = "Pty")
    protected List<NestedParties3BlockT> pty;
    @XmlAttribute(name = "Qty")
    protected BigDecimal qty;
    @XmlAttribute(name = "OrdQty")
    protected BigDecimal ordQty;
    @XmlAttribute(name = "SwapTyp")
    protected BigInteger swapTyp;
    @XmlAttribute(name = "LegAllocID")
    protected String legAllocID;
    @XmlAttribute(name = "PosEfct")
    protected PositionEffectEnumT posEfct;
    @XmlAttribute(name = "Cover")
    protected BigInteger cover;
    @XmlAttribute(name = "RefID")
    protected String refID;
    @XmlAttribute(name = "SettlTyp")
    protected String settlTyp;
    @XmlAttribute(name = "SettlDt")
    protected XMLGregorianCalendar settlDt;
    @XmlAttribute(name = "LastPx")
    protected BigDecimal lastPx;
    @XmlAttribute(name = "SettlCcy")
    protected String settlCcy;
    @XmlAttribute(name = "LegLastFwdPnts")
    protected BigDecimal legLastFwdPnts;
    @XmlAttribute(name = "LegCalcCcyLastQty")
    protected BigDecimal legCalcCcyLastQty;
    @XmlAttribute(name = "LegGrossTrdAmt")
    protected BigDecimal legGrossTrdAmt;
    @XmlAttribute(name = "LegVolatility")
    protected BigDecimal legVolatility;
    @XmlAttribute(name = "LegDividendYield")
    protected BigDecimal legDividendYield;
    @XmlAttribute(name = "LegCurrencyRatio")
    protected BigDecimal legCurrencyRatio;
    @XmlAttribute(name = "LegExecInst")
    protected String legExecInst;
    @XmlAttribute(name = "LastQty")
    protected BigDecimal lastQty;

    /**
     * Gets the value of the leg property.
     * 
     * @return
     *     possible object is
     *     {@link InstrumentLegBlockT }
     *     
     */
    public InstrumentLegBlockT getLeg() {
        return leg;
    }

    /**
     * Sets the value of the leg property.
     * 
     * @param value
     *     allowed object is
     *     {@link InstrumentLegBlockT }
     *     
     */
    public void setLeg(InstrumentLegBlockT value) {
        this.leg = value;
    }

    /**
     * Gets the value of the stip property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the stip property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStip().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LegStipulationsBlockT }
     * 
     * 
     */
    public List<LegStipulationsBlockT> getStip() {
        if (stip == null) {
            stip = new ArrayList<LegStipulationsBlockT>();
        }
        return this.stip;
    }

    /**
     * Gets the value of the preAll property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the preAll property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPreAll().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LegPreAllocGrpBlockT }
     * 
     * 
     */
    public List<LegPreAllocGrpBlockT> getPreAll() {
        if (preAll == null) {
            preAll = new ArrayList<LegPreAllocGrpBlockT>();
        }
        return this.preAll;
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
     * {@link NestedParties3BlockT }
     * 
     * 
     */
    public List<NestedParties3BlockT> getPty() {
        if (pty == null) {
            pty = new ArrayList<NestedParties3BlockT>();
        }
        return this.pty;
    }

    /**
     * Gets the value of the qty property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getQty() {
        return qty;
    }

    /**
     * Sets the value of the qty property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setQty(BigDecimal value) {
        this.qty = value;
    }

    /**
     * Gets the value of the ordQty property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOrdQty() {
        return ordQty;
    }

    /**
     * Sets the value of the ordQty property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOrdQty(BigDecimal value) {
        this.ordQty = value;
    }

    /**
     * Gets the value of the swapTyp property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getSwapTyp() {
        return swapTyp;
    }

    /**
     * Sets the value of the swapTyp property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setSwapTyp(BigInteger value) {
        this.swapTyp = value;
    }

    /**
     * Gets the value of the legAllocID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLegAllocID() {
        return legAllocID;
    }

    /**
     * Sets the value of the legAllocID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLegAllocID(String value) {
        this.legAllocID = value;
    }

    /**
     * Gets the value of the posEfct property.
     * 
     * @return
     *     possible object is
     *     {@link PositionEffectEnumT }
     *     
     */
    public PositionEffectEnumT getPosEfct() {
        return posEfct;
    }

    /**
     * Sets the value of the posEfct property.
     * 
     * @param value
     *     allowed object is
     *     {@link PositionEffectEnumT }
     *     
     */
    public void setPosEfct(PositionEffectEnumT value) {
        this.posEfct = value;
    }

    /**
     * Gets the value of the cover property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getCover() {
        return cover;
    }

    /**
     * Sets the value of the cover property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setCover(BigInteger value) {
        this.cover = value;
    }

    /**
     * Gets the value of the refID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRefID() {
        return refID;
    }

    /**
     * Sets the value of the refID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRefID(String value) {
        this.refID = value;
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
     * Gets the value of the lastPx property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getLastPx() {
        return lastPx;
    }

    /**
     * Sets the value of the lastPx property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setLastPx(BigDecimal value) {
        this.lastPx = value;
    }

    /**
     * Gets the value of the settlCcy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSettlCcy() {
        return settlCcy;
    }

    /**
     * Sets the value of the settlCcy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSettlCcy(String value) {
        this.settlCcy = value;
    }

    /**
     * Gets the value of the legLastFwdPnts property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getLegLastFwdPnts() {
        return legLastFwdPnts;
    }

    /**
     * Sets the value of the legLastFwdPnts property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setLegLastFwdPnts(BigDecimal value) {
        this.legLastFwdPnts = value;
    }

    /**
     * Gets the value of the legCalcCcyLastQty property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getLegCalcCcyLastQty() {
        return legCalcCcyLastQty;
    }

    /**
     * Sets the value of the legCalcCcyLastQty property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setLegCalcCcyLastQty(BigDecimal value) {
        this.legCalcCcyLastQty = value;
    }

    /**
     * Gets the value of the legGrossTrdAmt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getLegGrossTrdAmt() {
        return legGrossTrdAmt;
    }

    /**
     * Sets the value of the legGrossTrdAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setLegGrossTrdAmt(BigDecimal value) {
        this.legGrossTrdAmt = value;
    }

    /**
     * Gets the value of the legVolatility property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getLegVolatility() {
        return legVolatility;
    }

    /**
     * Sets the value of the legVolatility property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setLegVolatility(BigDecimal value) {
        this.legVolatility = value;
    }

    /**
     * Gets the value of the legDividendYield property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getLegDividendYield() {
        return legDividendYield;
    }

    /**
     * Sets the value of the legDividendYield property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setLegDividendYield(BigDecimal value) {
        this.legDividendYield = value;
    }

    /**
     * Gets the value of the legCurrencyRatio property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getLegCurrencyRatio() {
        return legCurrencyRatio;
    }

    /**
     * Sets the value of the legCurrencyRatio property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setLegCurrencyRatio(BigDecimal value) {
        this.legCurrencyRatio = value;
    }

    /**
     * Gets the value of the legExecInst property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLegExecInst() {
        return legExecInst;
    }

    /**
     * Sets the value of the legExecInst property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLegExecInst(String value) {
        this.legExecInst = value;
    }

    /**
     * Gets the value of the lastQty property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getLastQty() {
        return lastQty;
    }

    /**
     * Sets the value of the lastQty property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setLastQty(BigDecimal value) {
        this.lastQty = value;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof InstrmtLegExecGrpBlockT)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final InstrmtLegExecGrpBlockT that = ((InstrmtLegExecGrpBlockT) object);
        {
            InstrumentLegBlockT lhsLeg;
            lhsLeg = this.getLeg();
            InstrumentLegBlockT rhsLeg;
            rhsLeg = that.getLeg();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "leg", lhsLeg), LocatorUtils.property(thatLocator, "leg", rhsLeg), lhsLeg, rhsLeg)) {
                return false;
            }
        }
        {
            List<LegStipulationsBlockT> lhsStip;
            lhsStip = (((this.stip!= null)&&(!this.stip.isEmpty()))?this.getStip():null);
            List<LegStipulationsBlockT> rhsStip;
            rhsStip = (((that.stip!= null)&&(!that.stip.isEmpty()))?that.getStip():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "stip", lhsStip), LocatorUtils.property(thatLocator, "stip", rhsStip), lhsStip, rhsStip)) {
                return false;
            }
        }
        {
            List<LegPreAllocGrpBlockT> lhsPreAll;
            lhsPreAll = (((this.preAll!= null)&&(!this.preAll.isEmpty()))?this.getPreAll():null);
            List<LegPreAllocGrpBlockT> rhsPreAll;
            rhsPreAll = (((that.preAll!= null)&&(!that.preAll.isEmpty()))?that.getPreAll():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "preAll", lhsPreAll), LocatorUtils.property(thatLocator, "preAll", rhsPreAll), lhsPreAll, rhsPreAll)) {
                return false;
            }
        }
        {
            List<NestedParties3BlockT> lhsPty;
            lhsPty = (((this.pty!= null)&&(!this.pty.isEmpty()))?this.getPty():null);
            List<NestedParties3BlockT> rhsPty;
            rhsPty = (((that.pty!= null)&&(!that.pty.isEmpty()))?that.getPty():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "pty", lhsPty), LocatorUtils.property(thatLocator, "pty", rhsPty), lhsPty, rhsPty)) {
                return false;
            }
        }
        {
            BigDecimal lhsQty;
            lhsQty = this.getQty();
            BigDecimal rhsQty;
            rhsQty = that.getQty();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "qty", lhsQty), LocatorUtils.property(thatLocator, "qty", rhsQty), lhsQty, rhsQty)) {
                return false;
            }
        }
        {
            BigDecimal lhsOrdQty;
            lhsOrdQty = this.getOrdQty();
            BigDecimal rhsOrdQty;
            rhsOrdQty = that.getOrdQty();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "ordQty", lhsOrdQty), LocatorUtils.property(thatLocator, "ordQty", rhsOrdQty), lhsOrdQty, rhsOrdQty)) {
                return false;
            }
        }
        {
            BigInteger lhsSwapTyp;
            lhsSwapTyp = this.getSwapTyp();
            BigInteger rhsSwapTyp;
            rhsSwapTyp = that.getSwapTyp();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "swapTyp", lhsSwapTyp), LocatorUtils.property(thatLocator, "swapTyp", rhsSwapTyp), lhsSwapTyp, rhsSwapTyp)) {
                return false;
            }
        }
        {
            String lhsLegAllocID;
            lhsLegAllocID = this.getLegAllocID();
            String rhsLegAllocID;
            rhsLegAllocID = that.getLegAllocID();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "legAllocID", lhsLegAllocID), LocatorUtils.property(thatLocator, "legAllocID", rhsLegAllocID), lhsLegAllocID, rhsLegAllocID)) {
                return false;
            }
        }
        {
            PositionEffectEnumT lhsPosEfct;
            lhsPosEfct = this.getPosEfct();
            PositionEffectEnumT rhsPosEfct;
            rhsPosEfct = that.getPosEfct();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "posEfct", lhsPosEfct), LocatorUtils.property(thatLocator, "posEfct", rhsPosEfct), lhsPosEfct, rhsPosEfct)) {
                return false;
            }
        }
        {
            BigInteger lhsCover;
            lhsCover = this.getCover();
            BigInteger rhsCover;
            rhsCover = that.getCover();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "cover", lhsCover), LocatorUtils.property(thatLocator, "cover", rhsCover), lhsCover, rhsCover)) {
                return false;
            }
        }
        {
            String lhsRefID;
            lhsRefID = this.getRefID();
            String rhsRefID;
            rhsRefID = that.getRefID();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "refID", lhsRefID), LocatorUtils.property(thatLocator, "refID", rhsRefID), lhsRefID, rhsRefID)) {
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
            BigDecimal lhsLastPx;
            lhsLastPx = this.getLastPx();
            BigDecimal rhsLastPx;
            rhsLastPx = that.getLastPx();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "lastPx", lhsLastPx), LocatorUtils.property(thatLocator, "lastPx", rhsLastPx), lhsLastPx, rhsLastPx)) {
                return false;
            }
        }
        {
            String lhsSettlCcy;
            lhsSettlCcy = this.getSettlCcy();
            String rhsSettlCcy;
            rhsSettlCcy = that.getSettlCcy();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "settlCcy", lhsSettlCcy), LocatorUtils.property(thatLocator, "settlCcy", rhsSettlCcy), lhsSettlCcy, rhsSettlCcy)) {
                return false;
            }
        }
        {
            BigDecimal lhsLegLastFwdPnts;
            lhsLegLastFwdPnts = this.getLegLastFwdPnts();
            BigDecimal rhsLegLastFwdPnts;
            rhsLegLastFwdPnts = that.getLegLastFwdPnts();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "legLastFwdPnts", lhsLegLastFwdPnts), LocatorUtils.property(thatLocator, "legLastFwdPnts", rhsLegLastFwdPnts), lhsLegLastFwdPnts, rhsLegLastFwdPnts)) {
                return false;
            }
        }
        {
            BigDecimal lhsLegCalcCcyLastQty;
            lhsLegCalcCcyLastQty = this.getLegCalcCcyLastQty();
            BigDecimal rhsLegCalcCcyLastQty;
            rhsLegCalcCcyLastQty = that.getLegCalcCcyLastQty();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "legCalcCcyLastQty", lhsLegCalcCcyLastQty), LocatorUtils.property(thatLocator, "legCalcCcyLastQty", rhsLegCalcCcyLastQty), lhsLegCalcCcyLastQty, rhsLegCalcCcyLastQty)) {
                return false;
            }
        }
        {
            BigDecimal lhsLegGrossTrdAmt;
            lhsLegGrossTrdAmt = this.getLegGrossTrdAmt();
            BigDecimal rhsLegGrossTrdAmt;
            rhsLegGrossTrdAmt = that.getLegGrossTrdAmt();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "legGrossTrdAmt", lhsLegGrossTrdAmt), LocatorUtils.property(thatLocator, "legGrossTrdAmt", rhsLegGrossTrdAmt), lhsLegGrossTrdAmt, rhsLegGrossTrdAmt)) {
                return false;
            }
        }
        {
            BigDecimal lhsLegVolatility;
            lhsLegVolatility = this.getLegVolatility();
            BigDecimal rhsLegVolatility;
            rhsLegVolatility = that.getLegVolatility();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "legVolatility", lhsLegVolatility), LocatorUtils.property(thatLocator, "legVolatility", rhsLegVolatility), lhsLegVolatility, rhsLegVolatility)) {
                return false;
            }
        }
        {
            BigDecimal lhsLegDividendYield;
            lhsLegDividendYield = this.getLegDividendYield();
            BigDecimal rhsLegDividendYield;
            rhsLegDividendYield = that.getLegDividendYield();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "legDividendYield", lhsLegDividendYield), LocatorUtils.property(thatLocator, "legDividendYield", rhsLegDividendYield), lhsLegDividendYield, rhsLegDividendYield)) {
                return false;
            }
        }
        {
            BigDecimal lhsLegCurrencyRatio;
            lhsLegCurrencyRatio = this.getLegCurrencyRatio();
            BigDecimal rhsLegCurrencyRatio;
            rhsLegCurrencyRatio = that.getLegCurrencyRatio();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "legCurrencyRatio", lhsLegCurrencyRatio), LocatorUtils.property(thatLocator, "legCurrencyRatio", rhsLegCurrencyRatio), lhsLegCurrencyRatio, rhsLegCurrencyRatio)) {
                return false;
            }
        }
        {
            String lhsLegExecInst;
            lhsLegExecInst = this.getLegExecInst();
            String rhsLegExecInst;
            rhsLegExecInst = that.getLegExecInst();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "legExecInst", lhsLegExecInst), LocatorUtils.property(thatLocator, "legExecInst", rhsLegExecInst), lhsLegExecInst, rhsLegExecInst)) {
                return false;
            }
        }
        {
            BigDecimal lhsLastQty;
            lhsLastQty = this.getLastQty();
            BigDecimal rhsLastQty;
            rhsLastQty = that.getLastQty();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "lastQty", lhsLastQty), LocatorUtils.property(thatLocator, "lastQty", rhsLastQty), lhsLastQty, rhsLastQty)) {
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
            InstrumentLegBlockT theLeg;
            theLeg = this.getLeg();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "leg", theLeg), currentHashCode, theLeg);
        }
        {
            List<LegStipulationsBlockT> theStip;
            theStip = (((this.stip!= null)&&(!this.stip.isEmpty()))?this.getStip():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "stip", theStip), currentHashCode, theStip);
        }
        {
            List<LegPreAllocGrpBlockT> thePreAll;
            thePreAll = (((this.preAll!= null)&&(!this.preAll.isEmpty()))?this.getPreAll():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "preAll", thePreAll), currentHashCode, thePreAll);
        }
        {
            List<NestedParties3BlockT> thePty;
            thePty = (((this.pty!= null)&&(!this.pty.isEmpty()))?this.getPty():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "pty", thePty), currentHashCode, thePty);
        }
        {
            BigDecimal theQty;
            theQty = this.getQty();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "qty", theQty), currentHashCode, theQty);
        }
        {
            BigDecimal theOrdQty;
            theOrdQty = this.getOrdQty();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "ordQty", theOrdQty), currentHashCode, theOrdQty);
        }
        {
            BigInteger theSwapTyp;
            theSwapTyp = this.getSwapTyp();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "swapTyp", theSwapTyp), currentHashCode, theSwapTyp);
        }
        {
            String theLegAllocID;
            theLegAllocID = this.getLegAllocID();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "legAllocID", theLegAllocID), currentHashCode, theLegAllocID);
        }
        {
            PositionEffectEnumT thePosEfct;
            thePosEfct = this.getPosEfct();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "posEfct", thePosEfct), currentHashCode, thePosEfct);
        }
        {
            BigInteger theCover;
            theCover = this.getCover();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "cover", theCover), currentHashCode, theCover);
        }
        {
            String theRefID;
            theRefID = this.getRefID();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "refID", theRefID), currentHashCode, theRefID);
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
            BigDecimal theLastPx;
            theLastPx = this.getLastPx();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "lastPx", theLastPx), currentHashCode, theLastPx);
        }
        {
            String theSettlCcy;
            theSettlCcy = this.getSettlCcy();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "settlCcy", theSettlCcy), currentHashCode, theSettlCcy);
        }
        {
            BigDecimal theLegLastFwdPnts;
            theLegLastFwdPnts = this.getLegLastFwdPnts();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "legLastFwdPnts", theLegLastFwdPnts), currentHashCode, theLegLastFwdPnts);
        }
        {
            BigDecimal theLegCalcCcyLastQty;
            theLegCalcCcyLastQty = this.getLegCalcCcyLastQty();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "legCalcCcyLastQty", theLegCalcCcyLastQty), currentHashCode, theLegCalcCcyLastQty);
        }
        {
            BigDecimal theLegGrossTrdAmt;
            theLegGrossTrdAmt = this.getLegGrossTrdAmt();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "legGrossTrdAmt", theLegGrossTrdAmt), currentHashCode, theLegGrossTrdAmt);
        }
        {
            BigDecimal theLegVolatility;
            theLegVolatility = this.getLegVolatility();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "legVolatility", theLegVolatility), currentHashCode, theLegVolatility);
        }
        {
            BigDecimal theLegDividendYield;
            theLegDividendYield = this.getLegDividendYield();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "legDividendYield", theLegDividendYield), currentHashCode, theLegDividendYield);
        }
        {
            BigDecimal theLegCurrencyRatio;
            theLegCurrencyRatio = this.getLegCurrencyRatio();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "legCurrencyRatio", theLegCurrencyRatio), currentHashCode, theLegCurrencyRatio);
        }
        {
            String theLegExecInst;
            theLegExecInst = this.getLegExecInst();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "legExecInst", theLegExecInst), currentHashCode, theLegExecInst);
        }
        {
            BigDecimal theLastQty;
            theLastQty = this.getLastQty();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "lastQty", theLastQty), currentHashCode, theLastQty);
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
            InstrumentLegBlockT theLeg;
            theLeg = this.getLeg();
            strategy.appendField(locator, this, "leg", buffer, theLeg);
        }
        {
            List<LegStipulationsBlockT> theStip;
            theStip = (((this.stip!= null)&&(!this.stip.isEmpty()))?this.getStip():null);
            strategy.appendField(locator, this, "stip", buffer, theStip);
        }
        {
            List<LegPreAllocGrpBlockT> thePreAll;
            thePreAll = (((this.preAll!= null)&&(!this.preAll.isEmpty()))?this.getPreAll():null);
            strategy.appendField(locator, this, "preAll", buffer, thePreAll);
        }
        {
            List<NestedParties3BlockT> thePty;
            thePty = (((this.pty!= null)&&(!this.pty.isEmpty()))?this.getPty():null);
            strategy.appendField(locator, this, "pty", buffer, thePty);
        }
        {
            BigDecimal theQty;
            theQty = this.getQty();
            strategy.appendField(locator, this, "qty", buffer, theQty);
        }
        {
            BigDecimal theOrdQty;
            theOrdQty = this.getOrdQty();
            strategy.appendField(locator, this, "ordQty", buffer, theOrdQty);
        }
        {
            BigInteger theSwapTyp;
            theSwapTyp = this.getSwapTyp();
            strategy.appendField(locator, this, "swapTyp", buffer, theSwapTyp);
        }
        {
            String theLegAllocID;
            theLegAllocID = this.getLegAllocID();
            strategy.appendField(locator, this, "legAllocID", buffer, theLegAllocID);
        }
        {
            PositionEffectEnumT thePosEfct;
            thePosEfct = this.getPosEfct();
            strategy.appendField(locator, this, "posEfct", buffer, thePosEfct);
        }
        {
            BigInteger theCover;
            theCover = this.getCover();
            strategy.appendField(locator, this, "cover", buffer, theCover);
        }
        {
            String theRefID;
            theRefID = this.getRefID();
            strategy.appendField(locator, this, "refID", buffer, theRefID);
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
            BigDecimal theLastPx;
            theLastPx = this.getLastPx();
            strategy.appendField(locator, this, "lastPx", buffer, theLastPx);
        }
        {
            String theSettlCcy;
            theSettlCcy = this.getSettlCcy();
            strategy.appendField(locator, this, "settlCcy", buffer, theSettlCcy);
        }
        {
            BigDecimal theLegLastFwdPnts;
            theLegLastFwdPnts = this.getLegLastFwdPnts();
            strategy.appendField(locator, this, "legLastFwdPnts", buffer, theLegLastFwdPnts);
        }
        {
            BigDecimal theLegCalcCcyLastQty;
            theLegCalcCcyLastQty = this.getLegCalcCcyLastQty();
            strategy.appendField(locator, this, "legCalcCcyLastQty", buffer, theLegCalcCcyLastQty);
        }
        {
            BigDecimal theLegGrossTrdAmt;
            theLegGrossTrdAmt = this.getLegGrossTrdAmt();
            strategy.appendField(locator, this, "legGrossTrdAmt", buffer, theLegGrossTrdAmt);
        }
        {
            BigDecimal theLegVolatility;
            theLegVolatility = this.getLegVolatility();
            strategy.appendField(locator, this, "legVolatility", buffer, theLegVolatility);
        }
        {
            BigDecimal theLegDividendYield;
            theLegDividendYield = this.getLegDividendYield();
            strategy.appendField(locator, this, "legDividendYield", buffer, theLegDividendYield);
        }
        {
            BigDecimal theLegCurrencyRatio;
            theLegCurrencyRatio = this.getLegCurrencyRatio();
            strategy.appendField(locator, this, "legCurrencyRatio", buffer, theLegCurrencyRatio);
        }
        {
            String theLegExecInst;
            theLegExecInst = this.getLegExecInst();
            strategy.appendField(locator, this, "legExecInst", buffer, theLegExecInst);
        }
        {
            BigDecimal theLastQty;
            theLastQty = this.getLastQty();
            strategy.appendField(locator, this, "lastQty", buffer, theLastQty);
        }
        return buffer;
    }

}
