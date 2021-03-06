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
 * <p>Java class for DerivativeSecurityDefinition_Block_t complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DerivativeSecurityDefinition_Block_t"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;group ref="{http://www.fixprotocol.org/FIXML-5-0-SP2}DerivativeSecurityDefinitionElements"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attGroup ref="{http://www.fixprotocol.org/FIXML-5-0-SP2}DerivativeSecurityDefinitionAttributes"/&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DerivativeSecurityDefinition_Block_t", propOrder = {
    "derivInstrmt",
    "attrb",
    "mktSegGrp"
})
public class DerivativeSecurityDefinitionBlockT
    implements Equals, HashCode, ToString
{

    @XmlElement(name = "DerivInstrmt")
    protected DerivativeInstrumentBlockT derivInstrmt;
    @XmlElement(name = "Attrb")
    protected List<DerivativeInstrumentAttributeBlockT> attrb;
    @XmlElement(name = "MktSegGrp")
    protected List<MarketSegmentGrpBlockT> mktSegGrp;

    /**
     * Gets the value of the derivInstrmt property.
     * 
     * @return
     *     possible object is
     *     {@link DerivativeInstrumentBlockT }
     *     
     */
    public DerivativeInstrumentBlockT getDerivInstrmt() {
        return derivInstrmt;
    }

    /**
     * Sets the value of the derivInstrmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DerivativeInstrumentBlockT }
     *     
     */
    public void setDerivInstrmt(DerivativeInstrumentBlockT value) {
        this.derivInstrmt = value;
    }

    /**
     * Gets the value of the attrb property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the attrb property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAttrb().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DerivativeInstrumentAttributeBlockT }
     * 
     * 
     */
    public List<DerivativeInstrumentAttributeBlockT> getAttrb() {
        if (attrb == null) {
            attrb = new ArrayList<DerivativeInstrumentAttributeBlockT>();
        }
        return this.attrb;
    }

    /**
     * Gets the value of the mktSegGrp property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the mktSegGrp property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMktSegGrp().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MarketSegmentGrpBlockT }
     * 
     * 
     */
    public List<MarketSegmentGrpBlockT> getMktSegGrp() {
        if (mktSegGrp == null) {
            mktSegGrp = new ArrayList<MarketSegmentGrpBlockT>();
        }
        return this.mktSegGrp;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof DerivativeSecurityDefinitionBlockT)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final DerivativeSecurityDefinitionBlockT that = ((DerivativeSecurityDefinitionBlockT) object);
        {
            DerivativeInstrumentBlockT lhsDerivInstrmt;
            lhsDerivInstrmt = this.getDerivInstrmt();
            DerivativeInstrumentBlockT rhsDerivInstrmt;
            rhsDerivInstrmt = that.getDerivInstrmt();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "derivInstrmt", lhsDerivInstrmt), LocatorUtils.property(thatLocator, "derivInstrmt", rhsDerivInstrmt), lhsDerivInstrmt, rhsDerivInstrmt)) {
                return false;
            }
        }
        {
            List<DerivativeInstrumentAttributeBlockT> lhsAttrb;
            lhsAttrb = (((this.attrb!= null)&&(!this.attrb.isEmpty()))?this.getAttrb():null);
            List<DerivativeInstrumentAttributeBlockT> rhsAttrb;
            rhsAttrb = (((that.attrb!= null)&&(!that.attrb.isEmpty()))?that.getAttrb():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "attrb", lhsAttrb), LocatorUtils.property(thatLocator, "attrb", rhsAttrb), lhsAttrb, rhsAttrb)) {
                return false;
            }
        }
        {
            List<MarketSegmentGrpBlockT> lhsMktSegGrp;
            lhsMktSegGrp = (((this.mktSegGrp!= null)&&(!this.mktSegGrp.isEmpty()))?this.getMktSegGrp():null);
            List<MarketSegmentGrpBlockT> rhsMktSegGrp;
            rhsMktSegGrp = (((that.mktSegGrp!= null)&&(!that.mktSegGrp.isEmpty()))?that.getMktSegGrp():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "mktSegGrp", lhsMktSegGrp), LocatorUtils.property(thatLocator, "mktSegGrp", rhsMktSegGrp), lhsMktSegGrp, rhsMktSegGrp)) {
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
            DerivativeInstrumentBlockT theDerivInstrmt;
            theDerivInstrmt = this.getDerivInstrmt();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "derivInstrmt", theDerivInstrmt), currentHashCode, theDerivInstrmt);
        }
        {
            List<DerivativeInstrumentAttributeBlockT> theAttrb;
            theAttrb = (((this.attrb!= null)&&(!this.attrb.isEmpty()))?this.getAttrb():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "attrb", theAttrb), currentHashCode, theAttrb);
        }
        {
            List<MarketSegmentGrpBlockT> theMktSegGrp;
            theMktSegGrp = (((this.mktSegGrp!= null)&&(!this.mktSegGrp.isEmpty()))?this.getMktSegGrp():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "mktSegGrp", theMktSegGrp), currentHashCode, theMktSegGrp);
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
            DerivativeInstrumentBlockT theDerivInstrmt;
            theDerivInstrmt = this.getDerivInstrmt();
            strategy.appendField(locator, this, "derivInstrmt", buffer, theDerivInstrmt);
        }
        {
            List<DerivativeInstrumentAttributeBlockT> theAttrb;
            theAttrb = (((this.attrb!= null)&&(!this.attrb.isEmpty()))?this.getAttrb():null);
            strategy.appendField(locator, this, "attrb", buffer, theAttrb);
        }
        {
            List<MarketSegmentGrpBlockT> theMktSegGrp;
            theMktSegGrp = (((this.mktSegGrp!= null)&&(!this.mktSegGrp.isEmpty()))?this.getMktSegGrp():null);
            strategy.appendField(locator, this, "mktSegGrp", buffer, theMktSegGrp);
        }
        return buffer;
    }

}
