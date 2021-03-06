//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.01.17 at 02:08:33 AM SGT 
//


package org.fixprotocol.fixml_5_0_sp2;

import java.math.BigDecimal;
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
 * <p>Java class for LegPreAllocGrp_Block_t complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LegPreAllocGrp_Block_t"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;group ref="{http://www.fixprotocol.org/FIXML-5-0-SP2}LegPreAllocGrpElements"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attGroup ref="{http://www.fixprotocol.org/FIXML-5-0-SP2}LegPreAllocGrpAttributes"/&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LegPreAllocGrp_Block_t", propOrder = {
    "pty"
})
public class LegPreAllocGrpBlockT
    implements Equals, HashCode, ToString
{

    @XmlElement(name = "Pty")
    protected List<NestedParties2BlockT> pty;
    @XmlAttribute(name = "AllocAcct")
    protected String allocAcct;
    @XmlAttribute(name = "IndAllocID")
    protected String indAllocID;
    @XmlAttribute(name = "AllocQty")
    protected BigDecimal allocQty;
    @XmlAttribute(name = "AllocAcctIDSrc")
    protected String allocAcctIDSrc;
    @XmlAttribute(name = "AllocSettlCcy")
    protected String allocSettlCcy;

    /**
     * Gets the value of the pty property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pty property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPty().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NestedParties2BlockT }
     * 
     * 
     */
    public List<NestedParties2BlockT> getPty() {
        if (pty == null) {
            pty = new ArrayList<NestedParties2BlockT>();
        }
        return this.pty;
    }

    /**
     * Gets the value of the allocAcct property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAllocAcct() {
        return allocAcct;
    }

    /**
     * Sets the value of the allocAcct property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAllocAcct(String value) {
        this.allocAcct = value;
    }

    /**
     * Gets the value of the indAllocID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIndAllocID() {
        return indAllocID;
    }

    /**
     * Sets the value of the indAllocID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIndAllocID(String value) {
        this.indAllocID = value;
    }

    /**
     * Gets the value of the allocQty property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAllocQty() {
        return allocQty;
    }

    /**
     * Sets the value of the allocQty property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAllocQty(BigDecimal value) {
        this.allocQty = value;
    }

    /**
     * Gets the value of the allocAcctIDSrc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAllocAcctIDSrc() {
        return allocAcctIDSrc;
    }

    /**
     * Sets the value of the allocAcctIDSrc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAllocAcctIDSrc(String value) {
        this.allocAcctIDSrc = value;
    }

    /**
     * Gets the value of the allocSettlCcy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAllocSettlCcy() {
        return allocSettlCcy;
    }

    /**
     * Sets the value of the allocSettlCcy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAllocSettlCcy(String value) {
        this.allocSettlCcy = value;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof LegPreAllocGrpBlockT)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final LegPreAllocGrpBlockT that = ((LegPreAllocGrpBlockT) object);
        {
            List<NestedParties2BlockT> lhsPty;
            lhsPty = (((this.pty!= null)&&(!this.pty.isEmpty()))?this.getPty():null);
            List<NestedParties2BlockT> rhsPty;
            rhsPty = (((that.pty!= null)&&(!that.pty.isEmpty()))?that.getPty():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "pty", lhsPty), LocatorUtils.property(thatLocator, "pty", rhsPty), lhsPty, rhsPty)) {
                return false;
            }
        }
        {
            String lhsAllocAcct;
            lhsAllocAcct = this.getAllocAcct();
            String rhsAllocAcct;
            rhsAllocAcct = that.getAllocAcct();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "allocAcct", lhsAllocAcct), LocatorUtils.property(thatLocator, "allocAcct", rhsAllocAcct), lhsAllocAcct, rhsAllocAcct)) {
                return false;
            }
        }
        {
            String lhsIndAllocID;
            lhsIndAllocID = this.getIndAllocID();
            String rhsIndAllocID;
            rhsIndAllocID = that.getIndAllocID();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "indAllocID", lhsIndAllocID), LocatorUtils.property(thatLocator, "indAllocID", rhsIndAllocID), lhsIndAllocID, rhsIndAllocID)) {
                return false;
            }
        }
        {
            BigDecimal lhsAllocQty;
            lhsAllocQty = this.getAllocQty();
            BigDecimal rhsAllocQty;
            rhsAllocQty = that.getAllocQty();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "allocQty", lhsAllocQty), LocatorUtils.property(thatLocator, "allocQty", rhsAllocQty), lhsAllocQty, rhsAllocQty)) {
                return false;
            }
        }
        {
            String lhsAllocAcctIDSrc;
            lhsAllocAcctIDSrc = this.getAllocAcctIDSrc();
            String rhsAllocAcctIDSrc;
            rhsAllocAcctIDSrc = that.getAllocAcctIDSrc();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "allocAcctIDSrc", lhsAllocAcctIDSrc), LocatorUtils.property(thatLocator, "allocAcctIDSrc", rhsAllocAcctIDSrc), lhsAllocAcctIDSrc, rhsAllocAcctIDSrc)) {
                return false;
            }
        }
        {
            String lhsAllocSettlCcy;
            lhsAllocSettlCcy = this.getAllocSettlCcy();
            String rhsAllocSettlCcy;
            rhsAllocSettlCcy = that.getAllocSettlCcy();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "allocSettlCcy", lhsAllocSettlCcy), LocatorUtils.property(thatLocator, "allocSettlCcy", rhsAllocSettlCcy), lhsAllocSettlCcy, rhsAllocSettlCcy)) {
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
            List<NestedParties2BlockT> thePty;
            thePty = (((this.pty!= null)&&(!this.pty.isEmpty()))?this.getPty():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "pty", thePty), currentHashCode, thePty);
        }
        {
            String theAllocAcct;
            theAllocAcct = this.getAllocAcct();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "allocAcct", theAllocAcct), currentHashCode, theAllocAcct);
        }
        {
            String theIndAllocID;
            theIndAllocID = this.getIndAllocID();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "indAllocID", theIndAllocID), currentHashCode, theIndAllocID);
        }
        {
            BigDecimal theAllocQty;
            theAllocQty = this.getAllocQty();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "allocQty", theAllocQty), currentHashCode, theAllocQty);
        }
        {
            String theAllocAcctIDSrc;
            theAllocAcctIDSrc = this.getAllocAcctIDSrc();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "allocAcctIDSrc", theAllocAcctIDSrc), currentHashCode, theAllocAcctIDSrc);
        }
        {
            String theAllocSettlCcy;
            theAllocSettlCcy = this.getAllocSettlCcy();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "allocSettlCcy", theAllocSettlCcy), currentHashCode, theAllocSettlCcy);
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
            List<NestedParties2BlockT> thePty;
            thePty = (((this.pty!= null)&&(!this.pty.isEmpty()))?this.getPty():null);
            strategy.appendField(locator, this, "pty", buffer, thePty);
        }
        {
            String theAllocAcct;
            theAllocAcct = this.getAllocAcct();
            strategy.appendField(locator, this, "allocAcct", buffer, theAllocAcct);
        }
        {
            String theIndAllocID;
            theIndAllocID = this.getIndAllocID();
            strategy.appendField(locator, this, "indAllocID", buffer, theIndAllocID);
        }
        {
            BigDecimal theAllocQty;
            theAllocQty = this.getAllocQty();
            strategy.appendField(locator, this, "allocQty", buffer, theAllocQty);
        }
        {
            String theAllocAcctIDSrc;
            theAllocAcctIDSrc = this.getAllocAcctIDSrc();
            strategy.appendField(locator, this, "allocAcctIDSrc", buffer, theAllocAcctIDSrc);
        }
        {
            String theAllocSettlCcy;
            theAllocSettlCcy = this.getAllocSettlCcy();
            strategy.appendField(locator, this, "allocSettlCcy", buffer, theAllocSettlCcy);
        }
        return buffer;
    }

}
