package com.example.springbootdemo;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@SpringBootApplication
@PropertySource("classpath:database.properties")

public class Springbootassignment1Application {


	public static void main(String[] args) {
		SpringApplication.run(Springbootassignment1Application.class, args);
		
	}
	@Autowired
	Environment env;

	@Bean
	public DataSource datasource() {

		DriverManagerDataSource datasource = new DriverManagerDataSource();

			System.out.println(env.getProperty("url"));
			
			System.out.println(env.getProperty("uname"));		
		datasource.setUrl(env.getProperty("url"));
		datasource.setUsername(env.getProperty("uname"));
		datasource.setPassword(env.getProperty("password"));

		
		
		return datasource;

	}

}
