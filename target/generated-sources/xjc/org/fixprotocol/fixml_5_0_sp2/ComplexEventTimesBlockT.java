//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.01.17 at 02:08:33 AM SGT 
//


package org.fixprotocol.fixml_5_0_sp2;

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
 * <p>Java class for ComplexEventTimes_Block_t complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ComplexEventTimes_Block_t"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;group ref="{http://www.fixprotocol.org/FIXML-5-0-SP2}ComplexEventTimesElements"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attGroup ref="{http://www.fixprotocol.org/FIXML-5-0-SP2}ComplexEventTimesAttributes"/&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ComplexEventTimes_Block_t")
public class ComplexEventTimesBlockT
    implements Equals, HashCode, ToString
{

    @XmlAttribute(name = "StartTm")
    protected XMLGregorianCalendar startTm;
    @XmlAttribute(name = "EndTm")
    protected XMLGregorianCalendar endTm;

    /**
     * Gets the value of the startTm property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getStartTm() {
        return startTm;
    }

    /**
     * Sets the value of the startTm property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setStartTm(XMLGregorianCalendar value) {
        this.startTm = value;
    }

    /**
     * Gets the value of the endTm property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEndTm() {
        return endTm;
    }

    /**
     * Sets the value of the endTm property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEndTm(XMLGregorianCalendar value) {
        this.endTm = value;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof ComplexEventTimesBlockT)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final ComplexEventTimesBlockT that = ((ComplexEventTimesBlockT) object);
        {
            XMLGregorianCalendar lhsStartTm;
            lhsStartTm = this.getStartTm();
            XMLGregorianCalendar rhsStartTm;
            rhsStartTm = that.getStartTm();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "startTm", lhsStartTm), LocatorUtils.property(thatLocator, "startTm", rhsStartTm), lhsStartTm, rhsStartTm)) {
                return false;
            }
        }
        {
            XMLGregorianCalendar lhsEndTm;
            lhsEndTm = this.getEndTm();
            XMLGregorianCalendar rhsEndTm;
            rhsEndTm = that.getEndTm();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "endTm", lhsEndTm), LocatorUtils.property(thatLocator, "endTm", rhsEndTm), lhsEndTm, rhsEndTm)) {
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
            XMLGregorianCalendar theStartTm;
            theStartTm = this.getStartTm();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "startTm", theStartTm), currentHashCode, theStartTm);
        }
        {
            XMLGregorianCalendar theEndTm;
            theEndTm = this.getEndTm();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "endTm", theEndTm), currentHashCode, theEndTm);
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
            XMLGregorianCalendar theStartTm;
            theStartTm = this.getStartTm();
            strategy.appendField(locator, this, "startTm", buffer, theStartTm);
        }
        {
            XMLGregorianCalendar theEndTm;
            theEndTm = this.getEndTm();
            strategy.appendField(locator, this, "endTm", buffer, theEndTm);
        }
        return buffer;
    }

}
