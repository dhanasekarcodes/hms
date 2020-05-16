package com.medi.hms.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.medi.hms.model.AuthDetails;

@RestController
public class HmsApiController {
	
	@PostMapping("/login")
	public ResponseEntity<AuthDetails> doLogin(@RequestBody AuthDetails authDetails){
		
		return new ResponseEntity<AuthDetails>(new AuthDetails(), HttpStatus.ACCEPTED);
		
	}

}
