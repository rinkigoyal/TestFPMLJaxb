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
 * SecurityDefinitionRequest can be found in Volume 3 of the
 * 						specification
 * 
 * <p>Java class for SecurityDefinitionRequest_message_t complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SecurityDefinitionRequest_message_t"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.fixprotocol.org/FIXML-5-0-SP2}Abstract_message_t"&gt;
 *       &lt;sequence&gt;
 *         &lt;group ref="{http://www.fixprotocol.org/FIXML-5-0-SP2}SecurityDefinitionRequestElements"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attGroup ref="{http://www.fixprotocol.org/FIXML-5-0-SP2}SecurityDefinitionRequestAttributes"/&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SecurityDefinitionRequest_message_t", propOrder = {
    "instrmt",
    "instrmtExt",
    "undly",
    "stip",
    "leg",
    "sprdBnchmkCurve",
    "yield"
})
public class SecurityDefinitionRequestMessageT
    extends AbstractMessageT
    implements Equals, HashCode, ToString
{

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
    @XmlAttribute(name = "ReqID", required = true)
    protected String reqID;
    @XmlAttribute(name = "ReqTyp", required = true)
    protected BigInteger reqTyp;
    @XmlAttribute(name = "MktID")
    protected String mktID;
    @XmlAttribute(name = "MktSegID")
    protected String mktSegID;
    @XmlAttribute(name = "Ccy")
    protected String ccy;
    @XmlAttribute(name = "Txt")
    protected String txt;
    @XmlAttribute(name = "EncTxtLen")
    protected BigInteger encTxtLen;
    @XmlAttribute(name = "EncTxt")
    protected String encTxt;
    @XmlAttribute(name = "SesID")
    protected String sesID;
    @XmlAttribute(name = "SesSub")
    protected String sesSub;
    @XmlAttribute(name = "ExpirationCycle")
    protected BigInteger expirationCycle;
    @XmlAttribute(name = "SubReqTyp")
    protected String subReqTyp;

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
     * Gets the value of the reqTyp property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getReqTyp() {
        return reqTyp;
    }

    /**
     * Sets the value of the reqTyp property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setReqTyp(BigInteger value) {
        this.reqTyp = value;
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
     * Gets the value of the expirationCycle property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getExpirationCycle() {
        return expirationCycle;
    }

    /**
     * Sets the value of the expirationCycle property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setExpirationCycle(BigInteger value) {
        this.expirationCycle = value;
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
        if (!(object instanceof SecurityDefinitionRequestMessageT)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        if (!super.equals(thisLocator, thatLocator, object, strategy)) {
            return false;
        }
        final SecurityDefinitionRequestMessageT that = ((SecurityDefinitionRequestMessageT) object);
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
            String lhsReqID;
            lhsReqID = this.getReqID();
            String rhsReqID;
            rhsReqID = that.getReqID();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "reqID", lhsReqID), LocatorUtils.property(thatLocator, "reqID", rhsReqID), lhsReqID, rhsReqID)) {
                return false;
            }
        }
        {
            BigInteger lhsReqTyp;
            lhsReqTyp = this.getReqTyp();
            BigInteger rhsReqTyp;
            rhsReqTyp = that.getReqTyp();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "reqTyp", lhsReqTyp), LocatorUtils.property(thatLocator, "reqTyp", rhsReqTyp), lhsReqTyp, rhsReqTyp)) {
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
            BigInteger lhsExpirationCycle;
            lhsExpirationCycle = this.getExpirationCycle();
            BigInteger rhsExpirationCycle;
            rhsExpirationCycle = that.getExpirationCycle();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "expirationCycle", lhsExpirationCycle), LocatorUtils.property(thatLocator, "expirationCycle", rhsExpirationCycle), lhsExpirationCycle, rhsExpirationCycle)) {
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
            String theReqID;
            theReqID = this.getReqID();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "reqID", theReqID), currentHashCode, theReqID);
        }
        {
            BigInteger theReqTyp;
            theReqTyp = this.getReqTyp();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "reqTyp", theReqTyp), currentHashCode, theReqTyp);
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
            BigInteger theExpirationCycle;
            theExpirationCycle = this.getExpirationCycle();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "expirationCycle", theExpirationCycle), currentHashCode, theExpirationCycle);
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
            String theReqID;
            theReqID = this.getReqID();
            strategy.appendField(locator, this, "reqID", buffer, theReqID);
        }
        {
            BigInteger theReqTyp;
            theReqTyp = this.getReqTyp();
            strategy.appendField(locator, this, "reqTyp", buffer, theReqTyp);
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
            BigInteger theExpirationCycle;
            theExpirationCycle = this.getExpirationCycle();
            strategy.appendField(locator, this, "expirationCycle", buffer, theExpirationCycle);
        }
        {
            String theSubReqTyp;
            theSubReqTyp = this.getSubReqTyp();
            strategy.appendField(locator, this, "subReqTyp", buffer, theSubReqTyp);
        }
        return buffer;
    }

}
