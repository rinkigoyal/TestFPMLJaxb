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
 * SecurityList can be found in Volume 3 of the
 * 						specification
 * 
 * <p>Java class for SecurityList_message_t complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SecurityList_message_t"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.fixprotocol.org/FIXML-5-0-SP2}Abstract_message_t"&gt;
 *       &lt;sequence&gt;
 *         &lt;group ref="{http://www.fixprotocol.org/FIXML-5-0-SP2}SecurityListElements"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attGroup ref="{http://www.fixprotocol.org/FIXML-5-0-SP2}SecurityListAttributes"/&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SecurityList_message_t", propOrder = {
    "applSeqCtrl",
    "secL"
})
public class SecurityListMessageT
    extends AbstractMessageT
    implements Equals, HashCode, ToString
{

    @XmlElement(name = "ApplSeqCtrl")
    protected ApplicationSequenceControlBlockT applSeqCtrl;
    @XmlElement(name = "SecL")
    protected List<SecListGrpBlockT> secL;
    @XmlAttribute(name = "RptID")
    protected BigInteger rptID;
    @XmlAttribute(name = "BizDt")
    protected XMLGregorianCalendar bizDt;
    @XmlAttribute(name = "ListID")
    protected String listID;
    @XmlAttribute(name = "ListRefID")
    protected String listRefID;
    @XmlAttribute(name = "ListDesc")
    protected String listDesc;
    @XmlAttribute(name = "ListTyp")
    protected String listTyp;
    @XmlAttribute(name = "LstTypSrc")
    protected String lstTypSrc;
    @XmlAttribute(name = "ReqID")
    protected String reqID;
    @XmlAttribute(name = "RspID")
    protected String rspID;
    @XmlAttribute(name = "ReqRslt")
    protected BigInteger reqRslt;
    @XmlAttribute(name = "TxnTm")
    protected XMLGregorianCalendar txnTm;
    @XmlAttribute(name = "TotNoReltdSym")
    protected BigInteger totNoReltdSym;
    @XmlAttribute(name = "MktID")
    protected String mktID;
    @XmlAttribute(name = "MktSegID")
    protected String mktSegID;
    @XmlAttribute(name = "LastFragment")
    protected LastFragmentEnumT lastFragment;

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
     * Gets the value of the secL property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the secL property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSecL().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SecListGrpBlockT }
     * 
     * 
     */
    public List<SecListGrpBlockT> getSecL() {
        if (secL == null) {
            secL = new ArrayList<SecListGrpBlockT>();
        }
        return this.secL;
    }

    /**
     * Gets the value of the rptID property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getRptID() {
        return rptID;
    }

    /**
     * Sets the value of the rptID property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setRptID(BigInteger value) {
        this.rptID = value;
    }

    /**
     * Gets the value of the bizDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getBizDt() {
        return bizDt;
    }

    /**
     * Sets the value of the bizDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setBizDt(XMLGregorianCalendar value) {
        this.bizDt = value;
    }

    /**
     * Gets the value of the listID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getListID() {
        return listID;
    }

    /**
     * Sets the value of the listID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setListID(String value) {
        this.listID = value;
    }

    /**
     * Gets the value of the listRefID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getListRefID() {
        return listRefID;
    }

    /**
     * Sets the value of the listRefID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setListRefID(String value) {
        this.listRefID = value;
    }

    /**
     * Gets the value of the listDesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getListDesc() {
        return listDesc;
    }

    /**
     * Sets the value of the listDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setListDesc(String value) {
        this.listDesc = value;
    }

    /**
     * Gets the value of the listTyp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getListTyp() {
        return listTyp;
    }

    /**
     * Sets the value of the listTyp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setListTyp(String value) {
        this.listTyp = value;
    }

    /**
     * Gets the value of the lstTypSrc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLstTypSrc() {
        return lstTypSrc;
    }

    /**
     * Sets the value of the lstTypSrc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLstTypSrc(String value) {
        this.lstTypSrc = value;
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
     * Gets the value of the reqRslt property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getReqRslt() {
        return reqRslt;
    }

    /**
     * Sets the value of the reqRslt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setReqRslt(BigInteger value) {
        this.reqRslt = value;
    }

    /**
     * Gets the value of the txnTm property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTxnTm() {
        return txnTm;
    }

    /**
     * Sets the value of the txnTm property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTxnTm(XMLGregorianCalendar value) {
        this.txnTm = value;
    }

    /**
     * Gets the value of the totNoReltdSym property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTotNoReltdSym() {
        return totNoReltdSym;
    }

    /**
     * Sets the value of the totNoReltdSym property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTotNoReltdSym(BigInteger value) {
        this.totNoReltdSym = value;
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
        if (!(object instanceof SecurityListMessageT)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        if (!super.equals(thisLocator, thatLocator, object, strategy)) {
            return false;
        }
        final SecurityListMessageT that = ((SecurityListMessageT) object);
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
            List<SecListGrpBlockT> lhsSecL;
            lhsSecL = (((this.secL!= null)&&(!this.secL.isEmpty()))?this.getSecL():null);
            List<SecListGrpBlockT> rhsSecL;
            rhsSecL = (((that.secL!= null)&&(!that.secL.isEmpty()))?that.getSecL():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "secL", lhsSecL), LocatorUtils.property(thatLocator, "secL", rhsSecL), lhsSecL, rhsSecL)) {
                return false;
            }
        }
        {
            BigInteger lhsRptID;
            lhsRptID = this.getRptID();
            BigInteger rhsRptID;
            rhsRptID = that.getRptID();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "rptID", lhsRptID), LocatorUtils.property(thatLocator, "rptID", rhsRptID), lhsRptID, rhsRptID)) {
                return false;
            }
        }
        {
            XMLGregorianCalendar lhsBizDt;
            lhsBizDt = this.getBizDt();
            XMLGregorianCalendar rhsBizDt;
            rhsBizDt = that.getBizDt();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "bizDt", lhsBizDt), LocatorUtils.property(thatLocator, "bizDt", rhsBizDt), lhsBizDt, rhsBizDt)) {
                return false;
            }
        }
        {
            String lhsListID;
            lhsListID = this.getListID();
            String rhsListID;
            rhsListID = that.getListID();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "listID", lhsListID), LocatorUtils.property(thatLocator, "listID", rhsListID), lhsListID, rhsListID)) {
                return false;
            }
        }
        {
            String lhsListRefID;
            lhsListRefID = this.getListRefID();
            String rhsListRefID;
            rhsListRefID = that.getListRefID();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "listRefID", lhsListRefID), LocatorUtils.property(thatLocator, "listRefID", rhsListRefID), lhsListRefID, rhsListRefID)) {
                return false;
            }
        }
        {
            String lhsListDesc;
            lhsListDesc = this.getListDesc();
            String rhsListDesc;
            rhsListDesc = that.getListDesc();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "listDesc", lhsListDesc), LocatorUtils.property(thatLocator, "listDesc", rhsListDesc), lhsListDesc, rhsListDesc)) {
                return false;
            }
        }
        {
            String lhsListTyp;
            lhsListTyp = this.getListTyp();
            String rhsListTyp;
            rhsListTyp = that.getListTyp();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "listTyp", lhsListTyp), LocatorUtils.property(thatLocator, "listTyp", rhsListTyp), lhsListTyp, rhsListTyp)) {
                return false;
            }
        }
        {
            String lhsLstTypSrc;
            lhsLstTypSrc = this.getLstTypSrc();
            String rhsLstTypSrc;
            rhsLstTypSrc = that.getLstTypSrc();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "lstTypSrc", lhsLstTypSrc), LocatorUtils.property(thatLocator, "lstTypSrc", rhsLstTypSrc), lhsLstTypSrc, rhsLstTypSrc)) {
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
            BigInteger lhsReqRslt;
            lhsReqRslt = this.getReqRslt();
            BigInteger rhsReqRslt;
            rhsReqRslt = that.getReqRslt();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "reqRslt", lhsReqRslt), LocatorUtils.property(thatLocator, "reqRslt", rhsReqRslt), lhsReqRslt, rhsReqRslt)) {
                return false;
            }
        }
        {
            XMLGregorianCalendar lhsTxnTm;
            lhsTxnTm = this.getTxnTm();
            XMLGregorianCalendar rhsTxnTm;
            rhsTxnTm = that.getTxnTm();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "txnTm", lhsTxnTm), LocatorUtils.property(thatLocator, "txnTm", rhsTxnTm), lhsTxnTm, rhsTxnTm)) {
                return false;
            }
        }
        {
            BigInteger lhsTotNoReltdSym;
            lhsTotNoReltdSym = this.getTotNoReltdSym();
            BigInteger rhsTotNoReltdSym;
            rhsTotNoReltdSym = that.getTotNoReltdSym();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "totNoReltdSym", lhsTotNoReltdSym), LocatorUtils.property(thatLocator, "totNoReltdSym", rhsTotNoReltdSym), lhsTotNoReltdSym, rhsTotNoReltdSym)) {
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
        int currentHashCode = super.hashCode(locator, strategy);
        {
            ApplicationSequenceControlBlockT theApplSeqCtrl;
            theApplSeqCtrl = this.getApplSeqCtrl();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "applSeqCtrl", theApplSeqCtrl), currentHashCode, theApplSeqCtrl);
        }
        {
            List<SecListGrpBlockT> theSecL;
            theSecL = (((this.secL!= null)&&(!this.secL.isEmpty()))?this.getSecL():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "secL", theSecL), currentHashCode, theSecL);
        }
        {
            BigInteger theRptID;
            theRptID = this.getRptID();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "rptID", theRptID), currentHashCode, theRptID);
        }
        {
            XMLGregorianCalendar theBizDt;
            theBizDt = this.getBizDt();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "bizDt", theBizDt), currentHashCode, theBizDt);
        }
        {
            String theListID;
            theListID = this.getListID();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "listID", theListID), currentHashCode, theListID);
        }
        {
            String theListRefID;
            theListRefID = this.getListRefID();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "listRefID", theListRefID), currentHashCode, theListRefID);
        }
        {
            String theListDesc;
            theListDesc = this.getListDesc();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "listDesc", theListDesc), currentHashCode, theListDesc);
        }
        {
            String theListTyp;
            theListTyp = this.getListTyp();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "listTyp", theListTyp), currentHashCode, theListTyp);
        }
        {
            String theLstTypSrc;
            theLstTypSrc = this.getLstTypSrc();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "lstTypSrc", theLstTypSrc), currentHashCode, theLstTypSrc);
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
            BigInteger theReqRslt;
            theReqRslt = this.getReqRslt();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "reqRslt", theReqRslt), currentHashCode, theReqRslt);
        }
        {
            XMLGregorianCalendar theTxnTm;
            theTxnTm = this.getTxnTm();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "txnTm", theTxnTm), currentHashCode, theTxnTm);
        }
        {
            BigInteger theTotNoReltdSym;
            theTotNoReltdSym = this.getTotNoReltdSym();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "totNoReltdSym", theTotNoReltdSym), currentHashCode, theTotNoReltdSym);
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
        super.appendFields(locator, buffer, strategy);
        {
            ApplicationSequenceControlBlockT theApplSeqCtrl;
            theApplSeqCtrl = this.getApplSeqCtrl();
            strategy.appendField(locator, this, "applSeqCtrl", buffer, theApplSeqCtrl);
        }
        {
            List<SecListGrpBlockT> theSecL;
            theSecL = (((this.secL!= null)&&(!this.secL.isEmpty()))?this.getSecL():null);
            strategy.appendField(locator, this, "secL", buffer, theSecL);
        }
        {
            BigInteger theRptID;
            theRptID = this.getRptID();
            strategy.appendField(locator, this, "rptID", buffer, theRptID);
        }
        {
            XMLGregorianCalendar theBizDt;
            theBizDt = this.getBizDt();
            strategy.appendField(locator, this, "bizDt", buffer, theBizDt);
        }
        {
            String theListID;
            theListID = this.getListID();
            strategy.appendField(locator, this, "listID", buffer, theListID);
        }
        {
            String theListRefID;
            theListRefID = this.getListRefID();
            strategy.appendField(locator, this, "listRefID", buffer, theListRefID);
        }
        {
            String theListDesc;
            theListDesc = this.getListDesc();
            strategy.appendField(locator, this, "listDesc", buffer, theListDesc);
        }
        {
            String theListTyp;
            theListTyp = this.getListTyp();
            strategy.appendField(locator, this, "listTyp", buffer, theListTyp);
        }
        {
            String theLstTypSrc;
            theLstTypSrc = this.getLstTypSrc();
            strategy.appendField(locator, this, "lstTypSrc", buffer, theLstTypSrc);
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
            BigInteger theReqRslt;
            theReqRslt = this.getReqRslt();
            strategy.appendField(locator, this, "reqRslt", buffer, theReqRslt);
        }
        {
            XMLGregorianCalendar theTxnTm;
            theTxnTm = this.getTxnTm();
            strategy.appendField(locator, this, "txnTm", buffer, theTxnTm);
        }
        {
            BigInteger theTotNoReltdSym;
            theTotNoReltdSym = this.getTotNoReltdSym();
            strategy.appendField(locator, this, "totNoReltdSym", buffer, theTotNoReltdSym);
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
            LastFragmentEnumT theLastFragment;
            theLastFragment = this.getLastFragment();
            strategy.appendField(locator, this, "lastFragment", buffer, theLastFragment);
        }
        return buffer;
    }

}