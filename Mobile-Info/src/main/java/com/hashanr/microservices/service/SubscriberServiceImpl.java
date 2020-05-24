package com.hashanr.microservices.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hashanr.microservice.commons.model.SubscriberData;
import com.hashanr.microservices.repository.SubscriberDataRepository;

@Service
public class SubscriberServiceImpl implements SubscriberService {

	@Autowired
	private SubscriberDataRepository subscriberDataRepository;
	
	
	@Override
	public SubscriberData getSubscriberInfo(int MSISDN) {
		
		SubscriberData subscriberData=subscriberDataRepository.findByMSISDN(MSISDN);
		return subscriberData;
	}

}
