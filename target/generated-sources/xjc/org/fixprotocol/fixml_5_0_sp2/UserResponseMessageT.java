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
 * UserResponse can be found in Volume 1 of the
 * 						specification
 * 
 * <p>Java class for UserResponse_message_t complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UserResponse_message_t"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.fixprotocol.org/FIXML-5-0-SP2}Abstract_message_t"&gt;
 *       &lt;sequence&gt;
 *         &lt;group ref="{http://www.fixprotocol.org/FIXML-5-0-SP2}UserResponseElements"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attGroup ref="{http://www.fixprotocol.org/FIXML-5-0-SP2}UserResponseAttributes"/&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UserResponse_message_t")
public class UserResponseMessageT
    extends AbstractMessageT
    implements Equals, HashCode, ToString
{

    @XmlAttribute(name = "UserReqID", required = true)
    protected String userReqID;
    @XmlAttribute(name = "Username", required = true)
    protected String username;
    @XmlAttribute(name = "UserStat")
    protected BigInteger userStat;
    @XmlAttribute(name = "UserStatText")
    protected String userStatText;

    /**
     * Gets the value of the userReqID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserReqID() {
        return userReqID;
    }

    /**
     * Sets the value of the userReqID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserReqID(String value) {
        this.userReqID = value;
    }

    /**
     * Gets the value of the username property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUsername() {
        return username;
    }

    /**
     * Sets the value of the username property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUsername(String value) {
        this.username = value;
    }

    /**
     * Gets the value of the userStat property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getUserStat() {
        return userStat;
    }

    /**
     * Sets the value of the userStat property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setUserStat(BigInteger value) {
        this.userStat = value;
    }

    /**
     * Gets the value of the userStatText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserStatText() {
        return userStatText;
    }

    /**
     * Sets the value of the userStatText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserStatText(String value) {
        this.userStatText = value;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof UserResponseMessageT)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        if (!super.equals(thisLocator, thatLocator, object, strategy)) {
            return false;
        }
        final UserResponseMessageT that = ((UserResponseMessageT) object);
        {
            String lhsUserReqID;
            lhsUserReqID = this.getUserReqID();
            String rhsUserReqID;
            rhsUserReqID = that.getUserReqID();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "userReqID", lhsUserReqID), LocatorUtils.property(thatLocator, "userReqID", rhsUserReqID), lhsUserReqID, rhsUserReqID)) {
                return false;
            }
        }
        {
            String lhsUsername;
            lhsUsername = this.getUsername();
            String rhsUsername;
            rhsUsername = that.getUsername();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "username", lhsUsername), LocatorUtils.property(thatLocator, "username", rhsUsername), lhsUsername, rhsUsername)) {
                return false;
            }
        }
        {
            BigInteger lhsUserStat;
            lhsUserStat = this.getUserStat();
            BigInteger rhsUserStat;
            rhsUserStat = that.getUserStat();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "userStat", lhsUserStat), LocatorUtils.property(thatLocator, "userStat", rhsUserStat), lhsUserStat, rhsUserStat)) {
                return false;
            }
        }
        {
            String lhsUserStatText;
            lhsUserStatText = this.getUserStatText();
            String rhsUserStatText;
            rhsUserStatText = that.getUserStatText();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "userStatText", lhsUserStatText), LocatorUtils.property(thatLocator, "userStatText", rhsUserStatText), lhsUserStatText, rhsUserStatText)) {
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
            String theUserReqID;
            theUserReqID = this.getUserReqID();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "userReqID", theUserReqID), currentHashCode, theUserReqID);
        }
        {
            String theUsername;
            theUsername = this.getUsername();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "username", theUsername), currentHashCode, theUsername);
        }
        {
            BigInteger theUserStat;
            theUserStat = this.getUserStat();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "userStat", theUserStat), currentHashCode, theUserStat);
        }
        {
            String theUserStatText;
            theUserStatText = this.getUserStatText();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "userStatText", theUserStatText), currentHashCode, theUserStatText);
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
            String theUserReqID;
            theUserReqID = this.getUserReqID();
            strategy.appendField(locator, this, "userReqID", buffer, theUserReqID);
        }
        {
            String theUsername;
            theUsername = this.getUsername();
            strategy.appendField(locator, this, "username", buffer, theUsername);
        }
        {
            BigInteger theUserStat;
            theUserStat = this.getUserStat();
            strategy.appendField(locator, this, "userStat", buffer, theUserStat);
        }
        {
            String theUserStatText;
            theUserStatText = this.getUserStatText();
            strategy.appendField(locator, this, "userStatText", buffer, theUserStatText);
        }
        return buffer;
    }

}
