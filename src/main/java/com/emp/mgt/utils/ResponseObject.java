package com.emp.mgt.utils;

public class ResponseObject {
	
	private int statusCode;
	private String status;
	
	public ResponseObject() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ResponseObject(int statusCode, String status) {
		super();
		this.statusCode = statusCode;
		this.status = status;
	}
	public int getStatusCode() {
		return statusCode;
	}
	public void setStatusCode(int statusCode) {
		this.statusCode = statusCode;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
	

}
