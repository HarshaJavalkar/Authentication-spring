package com.orderReturn.Authentications.Orders;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface OrdersRepository extends JpaRepository<Orders, Long> {
	  List<Orders> findByUsername(String username);
} 