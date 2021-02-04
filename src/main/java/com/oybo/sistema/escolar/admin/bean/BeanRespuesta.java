package com.oybo.sistema.escolar.admin.bean;

import java.io.Serializable;

public class BeanRespuesta<T> implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -3518420491273632246L;

	private T response;
	
	private boolean ok;
	
	private String responseCode;

	public T getResponse() {
		return response;
	}

	public void setResponse(T response) {
		this.response = response;
	}

	public boolean isOk() {
		return ok;
	}

	public void setOk(boolean ok) {
		this.ok = ok;
	}

	public String getResponseCode() {
		return responseCode;
	}

	public void setResponseCode(String responseCode) {
		this.responseCode = responseCode;
	}
	
}
