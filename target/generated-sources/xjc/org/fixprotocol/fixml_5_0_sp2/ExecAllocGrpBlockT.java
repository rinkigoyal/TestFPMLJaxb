//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.01.17 at 02:08:33 AM SGT 
//


package org.fixprotocol.fixml_5_0_sp2;

import java.math.BigDecimal;
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
 * <p>Java class for ExecAllocGrp_Block_t complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ExecAllocGrp_Block_t"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;group ref="{http://www.fixprotocol.org/FIXML-5-0-SP2}ExecAllocGrpElements"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attGroup ref="{http://www.fixprotocol.org/FIXML-5-0-SP2}ExecAllocGrpAttributes"/&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExecAllocGrp_Block_t")
public class ExecAllocGrpBlockT
    implements Equals, HashCode, ToString
{

    @XmlAttribute(name = "LastQty")
    protected BigDecimal lastQty;
    @XmlAttribute(name = "ExecID")
    protected String execID;
    @XmlAttribute(name = "ExecID2")
    protected String execID2;
    @XmlAttribute(name = "LastPx")
    protected BigDecimal lastPx;
    @XmlAttribute(name = "LastParPx")
    protected BigDecimal lastParPx;
    @XmlAttribute(name = "LastCpcty")
    protected String lastCpcty;
    @XmlAttribute(name = "TrdID")
    protected String trdID;
    @XmlAttribute(name = "FirmTrdID")
    protected String firmTrdID;

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
     * Gets the value of the execID2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExecID2() {
        return execID2;
    }

    /**
     * Sets the value of the execID2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExecID2(String value) {
        this.execID2 = value;
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
     * Gets the value of the lastCpcty property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastCpcty() {
        return lastCpcty;
    }

    /**
     * Sets the value of the lastCpcty property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastCpcty(String value) {
        this.lastCpcty = value;
    }

    /**
     * Gets the value of the trdID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrdID() {
        return trdID;
    }

    /**
     * Sets the value of the trdID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrdID(String value) {
        this.trdID = value;
    }

    /**
     * Gets the value of the firmTrdID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFirmTrdID() {
        return firmTrdID;
    }

    /**
     * Sets the value of the firmTrdID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFirmTrdID(String value) {
        this.firmTrdID = value;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof ExecAllocGrpBlockT)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final ExecAllocGrpBlockT that = ((ExecAllocGrpBlockT) object);
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
            String lhsExecID;
            lhsExecID = this.getExecID();
            String rhsExecID;
            rhsExecID = that.getExecID();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "execID", lhsExecID), LocatorUtils.property(thatLocator, "execID", rhsExecID), lhsExecID, rhsExecID)) {
                return false;
            }
        }
        {
            String lhsExecID2;
            lhsExecID2 = this.getExecID2();
            String rhsExecID2;
            rhsExecID2 = that.getExecID2();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "execID2", lhsExecID2), LocatorUtils.property(thatLocator, "execID2", rhsExecID2), lhsExecID2, rhsExecID2)) {
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
            BigDecimal lhsLastParPx;
            lhsLastParPx = this.getLastParPx();
            BigDecimal rhsLastParPx;
            rhsLastParPx = that.getLastParPx();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "lastParPx", lhsLastParPx), LocatorUtils.property(thatLocator, "lastParPx", rhsLastParPx), lhsLastParPx, rhsLastParPx)) {
                return false;
            }
        }
        {
            String lhsLastCpcty;
            lhsLastCpcty = this.getLastCpcty();
            String rhsLastCpcty;
            rhsLastCpcty = that.getLastCpcty();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "lastCpcty", lhsLastCpcty), LocatorUtils.property(thatLocator, "lastCpcty", rhsLastCpcty), lhsLastCpcty, rhsLastCpcty)) {
                return false;
            }
        }
        {
            String lhsTrdID;
            lhsTrdID = this.getTrdID();
            String rhsTrdID;
            rhsTrdID = that.getTrdID();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "trdID", lhsTrdID), LocatorUtils.property(thatLocator, "trdID", rhsTrdID), lhsTrdID, rhsTrdID)) {
                return false;
            }
        }
        {
            String lhsFirmTrdID;
            lhsFirmTrdID = this.getFirmTrdID();
            String rhsFirmTrdID;
            rhsFirmTrdID = that.getFirmTrdID();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "firmTrdID", lhsFirmTrdID), LocatorUtils.property(thatLocator, "firmTrdID", rhsFirmTrdID), lhsFirmTrdID, rhsFirmTrdID)) {
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
            BigDecimal theLastQty;
            theLastQty = this.getLastQty();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "lastQty", theLastQty), currentHashCode, theLastQty);
        }
        {
            String theExecID;
            theExecID = this.getExecID();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "execID", theExecID), currentHashCode, theExecID);
        }
        {
            String theExecID2;
            theExecID2 = this.getExecID2();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "execID2", theExecID2), currentHashCode, theExecID2);
        }
        {
            BigDecimal theLastPx;
            theLastPx = this.getLastPx();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "lastPx", theLastPx), currentHashCode, theLastPx);
        }
        {
            BigDecimal theLastParPx;
            theLastParPx = this.getLastParPx();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "lastParPx", theLastParPx), currentHashCode, theLastParPx);
        }
        {
            String theLastCpcty;
            theLastCpcty = this.getLastCpcty();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "lastCpcty", theLastCpcty), currentHashCode, theLastCpcty);
        }
        {
            String theTrdID;
            theTrdID = this.getTrdID();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "trdID", theTrdID), currentHashCode, theTrdID);
        }
        {
            String theFirmTrdID;
            theFirmTrdID = this.getFirmTrdID();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "firmTrdID", theFirmTrdID), currentHashCode, theFirmTrdID);
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
            BigDecimal theLastQty;
            theLastQty = this.getLastQty();
            strategy.appendField(locator, this, "lastQty", buffer, theLastQty);
        }
        {
            String theExecID;
            theExecID = this.getExecID();
            strategy.appendField(locator, this, "execID", buffer, theExecID);
        }
        {
            String theExecID2;
            theExecID2 = this.getExecID2();
            strategy.appendField(locator, this, "execID2", buffer, theExecID2);
        }
        {
            BigDecimal theLastPx;
            theLastPx = this.getLastPx();
            strategy.appendField(locator, this, "lastPx", buffer, theLastPx);
        }
        {
            BigDecimal theLastParPx;
            theLastParPx = this.getLastParPx();
            strategy.appendField(locator, this, "lastParPx", buffer, theLastParPx);
        }
        {
            String theLastCpcty;
            theLastCpcty = this.getLastCpcty();
            strategy.appendField(locator, this, "lastCpcty", buffer, theLastCpcty);
        }
        {
            String theTrdID;
            theTrdID = this.getTrdID();
            strategy.appendField(locator, this, "trdID", buffer, theTrdID);
        }
        {
            String theFirmTrdID;
            theFirmTrdID = this.getFirmTrdID();
            strategy.appendField(locator, this, "firmTrdID", buffer, theFirmTrdID);
        }
        return buffer;
    }

}
