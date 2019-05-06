package com.sprphnx.aop.model;

import java.time.LocalDateTime;

public class AuthenticationRequest {

	String fiNumber;
	String otp;
	String id;
	LocalDateTime timestamp;
	
	public AuthenticationRequest() {
		super();
	}
	public AuthenticationRequest(String fiNumber, String otp, String id, LocalDateTime timestamp) {
		super();
		this.fiNumber = fiNumber;
		this.otp = otp;
		this.id = id;
		this.timestamp = timestamp;
	}
	
	public String getFiNumber() {
		return fiNumber;
	}
	public void setFiNumber(String fiNumber) {
		this.fiNumber = fiNumber;
	}
	public String getOtp() {
		return otp;
	}
	public void setOtp(String otp) {
		this.otp = otp;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public LocalDateTime getTimestamp() {
		return timestamp;
	}
	public void setTimestamp(LocalDateTime timestamp) {
		this.timestamp = timestamp;
	}

}
