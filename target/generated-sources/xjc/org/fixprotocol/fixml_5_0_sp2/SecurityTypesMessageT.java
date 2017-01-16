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
 * SecurityTypes can be found in Volume 3 of the
 * 						specification
 * 
 * <p>Java class for SecurityTypes_message_t complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SecurityTypes_message_t"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.fixprotocol.org/FIXML-5-0-SP2}Abstract_message_t"&gt;
 *       &lt;sequence&gt;
 *         &lt;group ref="{http://www.fixprotocol.org/FIXML-5-0-SP2}SecurityTypesElements"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attGroup ref="{http://www.fixprotocol.org/FIXML-5-0-SP2}SecurityTypesAttributes"/&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SecurityTypes_message_t", propOrder = {
    "applSeqCtrl",
    "secT"
})
public class SecurityTypesMessageT
    extends AbstractMessageT
    implements Equals, HashCode, ToString
{

    @XmlElement(name = "ApplSeqCtrl")
    protected ApplicationSequenceControlBlockT applSeqCtrl;
    @XmlElement(name = "SecT")
    protected List<SecTypesGrpBlockT> secT;
    @XmlAttribute(name = "ReqID", required = true)
    protected String reqID;
    @XmlAttribute(name = "RspID", required = true)
    protected String rspID;
    @XmlAttribute(name = "RspTyp", required = true)
    protected BigInteger rspTyp;
    @XmlAttribute(name = "TotNoSecTyps")
    protected BigInteger totNoSecTyps;
    @XmlAttribute(name = "LastFragment")
    protected LastFragmentEnumT lastFragment;
    @XmlAttribute(name = "Txt")
    protected String txt;
    @XmlAttribute(name = "EncTxtLen")
    protected BigInteger encTxtLen;
    @XmlAttribute(name = "EncTxt")
    protected String encTxt;
    @XmlAttribute(name = "MktID")
    protected String mktID;
    @XmlAttribute(name = "MktSegID")
    protected String mktSegID;
    @XmlAttribute(name = "SesID")
    protected String sesID;
    @XmlAttribute(name = "SesSub")
    protected String sesSub;
    @XmlAttribute(name = "SubReqTyp")
    protected String subReqTyp;

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
     * Gets the value of the secT property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the secT property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSecT().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SecTypesGrpBlockT }
     * 
     * 
     */
    public List<SecTypesGrpBlockT> getSecT() {
        if (secT == null) {
            secT = new ArrayList<SecTypesGrpBlockT>();
        }
        return this.secT;
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
     * Gets the value of the rspID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRspID() {
        return rspID;
    }

    /**
     * Sets the value of the rspID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRspID(String value) {
        this.rspID = value;
    }

    /**
     * Gets the value of the rspTyp property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getRspTyp() {
        return rspTyp;
    }

    /**
     * Sets the value of the rspTyp property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setRspTyp(BigInteger value) {
        this.rspTyp = value;
    }

    /**
     * Gets the value of the totNoSecTyps property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTotNoSecTyps() {
        return totNoSecTyps;
    }

    /**
     * Sets the value of the totNoSecTyps property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTotNoSecTyps(BigInteger value) {
        this.totNoSecTyps = value;
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

    /**
     * Gets the value of the encTxtLen property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getEncTxtLen() {
        return encTxtLen;
    }

    /**
     * Sets the value of the encTxtLen property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setEncTxtLen(BigInteger value) {
        this.encTxtLen = value;
    }

    /**
     * Gets the value of the encTxt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEncTxt() {
        return encTxt;
    }

    /**
     * Sets the value of the encTxt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEncTxt(String value) {
        this.encTxt = value;
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

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof SecurityTypesMessageT)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        if (!super.equals(thisLocator, thatLocator, object, strategy)) {
            return false;
        }
        final SecurityTypesMessageT that = ((SecurityTypesMessageT) object);
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
            List<SecTypesGrpBlockT> lhsSecT;
            lhsSecT = (((this.secT!= null)&&(!this.secT.isEmpty()))?this.getSecT():null);
            List<SecTypesGrpBlockT> rhsSecT;
            rhsSecT = (((that.secT!= null)&&(!that.secT.isEmpty()))?that.getSecT():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "secT", lhsSecT), LocatorUtils.property(thatLocator, "secT", rhsSecT), lhsSecT, rhsSecT)) {
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
            String lhsRspID;
            lhsRspID = this.getRspID();
            String rhsRspID;
            rhsRspID = that.getRspID();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "rspID", lhsRspID), LocatorUtils.property(thatLocator, "rspID", rhsRspID), lhsRspID, rhsRspID)) {
                return false;
            }
        }
        {
            BigInteger lhsRspTyp;
            lhsRspTyp = this.getRspTyp();
            BigInteger rhsRspTyp;
            rhsRspTyp = that.getRspTyp();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "rspTyp", lhsRspTyp), LocatorUtils.property(thatLocator, "rspTyp", rhsRspTyp), lhsRspTyp, rhsRspTyp)) {
                return false;
            }
        }
        {
            BigInteger lhsTotNoSecTyps;
            lhsTotNoSecTyps = this.getTotNoSecTyps();
            BigInteger rhsTotNoSecTyps;
            rhsTotNoSecTyps = that.getTotNoSecTyps();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "totNoSecTyps", lhsTotNoSecTyps), LocatorUtils.property(thatLocator, "totNoSecTyps", rhsTotNoSecTyps), lhsTotNoSecTyps, rhsTotNoSecTyps)) {
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
        {
            String lhsTxt;
            lhsTxt = this.getTxt();
            String rhsTxt;
            rhsTxt = that.getTxt();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "txt", lhsTxt), LocatorUtils.property(thatLocator, "txt", rhsTxt), lhsTxt, rhsTxt)) {
                return false;
            }
        }
        {
            BigInteger lhsEncTxtLen;
            lhsEncTxtLen = this.getEncTxtLen();
            BigInteger rhsEncTxtLen;
            rhsEncTxtLen = that.getEncTxtLen();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "encTxtLen", lhsEncTxtLen), LocatorUtils.property(thatLocator, "encTxtLen", rhsEncTxtLen), lhsEncTxtLen, rhsEncTxtLen)) {
                return false;
            }
        }
        {
            String lhsEncTxt;
            lhsEncTxt = this.getEncTxt();
            String rhsEncTxt;
            rhsEncTxt = that.getEncTxt();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "encTxt", lhsEncTxt), LocatorUtils.property(thatLocator, "encTxt", rhsEncTxt), lhsEncTxt, rhsEncTxt)) {
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
        {
            String lhsSubReqTyp;
            lhsSubReqTyp = this.getSubReqTyp();
            String rhsSubReqTyp;
            rhsSubReqTyp = that.getSubReqTyp();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "subReqTyp", lhsSubReqTyp), LocatorUtils.property(thatLocator, "subReqTyp", rhsSubReqTyp), lhsSubReqTyp, rhsSubReqTyp)) {
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
            List<SecTypesGrpBlockT> theSecT;
            theSecT = (((this.secT!= null)&&(!this.secT.isEmpty()))?this.getSecT():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "secT", theSecT), currentHashCode, theSecT);
        }
        {
            String theReqID;
            theReqID = this.getReqID();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "reqID", theReqID), currentHashCode, theReqID);
        }
        {
            String theRspID;
            theRspID = this.getRspID();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "rspID", theRspID), currentHashCode, theRspID);
        }
        {
            BigInteger theRspTyp;
            theRspTyp = this.getRspTyp();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "rspTyp", theRspTyp), currentHashCode, theRspTyp);
        }
        {
            BigInteger theTotNoSecTyps;
            theTotNoSecTyps = this.getTotNoSecTyps();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "totNoSecTyps", theTotNoSecTyps), currentHashCode, theTotNoSecTyps);
        }
        {
            LastFragmentEnumT theLastFragment;
            theLastFragment = this.getLastFragment();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "lastFragment", theLastFragment), currentHashCode, theLastFragment);
        }
        {
            String theTxt;
            theTxt = this.getTxt();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "txt", theTxt), currentHashCode, theTxt);
        }
        {
            BigInteger theEncTxtLen;
            theEncTxtLen = this.getEncTxtLen();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "encTxtLen", theEncTxtLen), currentHashCode, theEncTxtLen);
        }
        {
            String theEncTxt;
            theEncTxt = this.getEncTxt();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "encTxt", theEncTxt), currentHashCode, theEncTxt);
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
        {
            String theSubReqTyp;
            theSubReqTyp = this.getSubReqTyp();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "subReqTyp", theSubReqTyp), currentHashCode, theSubReqTyp);
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
            List<SecTypesGrpBlockT> theSecT;
            theSecT = (((this.secT!= null)&&(!this.secT.isEmpty()))?this.getSecT():null);
            strategy.appendField(locator, this, "secT", buffer, theSecT);
        }
        {
            String theReqID;
            theReqID = this.getReqID();
            strategy.appendField(locator, this, "reqID", buffer, theReqID);
        }
        {
            String theRspID;
            theRspID = this.getRspID();
            strategy.appendField(locator, this, "rspID", buffer, theRspID);
        }
        {
            BigInteger theRspTyp;
            theRspTyp = this.getRspTyp();
            strategy.appendField(locator, this, "rspTyp", buffer, theRspTyp);
        }
        {
            BigInteger theTotNoSecTyps;
            theTotNoSecTyps = this.getTotNoSecTyps();
            strategy.appendField(locator, this, "totNoSecTyps", buffer, theTotNoSecTyps);
        }
        {
            LastFragmentEnumT theLastFragment;
            theLastFragment = this.getLastFragment();
            strategy.appendField(locator, this, "lastFragment", buffer, theLastFragment);
        }
        {
            String theTxt;
            theTxt = this.getTxt();
            strategy.appendField(locator, this, "txt", buffer, theTxt);
        }
        {
            BigInteger theEncTxtLen;
            theEncTxtLen = this.getEncTxtLen();
            strategy.appendField(locator, this, "encTxtLen", buffer, theEncTxtLen);
        }
        {
            String theEncTxt;
            theEncTxt = this.getEncTxt();
            strategy.appendField(locator, this, "encTxt", buffer, theEncTxt);
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
        {
            String theSubReqTyp;
            theSubReqTyp = this.getSubReqTyp();
            strategy.appendField(locator, this, "subReqTyp", buffer, theSubReqTyp);
        }
        return buffer;
    }

}
