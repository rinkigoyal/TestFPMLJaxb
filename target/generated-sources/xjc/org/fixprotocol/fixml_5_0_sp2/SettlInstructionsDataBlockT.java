//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.01.17 at 02:08:33 AM SGT 
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
 * <p>Java class for SettlInstructionsData_Block_t complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SettlInstructionsData_Block_t"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;group ref="{http://www.fixprotocol.org/FIXML-5-0-SP2}SettlInstructionsDataElements"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attGroup ref="{http://www.fixprotocol.org/FIXML-5-0-SP2}SettlInstructionsDataAttributes"/&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SettlInstructionsData_Block_t", propOrder = {
    "dlvInst"
})
public class SettlInstructionsDataBlockT
    implements Equals, HashCode, ToString
{

    @XmlElement(name = "DlvInst")
    protected List<DlvyInstGrpBlockT> dlvInst;
    @XmlAttribute(name = "DlvryTyp")
    protected BigInteger dlvryTyp;
    @XmlAttribute(name = "StandInstDbTyp")
    protected BigInteger standInstDbTyp;
    @XmlAttribute(name = "StandInstDbName")
    protected String standInstDbName;
    @XmlAttribute(name = "StandInstDbID")
    protected String standInstDbID;

    /**
     * Gets the value of the dlvInst property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dlvInst property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDlvInst().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DlvyInstGrpBlockT }
     * 
     * 
     */
    public List<DlvyInstGrpBlockT> getDlvInst() {
        if (dlvInst == null) {
            dlvInst = new ArrayList<DlvyInstGrpBlockT>();
        }
        return this.dlvInst;
    }

    /**
     * Gets the value of the dlvryTyp property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getDlvryTyp() {
        return dlvryTyp;
    }

    /**
     * Sets the value of the dlvryTyp property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setDlvryTyp(BigInteger value) {
        this.dlvryTyp = value;
    }

    /**
     * Gets the value of the standInstDbTyp property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getStandInstDbTyp() {
        return standInstDbTyp;
    }

    /**
     * Sets the value of the standInstDbTyp property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setStandInstDbTyp(BigInteger value) {
        this.standInstDbTyp = value;
    }

    /**
     * Gets the value of the standInstDbName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStandInstDbName() {
        return standInstDbName;
    }

    /**
     * Sets the value of the standInstDbName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStandInstDbName(String value) {
        this.standInstDbName = value;
    }

    /**
     * Gets the value of the standInstDbID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStandInstDbID() {
        return standInstDbID;
    }

    /**
     * Sets the value of the standInstDbID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStandInstDbID(String value) {
        this.standInstDbID = value;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof SettlInstructionsDataBlockT)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final SettlInstructionsDataBlockT that = ((SettlInstructionsDataBlockT) object);
        {
            List<DlvyInstGrpBlockT> lhsDlvInst;
            lhsDlvInst = (((this.dlvInst!= null)&&(!this.dlvInst.isEmpty()))?this.getDlvInst():null);
            List<DlvyInstGrpBlockT> rhsDlvInst;
            rhsDlvInst = (((that.dlvInst!= null)&&(!that.dlvInst.isEmpty()))?that.getDlvInst():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "dlvInst", lhsDlvInst), LocatorUtils.property(thatLocator, "dlvInst", rhsDlvInst), lhsDlvInst, rhsDlvInst)) {
                return false;
            }
        }
        {
            BigInteger lhsDlvryTyp;
            lhsDlvryTyp = this.getDlvryTyp();
            BigInteger rhsDlvryTyp;
            rhsDlvryTyp = that.getDlvryTyp();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "dlvryTyp", lhsDlvryTyp), LocatorUtils.property(thatLocator, "dlvryTyp", rhsDlvryTyp), lhsDlvryTyp, rhsDlvryTyp)) {
                return false;
            }
        }
        {
            BigInteger lhsStandInstDbTyp;
            lhsStandInstDbTyp = this.getStandInstDbTyp();
            BigInteger rhsStandInstDbTyp;
            rhsStandInstDbTyp = that.getStandInstDbTyp();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "standInstDbTyp", lhsStandInstDbTyp), LocatorUtils.property(thatLocator, "standInstDbTyp", rhsStandInstDbTyp), lhsStandInstDbTyp, rhsStandInstDbTyp)) {
                return false;
            }
        }
        {
            String lhsStandInstDbName;
            lhsStandInstDbName = this.getStandInstDbName();
            String rhsStandInstDbName;
            rhsStandInstDbName = that.getStandInstDbName();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "standInstDbName", lhsStandInstDbName), LocatorUtils.property(thatLocator, "standInstDbName", rhsStandInstDbName), lhsStandInstDbName, rhsStandInstDbName)) {
                return false;
            }
        }
        {
            String lhsStandInstDbID;
            lhsStandInstDbID = this.getStandInstDbID();
            String rhsStandInstDbID;
            rhsStandInstDbID = that.getStandInstDbID();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "standInstDbID", lhsStandInstDbID), LocatorUtils.property(thatLocator, "standInstDbID", rhsStandInstDbID), lhsStandInstDbID, rhsStandInstDbID)) {
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
            List<DlvyInstGrpBlockT> theDlvInst;
            theDlvInst = (((this.dlvInst!= null)&&(!this.dlvInst.isEmpty()))?this.getDlvInst():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "dlvInst", theDlvInst), currentHashCode, theDlvInst);
        }
        {
            BigInteger theDlvryTyp;
            theDlvryTyp = this.getDlvryTyp();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "dlvryTyp", theDlvryTyp), currentHashCode, theDlvryTyp);
        }
        {
            BigInteger theStandInstDbTyp;
            theStandInstDbTyp = this.getStandInstDbTyp();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "standInstDbTyp", theStandInstDbTyp), currentHashCode, theStandInstDbTyp);
        }
        {
            String theStandInstDbName;
            theStandInstDbName = this.getStandInstDbName();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "standInstDbName", theStandInstDbName), currentHashCode, theStandInstDbName);
        }
        {
            String theStandInstDbID;
            theStandInstDbID = this.getStandInstDbID();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "standInstDbID", theStandInstDbID), currentHashCode, theStandInstDbID);
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
            List<DlvyInstGrpBlockT> theDlvInst;
            theDlvInst = (((this.dlvInst!= null)&&(!this.dlvInst.isEmpty()))?this.getDlvInst():null);
            strategy.appendField(locator, this, "dlvInst", buffer, theDlvInst);
        }
        {
            BigInteger theDlvryTyp;
            theDlvryTyp = this.getDlvryTyp();
            strategy.appendField(locator, this, "dlvryTyp", buffer, theDlvryTyp);
        }
        {
            BigInteger theStandInstDbTyp;
            theStandInstDbTyp = this.getStandInstDbTyp();
            strategy.appendField(locator, this, "standInstDbTyp", buffer, theStandInstDbTyp);
        }
        {
            String theStandInstDbName;
            theStandInstDbName = this.getStandInstDbName();
            strategy.appendField(locator, this, "standInstDbName", buffer, theStandInstDbName);
        }
        {
            String theStandInstDbID;
            theStandInstDbID = this.getStandInstDbID();
            strategy.appendField(locator, this, "standInstDbID", buffer, theStandInstDbID);
        }
        return buffer;
    }

}
