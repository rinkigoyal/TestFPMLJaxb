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
 * <p>Java class for TradingSessionRules_Block_t complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TradingSessionRules_Block_t"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;group ref="{http://www.fixprotocol.org/FIXML-5-0-SP2}TradingSessionRulesElements"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attGroup ref="{http://www.fixprotocol.org/FIXML-5-0-SP2}TradingSessionRulesAttributes"/&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TradingSessionRules_Block_t", propOrder = {
    "ordTypRules",
    "tmInForceRules",
    "execInstRules",
    "mtchRules",
    "mdFeedTyps"
})
public class TradingSessionRulesBlockT
    implements Equals, HashCode, ToString
{

    @XmlElement(name = "OrdTypRules")
    protected List<OrdTypeRulesBlockT> ordTypRules;
    @XmlElement(name = "TmInForceRules")
    protected List<TimeInForceRulesBlockT> tmInForceRules;
    @XmlElement(name = "ExecInstRules")
    protected List<ExecInstRulesBlockT> execInstRules;
    @XmlElement(name = "MtchRules")
    protected List<MatchRulesBlockT> mtchRules;
    @XmlElement(name = "MDFeedTyps")
    protected List<MarketDataFeedTypesBlockT> mdFeedTyps;

    /**
     * Gets the value of the ordTypRules property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ordTypRules property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOrdTypRules().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OrdTypeRulesBlockT }
     * 
     * 
     */
    public List<OrdTypeRulesBlockT> getOrdTypRules() {
        if (ordTypRules == null) {
            ordTypRules = new ArrayList<OrdTypeRulesBlockT>();
        }
        return this.ordTypRules;
    }

    /**
     * Gets the value of the tmInForceRules property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tmInForceRules property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTmInForceRules().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TimeInForceRulesBlockT }
     * 
     * 
     */
    public List<TimeInForceRulesBlockT> getTmInForceRules() {
        if (tmInForceRules == null) {
            tmInForceRules = new ArrayList<TimeInForceRulesBlockT>();
        }
        return this.tmInForceRules;
    }

    /**
     * Gets the value of the execInstRules property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the execInstRules property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getExecInstRules().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ExecInstRulesBlockT }
     * 
     * 
     */
    public List<ExecInstRulesBlockT> getExecInstRules() {
        if (execInstRules == null) {
            execInstRules = new ArrayList<ExecInstRulesBlockT>();
        }
        return this.execInstRules;
    }

    /**
     * Gets the value of the mtchRules property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the mtchRules property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMtchRules().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MatchRulesBlockT }
     * 
     * 
     */
    public List<MatchRulesBlockT> getMtchRules() {
        if (mtchRules == null) {
            mtchRules = new ArrayList<MatchRulesBlockT>();
        }
        return this.mtchRules;
    }

    /**
     * Gets the value of the mdFeedTyps property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the mdFeedTyps property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMDFeedTyps().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MarketDataFeedTypesBlockT }
     * 
     * 
     */
    public List<MarketDataFeedTypesBlockT> getMDFeedTyps() {
        if (mdFeedTyps == null) {
            mdFeedTyps = new ArrayList<MarketDataFeedTypesBlockT>();
        }
        return this.mdFeedTyps;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof TradingSessionRulesBlockT)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final TradingSessionRulesBlockT that = ((TradingSessionRulesBlockT) object);
        {
            List<OrdTypeRulesBlockT> lhsOrdTypRules;
            lhsOrdTypRules = (((this.ordTypRules!= null)&&(!this.ordTypRules.isEmpty()))?this.getOrdTypRules():null);
            List<OrdTypeRulesBlockT> rhsOrdTypRules;
            rhsOrdTypRules = (((that.ordTypRules!= null)&&(!that.ordTypRules.isEmpty()))?that.getOrdTypRules():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "ordTypRules", lhsOrdTypRules), LocatorUtils.property(thatLocator, "ordTypRules", rhsOrdTypRules), lhsOrdTypRules, rhsOrdTypRules)) {
                return false;
            }
        }
        {
            List<TimeInForceRulesBlockT> lhsTmInForceRules;
            lhsTmInForceRules = (((this.tmInForceRules!= null)&&(!this.tmInForceRules.isEmpty()))?this.getTmInForceRules():null);
            List<TimeInForceRulesBlockT> rhsTmInForceRules;
            rhsTmInForceRules = (((that.tmInForceRules!= null)&&(!that.tmInForceRules.isEmpty()))?that.getTmInForceRules():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "tmInForceRules", lhsTmInForceRules), LocatorUtils.property(thatLocator, "tmInForceRules", rhsTmInForceRules), lhsTmInForceRules, rhsTmInForceRules)) {
                return false;
            }
        }
        {
            List<ExecInstRulesBlockT> lhsExecInstRules;
            lhsExecInstRules = (((this.execInstRules!= null)&&(!this.execInstRules.isEmpty()))?this.getExecInstRules():null);
            List<ExecInstRulesBlockT> rhsExecInstRules;
            rhsExecInstRules = (((that.execInstRules!= null)&&(!that.execInstRules.isEmpty()))?that.getExecInstRules():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "execInstRules", lhsExecInstRules), LocatorUtils.property(thatLocator, "execInstRules", rhsExecInstRules), lhsExecInstRules, rhsExecInstRules)) {
                return false;
            }
        }
        {
            List<MatchRulesBlockT> lhsMtchRules;
            lhsMtchRules = (((this.mtchRules!= null)&&(!this.mtchRules.isEmpty()))?this.getMtchRules():null);
            List<MatchRulesBlockT> rhsMtchRules;
            rhsMtchRules = (((that.mtchRules!= null)&&(!that.mtchRules.isEmpty()))?that.getMtchRules():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "mtchRules", lhsMtchRules), LocatorUtils.property(thatLocator, "mtchRules", rhsMtchRules), lhsMtchRules, rhsMtchRules)) {
                return false;
            }
        }
        {
            List<MarketDataFeedTypesBlockT> lhsMDFeedTyps;
            lhsMDFeedTyps = (((this.mdFeedTyps!= null)&&(!this.mdFeedTyps.isEmpty()))?this.getMDFeedTyps():null);
            List<MarketDataFeedTypesBlockT> rhsMDFeedTyps;
            rhsMDFeedTyps = (((that.mdFeedTyps!= null)&&(!that.mdFeedTyps.isEmpty()))?that.getMDFeedTyps():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "mdFeedTyps", lhsMDFeedTyps), LocatorUtils.property(thatLocator, "mdFeedTyps", rhsMDFeedTyps), lhsMDFeedTyps, rhsMDFeedTyps)) {
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
            List<OrdTypeRulesBlockT> theOrdTypRules;
            theOrdTypRules = (((this.ordTypRules!= null)&&(!this.ordTypRules.isEmpty()))?this.getOrdTypRules():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "ordTypRules", theOrdTypRules), currentHashCode, theOrdTypRules);
        }
        {
            List<TimeInForceRulesBlockT> theTmInForceRules;
            theTmInForceRules = (((this.tmInForceRules!= null)&&(!this.tmInForceRules.isEmpty()))?this.getTmInForceRules():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "tmInForceRules", theTmInForceRules), currentHashCode, theTmInForceRules);
        }
        {
            List<ExecInstRulesBlockT> theExecInstRules;
            theExecInstRules = (((this.execInstRules!= null)&&(!this.execInstRules.isEmpty()))?this.getExecInstRules():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "execInstRules", theExecInstRules), currentHashCode, theExecInstRules);
        }
        {
            List<MatchRulesBlockT> theMtchRules;
            theMtchRules = (((this.mtchRules!= null)&&(!this.mtchRules.isEmpty()))?this.getMtchRules():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "mtchRules", theMtchRules), currentHashCode, theMtchRules);
        }
        {
            List<MarketDataFeedTypesBlockT> theMDFeedTyps;
            theMDFeedTyps = (((this.mdFeedTyps!= null)&&(!this.mdFeedTyps.isEmpty()))?this.getMDFeedTyps():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "mdFeedTyps", theMDFeedTyps), currentHashCode, theMDFeedTyps);
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
            List<OrdTypeRulesBlockT> theOrdTypRules;
            theOrdTypRules = (((this.ordTypRules!= null)&&(!this.ordTypRules.isEmpty()))?this.getOrdTypRules():null);
            strategy.appendField(locator, this, "ordTypRules", buffer, theOrdTypRules);
        }
        {
            List<TimeInForceRulesBlockT> theTmInForceRules;
            theTmInForceRules = (((this.tmInForceRules!= null)&&(!this.tmInForceRules.isEmpty()))?this.getTmInForceRules():null);
            strategy.appendField(locator, this, "tmInForceRules", buffer, theTmInForceRules);
        }
        {
            List<ExecInstRulesBlockT> theExecInstRules;
            theExecInstRules = (((this.execInstRules!= null)&&(!this.execInstRules.isEmpty()))?this.getExecInstRules():null);
            strategy.appendField(locator, this, "execInstRules", buffer, theExecInstRules);
        }
        {
            List<MatchRulesBlockT> theMtchRules;
            theMtchRules = (((this.mtchRules!= null)&&(!this.mtchRules.isEmpty()))?this.getMtchRules():null);
            strategy.appendField(locator, this, "mtchRules", buffer, theMtchRules);
        }
        {
            List<MarketDataFeedTypesBlockT> theMDFeedTyps;
            theMDFeedTyps = (((this.mdFeedTyps!= null)&&(!this.mdFeedTyps.isEmpty()))?this.getMDFeedTyps():null);
            strategy.appendField(locator, this, "mdFeedTyps", buffer, theMDFeedTyps);
        }
        return buffer;
    }

}
