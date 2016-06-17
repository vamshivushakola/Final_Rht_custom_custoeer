
package com.ebay.api;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for RecurringPaymentsSummaryType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RecurringPaymentsSummaryType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="NextBillingDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="NumberCyclesCompleted" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="NumberCyclesRemaining" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutstandingBalance" type="{urn:ebay:apis:CoreComponentTypes}BasicAmountType"/>
 *         &lt;element name="FailedPaymentCount" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="LastPaymentDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="LastPaymentAmount" type="{urn:ebay:apis:CoreComponentTypes}BasicAmountType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RecurringPaymentsSummaryType", propOrder = {
    "nextBillingDate",
    "numberCyclesCompleted",
    "numberCyclesRemaining",
    "outstandingBalance",
    "failedPaymentCount",
    "lastPaymentDate",
    "lastPaymentAmount"
})
public class RecurringPaymentsSummaryType {

    @XmlElement(name = "NextBillingDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar nextBillingDate;
    @XmlElement(name = "NumberCyclesCompleted")
    protected int numberCyclesCompleted;
    @XmlElement(name = "NumberCyclesRemaining")
    protected int numberCyclesRemaining;
    @XmlElement(name = "OutstandingBalance", required = true)
    protected BasicAmountType outstandingBalance;
    @XmlElement(name = "FailedPaymentCount")
    protected int failedPaymentCount;
    @XmlElement(name = "LastPaymentDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar lastPaymentDate;
    @XmlElement(name = "LastPaymentAmount")
    protected BasicAmountType lastPaymentAmount;

    /**
     * Gets the value of the nextBillingDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getNextBillingDate() {
        return nextBillingDate;
    }

    /**
     * Sets the value of the nextBillingDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setNextBillingDate(XMLGregorianCalendar value) {
        this.nextBillingDate = value;
    }

    /**
     * Gets the value of the numberCyclesCompleted property.
     * 
     */
    public int getNumberCyclesCompleted() {
        return numberCyclesCompleted;
    }

    /**
     * Sets the value of the numberCyclesCompleted property.
     * 
     */
    public void setNumberCyclesCompleted(int value) {
        this.numberCyclesCompleted = value;
    }

    /**
     * Gets the value of the numberCyclesRemaining property.
     * 
     */
    public int getNumberCyclesRemaining() {
        return numberCyclesRemaining;
    }

    /**
     * Sets the value of the numberCyclesRemaining property.
     * 
     */
    public void setNumberCyclesRemaining(int value) {
        this.numberCyclesRemaining = value;
    }

    /**
     * Gets the value of the outstandingBalance property.
     * 
     * @return
     *     possible object is
     *     {@link BasicAmountType }
     *     
     */
    public BasicAmountType getOutstandingBalance() {
        return outstandingBalance;
    }

    /**
     * Sets the value of the outstandingBalance property.
     * 
     * @param value
     *     allowed object is
     *     {@link BasicAmountType }
     *     
     */
    public void setOutstandingBalance(BasicAmountType value) {
        this.outstandingBalance = value;
    }

    /**
     * Gets the value of the failedPaymentCount property.
     * 
     */
    public int getFailedPaymentCount() {
        return failedPaymentCount;
    }

    /**
     * Sets the value of the failedPaymentCount property.
     * 
     */
    public void setFailedPaymentCount(int value) {
        this.failedPaymentCount = value;
    }

    /**
     * Gets the value of the lastPaymentDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLastPaymentDate() {
        return lastPaymentDate;
    }

    /**
     * Sets the value of the lastPaymentDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLastPaymentDate(XMLGregorianCalendar value) {
        this.lastPaymentDate = value;
    }

    /**
     * Gets the value of the lastPaymentAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BasicAmountType }
     *     
     */
    public BasicAmountType getLastPaymentAmount() {
        return lastPaymentAmount;
    }

    /**
     * Sets the value of the lastPaymentAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BasicAmountType }
     *     
     */
    public void setLastPaymentAmount(BasicAmountType value) {
        this.lastPaymentAmount = value;
    }

}