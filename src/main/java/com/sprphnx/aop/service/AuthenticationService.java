package com.sprphnx.aop.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

import com.sprphnx.aop.aspect.ConsentLogAspect;
import com.sprphnx.aop.exception.AOPException;
import com.sprphnx.aop.model.AuthenticationRequest;

@Service
public class AuthenticationService {
	
	Logger log = LoggerFactory.getLogger(ConsentLogAspect.class.getName());
	
	private static final Object OTP = "999999";

	public void verifyOTP(AuthenticationRequest request) throws AOPException {
		
		if(!OTP.equals(request.getOtp())) {
			throw new AOPException("101","OTP_MISMATCH","Incorrect OTP provided");
		}
	}
	
	@Async
	public void logMessage() {
		log.info("======================================");
		log.info("Sucecss from acpect thread");
		log.info("======================================");
	}
}
