package com.hashanr.microservices.service;

import com.hashanr.microservice.commons.model.SubscriberData;

public interface SubscriberService {
	
	SubscriberData getSubscriberInfo(int MSISDN);

}
