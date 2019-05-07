package com.sprphnx.aop.model;

public class AuthenticationResponse {
	
	String code;
	String message;
	
	public AuthenticationResponse() {
		super();
	}

	public AuthenticationResponse(String code, String message) {
		super();
		this.code = code;
		this.message = message;
	}

	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}

}
