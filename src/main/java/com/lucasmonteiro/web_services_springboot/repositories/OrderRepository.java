package com.lucasmonteiro.web_services_springboot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lucasmonteiro.web_services_springboot.entities.Order;

@Repository
public interface OrderRepository extends JpaRepository<Order, Long> {

}
