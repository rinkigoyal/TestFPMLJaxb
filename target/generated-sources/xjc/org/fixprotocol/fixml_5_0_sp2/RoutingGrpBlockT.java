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
 * <p>Java class for RoutingGrp_Block_t complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RoutingGrp_Block_t"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;group ref="{http://www.fixprotocol.org/FIXML-5-0-SP2}RoutingGrpElements"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attGroup ref="{http://www.fixprotocol.org/FIXML-5-0-SP2}RoutingGrpAttributes"/&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RoutingGrp_Block_t")
public class RoutingGrpBlockT
    implements Equals, HashCode, ToString
{

    @XmlAttribute(name = "RtgTyp")
    protected BigInteger rtgTyp;
    @XmlAttribute(name = "RtgID")
    protected String rtgID;

    /**
     * Gets the value of the rtgTyp property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getRtgTyp() {
        return rtgTyp;
    }

    /**
     * Sets the value of the rtgTyp property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setRtgTyp(BigInteger value) {
        this.rtgTyp = value;
    }

    /**
     * Gets the value of the rtgID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRtgID() {
        return rtgID;
    }

    /**
     * Sets the value of the rtgID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRtgID(String value) {
        this.rtgID = value;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof RoutingGrpBlockT)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final RoutingGrpBlockT that = ((RoutingGrpBlockT) object);
        {
            BigInteger lhsRtgTyp;
            lhsRtgTyp = this.getRtgTyp();
            BigInteger rhsRtgTyp;
            rhsRtgTyp = that.getRtgTyp();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "rtgTyp", lhsRtgTyp), LocatorUtils.property(thatLocator, "rtgTyp", rhsRtgTyp), lhsRtgTyp, rhsRtgTyp)) {
                return false;
            }
        }
        {
            String lhsRtgID;
            lhsRtgID = this.getRtgID();
            String rhsRtgID;
            rhsRtgID = that.getRtgID();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "rtgID", lhsRtgID), LocatorUtils.property(thatLocator, "rtgID", rhsRtgID), lhsRtgID, rhsRtgID)) {
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
            BigInteger theRtgTyp;
            theRtgTyp = this.getRtgTyp();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "rtgTyp", theRtgTyp), currentHashCode, theRtgTyp);
        }
        {
            String theRtgID;
            theRtgID = this.getRtgID();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "rtgID", theRtgID), currentHashCode, theRtgID);
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
            BigInteger theRtgTyp;
            theRtgTyp = this.getRtgTyp();
            strategy.appendField(locator, this, "rtgTyp", buffer, theRtgTyp);
        }
        {
            String theRtgID;
            theRtgID = this.getRtgID();
            strategy.appendField(locator, this, "rtgID", buffer, theRtgID);
        }
        return buffer;
    }

}
