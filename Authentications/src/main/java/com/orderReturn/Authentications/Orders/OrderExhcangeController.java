package com.orderReturn.Authentications.Orders;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins="http://localhost:4200")
public class OrderExhcangeController {

	@Autowired
	private OrdersRepository repository;
	@RequestMapping(method=RequestMethod.GET, path= "/getOrders/{username}")
	public List<Orders> getorders( @PathVariable String username) {
		List<Orders> orders = repository.findByUsername(username);
	return orders;
	}
}
