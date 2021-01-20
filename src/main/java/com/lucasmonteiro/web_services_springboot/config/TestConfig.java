package com.lucasmonteiro.web_services_springboot.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.lucasmonteiro.web_services_springboot.entities.User;
import com.lucasmonteiro.web_services_springboot.repositories.UserRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {
	
	@Autowired
	private UserRepository userRepository;

	@Override
	public void run(String... args) throws Exception {
		
		User user1 = new User(null, "Lucas", "lucas@gmail.com", "987654321", "123456");
		User user2 = new User(null, "Fernanda", "fernanda@gmail.com", "987456321", "123456");
		
		userRepository.saveAll(Arrays.asList(user1, user2));
		
	}
	
	

}
