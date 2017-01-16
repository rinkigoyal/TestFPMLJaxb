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
 * SecurityStatusRequest can be found in Volume 3 of the
 * 						specification
 * 
 * <p>Java class for SecurityStatusRequest_message_t complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SecurityStatusRequest_message_t"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.fixprotocol.org/FIXML-5-0-SP2}Abstract_message_t"&gt;
 *       &lt;sequence&gt;
 *         &lt;group ref="{http://www.fixprotocol.org/FIXML-5-0-SP2}SecurityStatusRequestElements"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attGroup ref="{http://www.fixprotocol.org/FIXML-5-0-SP2}SecurityStatusRequestAttributes"/&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SecurityStatusRequest_message_t", propOrder = {
    "instrmt",
    "instrmtExt",
    "undly",
    "leg"
})
public class SecurityStatusRequestMessageT
    extends AbstractMessageT
    implements Equals, HashCode, ToString
{

    @XmlElement(name = "Instrmt", required = true)
    protected InstrumentBlockT instrmt;
    @XmlElement(name = "InstrmtExt")
    protected InstrumentExtensionBlockT instrmtExt;
    @XmlElement(name = "Undly")
    protected List<UndInstrmtGrpBlockT> undly;
    @XmlElement(name = "Leg")
    protected List<InstrmtLegGrpBlockT> leg;
    @XmlAttribute(name = "StatReqID", required = true)
    protected String statReqID;
    @XmlAttribute(name = "Ccy")
    protected String ccy;
    @XmlAttribute(name = "SubReqTyp", required = true)
    protected String subReqTyp;
    @XmlAttribute(name = "MktID")
    protected String mktID;
    @XmlAttribute(name = "MktSegID")
    protected String mktSegID;
    @XmlAttribute(name = "SesID")
    protected String sesID;
    @XmlAttribute(name = "SesSub")
    protected String sesSub;

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
     * Gets the value of the instrmtExt property.
     * 
     * @return
     *     possible object is
     *     {@link InstrumentExtensionBlockT }
     *     
     */
    public InstrumentExtensionBlockT getInstrmtExt() {
        return instrmtExt;
    }

    /**
     * Sets the value of the instrmtExt property.
     * 
     * @param value
     *     allowed object is
     *     {@link InstrumentExtensionBlockT }
     *     
     */
    public void setInstrmtExt(InstrumentExtensionBlockT value) {
        this.instrmtExt = value;
    }

    /**
     * Gets the value of the undly property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the undly property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUndly().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link UndInstrmtGrpBlockT }
     * 
     * 
     */
    public List<UndInstrmtGrpBlockT> getUndly() {
        if (undly == null) {
            undly = new ArrayList<UndInstrmtGrpBlockT>();
        }
        return this.undly;
    }

    /**
     * Gets the value of the leg property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the leg property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLeg().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link InstrmtLegGrpBlockT }
     * 
     * 
     */
    public List<InstrmtLegGrpBlockT> getLeg() {
        if (leg == null) {
            leg = new ArrayList<InstrmtLegGrpBlockT>();
        }
        return this.leg;
    }

    /**
     * Gets the value of the statReqID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatReqID() {
        return statReqID;
    }

    /**
     * Sets the value of the statReqID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatReqID(String value) {
        this.statReqID = value;
    }

    /**
     * Gets the value of the ccy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCcy() {
        return ccy;
    }

    /**
     * Sets the value of the ccy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCcy(String value) {
        this.ccy = value;
    }

    /**
     * Gets the value of the subReqTyp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubReqTyp() {
        return subReqTyp;
    }

    /**
     * Sets the value of the subReqTyp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubReqTyp(String value) {
        this.subReqTyp = value;
    }

    /**
     * Gets the value of the mktID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMktID() {
        return mktID;
    }

    /**
     * Sets the value of the mktID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMktID(String value) {
        this.mktID = value;
    }

    /**
     * Gets the value of the mktSegID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMktSegID() {
        return mktSegID;
    }

    /**
     * Sets the value of the mktSegID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMktSegID(String value) {
        this.mktSegID = value;
    }

    /**
     * Gets the value of the sesID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSesID() {
        return sesID;
    }

    /**
     * Sets the value of the sesID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSesID(String value) {
        this.sesID = value;
    }

    /**
     * Gets the value of the sesSub property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSesSub() {
        return sesSub;
    }

    /**
     * Sets the value of the sesSub property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSesSub(String value) {
        this.sesSub = value;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof SecurityStatusRequestMessageT)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        if (!super.equals(thisLocator, thatLocator, object, strategy)) {
            return false;
        }
        final SecurityStatusRequestMessageT that = ((SecurityStatusRequestMessageT) object);
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
            InstrumentExtensionBlockT lhsInstrmtExt;
            lhsInstrmtExt = this.getInstrmtExt();
            InstrumentExtensionBlockT rhsInstrmtExt;
            rhsInstrmtExt = that.getInstrmtExt();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "instrmtExt", lhsInstrmtExt), LocatorUtils.property(thatLocator, "instrmtExt", rhsInstrmtExt), lhsInstrmtExt, rhsInstrmtExt)) {
                return false;
            }
        }
        {
            List<UndInstrmtGrpBlockT> lhsUndly;
            lhsUndly = (((this.undly!= null)&&(!this.undly.isEmpty()))?this.getUndly():null);
            List<UndInstrmtGrpBlockT> rhsUndly;
            rhsUndly = (((that.undly!= null)&&(!that.undly.isEmpty()))?that.getUndly():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "undly", lhsUndly), LocatorUtils.property(thatLocator, "undly", rhsUndly), lhsUndly, rhsUndly)) {
                return false;
            }
        }
        {
            List<InstrmtLegGrpBlockT> lhsLeg;
            lhsLeg = (((this.leg!= null)&&(!this.leg.isEmpty()))?this.getLeg():null);
            List<InstrmtLegGrpBlockT> rhsLeg;
            rhsLeg = (((that.leg!= null)&&(!that.leg.isEmpty()))?that.getLeg():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "leg", lhsLeg), LocatorUtils.property(thatLocator, "leg", rhsLeg), lhsLeg, rhsLeg)) {
                return false;
            }
        }
        {
            String lhsStatReqID;
            lhsStatReqID = this.getStatReqID();
            String rhsStatReqID;
            rhsStatReqID = that.getStatReqID();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "statReqID", lhsStatReqID), LocatorUtils.property(thatLocator, "statReqID", rhsStatReqID), lhsStatReqID, rhsStatReqID)) {
                return false;
            }
        }
        {
            String lhsCcy;
            lhsCcy = this.getCcy();
            String rhsCcy;
            rhsCcy = that.getCcy();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "ccy", lhsCcy), LocatorUtils.property(thatLocator, "ccy", rhsCcy), lhsCcy, rhsCcy)) {
                return false;
            }
        }
        {
            String lhsSubReqTyp;
            lhsSubReqTyp = this.getSubReqTyp();
            String rhsSubReqTyp;
            rhsSubReqTyp = that.getSubReqTyp();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "subReqTyp", lhsSubReqTyp), LocatorUtils.property(thatLocator, "subReqTyp", rhsSubReqTyp), lhsSubReqTyp, rhsSubReqTyp)) {
                return false;
            }
        }
        {
            String lhsMktID;
            lhsMktID = this.getMktID();
            String rhsMktID;
            rhsMktID = that.getMktID();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "mktID", lhsMktID), LocatorUtils.property(thatLocator, "mktID", rhsMktID), lhsMktID, rhsMktID)) {
                return false;
            }
        }
        {
            String lhsMktSegID;
            lhsMktSegID = this.getMktSegID();
            String rhsMktSegID;
            rhsMktSegID = that.getMktSegID();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "mktSegID", lhsMktSegID), LocatorUtils.property(thatLocator, "mktSegID", rhsMktSegID), lhsMktSegID, rhsMktSegID)) {
                return false;
            }
        }
        {
            String lhsSesID;
            lhsSesID = this.getSesID();
            String rhsSesID;
            rhsSesID = that.getSesID();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "sesID", lhsSesID), LocatorUtils.property(thatLocator, "sesID", rhsSesID), lhsSesID, rhsSesID)) {
                return false;
            }
        }
        {
            String lhsSesSub;
            lhsSesSub = this.getSesSub();
            String rhsSesSub;
            rhsSesSub = that.getSesSub();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "sesSub", lhsSesSub), LocatorUtils.property(thatLocator, "sesSub", rhsSesSub), lhsSesSub, rhsSesSub)) {
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
            InstrumentBlockT theInstrmt;
            theInstrmt = this.getInstrmt();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "instrmt", theInstrmt), currentHashCode, theInstrmt);
        }
        {
            InstrumentExtensionBlockT theInstrmtExt;
            theInstrmtExt = this.getInstrmtExt();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "instrmtExt", theInstrmtExt), currentHashCode, theInstrmtExt);
        }
        {
            List<UndInstrmtGrpBlockT> theUndly;
            theUndly = (((this.undly!= null)&&(!this.undly.isEmpty()))?this.getUndly():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "undly", theUndly), currentHashCode, theUndly);
        }
        {
            List<InstrmtLegGrpBlockT> theLeg;
            theLeg = (((this.leg!= null)&&(!this.leg.isEmpty()))?this.getLeg():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "leg", theLeg), currentHashCode, theLeg);
        }
        {
            String theStatReqID;
            theStatReqID = this.getStatReqID();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "statReqID", theStatReqID), currentHashCode, theStatReqID);
        }
        {
            String theCcy;
            theCcy = this.getCcy();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "ccy", theCcy), currentHashCode, theCcy);
        }
        {
            String theSubReqTyp;
            theSubReqTyp = this.getSubReqTyp();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "subReqTyp", theSubReqTyp), currentHashCode, theSubReqTyp);
        }
        {
            String theMktID;
            theMktID = this.getMktID();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "mktID", theMktID), currentHashCode, theMktID);
        }
        {
            String theMktSegID;
            theMktSegID = this.getMktSegID();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "mktSegID", theMktSegID), currentHashCode, theMktSegID);
        }
        {
            String theSesID;
            theSesID = this.getSesID();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "sesID", theSesID), currentHashCode, theSesID);
        }
        {
            String theSesSub;
            theSesSub = this.getSesSub();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "sesSub", theSesSub), currentHashCode, theSesSub);
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
            InstrumentBlockT theInstrmt;
            theInstrmt = this.getInstrmt();
            strategy.appendField(locator, this, "instrmt", buffer, theInstrmt);
        }
        {
            InstrumentExtensionBlockT theInstrmtExt;
            theInstrmtExt = this.getInstrmtExt();
            strategy.appendField(locator, this, "instrmtExt", buffer, theInstrmtExt);
        }
        {
            List<UndInstrmtGrpBlockT> theUndly;
            theUndly = (((this.undly!= null)&&(!this.undly.isEmpty()))?this.getUndly():null);
            strategy.appendField(locator, this, "undly", buffer, theUndly);
        }
        {
            List<InstrmtLegGrpBlockT> theLeg;
            theLeg = (((this.leg!= null)&&(!this.leg.isEmpty()))?this.getLeg():null);
            strategy.appendField(locator, this, "leg", buffer, theLeg);
        }
        {
            String theStatReqID;
            theStatReqID = this.getStatReqID();
            strategy.appendField(locator, this, "statReqID", buffer, theStatReqID);
        }
        {
            String theCcy;
            theCcy = this.getCcy();
            strategy.appendField(locator, this, "ccy", buffer, theCcy);
        }
        {
            String theSubReqTyp;
            theSubReqTyp = this.getSubReqTyp();
            strategy.appendField(locator, this, "subReqTyp", buffer, theSubReqTyp);
        }
        {
            String theMktID;
            theMktID = this.getMktID();
            strategy.appendField(locator, this, "mktID", buffer, theMktID);
        }
        {
            String theMktSegID;
            theMktSegID = this.getMktSegID();
            strategy.appendField(locator, this, "mktSegID", buffer, theMktSegID);
        }
        {
            String theSesID;
            theSesID = this.getSesID();
            strategy.appendField(locator, this, "sesID", buffer, theSesID);
        }
        {
            String theSesSub;
            theSesSub = this.getSesSub();
            strategy.appendField(locator, this, "sesSub", buffer, theSesSub);
        }
        return buffer;
    }

}