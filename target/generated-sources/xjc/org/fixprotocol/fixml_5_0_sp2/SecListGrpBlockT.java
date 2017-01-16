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
 * <p>Java class for SecListGrp_Block_t complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SecListGrp_Block_t"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;group ref="{http://www.fixprotocol.org/FIXML-5-0-SP2}SecListGrpElements"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attGroup ref="{http://www.fixprotocol.org/FIXML-5-0-SP2}SecListGrpAttributes"/&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SecListGrp_Block_t", propOrder = {
    "instrmt",
    "instrmtExt",
    "finDetls",
    "secTrdgRules",
    "strkRules",
    "undly",
    "stip",
    "secL",
    "sprdBnchmkCurve",
    "yield"
})
public class SecListGrpBlockT
    implements Equals, HashCode, ToString
{

    @XmlElement(name = "Instrmt")
    protected InstrumentBlockT instrmt;
    @XmlElement(name = "InstrmtExt")
    protected InstrumentExtensionBlockT instrmtExt;
    @XmlElement(name = "FinDetls")
    protected FinancingDetailsBlockT finDetls;
    @XmlElement(name = "SecTrdgRules")
    protected SecurityTradingRulesBlockT secTrdgRules;
    @XmlElement(name = "StrkRules")
    protected List<StrikeRulesBlockT> strkRules;
    @XmlElement(name = "Undly")
    protected List<UndInstrmtGrpBlockT> undly;
    @XmlElement(name = "Stip")
    protected List<StipulationsBlockT> stip;
    @XmlElement(name = "SecL")
    protected List<InstrmtLegSecListGrpBlockT> secL;
    @XmlElement(name = "SprdBnchmkCurve")
    protected SpreadOrBenchmarkCurveDataBlockT sprdBnchmkCurve;
    @XmlElement(name = "Yield")
    protected YieldDataBlockT yield;
    @XmlAttribute(name = "Ccy")
    protected String ccy;
    @XmlAttribute(name = "TxnTm")
    protected XMLGregorianCalendar txnTm;
    @XmlAttribute(name = "Txt")
    protected String txt;
    @XmlAttribute(name = "EncTxtLen")
    protected BigInteger encTxtLen;
    @XmlAttribute(name = "EncTxt")
    protected String encTxt;

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
     * Gets the value of the finDetls property.
     * 
     * @return
     *     possible object is
     *     {@link FinancingDetailsBlockT }
     *     
     */
    public FinancingDetailsBlockT getFinDetls() {
        return finDetls;
    }

    /**
     * Sets the value of the finDetls property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancingDetailsBlockT }
     *     
     */
    public void setFinDetls(FinancingDetailsBlockT value) {
        this.finDetls = value;
    }

    /**
     * Gets the value of the secTrdgRules property.
     * 
     * @return
     *     possible object is
     *     {@link SecurityTradingRulesBlockT }
     *     
     */
    public SecurityTradingRulesBlockT getSecTrdgRules() {
        return secTrdgRules;
    }

    /**
     * Sets the value of the secTrdgRules property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecurityTradingRulesBlockT }
     *     
     */
    public void setSecTrdgRules(SecurityTradingRulesBlockT value) {
        this.secTrdgRules = value;
    }

    /**
     * Gets the value of the strkRules property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the strkRules property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStrkRules().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link StrikeRulesBlockT }
     * 
     * 
     */
    public List<StrikeRulesBlockT> getStrkRules() {
        if (strkRules == null) {
            strkRules = new ArrayList<StrikeRulesBlockT>();
        }
        return this.strkRules;
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
     * {@link InstrmtLegSecListGrpBlockT }
     * 
     * 
     */
    public List<InstrmtLegSecListGrpBlockT> getSecL() {
        if (secL == null) {
            secL = new ArrayList<InstrmtLegSecListGrpBlockT>();
        }
        return this.secL;
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

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof SecListGrpBlockT)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final SecListGrpBlockT that = ((SecListGrpBlockT) object);
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
            FinancingDetailsBlockT lhsFinDetls;
            lhsFinDetls = this.getFinDetls();
            FinancingDetailsBlockT rhsFinDetls;
            rhsFinDetls = that.getFinDetls();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "finDetls", lhsFinDetls), LocatorUtils.property(thatLocator, "finDetls", rhsFinDetls), lhsFinDetls, rhsFinDetls)) {
                return false;
            }
        }
        {
            SecurityTradingRulesBlockT lhsSecTrdgRules;
            lhsSecTrdgRules = this.getSecTrdgRules();
            SecurityTradingRulesBlockT rhsSecTrdgRules;
            rhsSecTrdgRules = that.getSecTrdgRules();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "secTrdgRules", lhsSecTrdgRules), LocatorUtils.property(thatLocator, "secTrdgRules", rhsSecTrdgRules), lhsSecTrdgRules, rhsSecTrdgRules)) {
                return false;
            }
        }
        {
            List<StrikeRulesBlockT> lhsStrkRules;
            lhsStrkRules = (((this.strkRules!= null)&&(!this.strkRules.isEmpty()))?this.getStrkRules():null);
            List<StrikeRulesBlockT> rhsStrkRules;
            rhsStrkRules = (((that.strkRules!= null)&&(!that.strkRules.isEmpty()))?that.getStrkRules():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "strkRules", lhsStrkRules), LocatorUtils.property(thatLocator, "strkRules", rhsStrkRules), lhsStrkRules, rhsStrkRules)) {
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
            List<InstrmtLegSecListGrpBlockT> lhsSecL;
            lhsSecL = (((this.secL!= null)&&(!this.secL.isEmpty()))?this.getSecL():null);
            List<InstrmtLegSecListGrpBlockT> rhsSecL;
            rhsSecL = (((that.secL!= null)&&(!that.secL.isEmpty()))?that.getSecL():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "secL", lhsSecL), LocatorUtils.property(thatLocator, "secL", rhsSecL), lhsSecL, rhsSecL)) {
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
            String lhsCcy;
            lhsCcy = this.getCcy();
            String rhsCcy;
            rhsCcy = that.getCcy();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "ccy", lhsCcy), LocatorUtils.property(thatLocator, "ccy", rhsCcy), lhsCcy, rhsCcy)) {
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
        return true;
    }

    public boolean equals(Object object) {
        final EqualsStrategy strategy = JAXBEqualsStrategy.INSTANCE;
        return equals(null, null, object, strategy);
    }

    public int hashCode(ObjectLocator locator, HashCodeStrategy strategy) {
        int currentHashCode = 1;
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
            FinancingDetailsBlockT theFinDetls;
            theFinDetls = this.getFinDetls();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "finDetls", theFinDetls), currentHashCode, theFinDetls);
        }
        {
            SecurityTradingRulesBlockT theSecTrdgRules;
            theSecTrdgRules = this.getSecTrdgRules();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "secTrdgRules", theSecTrdgRules), currentHashCode, theSecTrdgRules);
        }
        {
            List<StrikeRulesBlockT> theStrkRules;
            theStrkRules = (((this.strkRules!= null)&&(!this.strkRules.isEmpty()))?this.getStrkRules():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "strkRules", theStrkRules), currentHashCode, theStrkRules);
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
            List<InstrmtLegSecListGrpBlockT> theSecL;
            theSecL = (((this.secL!= null)&&(!this.secL.isEmpty()))?this.getSecL():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "secL", theSecL), currentHashCode, theSecL);
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
            String theCcy;
            theCcy = this.getCcy();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "ccy", theCcy), currentHashCode, theCcy);
        }
        {
            XMLGregorianCalendar theTxnTm;
            theTxnTm = this.getTxnTm();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "txnTm", theTxnTm), currentHashCode, theTxnTm);
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
            FinancingDetailsBlockT theFinDetls;
            theFinDetls = this.getFinDetls();
            strategy.appendField(locator, this, "finDetls", buffer, theFinDetls);
        }
        {
            SecurityTradingRulesBlockT theSecTrdgRules;
            theSecTrdgRules = this.getSecTrdgRules();
            strategy.appendField(locator, this, "secTrdgRules", buffer, theSecTrdgRules);
        }
        {
            List<StrikeRulesBlockT> theStrkRules;
            theStrkRules = (((this.strkRules!= null)&&(!this.strkRules.isEmpty()))?this.getStrkRules():null);
            strategy.appendField(locator, this, "strkRules", buffer, theStrkRules);
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
            List<InstrmtLegSecListGrpBlockT> theSecL;
            theSecL = (((this.secL!= null)&&(!this.secL.isEmpty()))?this.getSecL():null);
            strategy.appendField(locator, this, "secL", buffer, theSecL);
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
            String theCcy;
            theCcy = this.getCcy();
            strategy.appendField(locator, this, "ccy", buffer, theCcy);
        }
        {
            XMLGregorianCalendar theTxnTm;
            theTxnTm = this.getTxnTm();
            strategy.appendField(locator, this, "txnTm", buffer, theTxnTm);
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
        return buffer;
    }

}
