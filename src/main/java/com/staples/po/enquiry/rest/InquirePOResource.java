package com.staples.po.enquiry.rest;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.staples.po.enquiry.dto.InquiryPORequest;
import com.staples.po.enquiry.dto.InquiryPOResponse;

@RestController
@RequestMapping("/services/v1")
public class InquirePOResource {

	
	@PostMapping(value = "/inquirepo", consumes = {"application/json"})
	@ResponseBody
	public ResponseEntity<InquiryPOResponse> inquirePO(@RequestBody InquiryPORequest inquiryPORequest)
		 {
		
		InquiryPOResponse response = new InquiryPOResponse();
		response.setBuyer("12");
		response.setBuyerName("Adam Engle");
		response.setInquiryType("POEVENTINQ");
		response.setPoNumber("NII149");
		response.setPoType("C");
		response.setPoTypeDescription("JDA Heads Down");
		response.setVendor("13301");
		response.setVendorName("AVERY PRODUCTS CORPORATION");
		response.setCancelDate("");
		response.setCustomerOrder("");
		response.setDeliveryDate("");
		response.setDestination("");
		response.setDestinationName("");
		response.setDueDate("");
		response.setE3PO("");
		response.setE3SubVendor("");
		response.setEntryDate("");
		response.setEventDetails("");
		response.setShipDate("");
		response.setSystem("");

		return ResponseEntity.ok(response);
	}

}