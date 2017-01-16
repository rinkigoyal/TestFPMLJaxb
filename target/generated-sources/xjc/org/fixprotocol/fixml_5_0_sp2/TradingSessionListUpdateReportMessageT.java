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
 * TradingSessionListUpdateReport can be found in Volume 3 of the
 * 						specification
 * 
 * <p>Java class for TradingSessionListUpdateReport_message_t complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TradingSessionListUpdateReport_message_t"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.fixprotocol.org/FIXML-5-0-SP2}Abstract_message_t"&gt;
 *       &lt;sequence&gt;
 *         &lt;group ref="{http://www.fixprotocol.org/FIXML-5-0-SP2}TradingSessionListUpdateReportElements"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attGroup ref="{http://www.fixprotocol.org/FIXML-5-0-SP2}TradingSessionListUpdateReportAttributes"/&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TradingSessionListUpdateReport_message_t", propOrder = {
    "applSeqCtrl",
    "trdSessLstGrp"
})
public class TradingSessionListUpdateReportMessageT
    extends AbstractMessageT
    implements Equals, HashCode, ToString
{

    @XmlElement(name = "ApplSeqCtrl")
    protected ApplicationSequenceControlBlockT applSeqCtrl;
    @XmlElement(name = "TrdSessLstGrp", required = true)
    protected List<TrdSessLstGrpBlockT> trdSessLstGrp;
    @XmlAttribute(name = "ReqID")
    protected String reqID;

    /**
     * Gets the value of the applSeqCtrl property.
     * 
     * @return
     *     possible object is
     *     {@link ApplicationSequenceControlBlockT }
     *     
     */
    public ApplicationSequenceControlBlockT getApplSeqCtrl() {
        return applSeqCtrl;
    }

    /**
     * Sets the value of the applSeqCtrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link ApplicationSequenceControlBlockT }
     *     
     */
    public void setApplSeqCtrl(ApplicationSequenceControlBlockT value) {
        this.applSeqCtrl = value;
    }

    /**
     * Gets the value of the trdSessLstGrp property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the trdSessLstGrp property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTrdSessLstGrp().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TrdSessLstGrpBlockT }
     * 
     * 
     */
    public List<TrdSessLstGrpBlockT> getTrdSessLstGrp() {
        if (trdSessLstGrp == null) {
            trdSessLstGrp = new ArrayList<TrdSessLstGrpBlockT>();
        }
        return this.trdSessLstGrp;
    }

    /**
     * Gets the value of the reqID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReqID() {
        return reqID;
    }

    /**
     * Sets the value of the reqID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReqID(String value) {
        this.reqID = value;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof TradingSessionListUpdateReportMessageT)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        if (!super.equals(thisLocator, thatLocator, object, strategy)) {
            return false;
        }
        final TradingSessionListUpdateReportMessageT that = ((TradingSessionListUpdateReportMessageT) object);
        {
            ApplicationSequenceControlBlockT lhsApplSeqCtrl;
            lhsApplSeqCtrl = this.getApplSeqCtrl();
            ApplicationSequenceControlBlockT rhsApplSeqCtrl;
            rhsApplSeqCtrl = that.getApplSeqCtrl();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "applSeqCtrl", lhsApplSeqCtrl), LocatorUtils.property(thatLocator, "applSeqCtrl", rhsApplSeqCtrl), lhsApplSeqCtrl, rhsApplSeqCtrl)) {
                return false;
            }
        }
        {
            List<TrdSessLstGrpBlockT> lhsTrdSessLstGrp;
            lhsTrdSessLstGrp = (((this.trdSessLstGrp!= null)&&(!this.trdSessLstGrp.isEmpty()))?this.getTrdSessLstGrp():null);
            List<TrdSessLstGrpBlockT> rhsTrdSessLstGrp;
            rhsTrdSessLstGrp = (((that.trdSessLstGrp!= null)&&(!that.trdSessLstGrp.isEmpty()))?that.getTrdSessLstGrp():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "trdSessLstGrp", lhsTrdSessLstGrp), LocatorUtils.property(thatLocator, "trdSessLstGrp", rhsTrdSessLstGrp), lhsTrdSessLstGrp, rhsTrdSessLstGrp)) {
                return false;
            }
        }
        {
            String lhsReqID;
            lhsReqID = this.getReqID();
            String rhsReqID;
            rhsReqID = that.getReqID();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "reqID", lhsReqID), LocatorUtils.property(thatLocator, "reqID", rhsReqID), lhsReqID, rhsReqID)) {
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
            ApplicationSequenceControlBlockT theApplSeqCtrl;
            theApplSeqCtrl = this.getApplSeqCtrl();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "applSeqCtrl", theApplSeqCtrl), currentHashCode, theApplSeqCtrl);
        }
        {
            List<TrdSessLstGrpBlockT> theTrdSessLstGrp;
            theTrdSessLstGrp = (((this.trdSessLstGrp!= null)&&(!this.trdSessLstGrp.isEmpty()))?this.getTrdSessLstGrp():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "trdSessLstGrp", theTrdSessLstGrp), currentHashCode, theTrdSessLstGrp);
        }
        {
            String theReqID;
            theReqID = this.getReqID();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "reqID", theReqID), currentHashCode, theReqID);
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
            ApplicationSequenceControlBlockT theApplSeqCtrl;
            theApplSeqCtrl = this.getApplSeqCtrl();
            strategy.appendField(locator, this, "applSeqCtrl", buffer, theApplSeqCtrl);
        }
        {
            List<TrdSessLstGrpBlockT> theTrdSessLstGrp;
            theTrdSessLstGrp = (((this.trdSessLstGrp!= null)&&(!this.trdSessLstGrp.isEmpty()))?this.getTrdSessLstGrp():null);
            strategy.appendField(locator, this, "trdSessLstGrp", buffer, theTrdSessLstGrp);
        }
        {
            String theReqID;
            theReqID = this.getReqID();
            strategy.appendField(locator, this, "reqID", buffer, theReqID);
        }
        return buffer;
    }

}
