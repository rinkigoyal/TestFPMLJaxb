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
 * <p>Java class for SpreadOrBenchmarkCurveData_Block_t complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SpreadOrBenchmarkCurveData_Block_t"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;group ref="{http://www.fixprotocol.org/FIXML-5-0-SP2}SpreadOrBenchmarkCurveDataElements"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attGroup ref="{http://www.fixprotocol.org/FIXML-5-0-SP2}SpreadOrBenchmarkCurveDataAttributes"/&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SpreadOrBenchmarkCurveData_Block_t")
public class SpreadOrBenchmarkCurveDataBlockT
    implements Equals, HashCode, ToString
{

    @XmlAttribute(name = "Spread")
    protected BigDecimal spread;
    @XmlAttribute(name = "Ccy")
    protected String ccy;
    @XmlAttribute(name = "Name")
    protected BenchmarkCurveNameEnumT name;
    @XmlAttribute(name = "Point")
    protected String point;
    @XmlAttribute(name = "Px")
    protected BigDecimal px;
    @XmlAttribute(name = "PxTyp")
    protected BigInteger pxTyp;
    @XmlAttribute(name = "SecID")
    protected String secID;
    @XmlAttribute(name = "SecIDSrc")
    protected String secIDSrc;

    /**
     * Gets the value of the spread property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSpread() {
        return spread;
    }

    /**
     * Sets the value of the spread property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setSpread(BigDecimal value) {
        this.spread = value;
    }

    /**
     * Gets the value of the ccy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCcy() {
        return ccy;
    }

    /**
     * Sets the value of the ccy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCcy(String value) {
        this.ccy = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link BenchmarkCurveNameEnumT }
     *     
     */
    public BenchmarkCurveNameEnumT getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link BenchmarkCurveNameEnumT }
     *     
     */
    public void setName(BenchmarkCurveNameEnumT value) {
        this.name = value;
    }

    /**
     * Gets the value of the point property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPoint() {
        return point;
    }

    /**
     * Sets the value of the point property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPoint(String value) {
        this.point = value;
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
     * Gets the value of the secID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSecID() {
        return secID;
    }

    /**
     * Sets the value of the secID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSecID(String value) {
        this.secID = value;
    }

    /**
     * Gets the value of the secIDSrc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSecIDSrc() {
        return secIDSrc;
    }

    /**
     * Sets the value of the secIDSrc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSecIDSrc(String value) {
        this.secIDSrc = value;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof SpreadOrBenchmarkCurveDataBlockT)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final SpreadOrBenchmarkCurveDataBlockT that = ((SpreadOrBenchmarkCurveDataBlockT) object);
        {
            BigDecimal lhsSpread;
            lhsSpread = this.getSpread();
            BigDecimal rhsSpread;
            rhsSpread = that.getSpread();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "spread", lhsSpread), LocatorUtils.property(thatLocator, "spread", rhsSpread), lhsSpread, rhsSpread)) {
                return false;
            }
        }
        {
            String lhsCcy;
            lhsCcy = this.getCcy();
            String rhsCcy;
            rhsCcy = that.getCcy();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "ccy", lhsCcy), LocatorUtils.property(thatLocator, "ccy", rhsCcy), lhsCcy, rhsCcy)) {
                return false;
            }
        }
        {
            BenchmarkCurveNameEnumT lhsName;
            lhsName = this.getName();
            BenchmarkCurveNameEnumT rhsName;
            rhsName = that.getName();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "name", lhsName), LocatorUtils.property(thatLocator, "name", rhsName), lhsName, rhsName)) {
                return false;
            }
        }
        {
            String lhsPoint;
            lhsPoint = this.getPoint();
            String rhsPoint;
            rhsPoint = that.getPoint();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "point", lhsPoint), LocatorUtils.property(thatLocator, "point", rhsPoint), lhsPoint, rhsPoint)) {
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
            BigInteger lhsPxTyp;
            lhsPxTyp = this.getPxTyp();
            BigInteger rhsPxTyp;
            rhsPxTyp = that.getPxTyp();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "pxTyp", lhsPxTyp), LocatorUtils.property(thatLocator, "pxTyp", rhsPxTyp), lhsPxTyp, rhsPxTyp)) {
                return false;
            }
        }
        {
            String lhsSecID;
            lhsSecID = this.getSecID();
            String rhsSecID;
            rhsSecID = that.getSecID();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "secID", lhsSecID), LocatorUtils.property(thatLocator, "secID", rhsSecID), lhsSecID, rhsSecID)) {
                return false;
            }
        }
        {
            String lhsSecIDSrc;
            lhsSecIDSrc = this.getSecIDSrc();
            String rhsSecIDSrc;
            rhsSecIDSrc = that.getSecIDSrc();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "secIDSrc", lhsSecIDSrc), LocatorUtils.property(thatLocator, "secIDSrc", rhsSecIDSrc), lhsSecIDSrc, rhsSecIDSrc)) {
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
            BigDecimal theSpread;
            theSpread = this.getSpread();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "spread", theSpread), currentHashCode, theSpread);
        }
        {
            String theCcy;
            theCcy = this.getCcy();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "ccy", theCcy), currentHashCode, theCcy);
        }
        {
            BenchmarkCurveNameEnumT theName;
            theName = this.getName();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "name", theName), currentHashCode, theName);
        }
        {
            String thePoint;
            thePoint = this.getPoint();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "point", thePoint), currentHashCode, thePoint);
        }
        {
            BigDecimal thePx;
            thePx = this.getPx();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "px", thePx), currentHashCode, thePx);
        }
        {
            BigInteger thePxTyp;
            thePxTyp = this.getPxTyp();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "pxTyp", thePxTyp), currentHashCode, thePxTyp);
        }
        {
            String theSecID;
            theSecID = this.getSecID();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "secID", theSecID), currentHashCode, theSecID);
        }
        {
            String theSecIDSrc;
            theSecIDSrc = this.getSecIDSrc();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "secIDSrc", theSecIDSrc), currentHashCode, theSecIDSrc);
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
            BigDecimal theSpread;
            theSpread = this.getSpread();
            strategy.appendField(locator, this, "spread", buffer, theSpread);
        }
        {
            String theCcy;
            theCcy = this.getCcy();
            strategy.appendField(locator, this, "ccy", buffer, theCcy);
        }
        {
            BenchmarkCurveNameEnumT theName;
            theName = this.getName();
            strategy.appendField(locator, this, "name", buffer, theName);
        }
        {
            String thePoint;
            thePoint = this.getPoint();
            strategy.appendField(locator, this, "point", buffer, thePoint);
        }
        {
            BigDecimal thePx;
            thePx = this.getPx();
            strategy.appendField(locator, this, "px", buffer, thePx);
        }
        {
            BigInteger thePxTyp;
            thePxTyp = this.getPxTyp();
            strategy.appendField(locator, this, "pxTyp", buffer, thePxTyp);
        }
        {
            String theSecID;
            theSecID = this.getSecID();
            strategy.appendField(locator, this, "secID", buffer, theSecID);
        }
        {
            String theSecIDSrc;
            theSecIDSrc = this.getSecIDSrc();
            strategy.appendField(locator, this, "secIDSrc", buffer, theSecIDSrc);
        }
        return buffer;
    }

}