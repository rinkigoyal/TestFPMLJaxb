//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.01.17 at 02:08:33 AM SGT 
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
 * <p>Java class for MiscFeesGrp_Block_t complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MiscFeesGrp_Block_t"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;group ref="{http://www.fixprotocol.org/FIXML-5-0-SP2}MiscFeesGrpElements"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attGroup ref="{http://www.fixprotocol.org/FIXML-5-0-SP2}MiscFeesGrpAttributes"/&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MiscFeesGrp_Block_t")
public class MiscFeesGrpBlockT
    implements Equals, HashCode, ToString
{

    @XmlAttribute(name = "Amt")
    protected BigDecimal amt;
    @XmlAttribute(name = "Curr")
    protected String curr;
    @XmlAttribute(name = "Typ")
    protected String typ;
    @XmlAttribute(name = "Basis")
    protected BigInteger basis;

    /**
     * Gets the value of the amt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAmt() {
        return amt;
    }

    /**
     * Sets the value of the amt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAmt(BigDecimal value) {
        this.amt = value;
    }

    /**
     * Gets the value of the curr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurr() {
        return curr;
    }

    /**
     * Sets the value of the curr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurr(String value) {
        this.curr = value;
    }

    /**
     * Gets the value of the typ property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTyp() {
        return typ;
    }

    /**
     * Sets the value of the typ property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTyp(String value) {
        this.typ = value;
    }

    /**
     * Gets the value of the basis property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getBasis() {
        return basis;
    }

    /**
     * Sets the value of the basis property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setBasis(BigInteger value) {
        this.basis = value;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof MiscFeesGrpBlockT)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final MiscFeesGrpBlockT that = ((MiscFeesGrpBlockT) object);
        {
            BigDecimal lhsAmt;
            lhsAmt = this.getAmt();
            BigDecimal rhsAmt;
            rhsAmt = that.getAmt();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "amt", lhsAmt), LocatorUtils.property(thatLocator, "amt", rhsAmt), lhsAmt, rhsAmt)) {
                return false;
            }
        }
        {
            String lhsCurr;
            lhsCurr = this.getCurr();
            String rhsCurr;
            rhsCurr = that.getCurr();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "curr", lhsCurr), LocatorUtils.property(thatLocator, "curr", rhsCurr), lhsCurr, rhsCurr)) {
                return false;
            }
        }
        {
            String lhsTyp;
            lhsTyp = this.getTyp();
            String rhsTyp;
            rhsTyp = that.getTyp();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "typ", lhsTyp), LocatorUtils.property(thatLocator, "typ", rhsTyp), lhsTyp, rhsTyp)) {
                return false;
            }
        }
        {
            BigInteger lhsBasis;
            lhsBasis = this.getBasis();
            BigInteger rhsBasis;
            rhsBasis = that.getBasis();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "basis", lhsBasis), LocatorUtils.property(thatLocator, "basis", rhsBasis), lhsBasis, rhsBasis)) {
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
            BigDecimal theAmt;
            theAmt = this.getAmt();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "amt", theAmt), currentHashCode, theAmt);
        }
        {
            String theCurr;
            theCurr = this.getCurr();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "curr", theCurr), currentHashCode, theCurr);
        }
        {
            String theTyp;
            theTyp = this.getTyp();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "typ", theTyp), currentHashCode, theTyp);
        }
        {
            BigInteger theBasis;
            theBasis = this.getBasis();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "basis", theBasis), currentHashCode, theBasis);
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
            BigDecimal theAmt;
            theAmt = this.getAmt();
            strategy.appendField(locator, this, "amt", buffer, theAmt);
        }
        {
            String theCurr;
            theCurr = this.getCurr();
            strategy.appendField(locator, this, "curr", buffer, theCurr);
        }
        {
            String theTyp;
            theTyp = this.getTyp();
            strategy.appendField(locator, this, "typ", buffer, theTyp);
        }
        {
            BigInteger theBasis;
            theBasis = this.getBasis();
            strategy.appendField(locator, this, "basis", buffer, theBasis);
        }
        return buffer;
    }

}
