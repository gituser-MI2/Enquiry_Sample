package com.staples.po.enquiry.dto;

public class InquiryPOResponse {
	
	private String inquiryType;
	private String poNumber;
	private String poType;
	private String poTypeDescription;
	private String buyer;
	private String buyerName;
	private String vendor;
	private String vendorName;
	private String destination;
	private String destinationName;
	private String entryDate;
	private String shipDate;
	private String deliveryDate;
	private String dueDate;
	private String cancelDate;
	private String e3PO;
	private String system;
	private String e3SubVendor;
	private String customerOrder;
	private String EventDetails;
	public String getInquiryType() {
		return inquiryType;
	}
	public void setInquiryType(String inquiryType) {
		this.inquiryType = inquiryType;
	}
	public String getPoNumber() {
		return poNumber;
	}
	public void setPoNumber(String poNumber) {
		this.poNumber = poNumber;
	}
	public String getPoType() {
		return poType;
	}
	public void setPoType(String poType) {
		this.poType = poType;
	}
	public String getPoTypeDescription() {
		return poTypeDescription;
	}
	public void setPoTypeDescription(String poTypeDescription) {
		this.poTypeDescription = poTypeDescription;
	}
	public String getBuyer() {
		return buyer;
	}
	public void setBuyer(String buyer) {
		this.buyer = buyer;
	}
	public String getBuyerName() {
		return buyerName;
	}
	public void setBuyerName(String buyerName) {
		this.buyerName = buyerName;
	}
	public String getVendor() {
		return vendor;
	}
	public void setVendor(String vendor) {
		this.vendor = vendor;
	}
	public String getVendorName() {
		return vendorName;
	}
	public void setVendorName(String vendorName) {
		this.vendorName = vendorName;
	}
	public String getDestination() {
		return destination;
	}
	public void setDestination(String destination) {
		this.destination = destination;
	}
	public String getDestinationName() {
		return destinationName;
	}
	public void setDestinationName(String destinationName) {
		this.destinationName = destinationName;
	}
	public String getEntryDate() {
		return entryDate;
	}
	public void setEntryDate(String entryDate) {
		this.entryDate = entryDate;
	}
	public String getShipDate() {
		return shipDate;
	}
	public void setShipDate(String shipDate) {
		this.shipDate = shipDate;
	}
	public String getDeliveryDate() {
		return deliveryDate;
	}
	public void setDeliveryDate(String deliveryDate) {
		this.deliveryDate = deliveryDate;
	}
	public String getDueDate() {
		return dueDate;
	}
	public void setDueDate(String dueDate) {
		this.dueDate = dueDate;
	}
	public String getCancelDate() {
		return cancelDate;
	}
	public void setCancelDate(String cancelDate) {
		this.cancelDate = cancelDate;
	}
	public String getE3PO() {
		return e3PO;
	}
	public void setE3PO(String e3po) {
		e3PO = e3po;
	}
	public String getSystem() {
		return system;
	}
	public void setSystem(String system) {
		this.system = system;
	}
	public String getE3SubVendor() {
		return e3SubVendor;
	}
	public void setE3SubVendor(String e3SubVendor) {
		this.e3SubVendor = e3SubVendor;
	}
	public String getCustomerOrder() {
		return customerOrder;
	}
	public void setCustomerOrder(String customerOrder) {
		this.customerOrder = customerOrder;
	}
	public String getEventDetails() {
		return EventDetails;
	}
	public void setEventDetails(String eventDetails) {
		EventDetails = eventDetails;
	}
	@Override
	public String toString() {
		return "InquiryPOResponse [inquiryType=" + inquiryType + ", poNumber="
				+ poNumber + ", poType=" + poType + ", poTypeDescription="
				+ poTypeDescription + ", buyer=" + buyer + ", buyerName="
				+ buyerName + ", vendor=" + vendor + ", vendorName="
				+ vendorName + ", destination=" + destination
				+ ", destinationName=" + destinationName + ", entryDate="
				+ entryDate + ", shipDate=" + shipDate + ", deliveryDate="
				+ deliveryDate + ", dueDate=" + dueDate + ", cancelDate="
				+ cancelDate + ", e3PO=" + e3PO + ", system=" + system
				+ ", e3SubVendor=" + e3SubVendor + ", customerOrder="
				+ customerOrder + ", EventDetails=" + EventDetails + "]";
	}
	

}
