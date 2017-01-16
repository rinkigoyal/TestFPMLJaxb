//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.01.14 at 04:50:28 PM SGT 
//


package org.fixprotocol.fixml_5_0_sp2;

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
 * RegistrationInstructions can be found in Volume 5 of the
 * 						specification
 * 
 * <p>Java class for RegistrationInstructions_message_t complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RegistrationInstructions_message_t"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.fixprotocol.org/FIXML-5-0-SP2}Abstract_message_t"&gt;
 *       &lt;sequence&gt;
 *         &lt;group ref="{http://www.fixprotocol.org/FIXML-5-0-SP2}RegistrationInstructionsElements"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attGroup ref="{http://www.fixprotocol.org/FIXML-5-0-SP2}RegistrationInstructionsAttributes"/&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RegistrationInstructions_message_t", propOrder = {
    "pty",
    "rgDtl",
    "rgDtlInst"
})
public class RegistrationInstructionsMessageT
    extends AbstractMessageT
    implements Equals, HashCode, ToString
{

    @XmlElement(name = "Pty")
    protected List<PartiesBlockT> pty;
    @XmlElement(name = "RgDtl")
    protected List<RgstDtlsGrpBlockT> rgDtl;
    @XmlElement(name = "RgDtlInst")
    protected List<RgstDistInstGrpBlockT> rgDtlInst;
    @XmlAttribute(name = "ID", required = true)
    protected String id;
    @XmlAttribute(name = "TransTyp", required = true)
    protected String transTyp;
    @XmlAttribute(name = "RefID", required = true)
    protected String refID;
    @XmlAttribute(name = "ClOrdID")
    protected String clOrdID;
    @XmlAttribute(name = "Acct")
    protected String acct;
    @XmlAttribute(name = "AcctIDSrc")
    protected String acctIDSrc;
    @XmlAttribute(name = "AcctTyp")
    protected String acctTyp;
    @XmlAttribute(name = "TaxAdvantageTyp")
    protected String taxAdvantageTyp;
    @XmlAttribute(name = "OwnershipTyp")
    protected String ownershipTyp;

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
     * {@link PartiesBlockT }
     * 
     * 
     */
    public List<PartiesBlockT> getPty() {
        if (pty == null) {
            pty = new ArrayList<PartiesBlockT>();
        }
        return this.pty;
    }

    /**
     * Gets the value of the rgDtl property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the rgDtl property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRgDtl().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RgstDtlsGrpBlockT }
     * 
     * 
     */
    public List<RgstDtlsGrpBlockT> getRgDtl() {
        if (rgDtl == null) {
            rgDtl = new ArrayList<RgstDtlsGrpBlockT>();
        }
        return this.rgDtl;
    }

    /**
     * Gets the value of the rgDtlInst property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the rgDtlInst property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRgDtlInst().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RgstDistInstGrpBlockT }
     * 
     * 
     */
    public List<RgstDistInstGrpBlockT> getRgDtlInst() {
        if (rgDtlInst == null) {
            rgDtlInst = new ArrayList<RgstDistInstGrpBlockT>();
        }
        return this.rgDtlInst;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getID() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setID(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the transTyp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransTyp() {
        return transTyp;
    }

    /**
     * Sets the value of the transTyp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransTyp(String value) {
        this.transTyp = value;
    }

    /**
     * Gets the value of the refID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRefID() {
        return refID;
    }

    /**
     * Sets the value of the refID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRefID(String value) {
        this.refID = value;
    }

    /**
     * Gets the value of the clOrdID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClOrdID() {
        return clOrdID;
    }

    /**
     * Sets the value of the clOrdID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClOrdID(String value) {
        this.clOrdID = value;
    }

    /**
     * Gets the value of the acct property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcct() {
        return acct;
    }

    /**
     * Sets the value of the acct property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAcct(String value) {
        this.acct = value;
    }

    /**
     * Gets the value of the acctIDSrc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcctIDSrc() {
        return acctIDSrc;
    }

    /**
     * Sets the value of the acctIDSrc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAcctIDSrc(String value) {
        this.acctIDSrc = value;
    }

    /**
     * Gets the value of the acctTyp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcctTyp() {
        return acctTyp;
    }

    /**
     * Sets the value of the acctTyp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAcctTyp(String value) {
        this.acctTyp = value;
    }

    /**
     * Gets the value of the taxAdvantageTyp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaxAdvantageTyp() {
        return taxAdvantageTyp;
    }

    /**
     * Sets the value of the taxAdvantageTyp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaxAdvantageTyp(String value) {
        this.taxAdvantageTyp = value;
    }

    /**
     * Gets the value of the ownershipTyp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOwnershipTyp() {
        return ownershipTyp;
    }

    /**
     * Sets the value of the ownershipTyp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOwnershipTyp(String value) {
        this.ownershipTyp = value;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof RegistrationInstructionsMessageT)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        if (!super.equals(thisLocator, thatLocator, object, strategy)) {
            return false;
        }
        final RegistrationInstructionsMessageT that = ((RegistrationInstructionsMessageT) object);
        {
            List<PartiesBlockT> lhsPty;
            lhsPty = (((this.pty!= null)&&(!this.pty.isEmpty()))?this.getPty():null);
            List<PartiesBlockT> rhsPty;
            rhsPty = (((that.pty!= null)&&(!that.pty.isEmpty()))?that.getPty():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "pty", lhsPty), LocatorUtils.property(thatLocator, "pty", rhsPty), lhsPty, rhsPty)) {
                return false;
            }
        }
        {
            List<RgstDtlsGrpBlockT> lhsRgDtl;
            lhsRgDtl = (((this.rgDtl!= null)&&(!this.rgDtl.isEmpty()))?this.getRgDtl():null);
            List<RgstDtlsGrpBlockT> rhsRgDtl;
            rhsRgDtl = (((that.rgDtl!= null)&&(!that.rgDtl.isEmpty()))?that.getRgDtl():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "rgDtl", lhsRgDtl), LocatorUtils.property(thatLocator, "rgDtl", rhsRgDtl), lhsRgDtl, rhsRgDtl)) {
                return false;
            }
        }
        {
            List<RgstDistInstGrpBlockT> lhsRgDtlInst;
            lhsRgDtlInst = (((this.rgDtlInst!= null)&&(!this.rgDtlInst.isEmpty()))?this.getRgDtlInst():null);
            List<RgstDistInstGrpBlockT> rhsRgDtlInst;
            rhsRgDtlInst = (((that.rgDtlInst!= null)&&(!that.rgDtlInst.isEmpty()))?that.getRgDtlInst():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "rgDtlInst", lhsRgDtlInst), LocatorUtils.property(thatLocator, "rgDtlInst", rhsRgDtlInst), lhsRgDtlInst, rhsRgDtlInst)) {
                return false;
            }
        }
        {
            String lhsID;
            lhsID = this.getID();
            String rhsID;
            rhsID = that.getID();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "id", lhsID), LocatorUtils.property(thatLocator, "id", rhsID), lhsID, rhsID)) {
                return false;
            }
        }
        {
            String lhsTransTyp;
            lhsTransTyp = this.getTransTyp();
            String rhsTransTyp;
            rhsTransTyp = that.getTransTyp();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "transTyp", lhsTransTyp), LocatorUtils.property(thatLocator, "transTyp", rhsTransTyp), lhsTransTyp, rhsTransTyp)) {
                return false;
            }
        }
        {
            String lhsRefID;
            lhsRefID = this.getRefID();
            String rhsRefID;
            rhsRefID = that.getRefID();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "refID", lhsRefID), LocatorUtils.property(thatLocator, "refID", rhsRefID), lhsRefID, rhsRefID)) {
                return false;
            }
        }
        {
            String lhsClOrdID;
            lhsClOrdID = this.getClOrdID();
            String rhsClOrdID;
            rhsClOrdID = that.getClOrdID();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "clOrdID", lhsClOrdID), LocatorUtils.property(thatLocator, "clOrdID", rhsClOrdID), lhsClOrdID, rhsClOrdID)) {
                return false;
            }
        }
        {
            String lhsAcct;
            lhsAcct = this.getAcct();
            String rhsAcct;
            rhsAcct = that.getAcct();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "acct", lhsAcct), LocatorUtils.property(thatLocator, "acct", rhsAcct), lhsAcct, rhsAcct)) {
                return false;
            }
        }
        {
            String lhsAcctIDSrc;
            lhsAcctIDSrc = this.getAcctIDSrc();
            String rhsAcctIDSrc;
            rhsAcctIDSrc = that.getAcctIDSrc();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "acctIDSrc", lhsAcctIDSrc), LocatorUtils.property(thatLocator, "acctIDSrc", rhsAcctIDSrc), lhsAcctIDSrc, rhsAcctIDSrc)) {
                return false;
            }
        }
        {
            String lhsAcctTyp;
            lhsAcctTyp = this.getAcctTyp();
            String rhsAcctTyp;
            rhsAcctTyp = that.getAcctTyp();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "acctTyp", lhsAcctTyp), LocatorUtils.property(thatLocator, "acctTyp", rhsAcctTyp), lhsAcctTyp, rhsAcctTyp)) {
                return false;
            }
        }
        {
            String lhsTaxAdvantageTyp;
            lhsTaxAdvantageTyp = this.getTaxAdvantageTyp();
            String rhsTaxAdvantageTyp;
            rhsTaxAdvantageTyp = that.getTaxAdvantageTyp();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "taxAdvantageTyp", lhsTaxAdvantageTyp), LocatorUtils.property(thatLocator, "taxAdvantageTyp", rhsTaxAdvantageTyp), lhsTaxAdvantageTyp, rhsTaxAdvantageTyp)) {
                return false;
            }
        }
        {
            String lhsOwnershipTyp;
            lhsOwnershipTyp = this.getOwnershipTyp();
            String rhsOwnershipTyp;
            rhsOwnershipTyp = that.getOwnershipTyp();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "ownershipTyp", lhsOwnershipTyp), LocatorUtils.property(thatLocator, "ownershipTyp", rhsOwnershipTyp), lhsOwnershipTyp, rhsOwnershipTyp)) {
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
        int currentHashCode = super.hashCode(locator, strategy);
        {
            List<PartiesBlockT> thePty;
            thePty = (((this.pty!= null)&&(!this.pty.isEmpty()))?this.getPty():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "pty", thePty), currentHashCode, thePty);
        }
        {
            List<RgstDtlsGrpBlockT> theRgDtl;
            theRgDtl = (((this.rgDtl!= null)&&(!this.rgDtl.isEmpty()))?this.getRgDtl():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "rgDtl", theRgDtl), currentHashCode, theRgDtl);
        }
        {
            List<RgstDistInstGrpBlockT> theRgDtlInst;
            theRgDtlInst = (((this.rgDtlInst!= null)&&(!this.rgDtlInst.isEmpty()))?this.getRgDtlInst():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "rgDtlInst", theRgDtlInst), currentHashCode, theRgDtlInst);
        }
        {
            String theID;
            theID = this.getID();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "id", theID), currentHashCode, theID);
        }
        {
            String theTransTyp;
            theTransTyp = this.getTransTyp();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "transTyp", theTransTyp), currentHashCode, theTransTyp);
        }
        {
            String theRefID;
            theRefID = this.getRefID();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "refID", theRefID), currentHashCode, theRefID);
        }
        {
            String theClOrdID;
            theClOrdID = this.getClOrdID();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "clOrdID", theClOrdID), currentHashCode, theClOrdID);
        }
        {
            String theAcct;
            theAcct = this.getAcct();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "acct", theAcct), currentHashCode, theAcct);
        }
        {
            String theAcctIDSrc;
            theAcctIDSrc = this.getAcctIDSrc();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "acctIDSrc", theAcctIDSrc), currentHashCode, theAcctIDSrc);
        }
        {
            String theAcctTyp;
            theAcctTyp = this.getAcctTyp();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "acctTyp", theAcctTyp), currentHashCode, theAcctTyp);
        }
        {
            String theTaxAdvantageTyp;
            theTaxAdvantageTyp = this.getTaxAdvantageTyp();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "taxAdvantageTyp", theTaxAdvantageTyp), currentHashCode, theTaxAdvantageTyp);
        }
        {
            String theOwnershipTyp;
            theOwnershipTyp = this.getOwnershipTyp();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "ownershipTyp", theOwnershipTyp), currentHashCode, theOwnershipTyp);
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
        super.appendFields(locator, buffer, strategy);
        {
            List<PartiesBlockT> thePty;
            thePty = (((this.pty!= null)&&(!this.pty.isEmpty()))?this.getPty():null);
            strategy.appendField(locator, this, "pty", buffer, thePty);
        }
        {
            List<RgstDtlsGrpBlockT> theRgDtl;
            theRgDtl = (((this.rgDtl!= null)&&(!this.rgDtl.isEmpty()))?this.getRgDtl():null);
            strategy.appendField(locator, this, "rgDtl", buffer, theRgDtl);
        }
        {
            List<RgstDistInstGrpBlockT> theRgDtlInst;
            theRgDtlInst = (((this.rgDtlInst!= null)&&(!this.rgDtlInst.isEmpty()))?this.getRgDtlInst():null);
            strategy.appendField(locator, this, "rgDtlInst", buffer, theRgDtlInst);
        }
        {
            String theID;
            theID = this.getID();
            strategy.appendField(locator, this, "id", buffer, theID);
        }
        {
            String theTransTyp;
            theTransTyp = this.getTransTyp();
            strategy.appendField(locator, this, "transTyp", buffer, theTransTyp);
        }
        {
            String theRefID;
            theRefID = this.getRefID();
            strategy.appendField(locator, this, "refID", buffer, theRefID);
        }
        {
            String theClOrdID;
            theClOrdID = this.getClOrdID();
            strategy.appendField(locator, this, "clOrdID", buffer, theClOrdID);
        }
        {
            String theAcct;
            theAcct = this.getAcct();
            strategy.appendField(locator, this, "acct", buffer, theAcct);
        }
        {
            String theAcctIDSrc;
            theAcctIDSrc = this.getAcctIDSrc();
            strategy.appendField(locator, this, "acctIDSrc", buffer, theAcctIDSrc);
        }
        {
            String theAcctTyp;
            theAcctTyp = this.getAcctTyp();
            strategy.appendField(locator, this, "acctTyp", buffer, theAcctTyp);
        }
        {
            String theTaxAdvantageTyp;
            theTaxAdvantageTyp = this.getTaxAdvantageTyp();
            strategy.appendField(locator, this, "taxAdvantageTyp", buffer, theTaxAdvantageTyp);
        }
        {
            String theOwnershipTyp;
            theOwnershipTyp = this.getOwnershipTyp();
            strategy.appendField(locator, this, "ownershipTyp", buffer, theOwnershipTyp);
        }
        return buffer;
    }

}