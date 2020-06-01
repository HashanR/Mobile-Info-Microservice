package com.hashanr.microservices.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hashanr.microservice.commons.model.SubscriberData;


import com.hashanr.microservices.service.SubscriberService;

@RestController
@RequestMapping("/api")
public class SubscriberController {

	@Autowired
	SubscriberService subscriberService;
	
	@GetMapping("v1/subscriber/{MSISDN}")
	public SubscriberData getSubscriber(@PathVariable int MSISDN) {
		return subscriberService.getSubscriberInfo(MSISDN);
	}
}
