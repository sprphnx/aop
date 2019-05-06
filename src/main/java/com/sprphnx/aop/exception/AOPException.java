package com.sprphnx.aop.exception;

public class AOPException extends Exception {

	private static final long serialVersionUID = -6838603725180324495L;
	
	private final String errorCode;
	private final String errorType;
	private final String errorDesc;

	public AOPException(String errorCode, String errorType, String errorDesc) {
		super();
		this.errorCode = errorCode;
		this.errorType = errorType;
		this.errorDesc = errorDesc;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public String getErrorCode() {
		return errorCode;
	}

	public String getErrorType() {
		return errorType;
	}

	public String getErrorDesc() {
		return errorDesc;
	}

}
