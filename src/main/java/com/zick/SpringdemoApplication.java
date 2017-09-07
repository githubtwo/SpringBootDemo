package com.zick;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Controller
@EnableWebMvc
@SpringBootApplication
@MapperScan(basePackages = "com.zick.dao")
public class SpringdemoApplication {

	public static void main(String[] args) {

		SpringApplication.run(SpringdemoApplication.class, args);
	}
}
