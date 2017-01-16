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
 * <p>Java class for MarketDataFeedTypes_Block_t complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MarketDataFeedTypes_Block_t"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;group ref="{http://www.fixprotocol.org/FIXML-5-0-SP2}MarketDataFeedTypesElements"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attGroup ref="{http://www.fixprotocol.org/FIXML-5-0-SP2}MarketDataFeedTypesAttributes"/&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MarketDataFeedTypes_Block_t")
public class MarketDataFeedTypesBlockT
    implements Equals, HashCode, ToString
{

    @XmlAttribute(name = "MDFeedTyp")
    protected String mdFeedTyp;
    @XmlAttribute(name = "MktDepth")
    protected BigInteger mktDepth;
    @XmlAttribute(name = "MDBkTyp")
    protected BigInteger mdBkTyp;

    /**
     * Gets the value of the mdFeedTyp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMDFeedTyp() {
        return mdFeedTyp;
    }

    /**
     * Sets the value of the mdFeedTyp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMDFeedTyp(String value) {
        this.mdFeedTyp = value;
    }

    /**
     * Gets the value of the mktDepth property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMktDepth() {
        return mktDepth;
    }

    /**
     * Sets the value of the mktDepth property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMktDepth(BigInteger value) {
        this.mktDepth = value;
    }

    /**
     * Gets the value of the mdBkTyp property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMDBkTyp() {
        return mdBkTyp;
    }

    /**
     * Sets the value of the mdBkTyp property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMDBkTyp(BigInteger value) {
        this.mdBkTyp = value;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof MarketDataFeedTypesBlockT)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final MarketDataFeedTypesBlockT that = ((MarketDataFeedTypesBlockT) object);
        {
            String lhsMDFeedTyp;
            lhsMDFeedTyp = this.getMDFeedTyp();
            String rhsMDFeedTyp;
            rhsMDFeedTyp = that.getMDFeedTyp();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "mdFeedTyp", lhsMDFeedTyp), LocatorUtils.property(thatLocator, "mdFeedTyp", rhsMDFeedTyp), lhsMDFeedTyp, rhsMDFeedTyp)) {
                return false;
            }
        }
        {
            BigInteger lhsMktDepth;
            lhsMktDepth = this.getMktDepth();
            BigInteger rhsMktDepth;
            rhsMktDepth = that.getMktDepth();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "mktDepth", lhsMktDepth), LocatorUtils.property(thatLocator, "mktDepth", rhsMktDepth), lhsMktDepth, rhsMktDepth)) {
                return false;
            }
        }
        {
            BigInteger lhsMDBkTyp;
            lhsMDBkTyp = this.getMDBkTyp();
            BigInteger rhsMDBkTyp;
            rhsMDBkTyp = that.getMDBkTyp();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "mdBkTyp", lhsMDBkTyp), LocatorUtils.property(thatLocator, "mdBkTyp", rhsMDBkTyp), lhsMDBkTyp, rhsMDBkTyp)) {
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
            String theMDFeedTyp;
            theMDFeedTyp = this.getMDFeedTyp();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "mdFeedTyp", theMDFeedTyp), currentHashCode, theMDFeedTyp);
        }
        {
            BigInteger theMktDepth;
            theMktDepth = this.getMktDepth();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "mktDepth", theMktDepth), currentHashCode, theMktDepth);
        }
        {
            BigInteger theMDBkTyp;
            theMDBkTyp = this.getMDBkTyp();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "mdBkTyp", theMDBkTyp), currentHashCode, theMDBkTyp);
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
            String theMDFeedTyp;
            theMDFeedTyp = this.getMDFeedTyp();
            strategy.appendField(locator, this, "mdFeedTyp", buffer, theMDFeedTyp);
        }
        {
            BigInteger theMktDepth;
            theMktDepth = this.getMktDepth();
            strategy.appendField(locator, this, "mktDepth", buffer, theMktDepth);
        }
        {
            BigInteger theMDBkTyp;
            theMDBkTyp = this.getMDBkTyp();
            strategy.appendField(locator, this, "mdBkTyp", buffer, theMDBkTyp);
        }
        return buffer;
    }

}
