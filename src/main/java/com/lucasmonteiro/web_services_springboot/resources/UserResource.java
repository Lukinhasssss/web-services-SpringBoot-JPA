package com.lucasmonteiro.web_services_springboot.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lucasmonteiro.web_services_springboot.entities.User;

@RestController
@RequestMapping(value = "/users")
public class UserResource {
	
	@GetMapping
	public ResponseEntity<User> findAll() {
		User user = new User(1L, "Lucas", "lucas@gmail.com", "11987654321", "12345");
		return ResponseEntity.ok().body(user);
	}

}
