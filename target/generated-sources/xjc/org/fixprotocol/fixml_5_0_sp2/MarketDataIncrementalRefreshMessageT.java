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
 * MarketDataIncrementalRefresh can be found in Volume 3 of the
 * 						specification
 * 
 * <p>Java class for MarketDataIncrementalRefresh_message_t complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MarketDataIncrementalRefresh_message_t"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.fixprotocol.org/FIXML-5-0-SP2}Abstract_message_t"&gt;
 *       &lt;sequence&gt;
 *         &lt;group ref="{http://www.fixprotocol.org/FIXML-5-0-SP2}MarketDataIncrementalRefreshElements"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attGroup ref="{http://www.fixprotocol.org/FIXML-5-0-SP2}MarketDataIncrementalRefreshAttributes"/&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MarketDataIncrementalRefresh_message_t", propOrder = {
    "applSeqCtrl",
    "inc",
    "rtg"
})
public class MarketDataIncrementalRefreshMessageT
    extends AbstractMessageT
    implements Equals, HashCode, ToString
{

    @XmlElement(name = "ApplSeqCtrl")
    protected ApplicationSequenceControlBlockT applSeqCtrl;
    @XmlElement(name = "Inc", required = true)
    protected List<MDIncGrpBlockT> inc;
    @XmlElement(name = "Rtg")
    protected List<RoutingGrpBlockT> rtg;
    @XmlAttribute(name = "MDBkTyp")
    protected BigInteger mdBkTyp;
    @XmlAttribute(name = "MDFeedTyp")
    protected String mdFeedTyp;
    @XmlAttribute(name = "TrdDt")
    protected XMLGregorianCalendar trdDt;
    @XmlAttribute(name = "ReqID")
    protected String reqID;
    @XmlAttribute(name = "ApplQuDepth")
    protected BigInteger applQuDepth;
    @XmlAttribute(name = "ApplQuResolution")
    protected BigInteger applQuResolution;

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
     * Gets the value of the inc property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the inc property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInc().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MDIncGrpBlockT }
     * 
     * 
     */
    public List<MDIncGrpBlockT> getInc() {
        if (inc == null) {
            inc = new ArrayList<MDIncGrpBlockT>();
        }
        return this.inc;
    }

    /**
     * Gets the value of the rtg property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the rtg property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRtg().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RoutingGrpBlockT }
     * 
     * 
     */
    public List<RoutingGrpBlockT> getRtg() {
        if (rtg == null) {
            rtg = new ArrayList<RoutingGrpBlockT>();
        }
        return this.rtg;
    }

    /**
     * Gets the value of the mdBkTyp property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMDBkTyp() {
        return mdBkTyp;
    }

    /**
     * Sets the value of the mdBkTyp property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMDBkTyp(BigInteger value) {
        this.mdBkTyp = value;
    }

    /**
     * Gets the value of the mdFeedTyp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMDFeedTyp() {
        return mdFeedTyp;
    }

    /**
     * Sets the value of the mdFeedTyp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMDFeedTyp(String value) {
        this.mdFeedTyp = value;
    }

    /**
     * Gets the value of the trdDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTrdDt() {
        return trdDt;
    }

    /**
     * Sets the value of the trdDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTrdDt(XMLGregorianCalendar value) {
        this.trdDt = value;
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

    /**
     * Gets the value of the applQuDepth property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getApplQuDepth() {
        return applQuDepth;
    }

    /**
     * Sets the value of the applQuDepth property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setApplQuDepth(BigInteger value) {
        this.applQuDepth = value;
    }

    /**
     * Gets the value of the applQuResolution property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getApplQuResolution() {
        return applQuResolution;
    }

    /**
     * Sets the value of the applQuResolution property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setApplQuResolution(BigInteger value) {
        this.applQuResolution = value;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof MarketDataIncrementalRefreshMessageT)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        if (!super.equals(thisLocator, thatLocator, object, strategy)) {
            return false;
        }
        final MarketDataIncrementalRefreshMessageT that = ((MarketDataIncrementalRefreshMessageT) object);
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
            List<MDIncGrpBlockT> lhsInc;
            lhsInc = (((this.inc!= null)&&(!this.inc.isEmpty()))?this.getInc():null);
            List<MDIncGrpBlockT> rhsInc;
            rhsInc = (((that.inc!= null)&&(!that.inc.isEmpty()))?that.getInc():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "inc", lhsInc), LocatorUtils.property(thatLocator, "inc", rhsInc), lhsInc, rhsInc)) {
                return false;
            }
        }
        {
            List<RoutingGrpBlockT> lhsRtg;
            lhsRtg = (((this.rtg!= null)&&(!this.rtg.isEmpty()))?this.getRtg():null);
            List<RoutingGrpBlockT> rhsRtg;
            rhsRtg = (((that.rtg!= null)&&(!that.rtg.isEmpty()))?that.getRtg():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "rtg", lhsRtg), LocatorUtils.property(thatLocator, "rtg", rhsRtg), lhsRtg, rhsRtg)) {
                return false;
            }
        }
        {
            BigInteger lhsMDBkTyp;
            lhsMDBkTyp = this.getMDBkTyp();
            BigInteger rhsMDBkTyp;
            rhsMDBkTyp = that.getMDBkTyp();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "mdBkTyp", lhsMDBkTyp), LocatorUtils.property(thatLocator, "mdBkTyp", rhsMDBkTyp), lhsMDBkTyp, rhsMDBkTyp)) {
                return false;
            }
        }
        {
            String lhsMDFeedTyp;
            lhsMDFeedTyp = this.getMDFeedTyp();
            String rhsMDFeedTyp;
            rhsMDFeedTyp = that.getMDFeedTyp();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "mdFeedTyp", lhsMDFeedTyp), LocatorUtils.property(thatLocator, "mdFeedTyp", rhsMDFeedTyp), lhsMDFeedTyp, rhsMDFeedTyp)) {
                return false;
            }
        }
        {
            XMLGregorianCalendar lhsTrdDt;
            lhsTrdDt = this.getTrdDt();
            XMLGregorianCalendar rhsTrdDt;
            rhsTrdDt = that.getTrdDt();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "trdDt", lhsTrdDt), LocatorUtils.property(thatLocator, "trdDt", rhsTrdDt), lhsTrdDt, rhsTrdDt)) {
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
        {
            BigInteger lhsApplQuDepth;
            lhsApplQuDepth = this.getApplQuDepth();
            BigInteger rhsApplQuDepth;
            rhsApplQuDepth = that.getApplQuDepth();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "applQuDepth", lhsApplQuDepth), LocatorUtils.property(thatLocator, "applQuDepth", rhsApplQuDepth), lhsApplQuDepth, rhsApplQuDepth)) {
                return false;
            }
        }
        {
            BigInteger lhsApplQuResolution;
            lhsApplQuResolution = this.getApplQuResolution();
            BigInteger rhsApplQuResolution;
            rhsApplQuResolution = that.getApplQuResolution();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "applQuResolution", lhsApplQuResolution), LocatorUtils.property(thatLocator, "applQuResolution", rhsApplQuResolution), lhsApplQuResolution, rhsApplQuResolution)) {
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
            List<MDIncGrpBlockT> theInc;
            theInc = (((this.inc!= null)&&(!this.inc.isEmpty()))?this.getInc():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "inc", theInc), currentHashCode, theInc);
        }
        {
            List<RoutingGrpBlockT> theRtg;
            theRtg = (((this.rtg!= null)&&(!this.rtg.isEmpty()))?this.getRtg():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "rtg", theRtg), currentHashCode, theRtg);
        }
        {
            BigInteger theMDBkTyp;
            theMDBkTyp = this.getMDBkTyp();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "mdBkTyp", theMDBkTyp), currentHashCode, theMDBkTyp);
        }
        {
            String theMDFeedTyp;
            theMDFeedTyp = this.getMDFeedTyp();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "mdFeedTyp", theMDFeedTyp), currentHashCode, theMDFeedTyp);
        }
        {
            XMLGregorianCalendar theTrdDt;
            theTrdDt = this.getTrdDt();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "trdDt", theTrdDt), currentHashCode, theTrdDt);
        }
        {
            String theReqID;
            theReqID = this.getReqID();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "reqID", theReqID), currentHashCode, theReqID);
        }
        {
            BigInteger theApplQuDepth;
            theApplQuDepth = this.getApplQuDepth();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "applQuDepth", theApplQuDepth), currentHashCode, theApplQuDepth);
        }
        {
            BigInteger theApplQuResolution;
            theApplQuResolution = this.getApplQuResolution();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "applQuResolution", theApplQuResolution), currentHashCode, theApplQuResolution);
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
            List<MDIncGrpBlockT> theInc;
            theInc = (((this.inc!= null)&&(!this.inc.isEmpty()))?this.getInc():null);
            strategy.appendField(locator, this, "inc", buffer, theInc);
        }
        {
            List<RoutingGrpBlockT> theRtg;
            theRtg = (((this.rtg!= null)&&(!this.rtg.isEmpty()))?this.getRtg():null);
            strategy.appendField(locator, this, "rtg", buffer, theRtg);
        }
        {
            BigInteger theMDBkTyp;
            theMDBkTyp = this.getMDBkTyp();
            strategy.appendField(locator, this, "mdBkTyp", buffer, theMDBkTyp);
        }
        {
            String theMDFeedTyp;
            theMDFeedTyp = this.getMDFeedTyp();
            strategy.appendField(locator, this, "mdFeedTyp", buffer, theMDFeedTyp);
        }
        {
            XMLGregorianCalendar theTrdDt;
            theTrdDt = this.getTrdDt();
            strategy.appendField(locator, this, "trdDt", buffer, theTrdDt);
        }
        {
            String theReqID;
            theReqID = this.getReqID();
            strategy.appendField(locator, this, "reqID", buffer, theReqID);
        }
        {
            BigInteger theApplQuDepth;
            theApplQuDepth = this.getApplQuDepth();
            strategy.appendField(locator, this, "applQuDepth", buffer, theApplQuDepth);
        }
        {
            BigInteger theApplQuResolution;
            theApplQuResolution = this.getApplQuResolution();
            strategy.appendField(locator, this, "applQuResolution", buffer, theApplQuResolution);
        }
        return buffer;
    }

}
