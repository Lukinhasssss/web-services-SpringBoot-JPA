package com.lucasmonteiro.web_services_springboot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lucasmonteiro.web_services_springboot.entities.User;

@Repository // A anotação @Repository é opcional pois o UserRepository está herdando do JpaRepository que já está registrado como componente do Spring
public interface UserRepository extends JpaRepository<User, Long> {

}
