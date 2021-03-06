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
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
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
 * <p>Java class for ComplexEventDates_Block_t complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ComplexEventDates_Block_t"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;group ref="{http://www.fixprotocol.org/FIXML-5-0-SP2}ComplexEventDatesElements"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attGroup ref="{http://www.fixprotocol.org/FIXML-5-0-SP2}ComplexEventDatesAttributes"/&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ComplexEventDates_Block_t", propOrder = {
    "evntTms"
})
public class ComplexEventDatesBlockT
    implements Equals, HashCode, ToString
{

    @XmlElement(name = "EvntTms")
    protected List<ComplexEventTimesBlockT> evntTms;
    @XmlAttribute(name = "StartDt")
    protected XMLGregorianCalendar startDt;
    @XmlAttribute(name = "EndDt")
    protected XMLGregorianCalendar endDt;

    /**
     * Gets the value of the evntTms property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the evntTms property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEvntTms().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ComplexEventTimesBlockT }
     * 
     * 
     */
    public List<ComplexEventTimesBlockT> getEvntTms() {
        if (evntTms == null) {
            evntTms = new ArrayList<ComplexEventTimesBlockT>();
        }
        return this.evntTms;
    }

    /**
     * Gets the value of the startDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getStartDt() {
        return startDt;
    }

    /**
     * Sets the value of the startDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setStartDt(XMLGregorianCalendar value) {
        this.startDt = value;
    }

    /**
     * Gets the value of the endDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEndDt() {
        return endDt;
    }

    /**
     * Sets the value of the endDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEndDt(XMLGregorianCalendar value) {
        this.endDt = value;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof ComplexEventDatesBlockT)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final ComplexEventDatesBlockT that = ((ComplexEventDatesBlockT) object);
        {
            List<ComplexEventTimesBlockT> lhsEvntTms;
            lhsEvntTms = (((this.evntTms!= null)&&(!this.evntTms.isEmpty()))?this.getEvntTms():null);
            List<ComplexEventTimesBlockT> rhsEvntTms;
            rhsEvntTms = (((that.evntTms!= null)&&(!that.evntTms.isEmpty()))?that.getEvntTms():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "evntTms", lhsEvntTms), LocatorUtils.property(thatLocator, "evntTms", rhsEvntTms), lhsEvntTms, rhsEvntTms)) {
                return false;
            }
        }
        {
            XMLGregorianCalendar lhsStartDt;
            lhsStartDt = this.getStartDt();
            XMLGregorianCalendar rhsStartDt;
            rhsStartDt = that.getStartDt();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "startDt", lhsStartDt), LocatorUtils.property(thatLocator, "startDt", rhsStartDt), lhsStartDt, rhsStartDt)) {
                return false;
            }
        }
        {
            XMLGregorianCalendar lhsEndDt;
            lhsEndDt = this.getEndDt();
            XMLGregorianCalendar rhsEndDt;
            rhsEndDt = that.getEndDt();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "endDt", lhsEndDt), LocatorUtils.property(thatLocator, "endDt", rhsEndDt), lhsEndDt, rhsEndDt)) {
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
            List<ComplexEventTimesBlockT> theEvntTms;
            theEvntTms = (((this.evntTms!= null)&&(!this.evntTms.isEmpty()))?this.getEvntTms():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "evntTms", theEvntTms), currentHashCode, theEvntTms);
        }
        {
            XMLGregorianCalendar theStartDt;
            theStartDt = this.getStartDt();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "startDt", theStartDt), currentHashCode, theStartDt);
        }
        {
            XMLGregorianCalendar theEndDt;
            theEndDt = this.getEndDt();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "endDt", theEndDt), currentHashCode, theEndDt);
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
            List<ComplexEventTimesBlockT> theEvntTms;
            theEvntTms = (((this.evntTms!= null)&&(!this.evntTms.isEmpty()))?this.getEvntTms():null);
            strategy.appendField(locator, this, "evntTms", buffer, theEvntTms);
        }
        {
            XMLGregorianCalendar theStartDt;
            theStartDt = this.getStartDt();
            strategy.appendField(locator, this, "startDt", buffer, theStartDt);
        }
        {
            XMLGregorianCalendar theEndDt;
            theEndDt = this.getEndDt();
            strategy.appendField(locator, this, "endDt", buffer, theEndDt);
        }
        return buffer;
    }

}
