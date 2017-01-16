//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.01.14 at 04:50:28 PM SGT 
//


package org.fixprotocol.fixml_5_0_sp2;

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
 * <p>Java class for TradingSessionRulesGrp_Block_t complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TradingSessionRulesGrp_Block_t"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;group ref="{http://www.fixprotocol.org/FIXML-5-0-SP2}TradingSessionRulesGrpElements"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attGroup ref="{http://www.fixprotocol.org/FIXML-5-0-SP2}TradingSessionRulesGrpAttributes"/&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TradingSessionRulesGrp_Block_t", propOrder = {
    "trdgSesRules"
})
public class TradingSessionRulesGrpBlockT
    implements Equals, HashCode, ToString
{

    @XmlElement(name = "TrdgSesRules")
    protected TradingSessionRulesBlockT trdgSesRules;
    @XmlAttribute(name = "SesID")
    protected String sesID;
    @XmlAttribute(name = "SesSub")
    protected String sesSub;

    /**
     * Gets the value of the trdgSesRules property.
     * 
     * @return
     *     possible object is
     *     {@link TradingSessionRulesBlockT }
     *     
     */
    public TradingSessionRulesBlockT getTrdgSesRules() {
        return trdgSesRules;
    }

    /**
     * Sets the value of the trdgSesRules property.
     * 
     * @param value
     *     allowed object is
     *     {@link TradingSessionRulesBlockT }
     *     
     */
    public void setTrdgSesRules(TradingSessionRulesBlockT value) {
        this.trdgSesRules = value;
    }

    /**
     * Gets the value of the sesID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSesID() {
        return sesID;
    }

    /**
     * Sets the value of the sesID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSesID(String value) {
        this.sesID = value;
    }

    /**
     * Gets the value of the sesSub property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSesSub() {
        return sesSub;
    }

    /**
     * Sets the value of the sesSub property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSesSub(String value) {
        this.sesSub = value;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof TradingSessionRulesGrpBlockT)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final TradingSessionRulesGrpBlockT that = ((TradingSessionRulesGrpBlockT) object);
        {
            TradingSessionRulesBlockT lhsTrdgSesRules;
            lhsTrdgSesRules = this.getTrdgSesRules();
            TradingSessionRulesBlockT rhsTrdgSesRules;
            rhsTrdgSesRules = that.getTrdgSesRules();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "trdgSesRules", lhsTrdgSesRules), LocatorUtils.property(thatLocator, "trdgSesRules", rhsTrdgSesRules), lhsTrdgSesRules, rhsTrdgSesRules)) {
                return false;
            }
        }
        {
            String lhsSesID;
            lhsSesID = this.getSesID();
            String rhsSesID;
            rhsSesID = that.getSesID();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "sesID", lhsSesID), LocatorUtils.property(thatLocator, "sesID", rhsSesID), lhsSesID, rhsSesID)) {
                return false;
            }
        }
        {
            String lhsSesSub;
            lhsSesSub = this.getSesSub();
            String rhsSesSub;
            rhsSesSub = that.getSesSub();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "sesSub", lhsSesSub), LocatorUtils.property(thatLocator, "sesSub", rhsSesSub), lhsSesSub, rhsSesSub)) {
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
            TradingSessionRulesBlockT theTrdgSesRules;
            theTrdgSesRules = this.getTrdgSesRules();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "trdgSesRules", theTrdgSesRules), currentHashCode, theTrdgSesRules);
        }
        {
            String theSesID;
            theSesID = this.getSesID();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "sesID", theSesID), currentHashCode, theSesID);
        }
        {
            String theSesSub;
            theSesSub = this.getSesSub();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "sesSub", theSesSub), currentHashCode, theSesSub);
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
            TradingSessionRulesBlockT theTrdgSesRules;
            theTrdgSesRules = this.getTrdgSesRules();
            strategy.appendField(locator, this, "trdgSesRules", buffer, theTrdgSesRules);
        }
        {
            String theSesID;
            theSesID = this.getSesID();
            strategy.appendField(locator, this, "sesID", buffer, theSesID);
        }
        {
            String theSesSub;
            theSesSub = this.getSesSub();
            strategy.appendField(locator, this, "sesSub", buffer, theSesSub);
        }
        return buffer;
    }

}