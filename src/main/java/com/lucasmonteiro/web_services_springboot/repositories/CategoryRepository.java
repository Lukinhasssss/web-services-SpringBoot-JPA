package com.lucasmonteiro.web_services_springboot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lucasmonteiro.web_services_springboot.entities.Category;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long> {

}
