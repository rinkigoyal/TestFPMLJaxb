//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.01.14 at 04:50:28 PM SGT 
//


package org.fixprotocol.fixml_5_0_sp2;

import java.math.BigDecimal;
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
 * <p>Java class for OrdListStatGrp_Block_t complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OrdListStatGrp_Block_t"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;group ref="{http://www.fixprotocol.org/FIXML-5-0-SP2}OrdListStatGrpElements"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attGroup ref="{http://www.fixprotocol.org/FIXML-5-0-SP2}OrdListStatGrpAttributes"/&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OrdListStatGrp_Block_t")
public class OrdListStatGrpBlockT
    implements Equals, HashCode, ToString
{

    @XmlAttribute(name = "ClOrdID")
    protected String clOrdID;
    @XmlAttribute(name = "OrdID")
    protected String ordID;
    @XmlAttribute(name = "ClOrdID2")
    protected String clOrdID2;
    @XmlAttribute(name = "CumQty", required = true)
    protected BigDecimal cumQty;
    @XmlAttribute(name = "OrdStat", required = true)
    protected String ordStat;
    @XmlAttribute(name = "WorkingInd")
    protected WorkingIndicatorEnumT workingInd;
    @XmlAttribute(name = "LeavesQty", required = true)
    protected BigDecimal leavesQty;
    @XmlAttribute(name = "CxlQty", required = true)
    protected BigDecimal cxlQty;
    @XmlAttribute(name = "AvgPx", required = true)
    protected BigDecimal avgPx;
    @XmlAttribute(name = "RejRsn")
    protected String rejRsn;
    @XmlAttribute(name = "Txt")
    protected String txt;
    @XmlAttribute(name = "EncTxtLen")
    protected BigInteger encTxtLen;
    @XmlAttribute(name = "EncTxt")
    protected String encTxt;

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
     * Gets the value of the ordStat property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrdStat() {
        return ordStat;
    }

    /**
     * Sets the value of the ordStat property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrdStat(String value) {
        this.ordStat = value;
    }

    /**
     * Gets the value of the workingInd property.
     * 
     * @return
     *     possible object is
     *     {@link WorkingIndicatorEnumT }
     *     
     */
    public WorkingIndicatorEnumT getWorkingInd() {
        return workingInd;
    }

    /**
     * Sets the value of the workingInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link WorkingIndicatorEnumT }
     *     
     */
    public void setWorkingInd(WorkingIndicatorEnumT value) {
        this.workingInd = value;
    }

    /**
     * Gets the value of the leavesQty property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getLeavesQty() {
        return leavesQty;
    }

    /**
     * Sets the value of the leavesQty property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setLeavesQty(BigDecimal value) {
        this.leavesQty = value;
    }

    /**
     * Gets the value of the cxlQty property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCxlQty() {
        return cxlQty;
    }

    /**
     * Sets the value of the cxlQty property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCxlQty(BigDecimal value) {
        this.cxlQty = value;
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
     * Gets the value of the rejRsn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRejRsn() {
        return rejRsn;
    }

    /**
     * Sets the value of the rejRsn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRejRsn(String value) {
        this.rejRsn = value;
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
        if (!(object instanceof OrdListStatGrpBlockT)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final OrdListStatGrpBlockT that = ((OrdListStatGrpBlockT) object);
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
            String lhsOrdID;
            lhsOrdID = this.getOrdID();
            String rhsOrdID;
            rhsOrdID = that.getOrdID();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "ordID", lhsOrdID), LocatorUtils.property(thatLocator, "ordID", rhsOrdID), lhsOrdID, rhsOrdID)) {
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
            BigDecimal lhsCumQty;
            lhsCumQty = this.getCumQty();
            BigDecimal rhsCumQty;
            rhsCumQty = that.getCumQty();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "cumQty", lhsCumQty), LocatorUtils.property(thatLocator, "cumQty", rhsCumQty), lhsCumQty, rhsCumQty)) {
                return false;
            }
        }
        {
            String lhsOrdStat;
            lhsOrdStat = this.getOrdStat();
            String rhsOrdStat;
            rhsOrdStat = that.getOrdStat();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "ordStat", lhsOrdStat), LocatorUtils.property(thatLocator, "ordStat", rhsOrdStat), lhsOrdStat, rhsOrdStat)) {
                return false;
            }
        }
        {
            WorkingIndicatorEnumT lhsWorkingInd;
            lhsWorkingInd = this.getWorkingInd();
            WorkingIndicatorEnumT rhsWorkingInd;
            rhsWorkingInd = that.getWorkingInd();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "workingInd", lhsWorkingInd), LocatorUtils.property(thatLocator, "workingInd", rhsWorkingInd), lhsWorkingInd, rhsWorkingInd)) {
                return false;
            }
        }
        {
            BigDecimal lhsLeavesQty;
            lhsLeavesQty = this.getLeavesQty();
            BigDecimal rhsLeavesQty;
            rhsLeavesQty = that.getLeavesQty();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "leavesQty", lhsLeavesQty), LocatorUtils.property(thatLocator, "leavesQty", rhsLeavesQty), lhsLeavesQty, rhsLeavesQty)) {
                return false;
            }
        }
        {
            BigDecimal lhsCxlQty;
            lhsCxlQty = this.getCxlQty();
            BigDecimal rhsCxlQty;
            rhsCxlQty = that.getCxlQty();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "cxlQty", lhsCxlQty), LocatorUtils.property(thatLocator, "cxlQty", rhsCxlQty), lhsCxlQty, rhsCxlQty)) {
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
            String lhsRejRsn;
            lhsRejRsn = this.getRejRsn();
            String rhsRejRsn;
            rhsRejRsn = that.getRejRsn();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "rejRsn", lhsRejRsn), LocatorUtils.property(thatLocator, "rejRsn", rhsRejRsn), lhsRejRsn, rhsRejRsn)) {
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
        int currentHashCode = 1;
        {
            String theClOrdID;
            theClOrdID = this.getClOrdID();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "clOrdID", theClOrdID), currentHashCode, theClOrdID);
        }
        {
            String theOrdID;
            theOrdID = this.getOrdID();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "ordID", theOrdID), currentHashCode, theOrdID);
        }
        {
            String theClOrdID2;
            theClOrdID2 = this.getClOrdID2();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "clOrdID2", theClOrdID2), currentHashCode, theClOrdID2);
        }
        {
            BigDecimal theCumQty;
            theCumQty = this.getCumQty();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "cumQty", theCumQty), currentHashCode, theCumQty);
        }
        {
            String theOrdStat;
            theOrdStat = this.getOrdStat();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "ordStat", theOrdStat), currentHashCode, theOrdStat);
        }
        {
            WorkingIndicatorEnumT theWorkingInd;
            theWorkingInd = this.getWorkingInd();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "workingInd", theWorkingInd), currentHashCode, theWorkingInd);
        }
        {
            BigDecimal theLeavesQty;
            theLeavesQty = this.getLeavesQty();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "leavesQty", theLeavesQty), currentHashCode, theLeavesQty);
        }
        {
            BigDecimal theCxlQty;
            theCxlQty = this.getCxlQty();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "cxlQty", theCxlQty), currentHashCode, theCxlQty);
        }
        {
            BigDecimal theAvgPx;
            theAvgPx = this.getAvgPx();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "avgPx", theAvgPx), currentHashCode, theAvgPx);
        }
        {
            String theRejRsn;
            theRejRsn = this.getRejRsn();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "rejRsn", theRejRsn), currentHashCode, theRejRsn);
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
        {
            String theClOrdID;
            theClOrdID = this.getClOrdID();
            strategy.appendField(locator, this, "clOrdID", buffer, theClOrdID);
        }
        {
            String theOrdID;
            theOrdID = this.getOrdID();
            strategy.appendField(locator, this, "ordID", buffer, theOrdID);
        }
        {
            String theClOrdID2;
            theClOrdID2 = this.getClOrdID2();
            strategy.appendField(locator, this, "clOrdID2", buffer, theClOrdID2);
        }
        {
            BigDecimal theCumQty;
            theCumQty = this.getCumQty();
            strategy.appendField(locator, this, "cumQty", buffer, theCumQty);
        }
        {
            String theOrdStat;
            theOrdStat = this.getOrdStat();
            strategy.appendField(locator, this, "ordStat", buffer, theOrdStat);
        }
        {
            WorkingIndicatorEnumT theWorkingInd;
            theWorkingInd = this.getWorkingInd();
            strategy.appendField(locator, this, "workingInd", buffer, theWorkingInd);
        }
        {
            BigDecimal theLeavesQty;
            theLeavesQty = this.getLeavesQty();
            strategy.appendField(locator, this, "leavesQty", buffer, theLeavesQty);
        }
        {
            BigDecimal theCxlQty;
            theCxlQty = this.getCxlQty();
            strategy.appendField(locator, this, "cxlQty", buffer, theCxlQty);
        }
        {
            BigDecimal theAvgPx;
            theAvgPx = this.getAvgPx();
            strategy.appendField(locator, this, "avgPx", buffer, theAvgPx);
        }
        {
            String theRejRsn;
            theRejRsn = this.getRejRsn();
            strategy.appendField(locator, this, "rejRsn", buffer, theRejRsn);
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