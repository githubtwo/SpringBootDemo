package com.zick;

import com.alibaba.druid.pool.DruidDataSource;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Controller;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import javax.sql.DataSource;
import java.sql.SQLException;

@Controller
//@EnableWebMvc//去除默认映射
@SpringBootApplication
@ServletComponentScan
@MapperScan(basePackages = "com.zick.dao")
public class SpringdemoApplication {


	public static void main(String[] args) {

		SpringApplication.run(SpringdemoApplication.class, args);

	}

}
