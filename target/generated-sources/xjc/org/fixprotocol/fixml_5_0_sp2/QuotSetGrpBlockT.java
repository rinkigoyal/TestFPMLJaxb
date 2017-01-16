//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.01.14 at 04:50:28 PM SGT 
//


package org.fixprotocol.fixml_5_0_sp2;

import java.math.BigInteger;
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
 * <p>Java class for QuotSetGrp_Block_t complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="QuotSetGrp_Block_t"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;group ref="{http://www.fixprotocol.org/FIXML-5-0-SP2}QuotSetGrpElements"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attGroup ref="{http://www.fixprotocol.org/FIXML-5-0-SP2}QuotSetGrpAttributes"/&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QuotSetGrp_Block_t", propOrder = {
    "undly",
    "quotEntry"
})
public class QuotSetGrpBlockT
    implements Equals, HashCode, ToString
{

    @XmlElement(name = "Undly")
    protected UnderlyingInstrumentBlockT undly;
    @XmlElement(name = "QuotEntry", required = true)
    protected List<QuotEntryGrpBlockT> quotEntry;
    @XmlAttribute(name = "SetID", required = true)
    protected String setID;
    @XmlAttribute(name = "ValidTil")
    protected XMLGregorianCalendar validTil;
    @XmlAttribute(name = "TotNoQuotEntries", required = true)
    protected BigInteger totNoQuotEntries;
    @XmlAttribute(name = "LastFragment")
    protected LastFragmentEnumT lastFragment;

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
     * Gets the value of the quotEntry property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the quotEntry property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getQuotEntry().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link QuotEntryGrpBlockT }
     * 
     * 
     */
    public List<QuotEntryGrpBlockT> getQuotEntry() {
        if (quotEntry == null) {
            quotEntry = new ArrayList<QuotEntryGrpBlockT>();
        }
        return this.quotEntry;
    }

    /**
     * Gets the value of the setID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSetID() {
        return setID;
    }

    /**
     * Sets the value of the setID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSetID(String value) {
        this.setID = value;
    }

    /**
     * Gets the value of the validTil property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getValidTil() {
        return validTil;
    }

    /**
     * Sets the value of the validTil property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setValidTil(XMLGregorianCalendar value) {
        this.validTil = value;
    }

    /**
     * Gets the value of the totNoQuotEntries property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTotNoQuotEntries() {
        return totNoQuotEntries;
    }

    /**
     * Sets the value of the totNoQuotEntries property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTotNoQuotEntries(BigInteger value) {
        this.totNoQuotEntries = value;
    }

    /**
     * Gets the value of the lastFragment property.
     * 
     * @return
     *     possible object is
     *     {@link LastFragmentEnumT }
     *     
     */
    public LastFragmentEnumT getLastFragment() {
        return lastFragment;
    }

    /**
     * Sets the value of the lastFragment property.
     * 
     * @param value
     *     allowed object is
     *     {@link LastFragmentEnumT }
     *     
     */
    public void setLastFragment(LastFragmentEnumT value) {
        this.lastFragment = value;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof QuotSetGrpBlockT)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final QuotSetGrpBlockT that = ((QuotSetGrpBlockT) object);
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
            List<QuotEntryGrpBlockT> lhsQuotEntry;
            lhsQuotEntry = (((this.quotEntry!= null)&&(!this.quotEntry.isEmpty()))?this.getQuotEntry():null);
            List<QuotEntryGrpBlockT> rhsQuotEntry;
            rhsQuotEntry = (((that.quotEntry!= null)&&(!that.quotEntry.isEmpty()))?that.getQuotEntry():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "quotEntry", lhsQuotEntry), LocatorUtils.property(thatLocator, "quotEntry", rhsQuotEntry), lhsQuotEntry, rhsQuotEntry)) {
                return false;
            }
        }
        {
            String lhsSetID;
            lhsSetID = this.getSetID();
            String rhsSetID;
            rhsSetID = that.getSetID();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "setID", lhsSetID), LocatorUtils.property(thatLocator, "setID", rhsSetID), lhsSetID, rhsSetID)) {
                return false;
            }
        }
        {
            XMLGregorianCalendar lhsValidTil;
            lhsValidTil = this.getValidTil();
            XMLGregorianCalendar rhsValidTil;
            rhsValidTil = that.getValidTil();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "validTil", lhsValidTil), LocatorUtils.property(thatLocator, "validTil", rhsValidTil), lhsValidTil, rhsValidTil)) {
                return false;
            }
        }
        {
            BigInteger lhsTotNoQuotEntries;
            lhsTotNoQuotEntries = this.getTotNoQuotEntries();
            BigInteger rhsTotNoQuotEntries;
            rhsTotNoQuotEntries = that.getTotNoQuotEntries();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "totNoQuotEntries", lhsTotNoQuotEntries), LocatorUtils.property(thatLocator, "totNoQuotEntries", rhsTotNoQuotEntries), lhsTotNoQuotEntries, rhsTotNoQuotEntries)) {
                return false;
            }
        }
        {
            LastFragmentEnumT lhsLastFragment;
            lhsLastFragment = this.getLastFragment();
            LastFragmentEnumT rhsLastFragment;
            rhsLastFragment = that.getLastFragment();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "lastFragment", lhsLastFragment), LocatorUtils.property(thatLocator, "lastFragment", rhsLastFragment), lhsLastFragment, rhsLastFragment)) {
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
            List<QuotEntryGrpBlockT> theQuotEntry;
            theQuotEntry = (((this.quotEntry!= null)&&(!this.quotEntry.isEmpty()))?this.getQuotEntry():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "quotEntry", theQuotEntry), currentHashCode, theQuotEntry);
        }
        {
            String theSetID;
            theSetID = this.getSetID();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "setID", theSetID), currentHashCode, theSetID);
        }
        {
            XMLGregorianCalendar theValidTil;
            theValidTil = this.getValidTil();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "validTil", theValidTil), currentHashCode, theValidTil);
        }
        {
            BigInteger theTotNoQuotEntries;
            theTotNoQuotEntries = this.getTotNoQuotEntries();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "totNoQuotEntries", theTotNoQuotEntries), currentHashCode, theTotNoQuotEntries);
        }
        {
            LastFragmentEnumT theLastFragment;
            theLastFragment = this.getLastFragment();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "lastFragment", theLastFragment), currentHashCode, theLastFragment);
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
            List<QuotEntryGrpBlockT> theQuotEntry;
            theQuotEntry = (((this.quotEntry!= null)&&(!this.quotEntry.isEmpty()))?this.getQuotEntry():null);
            strategy.appendField(locator, this, "quotEntry", buffer, theQuotEntry);
        }
        {
            String theSetID;
            theSetID = this.getSetID();
            strategy.appendField(locator, this, "setID", buffer, theSetID);
        }
        {
            XMLGregorianCalendar theValidTil;
            theValidTil = this.getValidTil();
            strategy.appendField(locator, this, "validTil", buffer, theValidTil);
        }
        {
            BigInteger theTotNoQuotEntries;
            theTotNoQuotEntries = this.getTotNoQuotEntries();
            strategy.appendField(locator, this, "totNoQuotEntries", buffer, theTotNoQuotEntries);
        }
        {
            LastFragmentEnumT theLastFragment;
            theLastFragment = this.getLastFragment();
            strategy.appendField(locator, this, "lastFragment", buffer, theLastFragment);
        }
        return buffer;
    }

}
