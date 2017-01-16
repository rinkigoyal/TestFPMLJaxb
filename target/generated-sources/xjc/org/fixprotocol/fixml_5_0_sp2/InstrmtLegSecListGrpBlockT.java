//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.01.17 at 02:08:33 AM SGT 
//


package org.fixprotocol.fixml_5_0_sp2;

import java.math.BigInteger;
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
 * <p>Java class for InstrmtLegSecListGrp_Block_t complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InstrmtLegSecListGrp_Block_t"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;group ref="{http://www.fixprotocol.org/FIXML-5-0-SP2}InstrmtLegSecListGrpElements"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attGroup ref="{http://www.fixprotocol.org/FIXML-5-0-SP2}InstrmtLegSecListGrpAttributes"/&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InstrmtLegSecListGrp_Block_t", propOrder = {
    "leg",
    "stip",
    "bnchmkCurve"
})
public class InstrmtLegSecListGrpBlockT
    implements Equals, HashCode, ToString
{

    @XmlElement(name = "Leg")
    protected InstrumentLegBlockT leg;
    @XmlElement(name = "Stip")
    protected List<LegStipulationsBlockT> stip;
    @XmlElement(name = "BnchmkCurve")
    protected LegBenchmarkCurveDataBlockT bnchmkCurve;
    @XmlAttribute(name = "SwapTyp")
    protected BigInteger swapTyp;
    @XmlAttribute(name = "SettlTyp")
    protected String settlTyp;

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
     * Gets the value of the bnchmkCurve property.
     * 
     * @return
     *     possible object is
     *     {@link LegBenchmarkCurveDataBlockT }
     *     
     */
    public LegBenchmarkCurveDataBlockT getBnchmkCurve() {
        return bnchmkCurve;
    }

    /**
     * Sets the value of the bnchmkCurve property.
     * 
     * @param value
     *     allowed object is
     *     {@link LegBenchmarkCurveDataBlockT }
     *     
     */
    public void setBnchmkCurve(LegBenchmarkCurveDataBlockT value) {
        this.bnchmkCurve = value;
    }

    /**
     * Gets the value of the swapTyp property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getSwapTyp() {
        return swapTyp;
    }

    /**
     * Sets the value of the swapTyp property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setSwapTyp(BigInteger value) {
        this.swapTyp = value;
    }

    /**
     * Gets the value of the settlTyp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSettlTyp() {
        return settlTyp;
    }

    /**
     * Sets the value of the settlTyp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSettlTyp(String value) {
        this.settlTyp = value;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof InstrmtLegSecListGrpBlockT)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final InstrmtLegSecListGrpBlockT that = ((InstrmtLegSecListGrpBlockT) object);
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
            LegBenchmarkCurveDataBlockT lhsBnchmkCurve;
            lhsBnchmkCurve = this.getBnchmkCurve();
            LegBenchmarkCurveDataBlockT rhsBnchmkCurve;
            rhsBnchmkCurve = that.getBnchmkCurve();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "bnchmkCurve", lhsBnchmkCurve), LocatorUtils.property(thatLocator, "bnchmkCurve", rhsBnchmkCurve), lhsBnchmkCurve, rhsBnchmkCurve)) {
                return false;
            }
        }
        {
            BigInteger lhsSwapTyp;
            lhsSwapTyp = this.getSwapTyp();
            BigInteger rhsSwapTyp;
            rhsSwapTyp = that.getSwapTyp();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "swapTyp", lhsSwapTyp), LocatorUtils.property(thatLocator, "swapTyp", rhsSwapTyp), lhsSwapTyp, rhsSwapTyp)) {
                return false;
            }
        }
        {
            String lhsSettlTyp;
            lhsSettlTyp = this.getSettlTyp();
            String rhsSettlTyp;
            rhsSettlTyp = that.getSettlTyp();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "settlTyp", lhsSettlTyp), LocatorUtils.property(thatLocator, "settlTyp", rhsSettlTyp), lhsSettlTyp, rhsSettlTyp)) {
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
            LegBenchmarkCurveDataBlockT theBnchmkCurve;
            theBnchmkCurve = this.getBnchmkCurve();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "bnchmkCurve", theBnchmkCurve), currentHashCode, theBnchmkCurve);
        }
        {
            BigInteger theSwapTyp;
            theSwapTyp = this.getSwapTyp();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "swapTyp", theSwapTyp), currentHashCode, theSwapTyp);
        }
        {
            String theSettlTyp;
            theSettlTyp = this.getSettlTyp();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "settlTyp", theSettlTyp), currentHashCode, theSettlTyp);
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
            LegBenchmarkCurveDataBlockT theBnchmkCurve;
            theBnchmkCurve = this.getBnchmkCurve();
            strategy.appendField(locator, this, "bnchmkCurve", buffer, theBnchmkCurve);
        }
        {
            BigInteger theSwapTyp;
            theSwapTyp = this.getSwapTyp();
            strategy.appendField(locator, this, "swapTyp", buffer, theSwapTyp);
        }
        {
            String theSettlTyp;
            theSettlTyp = this.getSettlTyp();
            strategy.appendField(locator, this, "settlTyp", buffer, theSettlTyp);
        }
        return buffer;
    }

}
