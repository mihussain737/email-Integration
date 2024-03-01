package com.emailintegration.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.emailintegration.entity.Email;
import com.emailintegration.service.EmailService;

@RestController
@RequestMapping("/api/email")
public class EmailController {
	
	@Autowired
	private EmailService emailService;
	
	//http://localhost:8080/api/email
	@PostMapping
	public ResponseEntity<String> sendEmail(@RequestBody Email email){
		emailService.sendEmail(email.getTo(), email.getBody(), email.getSubject());
		return new ResponseEntity<String>("Email is sent",HttpStatus.OK);
	}

}
