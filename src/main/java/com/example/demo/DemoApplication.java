package com.example.demo;

import com.example.demo.repository.CashierRepository;
import com.example.demo.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Autowired
	private CustomerRepository customerRepository;

	@Autowired
	private CashierRepository cashierRepository;

	@Override
	public void run(String... args) throws Exception {
//		Customer customer = new Customer();
//		customer.setFirstName("John");
//		customer.setLastName("Doe");
//		customer.setGender("Male");
//		customer.setDob("10/20/1992");
//		customer.setAddress("200 Oak Ridge Apts");
//		customer.setPhoneNumber("997-889-6780");
//		customerRepository.save(customer);
	}
}
