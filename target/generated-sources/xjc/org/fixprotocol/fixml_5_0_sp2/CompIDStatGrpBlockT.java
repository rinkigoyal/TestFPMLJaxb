//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.01.17 at 02:08:33 AM SGT 
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
 * <p>Java class for CompIDStatGrp_Block_t complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CompIDStatGrp_Block_t"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;group ref="{http://www.fixprotocol.org/FIXML-5-0-SP2}CompIDStatGrpElements"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attGroup ref="{http://www.fixprotocol.org/FIXML-5-0-SP2}CompIDStatGrpAttributes"/&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CompIDStatGrp_Block_t")
public class CompIDStatGrpBlockT
    implements Equals, HashCode, ToString
{

    @XmlAttribute(name = "RefCompID", required = true)
    protected String refCompID;
    @XmlAttribute(name = "RefSubID")
    protected String refSubID;
    @XmlAttribute(name = "LctnID")
    protected String lctnID;
    @XmlAttribute(name = "DeskID")
    protected String deskID;
    @XmlAttribute(name = "StatValu", required = true)
    protected BigInteger statValu;
    @XmlAttribute(name = "StatText")
    protected String statText;

    /**
     * Gets the value of the refCompID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRefCompID() {
        return refCompID;
    }

    /**
     * Sets the value of the refCompID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRefCompID(String value) {
        this.refCompID = value;
    }

    /**
     * Gets the value of the refSubID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRefSubID() {
        return refSubID;
    }

    /**
     * Sets the value of the refSubID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRefSubID(String value) {
        this.refSubID = value;
    }

    /**
     * Gets the value of the lctnID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLctnID() {
        return lctnID;
    }

    /**
     * Sets the value of the lctnID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLctnID(String value) {
        this.lctnID = value;
    }

    /**
     * Gets the value of the deskID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeskID() {
        return deskID;
    }

    /**
     * Sets the value of the deskID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeskID(String value) {
        this.deskID = value;
    }

    /**
     * Gets the value of the statValu property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getStatValu() {
        return statValu;
    }

    /**
     * Sets the value of the statValu property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setStatValu(BigInteger value) {
        this.statValu = value;
    }

    /**
     * Gets the value of the statText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatText() {
        return statText;
    }

    /**
     * Sets the value of the statText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatText(String value) {
        this.statText = value;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof CompIDStatGrpBlockT)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final CompIDStatGrpBlockT that = ((CompIDStatGrpBlockT) object);
        {
            String lhsRefCompID;
            lhsRefCompID = this.getRefCompID();
            String rhsRefCompID;
            rhsRefCompID = that.getRefCompID();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "refCompID", lhsRefCompID), LocatorUtils.property(thatLocator, "refCompID", rhsRefCompID), lhsRefCompID, rhsRefCompID)) {
                return false;
            }
        }
        {
            String lhsRefSubID;
            lhsRefSubID = this.getRefSubID();
            String rhsRefSubID;
            rhsRefSubID = that.getRefSubID();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "refSubID", lhsRefSubID), LocatorUtils.property(thatLocator, "refSubID", rhsRefSubID), lhsRefSubID, rhsRefSubID)) {
                return false;
            }
        }
        {
            String lhsLctnID;
            lhsLctnID = this.getLctnID();
            String rhsLctnID;
            rhsLctnID = that.getLctnID();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "lctnID", lhsLctnID), LocatorUtils.property(thatLocator, "lctnID", rhsLctnID), lhsLctnID, rhsLctnID)) {
                return false;
            }
        }
        {
            String lhsDeskID;
            lhsDeskID = this.getDeskID();
            String rhsDeskID;
            rhsDeskID = that.getDeskID();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "deskID", lhsDeskID), LocatorUtils.property(thatLocator, "deskID", rhsDeskID), lhsDeskID, rhsDeskID)) {
                return false;
            }
        }
        {
            BigInteger lhsStatValu;
            lhsStatValu = this.getStatValu();
            BigInteger rhsStatValu;
            rhsStatValu = that.getStatValu();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "statValu", lhsStatValu), LocatorUtils.property(thatLocator, "statValu", rhsStatValu), lhsStatValu, rhsStatValu)) {
                return false;
            }
        }
        {
            String lhsStatText;
            lhsStatText = this.getStatText();
            String rhsStatText;
            rhsStatText = that.getStatText();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "statText", lhsStatText), LocatorUtils.property(thatLocator, "statText", rhsStatText), lhsStatText, rhsStatText)) {
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
            String theRefCompID;
            theRefCompID = this.getRefCompID();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "refCompID", theRefCompID), currentHashCode, theRefCompID);
        }
        {
            String theRefSubID;
            theRefSubID = this.getRefSubID();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "refSubID", theRefSubID), currentHashCode, theRefSubID);
        }
        {
            String theLctnID;
            theLctnID = this.getLctnID();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "lctnID", theLctnID), currentHashCode, theLctnID);
        }
        {
            String theDeskID;
            theDeskID = this.getDeskID();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "deskID", theDeskID), currentHashCode, theDeskID);
        }
        {
            BigInteger theStatValu;
            theStatValu = this.getStatValu();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "statValu", theStatValu), currentHashCode, theStatValu);
        }
        {
            String theStatText;
            theStatText = this.getStatText();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "statText", theStatText), currentHashCode, theStatText);
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
            String theRefCompID;
            theRefCompID = this.getRefCompID();
            strategy.appendField(locator, this, "refCompID", buffer, theRefCompID);
        }
        {
            String theRefSubID;
            theRefSubID = this.getRefSubID();
            strategy.appendField(locator, this, "refSubID", buffer, theRefSubID);
        }
        {
            String theLctnID;
            theLctnID = this.getLctnID();
            strategy.appendField(locator, this, "lctnID", buffer, theLctnID);
        }
        {
            String theDeskID;
            theDeskID = this.getDeskID();
            strategy.appendField(locator, this, "deskID", buffer, theDeskID);
        }
        {
            BigInteger theStatValu;
            theStatValu = this.getStatValu();
            strategy.appendField(locator, this, "statValu", buffer, theStatValu);
        }
        {
            String theStatText;
            theStatText = this.getStatText();
            strategy.appendField(locator, this, "statText", buffer, theStatText);
        }
        return buffer;
    }

}
