package com.orderReturn.Authentications.login.jwts.resource;

import java.io.Serializable;

import org.springframework.http.HttpStatus;

public class JwtTokenResponse implements Serializable {

  private static final long serialVersionUID = 8317676219297719109L;

  private final String token;
  private final HttpStatus accepted;

//    public JwtTokenResponse(String token, HttpStatus accepted) {
//        this.token = token;
//        this.accepted=accepted;
//    }

    public JwtTokenResponse(String token2, HttpStatus accepted2) {
        this.token = token2;
        this.accepted=accepted2;	}

	public String getToken() {
        return this.token;
    }

	public HttpStatus getAccepted() {
		return accepted;
	}


  
}