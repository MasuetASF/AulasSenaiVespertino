package com.senai.primeirospassos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;




@RestController
@SpringBootApplication
public class PrimeirospassosApplication {

	@RequestMapping("/")
	String home(){
		return "Olá mundo!";
	}

	@RequestMapping("/user")
	public String user() {
		return "Não tem usuários cadastrados";
	}
	
	@RequestMapping("/calc")
	public int calc() {
		return 3+6;
	}
	



	public static void main(String[] args) {
		SpringApplication.run(PrimeirospassosApplication.class, args);
	}

}
