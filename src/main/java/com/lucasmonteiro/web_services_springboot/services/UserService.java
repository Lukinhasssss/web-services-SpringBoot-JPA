package com.lucasmonteiro.web_services_springboot.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lucasmonteiro.web_services_springboot.entities.User;
import com.lucasmonteiro.web_services_springboot.repositories.UserRepository;

@Service
public class UserService {
	
	@Autowired
	private UserRepository repository;
	
	public List<User> findAll() {
		return repository.findAll();
	}
	
	public User findById(Long id) {
		Optional<User> user = repository.findById(id);
		return user.get(); // Vai retornar o objeto do tipo User que estiver dentro do Optional 
	}
	
	public User insert(User obj) {
		return repository.save(obj);
	}

}
