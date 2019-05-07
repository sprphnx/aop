package com.sprphnx.aop.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.sprphnx.aop.exception.AOPException;
import com.sprphnx.aop.model.AuthenticationResponse;
import com.sprphnx.aop.service.AuthenticationService;

@Aspect
@Component
public class ConsentLogAspect {
	
	@Autowired
	AuthenticationService authenticationService;
	
	Logger log = LoggerFactory.getLogger(ConsentLogAspect.class.getName());
	
	@AfterThrowing (pointcut = "execution(* com.sprphnx.aop.service.AuthenticationService.*(com.sprphnx.aop.model.AuthenticationRequest))", throwing = "ex")
	public void afterThrowingException(JoinPoint joinPoint, AOPException ex) {
	    authenticationService.logMessage("Exception from aspect");
	}

	@AfterReturning(pointcut = "execution(* com.sprphnx.aop.service.AuthenticationService.*(com.sprphnx.aop.model.AuthenticationRequest))",returning="authenticationResponse")
	public void afterSuccessfulReturn(JoinPoint joinPoint, AuthenticationResponse authenticationResponse) {
		authenticationService.logMessage(authenticationResponse.getMessage());
	}

}
