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
 * <p>Java class for DisplayInstruction_Block_t complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DisplayInstruction_Block_t"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;group ref="{http://www.fixprotocol.org/FIXML-5-0-SP2}DisplayInstructionElements"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attGroup ref="{http://www.fixprotocol.org/FIXML-5-0-SP2}DisplayInstructionAttributes"/&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DisplayInstruction_Block_t")
public class DisplayInstructionBlockT
    implements Equals, HashCode, ToString
{

    @XmlAttribute(name = "DisplayQty")
    protected BigDecimal displayQty;
    @XmlAttribute(name = "SecDspQty")
    protected BigDecimal secDspQty;
    @XmlAttribute(name = "DspWhn")
    protected String dspWhn;
    @XmlAttribute(name = "DspMthd")
    protected String dspMthd;
    @XmlAttribute(name = "DsplLwQty")
    protected BigDecimal dsplLwQty;
    @XmlAttribute(name = "DisplayHighQty")
    protected BigDecimal displayHighQty;
    @XmlAttribute(name = "DspMinIncr")
    protected BigDecimal dspMinIncr;
    @XmlAttribute(name = "RfrshQty")
    protected BigDecimal rfrshQty;

    /**
     * Gets the value of the displayQty property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDisplayQty() {
        return displayQty;
    }

    /**
     * Sets the value of the displayQty property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDisplayQty(BigDecimal value) {
        this.displayQty = value;
    }

    /**
     * Gets the value of the secDspQty property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSecDspQty() {
        return secDspQty;
    }

    /**
     * Sets the value of the secDspQty property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setSecDspQty(BigDecimal value) {
        this.secDspQty = value;
    }

    /**
     * Gets the value of the dspWhn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDspWhn() {
        return dspWhn;
    }

    /**
     * Sets the value of the dspWhn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDspWhn(String value) {
        this.dspWhn = value;
    }

    /**
     * Gets the value of the dspMthd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDspMthd() {
        return dspMthd;
    }

    /**
     * Sets the value of the dspMthd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDspMthd(String value) {
        this.dspMthd = value;
    }

    /**
     * Gets the value of the dsplLwQty property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDsplLwQty() {
        return dsplLwQty;
    }

    /**
     * Sets the value of the dsplLwQty property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDsplLwQty(BigDecimal value) {
        this.dsplLwQty = value;
    }

    /**
     * Gets the value of the displayHighQty property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDisplayHighQty() {
        return displayHighQty;
    }

    /**
     * Sets the value of the displayHighQty property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDisplayHighQty(BigDecimal value) {
        this.displayHighQty = value;
    }

    /**
     * Gets the value of the dspMinIncr property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDspMinIncr() {
        return dspMinIncr;
    }

    /**
     * Sets the value of the dspMinIncr property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDspMinIncr(BigDecimal value) {
        this.dspMinIncr = value;
    }

    /**
     * Gets the value of the rfrshQty property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRfrshQty() {
        return rfrshQty;
    }

    /**
     * Sets the value of the rfrshQty property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRfrshQty(BigDecimal value) {
        this.rfrshQty = value;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof DisplayInstructionBlockT)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final DisplayInstructionBlockT that = ((DisplayInstructionBlockT) object);
        {
            BigDecimal lhsDisplayQty;
            lhsDisplayQty = this.getDisplayQty();
            BigDecimal rhsDisplayQty;
            rhsDisplayQty = that.getDisplayQty();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "displayQty", lhsDisplayQty), LocatorUtils.property(thatLocator, "displayQty", rhsDisplayQty), lhsDisplayQty, rhsDisplayQty)) {
                return false;
            }
        }
        {
            BigDecimal lhsSecDspQty;
            lhsSecDspQty = this.getSecDspQty();
            BigDecimal rhsSecDspQty;
            rhsSecDspQty = that.getSecDspQty();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "secDspQty", lhsSecDspQty), LocatorUtils.property(thatLocator, "secDspQty", rhsSecDspQty), lhsSecDspQty, rhsSecDspQty)) {
                return false;
            }
        }
        {
            String lhsDspWhn;
            lhsDspWhn = this.getDspWhn();
            String rhsDspWhn;
            rhsDspWhn = that.getDspWhn();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "dspWhn", lhsDspWhn), LocatorUtils.property(thatLocator, "dspWhn", rhsDspWhn), lhsDspWhn, rhsDspWhn)) {
                return false;
            }
        }
        {
            String lhsDspMthd;
            lhsDspMthd = this.getDspMthd();
            String rhsDspMthd;
            rhsDspMthd = that.getDspMthd();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "dspMthd", lhsDspMthd), LocatorUtils.property(thatLocator, "dspMthd", rhsDspMthd), lhsDspMthd, rhsDspMthd)) {
                return false;
            }
        }
        {
            BigDecimal lhsDsplLwQty;
            lhsDsplLwQty = this.getDsplLwQty();
            BigDecimal rhsDsplLwQty;
            rhsDsplLwQty = that.getDsplLwQty();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "dsplLwQty", lhsDsplLwQty), LocatorUtils.property(thatLocator, "dsplLwQty", rhsDsplLwQty), lhsDsplLwQty, rhsDsplLwQty)) {
                return false;
            }
        }
        {
            BigDecimal lhsDisplayHighQty;
            lhsDisplayHighQty = this.getDisplayHighQty();
            BigDecimal rhsDisplayHighQty;
            rhsDisplayHighQty = that.getDisplayHighQty();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "displayHighQty", lhsDisplayHighQty), LocatorUtils.property(thatLocator, "displayHighQty", rhsDisplayHighQty), lhsDisplayHighQty, rhsDisplayHighQty)) {
                return false;
            }
        }
        {
            BigDecimal lhsDspMinIncr;
            lhsDspMinIncr = this.getDspMinIncr();
            BigDecimal rhsDspMinIncr;
            rhsDspMinIncr = that.getDspMinIncr();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "dspMinIncr", lhsDspMinIncr), LocatorUtils.property(thatLocator, "dspMinIncr", rhsDspMinIncr), lhsDspMinIncr, rhsDspMinIncr)) {
                return false;
            }
        }
        {
            BigDecimal lhsRfrshQty;
            lhsRfrshQty = this.getRfrshQty();
            BigDecimal rhsRfrshQty;
            rhsRfrshQty = that.getRfrshQty();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "rfrshQty", lhsRfrshQty), LocatorUtils.property(thatLocator, "rfrshQty", rhsRfrshQty), lhsRfrshQty, rhsRfrshQty)) {
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
            BigDecimal theDisplayQty;
            theDisplayQty = this.getDisplayQty();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "displayQty", theDisplayQty), currentHashCode, theDisplayQty);
        }
        {
            BigDecimal theSecDspQty;
            theSecDspQty = this.getSecDspQty();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "secDspQty", theSecDspQty), currentHashCode, theSecDspQty);
        }
        {
            String theDspWhn;
            theDspWhn = this.getDspWhn();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "dspWhn", theDspWhn), currentHashCode, theDspWhn);
        }
        {
            String theDspMthd;
            theDspMthd = this.getDspMthd();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "dspMthd", theDspMthd), currentHashCode, theDspMthd);
        }
        {
            BigDecimal theDsplLwQty;
            theDsplLwQty = this.getDsplLwQty();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "dsplLwQty", theDsplLwQty), currentHashCode, theDsplLwQty);
        }
        {
            BigDecimal theDisplayHighQty;
            theDisplayHighQty = this.getDisplayHighQty();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "displayHighQty", theDisplayHighQty), currentHashCode, theDisplayHighQty);
        }
        {
            BigDecimal theDspMinIncr;
            theDspMinIncr = this.getDspMinIncr();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "dspMinIncr", theDspMinIncr), currentHashCode, theDspMinIncr);
        }
        {
            BigDecimal theRfrshQty;
            theRfrshQty = this.getRfrshQty();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "rfrshQty", theRfrshQty), currentHashCode, theRfrshQty);
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
            BigDecimal theDisplayQty;
            theDisplayQty = this.getDisplayQty();
            strategy.appendField(locator, this, "displayQty", buffer, theDisplayQty);
        }
        {
            BigDecimal theSecDspQty;
            theSecDspQty = this.getSecDspQty();
            strategy.appendField(locator, this, "secDspQty", buffer, theSecDspQty);
        }
        {
            String theDspWhn;
            theDspWhn = this.getDspWhn();
            strategy.appendField(locator, this, "dspWhn", buffer, theDspWhn);
        }
        {
            String theDspMthd;
            theDspMthd = this.getDspMthd();
            strategy.appendField(locator, this, "dspMthd", buffer, theDspMthd);
        }
        {
            BigDecimal theDsplLwQty;
            theDsplLwQty = this.getDsplLwQty();
            strategy.appendField(locator, this, "dsplLwQty", buffer, theDsplLwQty);
        }
        {
            BigDecimal theDisplayHighQty;
            theDisplayHighQty = this.getDisplayHighQty();
            strategy.appendField(locator, this, "displayHighQty", buffer, theDisplayHighQty);
        }
        {
            BigDecimal theDspMinIncr;
            theDspMinIncr = this.getDspMinIncr();
            strategy.appendField(locator, this, "dspMinIncr", buffer, theDspMinIncr);
        }
        {
            BigDecimal theRfrshQty;
            theRfrshQty = this.getRfrshQty();
            strategy.appendField(locator, this, "rfrshQty", buffer, theRfrshQty);
        }
        return buffer;
    }

}
