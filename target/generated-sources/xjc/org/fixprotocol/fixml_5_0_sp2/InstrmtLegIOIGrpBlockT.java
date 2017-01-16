//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.01.17 at 02:08:33 AM SGT 
//


package org.fixprotocol.fixml_5_0_sp2;

import java.util.ArrayList;
import java.util.List;
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
 * <p>Java class for InstrmtLegIOIGrp_Block_t complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InstrmtLegIOIGrp_Block_t"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;group ref="{http://www.fixprotocol.org/FIXML-5-0-SP2}InstrmtLegIOIGrpElements"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attGroup ref="{http://www.fixprotocol.org/FIXML-5-0-SP2}InstrmtLegIOIGrpAttributes"/&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InstrmtLegIOIGrp_Block_t", propOrder = {
    "leg",
    "stip"
})
public class InstrmtLegIOIGrpBlockT
    implements Equals, HashCode, ToString
{

    @XmlElement(name = "Leg")
    protected InstrumentLegBlockT leg;
    @XmlElement(name = "Stip")
    protected List<LegStipulationsBlockT> stip;
    @XmlAttribute(name = "IOIQty")
    protected String ioiQty;

    /**
     * Gets the value of the leg property.
     * 
     * @return
     *     possible object is
     *     {@link InstrumentLegBlockT }
     *     
     */
    public InstrumentLegBlockT getLeg() {
        return leg;
    }

    /**
     * Sets the value of the leg property.
     * 
     * @param value
     *     allowed object is
     *     {@link InstrumentLegBlockT }
     *     
     */
    public void setLeg(InstrumentLegBlockT value) {
        this.leg = value;
    }

    /**
     * Gets the value of the stip property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the stip property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStip().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LegStipulationsBlockT }
     * 
     * 
     */
    public List<LegStipulationsBlockT> getStip() {
        if (stip == null) {
            stip = new ArrayList<LegStipulationsBlockT>();
        }
        return this.stip;
    }

    /**
     * Gets the value of the ioiQty property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIOIQty() {
        return ioiQty;
    }

    /**
     * Sets the value of the ioiQty property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIOIQty(String value) {
        this.ioiQty = value;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof InstrmtLegIOIGrpBlockT)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final InstrmtLegIOIGrpBlockT that = ((InstrmtLegIOIGrpBlockT) object);
        {
            InstrumentLegBlockT lhsLeg;
            lhsLeg = this.getLeg();
            InstrumentLegBlockT rhsLeg;
            rhsLeg = that.getLeg();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "leg", lhsLeg), LocatorUtils.property(thatLocator, "leg", rhsLeg), lhsLeg, rhsLeg)) {
                return false;
            }
        }
        {
            List<LegStipulationsBlockT> lhsStip;
            lhsStip = (((this.stip!= null)&&(!this.stip.isEmpty()))?this.getStip():null);
            List<LegStipulationsBlockT> rhsStip;
            rhsStip = (((that.stip!= null)&&(!that.stip.isEmpty()))?that.getStip():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "stip", lhsStip), LocatorUtils.property(thatLocator, "stip", rhsStip), lhsStip, rhsStip)) {
                return false;
            }
        }
        {
            String lhsIOIQty;
            lhsIOIQty = this.getIOIQty();
            String rhsIOIQty;
            rhsIOIQty = that.getIOIQty();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "ioiQty", lhsIOIQty), LocatorUtils.property(thatLocator, "ioiQty", rhsIOIQty), lhsIOIQty, rhsIOIQty)) {
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
            InstrumentLegBlockT theLeg;
            theLeg = this.getLeg();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "leg", theLeg), currentHashCode, theLeg);
        }
        {
            List<LegStipulationsBlockT> theStip;
            theStip = (((this.stip!= null)&&(!this.stip.isEmpty()))?this.getStip():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "stip", theStip), currentHashCode, theStip);
        }
        {
            String theIOIQty;
            theIOIQty = this.getIOIQty();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "ioiQty", theIOIQty), currentHashCode, theIOIQty);
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
            InstrumentLegBlockT theLeg;
            theLeg = this.getLeg();
            strategy.appendField(locator, this, "leg", buffer, theLeg);
        }
        {
            List<LegStipulationsBlockT> theStip;
            theStip = (((this.stip!= null)&&(!this.stip.isEmpty()))?this.getStip():null);
            strategy.appendField(locator, this, "stip", buffer, theStip);
        }
        {
            String theIOIQty;
            theIOIQty = this.getIOIQty();
            strategy.appendField(locator, this, "ioiQty", buffer, theIOIQty);
        }
        return buffer;
    }

}
