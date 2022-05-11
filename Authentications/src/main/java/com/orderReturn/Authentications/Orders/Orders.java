package com.orderReturn.Authentications.Orders;

import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
@Table(name = "orders_all")
public class Orders {
	@Id
	private Long Id;
	@Column(name = "username")
	private String username;
	@Column(name = "product_name")
	private String name;
	@Column(name = "product_type")
	private String type;

	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public Long getId() {
		return Id;
	}
	public void setId(Long id) {
		Id = id;
	}
	public Orders( Long Id,String username, String name, String type) {
		super();
		this.Id = Id;
		this.username = username;
		this.name = name;
		this.type = type;
	}
	public Orders() {
		
	}
	
	
}
