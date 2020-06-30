package com.example.Mini.Project;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@EnableSwagger2
@SpringBootApplication
public class MiniProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(MiniProjectApplication.class, args);
	}

}
