//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.01.17 at 02:08:33 AM SGT 
//


package org.fixprotocol.fixml_5_0_sp2;

import java.math.BigDecimal;
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
 * <p>Java class for InstrumentExtension_Block_t complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InstrumentExtension_Block_t"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;group ref="{http://www.fixprotocol.org/FIXML-5-0-SP2}InstrumentExtensionElements"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attGroup ref="{http://www.fixprotocol.org/FIXML-5-0-SP2}InstrumentExtensionAttributes"/&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InstrumentExtension_Block_t", propOrder = {
    "attrb"
})
public class InstrumentExtensionBlockT
    implements Equals, HashCode, ToString
{

    @XmlElement(name = "Attrb")
    protected List<AttrbGrpBlockT> attrb;
    @XmlAttribute(name = "DlvryForm")
    protected BigInteger dlvryForm;
    @XmlAttribute(name = "PctAtRisk")
    protected BigDecimal pctAtRisk;

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
     * {@link AttrbGrpBlockT }
     * 
     * 
     */
    public List<AttrbGrpBlockT> getAttrb() {
        if (attrb == null) {
            attrb = new ArrayList<AttrbGrpBlockT>();
        }
        return this.attrb;
    }

    /**
     * Gets the value of the dlvryForm property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getDlvryForm() {
        return dlvryForm;
    }

    /**
     * Sets the value of the dlvryForm property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setDlvryForm(BigInteger value) {
        this.dlvryForm = value;
    }

    /**
     * Gets the value of the pctAtRisk property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPctAtRisk() {
        return pctAtRisk;
    }

    /**
     * Sets the value of the pctAtRisk property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPctAtRisk(BigDecimal value) {
        this.pctAtRisk = value;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof InstrumentExtensionBlockT)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final InstrumentExtensionBlockT that = ((InstrumentExtensionBlockT) object);
        {
            List<AttrbGrpBlockT> lhsAttrb;
            lhsAttrb = (((this.attrb!= null)&&(!this.attrb.isEmpty()))?this.getAttrb():null);
            List<AttrbGrpBlockT> rhsAttrb;
            rhsAttrb = (((that.attrb!= null)&&(!that.attrb.isEmpty()))?that.getAttrb():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "attrb", lhsAttrb), LocatorUtils.property(thatLocator, "attrb", rhsAttrb), lhsAttrb, rhsAttrb)) {
                return false;
            }
        }
        {
            BigInteger lhsDlvryForm;
            lhsDlvryForm = this.getDlvryForm();
            BigInteger rhsDlvryForm;
            rhsDlvryForm = that.getDlvryForm();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "dlvryForm", lhsDlvryForm), LocatorUtils.property(thatLocator, "dlvryForm", rhsDlvryForm), lhsDlvryForm, rhsDlvryForm)) {
                return false;
            }
        }
        {
            BigDecimal lhsPctAtRisk;
            lhsPctAtRisk = this.getPctAtRisk();
            BigDecimal rhsPctAtRisk;
            rhsPctAtRisk = that.getPctAtRisk();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "pctAtRisk", lhsPctAtRisk), LocatorUtils.property(thatLocator, "pctAtRisk", rhsPctAtRisk), lhsPctAtRisk, rhsPctAtRisk)) {
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
            List<AttrbGrpBlockT> theAttrb;
            theAttrb = (((this.attrb!= null)&&(!this.attrb.isEmpty()))?this.getAttrb():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "attrb", theAttrb), currentHashCode, theAttrb);
        }
        {
            BigInteger theDlvryForm;
            theDlvryForm = this.getDlvryForm();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "dlvryForm", theDlvryForm), currentHashCode, theDlvryForm);
        }
        {
            BigDecimal thePctAtRisk;
            thePctAtRisk = this.getPctAtRisk();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "pctAtRisk", thePctAtRisk), currentHashCode, thePctAtRisk);
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
            List<AttrbGrpBlockT> theAttrb;
            theAttrb = (((this.attrb!= null)&&(!this.attrb.isEmpty()))?this.getAttrb():null);
            strategy.appendField(locator, this, "attrb", buffer, theAttrb);
        }
        {
            BigInteger theDlvryForm;
            theDlvryForm = this.getDlvryForm();
            strategy.appendField(locator, this, "dlvryForm", buffer, theDlvryForm);
        }
        {
            BigDecimal thePctAtRisk;
            thePctAtRisk = this.getPctAtRisk();
            strategy.appendField(locator, this, "pctAtRisk", buffer, thePctAtRisk);
        }
        return buffer;
    }

}
