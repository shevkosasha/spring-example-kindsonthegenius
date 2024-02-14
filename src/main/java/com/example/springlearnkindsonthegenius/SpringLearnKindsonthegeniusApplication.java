package com.example.springlearnkindsonthegenius;

import com.example.springlearnkindsonthegenius.Model.Location;
import com.example.springlearnkindsonthegenius.Model.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication//(exclude={DataSourceAutoConfiguration.class})
//@ComponentScan(basePackages = {"com.example.springlearnkindsonthegenius.student"})
public class SpringLearnKindsonthegeniusApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringLearnKindsonthegeniusApplication.class, args);
	}

}
