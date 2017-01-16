//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.01.17 at 02:08:33 AM SGT 
//


package org.fixprotocol.fixml_5_0_sp2;

import java.math.BigDecimal;
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
 * <p>Java class for BidDescReqGrp_Block_t complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BidDescReqGrp_Block_t"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;group ref="{http://www.fixprotocol.org/FIXML-5-0-SP2}BidDescReqGrpElements"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attGroup ref="{http://www.fixprotocol.org/FIXML-5-0-SP2}BidDescReqGrpAttributes"/&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BidDescReqGrp_Block_t")
public class BidDescReqGrpBlockT
    implements Equals, HashCode, ToString
{

    @XmlAttribute(name = "BidDescptrTyp")
    protected BigInteger bidDescptrTyp;
    @XmlAttribute(name = "BidDescptr")
    protected String bidDescptr;
    @XmlAttribute(name = "SideValuInd")
    protected BigInteger sideValuInd;
    @XmlAttribute(name = "LqdtyValu")
    protected BigDecimal lqdtyValu;
    @XmlAttribute(name = "LqdtyNumSecurities")
    protected BigInteger lqdtyNumSecurities;
    @XmlAttribute(name = "LqdtyPctLow")
    protected BigDecimal lqdtyPctLow;
    @XmlAttribute(name = "LqdtyPctHigh")
    protected BigDecimal lqdtyPctHigh;
    @XmlAttribute(name = "EFPTrkngErr")
    protected BigDecimal efpTrkngErr;
    @XmlAttribute(name = "FairValu")
    protected BigDecimal fairValu;
    @XmlAttribute(name = "OutsideNdxPct")
    protected BigDecimal outsideNdxPct;
    @XmlAttribute(name = "ValuOfFuts")
    protected BigDecimal valuOfFuts;

    /**
     * Gets the value of the bidDescptrTyp property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getBidDescptrTyp() {
        return bidDescptrTyp;
    }

    /**
     * Sets the value of the bidDescptrTyp property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setBidDescptrTyp(BigInteger value) {
        this.bidDescptrTyp = value;
    }

    /**
     * Gets the value of the bidDescptr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBidDescptr() {
        return bidDescptr;
    }

    /**
     * Sets the value of the bidDescptr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBidDescptr(String value) {
        this.bidDescptr = value;
    }

    /**
     * Gets the value of the sideValuInd property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getSideValuInd() {
        return sideValuInd;
    }

    /**
     * Sets the value of the sideValuInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setSideValuInd(BigInteger value) {
        this.sideValuInd = value;
    }

    /**
     * Gets the value of the lqdtyValu property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getLqdtyValu() {
        return lqdtyValu;
    }

    /**
     * Sets the value of the lqdtyValu property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setLqdtyValu(BigDecimal value) {
        this.lqdtyValu = value;
    }

    /**
     * Gets the value of the lqdtyNumSecurities property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getLqdtyNumSecurities() {
        return lqdtyNumSecurities;
    }

    /**
     * Sets the value of the lqdtyNumSecurities property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setLqdtyNumSecurities(BigInteger value) {
        this.lqdtyNumSecurities = value;
    }

    /**
     * Gets the value of the lqdtyPctLow property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getLqdtyPctLow() {
        return lqdtyPctLow;
    }

    /**
     * Sets the value of the lqdtyPctLow property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setLqdtyPctLow(BigDecimal value) {
        this.lqdtyPctLow = value;
    }

    /**
     * Gets the value of the lqdtyPctHigh property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getLqdtyPctHigh() {
        return lqdtyPctHigh;
    }

    /**
     * Sets the value of the lqdtyPctHigh property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setLqdtyPctHigh(BigDecimal value) {
        this.lqdtyPctHigh = value;
    }

    /**
     * Gets the value of the efpTrkngErr property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getEFPTrkngErr() {
        return efpTrkngErr;
    }

    /**
     * Sets the value of the efpTrkngErr property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setEFPTrkngErr(BigDecimal value) {
        this.efpTrkngErr = value;
    }

    /**
     * Gets the value of the fairValu property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getFairValu() {
        return fairValu;
    }

    /**
     * Sets the value of the fairValu property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setFairValu(BigDecimal value) {
        this.fairValu = value;
    }

    /**
     * Gets the value of the outsideNdxPct property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutsideNdxPct() {
        return outsideNdxPct;
    }

    /**
     * Sets the value of the outsideNdxPct property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutsideNdxPct(BigDecimal value) {
        this.outsideNdxPct = value;
    }

    /**
     * Gets the value of the valuOfFuts property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getValuOfFuts() {
        return valuOfFuts;
    }

    /**
     * Sets the value of the valuOfFuts property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setValuOfFuts(BigDecimal value) {
        this.valuOfFuts = value;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof BidDescReqGrpBlockT)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final BidDescReqGrpBlockT that = ((BidDescReqGrpBlockT) object);
        {
            BigInteger lhsBidDescptrTyp;
            lhsBidDescptrTyp = this.getBidDescptrTyp();
            BigInteger rhsBidDescptrTyp;
            rhsBidDescptrTyp = that.getBidDescptrTyp();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "bidDescptrTyp", lhsBidDescptrTyp), LocatorUtils.property(thatLocator, "bidDescptrTyp", rhsBidDescptrTyp), lhsBidDescptrTyp, rhsBidDescptrTyp)) {
                return false;
            }
        }
        {
            String lhsBidDescptr;
            lhsBidDescptr = this.getBidDescptr();
            String rhsBidDescptr;
            rhsBidDescptr = that.getBidDescptr();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "bidDescptr", lhsBidDescptr), LocatorUtils.property(thatLocator, "bidDescptr", rhsBidDescptr), lhsBidDescptr, rhsBidDescptr)) {
                return false;
            }
        }
        {
            BigInteger lhsSideValuInd;
            lhsSideValuInd = this.getSideValuInd();
            BigInteger rhsSideValuInd;
            rhsSideValuInd = that.getSideValuInd();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "sideValuInd", lhsSideValuInd), LocatorUtils.property(thatLocator, "sideValuInd", rhsSideValuInd), lhsSideValuInd, rhsSideValuInd)) {
                return false;
            }
        }
        {
            BigDecimal lhsLqdtyValu;
            lhsLqdtyValu = this.getLqdtyValu();
            BigDecimal rhsLqdtyValu;
            rhsLqdtyValu = that.getLqdtyValu();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "lqdtyValu", lhsLqdtyValu), LocatorUtils.property(thatLocator, "lqdtyValu", rhsLqdtyValu), lhsLqdtyValu, rhsLqdtyValu)) {
                return false;
            }
        }
        {
            BigInteger lhsLqdtyNumSecurities;
            lhsLqdtyNumSecurities = this.getLqdtyNumSecurities();
            BigInteger rhsLqdtyNumSecurities;
            rhsLqdtyNumSecurities = that.getLqdtyNumSecurities();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "lqdtyNumSecurities", lhsLqdtyNumSecurities), LocatorUtils.property(thatLocator, "lqdtyNumSecurities", rhsLqdtyNumSecurities), lhsLqdtyNumSecurities, rhsLqdtyNumSecurities)) {
                return false;
            }
        }
        {
            BigDecimal lhsLqdtyPctLow;
            lhsLqdtyPctLow = this.getLqdtyPctLow();
            BigDecimal rhsLqdtyPctLow;
            rhsLqdtyPctLow = that.getLqdtyPctLow();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "lqdtyPctLow", lhsLqdtyPctLow), LocatorUtils.property(thatLocator, "lqdtyPctLow", rhsLqdtyPctLow), lhsLqdtyPctLow, rhsLqdtyPctLow)) {
                return false;
            }
        }
        {
            BigDecimal lhsLqdtyPctHigh;
            lhsLqdtyPctHigh = this.getLqdtyPctHigh();
            BigDecimal rhsLqdtyPctHigh;
            rhsLqdtyPctHigh = that.getLqdtyPctHigh();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "lqdtyPctHigh", lhsLqdtyPctHigh), LocatorUtils.property(thatLocator, "lqdtyPctHigh", rhsLqdtyPctHigh), lhsLqdtyPctHigh, rhsLqdtyPctHigh)) {
                return false;
            }
        }
        {
            BigDecimal lhsEFPTrkngErr;
            lhsEFPTrkngErr = this.getEFPTrkngErr();
            BigDecimal rhsEFPTrkngErr;
            rhsEFPTrkngErr = that.getEFPTrkngErr();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "efpTrkngErr", lhsEFPTrkngErr), LocatorUtils.property(thatLocator, "efpTrkngErr", rhsEFPTrkngErr), lhsEFPTrkngErr, rhsEFPTrkngErr)) {
                return false;
            }
        }
        {
            BigDecimal lhsFairValu;
            lhsFairValu = this.getFairValu();
            BigDecimal rhsFairValu;
            rhsFairValu = that.getFairValu();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "fairValu", lhsFairValu), LocatorUtils.property(thatLocator, "fairValu", rhsFairValu), lhsFairValu, rhsFairValu)) {
                return false;
            }
        }
        {
            BigDecimal lhsOutsideNdxPct;
            lhsOutsideNdxPct = this.getOutsideNdxPct();
            BigDecimal rhsOutsideNdxPct;
            rhsOutsideNdxPct = that.getOutsideNdxPct();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "outsideNdxPct", lhsOutsideNdxPct), LocatorUtils.property(thatLocator, "outsideNdxPct", rhsOutsideNdxPct), lhsOutsideNdxPct, rhsOutsideNdxPct)) {
                return false;
            }
        }
        {
            BigDecimal lhsValuOfFuts;
            lhsValuOfFuts = this.getValuOfFuts();
            BigDecimal rhsValuOfFuts;
            rhsValuOfFuts = that.getValuOfFuts();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "valuOfFuts", lhsValuOfFuts), LocatorUtils.property(thatLocator, "valuOfFuts", rhsValuOfFuts), lhsValuOfFuts, rhsValuOfFuts)) {
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
            BigInteger theBidDescptrTyp;
            theBidDescptrTyp = this.getBidDescptrTyp();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "bidDescptrTyp", theBidDescptrTyp), currentHashCode, theBidDescptrTyp);
        }
        {
            String theBidDescptr;
            theBidDescptr = this.getBidDescptr();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "bidDescptr", theBidDescptr), currentHashCode, theBidDescptr);
        }
        {
            BigInteger theSideValuInd;
            theSideValuInd = this.getSideValuInd();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "sideValuInd", theSideValuInd), currentHashCode, theSideValuInd);
        }
        {
            BigDecimal theLqdtyValu;
            theLqdtyValu = this.getLqdtyValu();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "lqdtyValu", theLqdtyValu), currentHashCode, theLqdtyValu);
        }
        {
            BigInteger theLqdtyNumSecurities;
            theLqdtyNumSecurities = this.getLqdtyNumSecurities();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "lqdtyNumSecurities", theLqdtyNumSecurities), currentHashCode, theLqdtyNumSecurities);
        }
        {
            BigDecimal theLqdtyPctLow;
            theLqdtyPctLow = this.getLqdtyPctLow();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "lqdtyPctLow", theLqdtyPctLow), currentHashCode, theLqdtyPctLow);
        }
        {
            BigDecimal theLqdtyPctHigh;
            theLqdtyPctHigh = this.getLqdtyPctHigh();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "lqdtyPctHigh", theLqdtyPctHigh), currentHashCode, theLqdtyPctHigh);
        }
        {
            BigDecimal theEFPTrkngErr;
            theEFPTrkngErr = this.getEFPTrkngErr();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "efpTrkngErr", theEFPTrkngErr), currentHashCode, theEFPTrkngErr);
        }
        {
            BigDecimal theFairValu;
            theFairValu = this.getFairValu();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "fairValu", theFairValu), currentHashCode, theFairValu);
        }
        {
            BigDecimal theOutsideNdxPct;
            theOutsideNdxPct = this.getOutsideNdxPct();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "outsideNdxPct", theOutsideNdxPct), currentHashCode, theOutsideNdxPct);
        }
        {
            BigDecimal theValuOfFuts;
            theValuOfFuts = this.getValuOfFuts();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "valuOfFuts", theValuOfFuts), currentHashCode, theValuOfFuts);
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
            BigInteger theBidDescptrTyp;
            theBidDescptrTyp = this.getBidDescptrTyp();
            strategy.appendField(locator, this, "bidDescptrTyp", buffer, theBidDescptrTyp);
        }
        {
            String theBidDescptr;
            theBidDescptr = this.getBidDescptr();
            strategy.appendField(locator, this, "bidDescptr", buffer, theBidDescptr);
        }
        {
            BigInteger theSideValuInd;
            theSideValuInd = this.getSideValuInd();
            strategy.appendField(locator, this, "sideValuInd", buffer, theSideValuInd);
        }
        {
            BigDecimal theLqdtyValu;
            theLqdtyValu = this.getLqdtyValu();
            strategy.appendField(locator, this, "lqdtyValu", buffer, theLqdtyValu);
        }
        {
            BigInteger theLqdtyNumSecurities;
            theLqdtyNumSecurities = this.getLqdtyNumSecurities();
            strategy.appendField(locator, this, "lqdtyNumSecurities", buffer, theLqdtyNumSecurities);
        }
        {
            BigDecimal theLqdtyPctLow;
            theLqdtyPctLow = this.getLqdtyPctLow();
            strategy.appendField(locator, this, "lqdtyPctLow", buffer, theLqdtyPctLow);
        }
        {
            BigDecimal theLqdtyPctHigh;
            theLqdtyPctHigh = this.getLqdtyPctHigh();
            strategy.appendField(locator, this, "lqdtyPctHigh", buffer, theLqdtyPctHigh);
        }
        {
            BigDecimal theEFPTrkngErr;
            theEFPTrkngErr = this.getEFPTrkngErr();
            strategy.appendField(locator, this, "efpTrkngErr", buffer, theEFPTrkngErr);
        }
        {
            BigDecimal theFairValu;
            theFairValu = this.getFairValu();
            strategy.appendField(locator, this, "fairValu", buffer, theFairValu);
        }
        {
            BigDecimal theOutsideNdxPct;
            theOutsideNdxPct = this.getOutsideNdxPct();
            strategy.appendField(locator, this, "outsideNdxPct", buffer, theOutsideNdxPct);
        }
        {
            BigDecimal theValuOfFuts;
            theValuOfFuts = this.getValuOfFuts();
            strategy.appendField(locator, this, "valuOfFuts", buffer, theValuOfFuts);
        }
        return buffer;
    }

}
