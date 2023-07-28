package com.surajdatelearnings;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.surajdatelearnings.controller.Library;
import com.surajdatelearnings.repository.LibraryRepository;

@SpringBootApplication
public class SpringBootRestServiceApplication implements CommandLineRunner{

	@Autowired
	LibraryRepository repository;
	
	
	public static void main(String[] args) {
		SpringApplication.run(SpringBootRestServiceApplication.class, args);
	}
	@Override
	public void run(String[] args) {
		Library library = repository.findById("fdsefr343").get();
		System.out.println(library.getAuthor());
	}
}
