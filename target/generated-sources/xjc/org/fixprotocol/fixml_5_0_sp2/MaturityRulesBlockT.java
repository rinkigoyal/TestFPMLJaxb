//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.01.14 at 04:50:28 PM SGT 
//


package org.fixprotocol.fixml_5_0_sp2;

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
 * <p>Java class for MaturityRules_Block_t complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MaturityRules_Block_t"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;group ref="{http://www.fixprotocol.org/FIXML-5-0-SP2}MaturityRulesElements"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attGroup ref="{http://www.fixprotocol.org/FIXML-5-0-SP2}MaturityRulesAttributes"/&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MaturityRules_Block_t")
public class MaturityRulesBlockT
    implements Equals, HashCode, ToString
{

    @XmlAttribute(name = "MatRuleID")
    protected String matRuleID;
    @XmlAttribute(name = "MMYFmt")
    protected BigInteger mmyFmt;
    @XmlAttribute(name = "MMYIncrUnits")
    protected BigInteger mmyIncrUnits;
    @XmlAttribute(name = "StartMMY")
    protected String startMMY;
    @XmlAttribute(name = "EndMMY")
    protected String endMMY;
    @XmlAttribute(name = "MMYIncr")
    protected BigInteger mmyIncr;

    /**
     * Gets the value of the matRuleID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMatRuleID() {
        return matRuleID;
    }

    /**
     * Sets the value of the matRuleID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMatRuleID(String value) {
        this.matRuleID = value;
    }

    /**
     * Gets the value of the mmyFmt property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMMYFmt() {
        return mmyFmt;
    }

    /**
     * Sets the value of the mmyFmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMMYFmt(BigInteger value) {
        this.mmyFmt = value;
    }

    /**
     * Gets the value of the mmyIncrUnits property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMMYIncrUnits() {
        return mmyIncrUnits;
    }

    /**
     * Sets the value of the mmyIncrUnits property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMMYIncrUnits(BigInteger value) {
        this.mmyIncrUnits = value;
    }

    /**
     * Gets the value of the startMMY property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStartMMY() {
        return startMMY;
    }

    /**
     * Sets the value of the startMMY property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStartMMY(String value) {
        this.startMMY = value;
    }

    /**
     * Gets the value of the endMMY property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEndMMY() {
        return endMMY;
    }

    /**
     * Sets the value of the endMMY property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEndMMY(String value) {
        this.endMMY = value;
    }

    /**
     * Gets the value of the mmyIncr property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMMYIncr() {
        return mmyIncr;
    }

    /**
     * Sets the value of the mmyIncr property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMMYIncr(BigInteger value) {
        this.mmyIncr = value;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof MaturityRulesBlockT)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final MaturityRulesBlockT that = ((MaturityRulesBlockT) object);
        {
            String lhsMatRuleID;
            lhsMatRuleID = this.getMatRuleID();
            String rhsMatRuleID;
            rhsMatRuleID = that.getMatRuleID();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "matRuleID", lhsMatRuleID), LocatorUtils.property(thatLocator, "matRuleID", rhsMatRuleID), lhsMatRuleID, rhsMatRuleID)) {
                return false;
            }
        }
        {
            BigInteger lhsMMYFmt;
            lhsMMYFmt = this.getMMYFmt();
            BigInteger rhsMMYFmt;
            rhsMMYFmt = that.getMMYFmt();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "mmyFmt", lhsMMYFmt), LocatorUtils.property(thatLocator, "mmyFmt", rhsMMYFmt), lhsMMYFmt, rhsMMYFmt)) {
                return false;
            }
        }
        {
            BigInteger lhsMMYIncrUnits;
            lhsMMYIncrUnits = this.getMMYIncrUnits();
            BigInteger rhsMMYIncrUnits;
            rhsMMYIncrUnits = that.getMMYIncrUnits();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "mmyIncrUnits", lhsMMYIncrUnits), LocatorUtils.property(thatLocator, "mmyIncrUnits", rhsMMYIncrUnits), lhsMMYIncrUnits, rhsMMYIncrUnits)) {
                return false;
            }
        }
        {
            String lhsStartMMY;
            lhsStartMMY = this.getStartMMY();
            String rhsStartMMY;
            rhsStartMMY = that.getStartMMY();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "startMMY", lhsStartMMY), LocatorUtils.property(thatLocator, "startMMY", rhsStartMMY), lhsStartMMY, rhsStartMMY)) {
                return false;
            }
        }
        {
            String lhsEndMMY;
            lhsEndMMY = this.getEndMMY();
            String rhsEndMMY;
            rhsEndMMY = that.getEndMMY();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "endMMY", lhsEndMMY), LocatorUtils.property(thatLocator, "endMMY", rhsEndMMY), lhsEndMMY, rhsEndMMY)) {
                return false;
            }
        }
        {
            BigInteger lhsMMYIncr;
            lhsMMYIncr = this.getMMYIncr();
            BigInteger rhsMMYIncr;
            rhsMMYIncr = that.getMMYIncr();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "mmyIncr", lhsMMYIncr), LocatorUtils.property(thatLocator, "mmyIncr", rhsMMYIncr), lhsMMYIncr, rhsMMYIncr)) {
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
            String theMatRuleID;
            theMatRuleID = this.getMatRuleID();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "matRuleID", theMatRuleID), currentHashCode, theMatRuleID);
        }
        {
            BigInteger theMMYFmt;
            theMMYFmt = this.getMMYFmt();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "mmyFmt", theMMYFmt), currentHashCode, theMMYFmt);
        }
        {
            BigInteger theMMYIncrUnits;
            theMMYIncrUnits = this.getMMYIncrUnits();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "mmyIncrUnits", theMMYIncrUnits), currentHashCode, theMMYIncrUnits);
        }
        {
            String theStartMMY;
            theStartMMY = this.getStartMMY();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "startMMY", theStartMMY), currentHashCode, theStartMMY);
        }
        {
            String theEndMMY;
            theEndMMY = this.getEndMMY();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "endMMY", theEndMMY), currentHashCode, theEndMMY);
        }
        {
            BigInteger theMMYIncr;
            theMMYIncr = this.getMMYIncr();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "mmyIncr", theMMYIncr), currentHashCode, theMMYIncr);
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
            String theMatRuleID;
            theMatRuleID = this.getMatRuleID();
            strategy.appendField(locator, this, "matRuleID", buffer, theMatRuleID);
        }
        {
            BigInteger theMMYFmt;
            theMMYFmt = this.getMMYFmt();
            strategy.appendField(locator, this, "mmyFmt", buffer, theMMYFmt);
        }
        {
            BigInteger theMMYIncrUnits;
            theMMYIncrUnits = this.getMMYIncrUnits();
            strategy.appendField(locator, this, "mmyIncrUnits", buffer, theMMYIncrUnits);
        }
        {
            String theStartMMY;
            theStartMMY = this.getStartMMY();
            strategy.appendField(locator, this, "startMMY", buffer, theStartMMY);
        }
        {
            String theEndMMY;
            theEndMMY = this.getEndMMY();
            strategy.appendField(locator, this, "endMMY", buffer, theEndMMY);
        }
        {
            BigInteger theMMYIncr;
            theMMYIncr = this.getMMYIncr();
            strategy.appendField(locator, this, "mmyIncr", buffer, theMMYIncr);
        }
        return buffer;
    }

}