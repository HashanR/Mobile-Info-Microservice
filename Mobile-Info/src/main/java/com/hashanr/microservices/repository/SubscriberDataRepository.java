package com.hashanr.microservices.repository;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hashanr.microservice.commons.model.SubscriberData;

@Repository
public interface SubscriberDataRepository extends JpaRepository<SubscriberData, Integer> {
	
	SubscriberData findByMSISDN(int MSISDN);

}
