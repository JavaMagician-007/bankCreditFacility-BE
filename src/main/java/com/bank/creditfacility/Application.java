package com.bank.creditfacility;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

//@SpringBootApplication(scanBasePackages = {
//		"com.bank.creditfacility.controller", "com.bank.creditfacility.model"
//		, "com.bank.creditfacility.service", "com.bank.creditfacility.util"
//})
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
