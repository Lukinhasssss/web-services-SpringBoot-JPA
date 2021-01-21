package com.lucasmonteiro.web_services_springboot.config;

import java.time.Instant;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.lucasmonteiro.web_services_springboot.entities.Category;
import com.lucasmonteiro.web_services_springboot.entities.Order;
import com.lucasmonteiro.web_services_springboot.entities.Product;
import com.lucasmonteiro.web_services_springboot.entities.User;
import com.lucasmonteiro.web_services_springboot.entities.enums.OrderStatus;
import com.lucasmonteiro.web_services_springboot.repositories.CategoryRepository;
import com.lucasmonteiro.web_services_springboot.repositories.OrderRepository;
import com.lucasmonteiro.web_services_springboot.repositories.ProductRepository;
import com.lucasmonteiro.web_services_springboot.repositories.UserRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {
	
	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private OrderRepository orderRepository;

	@Autowired
	private CategoryRepository categoryRepository;
	
	@Autowired
	private ProductRepository productRepository;

	@Override
	public void run(String... args) throws Exception {
		
		User user1 = new User(null, "Lucas", "lucas@gmail.com", "987654321", "123456");
		User user2 = new User(null, "Fernanda", "fernanda@gmail.com", "987456321", "123456");
		
		Order order1 = new Order(null, Instant.parse("2021-01-19T21:12:13Z"), OrderStatus.PAID, user1);
		Order order2 = new Order(null, Instant.parse("2021-01-20T19:31:15Z"), OrderStatus.WAITING_PAYMENT, user2);
		Order order3 = new Order(null, Instant.parse("2021-01-21T09:15:57Z"), OrderStatus.WAITING_PAYMENT, user1);
		
		Category category1 = new Category(null, "Eletronics");
		Category category2 = new Category(null, "Books");
		Category category3 = new Category(null, "Computers");
		
		Product product1 = new Product(null, "The Lord of the Rings", "Lorem ipsum dolor sit amet, consectetur.", 90.5, "");
		Product product2 = new Product(null, "Smart TV", "Nulla eu imperdiet purus. Maecenas ante.", 2190.0, "");
		Product product3 = new Product(null, "Macbook Pro", "Nam eleifend maximus tortor, at mollis.", 1250.0, "");
		Product product4 = new Product(null, "PC Gamer", "Donec aliquet odio ac rhoncus cursus.", 1200.0, "");
		Product product5 = new Product(null, "Rails for Dummies", "Cras fringilla convallis sem vel faucibus.", 100.99, ""); 
		
		userRepository.saveAll(Arrays.asList(user1, user2));
		orderRepository.saveAll(Arrays.asList(order1, order2, order3));
		categoryRepository.saveAll(Arrays.asList(category1, category2, category3));
		productRepository.saveAll(Arrays.asList(product1, product2, product3, product4, product5));
		
		product1.getCategories().add(category2);
		product2.getCategories().add(category1);
		product2.getCategories().add(category3);
		product3.getCategories().add(category3);
		product4.getCategories().add(category3);
		product5.getCategories().add(category2);
		
		productRepository.saveAll(Arrays.asList(product1, product2, product3, product4, product5));
		
	}
	
	

}
