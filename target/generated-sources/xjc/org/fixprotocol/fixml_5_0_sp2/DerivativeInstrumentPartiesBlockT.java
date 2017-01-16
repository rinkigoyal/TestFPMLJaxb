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
 * <p>Java class for DerivativeInstrumentParties_Block_t complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DerivativeInstrumentParties_Block_t"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;group ref="{http://www.fixprotocol.org/FIXML-5-0-SP2}DerivativeInstrumentPartiesElements"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attGroup ref="{http://www.fixprotocol.org/FIXML-5-0-SP2}DerivativeInstrumentPartiesAttributes"/&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DerivativeInstrumentParties_Block_t", propOrder = {
    "sub"
})
public class DerivativeInstrumentPartiesBlockT
    implements Equals, HashCode, ToString
{

    @XmlElement(name = "Sub")
    protected List<DerivativeInstrumentPartySubIDsGrpBlockT> sub;
    @XmlAttribute(name = "ID")
    protected String id;
    @XmlAttribute(name = "Src")
    protected String src;
    @XmlAttribute(name = "R")
    protected BigInteger r;

    /**
     * Gets the value of the sub property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the sub property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSub().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DerivativeInstrumentPartySubIDsGrpBlockT }
     * 
     * 
     */
    public List<DerivativeInstrumentPartySubIDsGrpBlockT> getSub() {
        if (sub == null) {
            sub = new ArrayList<DerivativeInstrumentPartySubIDsGrpBlockT>();
        }
        return this.sub;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getID() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setID(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the src property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSrc() {
        return src;
    }

    /**
     * Sets the value of the src property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSrc(String value) {
        this.src = value;
    }

    /**
     * Gets the value of the r property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getR() {
        return r;
    }

    /**
     * Sets the value of the r property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setR(BigInteger value) {
        this.r = value;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof DerivativeInstrumentPartiesBlockT)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final DerivativeInstrumentPartiesBlockT that = ((DerivativeInstrumentPartiesBlockT) object);
        {
            List<DerivativeInstrumentPartySubIDsGrpBlockT> lhsSub;
            lhsSub = (((this.sub!= null)&&(!this.sub.isEmpty()))?this.getSub():null);
            List<DerivativeInstrumentPartySubIDsGrpBlockT> rhsSub;
            rhsSub = (((that.sub!= null)&&(!that.sub.isEmpty()))?that.getSub():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "sub", lhsSub), LocatorUtils.property(thatLocator, "sub", rhsSub), lhsSub, rhsSub)) {
                return false;
            }
        }
        {
            String lhsID;
            lhsID = this.getID();
            String rhsID;
            rhsID = that.getID();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "id", lhsID), LocatorUtils.property(thatLocator, "id", rhsID), lhsID, rhsID)) {
                return false;
            }
        }
        {
            String lhsSrc;
            lhsSrc = this.getSrc();
            String rhsSrc;
            rhsSrc = that.getSrc();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "src", lhsSrc), LocatorUtils.property(thatLocator, "src", rhsSrc), lhsSrc, rhsSrc)) {
                return false;
            }
        }
        {
            BigInteger lhsR;
            lhsR = this.getR();
            BigInteger rhsR;
            rhsR = that.getR();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "r", lhsR), LocatorUtils.property(thatLocator, "r", rhsR), lhsR, rhsR)) {
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
            List<DerivativeInstrumentPartySubIDsGrpBlockT> theSub;
            theSub = (((this.sub!= null)&&(!this.sub.isEmpty()))?this.getSub():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "sub", theSub), currentHashCode, theSub);
        }
        {
            String theID;
            theID = this.getID();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "id", theID), currentHashCode, theID);
        }
        {
            String theSrc;
            theSrc = this.getSrc();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "src", theSrc), currentHashCode, theSrc);
        }
        {
            BigInteger theR;
            theR = this.getR();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "r", theR), currentHashCode, theR);
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
            List<DerivativeInstrumentPartySubIDsGrpBlockT> theSub;
            theSub = (((this.sub!= null)&&(!this.sub.isEmpty()))?this.getSub():null);
            strategy.appendField(locator, this, "sub", buffer, theSub);
        }
        {
            String theID;
            theID = this.getID();
            strategy.appendField(locator, this, "id", buffer, theID);
        }
        {
            String theSrc;
            theSrc = this.getSrc();
            strategy.appendField(locator, this, "src", buffer, theSrc);
        }
        {
            BigInteger theR;
            theR = this.getR();
            strategy.appendField(locator, this, "r", buffer, theR);
        }
        return buffer;
    }

}
