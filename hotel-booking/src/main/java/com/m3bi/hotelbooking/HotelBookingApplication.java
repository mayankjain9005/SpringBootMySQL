package com.m3bi.hotelbooking;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.aspectj.EnableSpringConfigured;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.m3bi.DAO.UserDAO;

@SpringBootApplication
@EnableJpaRepositories("com.m3bi.dao")
@EntityScan("com.m3bi.entity")
@EnableAutoConfiguration
@ComponentScan(basePackages="com.m3bi.*")
@EnableSpringConfigured
public class HotelBookingApplication   {

	@Autowired
	private DataSource dataSource;
	@Autowired
	private UserDAO userDAO;
	
	public static void main(String[] args) {
		SpringApplication.run(HotelBookingApplication.class, args);
	}
	
	

}

