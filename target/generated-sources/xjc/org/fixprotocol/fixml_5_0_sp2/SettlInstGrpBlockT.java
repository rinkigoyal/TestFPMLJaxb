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
 * <p>Java class for SettlInstGrp_Block_t complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SettlInstGrp_Block_t"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;group ref="{http://www.fixprotocol.org/FIXML-5-0-SP2}SettlInstGrpElements"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attGroup ref="{http://www.fixprotocol.org/FIXML-5-0-SP2}SettlInstGrpAttributes"/&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SettlInstGrp_Block_t", propOrder = {
    "pty",
    "setInstr"
})
public class SettlInstGrpBlockT
    implements Equals, HashCode, ToString
{

    @XmlElement(name = "Pty")
    protected List<PartiesBlockT> pty;
    @XmlElement(name = "SetInstr")
    protected SettlInstructionsDataBlockT setInstr;
    @XmlAttribute(name = "SettlInstID")
    protected String settlInstID;
    @XmlAttribute(name = "SettlInstTransTyp")
    protected SettlInstTransTypeEnumT settlInstTransTyp;
    @XmlAttribute(name = "SettlInstRefID")
    protected String settlInstRefID;
    @XmlAttribute(name = "Side")
    protected String side;
    @XmlAttribute(name = "Prod")
    protected BigInteger prod;
    @XmlAttribute(name = "SecTyp")
    protected String secTyp;
    @XmlAttribute(name = "CFI")
    protected String cfi;
    @XmlAttribute(name = "SettlCcy")
    protected String settlCcy;
    @XmlAttribute(name = "EfctvTm")
    protected XMLGregorianCalendar efctvTm;
    @XmlAttribute(name = "ExpireTm")
    protected XMLGregorianCalendar expireTm;
    @XmlAttribute(name = "LastUpdateTm")
    protected XMLGregorianCalendar lastUpdateTm;
    @XmlAttribute(name = "PmtMethod")
    protected String pmtMethod;
    @XmlAttribute(name = "PmtRef")
    protected String pmtRef;
    @XmlAttribute(name = "CardHolderName")
    protected String cardHolderName;
    @XmlAttribute(name = "CardNum")
    protected String cardNum;
    @XmlAttribute(name = "CardStartDt")
    protected XMLGregorianCalendar cardStartDt;
    @XmlAttribute(name = "CardExpDt")
    protected XMLGregorianCalendar cardExpDt;
    @XmlAttribute(name = "CardIssNum")
    protected String cardIssNum;
    @XmlAttribute(name = "PmtDt")
    protected XMLGregorianCalendar pmtDt;
    @XmlAttribute(name = "PmtRemtrID")
    protected String pmtRemtrID;

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
     * Gets the value of the setInstr property.
     * 
     * @return
     *     possible object is
     *     {@link SettlInstructionsDataBlockT }
     *     
     */
    public SettlInstructionsDataBlockT getSetInstr() {
        return setInstr;
    }

    /**
     * Sets the value of the setInstr property.
     * 
     * @param value
     *     allowed object is
     *     {@link SettlInstructionsDataBlockT }
     *     
     */
    public void setSetInstr(SettlInstructionsDataBlockT value) {
        this.setInstr = value;
    }

    /**
     * Gets the value of the settlInstID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSettlInstID() {
        return settlInstID;
    }

    /**
     * Sets the value of the settlInstID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSettlInstID(String value) {
        this.settlInstID = value;
    }

    /**
     * Gets the value of the settlInstTransTyp property.
     * 
     * @return
     *     possible object is
     *     {@link SettlInstTransTypeEnumT }
     *     
     */
    public SettlInstTransTypeEnumT getSettlInstTransTyp() {
        return settlInstTransTyp;
    }

    /**
     * Sets the value of the settlInstTransTyp property.
     * 
     * @param value
     *     allowed object is
     *     {@link SettlInstTransTypeEnumT }
     *     
     */
    public void setSettlInstTransTyp(SettlInstTransTypeEnumT value) {
        this.settlInstTransTyp = value;
    }

    /**
     * Gets the value of the settlInstRefID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSettlInstRefID() {
        return settlInstRefID;
    }

    /**
     * Sets the value of the settlInstRefID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSettlInstRefID(String value) {
        this.settlInstRefID = value;
    }

    /**
     * Gets the value of the side property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSide() {
        return side;
    }

    /**
     * Sets the value of the side property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSide(String value) {
        this.side = value;
    }

    /**
     * Gets the value of the prod property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getProd() {
        return prod;
    }

    /**
     * Sets the value of the prod property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setProd(BigInteger value) {
        this.prod = value;
    }

    /**
     * Gets the value of the secTyp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSecTyp() {
        return secTyp;
    }

    /**
     * Sets the value of the secTyp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSecTyp(String value) {
        this.secTyp = value;
    }

    /**
     * Gets the value of the cfi property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCFI() {
        return cfi;
    }

    /**
     * Sets the value of the cfi property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCFI(String value) {
        this.cfi = value;
    }

    /**
     * Gets the value of the settlCcy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSettlCcy() {
        return settlCcy;
    }

    /**
     * Sets the value of the settlCcy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSettlCcy(String value) {
        this.settlCcy = value;
    }

    /**
     * Gets the value of the efctvTm property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEfctvTm() {
        return efctvTm;
    }

    /**
     * Sets the value of the efctvTm property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEfctvTm(XMLGregorianCalendar value) {
        this.efctvTm = value;
    }

    /**
     * Gets the value of the expireTm property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getExpireTm() {
        return expireTm;
    }

    /**
     * Sets the value of the expireTm property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setExpireTm(XMLGregorianCalendar value) {
        this.expireTm = value;
    }

    /**
     * Gets the value of the lastUpdateTm property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLastUpdateTm() {
        return lastUpdateTm;
    }

    /**
     * Sets the value of the lastUpdateTm property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLastUpdateTm(XMLGregorianCalendar value) {
        this.lastUpdateTm = value;
    }

    /**
     * Gets the value of the pmtMethod property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPmtMethod() {
        return pmtMethod;
    }

    /**
     * Sets the value of the pmtMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPmtMethod(String value) {
        this.pmtMethod = value;
    }

    /**
     * Gets the value of the pmtRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPmtRef() {
        return pmtRef;
    }

    /**
     * Sets the value of the pmtRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPmtRef(String value) {
        this.pmtRef = value;
    }

    /**
     * Gets the value of the cardHolderName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardHolderName() {
        return cardHolderName;
    }

    /**
     * Sets the value of the cardHolderName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardHolderName(String value) {
        this.cardHolderName = value;
    }

    /**
     * Gets the value of the cardNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardNum() {
        return cardNum;
    }

    /**
     * Sets the value of the cardNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardNum(String value) {
        this.cardNum = value;
    }

    /**
     * Gets the value of the cardStartDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCardStartDt() {
        return cardStartDt;
    }

    /**
     * Sets the value of the cardStartDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCardStartDt(XMLGregorianCalendar value) {
        this.cardStartDt = value;
    }

    /**
     * Gets the value of the cardExpDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCardExpDt() {
        return cardExpDt;
    }

    /**
     * Sets the value of the cardExpDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCardExpDt(XMLGregorianCalendar value) {
        this.cardExpDt = value;
    }

    /**
     * Gets the value of the cardIssNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardIssNum() {
        return cardIssNum;
    }

    /**
     * Sets the value of the cardIssNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardIssNum(String value) {
        this.cardIssNum = value;
    }

    /**
     * Gets the value of the pmtDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPmtDt() {
        return pmtDt;
    }

    /**
     * Sets the value of the pmtDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPmtDt(XMLGregorianCalendar value) {
        this.pmtDt = value;
    }

    /**
     * Gets the value of the pmtRemtrID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPmtRemtrID() {
        return pmtRemtrID;
    }

    /**
     * Sets the value of the pmtRemtrID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPmtRemtrID(String value) {
        this.pmtRemtrID = value;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof SettlInstGrpBlockT)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final SettlInstGrpBlockT that = ((SettlInstGrpBlockT) object);
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
            SettlInstructionsDataBlockT lhsSetInstr;
            lhsSetInstr = this.getSetInstr();
            SettlInstructionsDataBlockT rhsSetInstr;
            rhsSetInstr = that.getSetInstr();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "setInstr", lhsSetInstr), LocatorUtils.property(thatLocator, "setInstr", rhsSetInstr), lhsSetInstr, rhsSetInstr)) {
                return false;
            }
        }
        {
            String lhsSettlInstID;
            lhsSettlInstID = this.getSettlInstID();
            String rhsSettlInstID;
            rhsSettlInstID = that.getSettlInstID();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "settlInstID", lhsSettlInstID), LocatorUtils.property(thatLocator, "settlInstID", rhsSettlInstID), lhsSettlInstID, rhsSettlInstID)) {
                return false;
            }
        }
        {
            SettlInstTransTypeEnumT lhsSettlInstTransTyp;
            lhsSettlInstTransTyp = this.getSettlInstTransTyp();
            SettlInstTransTypeEnumT rhsSettlInstTransTyp;
            rhsSettlInstTransTyp = that.getSettlInstTransTyp();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "settlInstTransTyp", lhsSettlInstTransTyp), LocatorUtils.property(thatLocator, "settlInstTransTyp", rhsSettlInstTransTyp), lhsSettlInstTransTyp, rhsSettlInstTransTyp)) {
                return false;
            }
        }
        {
            String lhsSettlInstRefID;
            lhsSettlInstRefID = this.getSettlInstRefID();
            String rhsSettlInstRefID;
            rhsSettlInstRefID = that.getSettlInstRefID();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "settlInstRefID", lhsSettlInstRefID), LocatorUtils.property(thatLocator, "settlInstRefID", rhsSettlInstRefID), lhsSettlInstRefID, rhsSettlInstRefID)) {
                return false;
            }
        }
        {
            String lhsSide;
            lhsSide = this.getSide();
            String rhsSide;
            rhsSide = that.getSide();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "side", lhsSide), LocatorUtils.property(thatLocator, "side", rhsSide), lhsSide, rhsSide)) {
                return false;
            }
        }
        {
            BigInteger lhsProd;
            lhsProd = this.getProd();
            BigInteger rhsProd;
            rhsProd = that.getProd();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "prod", lhsProd), LocatorUtils.property(thatLocator, "prod", rhsProd), lhsProd, rhsProd)) {
                return false;
            }
        }
        {
            String lhsSecTyp;
            lhsSecTyp = this.getSecTyp();
            String rhsSecTyp;
            rhsSecTyp = that.getSecTyp();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "secTyp", lhsSecTyp), LocatorUtils.property(thatLocator, "secTyp", rhsSecTyp), lhsSecTyp, rhsSecTyp)) {
                return false;
            }
        }
        {
            String lhsCFI;
            lhsCFI = this.getCFI();
            String rhsCFI;
            rhsCFI = that.getCFI();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "cfi", lhsCFI), LocatorUtils.property(thatLocator, "cfi", rhsCFI), lhsCFI, rhsCFI)) {
                return false;
            }
        }
        {
            String lhsSettlCcy;
            lhsSettlCcy = this.getSettlCcy();
            String rhsSettlCcy;
            rhsSettlCcy = that.getSettlCcy();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "settlCcy", lhsSettlCcy), LocatorUtils.property(thatLocator, "settlCcy", rhsSettlCcy), lhsSettlCcy, rhsSettlCcy)) {
                return false;
            }
        }
        {
            XMLGregorianCalendar lhsEfctvTm;
            lhsEfctvTm = this.getEfctvTm();
            XMLGregorianCalendar rhsEfctvTm;
            rhsEfctvTm = that.getEfctvTm();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "efctvTm", lhsEfctvTm), LocatorUtils.property(thatLocator, "efctvTm", rhsEfctvTm), lhsEfctvTm, rhsEfctvTm)) {
                return false;
            }
        }
        {
            XMLGregorianCalendar lhsExpireTm;
            lhsExpireTm = this.getExpireTm();
            XMLGregorianCalendar rhsExpireTm;
            rhsExpireTm = that.getExpireTm();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "expireTm", lhsExpireTm), LocatorUtils.property(thatLocator, "expireTm", rhsExpireTm), lhsExpireTm, rhsExpireTm)) {
                return false;
            }
        }
        {
            XMLGregorianCalendar lhsLastUpdateTm;
            lhsLastUpdateTm = this.getLastUpdateTm();
            XMLGregorianCalendar rhsLastUpdateTm;
            rhsLastUpdateTm = that.getLastUpdateTm();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "lastUpdateTm", lhsLastUpdateTm), LocatorUtils.property(thatLocator, "lastUpdateTm", rhsLastUpdateTm), lhsLastUpdateTm, rhsLastUpdateTm)) {
                return false;
            }
        }
        {
            String lhsPmtMethod;
            lhsPmtMethod = this.getPmtMethod();
            String rhsPmtMethod;
            rhsPmtMethod = that.getPmtMethod();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "pmtMethod", lhsPmtMethod), LocatorUtils.property(thatLocator, "pmtMethod", rhsPmtMethod), lhsPmtMethod, rhsPmtMethod)) {
                return false;
            }
        }
        {
            String lhsPmtRef;
            lhsPmtRef = this.getPmtRef();
            String rhsPmtRef;
            rhsPmtRef = that.getPmtRef();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "pmtRef", lhsPmtRef), LocatorUtils.property(thatLocator, "pmtRef", rhsPmtRef), lhsPmtRef, rhsPmtRef)) {
                return false;
            }
        }
        {
            String lhsCardHolderName;
            lhsCardHolderName = this.getCardHolderName();
            String rhsCardHolderName;
            rhsCardHolderName = that.getCardHolderName();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "cardHolderName", lhsCardHolderName), LocatorUtils.property(thatLocator, "cardHolderName", rhsCardHolderName), lhsCardHolderName, rhsCardHolderName)) {
                return false;
            }
        }
        {
            String lhsCardNum;
            lhsCardNum = this.getCardNum();
            String rhsCardNum;
            rhsCardNum = that.getCardNum();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "cardNum", lhsCardNum), LocatorUtils.property(thatLocator, "cardNum", rhsCardNum), lhsCardNum, rhsCardNum)) {
                return false;
            }
        }
        {
            XMLGregorianCalendar lhsCardStartDt;
            lhsCardStartDt = this.getCardStartDt();
            XMLGregorianCalendar rhsCardStartDt;
            rhsCardStartDt = that.getCardStartDt();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "cardStartDt", lhsCardStartDt), LocatorUtils.property(thatLocator, "cardStartDt", rhsCardStartDt), lhsCardStartDt, rhsCardStartDt)) {
                return false;
            }
        }
        {
            XMLGregorianCalendar lhsCardExpDt;
            lhsCardExpDt = this.getCardExpDt();
            XMLGregorianCalendar rhsCardExpDt;
            rhsCardExpDt = that.getCardExpDt();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "cardExpDt", lhsCardExpDt), LocatorUtils.property(thatLocator, "cardExpDt", rhsCardExpDt), lhsCardExpDt, rhsCardExpDt)) {
                return false;
            }
        }
        {
            String lhsCardIssNum;
            lhsCardIssNum = this.getCardIssNum();
            String rhsCardIssNum;
            rhsCardIssNum = that.getCardIssNum();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "cardIssNum", lhsCardIssNum), LocatorUtils.property(thatLocator, "cardIssNum", rhsCardIssNum), lhsCardIssNum, rhsCardIssNum)) {
                return false;
            }
        }
        {
            XMLGregorianCalendar lhsPmtDt;
            lhsPmtDt = this.getPmtDt();
            XMLGregorianCalendar rhsPmtDt;
            rhsPmtDt = that.getPmtDt();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "pmtDt", lhsPmtDt), LocatorUtils.property(thatLocator, "pmtDt", rhsPmtDt), lhsPmtDt, rhsPmtDt)) {
                return false;
            }
        }
        {
            String lhsPmtRemtrID;
            lhsPmtRemtrID = this.getPmtRemtrID();
            String rhsPmtRemtrID;
            rhsPmtRemtrID = that.getPmtRemtrID();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "pmtRemtrID", lhsPmtRemtrID), LocatorUtils.property(thatLocator, "pmtRemtrID", rhsPmtRemtrID), lhsPmtRemtrID, rhsPmtRemtrID)) {
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
            List<PartiesBlockT> thePty;
            thePty = (((this.pty!= null)&&(!this.pty.isEmpty()))?this.getPty():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "pty", thePty), currentHashCode, thePty);
        }
        {
            SettlInstructionsDataBlockT theSetInstr;
            theSetInstr = this.getSetInstr();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "setInstr", theSetInstr), currentHashCode, theSetInstr);
        }
        {
            String theSettlInstID;
            theSettlInstID = this.getSettlInstID();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "settlInstID", theSettlInstID), currentHashCode, theSettlInstID);
        }
        {
            SettlInstTransTypeEnumT theSettlInstTransTyp;
            theSettlInstTransTyp = this.getSettlInstTransTyp();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "settlInstTransTyp", theSettlInstTransTyp), currentHashCode, theSettlInstTransTyp);
        }
        {
            String theSettlInstRefID;
            theSettlInstRefID = this.getSettlInstRefID();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "settlInstRefID", theSettlInstRefID), currentHashCode, theSettlInstRefID);
        }
        {
            String theSide;
            theSide = this.getSide();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "side", theSide), currentHashCode, theSide);
        }
        {
            BigInteger theProd;
            theProd = this.getProd();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "prod", theProd), currentHashCode, theProd);
        }
        {
            String theSecTyp;
            theSecTyp = this.getSecTyp();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "secTyp", theSecTyp), currentHashCode, theSecTyp);
        }
        {
            String theCFI;
            theCFI = this.getCFI();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "cfi", theCFI), currentHashCode, theCFI);
        }
        {
            String theSettlCcy;
            theSettlCcy = this.getSettlCcy();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "settlCcy", theSettlCcy), currentHashCode, theSettlCcy);
        }
        {
            XMLGregorianCalendar theEfctvTm;
            theEfctvTm = this.getEfctvTm();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "efctvTm", theEfctvTm), currentHashCode, theEfctvTm);
        }
        {
            XMLGregorianCalendar theExpireTm;
            theExpireTm = this.getExpireTm();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "expireTm", theExpireTm), currentHashCode, theExpireTm);
        }
        {
            XMLGregorianCalendar theLastUpdateTm;
            theLastUpdateTm = this.getLastUpdateTm();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "lastUpdateTm", theLastUpdateTm), currentHashCode, theLastUpdateTm);
        }
        {
            String thePmtMethod;
            thePmtMethod = this.getPmtMethod();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "pmtMethod", thePmtMethod), currentHashCode, thePmtMethod);
        }
        {
            String thePmtRef;
            thePmtRef = this.getPmtRef();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "pmtRef", thePmtRef), currentHashCode, thePmtRef);
        }
        {
            String theCardHolderName;
            theCardHolderName = this.getCardHolderName();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "cardHolderName", theCardHolderName), currentHashCode, theCardHolderName);
        }
        {
            String theCardNum;
            theCardNum = this.getCardNum();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "cardNum", theCardNum), currentHashCode, theCardNum);
        }
        {
            XMLGregorianCalendar theCardStartDt;
            theCardStartDt = this.getCardStartDt();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "cardStartDt", theCardStartDt), currentHashCode, theCardStartDt);
        }
        {
            XMLGregorianCalendar theCardExpDt;
            theCardExpDt = this.getCardExpDt();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "cardExpDt", theCardExpDt), currentHashCode, theCardExpDt);
        }
        {
            String theCardIssNum;
            theCardIssNum = this.getCardIssNum();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "cardIssNum", theCardIssNum), currentHashCode, theCardIssNum);
        }
        {
            XMLGregorianCalendar thePmtDt;
            thePmtDt = this.getPmtDt();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "pmtDt", thePmtDt), currentHashCode, thePmtDt);
        }
        {
            String thePmtRemtrID;
            thePmtRemtrID = this.getPmtRemtrID();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "pmtRemtrID", thePmtRemtrID), currentHashCode, thePmtRemtrID);
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
            List<PartiesBlockT> thePty;
            thePty = (((this.pty!= null)&&(!this.pty.isEmpty()))?this.getPty():null);
            strategy.appendField(locator, this, "pty", buffer, thePty);
        }
        {
            SettlInstructionsDataBlockT theSetInstr;
            theSetInstr = this.getSetInstr();
            strategy.appendField(locator, this, "setInstr", buffer, theSetInstr);
        }
        {
            String theSettlInstID;
            theSettlInstID = this.getSettlInstID();
            strategy.appendField(locator, this, "settlInstID", buffer, theSettlInstID);
        }
        {
            SettlInstTransTypeEnumT theSettlInstTransTyp;
            theSettlInstTransTyp = this.getSettlInstTransTyp();
            strategy.appendField(locator, this, "settlInstTransTyp", buffer, theSettlInstTransTyp);
        }
        {
            String theSettlInstRefID;
            theSettlInstRefID = this.getSettlInstRefID();
            strategy.appendField(locator, this, "settlInstRefID", buffer, theSettlInstRefID);
        }
        {
            String theSide;
            theSide = this.getSide();
            strategy.appendField(locator, this, "side", buffer, theSide);
        }
        {
            BigInteger theProd;
            theProd = this.getProd();
            strategy.appendField(locator, this, "prod", buffer, theProd);
        }
        {
            String theSecTyp;
            theSecTyp = this.getSecTyp();
            strategy.appendField(locator, this, "secTyp", buffer, theSecTyp);
        }
        {
            String theCFI;
            theCFI = this.getCFI();
            strategy.appendField(locator, this, "cfi", buffer, theCFI);
        }
        {
            String theSettlCcy;
            theSettlCcy = this.getSettlCcy();
            strategy.appendField(locator, this, "settlCcy", buffer, theSettlCcy);
        }
        {
            XMLGregorianCalendar theEfctvTm;
            theEfctvTm = this.getEfctvTm();
            strategy.appendField(locator, this, "efctvTm", buffer, theEfctvTm);
        }
        {
            XMLGregorianCalendar theExpireTm;
            theExpireTm = this.getExpireTm();
            strategy.appendField(locator, this, "expireTm", buffer, theExpireTm);
        }
        {
            XMLGregorianCalendar theLastUpdateTm;
            theLastUpdateTm = this.getLastUpdateTm();
            strategy.appendField(locator, this, "lastUpdateTm", buffer, theLastUpdateTm);
        }
        {
            String thePmtMethod;
            thePmtMethod = this.getPmtMethod();
            strategy.appendField(locator, this, "pmtMethod", buffer, thePmtMethod);
        }
        {
            String thePmtRef;
            thePmtRef = this.getPmtRef();
            strategy.appendField(locator, this, "pmtRef", buffer, thePmtRef);
        }
        {
            String theCardHolderName;
            theCardHolderName = this.getCardHolderName();
            strategy.appendField(locator, this, "cardHolderName", buffer, theCardHolderName);
        }
        {
            String theCardNum;
            theCardNum = this.getCardNum();
            strategy.appendField(locator, this, "cardNum", buffer, theCardNum);
        }
        {
            XMLGregorianCalendar theCardStartDt;
            theCardStartDt = this.getCardStartDt();
            strategy.appendField(locator, this, "cardStartDt", buffer, theCardStartDt);
        }
        {
            XMLGregorianCalendar theCardExpDt;
            theCardExpDt = this.getCardExpDt();
            strategy.appendField(locator, this, "cardExpDt", buffer, theCardExpDt);
        }
        {
            String theCardIssNum;
            theCardIssNum = this.getCardIssNum();
            strategy.appendField(locator, this, "cardIssNum", buffer, theCardIssNum);
        }
        {
            XMLGregorianCalendar thePmtDt;
            thePmtDt = this.getPmtDt();
            strategy.appendField(locator, this, "pmtDt", buffer, thePmtDt);
        }
        {
            String thePmtRemtrID;
            thePmtRemtrID = this.getPmtRemtrID();
            strategy.appendField(locator, this, "pmtRemtrID", buffer, thePmtRemtrID);
        }
        return buffer;
    }

}
