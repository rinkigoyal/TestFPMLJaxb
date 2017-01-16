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
 * SecurityDefinitionUpdateReport can be found in Volume 3 of the
 * 						specification
 * 
 * <p>Java class for SecurityDefinitionUpdateReport_message_t complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SecurityDefinitionUpdateReport_message_t"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.fixprotocol.org/FIXML-5-0-SP2}Abstract_message_t"&gt;
 *       &lt;sequence&gt;
 *         &lt;group ref="{http://www.fixprotocol.org/FIXML-5-0-SP2}SecurityDefinitionUpdateReportElements"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attGroup ref="{http://www.fixprotocol.org/FIXML-5-0-SP2}SecurityDefinitionUpdateReportAttributes"/&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SecurityDefinitionUpdateReport_message_t", propOrder = {
    "applSeqCtrl",
    "instrmt",
    "instrmtExt",
    "undly",
    "stip",
    "leg",
    "sprdBnchmkCurve",
    "yield",
    "mktSegGrp"
})
public class SecurityDefinitionUpdateReportMessageT
    extends AbstractMessageT
    implements Equals, HashCode, ToString
{

    @XmlElement(name = "ApplSeqCtrl")
    protected ApplicationSequenceControlBlockT applSeqCtrl;
    @XmlElement(name = "Instrmt")
    protected InstrumentBlockT instrmt;
    @XmlElement(name = "InstrmtExt")
    protected InstrumentExtensionBlockT instrmtExt;
    @XmlElement(name = "Undly")
    protected List<UndInstrmtGrpBlockT> undly;
    @XmlElement(name = "Stip")
    protected List<StipulationsBlockT> stip;
    @XmlElement(name = "Leg")
    protected List<InstrmtLegGrpBlockT> leg;
    @XmlElement(name = "SprdBnchmkCurve")
    protected SpreadOrBenchmarkCurveDataBlockT sprdBnchmkCurve;
    @XmlElement(name = "Yield")
    protected YieldDataBlockT yield;
    @XmlElement(name = "MktSegGrp")
    protected List<MarketSegmentGrpBlockT> mktSegGrp;
    @XmlAttribute(name = "RptID")
    protected BigInteger rptID;
    @XmlAttribute(name = "ReqID")
    protected String reqID;
    @XmlAttribute(name = "RspID")
    protected String rspID;
    @XmlAttribute(name = "RspTyp")
    protected BigInteger rspTyp;
    @XmlAttribute(name = "BizDt")
    protected XMLGregorianCalendar bizDt;
    @XmlAttribute(name = "UpdActn")
    protected SecurityUpdateActionEnumT updActn;
    @XmlAttribute(name = "CorpActn")
    protected String corpActn;
    @XmlAttribute(name = "Ccy")
    protected String ccy;
    @XmlAttribute(name = "Txt")
    protected String txt;
    @XmlAttribute(name = "EncTxtLen")
    protected BigInteger encTxtLen;
    @XmlAttribute(name = "EncTxt")
    protected String encTxt;
    @XmlAttribute(name = "TxnTm")
    protected XMLGregorianCalendar txnTm;

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
     * Gets the value of the stip property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the stip property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStip().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link StipulationsBlockT }
     * 
     * 
     */
    public List<StipulationsBlockT> getStip() {
        if (stip == null) {
            stip = new ArrayList<StipulationsBlockT>();
        }
        return this.stip;
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
     * Gets the value of the sprdBnchmkCurve property.
     * 
     * @return
     *     possible object is
     *     {@link SpreadOrBenchmarkCurveDataBlockT }
     *     
     */
    public SpreadOrBenchmarkCurveDataBlockT getSprdBnchmkCurve() {
        return sprdBnchmkCurve;
    }

    /**
     * Sets the value of the sprdBnchmkCurve property.
     * 
     * @param value
     *     allowed object is
     *     {@link SpreadOrBenchmarkCurveDataBlockT }
     *     
     */
    public void setSprdBnchmkCurve(SpreadOrBenchmarkCurveDataBlockT value) {
        this.sprdBnchmkCurve = value;
    }

    /**
     * Gets the value of the yield property.
     * 
     * @return
     *     possible object is
     *     {@link YieldDataBlockT }
     *     
     */
    public YieldDataBlockT getYield() {
        return yield;
    }

    /**
     * Sets the value of the yield property.
     * 
     * @param value
     *     allowed object is
     *     {@link YieldDataBlockT }
     *     
     */
    public void setYield(YieldDataBlockT value) {
        this.yield = value;
    }

    /**
     * Gets the value of the mktSegGrp property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the mktSegGrp property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMktSegGrp().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MarketSegmentGrpBlockT }
     * 
     * 
     */
    public List<MarketSegmentGrpBlockT> getMktSegGrp() {
        if (mktSegGrp == null) {
            mktSegGrp = new ArrayList<MarketSegmentGrpBlockT>();
        }
        return this.mktSegGrp;
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
     * Gets the value of the updActn property.
     * 
     * @return
     *     possible object is
     *     {@link SecurityUpdateActionEnumT }
     *     
     */
    public SecurityUpdateActionEnumT getUpdActn() {
        return updActn;
    }

    /**
     * Sets the value of the updActn property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecurityUpdateActionEnumT }
     *     
     */
    public void setUpdActn(SecurityUpdateActionEnumT value) {
        this.updActn = value;
    }

    /**
     * Gets the value of the corpActn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCorpActn() {
        return corpActn;
    }

    /**
     * Sets the value of the corpActn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCorpActn(String value) {
        this.corpActn = value;
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

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof SecurityDefinitionUpdateReportMessageT)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        if (!super.equals(thisLocator, thatLocator, object, strategy)) {
            return false;
        }
        final SecurityDefinitionUpdateReportMessageT that = ((SecurityDefinitionUpdateReportMessageT) object);
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
            List<StipulationsBlockT> lhsStip;
            lhsStip = (((this.stip!= null)&&(!this.stip.isEmpty()))?this.getStip():null);
            List<StipulationsBlockT> rhsStip;
            rhsStip = (((that.stip!= null)&&(!that.stip.isEmpty()))?that.getStip():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "stip", lhsStip), LocatorUtils.property(thatLocator, "stip", rhsStip), lhsStip, rhsStip)) {
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
            SpreadOrBenchmarkCurveDataBlockT lhsSprdBnchmkCurve;
            lhsSprdBnchmkCurve = this.getSprdBnchmkCurve();
            SpreadOrBenchmarkCurveDataBlockT rhsSprdBnchmkCurve;
            rhsSprdBnchmkCurve = that.getSprdBnchmkCurve();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "sprdBnchmkCurve", lhsSprdBnchmkCurve), LocatorUtils.property(thatLocator, "sprdBnchmkCurve", rhsSprdBnchmkCurve), lhsSprdBnchmkCurve, rhsSprdBnchmkCurve)) {
                return false;
            }
        }
        {
            YieldDataBlockT lhsYield;
            lhsYield = this.getYield();
            YieldDataBlockT rhsYield;
            rhsYield = that.getYield();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "yield", lhsYield), LocatorUtils.property(thatLocator, "yield", rhsYield), lhsYield, rhsYield)) {
                return false;
            }
        }
        {
            List<MarketSegmentGrpBlockT> lhsMktSegGrp;
            lhsMktSegGrp = (((this.mktSegGrp!= null)&&(!this.mktSegGrp.isEmpty()))?this.getMktSegGrp():null);
            List<MarketSegmentGrpBlockT> rhsMktSegGrp;
            rhsMktSegGrp = (((that.mktSegGrp!= null)&&(!that.mktSegGrp.isEmpty()))?that.getMktSegGrp():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "mktSegGrp", lhsMktSegGrp), LocatorUtils.property(thatLocator, "mktSegGrp", rhsMktSegGrp), lhsMktSegGrp, rhsMktSegGrp)) {
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
            XMLGregorianCalendar lhsBizDt;
            lhsBizDt = this.getBizDt();
            XMLGregorianCalendar rhsBizDt;
            rhsBizDt = that.getBizDt();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "bizDt", lhsBizDt), LocatorUtils.property(thatLocator, "bizDt", rhsBizDt), lhsBizDt, rhsBizDt)) {
                return false;
            }
        }
        {
            SecurityUpdateActionEnumT lhsUpdActn;
            lhsUpdActn = this.getUpdActn();
            SecurityUpdateActionEnumT rhsUpdActn;
            rhsUpdActn = that.getUpdActn();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "updActn", lhsUpdActn), LocatorUtils.property(thatLocator, "updActn", rhsUpdActn), lhsUpdActn, rhsUpdActn)) {
                return false;
            }
        }
        {
            String lhsCorpActn;
            lhsCorpActn = this.getCorpActn();
            String rhsCorpActn;
            rhsCorpActn = that.getCorpActn();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "corpActn", lhsCorpActn), LocatorUtils.property(thatLocator, "corpActn", rhsCorpActn), lhsCorpActn, rhsCorpActn)) {
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
            XMLGregorianCalendar lhsTxnTm;
            lhsTxnTm = this.getTxnTm();
            XMLGregorianCalendar rhsTxnTm;
            rhsTxnTm = that.getTxnTm();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "txnTm", lhsTxnTm), LocatorUtils.property(thatLocator, "txnTm", rhsTxnTm), lhsTxnTm, rhsTxnTm)) {
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
            List<StipulationsBlockT> theStip;
            theStip = (((this.stip!= null)&&(!this.stip.isEmpty()))?this.getStip():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "stip", theStip), currentHashCode, theStip);
        }
        {
            List<InstrmtLegGrpBlockT> theLeg;
            theLeg = (((this.leg!= null)&&(!this.leg.isEmpty()))?this.getLeg():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "leg", theLeg), currentHashCode, theLeg);
        }
        {
            SpreadOrBenchmarkCurveDataBlockT theSprdBnchmkCurve;
            theSprdBnchmkCurve = this.getSprdBnchmkCurve();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "sprdBnchmkCurve", theSprdBnchmkCurve), currentHashCode, theSprdBnchmkCurve);
        }
        {
            YieldDataBlockT theYield;
            theYield = this.getYield();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "yield", theYield), currentHashCode, theYield);
        }
        {
            List<MarketSegmentGrpBlockT> theMktSegGrp;
            theMktSegGrp = (((this.mktSegGrp!= null)&&(!this.mktSegGrp.isEmpty()))?this.getMktSegGrp():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "mktSegGrp", theMktSegGrp), currentHashCode, theMktSegGrp);
        }
        {
            BigInteger theRptID;
            theRptID = this.getRptID();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "rptID", theRptID), currentHashCode, theRptID);
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
            XMLGregorianCalendar theBizDt;
            theBizDt = this.getBizDt();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "bizDt", theBizDt), currentHashCode, theBizDt);
        }
        {
            SecurityUpdateActionEnumT theUpdActn;
            theUpdActn = this.getUpdActn();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "updActn", theUpdActn), currentHashCode, theUpdActn);
        }
        {
            String theCorpActn;
            theCorpActn = this.getCorpActn();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "corpActn", theCorpActn), currentHashCode, theCorpActn);
        }
        {
            String theCcy;
            theCcy = this.getCcy();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "ccy", theCcy), currentHashCode, theCcy);
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
            XMLGregorianCalendar theTxnTm;
            theTxnTm = this.getTxnTm();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "txnTm", theTxnTm), currentHashCode, theTxnTm);
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
            List<StipulationsBlockT> theStip;
            theStip = (((this.stip!= null)&&(!this.stip.isEmpty()))?this.getStip():null);
            strategy.appendField(locator, this, "stip", buffer, theStip);
        }
        {
            List<InstrmtLegGrpBlockT> theLeg;
            theLeg = (((this.leg!= null)&&(!this.leg.isEmpty()))?this.getLeg():null);
            strategy.appendField(locator, this, "leg", buffer, theLeg);
        }
        {
            SpreadOrBenchmarkCurveDataBlockT theSprdBnchmkCurve;
            theSprdBnchmkCurve = this.getSprdBnchmkCurve();
            strategy.appendField(locator, this, "sprdBnchmkCurve", buffer, theSprdBnchmkCurve);
        }
        {
            YieldDataBlockT theYield;
            theYield = this.getYield();
            strategy.appendField(locator, this, "yield", buffer, theYield);
        }
        {
            List<MarketSegmentGrpBlockT> theMktSegGrp;
            theMktSegGrp = (((this.mktSegGrp!= null)&&(!this.mktSegGrp.isEmpty()))?this.getMktSegGrp():null);
            strategy.appendField(locator, this, "mktSegGrp", buffer, theMktSegGrp);
        }
        {
            BigInteger theRptID;
            theRptID = this.getRptID();
            strategy.appendField(locator, this, "rptID", buffer, theRptID);
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
            XMLGregorianCalendar theBizDt;
            theBizDt = this.getBizDt();
            strategy.appendField(locator, this, "bizDt", buffer, theBizDt);
        }
        {
            SecurityUpdateActionEnumT theUpdActn;
            theUpdActn = this.getUpdActn();
            strategy.appendField(locator, this, "updActn", buffer, theUpdActn);
        }
        {
            String theCorpActn;
            theCorpActn = this.getCorpActn();
            strategy.appendField(locator, this, "corpActn", buffer, theCorpActn);
        }
        {
            String theCcy;
            theCcy = this.getCcy();
            strategy.appendField(locator, this, "ccy", buffer, theCcy);
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
            XMLGregorianCalendar theTxnTm;
            theTxnTm = this.getTxnTm();
            strategy.appendField(locator, this, "txnTm", buffer, theTxnTm);
        }
        return buffer;
    }

}
