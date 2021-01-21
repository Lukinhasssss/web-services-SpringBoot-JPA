package com.lucasmonteiro.web_services_springboot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lucasmonteiro.web_services_springboot.entities.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {

}
