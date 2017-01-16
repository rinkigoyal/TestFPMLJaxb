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
 * ExecutionAcknowledgement can be found in Volume 4 of the
 * 						specification
 * 
 * <p>Java class for ExecutionAcknowledgement_message_t complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ExecutionAcknowledgement_message_t"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.fixprotocol.org/FIXML-5-0-SP2}Abstract_message_t"&gt;
 *       &lt;sequence&gt;
 *         &lt;group ref="{http://www.fixprotocol.org/FIXML-5-0-SP2}ExecutionAcknowledgementElements"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attGroup ref="{http://www.fixprotocol.org/FIXML-5-0-SP2}ExecutionAcknowledgementAttributes"/&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExecutionAcknowledgement_message_t", propOrder = {
    "instrmt",
    "undly",
    "leg",
    "ordQty"
})
public class ExecutionAcknowledgementMessageT
    extends AbstractMessageT
    implements Equals, HashCode, ToString
{

    @XmlElement(name = "Instrmt", required = true)
    protected InstrumentBlockT instrmt;
    @XmlElement(name = "Undly")
    protected List<UndInstrmtGrpBlockT> undly;
    @XmlElement(name = "Leg")
    protected List<InstrmtLegGrpBlockT> leg;
    @XmlElement(name = "OrdQty", required = true)
    protected OrderQtyDataBlockT ordQty;
    @XmlAttribute(name = "OrdID", required = true)
    protected String ordID;
    @XmlAttribute(name = "OrdID2")
    protected String ordID2;
    @XmlAttribute(name = "ID")
    protected String id;
    @XmlAttribute(name = "ExecAckStat", required = true)
    protected String execAckStat;
    @XmlAttribute(name = "ExecID", required = true)
    protected String execID;
    @XmlAttribute(name = "DkRsn")
    protected DKReasonEnumT dkRsn;
    @XmlAttribute(name = "Side", required = true)
    protected String side;
    @XmlAttribute(name = "LastQty")
    protected BigDecimal lastQty;
    @XmlAttribute(name = "LastPx")
    protected BigDecimal lastPx;
    @XmlAttribute(name = "PxTyp")
    protected BigInteger pxTyp;
    @XmlAttribute(name = "LastParPx")
    protected BigDecimal lastParPx;
    @XmlAttribute(name = "CumQty")
    protected BigDecimal cumQty;
    @XmlAttribute(name = "AvgPx")
    protected BigDecimal avgPx;
    @XmlAttribute(name = "Txt")
    protected String txt;
    @XmlAttribute(name = "EncTxtLen")
    protected BigInteger encTxtLen;
    @XmlAttribute(name = "EncTxt")
    protected String encTxt;

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
     * Gets the value of the leg property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the leg property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLeg().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link InstrmtLegGrpBlockT }
     * 
     * 
     */
    public List<InstrmtLegGrpBlockT> getLeg() {
        if (leg == null) {
            leg = new ArrayList<InstrmtLegGrpBlockT>();
        }
        return this.leg;
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
     * Gets the value of the ordID2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrdID2() {
        return ordID2;
    }

    /**
     * Sets the value of the ordID2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrdID2(String value) {
        this.ordID2 = value;
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
     * Gets the value of the execAckStat property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExecAckStat() {
        return execAckStat;
    }

    /**
     * Sets the value of the execAckStat property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExecAckStat(String value) {
        this.execAckStat = value;
    }

    /**
     * Gets the value of the execID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExecID() {
        return execID;
    }

    /**
     * Sets the value of the execID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExecID(String value) {
        this.execID = value;
    }

    /**
     * Gets the value of the dkRsn property.
     * 
     * @return
     *     possible object is
     *     {@link DKReasonEnumT }
     *     
     */
    public DKReasonEnumT getDkRsn() {
        return dkRsn;
    }

    /**
     * Sets the value of the dkRsn property.
     * 
     * @param value
     *     allowed object is
     *     {@link DKReasonEnumT }
     *     
     */
    public void setDkRsn(DKReasonEnumT value) {
        this.dkRsn = value;
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
     * Gets the value of the pxTyp property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getPxTyp() {
        return pxTyp;
    }

    /**
     * Sets the value of the pxTyp property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setPxTyp(BigInteger value) {
        this.pxTyp = value;
    }

    /**
     * Gets the value of the lastParPx property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getLastParPx() {
        return lastParPx;
    }

    /**
     * Sets the value of the lastParPx property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setLastParPx(BigDecimal value) {
        this.lastParPx = value;
    }

    /**
     * Gets the value of the cumQty property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCumQty() {
        return cumQty;
    }

    /**
     * Sets the value of the cumQty property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCumQty(BigDecimal value) {
        this.cumQty = value;
    }

    /**
     * Gets the value of the avgPx property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAvgPx() {
        return avgPx;
    }

    /**
     * Sets the value of the avgPx property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAvgPx(BigDecimal value) {
        this.avgPx = value;
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
        if (!(object instanceof ExecutionAcknowledgementMessageT)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        if (!super.equals(thisLocator, thatLocator, object, strategy)) {
            return false;
        }
        final ExecutionAcknowledgementMessageT that = ((ExecutionAcknowledgementMessageT) object);
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
            List<UndInstrmtGrpBlockT> lhsUndly;
            lhsUndly = (((this.undly!= null)&&(!this.undly.isEmpty()))?this.getUndly():null);
            List<UndInstrmtGrpBlockT> rhsUndly;
            rhsUndly = (((that.undly!= null)&&(!that.undly.isEmpty()))?that.getUndly():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "undly", lhsUndly), LocatorUtils.property(thatLocator, "undly", rhsUndly), lhsUndly, rhsUndly)) {
                return false;
            }
        }
        {
            List<InstrmtLegGrpBlockT> lhsLeg;
            lhsLeg = (((this.leg!= null)&&(!this.leg.isEmpty()))?this.getLeg():null);
            List<InstrmtLegGrpBlockT> rhsLeg;
            rhsLeg = (((that.leg!= null)&&(!that.leg.isEmpty()))?that.getLeg():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "leg", lhsLeg), LocatorUtils.property(thatLocator, "leg", rhsLeg), lhsLeg, rhsLeg)) {
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
            String lhsOrdID;
            lhsOrdID = this.getOrdID();
            String rhsOrdID;
            rhsOrdID = that.getOrdID();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "ordID", lhsOrdID), LocatorUtils.property(thatLocator, "ordID", rhsOrdID), lhsOrdID, rhsOrdID)) {
                return false;
            }
        }
        {
            String lhsOrdID2;
            lhsOrdID2 = this.getOrdID2();
            String rhsOrdID2;
            rhsOrdID2 = that.getOrdID2();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "ordID2", lhsOrdID2), LocatorUtils.property(thatLocator, "ordID2", rhsOrdID2), lhsOrdID2, rhsOrdID2)) {
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
            String lhsExecAckStat;
            lhsExecAckStat = this.getExecAckStat();
            String rhsExecAckStat;
            rhsExecAckStat = that.getExecAckStat();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "execAckStat", lhsExecAckStat), LocatorUtils.property(thatLocator, "execAckStat", rhsExecAckStat), lhsExecAckStat, rhsExecAckStat)) {
                return false;
            }
        }
        {
            String lhsExecID;
            lhsExecID = this.getExecID();
            String rhsExecID;
            rhsExecID = that.getExecID();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "execID", lhsExecID), LocatorUtils.property(thatLocator, "execID", rhsExecID), lhsExecID, rhsExecID)) {
                return false;
            }
        }
        {
            DKReasonEnumT lhsDkRsn;
            lhsDkRsn = this.getDkRsn();
            DKReasonEnumT rhsDkRsn;
            rhsDkRsn = that.getDkRsn();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "dkRsn", lhsDkRsn), LocatorUtils.property(thatLocator, "dkRsn", rhsDkRsn), lhsDkRsn, rhsDkRsn)) {
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
            BigDecimal lhsLastQty;
            lhsLastQty = this.getLastQty();
            BigDecimal rhsLastQty;
            rhsLastQty = that.getLastQty();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "lastQty", lhsLastQty), LocatorUtils.property(thatLocator, "lastQty", rhsLastQty), lhsLastQty, rhsLastQty)) {
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
            BigInteger lhsPxTyp;
            lhsPxTyp = this.getPxTyp();
            BigInteger rhsPxTyp;
            rhsPxTyp = that.getPxTyp();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "pxTyp", lhsPxTyp), LocatorUtils.property(thatLocator, "pxTyp", rhsPxTyp), lhsPxTyp, rhsPxTyp)) {
                return false;
            }
        }
        {
            BigDecimal lhsLastParPx;
            lhsLastParPx = this.getLastParPx();
            BigDecimal rhsLastParPx;
            rhsLastParPx = that.getLastParPx();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "lastParPx", lhsLastParPx), LocatorUtils.property(thatLocator, "lastParPx", rhsLastParPx), lhsLastParPx, rhsLastParPx)) {
                return false;
            }
        }
        {
            BigDecimal lhsCumQty;
            lhsCumQty = this.getCumQty();
            BigDecimal rhsCumQty;
            rhsCumQty = that.getCumQty();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "cumQty", lhsCumQty), LocatorUtils.property(thatLocator, "cumQty", rhsCumQty), lhsCumQty, rhsCumQty)) {
                return false;
            }
        }
        {
            BigDecimal lhsAvgPx;
            lhsAvgPx = this.getAvgPx();
            BigDecimal rhsAvgPx;
            rhsAvgPx = that.getAvgPx();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "avgPx", lhsAvgPx), LocatorUtils.property(thatLocator, "avgPx", rhsAvgPx), lhsAvgPx, rhsAvgPx)) {
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
            InstrumentBlockT theInstrmt;
            theInstrmt = this.getInstrmt();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "instrmt", theInstrmt), currentHashCode, theInstrmt);
        }
        {
            List<UndInstrmtGrpBlockT> theUndly;
            theUndly = (((this.undly!= null)&&(!this.undly.isEmpty()))?this.getUndly():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "undly", theUndly), currentHashCode, theUndly);
        }
        {
            List<InstrmtLegGrpBlockT> theLeg;
            theLeg = (((this.leg!= null)&&(!this.leg.isEmpty()))?this.getLeg():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "leg", theLeg), currentHashCode, theLeg);
        }
        {
            OrderQtyDataBlockT theOrdQty;
            theOrdQty = this.getOrdQty();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "ordQty", theOrdQty), currentHashCode, theOrdQty);
        }
        {
            String theOrdID;
            theOrdID = this.getOrdID();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "ordID", theOrdID), currentHashCode, theOrdID);
        }
        {
            String theOrdID2;
            theOrdID2 = this.getOrdID2();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "ordID2", theOrdID2), currentHashCode, theOrdID2);
        }
        {
            String theID;
            theID = this.getID();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "id", theID), currentHashCode, theID);
        }
        {
            String theExecAckStat;
            theExecAckStat = this.getExecAckStat();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "execAckStat", theExecAckStat), currentHashCode, theExecAckStat);
        }
        {
            String theExecID;
            theExecID = this.getExecID();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "execID", theExecID), currentHashCode, theExecID);
        }
        {
            DKReasonEnumT theDkRsn;
            theDkRsn = this.getDkRsn();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "dkRsn", theDkRsn), currentHashCode, theDkRsn);
        }
        {
            String theSide;
            theSide = this.getSide();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "side", theSide), currentHashCode, theSide);
        }
        {
            BigDecimal theLastQty;
            theLastQty = this.getLastQty();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "lastQty", theLastQty), currentHashCode, theLastQty);
        }
        {
            BigDecimal theLastPx;
            theLastPx = this.getLastPx();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "lastPx", theLastPx), currentHashCode, theLastPx);
        }
        {
            BigInteger thePxTyp;
            thePxTyp = this.getPxTyp();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "pxTyp", thePxTyp), currentHashCode, thePxTyp);
        }
        {
            BigDecimal theLastParPx;
            theLastParPx = this.getLastParPx();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "lastParPx", theLastParPx), currentHashCode, theLastParPx);
        }
        {
            BigDecimal theCumQty;
            theCumQty = this.getCumQty();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "cumQty", theCumQty), currentHashCode, theCumQty);
        }
        {
            BigDecimal theAvgPx;
            theAvgPx = this.getAvgPx();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "avgPx", theAvgPx), currentHashCode, theAvgPx);
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
            InstrumentBlockT theInstrmt;
            theInstrmt = this.getInstrmt();
            strategy.appendField(locator, this, "instrmt", buffer, theInstrmt);
        }
        {
            List<UndInstrmtGrpBlockT> theUndly;
            theUndly = (((this.undly!= null)&&(!this.undly.isEmpty()))?this.getUndly():null);
            strategy.appendField(locator, this, "undly", buffer, theUndly);
        }
        {
            List<InstrmtLegGrpBlockT> theLeg;
            theLeg = (((this.leg!= null)&&(!this.leg.isEmpty()))?this.getLeg():null);
            strategy.appendField(locator, this, "leg", buffer, theLeg);
        }
        {
            OrderQtyDataBlockT theOrdQty;
            theOrdQty = this.getOrdQty();
            strategy.appendField(locator, this, "ordQty", buffer, theOrdQty);
        }
        {
            String theOrdID;
            theOrdID = this.getOrdID();
            strategy.appendField(locator, this, "ordID", buffer, theOrdID);
        }
        {
            String theOrdID2;
            theOrdID2 = this.getOrdID2();
            strategy.appendField(locator, this, "ordID2", buffer, theOrdID2);
        }
        {
            String theID;
            theID = this.getID();
            strategy.appendField(locator, this, "id", buffer, theID);
        }
        {
            String theExecAckStat;
            theExecAckStat = this.getExecAckStat();
            strategy.appendField(locator, this, "execAckStat", buffer, theExecAckStat);
        }
        {
            String theExecID;
            theExecID = this.getExecID();
            strategy.appendField(locator, this, "execID", buffer, theExecID);
        }
        {
            DKReasonEnumT theDkRsn;
            theDkRsn = this.getDkRsn();
            strategy.appendField(locator, this, "dkRsn", buffer, theDkRsn);
        }
        {
            String theSide;
            theSide = this.getSide();
            strategy.appendField(locator, this, "side", buffer, theSide);
        }
        {
            BigDecimal theLastQty;
            theLastQty = this.getLastQty();
            strategy.appendField(locator, this, "lastQty", buffer, theLastQty);
        }
        {
            BigDecimal theLastPx;
            theLastPx = this.getLastPx();
            strategy.appendField(locator, this, "lastPx", buffer, theLastPx);
        }
        {
            BigInteger thePxTyp;
            thePxTyp = this.getPxTyp();
            strategy.appendField(locator, this, "pxTyp", buffer, thePxTyp);
        }
        {
            BigDecimal theLastParPx;
            theLastParPx = this.getLastParPx();
            strategy.appendField(locator, this, "lastParPx", buffer, theLastParPx);
        }
        {
            BigDecimal theCumQty;
            theCumQty = this.getCumQty();
            strategy.appendField(locator, this, "cumQty", buffer, theCumQty);
        }
        {
            BigDecimal theAvgPx;
            theAvgPx = this.getAvgPx();
            strategy.appendField(locator, this, "avgPx", buffer, theAvgPx);
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
