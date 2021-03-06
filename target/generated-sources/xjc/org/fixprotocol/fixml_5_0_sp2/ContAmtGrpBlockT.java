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
 * <p>Java class for ContAmtGrp_Block_t complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ContAmtGrp_Block_t"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;group ref="{http://www.fixprotocol.org/FIXML-5-0-SP2}ContAmtGrpElements"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attGroup ref="{http://www.fixprotocol.org/FIXML-5-0-SP2}ContAmtGrpAttributes"/&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ContAmtGrp_Block_t")
public class ContAmtGrpBlockT
    implements Equals, HashCode, ToString
{

    @XmlAttribute(name = "ContAmtTyp")
    protected BigInteger contAmtTyp;
    @XmlAttribute(name = "ContAmtValu")
    protected BigDecimal contAmtValu;
    @XmlAttribute(name = "ContAmtCurr")
    protected String contAmtCurr;

    /**
     * Gets the value of the contAmtTyp property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getContAmtTyp() {
        return contAmtTyp;
    }

    /**
     * Sets the value of the contAmtTyp property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setContAmtTyp(BigInteger value) {
        this.contAmtTyp = value;
    }

    /**
     * Gets the value of the contAmtValu property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getContAmtValu() {
        return contAmtValu;
    }

    /**
     * Sets the value of the contAmtValu property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setContAmtValu(BigDecimal value) {
        this.contAmtValu = value;
    }

    /**
     * Gets the value of the contAmtCurr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContAmtCurr() {
        return contAmtCurr;
    }

    /**
     * Sets the value of the contAmtCurr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContAmtCurr(String value) {
        this.contAmtCurr = value;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof ContAmtGrpBlockT)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final ContAmtGrpBlockT that = ((ContAmtGrpBlockT) object);
        {
            BigInteger lhsContAmtTyp;
            lhsContAmtTyp = this.getContAmtTyp();
            BigInteger rhsContAmtTyp;
            rhsContAmtTyp = that.getContAmtTyp();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "contAmtTyp", lhsContAmtTyp), LocatorUtils.property(thatLocator, "contAmtTyp", rhsContAmtTyp), lhsContAmtTyp, rhsContAmtTyp)) {
                return false;
            }
        }
        {
            BigDecimal lhsContAmtValu;
            lhsContAmtValu = this.getContAmtValu();
            BigDecimal rhsContAmtValu;
            rhsContAmtValu = that.getContAmtValu();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "contAmtValu", lhsContAmtValu), LocatorUtils.property(thatLocator, "contAmtValu", rhsContAmtValu), lhsContAmtValu, rhsContAmtValu)) {
                return false;
            }
        }
        {
            String lhsContAmtCurr;
            lhsContAmtCurr = this.getContAmtCurr();
            String rhsContAmtCurr;
            rhsContAmtCurr = that.getContAmtCurr();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "contAmtCurr", lhsContAmtCurr), LocatorUtils.property(thatLocator, "contAmtCurr", rhsContAmtCurr), lhsContAmtCurr, rhsContAmtCurr)) {
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
            BigInteger theContAmtTyp;
            theContAmtTyp = this.getContAmtTyp();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "contAmtTyp", theContAmtTyp), currentHashCode, theContAmtTyp);
        }
        {
            BigDecimal theContAmtValu;
            theContAmtValu = this.getContAmtValu();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "contAmtValu", theContAmtValu), currentHashCode, theContAmtValu);
        }
        {
            String theContAmtCurr;
            theContAmtCurr = this.getContAmtCurr();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "contAmtCurr", theContAmtCurr), currentHashCode, theContAmtCurr);
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
            BigInteger theContAmtTyp;
            theContAmtTyp = this.getContAmtTyp();
            strategy.appendField(locator, this, "contAmtTyp", buffer, theContAmtTyp);
        }
        {
            BigDecimal theContAmtValu;
            theContAmtValu = this.getContAmtValu();
            strategy.appendField(locator, this, "contAmtValu", buffer, theContAmtValu);
        }
        {
            String theContAmtCurr;
            theContAmtCurr = this.getContAmtCurr();
            strategy.appendField(locator, this, "contAmtCurr", buffer, theContAmtCurr);
        }
        return buffer;
    }

}
