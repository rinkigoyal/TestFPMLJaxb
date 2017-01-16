//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.01.14 at 04:50:28 PM SGT 
//


package org.fixprotocol.fixml_5_0_sp2.metadata;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
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
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;attribute name="Protocol" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="Tag" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" /&gt;
 *       &lt;attribute name="MsgID" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" /&gt;
 *       &lt;attribute name="Type" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="ComponentType" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="AbbrName" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="Section" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="Category" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="CategoryAbbrName" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="UsesEnumsFromTag" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "Xref")
public class Xref
    implements Equals, HashCode, ToString
{

    @XmlAttribute(name = "Protocol")
    protected String protocol;
    @XmlAttribute(name = "name")
    protected String name;
    @XmlAttribute(name = "Tag")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger tag;
    @XmlAttribute(name = "MsgID")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger msgID;
    @XmlAttribute(name = "Type")
    protected String type;
    @XmlAttribute(name = "ComponentType")
    protected String componentType;
    @XmlAttribute(name = "AbbrName")
    protected String abbrName;
    @XmlAttribute(name = "Section")
    protected String section;
    @XmlAttribute(name = "Category")
    protected String category;
    @XmlAttribute(name = "CategoryAbbrName")
    protected String categoryAbbrName;
    @XmlAttribute(name = "UsesEnumsFromTag")
    protected String usesEnumsFromTag;

    /**
     * Gets the value of the protocol property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProtocol() {
        return protocol;
    }

    /**
     * Sets the value of the protocol property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProtocol(String value) {
        this.protocol = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the tag property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTag() {
        return tag;
    }

    /**
     * Sets the value of the tag property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTag(BigInteger value) {
        this.tag = value;
    }

    /**
     * Gets the value of the msgID property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMsgID() {
        return msgID;
    }

    /**
     * Sets the value of the msgID property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMsgID(BigInteger value) {
        this.msgID = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setType(String value) {
        this.type = value;
    }

    /**
     * Gets the value of the componentType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComponentType() {
        return componentType;
    }

    /**
     * Sets the value of the componentType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComponentType(String value) {
        this.componentType = value;
    }

    /**
     * Gets the value of the abbrName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAbbrName() {
        return abbrName;
    }

    /**
     * Sets the value of the abbrName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAbbrName(String value) {
        this.abbrName = value;
    }

    /**
     * Gets the value of the section property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSection() {
        return section;
    }

    /**
     * Sets the value of the section property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSection(String value) {
        this.section = value;
    }

    /**
     * Gets the value of the category property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCategory() {
        return category;
    }

    /**
     * Sets the value of the category property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCategory(String value) {
        this.category = value;
    }

    /**
     * Gets the value of the categoryAbbrName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCategoryAbbrName() {
        return categoryAbbrName;
    }

    /**
     * Sets the value of the categoryAbbrName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCategoryAbbrName(String value) {
        this.categoryAbbrName = value;
    }

    /**
     * Gets the value of the usesEnumsFromTag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUsesEnumsFromTag() {
        return usesEnumsFromTag;
    }

    /**
     * Sets the value of the usesEnumsFromTag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUsesEnumsFromTag(String value) {
        this.usesEnumsFromTag = value;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof Xref)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final Xref that = ((Xref) object);
        {
            String lhsProtocol;
            lhsProtocol = this.getProtocol();
            String rhsProtocol;
            rhsProtocol = that.getProtocol();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "protocol", lhsProtocol), LocatorUtils.property(thatLocator, "protocol", rhsProtocol), lhsProtocol, rhsProtocol)) {
                return false;
            }
        }
        {
            String lhsName;
            lhsName = this.getName();
            String rhsName;
            rhsName = that.getName();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "name", lhsName), LocatorUtils.property(thatLocator, "name", rhsName), lhsName, rhsName)) {
                return false;
            }
        }
        {
            BigInteger lhsTag;
            lhsTag = this.getTag();
            BigInteger rhsTag;
            rhsTag = that.getTag();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "tag", lhsTag), LocatorUtils.property(thatLocator, "tag", rhsTag), lhsTag, rhsTag)) {
                return false;
            }
        }
        {
            BigInteger lhsMsgID;
            lhsMsgID = this.getMsgID();
            BigInteger rhsMsgID;
            rhsMsgID = that.getMsgID();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "msgID", lhsMsgID), LocatorUtils.property(thatLocator, "msgID", rhsMsgID), lhsMsgID, rhsMsgID)) {
                return false;
            }
        }
        {
            String lhsType;
            lhsType = this.getType();
            String rhsType;
            rhsType = that.getType();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "type", lhsType), LocatorUtils.property(thatLocator, "type", rhsType), lhsType, rhsType)) {
                return false;
            }
        }
        {
            String lhsComponentType;
            lhsComponentType = this.getComponentType();
            String rhsComponentType;
            rhsComponentType = that.getComponentType();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "componentType", lhsComponentType), LocatorUtils.property(thatLocator, "componentType", rhsComponentType), lhsComponentType, rhsComponentType)) {
                return false;
            }
        }
        {
            String lhsAbbrName;
            lhsAbbrName = this.getAbbrName();
            String rhsAbbrName;
            rhsAbbrName = that.getAbbrName();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "abbrName", lhsAbbrName), LocatorUtils.property(thatLocator, "abbrName", rhsAbbrName), lhsAbbrName, rhsAbbrName)) {
                return false;
            }
        }
        {
            String lhsSection;
            lhsSection = this.getSection();
            String rhsSection;
            rhsSection = that.getSection();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "section", lhsSection), LocatorUtils.property(thatLocator, "section", rhsSection), lhsSection, rhsSection)) {
                return false;
            }
        }
        {
            String lhsCategory;
            lhsCategory = this.getCategory();
            String rhsCategory;
            rhsCategory = that.getCategory();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "category", lhsCategory), LocatorUtils.property(thatLocator, "category", rhsCategory), lhsCategory, rhsCategory)) {
                return false;
            }
        }
        {
            String lhsCategoryAbbrName;
            lhsCategoryAbbrName = this.getCategoryAbbrName();
            String rhsCategoryAbbrName;
            rhsCategoryAbbrName = that.getCategoryAbbrName();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "categoryAbbrName", lhsCategoryAbbrName), LocatorUtils.property(thatLocator, "categoryAbbrName", rhsCategoryAbbrName), lhsCategoryAbbrName, rhsCategoryAbbrName)) {
                return false;
            }
        }
        {
            String lhsUsesEnumsFromTag;
            lhsUsesEnumsFromTag = this.getUsesEnumsFromTag();
            String rhsUsesEnumsFromTag;
            rhsUsesEnumsFromTag = that.getUsesEnumsFromTag();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "usesEnumsFromTag", lhsUsesEnumsFromTag), LocatorUtils.property(thatLocator, "usesEnumsFromTag", rhsUsesEnumsFromTag), lhsUsesEnumsFromTag, rhsUsesEnumsFromTag)) {
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
            String theProtocol;
            theProtocol = this.getProtocol();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "protocol", theProtocol), currentHashCode, theProtocol);
        }
        {
            String theName;
            theName = this.getName();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "name", theName), currentHashCode, theName);
        }
        {
            BigInteger theTag;
            theTag = this.getTag();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "tag", theTag), currentHashCode, theTag);
        }
        {
            BigInteger theMsgID;
            theMsgID = this.getMsgID();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "msgID", theMsgID), currentHashCode, theMsgID);
        }
        {
            String theType;
            theType = this.getType();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "type", theType), currentHashCode, theType);
        }
        {
            String theComponentType;
            theComponentType = this.getComponentType();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "componentType", theComponentType), currentHashCode, theComponentType);
        }
        {
            String theAbbrName;
            theAbbrName = this.getAbbrName();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "abbrName", theAbbrName), currentHashCode, theAbbrName);
        }
        {
            String theSection;
            theSection = this.getSection();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "section", theSection), currentHashCode, theSection);
        }
        {
            String theCategory;
            theCategory = this.getCategory();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "category", theCategory), currentHashCode, theCategory);
        }
        {
            String theCategoryAbbrName;
            theCategoryAbbrName = this.getCategoryAbbrName();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "categoryAbbrName", theCategoryAbbrName), currentHashCode, theCategoryAbbrName);
        }
        {
            String theUsesEnumsFromTag;
            theUsesEnumsFromTag = this.getUsesEnumsFromTag();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "usesEnumsFromTag", theUsesEnumsFromTag), currentHashCode, theUsesEnumsFromTag);
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
            String theProtocol;
            theProtocol = this.getProtocol();
            strategy.appendField(locator, this, "protocol", buffer, theProtocol);
        }
        {
            String theName;
            theName = this.getName();
            strategy.appendField(locator, this, "name", buffer, theName);
        }
        {
            BigInteger theTag;
            theTag = this.getTag();
            strategy.appendField(locator, this, "tag", buffer, theTag);
        }
        {
            BigInteger theMsgID;
            theMsgID = this.getMsgID();
            strategy.appendField(locator, this, "msgID", buffer, theMsgID);
        }
        {
            String theType;
            theType = this.getType();
            strategy.appendField(locator, this, "type", buffer, theType);
        }
        {
            String theComponentType;
            theComponentType = this.getComponentType();
            strategy.appendField(locator, this, "componentType", buffer, theComponentType);
        }
        {
            String theAbbrName;
            theAbbrName = this.getAbbrName();
            strategy.appendField(locator, this, "abbrName", buffer, theAbbrName);
        }
        {
            String theSection;
            theSection = this.getSection();
            strategy.appendField(locator, this, "section", buffer, theSection);
        }
        {
            String theCategory;
            theCategory = this.getCategory();
            strategy.appendField(locator, this, "category", buffer, theCategory);
        }
        {
            String theCategoryAbbrName;
            theCategoryAbbrName = this.getCategoryAbbrName();
            strategy.appendField(locator, this, "categoryAbbrName", buffer, theCategoryAbbrName);
        }
        {
            String theUsesEnumsFromTag;
            theUsesEnumsFromTag = this.getUsesEnumsFromTag();
            strategy.appendField(locator, this, "usesEnumsFromTag", buffer, theUsesEnumsFromTag);
        }
        return buffer;
    }

}