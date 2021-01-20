package com.lucasmonteiro.web_services_springboot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lucasmonteiro.web_services_springboot.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
