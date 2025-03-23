package com.example.givenget;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.example.givenget.model.Item;
import com.example.givenget.repository.ItemRepository;

@SpringBootApplication
public class GivengetServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(GivengetServerApplication.class, args);
	}
}
