package com.staples.po.enquiry.dto;

public class InquiryPORequest {
	
	private String channel;
	private String inquiryType;
	private String poNumber;
	private String details;
	private String location;
	private String e3Number;
	private String skuID;
	private String orderNumber;
	private String containerNo;
	private String destination;
	private String bol;
	private String status;
	private String buyer;
	private String vendor;
	private String warehouse;
	private String fromDate;
	private String toDate;
	public String getChannel() {
		return channel;
	}
	public void setChannel(String channel) {
		this.channel = channel;
	}
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
	public String getDetails() {
		return details;
	}
	public void setDetails(String details) {
		this.details = details;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getE3Number() {
		return e3Number;
	}
	public void setE3Number(String e3Number) {
		this.e3Number = e3Number;
	}
	public String getSkuID() {
		return skuID;
	}
	public void setSkuID(String skuID) {
		this.skuID = skuID;
	}
	public String getOrderNumber() {
		return orderNumber;
	}
	public void setOrderNumber(String orderNumber) {
		this.orderNumber = orderNumber;
	}
	public String getContainerNo() {
		return containerNo;
	}
	public void setContainerNo(String containerNo) {
		this.containerNo = containerNo;
	}
	public String getDestination() {
		return destination;
	}
	public void setDestination(String destination) {
		this.destination = destination;
	}
	public String getBol() {
		return bol;
	}
	public void setBol(String bol) {
		this.bol = bol;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getBuyer() {
		return buyer;
	}
	public void setBuyer(String buyer) {
		this.buyer = buyer;
	}
	public String getVendor() {
		return vendor;
	}
	public void setVendor(String vendor) {
		this.vendor = vendor;
	}
	public String getWarehouse() {
		return warehouse;
	}
	public void setWarehouse(String warehouse) {
		this.warehouse = warehouse;
	}
	public String getFromDate() {
		return fromDate;
	}
	public void setFromDate(String fromDate) {
		this.fromDate = fromDate;
	}
	public String getToDate() {
		return toDate;
	}
	public void setToDate(String toDate) {
		this.toDate = toDate;
	}
	@Override
	public String toString() {
		return "InquiryPORequest [channel=" + channel + ", inquiryType="
				+ inquiryType + ", poNumber=" + poNumber + ", details="
				+ details + ", location=" + location + ", e3Number=" + e3Number
				+ ", skuID=" + skuID + ", orderNumber=" + orderNumber
				+ ", containerNo=" + containerNo + ", destination="
				+ destination + ", bol=" + bol + ", status=" + status
				+ ", buyer=" + buyer + ", vendor=" + vendor + ", warehouse="
				+ warehouse + ", fromDate=" + fromDate + ", toDate=" + toDate
				+ "]";
	}
	
	
		
}
