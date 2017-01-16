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
 * ConfirmationRequest can be found in Volume 5 of the
 * 						specification
 * 
 * <p>Java class for ConfirmationRequest_message_t complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ConfirmationRequest_message_t"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.fixprotocol.org/FIXML-5-0-SP2}Abstract_message_t"&gt;
 *       &lt;sequence&gt;
 *         &lt;group ref="{http://www.fixprotocol.org/FIXML-5-0-SP2}ConfirmationRequestElements"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attGroup ref="{http://www.fixprotocol.org/FIXML-5-0-SP2}ConfirmationRequestAttributes"/&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConfirmationRequest_message_t", propOrder = {
    "ordAlloc"
})
public class ConfirmationRequestMessageT
    extends AbstractMessageT
    implements Equals, HashCode, ToString
{

    @XmlElement(name = "OrdAlloc")
    protected List<OrdAllocGrpBlockT> ordAlloc;
    @XmlAttribute(name = "CnfmReqID", required = true)
    protected String cnfmReqID;
    @XmlAttribute(name = "CnfmTyp", required = true)
    protected BigInteger cnfmTyp;
    @XmlAttribute(name = "AllocID")
    protected String allocID;
    @XmlAttribute(name = "AllocID2")
    protected String allocID2;
    @XmlAttribute(name = "IndAllocID")
    protected String indAllocID;
    @XmlAttribute(name = "TxnTm", required = true)
    protected XMLGregorianCalendar txnTm;
    @XmlAttribute(name = "Acct")
    protected String acct;
    @XmlAttribute(name = "ActIDSrc")
    protected BigInteger actIDSrc;
    @XmlAttribute(name = "AcctTyp")
    protected BigInteger acctTyp;
    @XmlAttribute(name = "Txt")
    protected String txt;
    @XmlAttribute(name = "EncTxtLen")
    protected BigInteger encTxtLen;
    @XmlAttribute(name = "EncTxt")
    protected String encTxt;

    /**
     * Gets the value of the ordAlloc property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ordAlloc property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOrdAlloc().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OrdAllocGrpBlockT }
     * 
     * 
     */
    public List<OrdAllocGrpBlockT> getOrdAlloc() {
        if (ordAlloc == null) {
            ordAlloc = new ArrayList<OrdAllocGrpBlockT>();
        }
        return this.ordAlloc;
    }

    /**
     * Gets the value of the cnfmReqID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCnfmReqID() {
        return cnfmReqID;
    }

    /**
     * Sets the value of the cnfmReqID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCnfmReqID(String value) {
        this.cnfmReqID = value;
    }

    /**
     * Gets the value of the cnfmTyp property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getCnfmTyp() {
        return cnfmTyp;
    }

    /**
     * Sets the value of the cnfmTyp property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setCnfmTyp(BigInteger value) {
        this.cnfmTyp = value;
    }

    /**
     * Gets the value of the allocID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAllocID() {
        return allocID;
    }

    /**
     * Sets the value of the allocID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAllocID(String value) {
        this.allocID = value;
    }

    /**
     * Gets the value of the allocID2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAllocID2() {
        return allocID2;
    }

    /**
     * Sets the value of the allocID2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAllocID2(String value) {
        this.allocID2 = value;
    }

    /**
     * Gets the value of the indAllocID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIndAllocID() {
        return indAllocID;
    }

    /**
     * Sets the value of the indAllocID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIndAllocID(String value) {
        this.indAllocID = value;
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
     * Gets the value of the acct property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcct() {
        return acct;
    }

    /**
     * Sets the value of the acct property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAcct(String value) {
        this.acct = value;
    }

    /**
     * Gets the value of the actIDSrc property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getActIDSrc() {
        return actIDSrc;
    }

    /**
     * Sets the value of the actIDSrc property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setActIDSrc(BigInteger value) {
        this.actIDSrc = value;
    }

    /**
     * Gets the value of the acctTyp property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getAcctTyp() {
        return acctTyp;
    }

    /**
     * Sets the value of the acctTyp property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setAcctTyp(BigInteger value) {
        this.acctTyp = value;
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
        if (!(object instanceof ConfirmationRequestMessageT)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        if (!super.equals(thisLocator, thatLocator, object, strategy)) {
            return false;
        }
        final ConfirmationRequestMessageT that = ((ConfirmationRequestMessageT) object);
        {
            List<OrdAllocGrpBlockT> lhsOrdAlloc;
            lhsOrdAlloc = (((this.ordAlloc!= null)&&(!this.ordAlloc.isEmpty()))?this.getOrdAlloc():null);
            List<OrdAllocGrpBlockT> rhsOrdAlloc;
            rhsOrdAlloc = (((that.ordAlloc!= null)&&(!that.ordAlloc.isEmpty()))?that.getOrdAlloc():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "ordAlloc", lhsOrdAlloc), LocatorUtils.property(thatLocator, "ordAlloc", rhsOrdAlloc), lhsOrdAlloc, rhsOrdAlloc)) {
                return false;
            }
        }
        {
            String lhsCnfmReqID;
            lhsCnfmReqID = this.getCnfmReqID();
            String rhsCnfmReqID;
            rhsCnfmReqID = that.getCnfmReqID();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "cnfmReqID", lhsCnfmReqID), LocatorUtils.property(thatLocator, "cnfmReqID", rhsCnfmReqID), lhsCnfmReqID, rhsCnfmReqID)) {
                return false;
            }
        }
        {
            BigInteger lhsCnfmTyp;
            lhsCnfmTyp = this.getCnfmTyp();
            BigInteger rhsCnfmTyp;
            rhsCnfmTyp = that.getCnfmTyp();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "cnfmTyp", lhsCnfmTyp), LocatorUtils.property(thatLocator, "cnfmTyp", rhsCnfmTyp), lhsCnfmTyp, rhsCnfmTyp)) {
                return false;
            }
        }
        {
            String lhsAllocID;
            lhsAllocID = this.getAllocID();
            String rhsAllocID;
            rhsAllocID = that.getAllocID();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "allocID", lhsAllocID), LocatorUtils.property(thatLocator, "allocID", rhsAllocID), lhsAllocID, rhsAllocID)) {
                return false;
            }
        }
        {
            String lhsAllocID2;
            lhsAllocID2 = this.getAllocID2();
            String rhsAllocID2;
            rhsAllocID2 = that.getAllocID2();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "allocID2", lhsAllocID2), LocatorUtils.property(thatLocator, "allocID2", rhsAllocID2), lhsAllocID2, rhsAllocID2)) {
                return false;
            }
        }
        {
            String lhsIndAllocID;
            lhsIndAllocID = this.getIndAllocID();
            String rhsIndAllocID;
            rhsIndAllocID = that.getIndAllocID();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "indAllocID", lhsIndAllocID), LocatorUtils.property(thatLocator, "indAllocID", rhsIndAllocID), lhsIndAllocID, rhsIndAllocID)) {
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
            String lhsAcct;
            lhsAcct = this.getAcct();
            String rhsAcct;
            rhsAcct = that.getAcct();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "acct", lhsAcct), LocatorUtils.property(thatLocator, "acct", rhsAcct), lhsAcct, rhsAcct)) {
                return false;
            }
        }
        {
            BigInteger lhsActIDSrc;
            lhsActIDSrc = this.getActIDSrc();
            BigInteger rhsActIDSrc;
            rhsActIDSrc = that.getActIDSrc();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "actIDSrc", lhsActIDSrc), LocatorUtils.property(thatLocator, "actIDSrc", rhsActIDSrc), lhsActIDSrc, rhsActIDSrc)) {
                return false;
            }
        }
        {
            BigInteger lhsAcctTyp;
            lhsAcctTyp = this.getAcctTyp();
            BigInteger rhsAcctTyp;
            rhsAcctTyp = that.getAcctTyp();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "acctTyp", lhsAcctTyp), LocatorUtils.property(thatLocator, "acctTyp", rhsAcctTyp), lhsAcctTyp, rhsAcctTyp)) {
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
        int currentHashCode = super.hashCode(locator, strategy);
        {
            List<OrdAllocGrpBlockT> theOrdAlloc;
            theOrdAlloc = (((this.ordAlloc!= null)&&(!this.ordAlloc.isEmpty()))?this.getOrdAlloc():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "ordAlloc", theOrdAlloc), currentHashCode, theOrdAlloc);
        }
        {
            String theCnfmReqID;
            theCnfmReqID = this.getCnfmReqID();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "cnfmReqID", theCnfmReqID), currentHashCode, theCnfmReqID);
        }
        {
            BigInteger theCnfmTyp;
            theCnfmTyp = this.getCnfmTyp();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "cnfmTyp", theCnfmTyp), currentHashCode, theCnfmTyp);
        }
        {
            String theAllocID;
            theAllocID = this.getAllocID();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "allocID", theAllocID), currentHashCode, theAllocID);
        }
        {
            String theAllocID2;
            theAllocID2 = this.getAllocID2();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "allocID2", theAllocID2), currentHashCode, theAllocID2);
        }
        {
            String theIndAllocID;
            theIndAllocID = this.getIndAllocID();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "indAllocID", theIndAllocID), currentHashCode, theIndAllocID);
        }
        {
            XMLGregorianCalendar theTxnTm;
            theTxnTm = this.getTxnTm();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "txnTm", theTxnTm), currentHashCode, theTxnTm);
        }
        {
            String theAcct;
            theAcct = this.getAcct();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "acct", theAcct), currentHashCode, theAcct);
        }
        {
            BigInteger theActIDSrc;
            theActIDSrc = this.getActIDSrc();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "actIDSrc", theActIDSrc), currentHashCode, theActIDSrc);
        }
        {
            BigInteger theAcctTyp;
            theAcctTyp = this.getAcctTyp();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "acctTyp", theAcctTyp), currentHashCode, theAcctTyp);
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
        super.appendFields(locator, buffer, strategy);
        {
            List<OrdAllocGrpBlockT> theOrdAlloc;
            theOrdAlloc = (((this.ordAlloc!= null)&&(!this.ordAlloc.isEmpty()))?this.getOrdAlloc():null);
            strategy.appendField(locator, this, "ordAlloc", buffer, theOrdAlloc);
        }
        {
            String theCnfmReqID;
            theCnfmReqID = this.getCnfmReqID();
            strategy.appendField(locator, this, "cnfmReqID", buffer, theCnfmReqID);
        }
        {
            BigInteger theCnfmTyp;
            theCnfmTyp = this.getCnfmTyp();
            strategy.appendField(locator, this, "cnfmTyp", buffer, theCnfmTyp);
        }
        {
            String theAllocID;
            theAllocID = this.getAllocID();
            strategy.appendField(locator, this, "allocID", buffer, theAllocID);
        }
        {
            String theAllocID2;
            theAllocID2 = this.getAllocID2();
            strategy.appendField(locator, this, "allocID2", buffer, theAllocID2);
        }
        {
            String theIndAllocID;
            theIndAllocID = this.getIndAllocID();
            strategy.appendField(locator, this, "indAllocID", buffer, theIndAllocID);
        }
        {
            XMLGregorianCalendar theTxnTm;
            theTxnTm = this.getTxnTm();
            strategy.appendField(locator, this, "txnTm", buffer, theTxnTm);
        }
        {
            String theAcct;
            theAcct = this.getAcct();
            strategy.appendField(locator, this, "acct", buffer, theAcct);
        }
        {
            BigInteger theActIDSrc;
            theActIDSrc = this.getActIDSrc();
            strategy.appendField(locator, this, "actIDSrc", buffer, theActIDSrc);
        }
        {
            BigInteger theAcctTyp;
            theAcctTyp = this.getAcctTyp();
            strategy.appendField(locator, this, "acctTyp", buffer, theAcctTyp);
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