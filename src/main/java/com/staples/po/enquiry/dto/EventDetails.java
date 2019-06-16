package com.staples.po.enquiry.dto;

public class EventDetails {
	
	private String event;
	private String recordType;
	private String businessUnit;
	private String recordProcessDateTime;
	private String emailSendDateTime;
	private String extraField1;
	private String extraField2;
	private String extraField3;
	private String extraField4;
	private String extraField5;
	private String extraField6;
	private String vpmMetricsUsedFlag;
	
	public String getEvent() {
		return event;
	}
	public void setEvent(String event) {
		this.event = event;
	}
	public String getRecordType() {
		return recordType;
	}
	public void setRecordType(String recordType) {
		this.recordType = recordType;
	}
	public String getBusinessUnit() {
		return businessUnit;
	}
	public void setBusinessUnit(String businessUnit) {
		this.businessUnit = businessUnit;
	}
	public String getRecordProcessDateTime() {
		return recordProcessDateTime;
	}
	public void setRecordProcessDateTime(String recordProcessDateTime) {
		this.recordProcessDateTime = recordProcessDateTime;
	}
	public String getEmailSendDateTime() {
		return emailSendDateTime;
	}
	public void setEmailSendDateTime(String emailSendDateTime) {
		this.emailSendDateTime = emailSendDateTime;
	}
	public String getExtraField1() {
		return extraField1;
	}
	public void setExtraField1(String extraField1) {
		this.extraField1 = extraField1;
	}
	public String getExtraField2() {
		return extraField2;
	}
	public void setExtraField2(String extraField2) {
		this.extraField2 = extraField2;
	}
	public String getExtraField3() {
		return extraField3;
	}
	public void setExtraField3(String extraField3) {
		this.extraField3 = extraField3;
	}
	public String getExtraField4() {
		return extraField4;
	}
	public void setExtraField4(String extraField4) {
		this.extraField4 = extraField4;
	}
	public String getExtraField5() {
		return extraField5;
	}
	public void setExtraField5(String extraField5) {
		this.extraField5 = extraField5;
	}
	public String getExtraField6() {
		return extraField6;
	}
	public void setExtraField6(String extraField6) {
		this.extraField6 = extraField6;
	}
	public String getVpmMetricsUsedFlag() {
		return vpmMetricsUsedFlag;
	}
	public void setVpmMetricsUsedFlag(String vpmMetricsUsedFlag) {
		this.vpmMetricsUsedFlag = vpmMetricsUsedFlag;
	}
	@Override
	public String toString() {
		return "EventDetails [event=" + event + ", recordType=" + recordType
				+ ", businessUnit=" + businessUnit + ", recordProcessDateTime="
				+ recordProcessDateTime + ", emailSendDateTime="
				+ emailSendDateTime + ", extraField1=" + extraField1
				+ ", extraField2=" + extraField2 + ", extraField3="
				+ extraField3 + ", extraField4=" + extraField4
				+ ", extraField5=" + extraField5 + ", extraField6="
				+ extraField6 + ", vpmMetricsUsedFlag=" + vpmMetricsUsedFlag
				+ "]";
	}
	
}
