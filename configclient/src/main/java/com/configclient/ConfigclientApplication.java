package com.configclient;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class ConfigclientApplication {
	@Value("${com.jiongyi.constant.active}")
	private String name;
	@RequestMapping("/")
	public String home() {
		return "Hello World!"+this.name;
	}
	public static void main(String[] args) {
		SpringApplication.run(ConfigclientApplication.class, args);
	}
}
