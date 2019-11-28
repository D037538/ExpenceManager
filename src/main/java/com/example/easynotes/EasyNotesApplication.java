package com.example.easynotes;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
@SpringBootApplication

@EnableJpaAuditing
//@ComponentScan({"com.example.easynotes"}) //to scan packages mentioned

public class EasyNotesApplication  {
	
	public static void main(String[] args) {
		SpringApplication.run(EasyNotesApplication.class, args);
	}
}
