package com.sprphnx.aop;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;

import com.sprphnx.aop.model.AuthenticationRequest;
import com.sprphnx.aop.service.AuthenticationService;

@SpringBootApplication
@EnableAsync
public class AopApplication implements CommandLineRunner {

	@Autowired
	AuthenticationService authenticationService;
	
	public static void main(String[] args) {
		SpringApplication.run(AopApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		authenticationService.verifyOTP(new AuthenticationRequest("", "999999", "1223233", LocalDateTime.now()));
		authenticationService.verifyOTP(new AuthenticationRequest("", "233223", "1223233", LocalDateTime.now()));
	}

}
