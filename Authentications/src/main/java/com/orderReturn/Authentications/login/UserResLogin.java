package com.orderReturn.Authentications.login;

import java.beans.JavaBean;

@JavaBean
public class UserResLogin {

	private String message;

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public UserResLogin(String message) {
		super();
		this.message = message;
	}

}
