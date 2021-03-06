//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.01.17 at 02:08:33 AM SGT 
//


package org.fixprotocol.fixml_5_0_sp2;

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
 * <p>Java class for AffectedOrdGrp_Block_t complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AffectedOrdGrp_Block_t"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;group ref="{http://www.fixprotocol.org/FIXML-5-0-SP2}AffectedOrdGrpElements"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attGroup ref="{http://www.fixprotocol.org/FIXML-5-0-SP2}AffectedOrdGrpAttributes"/&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AffectedOrdGrp_Block_t")
public class AffectedOrdGrpBlockT
    implements Equals, HashCode, ToString
{

    @XmlAttribute(name = "OrigClOrdID")
    protected String origClOrdID;
    @XmlAttribute(name = "AffctdOrdID")
    protected String affctdOrdID;
    @XmlAttribute(name = "AffctdScndOrdID")
    protected String affctdScndOrdID;

    /**
     * Gets the value of the origClOrdID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrigClOrdID() {
        return origClOrdID;
    }

    /**
     * Sets the value of the origClOrdID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrigClOrdID(String value) {
        this.origClOrdID = value;
    }

    /**
     * Gets the value of the affctdOrdID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAffctdOrdID() {
        return affctdOrdID;
    }

    /**
     * Sets the value of the affctdOrdID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAffctdOrdID(String value) {
        this.affctdOrdID = value;
    }

    /**
     * Gets the value of the affctdScndOrdID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAffctdScndOrdID() {
        return affctdScndOrdID;
    }

    /**
     * Sets the value of the affctdScndOrdID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAffctdScndOrdID(String value) {
        this.affctdScndOrdID = value;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof AffectedOrdGrpBlockT)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final AffectedOrdGrpBlockT that = ((AffectedOrdGrpBlockT) object);
        {
            String lhsOrigClOrdID;
            lhsOrigClOrdID = this.getOrigClOrdID();
            String rhsOrigClOrdID;
            rhsOrigClOrdID = that.getOrigClOrdID();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "origClOrdID", lhsOrigClOrdID), LocatorUtils.property(thatLocator, "origClOrdID", rhsOrigClOrdID), lhsOrigClOrdID, rhsOrigClOrdID)) {
                return false;
            }
        }
        {
            String lhsAffctdOrdID;
            lhsAffctdOrdID = this.getAffctdOrdID();
            String rhsAffctdOrdID;
            rhsAffctdOrdID = that.getAffctdOrdID();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "affctdOrdID", lhsAffctdOrdID), LocatorUtils.property(thatLocator, "affctdOrdID", rhsAffctdOrdID), lhsAffctdOrdID, rhsAffctdOrdID)) {
                return false;
            }
        }
        {
            String lhsAffctdScndOrdID;
            lhsAffctdScndOrdID = this.getAffctdScndOrdID();
            String rhsAffctdScndOrdID;
            rhsAffctdScndOrdID = that.getAffctdScndOrdID();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "affctdScndOrdID", lhsAffctdScndOrdID), LocatorUtils.property(thatLocator, "affctdScndOrdID", rhsAffctdScndOrdID), lhsAffctdScndOrdID, rhsAffctdScndOrdID)) {
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
            String theOrigClOrdID;
            theOrigClOrdID = this.getOrigClOrdID();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "origClOrdID", theOrigClOrdID), currentHashCode, theOrigClOrdID);
        }
        {
            String theAffctdOrdID;
            theAffctdOrdID = this.getAffctdOrdID();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "affctdOrdID", theAffctdOrdID), currentHashCode, theAffctdOrdID);
        }
        {
            String theAffctdScndOrdID;
            theAffctdScndOrdID = this.getAffctdScndOrdID();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "affctdScndOrdID", theAffctdScndOrdID), currentHashCode, theAffctdScndOrdID);
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
            String theOrigClOrdID;
            theOrigClOrdID = this.getOrigClOrdID();
            strategy.appendField(locator, this, "origClOrdID", buffer, theOrigClOrdID);
        }
        {
            String theAffctdOrdID;
            theAffctdOrdID = this.getAffctdOrdID();
            strategy.appendField(locator, this, "affctdOrdID", buffer, theAffctdOrdID);
        }
        {
            String theAffctdScndOrdID;
            theAffctdScndOrdID = this.getAffctdScndOrdID();
            strategy.appendField(locator, this, "affctdScndOrdID", buffer, theAffctdScndOrdID);
        }
        return buffer;
    }

}
