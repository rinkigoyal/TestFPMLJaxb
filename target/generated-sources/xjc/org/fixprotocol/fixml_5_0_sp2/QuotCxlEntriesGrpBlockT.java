//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.01.14 at 04:50:28 PM SGT 
//


package org.fixprotocol.fixml_5_0_sp2;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
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
 * <p>Java class for QuotCxlEntriesGrp_Block_t complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="QuotCxlEntriesGrp_Block_t"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;group ref="{http://www.fixprotocol.org/FIXML-5-0-SP2}QuotCxlEntriesGrpElements"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attGroup ref="{http://www.fixprotocol.org/FIXML-5-0-SP2}QuotCxlEntriesGrpAttributes"/&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QuotCxlEntriesGrp_Block_t", propOrder = {
    "instrmt",
    "finDetls",
    "undly",
    "leg"
})
public class QuotCxlEntriesGrpBlockT
    implements Equals, HashCode, ToString
{

    @XmlElement(name = "Instrmt")
    protected InstrumentBlockT instrmt;
    @XmlElement(name = "FinDetls")
    protected FinancingDetailsBlockT finDetls;
    @XmlElement(name = "Undly")
    protected List<UndInstrmtGrpBlockT> undly;
    @XmlElement(name = "Leg")
    protected List<InstrmtLegGrpBlockT> leg;

    /**
     * Gets the value of the instrmt property.
     * 
     * @return
     *     possible object is
     *     {@link InstrumentBlockT }
     *     
     */
    public InstrumentBlockT getInstrmt() {
        return instrmt;
    }

    /**
     * Sets the value of the instrmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link InstrumentBlockT }
     *     
     */
    public void setInstrmt(InstrumentBlockT value) {
        this.instrmt = value;
    }

    /**
     * Gets the value of the finDetls property.
     * 
     * @return
     *     possible object is
     *     {@link FinancingDetailsBlockT }
     *     
     */
    public FinancingDetailsBlockT getFinDetls() {
        return finDetls;
    }

    /**
     * Sets the value of the finDetls property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancingDetailsBlockT }
     *     
     */
    public void setFinDetls(FinancingDetailsBlockT value) {
        this.finDetls = value;
    }

    /**
     * Gets the value of the undly property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the undly property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUndly().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link UndInstrmtGrpBlockT }
     * 
     * 
     */
    public List<UndInstrmtGrpBlockT> getUndly() {
        if (undly == null) {
            undly = new ArrayList<UndInstrmtGrpBlockT>();
        }
        return this.undly;
    }

    /**
     * Gets the value of the leg property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the leg property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLeg().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link InstrmtLegGrpBlockT }
     * 
     * 
     */
    public List<InstrmtLegGrpBlockT> getLeg() {
        if (leg == null) {
            leg = new ArrayList<InstrmtLegGrpBlockT>();
        }
        return this.leg;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof QuotCxlEntriesGrpBlockT)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final QuotCxlEntriesGrpBlockT that = ((QuotCxlEntriesGrpBlockT) object);
        {
            InstrumentBlockT lhsInstrmt;
            lhsInstrmt = this.getInstrmt();
            InstrumentBlockT rhsInstrmt;
            rhsInstrmt = that.getInstrmt();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "instrmt", lhsInstrmt), LocatorUtils.property(thatLocator, "instrmt", rhsInstrmt), lhsInstrmt, rhsInstrmt)) {
                return false;
            }
        }
        {
            FinancingDetailsBlockT lhsFinDetls;
            lhsFinDetls = this.getFinDetls();
            FinancingDetailsBlockT rhsFinDetls;
            rhsFinDetls = that.getFinDetls();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "finDetls", lhsFinDetls), LocatorUtils.property(thatLocator, "finDetls", rhsFinDetls), lhsFinDetls, rhsFinDetls)) {
                return false;
            }
        }
        {
            List<UndInstrmtGrpBlockT> lhsUndly;
            lhsUndly = (((this.undly!= null)&&(!this.undly.isEmpty()))?this.getUndly():null);
            List<UndInstrmtGrpBlockT> rhsUndly;
            rhsUndly = (((that.undly!= null)&&(!that.undly.isEmpty()))?that.getUndly():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "undly", lhsUndly), LocatorUtils.property(thatLocator, "undly", rhsUndly), lhsUndly, rhsUndly)) {
                return false;
            }
        }
        {
            List<InstrmtLegGrpBlockT> lhsLeg;
            lhsLeg = (((this.leg!= null)&&(!this.leg.isEmpty()))?this.getLeg():null);
            List<InstrmtLegGrpBlockT> rhsLeg;
            rhsLeg = (((that.leg!= null)&&(!that.leg.isEmpty()))?that.getLeg():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "leg", lhsLeg), LocatorUtils.property(thatLocator, "leg", rhsLeg), lhsLeg, rhsLeg)) {
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
            InstrumentBlockT theInstrmt;
            theInstrmt = this.getInstrmt();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "instrmt", theInstrmt), currentHashCode, theInstrmt);
        }
        {
            FinancingDetailsBlockT theFinDetls;
            theFinDetls = this.getFinDetls();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "finDetls", theFinDetls), currentHashCode, theFinDetls);
        }
        {
            List<UndInstrmtGrpBlockT> theUndly;
            theUndly = (((this.undly!= null)&&(!this.undly.isEmpty()))?this.getUndly():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "undly", theUndly), currentHashCode, theUndly);
        }
        {
            List<InstrmtLegGrpBlockT> theLeg;
            theLeg = (((this.leg!= null)&&(!this.leg.isEmpty()))?this.getLeg():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "leg", theLeg), currentHashCode, theLeg);
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
            InstrumentBlockT theInstrmt;
            theInstrmt = this.getInstrmt();
            strategy.appendField(locator, this, "instrmt", buffer, theInstrmt);
        }
        {
            FinancingDetailsBlockT theFinDetls;
            theFinDetls = this.getFinDetls();
            strategy.appendField(locator, this, "finDetls", buffer, theFinDetls);
        }
        {
            List<UndInstrmtGrpBlockT> theUndly;
            theUndly = (((this.undly!= null)&&(!this.undly.isEmpty()))?this.getUndly():null);
            strategy.appendField(locator, this, "undly", buffer, theUndly);
        }
        {
            List<InstrmtLegGrpBlockT> theLeg;
            theLeg = (((this.leg!= null)&&(!this.leg.isEmpty()))?this.getLeg():null);
            strategy.appendField(locator, this, "leg", buffer, theLeg);
        }
        return buffer;
    }

}