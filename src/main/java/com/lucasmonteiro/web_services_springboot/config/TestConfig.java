package com.lucasmonteiro.web_services_springboot.config;

import java.time.Instant;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.lucasmonteiro.web_services_springboot.entities.Order;
import com.lucasmonteiro.web_services_springboot.entities.User;
import com.lucasmonteiro.web_services_springboot.repositories.OrderRepository;
import com.lucasmonteiro.web_services_springboot.repositories.UserRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {
	
	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private OrderRepository orderRepository;

	@Override
	public void run(String... args) throws Exception {
		
		User user1 = new User(null, "Lucas", "lucas@gmail.com", "987654321", "123456");
		User user2 = new User(null, "Fernanda", "fernanda@gmail.com", "987456321", "123456");
		
		userRepository.saveAll(Arrays.asList(user1, user2));
		
		Order order1 = new Order(null, Instant.parse("2021-01-21T09:15:57Z"), user1);
		Order order2 = new Order(null, Instant.parse("2021-01-20T19:31:15Z"), user2);
		Order order3 = new Order(null, Instant.parse("2021-01-19T21:12:13Z"), user1);
		
		orderRepository.saveAll(Arrays.asList(order1, order2, order3));
		
	}
	
	

}
