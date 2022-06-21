package com.springboot.backend;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.springboot.backend.model.User;
import com.springboot.backend.repository.UserRepository;
@SpringBootApplication
public class ReactBackendApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(ReactBackendApplication.class, args);
	}
	@Autowired
	private UserRepository userRepository;
	@Override
	public void run(String... args) throws Exception {
		this.userRepository.save(new User("Gayatri","Bharambe","gayatribharambe@gmail.com"));
		this.userRepository.save(new User("Sanjay","Bharambe","sanjaybharambe@gmail.com"));
	}

}
