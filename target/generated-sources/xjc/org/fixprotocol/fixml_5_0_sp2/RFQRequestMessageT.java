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
 * RFQRequest can be found in Volume 3 of the
 * 						specification
 * 
 * <p>Java class for RFQRequest_message_t complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RFQRequest_message_t"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.fixprotocol.org/FIXML-5-0-SP2}Abstract_message_t"&gt;
 *       &lt;sequence&gt;
 *         &lt;group ref="{http://www.fixprotocol.org/FIXML-5-0-SP2}RFQRequestElements"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attGroup ref="{http://www.fixprotocol.org/FIXML-5-0-SP2}RFQRequestAttributes"/&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RFQRequest_message_t", propOrder = {
    "pty",
    "rfqReq"
})
public class RFQRequestMessageT
    extends AbstractMessageT
    implements Equals, HashCode, ToString
{

    @XmlElement(name = "Pty")
    protected List<PartiesBlockT> pty;
    @XmlElement(name = "RFQReq", required = true)
    protected List<RFQReqGrpBlockT> rfqReq;
    @XmlAttribute(name = "RFQReqID", required = true)
    protected String rfqReqID;
    @XmlAttribute(name = "SubReqTyp")
    protected String subReqTyp;
    @XmlAttribute(name = "PrvtQt")
    protected PrivateQuoteEnumT prvtQt;

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
     * Gets the value of the rfqReq property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the rfqReq property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRFQReq().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RFQReqGrpBlockT }
     * 
     * 
     */
    public List<RFQReqGrpBlockT> getRFQReq() {
        if (rfqReq == null) {
            rfqReq = new ArrayList<RFQReqGrpBlockT>();
        }
        return this.rfqReq;
    }

    /**
     * Gets the value of the rfqReqID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRFQReqID() {
        return rfqReqID;
    }

    /**
     * Sets the value of the rfqReqID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRFQReqID(String value) {
        this.rfqReqID = value;
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
     * Gets the value of the prvtQt property.
     * 
     * @return
     *     possible object is
     *     {@link PrivateQuoteEnumT }
     *     
     */
    public PrivateQuoteEnumT getPrvtQt() {
        return prvtQt;
    }

    /**
     * Sets the value of the prvtQt property.
     * 
     * @param value
     *     allowed object is
     *     {@link PrivateQuoteEnumT }
     *     
     */
    public void setPrvtQt(PrivateQuoteEnumT value) {
        this.prvtQt = value;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof RFQRequestMessageT)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        if (!super.equals(thisLocator, thatLocator, object, strategy)) {
            return false;
        }
        final RFQRequestMessageT that = ((RFQRequestMessageT) object);
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
            List<RFQReqGrpBlockT> lhsRFQReq;
            lhsRFQReq = (((this.rfqReq!= null)&&(!this.rfqReq.isEmpty()))?this.getRFQReq():null);
            List<RFQReqGrpBlockT> rhsRFQReq;
            rhsRFQReq = (((that.rfqReq!= null)&&(!that.rfqReq.isEmpty()))?that.getRFQReq():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "rfqReq", lhsRFQReq), LocatorUtils.property(thatLocator, "rfqReq", rhsRFQReq), lhsRFQReq, rhsRFQReq)) {
                return false;
            }
        }
        {
            String lhsRFQReqID;
            lhsRFQReqID = this.getRFQReqID();
            String rhsRFQReqID;
            rhsRFQReqID = that.getRFQReqID();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "rfqReqID", lhsRFQReqID), LocatorUtils.property(thatLocator, "rfqReqID", rhsRFQReqID), lhsRFQReqID, rhsRFQReqID)) {
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
            PrivateQuoteEnumT lhsPrvtQt;
            lhsPrvtQt = this.getPrvtQt();
            PrivateQuoteEnumT rhsPrvtQt;
            rhsPrvtQt = that.getPrvtQt();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "prvtQt", lhsPrvtQt), LocatorUtils.property(thatLocator, "prvtQt", rhsPrvtQt), lhsPrvtQt, rhsPrvtQt)) {
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
            List<RFQReqGrpBlockT> theRFQReq;
            theRFQReq = (((this.rfqReq!= null)&&(!this.rfqReq.isEmpty()))?this.getRFQReq():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "rfqReq", theRFQReq), currentHashCode, theRFQReq);
        }
        {
            String theRFQReqID;
            theRFQReqID = this.getRFQReqID();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "rfqReqID", theRFQReqID), currentHashCode, theRFQReqID);
        }
        {
            String theSubReqTyp;
            theSubReqTyp = this.getSubReqTyp();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "subReqTyp", theSubReqTyp), currentHashCode, theSubReqTyp);
        }
        {
            PrivateQuoteEnumT thePrvtQt;
            thePrvtQt = this.getPrvtQt();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "prvtQt", thePrvtQt), currentHashCode, thePrvtQt);
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
            List<RFQReqGrpBlockT> theRFQReq;
            theRFQReq = (((this.rfqReq!= null)&&(!this.rfqReq.isEmpty()))?this.getRFQReq():null);
            strategy.appendField(locator, this, "rfqReq", buffer, theRFQReq);
        }
        {
            String theRFQReqID;
            theRFQReqID = this.getRFQReqID();
            strategy.appendField(locator, this, "rfqReqID", buffer, theRFQReqID);
        }
        {
            String theSubReqTyp;
            theSubReqTyp = this.getSubReqTyp();
            strategy.appendField(locator, this, "subReqTyp", buffer, theSubReqTyp);
        }
        {
            PrivateQuoteEnumT thePrvtQt;
            thePrvtQt = this.getPrvtQt();
            strategy.appendField(locator, this, "prvtQt", buffer, thePrvtQt);
        }
        return buffer;
    }

}
