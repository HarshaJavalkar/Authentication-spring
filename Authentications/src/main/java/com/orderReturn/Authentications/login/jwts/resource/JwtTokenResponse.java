package com.orderReturn.Authentications.login.jwts.resource;

import java.io.Serializable;
import java.util.List;

import org.springframework.http.HttpStatus;

import com.orderReturn.Authentications.Orders.Orders;

public class JwtTokenResponse implements Serializable {

  private static final long serialVersionUID = 8317676219297719109L;

  private final String token;
  private final HttpStatus accepted;
  private List<Orders> orders;

//    public JwtTokenResponse(String token, HttpStatus accepted) {
//        this.token = token;
//        this.accepted=accepted;
//    }

    public JwtTokenResponse(String token2, HttpStatus accepted2,List<Orders> orders) {
        this.token = token2;
        this.accepted=accepted2;	
        this.orders = orders;    
    
    }

	public String getToken() {
        return this.token;
    }

	public HttpStatus getAccepted() {
		return accepted;
	}

	public List<Orders> getOrders() {
		return orders;
	}

	public void setOrders(List<Orders> orders) {
		this.orders = orders;
	}


  
}