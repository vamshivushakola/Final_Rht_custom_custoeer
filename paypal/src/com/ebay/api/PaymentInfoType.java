
package com.ebay.api;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * 
 * 				PaymentInfoType 
 * 				Payment information.
 * 			
 * 
 * <p>Java class for PaymentInfoType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PaymentInfoType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:ebay:apis:eBLBaseComponents}TransactionID" minOccurs="0"/>
 *         &lt;element ref="{urn:ebay:apis:eBLBaseComponents}EbayTransactionID" minOccurs="0"/>
 *         &lt;element name="ParentTransactionID" type="{urn:ebay:apis:eBLBaseComponents}TransactionId" minOccurs="0"/>
 *         &lt;element ref="{urn:ebay:apis:eBLBaseComponents}ReceiptID" minOccurs="0"/>
 *         &lt;element name="TransactionType" type="{urn:ebay:apis:eBLBaseComponents}PaymentTransactionCodeType"/>
 *         &lt;element name="PaymentType" type="{urn:ebay:apis:eBLBaseComponents}PaymentCodeType" minOccurs="0"/>
 *         &lt;element name="RefundSourceCodeType" type="{urn:ebay:apis:eBLBaseComponents}RefundSourceCodeType" minOccurs="0"/>
 *         &lt;element name="ExpectedeCheckClearDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="PaymentDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="GrossAmount" type="{urn:ebay:apis:CoreComponentTypes}BasicAmountType" minOccurs="0"/>
 *         &lt;element name="FeeAmount" type="{urn:ebay:apis:CoreComponentTypes}BasicAmountType" minOccurs="0"/>
 *         &lt;element name="FinancingFeeAmount" type="{urn:ebay:apis:CoreComponentTypes}BasicAmountType" minOccurs="0"/>
 *         &lt;element name="FinancingTotalCost" type="{urn:ebay:apis:CoreComponentTypes}BasicAmountType" minOccurs="0"/>
 *         &lt;element name="FinancingMonthlyPayment" type="{urn:ebay:apis:CoreComponentTypes}BasicAmountType" minOccurs="0"/>
 *         &lt;element name="FinancingTerm" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IsFinancing" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SettleAmount" type="{urn:ebay:apis:CoreComponentTypes}BasicAmountType" minOccurs="0"/>
 *         &lt;element name="TaxAmount" type="{urn:ebay:apis:CoreComponentTypes}BasicAmountType" minOccurs="0"/>
 *         &lt;element name="ExchangeRate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PaymentStatus" type="{urn:ebay:apis:eBLBaseComponents}PaymentStatusCodeType"/>
 *         &lt;element name="PendingReason" type="{urn:ebay:apis:eBLBaseComponents}PendingStatusCodeType" minOccurs="0"/>
 *         &lt;element name="ReasonCode" type="{urn:ebay:apis:eBLBaseComponents}ReversalReasonCodeType" minOccurs="0"/>
 *         &lt;element name="HoldDecision" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ShippingMethod" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ProtectionEligibility" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ProtectionEligibilityType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ReceiptReferenceNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="POSTransactionType" type="{urn:ebay:apis:eBLBaseComponents}POSTransactionCodeType" minOccurs="0"/>
 *         &lt;element name="ShipAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ShipHandleAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ShipDiscount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InsuranceAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Subject" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="StoreID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TerminalID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SellerDetails" type="{urn:ebay:apis:eBLBaseComponents}SellerDetailsType" minOccurs="0"/>
 *         &lt;element name="PaymentRequestID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FMFDetails" type="{urn:ebay:apis:eBLBaseComponents}FMFDetailsType" minOccurs="0"/>
 *         &lt;element name="EnhancedPaymentInfo" type="{urn:ebay:apis:EnhancedDataTypes}EnhancedPaymentInfoType" minOccurs="0"/>
 *         &lt;element name="PaymentError" type="{urn:ebay:apis:eBLBaseComponents}ErrorType" minOccurs="0"/>
 *         &lt;element name="InstrumentDetails" type="{urn:ebay:apis:eBLBaseComponents}InstrumentDetailsType" minOccurs="0"/>
 *         &lt;element name="OfferDetails" type="{urn:ebay:apis:eBLBaseComponents}OfferDetailsType" minOccurs="0"/>
 *         &lt;element name="BinEligibility" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SoftDescriptor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SoftDescriptorCity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PaymentInfoType", propOrder = {
    "transactionID",
    "ebayTransactionID",
    "parentTransactionID",
    "receiptID",
    "transactionType",
    "paymentType",
    "refundSourceCodeType",
    "expectedeCheckClearDate",
    "paymentDate",
    "grossAmount",
    "feeAmount",
    "financingFeeAmount",
    "financingTotalCost",
    "financingMonthlyPayment",
    "financingTerm",
    "isFinancing",
    "settleAmount",
    "taxAmount",
    "exchangeRate",
    "paymentStatus",
    "pendingReason",
    "reasonCode",
    "holdDecision",
    "shippingMethod",
    "protectionEligibility",
    "protectionEligibilityType",
    "receiptReferenceNumber",
    "posTransactionType",
    "shipAmount",
    "shipHandleAmount",
    "shipDiscount",
    "insuranceAmount",
    "subject",
    "storeID",
    "terminalID",
    "sellerDetails",
    "paymentRequestID",
    "fmfDetails",
    "enhancedPaymentInfo",
    "paymentError",
    "instrumentDetails",
    "offerDetails",
    "binEligibility",
    "softDescriptor",
    "softDescriptorCity"
})
public class PaymentInfoType {

    @XmlElement(name = "TransactionID")
    protected String transactionID;
    @XmlElement(name = "EbayTransactionID")
    protected String ebayTransactionID;
    @XmlElement(name = "ParentTransactionID")
    protected String parentTransactionID;
    @XmlElement(name = "ReceiptID")
    protected String receiptID;
    @XmlElement(name = "TransactionType", required = true)
    protected PaymentTransactionCodeType transactionType;
    @XmlElement(name = "PaymentType")
    protected PaymentCodeType paymentType;
    @XmlElement(name = "RefundSourceCodeType")
    protected RefundSourceCodeType refundSourceCodeType;
    @XmlElement(name = "ExpectedeCheckClearDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar expectedeCheckClearDate;
    @XmlElement(name = "PaymentDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar paymentDate;
    @XmlElement(name = "GrossAmount")
    protected BasicAmountType grossAmount;
    @XmlElement(name = "FeeAmount")
    protected BasicAmountType feeAmount;
    @XmlElement(name = "FinancingFeeAmount")
    protected BasicAmountType financingFeeAmount;
    @XmlElement(name = "FinancingTotalCost")
    protected BasicAmountType financingTotalCost;
    @XmlElement(name = "FinancingMonthlyPayment")
    protected BasicAmountType financingMonthlyPayment;
    @XmlElement(name = "FinancingTerm")
    protected String financingTerm;
    @XmlElement(name = "IsFinancing")
    protected String isFinancing;
    @XmlElement(name = "SettleAmount")
    protected BasicAmountType settleAmount;
    @XmlElement(name = "TaxAmount")
    protected BasicAmountType taxAmount;
    @XmlElement(name = "ExchangeRate")
    protected String exchangeRate;
    @XmlElement(name = "PaymentStatus", required = true)
    protected PaymentStatusCodeType paymentStatus;
    @XmlElement(name = "PendingReason")
    protected PendingStatusCodeType pendingReason;
    @XmlElement(name = "ReasonCode")
    protected ReversalReasonCodeType reasonCode;
    @XmlElement(name = "HoldDecision")
    protected String holdDecision;
    @XmlElement(name = "ShippingMethod")
    protected String shippingMethod;
    @XmlElement(name = "ProtectionEligibility")
    protected String protectionEligibility;
    @XmlElement(name = "ProtectionEligibilityType")
    protected String protectionEligibilityType;
    @XmlElement(name = "ReceiptReferenceNumber")
    protected String receiptReferenceNumber;
    @XmlElement(name = "POSTransactionType")
    protected POSTransactionCodeType posTransactionType;
    @XmlElement(name = "ShipAmount")
    protected String shipAmount;
    @XmlElement(name = "ShipHandleAmount")
    protected String shipHandleAmount;
    @XmlElement(name = "ShipDiscount")
    protected String shipDiscount;
    @XmlElement(name = "InsuranceAmount")
    protected String insuranceAmount;
    @XmlElement(name = "Subject")
    protected String subject;
    @XmlElement(name = "StoreID")
    protected String storeID;
    @XmlElement(name = "TerminalID")
    protected String terminalID;
    @XmlElement(name = "SellerDetails")
    protected SellerDetailsType sellerDetails;
    @XmlElement(name = "PaymentRequestID")
    protected String paymentRequestID;
    @XmlElement(name = "FMFDetails")
    protected FMFDetailsType fmfDetails;
    @XmlElement(name = "EnhancedPaymentInfo")
    protected EnhancedPaymentInfoType enhancedPaymentInfo;
    @XmlElement(name = "PaymentError")
    protected ErrorType paymentError;
    @XmlElement(name = "InstrumentDetails")
    protected InstrumentDetailsType instrumentDetails;
    @XmlElement(name = "OfferDetails")
    protected OfferDetailsType offerDetails;
    @XmlElement(name = "BinEligibility")
    protected String binEligibility;
    @XmlElement(name = "SoftDescriptor")
    protected String softDescriptor;
    @XmlElement(name = "SoftDescriptorCity")
    protected String softDescriptorCity;

    /**
     * A transaction identification number. 
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;br xmlns="http://www.w3.org/2001/XMLSchema" xmlns:cc="urn:ebay:apis:CoreComponentTypes" xmlns:ed="urn:ebay:apis:EnhancedDataTypes" xmlns:ns="urn:ebay:apis:eBLBaseComponents" xmlns:xs="http://www.w3.org/2001/XMLSchema"/&gt;
     * </pre>
     * Character length and limits: 19 single-byte characters maximum
     * 
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransactionID() {
        return transactionID;
    }

    /**
     * Sets the value of the transactionID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransactionID(String value) {
        this.transactionID = value;
    }

    /**
     * Its Ebay transaction id.
     * 					
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;br xmlns="http://www.w3.org/2001/XMLSchema" xmlns:cc="urn:ebay:apis:CoreComponentTypes" xmlns:ed="urn:ebay:apis:EnhancedDataTypes" xmlns:ns="urn:ebay:apis:eBLBaseComponents" xmlns:xs="http://www.w3.org/2001/XMLSchema"/&gt;
     * </pre>
     * EbayTransactionID will returned for immediate pay item transaction in ECA 
     * 					
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEbayTransactionID() {
        return ebayTransactionID;
    }

    /**
     * Sets the value of the ebayTransactionID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEbayTransactionID(String value) {
        this.ebayTransactionID = value;
    }

    /**
     * Gets the value of the parentTransactionID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParentTransactionID() {
        return parentTransactionID;
    }

    /**
     * Sets the value of the parentTransactionID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParentTransactionID(String value) {
        this.parentTransactionID = value;
    }

    /**
     * 
     * 			Receipt ID 
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;br xmlns="http://www.w3.org/2001/XMLSchema" xmlns:cc="urn:ebay:apis:CoreComponentTypes" xmlns:ed="urn:ebay:apis:EnhancedDataTypes" xmlns:ns="urn:ebay:apis:eBLBaseComponents" xmlns:xs="http://www.w3.org/2001/XMLSchema"/&gt;
     * </pre>
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;br xmlns="http://www.w3.org/2001/XMLSchema" xmlns:cc="urn:ebay:apis:CoreComponentTypes" xmlns:ed="urn:ebay:apis:EnhancedDataTypes" xmlns:ns="urn:ebay:apis:eBLBaseComponents" xmlns:xs="http://www.w3.org/2001/XMLSchema"/&gt;
     * </pre>
     * 
     * Character length and limitations: 16 digits in xxxx-xxxx-xxxx-xxxx format
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReceiptID() {
        return receiptID;
    }

    /**
     * Sets the value of the receiptID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReceiptID(String value) {
        this.receiptID = value;
    }

    /**
     * Gets the value of the transactionType property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentTransactionCodeType }
     *     
     */
    public PaymentTransactionCodeType getTransactionType() {
        return transactionType;
    }

    /**
     * Sets the value of the transactionType property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentTransactionCodeType }
     *     
     */
    public void setTransactionType(PaymentTransactionCodeType value) {
        this.transactionType = value;
    }

    /**
     * Gets the value of the paymentType property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentCodeType }
     *     
     */
    public PaymentCodeType getPaymentType() {
        return paymentType;
    }

    /**
     * Sets the value of the paymentType property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentCodeType }
     *     
     */
    public void setPaymentType(PaymentCodeType value) {
        this.paymentType = value;
    }

    /**
     * Gets the value of the refundSourceCodeType property.
     * 
     * @return
     *     possible object is
     *     {@link RefundSourceCodeType }
     *     
     */
    public RefundSourceCodeType getRefundSourceCodeType() {
        return refundSourceCodeType;
    }

    /**
     * Sets the value of the refundSourceCodeType property.
     * 
     * @param value
     *     allowed object is
     *     {@link RefundSourceCodeType }
     *     
     */
    public void setRefundSourceCodeType(RefundSourceCodeType value) {
        this.refundSourceCodeType = value;
    }

    /**
     * Gets the value of the expectedeCheckClearDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getExpectedeCheckClearDate() {
        return expectedeCheckClearDate;
    }

    /**
     * Sets the value of the expectedeCheckClearDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setExpectedeCheckClearDate(XMLGregorianCalendar value) {
        this.expectedeCheckClearDate = value;
    }

    /**
     * Gets the value of the paymentDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPaymentDate() {
        return paymentDate;
    }

    /**
     * Sets the value of the paymentDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPaymentDate(XMLGregorianCalendar value) {
        this.paymentDate = value;
    }

    /**
     * Gets the value of the grossAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BasicAmountType }
     *     
     */
    public BasicAmountType getGrossAmount() {
        return grossAmount;
    }

    /**
     * Sets the value of the grossAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BasicAmountType }
     *     
     */
    public void setGrossAmount(BasicAmountType value) {
        this.grossAmount = value;
    }

    /**
     * Gets the value of the feeAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BasicAmountType }
     *     
     */
    public BasicAmountType getFeeAmount() {
        return feeAmount;
    }

    /**
     * Sets the value of the feeAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BasicAmountType }
     *     
     */
    public void setFeeAmount(BasicAmountType value) {
        this.feeAmount = value;
    }

    /**
     * Gets the value of the financingFeeAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BasicAmountType }
     *     
     */
    public BasicAmountType getFinancingFeeAmount() {
        return financingFeeAmount;
    }

    /**
     * Sets the value of the financingFeeAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BasicAmountType }
     *     
     */
    public void setFinancingFeeAmount(BasicAmountType value) {
        this.financingFeeAmount = value;
    }

    /**
     * Gets the value of the financingTotalCost property.
     * 
     * @return
     *     possible object is
     *     {@link BasicAmountType }
     *     
     */
    public BasicAmountType getFinancingTotalCost() {
        return financingTotalCost;
    }

    /**
     * Sets the value of the financingTotalCost property.
     * 
     * @param value
     *     allowed object is
     *     {@link BasicAmountType }
     *     
     */
    public void setFinancingTotalCost(BasicAmountType value) {
        this.financingTotalCost = value;
    }

    /**
     * Gets the value of the financingMonthlyPayment property.
     * 
     * @return
     *     possible object is
     *     {@link BasicAmountType }
     *     
     */
    public BasicAmountType getFinancingMonthlyPayment() {
        return financingMonthlyPayment;
    }

    /**
     * Sets the value of the financingMonthlyPayment property.
     * 
     * @param value
     *     allowed object is
     *     {@link BasicAmountType }
     *     
     */
    public void setFinancingMonthlyPayment(BasicAmountType value) {
        this.financingMonthlyPayment = value;
    }

    /**
     * Gets the value of the financingTerm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFinancingTerm() {
        return financingTerm;
    }

    /**
     * Sets the value of the financingTerm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFinancingTerm(String value) {
        this.financingTerm = value;
    }

    /**
     * Gets the value of the isFinancing property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsFinancing() {
        return isFinancing;
    }

    /**
     * Sets the value of the isFinancing property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsFinancing(String value) {
        this.isFinancing = value;
    }

    /**
     * Gets the value of the settleAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BasicAmountType }
     *     
     */
    public BasicAmountType getSettleAmount() {
        return settleAmount;
    }

    /**
     * Sets the value of the settleAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BasicAmountType }
     *     
     */
    public void setSettleAmount(BasicAmountType value) {
        this.settleAmount = value;
    }

    /**
     * Gets the value of the taxAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BasicAmountType }
     *     
     */
    public BasicAmountType getTaxAmount() {
        return taxAmount;
    }

    /**
     * Sets the value of the taxAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BasicAmountType }
     *     
     */
    public void setTaxAmount(BasicAmountType value) {
        this.taxAmount = value;
    }

    /**
     * Gets the value of the exchangeRate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExchangeRate() {
        return exchangeRate;
    }

    /**
     * Sets the value of the exchangeRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExchangeRate(String value) {
        this.exchangeRate = value;
    }

    /**
     * Gets the value of the paymentStatus property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentStatusCodeType }
     *     
     */
    public PaymentStatusCodeType getPaymentStatus() {
        return paymentStatus;
    }

    /**
     * Sets the value of the paymentStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentStatusCodeType }
     *     
     */
    public void setPaymentStatus(PaymentStatusCodeType value) {
        this.paymentStatus = value;
    }

    /**
     * Gets the value of the pendingReason property.
     * 
     * @return
     *     possible object is
     *     {@link PendingStatusCodeType }
     *     
     */
    public PendingStatusCodeType getPendingReason() {
        return pendingReason;
    }

    /**
     * Sets the value of the pendingReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link PendingStatusCodeType }
     *     
     */
    public void setPendingReason(PendingStatusCodeType value) {
        this.pendingReason = value;
    }

    /**
     * Gets the value of the reasonCode property.
     * 
     * @return
     *     possible object is
     *     {@link ReversalReasonCodeType }
     *     
     */
    public ReversalReasonCodeType getReasonCode() {
        return reasonCode;
    }

    /**
     * Sets the value of the reasonCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReversalReasonCodeType }
     *     
     */
    public void setReasonCode(ReversalReasonCodeType value) {
        this.reasonCode = value;
    }

    /**
     * Gets the value of the holdDecision property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHoldDecision() {
        return holdDecision;
    }

    /**
     * Sets the value of the holdDecision property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHoldDecision(String value) {
        this.holdDecision = value;
    }

    /**
     * Gets the value of the shippingMethod property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShippingMethod() {
        return shippingMethod;
    }

    /**
     * Sets the value of the shippingMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShippingMethod(String value) {
        this.shippingMethod = value;
    }

    /**
     * Gets the value of the protectionEligibility property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProtectionEligibility() {
        return protectionEligibility;
    }

    /**
     * Sets the value of the protectionEligibility property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProtectionEligibility(String value) {
        this.protectionEligibility = value;
    }

    /**
     * Gets the value of the protectionEligibilityType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProtectionEligibilityType() {
        return protectionEligibilityType;
    }

    /**
     * Sets the value of the protectionEligibilityType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProtectionEligibilityType(String value) {
        this.protectionEligibilityType = value;
    }

    /**
     * Gets the value of the receiptReferenceNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReceiptReferenceNumber() {
        return receiptReferenceNumber;
    }

    /**
     * Sets the value of the receiptReferenceNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReceiptReferenceNumber(String value) {
        this.receiptReferenceNumber = value;
    }

    /**
     * Gets the value of the posTransactionType property.
     * 
     * @return
     *     possible object is
     *     {@link POSTransactionCodeType }
     *     
     */
    public POSTransactionCodeType getPOSTransactionType() {
        return posTransactionType;
    }

    /**
     * Sets the value of the posTransactionType property.
     * 
     * @param value
     *     allowed object is
     *     {@link POSTransactionCodeType }
     *     
     */
    public void setPOSTransactionType(POSTransactionCodeType value) {
        this.posTransactionType = value;
    }

    /**
     * Gets the value of the shipAmount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShipAmount() {
        return shipAmount;
    }

    /**
     * Sets the value of the shipAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShipAmount(String value) {
        this.shipAmount = value;
    }

    /**
     * Gets the value of the shipHandleAmount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShipHandleAmount() {
        return shipHandleAmount;
    }

    /**
     * Sets the value of the shipHandleAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShipHandleAmount(String value) {
        this.shipHandleAmount = value;
    }

    /**
     * Gets the value of the shipDiscount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShipDiscount() {
        return shipDiscount;
    }

    /**
     * Sets the value of the shipDiscount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShipDiscount(String value) {
        this.shipDiscount = value;
    }

    /**
     * Gets the value of the insuranceAmount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInsuranceAmount() {
        return insuranceAmount;
    }

    /**
     * Sets the value of the insuranceAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInsuranceAmount(String value) {
        this.insuranceAmount = value;
    }

    /**
     * Gets the value of the subject property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubject() {
        return subject;
    }

    /**
     * Sets the value of the subject property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubject(String value) {
        this.subject = value;
    }

    /**
     * Gets the value of the storeID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStoreID() {
        return storeID;
    }

    /**
     * Sets the value of the storeID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStoreID(String value) {
        this.storeID = value;
    }

    /**
     * Gets the value of the terminalID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTerminalID() {
        return terminalID;
    }

    /**
     * Sets the value of the terminalID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTerminalID(String value) {
        this.terminalID = value;
    }

    /**
     * Gets the value of the sellerDetails property.
     * 
     * @return
     *     possible object is
     *     {@link SellerDetailsType }
     *     
     */
    public SellerDetailsType getSellerDetails() {
        return sellerDetails;
    }

    /**
     * Sets the value of the sellerDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link SellerDetailsType }
     *     
     */
    public void setSellerDetails(SellerDetailsType value) {
        this.sellerDetails = value;
    }

    /**
     * Gets the value of the paymentRequestID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymentRequestID() {
        return paymentRequestID;
    }

    /**
     * Sets the value of the paymentRequestID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaymentRequestID(String value) {
        this.paymentRequestID = value;
    }

    /**
     * Gets the value of the fmfDetails property.
     * 
     * @return
     *     possible object is
     *     {@link FMFDetailsType }
     *     
     */
    public FMFDetailsType getFMFDetails() {
        return fmfDetails;
    }

    /**
     * Sets the value of the fmfDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link FMFDetailsType }
     *     
     */
    public void setFMFDetails(FMFDetailsType value) {
        this.fmfDetails = value;
    }

    /**
     * Gets the value of the enhancedPaymentInfo property.
     * 
     * @return
     *     possible object is
     *     {@link EnhancedPaymentInfoType }
     *     
     */
    public EnhancedPaymentInfoType getEnhancedPaymentInfo() {
        return enhancedPaymentInfo;
    }

    /**
     * Sets the value of the enhancedPaymentInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link EnhancedPaymentInfoType }
     *     
     */
    public void setEnhancedPaymentInfo(EnhancedPaymentInfoType value) {
        this.enhancedPaymentInfo = value;
    }

    /**
     * Gets the value of the paymentError property.
     * 
     * @return
     *     possible object is
     *     {@link ErrorType }
     *     
     */
    public ErrorType getPaymentError() {
        return paymentError;
    }

    /**
     * Sets the value of the paymentError property.
     * 
     * @param value
     *     allowed object is
     *     {@link ErrorType }
     *     
     */
    public void setPaymentError(ErrorType value) {
        this.paymentError = value;
    }

    /**
     * Gets the value of the instrumentDetails property.
     * 
     * @return
     *     possible object is
     *     {@link InstrumentDetailsType }
     *     
     */
    public InstrumentDetailsType getInstrumentDetails() {
        return instrumentDetails;
    }

    /**
     * Sets the value of the instrumentDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link InstrumentDetailsType }
     *     
     */
    public void setInstrumentDetails(InstrumentDetailsType value) {
        this.instrumentDetails = value;
    }

    /**
     * Gets the value of the offerDetails property.
     * 
     * @return
     *     possible object is
     *     {@link OfferDetailsType }
     *     
     */
    public OfferDetailsType getOfferDetails() {
        return offerDetails;
    }

    /**
     * Sets the value of the offerDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link OfferDetailsType }
     *     
     */
    public void setOfferDetails(OfferDetailsType value) {
        this.offerDetails = value;
    }

    /**
     * Gets the value of the binEligibility property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBinEligibility() {
        return binEligibility;
    }

    /**
     * Sets the value of the binEligibility property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBinEligibility(String value) {
        this.binEligibility = value;
    }

    /**
     * Gets the value of the softDescriptor property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSoftDescriptor() {
        return softDescriptor;
    }

    /**
     * Sets the value of the softDescriptor property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSoftDescriptor(String value) {
        this.softDescriptor = value;
    }

    /**
     * Gets the value of the softDescriptorCity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSoftDescriptorCity() {
        return softDescriptorCity;
    }

    /**
     * Sets the value of the softDescriptorCity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSoftDescriptorCity(String value) {
        this.softDescriptorCity = value;
    }

}
