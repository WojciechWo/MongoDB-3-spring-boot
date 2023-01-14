package com.example.MongoDB3springboot;


import com.example.MongoDB3springboot.category.Category;
import com.example.MongoDB3springboot.product.Product;
import com.example.MongoDB3springboot.product.ProductRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
@SpringBootApplication
public class MongoDb3SpringBootApplication {

	public static void main(String[] args) {
		SpringApplication.run(MongoDb3SpringBootApplication.class, args);
	}

	}

