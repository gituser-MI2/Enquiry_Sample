package com.staples.po.enquiry;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EnquiryPOController {
	
	@GetMapping("/hello")
	public String getMessage() {
		return "Hello Staples!";
	}

}
