package com.outputresponse;

public class Outputresponse {
	
	private int statusCode;
	
	private Object data;
	
	private String message;

	public int getStatusCode() {
		return statusCode;
	}

	public void setStatusCode(int statusCode) {
		this.statusCode = statusCode;
	}

	public Object getData() {
		return data;
	}

	public void setData(Object data) {
		this.data = data;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
	public Outputresponse(int statusCode) {
		this.statusCode = statusCode;
		
	}
	
	public Outputresponse(int statusCode, Object data) {
		this.statusCode = statusCode;
		this.data = data;
	}

	public Outputresponse(int statusCode, String message) {
		this.statusCode = statusCode;
		this.message = message;
	}

	public Outputresponse(int statusCode, Object data, String message) {
		this.statusCode = statusCode;
		this.data = data;
		this.message = message;
	}
	
	
	

}
