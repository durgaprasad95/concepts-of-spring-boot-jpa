package com.concepts.springBootJpa;

import java.sql.SQLException;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootJpaApplication {

	//This is to start the server..which is equal to manually start the .bat file of h2
	static {
		try {
			org.h2.tools.Server.createTcpServer().start();
		} catch (SQLException e) {
			System.out.println(e.getClass().getSimpleName());
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringBootJpaApplication.class, args);
	}
}
