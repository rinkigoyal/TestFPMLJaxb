//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.01.17 at 02:08:33 AM SGT 
//


package org.fixprotocol.fixml_5_0_sp2;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
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
 * <p>Java class for KxOrderCustomData1_Block_t complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="KxOrderCustomData1_Block_t"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *       &lt;/sequence&gt;
 *       &lt;attGroup ref="{http://www.fixprotocol.org/FIXML-5-0-SP2}KxOrderCustomData1Attributes"/&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "KxOrderCustomData1_Block_t")
public class KxOrderCustomData1BlockT
    implements Equals, HashCode, ToString
{

    @XmlAttribute(name = "OrderTime", required = true)
    protected XMLGregorianCalendar orderTime;
    @XmlAttribute(name = "KxOrderStatus", required = true)
    protected KxOrderStatusEnumT kxOrderStatus;
    @XmlAttribute(name = "KxOrderStatusSym", required = true)
    protected String kxOrderStatusSym;
    @XmlAttribute(name = "KxOrderActive", required = true)
    protected BigInteger kxOrderActive;
    @XmlAttribute(name = "KxOrderCompleted", required = true)
    protected BigInteger kxOrderCompleted;
    @XmlAttribute(name = "CurrentAction", required = true)
    protected KxCurrentActionEnumT currentAction;
    @XmlAttribute(name = "CurrentActionSym", required = true)
    protected String currentActionSym;
    @XmlAttribute(name = "KxId", required = true)
    protected String kxId;
    @XmlAttribute(name = "TradingStatus", required = true)
    protected BigInteger tradingStatus;
    @XmlAttribute(name = "TradingStatusSym", required = true)
    protected String tradingStatusSym;
    @XmlAttribute(name = "RejectReasonSym", required = true)
    protected String rejectReasonSym;

    /**
     * Gets the value of the orderTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOrderTime() {
        return orderTime;
    }

    /**
     * Sets the value of the orderTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOrderTime(XMLGregorianCalendar value) {
        this.orderTime = value;
    }

    /**
     * Gets the value of the kxOrderStatus property.
     * 
     * @return
     *     possible object is
     *     {@link KxOrderStatusEnumT }
     *     
     */
    public KxOrderStatusEnumT getKxOrderStatus() {
        return kxOrderStatus;
    }

    /**
     * Sets the value of the kxOrderStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link KxOrderStatusEnumT }
     *     
     */
    public void setKxOrderStatus(KxOrderStatusEnumT value) {
        this.kxOrderStatus = value;
    }

    /**
     * Gets the value of the kxOrderStatusSym property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKxOrderStatusSym() {
        return kxOrderStatusSym;
    }

    /**
     * Sets the value of the kxOrderStatusSym property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKxOrderStatusSym(String value) {
        this.kxOrderStatusSym = value;
    }

    /**
     * Gets the value of the kxOrderActive property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getKxOrderActive() {
        return kxOrderActive;
    }

    /**
     * Sets the value of the kxOrderActive property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setKxOrderActive(BigInteger value) {
        this.kxOrderActive = value;
    }

    /**
     * Gets the value of the kxOrderCompleted property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getKxOrderCompleted() {
        return kxOrderCompleted;
    }

    /**
     * Sets the value of the kxOrderCompleted property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setKxOrderCompleted(BigInteger value) {
        this.kxOrderCompleted = value;
    }

    /**
     * Gets the value of the currentAction property.
     * 
     * @return
     *     possible object is
     *     {@link KxCurrentActionEnumT }
     *     
     */
    public KxCurrentActionEnumT getCurrentAction() {
        return currentAction;
    }

    /**
     * Sets the value of the currentAction property.
     * 
     * @param value
     *     allowed object is
     *     {@link KxCurrentActionEnumT }
     *     
     */
    public void setCurrentAction(KxCurrentActionEnumT value) {
        this.currentAction = value;
    }

    /**
     * Gets the value of the currentActionSym property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrentActionSym() {
        return currentActionSym;
    }

    /**
     * Sets the value of the currentActionSym property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrentActionSym(String value) {
        this.currentActionSym = value;
    }

    /**
     * Gets the value of the kxId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKxId() {
        return kxId;
    }

    /**
     * Sets the value of the kxId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKxId(String value) {
        this.kxId = value;
    }

    /**
     * Gets the value of the tradingStatus property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTradingStatus() {
        return tradingStatus;
    }

    /**
     * Sets the value of the tradingStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTradingStatus(BigInteger value) {
        this.tradingStatus = value;
    }

    /**
     * Gets the value of the tradingStatusSym property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTradingStatusSym() {
        return tradingStatusSym;
    }

    /**
     * Sets the value of the tradingStatusSym property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTradingStatusSym(String value) {
        this.tradingStatusSym = value;
    }

    /**
     * Gets the value of the rejectReasonSym property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRejectReasonSym() {
        return rejectReasonSym;
    }

    /**
     * Sets the value of the rejectReasonSym property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRejectReasonSym(String value) {
        this.rejectReasonSym = value;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof KxOrderCustomData1BlockT)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final KxOrderCustomData1BlockT that = ((KxOrderCustomData1BlockT) object);
        {
            XMLGregorianCalendar lhsOrderTime;
            lhsOrderTime = this.getOrderTime();
            XMLGregorianCalendar rhsOrderTime;
            rhsOrderTime = that.getOrderTime();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "orderTime", lhsOrderTime), LocatorUtils.property(thatLocator, "orderTime", rhsOrderTime), lhsOrderTime, rhsOrderTime)) {
                return false;
            }
        }
        {
            KxOrderStatusEnumT lhsKxOrderStatus;
            lhsKxOrderStatus = this.getKxOrderStatus();
            KxOrderStatusEnumT rhsKxOrderStatus;
            rhsKxOrderStatus = that.getKxOrderStatus();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "kxOrderStatus", lhsKxOrderStatus), LocatorUtils.property(thatLocator, "kxOrderStatus", rhsKxOrderStatus), lhsKxOrderStatus, rhsKxOrderStatus)) {
                return false;
            }
        }
        {
            String lhsKxOrderStatusSym;
            lhsKxOrderStatusSym = this.getKxOrderStatusSym();
            String rhsKxOrderStatusSym;
            rhsKxOrderStatusSym = that.getKxOrderStatusSym();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "kxOrderStatusSym", lhsKxOrderStatusSym), LocatorUtils.property(thatLocator, "kxOrderStatusSym", rhsKxOrderStatusSym), lhsKxOrderStatusSym, rhsKxOrderStatusSym)) {
                return false;
            }
        }
        {
            BigInteger lhsKxOrderActive;
            lhsKxOrderActive = this.getKxOrderActive();
            BigInteger rhsKxOrderActive;
            rhsKxOrderActive = that.getKxOrderActive();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "kxOrderActive", lhsKxOrderActive), LocatorUtils.property(thatLocator, "kxOrderActive", rhsKxOrderActive), lhsKxOrderActive, rhsKxOrderActive)) {
                return false;
            }
        }
        {
            BigInteger lhsKxOrderCompleted;
            lhsKxOrderCompleted = this.getKxOrderCompleted();
            BigInteger rhsKxOrderCompleted;
            rhsKxOrderCompleted = that.getKxOrderCompleted();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "kxOrderCompleted", lhsKxOrderCompleted), LocatorUtils.property(thatLocator, "kxOrderCompleted", rhsKxOrderCompleted), lhsKxOrderCompleted, rhsKxOrderCompleted)) {
                return false;
            }
        }
        {
            KxCurrentActionEnumT lhsCurrentAction;
            lhsCurrentAction = this.getCurrentAction();
            KxCurrentActionEnumT rhsCurrentAction;
            rhsCurrentAction = that.getCurrentAction();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "currentAction", lhsCurrentAction), LocatorUtils.property(thatLocator, "currentAction", rhsCurrentAction), lhsCurrentAction, rhsCurrentAction)) {
                return false;
            }
        }
        {
            String lhsCurrentActionSym;
            lhsCurrentActionSym = this.getCurrentActionSym();
            String rhsCurrentActionSym;
            rhsCurrentActionSym = that.getCurrentActionSym();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "currentActionSym", lhsCurrentActionSym), LocatorUtils.property(thatLocator, "currentActionSym", rhsCurrentActionSym), lhsCurrentActionSym, rhsCurrentActionSym)) {
                return false;
            }
        }
        {
            String lhsKxId;
            lhsKxId = this.getKxId();
            String rhsKxId;
            rhsKxId = that.getKxId();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "kxId", lhsKxId), LocatorUtils.property(thatLocator, "kxId", rhsKxId), lhsKxId, rhsKxId)) {
                return false;
            }
        }
        {
            BigInteger lhsTradingStatus;
            lhsTradingStatus = this.getTradingStatus();
            BigInteger rhsTradingStatus;
            rhsTradingStatus = that.getTradingStatus();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "tradingStatus", lhsTradingStatus), LocatorUtils.property(thatLocator, "tradingStatus", rhsTradingStatus), lhsTradingStatus, rhsTradingStatus)) {
                return false;
            }
        }
        {
            String lhsTradingStatusSym;
            lhsTradingStatusSym = this.getTradingStatusSym();
            String rhsTradingStatusSym;
            rhsTradingStatusSym = that.getTradingStatusSym();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "tradingStatusSym", lhsTradingStatusSym), LocatorUtils.property(thatLocator, "tradingStatusSym", rhsTradingStatusSym), lhsTradingStatusSym, rhsTradingStatusSym)) {
                return false;
            }
        }
        {
            String lhsRejectReasonSym;
            lhsRejectReasonSym = this.getRejectReasonSym();
            String rhsRejectReasonSym;
            rhsRejectReasonSym = that.getRejectReasonSym();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "rejectReasonSym", lhsRejectReasonSym), LocatorUtils.property(thatLocator, "rejectReasonSym", rhsRejectReasonSym), lhsRejectReasonSym, rhsRejectReasonSym)) {
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
            XMLGregorianCalendar theOrderTime;
            theOrderTime = this.getOrderTime();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "orderTime", theOrderTime), currentHashCode, theOrderTime);
        }
        {
            KxOrderStatusEnumT theKxOrderStatus;
            theKxOrderStatus = this.getKxOrderStatus();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "kxOrderStatus", theKxOrderStatus), currentHashCode, theKxOrderStatus);
        }
        {
            String theKxOrderStatusSym;
            theKxOrderStatusSym = this.getKxOrderStatusSym();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "kxOrderStatusSym", theKxOrderStatusSym), currentHashCode, theKxOrderStatusSym);
        }
        {
            BigInteger theKxOrderActive;
            theKxOrderActive = this.getKxOrderActive();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "kxOrderActive", theKxOrderActive), currentHashCode, theKxOrderActive);
        }
        {
            BigInteger theKxOrderCompleted;
            theKxOrderCompleted = this.getKxOrderCompleted();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "kxOrderCompleted", theKxOrderCompleted), currentHashCode, theKxOrderCompleted);
        }
        {
            KxCurrentActionEnumT theCurrentAction;
            theCurrentAction = this.getCurrentAction();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "currentAction", theCurrentAction), currentHashCode, theCurrentAction);
        }
        {
            String theCurrentActionSym;
            theCurrentActionSym = this.getCurrentActionSym();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "currentActionSym", theCurrentActionSym), currentHashCode, theCurrentActionSym);
        }
        {
            String theKxId;
            theKxId = this.getKxId();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "kxId", theKxId), currentHashCode, theKxId);
        }
        {
            BigInteger theTradingStatus;
            theTradingStatus = this.getTradingStatus();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "tradingStatus", theTradingStatus), currentHashCode, theTradingStatus);
        }
        {
            String theTradingStatusSym;
            theTradingStatusSym = this.getTradingStatusSym();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "tradingStatusSym", theTradingStatusSym), currentHashCode, theTradingStatusSym);
        }
        {
            String theRejectReasonSym;
            theRejectReasonSym = this.getRejectReasonSym();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "rejectReasonSym", theRejectReasonSym), currentHashCode, theRejectReasonSym);
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
            XMLGregorianCalendar theOrderTime;
            theOrderTime = this.getOrderTime();
            strategy.appendField(locator, this, "orderTime", buffer, theOrderTime);
        }
        {
            KxOrderStatusEnumT theKxOrderStatus;
            theKxOrderStatus = this.getKxOrderStatus();
            strategy.appendField(locator, this, "kxOrderStatus", buffer, theKxOrderStatus);
        }
        {
            String theKxOrderStatusSym;
            theKxOrderStatusSym = this.getKxOrderStatusSym();
            strategy.appendField(locator, this, "kxOrderStatusSym", buffer, theKxOrderStatusSym);
        }
        {
            BigInteger theKxOrderActive;
            theKxOrderActive = this.getKxOrderActive();
            strategy.appendField(locator, this, "kxOrderActive", buffer, theKxOrderActive);
        }
        {
            BigInteger theKxOrderCompleted;
            theKxOrderCompleted = this.getKxOrderCompleted();
            strategy.appendField(locator, this, "kxOrderCompleted", buffer, theKxOrderCompleted);
        }
        {
            KxCurrentActionEnumT theCurrentAction;
            theCurrentAction = this.getCurrentAction();
            strategy.appendField(locator, this, "currentAction", buffer, theCurrentAction);
        }
        {
            String theCurrentActionSym;
            theCurrentActionSym = this.getCurrentActionSym();
            strategy.appendField(locator, this, "currentActionSym", buffer, theCurrentActionSym);
        }
        {
            String theKxId;
            theKxId = this.getKxId();
            strategy.appendField(locator, this, "kxId", buffer, theKxId);
        }
        {
            BigInteger theTradingStatus;
            theTradingStatus = this.getTradingStatus();
            strategy.appendField(locator, this, "tradingStatus", buffer, theTradingStatus);
        }
        {
            String theTradingStatusSym;
            theTradingStatusSym = this.getTradingStatusSym();
            strategy.appendField(locator, this, "tradingStatusSym", buffer, theTradingStatusSym);
        }
        {
            String theRejectReasonSym;
            theRejectReasonSym = this.getRejectReasonSym();
            strategy.appendField(locator, this, "rejectReasonSym", buffer, theRejectReasonSym);
        }
        return buffer;
    }

}