//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.01.17 at 02:08:33 AM SGT 
//


package org.fixprotocol.fixml_5_0_sp2;

import java.math.BigDecimal;
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
 * <p>Java class for StrmAsgnReqInstrmtGrp_Block_t complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StrmAsgnReqInstrmtGrp_Block_t"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;group ref="{http://www.fixprotocol.org/FIXML-5-0-SP2}StrmAsgnReqInstrmtGrpElements"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attGroup ref="{http://www.fixprotocol.org/FIXML-5-0-SP2}StrmAsgnReqInstrmtGrpAttributes"/&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StrmAsgnReqInstrmtGrp_Block_t", propOrder = {
    "instrmt"
})
public class StrmAsgnReqInstrmtGrpBlockT
    implements Equals, HashCode, ToString
{

    @XmlElement(name = "Instrmt")
    protected InstrumentBlockT instrmt;
    @XmlAttribute(name = "SettlTyp")
    protected String settlTyp;
    @XmlAttribute(name = "Sz")
    protected BigDecimal sz;
    @XmlAttribute(name = "MDStrmID")
    protected String mdStrmID;

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

    /**
     * Gets the value of the sz property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSz() {
        return sz;
    }

    /**
     * Sets the value of the sz property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setSz(BigDecimal value) {
        this.sz = value;
    }

    /**
     * Gets the value of the mdStrmID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMDStrmID() {
        return mdStrmID;
    }

    /**
     * Sets the value of the mdStrmID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMDStrmID(String value) {
        this.mdStrmID = value;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof StrmAsgnReqInstrmtGrpBlockT)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final StrmAsgnReqInstrmtGrpBlockT that = ((StrmAsgnReqInstrmtGrpBlockT) object);
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
            String lhsSettlTyp;
            lhsSettlTyp = this.getSettlTyp();
            String rhsSettlTyp;
            rhsSettlTyp = that.getSettlTyp();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "settlTyp", lhsSettlTyp), LocatorUtils.property(thatLocator, "settlTyp", rhsSettlTyp), lhsSettlTyp, rhsSettlTyp)) {
                return false;
            }
        }
        {
            BigDecimal lhsSz;
            lhsSz = this.getSz();
            BigDecimal rhsSz;
            rhsSz = that.getSz();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "sz", lhsSz), LocatorUtils.property(thatLocator, "sz", rhsSz), lhsSz, rhsSz)) {
                return false;
            }
        }
        {
            String lhsMDStrmID;
            lhsMDStrmID = this.getMDStrmID();
            String rhsMDStrmID;
            rhsMDStrmID = that.getMDStrmID();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "mdStrmID", lhsMDStrmID), LocatorUtils.property(thatLocator, "mdStrmID", rhsMDStrmID), lhsMDStrmID, rhsMDStrmID)) {
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
            String theSettlTyp;
            theSettlTyp = this.getSettlTyp();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "settlTyp", theSettlTyp), currentHashCode, theSettlTyp);
        }
        {
            BigDecimal theSz;
            theSz = this.getSz();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "sz", theSz), currentHashCode, theSz);
        }
        {
            String theMDStrmID;
            theMDStrmID = this.getMDStrmID();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "mdStrmID", theMDStrmID), currentHashCode, theMDStrmID);
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
            String theSettlTyp;
            theSettlTyp = this.getSettlTyp();
            strategy.appendField(locator, this, "settlTyp", buffer, theSettlTyp);
        }
        {
            BigDecimal theSz;
            theSz = this.getSz();
            strategy.appendField(locator, this, "sz", buffer, theSz);
        }
        {
            String theMDStrmID;
            theMDStrmID = this.getMDStrmID();
            strategy.appendField(locator, this, "mdStrmID", buffer, theMDStrmID);
        }
        return buffer;
    }

}
