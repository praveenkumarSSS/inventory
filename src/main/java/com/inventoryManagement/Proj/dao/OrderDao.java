package com.inventoryManagement.Proj.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.inventoryManagement.Proj.model.Order;

public interface OrderDao extends JpaRepository<Order, Integer> {

}
