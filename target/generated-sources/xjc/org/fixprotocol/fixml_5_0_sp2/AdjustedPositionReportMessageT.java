//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.01.14 at 04:50:28 PM SGT 
//


package org.fixprotocol.fixml_5_0_sp2;

import java.math.BigDecimal;
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
 * AdjustedPositionReport can be found in Volume 5 of the
 * 						specification
 * 
 * <p>Java class for AdjustedPositionReport_message_t complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AdjustedPositionReport_message_t"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.fixprotocol.org/FIXML-5-0-SP2}Abstract_message_t"&gt;
 *       &lt;sequence&gt;
 *         &lt;group ref="{http://www.fixprotocol.org/FIXML-5-0-SP2}AdjustedPositionReportElements"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attGroup ref="{http://www.fixprotocol.org/FIXML-5-0-SP2}AdjustedPositionReportAttributes"/&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AdjustedPositionReport_message_t", propOrder = {
    "pty",
    "qty",
    "inst"
})
public class AdjustedPositionReportMessageT
    extends AbstractMessageT
    implements Equals, HashCode, ToString
{

    @XmlElement(name = "Pty", required = true)
    protected List<PartiesBlockT> pty;
    @XmlElement(name = "Qty", required = true)
    protected List<PositionQtyBlockT> qty;
    @XmlElement(name = "Inst")
    protected List<InstrmtGrpBlockT> inst;
    @XmlAttribute(name = "RptID", required = true)
    protected String rptID;
    @XmlAttribute(name = "ReqTyp")
    protected BigInteger reqTyp;
    @XmlAttribute(name = "BizDt", required = true)
    protected XMLGregorianCalendar bizDt;
    @XmlAttribute(name = "SetSesID")
    protected SettlSessIDEnumT setSesID;
    @XmlAttribute(name = "RptRefID")
    protected String rptRefID;
    @XmlAttribute(name = "SetPx")
    protected BigDecimal setPx;
    @XmlAttribute(name = "PriSetPx")
    protected BigDecimal priSetPx;

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
     * Gets the value of the qty property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the qty property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getQty().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PositionQtyBlockT }
     * 
     * 
     */
    public List<PositionQtyBlockT> getQty() {
        if (qty == null) {
            qty = new ArrayList<PositionQtyBlockT>();
        }
        return this.qty;
    }

    /**
     * Gets the value of the inst property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the inst property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInst().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link InstrmtGrpBlockT }
     * 
     * 
     */
    public List<InstrmtGrpBlockT> getInst() {
        if (inst == null) {
            inst = new ArrayList<InstrmtGrpBlockT>();
        }
        return this.inst;
    }

    /**
     * Gets the value of the rptID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRptID() {
        return rptID;
    }

    /**
     * Sets the value of the rptID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRptID(String value) {
        this.rptID = value;
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
     * Gets the value of the setSesID property.
     * 
     * @return
     *     possible object is
     *     {@link SettlSessIDEnumT }
     *     
     */
    public SettlSessIDEnumT getSetSesID() {
        return setSesID;
    }

    /**
     * Sets the value of the setSesID property.
     * 
     * @param value
     *     allowed object is
     *     {@link SettlSessIDEnumT }
     *     
     */
    public void setSetSesID(SettlSessIDEnumT value) {
        this.setSesID = value;
    }

    /**
     * Gets the value of the rptRefID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRptRefID() {
        return rptRefID;
    }

    /**
     * Sets the value of the rptRefID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRptRefID(String value) {
        this.rptRefID = value;
    }

    /**
     * Gets the value of the setPx property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSetPx() {
        return setPx;
    }

    /**
     * Sets the value of the setPx property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setSetPx(BigDecimal value) {
        this.setPx = value;
    }

    /**
     * Gets the value of the priSetPx property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPriSetPx() {
        return priSetPx;
    }

    /**
     * Sets the value of the priSetPx property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPriSetPx(BigDecimal value) {
        this.priSetPx = value;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof AdjustedPositionReportMessageT)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        if (!super.equals(thisLocator, thatLocator, object, strategy)) {
            return false;
        }
        final AdjustedPositionReportMessageT that = ((AdjustedPositionReportMessageT) object);
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
            List<PositionQtyBlockT> lhsQty;
            lhsQty = (((this.qty!= null)&&(!this.qty.isEmpty()))?this.getQty():null);
            List<PositionQtyBlockT> rhsQty;
            rhsQty = (((that.qty!= null)&&(!that.qty.isEmpty()))?that.getQty():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "qty", lhsQty), LocatorUtils.property(thatLocator, "qty", rhsQty), lhsQty, rhsQty)) {
                return false;
            }
        }
        {
            List<InstrmtGrpBlockT> lhsInst;
            lhsInst = (((this.inst!= null)&&(!this.inst.isEmpty()))?this.getInst():null);
            List<InstrmtGrpBlockT> rhsInst;
            rhsInst = (((that.inst!= null)&&(!that.inst.isEmpty()))?that.getInst():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "inst", lhsInst), LocatorUtils.property(thatLocator, "inst", rhsInst), lhsInst, rhsInst)) {
                return false;
            }
        }
        {
            String lhsRptID;
            lhsRptID = this.getRptID();
            String rhsRptID;
            rhsRptID = that.getRptID();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "rptID", lhsRptID), LocatorUtils.property(thatLocator, "rptID", rhsRptID), lhsRptID, rhsRptID)) {
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
            XMLGregorianCalendar lhsBizDt;
            lhsBizDt = this.getBizDt();
            XMLGregorianCalendar rhsBizDt;
            rhsBizDt = that.getBizDt();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "bizDt", lhsBizDt), LocatorUtils.property(thatLocator, "bizDt", rhsBizDt), lhsBizDt, rhsBizDt)) {
                return false;
            }
        }
        {
            SettlSessIDEnumT lhsSetSesID;
            lhsSetSesID = this.getSetSesID();
            SettlSessIDEnumT rhsSetSesID;
            rhsSetSesID = that.getSetSesID();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "setSesID", lhsSetSesID), LocatorUtils.property(thatLocator, "setSesID", rhsSetSesID), lhsSetSesID, rhsSetSesID)) {
                return false;
            }
        }
        {
            String lhsRptRefID;
            lhsRptRefID = this.getRptRefID();
            String rhsRptRefID;
            rhsRptRefID = that.getRptRefID();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "rptRefID", lhsRptRefID), LocatorUtils.property(thatLocator, "rptRefID", rhsRptRefID), lhsRptRefID, rhsRptRefID)) {
                return false;
            }
        }
        {
            BigDecimal lhsSetPx;
            lhsSetPx = this.getSetPx();
            BigDecimal rhsSetPx;
            rhsSetPx = that.getSetPx();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "setPx", lhsSetPx), LocatorUtils.property(thatLocator, "setPx", rhsSetPx), lhsSetPx, rhsSetPx)) {
                return false;
            }
        }
        {
            BigDecimal lhsPriSetPx;
            lhsPriSetPx = this.getPriSetPx();
            BigDecimal rhsPriSetPx;
            rhsPriSetPx = that.getPriSetPx();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "priSetPx", lhsPriSetPx), LocatorUtils.property(thatLocator, "priSetPx", rhsPriSetPx), lhsPriSetPx, rhsPriSetPx)) {
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
            List<PositionQtyBlockT> theQty;
            theQty = (((this.qty!= null)&&(!this.qty.isEmpty()))?this.getQty():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "qty", theQty), currentHashCode, theQty);
        }
        {
            List<InstrmtGrpBlockT> theInst;
            theInst = (((this.inst!= null)&&(!this.inst.isEmpty()))?this.getInst():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "inst", theInst), currentHashCode, theInst);
        }
        {
            String theRptID;
            theRptID = this.getRptID();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "rptID", theRptID), currentHashCode, theRptID);
        }
        {
            BigInteger theReqTyp;
            theReqTyp = this.getReqTyp();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "reqTyp", theReqTyp), currentHashCode, theReqTyp);
        }
        {
            XMLGregorianCalendar theBizDt;
            theBizDt = this.getBizDt();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "bizDt", theBizDt), currentHashCode, theBizDt);
        }
        {
            SettlSessIDEnumT theSetSesID;
            theSetSesID = this.getSetSesID();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "setSesID", theSetSesID), currentHashCode, theSetSesID);
        }
        {
            String theRptRefID;
            theRptRefID = this.getRptRefID();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "rptRefID", theRptRefID), currentHashCode, theRptRefID);
        }
        {
            BigDecimal theSetPx;
            theSetPx = this.getSetPx();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "setPx", theSetPx), currentHashCode, theSetPx);
        }
        {
            BigDecimal thePriSetPx;
            thePriSetPx = this.getPriSetPx();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "priSetPx", thePriSetPx), currentHashCode, thePriSetPx);
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
            List<PositionQtyBlockT> theQty;
            theQty = (((this.qty!= null)&&(!this.qty.isEmpty()))?this.getQty():null);
            strategy.appendField(locator, this, "qty", buffer, theQty);
        }
        {
            List<InstrmtGrpBlockT> theInst;
            theInst = (((this.inst!= null)&&(!this.inst.isEmpty()))?this.getInst():null);
            strategy.appendField(locator, this, "inst", buffer, theInst);
        }
        {
            String theRptID;
            theRptID = this.getRptID();
            strategy.appendField(locator, this, "rptID", buffer, theRptID);
        }
        {
            BigInteger theReqTyp;
            theReqTyp = this.getReqTyp();
            strategy.appendField(locator, this, "reqTyp", buffer, theReqTyp);
        }
        {
            XMLGregorianCalendar theBizDt;
            theBizDt = this.getBizDt();
            strategy.appendField(locator, this, "bizDt", buffer, theBizDt);
        }
        {
            SettlSessIDEnumT theSetSesID;
            theSetSesID = this.getSetSesID();
            strategy.appendField(locator, this, "setSesID", buffer, theSetSesID);
        }
        {
            String theRptRefID;
            theRptRefID = this.getRptRefID();
            strategy.appendField(locator, this, "rptRefID", buffer, theRptRefID);
        }
        {
            BigDecimal theSetPx;
            theSetPx = this.getSetPx();
            strategy.appendField(locator, this, "setPx", buffer, theSetPx);
        }
        {
            BigDecimal thePriSetPx;
            thePriSetPx = this.getPriSetPx();
            strategy.appendField(locator, this, "priSetPx", buffer, thePriSetPx);
        }
        return buffer;
    }

}
