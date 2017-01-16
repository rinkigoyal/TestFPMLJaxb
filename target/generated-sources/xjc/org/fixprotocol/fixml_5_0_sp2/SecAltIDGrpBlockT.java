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
 * <p>Java class for SecAltIDGrp_Block_t complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SecAltIDGrp_Block_t"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;group ref="{http://www.fixprotocol.org/FIXML-5-0-SP2}SecAltIDGrpElements"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attGroup ref="{http://www.fixprotocol.org/FIXML-5-0-SP2}SecAltIDGrpAttributes"/&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SecAltIDGrp_Block_t")
public class SecAltIDGrpBlockT
    implements Equals, HashCode, ToString
{

    @XmlAttribute(name = "AltID")
    protected String altID;
    @XmlAttribute(name = "AltIDSrc")
    protected String altIDSrc;

    /**
     * Gets the value of the altID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAltID() {
        return altID;
    }

    /**
     * Sets the value of the altID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAltID(String value) {
        this.altID = value;
    }

    /**
     * Gets the value of the altIDSrc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAltIDSrc() {
        return altIDSrc;
    }

    /**
     * Sets the value of the altIDSrc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAltIDSrc(String value) {
        this.altIDSrc = value;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof SecAltIDGrpBlockT)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final SecAltIDGrpBlockT that = ((SecAltIDGrpBlockT) object);
        {
            String lhsAltID;
            lhsAltID = this.getAltID();
            String rhsAltID;
            rhsAltID = that.getAltID();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "altID", lhsAltID), LocatorUtils.property(thatLocator, "altID", rhsAltID), lhsAltID, rhsAltID)) {
                return false;
            }
        }
        {
            String lhsAltIDSrc;
            lhsAltIDSrc = this.getAltIDSrc();
            String rhsAltIDSrc;
            rhsAltIDSrc = that.getAltIDSrc();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "altIDSrc", lhsAltIDSrc), LocatorUtils.property(thatLocator, "altIDSrc", rhsAltIDSrc), lhsAltIDSrc, rhsAltIDSrc)) {
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
            String theAltID;
            theAltID = this.getAltID();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "altID", theAltID), currentHashCode, theAltID);
        }
        {
            String theAltIDSrc;
            theAltIDSrc = this.getAltIDSrc();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "altIDSrc", theAltIDSrc), currentHashCode, theAltIDSrc);
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
            String theAltID;
            theAltID = this.getAltID();
            strategy.appendField(locator, this, "altID", buffer, theAltID);
        }
        {
            String theAltIDSrc;
            theAltIDSrc = this.getAltIDSrc();
            strategy.appendField(locator, this, "altIDSrc", buffer, theAltIDSrc);
        }
        return buffer;
    }

}
