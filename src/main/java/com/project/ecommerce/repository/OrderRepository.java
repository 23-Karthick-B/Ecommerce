package com.project.ecommerce.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.ecommerce.entity.Order;

public interface OrderRepository extends JpaRepository<Order,Long> {

}
