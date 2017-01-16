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
 * <p>Java class for DiscretionInstructions_Block_t complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DiscretionInstructions_Block_t"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;group ref="{http://www.fixprotocol.org/FIXML-5-0-SP2}DiscretionInstructionsElements"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attGroup ref="{http://www.fixprotocol.org/FIXML-5-0-SP2}DiscretionInstructionsAttributes"/&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DiscretionInstructions_Block_t")
public class DiscretionInstructionsBlockT
    implements Equals, HashCode, ToString
{

    @XmlAttribute(name = "DsctnInst")
    protected String dsctnInst;
    @XmlAttribute(name = "OfstValu")
    protected BigDecimal ofstValu;
    @XmlAttribute(name = "MoveTyp")
    protected BigInteger moveTyp;
    @XmlAttribute(name = "OfstTyp")
    protected BigInteger ofstTyp;
    @XmlAttribute(name = "LimitTyp")
    protected BigInteger limitTyp;
    @XmlAttribute(name = "RndDir")
    protected BigInteger rndDir;
    @XmlAttribute(name = "Scope")
    protected BigInteger scope;

    /**
     * Gets the value of the dsctnInst property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDsctnInst() {
        return dsctnInst;
    }

    /**
     * Sets the value of the dsctnInst property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDsctnInst(String value) {
        this.dsctnInst = value;
    }

    /**
     * Gets the value of the ofstValu property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOfstValu() {
        return ofstValu;
    }

    /**
     * Sets the value of the ofstValu property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOfstValu(BigDecimal value) {
        this.ofstValu = value;
    }

    /**
     * Gets the value of the moveTyp property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMoveTyp() {
        return moveTyp;
    }

    /**
     * Sets the value of the moveTyp property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMoveTyp(BigInteger value) {
        this.moveTyp = value;
    }

    /**
     * Gets the value of the ofstTyp property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getOfstTyp() {
        return ofstTyp;
    }

    /**
     * Sets the value of the ofstTyp property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setOfstTyp(BigInteger value) {
        this.ofstTyp = value;
    }

    /**
     * Gets the value of the limitTyp property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getLimitTyp() {
        return limitTyp;
    }

    /**
     * Sets the value of the limitTyp property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setLimitTyp(BigInteger value) {
        this.limitTyp = value;
    }

    /**
     * Gets the value of the rndDir property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getRndDir() {
        return rndDir;
    }

    /**
     * Sets the value of the rndDir property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setRndDir(BigInteger value) {
        this.rndDir = value;
    }

    /**
     * Gets the value of the scope property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getScope() {
        return scope;
    }

    /**
     * Sets the value of the scope property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setScope(BigInteger value) {
        this.scope = value;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof DiscretionInstructionsBlockT)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final DiscretionInstructionsBlockT that = ((DiscretionInstructionsBlockT) object);
        {
            String lhsDsctnInst;
            lhsDsctnInst = this.getDsctnInst();
            String rhsDsctnInst;
            rhsDsctnInst = that.getDsctnInst();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "dsctnInst", lhsDsctnInst), LocatorUtils.property(thatLocator, "dsctnInst", rhsDsctnInst), lhsDsctnInst, rhsDsctnInst)) {
                return false;
            }
        }
        {
            BigDecimal lhsOfstValu;
            lhsOfstValu = this.getOfstValu();
            BigDecimal rhsOfstValu;
            rhsOfstValu = that.getOfstValu();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "ofstValu", lhsOfstValu), LocatorUtils.property(thatLocator, "ofstValu", rhsOfstValu), lhsOfstValu, rhsOfstValu)) {
                return false;
            }
        }
        {
            BigInteger lhsMoveTyp;
            lhsMoveTyp = this.getMoveTyp();
            BigInteger rhsMoveTyp;
            rhsMoveTyp = that.getMoveTyp();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "moveTyp", lhsMoveTyp), LocatorUtils.property(thatLocator, "moveTyp", rhsMoveTyp), lhsMoveTyp, rhsMoveTyp)) {
                return false;
            }
        }
        {
            BigInteger lhsOfstTyp;
            lhsOfstTyp = this.getOfstTyp();
            BigInteger rhsOfstTyp;
            rhsOfstTyp = that.getOfstTyp();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "ofstTyp", lhsOfstTyp), LocatorUtils.property(thatLocator, "ofstTyp", rhsOfstTyp), lhsOfstTyp, rhsOfstTyp)) {
                return false;
            }
        }
        {
            BigInteger lhsLimitTyp;
            lhsLimitTyp = this.getLimitTyp();
            BigInteger rhsLimitTyp;
            rhsLimitTyp = that.getLimitTyp();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "limitTyp", lhsLimitTyp), LocatorUtils.property(thatLocator, "limitTyp", rhsLimitTyp), lhsLimitTyp, rhsLimitTyp)) {
                return false;
            }
        }
        {
            BigInteger lhsRndDir;
            lhsRndDir = this.getRndDir();
            BigInteger rhsRndDir;
            rhsRndDir = that.getRndDir();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "rndDir", lhsRndDir), LocatorUtils.property(thatLocator, "rndDir", rhsRndDir), lhsRndDir, rhsRndDir)) {
                return false;
            }
        }
        {
            BigInteger lhsScope;
            lhsScope = this.getScope();
            BigInteger rhsScope;
            rhsScope = that.getScope();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "scope", lhsScope), LocatorUtils.property(thatLocator, "scope", rhsScope), lhsScope, rhsScope)) {
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
            String theDsctnInst;
            theDsctnInst = this.getDsctnInst();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "dsctnInst", theDsctnInst), currentHashCode, theDsctnInst);
        }
        {
            BigDecimal theOfstValu;
            theOfstValu = this.getOfstValu();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "ofstValu", theOfstValu), currentHashCode, theOfstValu);
        }
        {
            BigInteger theMoveTyp;
            theMoveTyp = this.getMoveTyp();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "moveTyp", theMoveTyp), currentHashCode, theMoveTyp);
        }
        {
            BigInteger theOfstTyp;
            theOfstTyp = this.getOfstTyp();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "ofstTyp", theOfstTyp), currentHashCode, theOfstTyp);
        }
        {
            BigInteger theLimitTyp;
            theLimitTyp = this.getLimitTyp();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "limitTyp", theLimitTyp), currentHashCode, theLimitTyp);
        }
        {
            BigInteger theRndDir;
            theRndDir = this.getRndDir();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "rndDir", theRndDir), currentHashCode, theRndDir);
        }
        {
            BigInteger theScope;
            theScope = this.getScope();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "scope", theScope), currentHashCode, theScope);
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
            String theDsctnInst;
            theDsctnInst = this.getDsctnInst();
            strategy.appendField(locator, this, "dsctnInst", buffer, theDsctnInst);
        }
        {
            BigDecimal theOfstValu;
            theOfstValu = this.getOfstValu();
            strategy.appendField(locator, this, "ofstValu", buffer, theOfstValu);
        }
        {
            BigInteger theMoveTyp;
            theMoveTyp = this.getMoveTyp();
            strategy.appendField(locator, this, "moveTyp", buffer, theMoveTyp);
        }
        {
            BigInteger theOfstTyp;
            theOfstTyp = this.getOfstTyp();
            strategy.appendField(locator, this, "ofstTyp", buffer, theOfstTyp);
        }
        {
            BigInteger theLimitTyp;
            theLimitTyp = this.getLimitTyp();
            strategy.appendField(locator, this, "limitTyp", buffer, theLimitTyp);
        }
        {
            BigInteger theRndDir;
            theRndDir = this.getRndDir();
            strategy.appendField(locator, this, "rndDir", buffer, theRndDir);
        }
        {
            BigInteger theScope;
            theScope = this.getScope();
            strategy.appendField(locator, this, "scope", buffer, theScope);
        }
        return buffer;
    }

}
