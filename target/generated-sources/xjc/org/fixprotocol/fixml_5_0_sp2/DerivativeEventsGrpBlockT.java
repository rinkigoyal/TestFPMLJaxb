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
import javax.xml.datatype.XMLGregorianCalendar;
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
 * <p>Java class for DerivativeEventsGrp_Block_t complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DerivativeEventsGrp_Block_t"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;group ref="{http://www.fixprotocol.org/FIXML-5-0-SP2}DerivativeEventsGrpElements"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attGroup ref="{http://www.fixprotocol.org/FIXML-5-0-SP2}DerivativeEventsGrpAttributes"/&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DerivativeEventsGrp_Block_t")
public class DerivativeEventsGrpBlockT
    implements Equals, HashCode, ToString
{

    @XmlAttribute(name = "EventTyp")
    protected BigInteger eventTyp;
    @XmlAttribute(name = "Dt")
    protected XMLGregorianCalendar dt;
    @XmlAttribute(name = "Tm")
    protected XMLGregorianCalendar tm;
    @XmlAttribute(name = "Px")
    protected BigDecimal px;
    @XmlAttribute(name = "Txt")
    protected String txt;

    /**
     * Gets the value of the eventTyp property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getEventTyp() {
        return eventTyp;
    }

    /**
     * Sets the value of the eventTyp property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setEventTyp(BigInteger value) {
        this.eventTyp = value;
    }

    /**
     * Gets the value of the dt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDt() {
        return dt;
    }

    /**
     * Sets the value of the dt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDt(XMLGregorianCalendar value) {
        this.dt = value;
    }

    /**
     * Gets the value of the tm property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTm() {
        return tm;
    }

    /**
     * Sets the value of the tm property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTm(XMLGregorianCalendar value) {
        this.tm = value;
    }

    /**
     * Gets the value of the px property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPx() {
        return px;
    }

    /**
     * Sets the value of the px property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPx(BigDecimal value) {
        this.px = value;
    }

    /**
     * Gets the value of the txt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTxt() {
        return txt;
    }

    /**
     * Sets the value of the txt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTxt(String value) {
        this.txt = value;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof DerivativeEventsGrpBlockT)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final DerivativeEventsGrpBlockT that = ((DerivativeEventsGrpBlockT) object);
        {
            BigInteger lhsEventTyp;
            lhsEventTyp = this.getEventTyp();
            BigInteger rhsEventTyp;
            rhsEventTyp = that.getEventTyp();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "eventTyp", lhsEventTyp), LocatorUtils.property(thatLocator, "eventTyp", rhsEventTyp), lhsEventTyp, rhsEventTyp)) {
                return false;
            }
        }
        {
            XMLGregorianCalendar lhsDt;
            lhsDt = this.getDt();
            XMLGregorianCalendar rhsDt;
            rhsDt = that.getDt();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "dt", lhsDt), LocatorUtils.property(thatLocator, "dt", rhsDt), lhsDt, rhsDt)) {
                return false;
            }
        }
        {
            XMLGregorianCalendar lhsTm;
            lhsTm = this.getTm();
            XMLGregorianCalendar rhsTm;
            rhsTm = that.getTm();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "tm", lhsTm), LocatorUtils.property(thatLocator, "tm", rhsTm), lhsTm, rhsTm)) {
                return false;
            }
        }
        {
            BigDecimal lhsPx;
            lhsPx = this.getPx();
            BigDecimal rhsPx;
            rhsPx = that.getPx();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "px", lhsPx), LocatorUtils.property(thatLocator, "px", rhsPx), lhsPx, rhsPx)) {
                return false;
            }
        }
        {
            String lhsTxt;
            lhsTxt = this.getTxt();
            String rhsTxt;
            rhsTxt = that.getTxt();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "txt", lhsTxt), LocatorUtils.property(thatLocator, "txt", rhsTxt), lhsTxt, rhsTxt)) {
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
            BigInteger theEventTyp;
            theEventTyp = this.getEventTyp();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "eventTyp", theEventTyp), currentHashCode, theEventTyp);
        }
        {
            XMLGregorianCalendar theDt;
            theDt = this.getDt();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "dt", theDt), currentHashCode, theDt);
        }
        {
            XMLGregorianCalendar theTm;
            theTm = this.getTm();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "tm", theTm), currentHashCode, theTm);
        }
        {
            BigDecimal thePx;
            thePx = this.getPx();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "px", thePx), currentHashCode, thePx);
        }
        {
            String theTxt;
            theTxt = this.getTxt();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "txt", theTxt), currentHashCode, theTxt);
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
            BigInteger theEventTyp;
            theEventTyp = this.getEventTyp();
            strategy.appendField(locator, this, "eventTyp", buffer, theEventTyp);
        }
        {
            XMLGregorianCalendar theDt;
            theDt = this.getDt();
            strategy.appendField(locator, this, "dt", buffer, theDt);
        }
        {
            XMLGregorianCalendar theTm;
            theTm = this.getTm();
            strategy.appendField(locator, this, "tm", buffer, theTm);
        }
        {
            BigDecimal thePx;
            thePx = this.getPx();
            strategy.appendField(locator, this, "px", buffer, thePx);
        }
        {
            String theTxt;
            theTxt = this.getTxt();
            strategy.appendField(locator, this, "txt", buffer, theTxt);
        }
        return buffer;
    }

}
