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
 * <p>Java class for ComplexEvents_Block_t complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ComplexEvents_Block_t"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;group ref="{http://www.fixprotocol.org/FIXML-5-0-SP2}ComplexEventsElements"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attGroup ref="{http://www.fixprotocol.org/FIXML-5-0-SP2}ComplexEventsAttributes"/&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ComplexEvents_Block_t", propOrder = {
    "evntDts"
})
public class ComplexEventsBlockT
    implements Equals, HashCode, ToString
{

    @XmlElement(name = "EvntDts")
    protected List<ComplexEventDatesBlockT> evntDts;
    @XmlAttribute(name = "Typ")
    protected BigInteger typ;
    @XmlAttribute(name = "OptPayAmt")
    protected BigDecimal optPayAmt;
    @XmlAttribute(name = "Px")
    protected BigDecimal px;
    @XmlAttribute(name = "PxBndryMeth")
    protected BigInteger pxBndryMeth;
    @XmlAttribute(name = "PxBndryPrcsn")
    protected BigDecimal pxBndryPrcsn;
    @XmlAttribute(name = "PxTmTyp")
    protected BigInteger pxTmTyp;
    @XmlAttribute(name = "Cond")
    protected BigInteger cond;

    /**
     * Gets the value of the evntDts property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the evntDts property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEvntDts().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ComplexEventDatesBlockT }
     * 
     * 
     */
    public List<ComplexEventDatesBlockT> getEvntDts() {
        if (evntDts == null) {
            evntDts = new ArrayList<ComplexEventDatesBlockT>();
        }
        return this.evntDts;
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
     * Gets the value of the optPayAmt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOptPayAmt() {
        return optPayAmt;
    }

    /**
     * Sets the value of the optPayAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOptPayAmt(BigDecimal value) {
        this.optPayAmt = value;
    }

    /**
     * Gets the value of the px property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPx() {
        return px;
    }

    /**
     * Sets the value of the px property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPx(BigDecimal value) {
        this.px = value;
    }

    /**
     * Gets the value of the pxBndryMeth property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getPxBndryMeth() {
        return pxBndryMeth;
    }

    /**
     * Sets the value of the pxBndryMeth property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setPxBndryMeth(BigInteger value) {
        this.pxBndryMeth = value;
    }

    /**
     * Gets the value of the pxBndryPrcsn property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPxBndryPrcsn() {
        return pxBndryPrcsn;
    }

    /**
     * Sets the value of the pxBndryPrcsn property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPxBndryPrcsn(BigDecimal value) {
        this.pxBndryPrcsn = value;
    }

    /**
     * Gets the value of the pxTmTyp property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getPxTmTyp() {
        return pxTmTyp;
    }

    /**
     * Sets the value of the pxTmTyp property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setPxTmTyp(BigInteger value) {
        this.pxTmTyp = value;
    }

    /**
     * Gets the value of the cond property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getCond() {
        return cond;
    }

    /**
     * Sets the value of the cond property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setCond(BigInteger value) {
        this.cond = value;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof ComplexEventsBlockT)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final ComplexEventsBlockT that = ((ComplexEventsBlockT) object);
        {
            List<ComplexEventDatesBlockT> lhsEvntDts;
            lhsEvntDts = (((this.evntDts!= null)&&(!this.evntDts.isEmpty()))?this.getEvntDts():null);
            List<ComplexEventDatesBlockT> rhsEvntDts;
            rhsEvntDts = (((that.evntDts!= null)&&(!that.evntDts.isEmpty()))?that.getEvntDts():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "evntDts", lhsEvntDts), LocatorUtils.property(thatLocator, "evntDts", rhsEvntDts), lhsEvntDts, rhsEvntDts)) {
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
            BigDecimal lhsOptPayAmt;
            lhsOptPayAmt = this.getOptPayAmt();
            BigDecimal rhsOptPayAmt;
            rhsOptPayAmt = that.getOptPayAmt();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "optPayAmt", lhsOptPayAmt), LocatorUtils.property(thatLocator, "optPayAmt", rhsOptPayAmt), lhsOptPayAmt, rhsOptPayAmt)) {
                return false;
            }
        }
        {
            BigDecimal lhsPx;
            lhsPx = this.getPx();
            BigDecimal rhsPx;
            rhsPx = that.getPx();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "px", lhsPx), LocatorUtils.property(thatLocator, "px", rhsPx), lhsPx, rhsPx)) {
                return false;
            }
        }
        {
            BigInteger lhsPxBndryMeth;
            lhsPxBndryMeth = this.getPxBndryMeth();
            BigInteger rhsPxBndryMeth;
            rhsPxBndryMeth = that.getPxBndryMeth();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "pxBndryMeth", lhsPxBndryMeth), LocatorUtils.property(thatLocator, "pxBndryMeth", rhsPxBndryMeth), lhsPxBndryMeth, rhsPxBndryMeth)) {
                return false;
            }
        }
        {
            BigDecimal lhsPxBndryPrcsn;
            lhsPxBndryPrcsn = this.getPxBndryPrcsn();
            BigDecimal rhsPxBndryPrcsn;
            rhsPxBndryPrcsn = that.getPxBndryPrcsn();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "pxBndryPrcsn", lhsPxBndryPrcsn), LocatorUtils.property(thatLocator, "pxBndryPrcsn", rhsPxBndryPrcsn), lhsPxBndryPrcsn, rhsPxBndryPrcsn)) {
                return false;
            }
        }
        {
            BigInteger lhsPxTmTyp;
            lhsPxTmTyp = this.getPxTmTyp();
            BigInteger rhsPxTmTyp;
            rhsPxTmTyp = that.getPxTmTyp();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "pxTmTyp", lhsPxTmTyp), LocatorUtils.property(thatLocator, "pxTmTyp", rhsPxTmTyp), lhsPxTmTyp, rhsPxTmTyp)) {
                return false;
            }
        }
        {
            BigInteger lhsCond;
            lhsCond = this.getCond();
            BigInteger rhsCond;
            rhsCond = that.getCond();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "cond", lhsCond), LocatorUtils.property(thatLocator, "cond", rhsCond), lhsCond, rhsCond)) {
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
            List<ComplexEventDatesBlockT> theEvntDts;
            theEvntDts = (((this.evntDts!= null)&&(!this.evntDts.isEmpty()))?this.getEvntDts():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "evntDts", theEvntDts), currentHashCode, theEvntDts);
        }
        {
            BigInteger theTyp;
            theTyp = this.getTyp();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "typ", theTyp), currentHashCode, theTyp);
        }
        {
            BigDecimal theOptPayAmt;
            theOptPayAmt = this.getOptPayAmt();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "optPayAmt", theOptPayAmt), currentHashCode, theOptPayAmt);
        }
        {
            BigDecimal thePx;
            thePx = this.getPx();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "px", thePx), currentHashCode, thePx);
        }
        {
            BigInteger thePxBndryMeth;
            thePxBndryMeth = this.getPxBndryMeth();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "pxBndryMeth", thePxBndryMeth), currentHashCode, thePxBndryMeth);
        }
        {
            BigDecimal thePxBndryPrcsn;
            thePxBndryPrcsn = this.getPxBndryPrcsn();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "pxBndryPrcsn", thePxBndryPrcsn), currentHashCode, thePxBndryPrcsn);
        }
        {
            BigInteger thePxTmTyp;
            thePxTmTyp = this.getPxTmTyp();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "pxTmTyp", thePxTmTyp), currentHashCode, thePxTmTyp);
        }
        {
            BigInteger theCond;
            theCond = this.getCond();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "cond", theCond), currentHashCode, theCond);
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
            List<ComplexEventDatesBlockT> theEvntDts;
            theEvntDts = (((this.evntDts!= null)&&(!this.evntDts.isEmpty()))?this.getEvntDts():null);
            strategy.appendField(locator, this, "evntDts", buffer, theEvntDts);
        }
        {
            BigInteger theTyp;
            theTyp = this.getTyp();
            strategy.appendField(locator, this, "typ", buffer, theTyp);
        }
        {
            BigDecimal theOptPayAmt;
            theOptPayAmt = this.getOptPayAmt();
            strategy.appendField(locator, this, "optPayAmt", buffer, theOptPayAmt);
        }
        {
            BigDecimal thePx;
            thePx = this.getPx();
            strategy.appendField(locator, this, "px", buffer, thePx);
        }
        {
            BigInteger thePxBndryMeth;
            thePxBndryMeth = this.getPxBndryMeth();
            strategy.appendField(locator, this, "pxBndryMeth", buffer, thePxBndryMeth);
        }
        {
            BigDecimal thePxBndryPrcsn;
            thePxBndryPrcsn = this.getPxBndryPrcsn();
            strategy.appendField(locator, this, "pxBndryPrcsn", buffer, thePxBndryPrcsn);
        }
        {
            BigInteger thePxTmTyp;
            thePxTmTyp = this.getPxTmTyp();
            strategy.appendField(locator, this, "pxTmTyp", buffer, thePxTmTyp);
        }
        {
            BigInteger theCond;
            theCond = this.getCond();
            strategy.appendField(locator, this, "cond", buffer, theCond);
        }
        return buffer;
    }

}
