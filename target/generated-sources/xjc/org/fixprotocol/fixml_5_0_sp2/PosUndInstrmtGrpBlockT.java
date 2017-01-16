//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.01.14 at 04:50:28 PM SGT 
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
 * <p>Java class for PosUndInstrmtGrp_Block_t complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PosUndInstrmtGrp_Block_t"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;group ref="{http://www.fixprotocol.org/FIXML-5-0-SP2}PosUndInstrmtGrpElements"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attGroup ref="{http://www.fixprotocol.org/FIXML-5-0-SP2}PosUndInstrmtGrpAttributes"/&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PosUndInstrmtGrp_Block_t", propOrder = {
    "undly",
    "undDlvAmt"
})
public class PosUndInstrmtGrpBlockT
    implements Equals, HashCode, ToString
{

    @XmlElement(name = "Undly")
    protected UnderlyingInstrumentBlockT undly;
    @XmlElement(name = "UndDlvAmt")
    protected List<UnderlyingAmountBlockT> undDlvAmt;
    @XmlAttribute(name = "UndSetPx")
    protected BigDecimal undSetPx;
    @XmlAttribute(name = "UndSetPxTyp")
    protected BigInteger undSetPxTyp;
    @XmlAttribute(name = "UndlyDlvAmt")
    protected BigDecimal undlyDlvAmt;

    /**
     * Gets the value of the undly property.
     * 
     * @return
     *     possible object is
     *     {@link UnderlyingInstrumentBlockT }
     *     
     */
    public UnderlyingInstrumentBlockT getUndly() {
        return undly;
    }

    /**
     * Sets the value of the undly property.
     * 
     * @param value
     *     allowed object is
     *     {@link UnderlyingInstrumentBlockT }
     *     
     */
    public void setUndly(UnderlyingInstrumentBlockT value) {
        this.undly = value;
    }

    /**
     * Gets the value of the undDlvAmt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the undDlvAmt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUndDlvAmt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link UnderlyingAmountBlockT }
     * 
     * 
     */
    public List<UnderlyingAmountBlockT> getUndDlvAmt() {
        if (undDlvAmt == null) {
            undDlvAmt = new ArrayList<UnderlyingAmountBlockT>();
        }
        return this.undDlvAmt;
    }

    /**
     * Gets the value of the undSetPx property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getUndSetPx() {
        return undSetPx;
    }

    /**
     * Sets the value of the undSetPx property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setUndSetPx(BigDecimal value) {
        this.undSetPx = value;
    }

    /**
     * Gets the value of the undSetPxTyp property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getUndSetPxTyp() {
        return undSetPxTyp;
    }

    /**
     * Sets the value of the undSetPxTyp property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setUndSetPxTyp(BigInteger value) {
        this.undSetPxTyp = value;
    }

    /**
     * Gets the value of the undlyDlvAmt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getUndlyDlvAmt() {
        return undlyDlvAmt;
    }

    /**
     * Sets the value of the undlyDlvAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setUndlyDlvAmt(BigDecimal value) {
        this.undlyDlvAmt = value;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof PosUndInstrmtGrpBlockT)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final PosUndInstrmtGrpBlockT that = ((PosUndInstrmtGrpBlockT) object);
        {
            UnderlyingInstrumentBlockT lhsUndly;
            lhsUndly = this.getUndly();
            UnderlyingInstrumentBlockT rhsUndly;
            rhsUndly = that.getUndly();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "undly", lhsUndly), LocatorUtils.property(thatLocator, "undly", rhsUndly), lhsUndly, rhsUndly)) {
                return false;
            }
        }
        {
            List<UnderlyingAmountBlockT> lhsUndDlvAmt;
            lhsUndDlvAmt = (((this.undDlvAmt!= null)&&(!this.undDlvAmt.isEmpty()))?this.getUndDlvAmt():null);
            List<UnderlyingAmountBlockT> rhsUndDlvAmt;
            rhsUndDlvAmt = (((that.undDlvAmt!= null)&&(!that.undDlvAmt.isEmpty()))?that.getUndDlvAmt():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "undDlvAmt", lhsUndDlvAmt), LocatorUtils.property(thatLocator, "undDlvAmt", rhsUndDlvAmt), lhsUndDlvAmt, rhsUndDlvAmt)) {
                return false;
            }
        }
        {
            BigDecimal lhsUndSetPx;
            lhsUndSetPx = this.getUndSetPx();
            BigDecimal rhsUndSetPx;
            rhsUndSetPx = that.getUndSetPx();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "undSetPx", lhsUndSetPx), LocatorUtils.property(thatLocator, "undSetPx", rhsUndSetPx), lhsUndSetPx, rhsUndSetPx)) {
                return false;
            }
        }
        {
            BigInteger lhsUndSetPxTyp;
            lhsUndSetPxTyp = this.getUndSetPxTyp();
            BigInteger rhsUndSetPxTyp;
            rhsUndSetPxTyp = that.getUndSetPxTyp();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "undSetPxTyp", lhsUndSetPxTyp), LocatorUtils.property(thatLocator, "undSetPxTyp", rhsUndSetPxTyp), lhsUndSetPxTyp, rhsUndSetPxTyp)) {
                return false;
            }
        }
        {
            BigDecimal lhsUndlyDlvAmt;
            lhsUndlyDlvAmt = this.getUndlyDlvAmt();
            BigDecimal rhsUndlyDlvAmt;
            rhsUndlyDlvAmt = that.getUndlyDlvAmt();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "undlyDlvAmt", lhsUndlyDlvAmt), LocatorUtils.property(thatLocator, "undlyDlvAmt", rhsUndlyDlvAmt), lhsUndlyDlvAmt, rhsUndlyDlvAmt)) {
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
            UnderlyingInstrumentBlockT theUndly;
            theUndly = this.getUndly();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "undly", theUndly), currentHashCode, theUndly);
        }
        {
            List<UnderlyingAmountBlockT> theUndDlvAmt;
            theUndDlvAmt = (((this.undDlvAmt!= null)&&(!this.undDlvAmt.isEmpty()))?this.getUndDlvAmt():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "undDlvAmt", theUndDlvAmt), currentHashCode, theUndDlvAmt);
        }
        {
            BigDecimal theUndSetPx;
            theUndSetPx = this.getUndSetPx();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "undSetPx", theUndSetPx), currentHashCode, theUndSetPx);
        }
        {
            BigInteger theUndSetPxTyp;
            theUndSetPxTyp = this.getUndSetPxTyp();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "undSetPxTyp", theUndSetPxTyp), currentHashCode, theUndSetPxTyp);
        }
        {
            BigDecimal theUndlyDlvAmt;
            theUndlyDlvAmt = this.getUndlyDlvAmt();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "undlyDlvAmt", theUndlyDlvAmt), currentHashCode, theUndlyDlvAmt);
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
            UnderlyingInstrumentBlockT theUndly;
            theUndly = this.getUndly();
            strategy.appendField(locator, this, "undly", buffer, theUndly);
        }
        {
            List<UnderlyingAmountBlockT> theUndDlvAmt;
            theUndDlvAmt = (((this.undDlvAmt!= null)&&(!this.undDlvAmt.isEmpty()))?this.getUndDlvAmt():null);
            strategy.appendField(locator, this, "undDlvAmt", buffer, theUndDlvAmt);
        }
        {
            BigDecimal theUndSetPx;
            theUndSetPx = this.getUndSetPx();
            strategy.appendField(locator, this, "undSetPx", buffer, theUndSetPx);
        }
        {
            BigInteger theUndSetPxTyp;
            theUndSetPxTyp = this.getUndSetPxTyp();
            strategy.appendField(locator, this, "undSetPxTyp", buffer, theUndSetPxTyp);
        }
        {
            BigDecimal theUndlyDlvAmt;
            theUndlyDlvAmt = this.getUndlyDlvAmt();
            strategy.appendField(locator, this, "undlyDlvAmt", buffer, theUndlyDlvAmt);
        }
        return buffer;
    }

}
