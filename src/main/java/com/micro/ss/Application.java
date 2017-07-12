package com.micro.ss;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author micro
 * @date 2017年7月12日
 * @description : 
 */
@SpringBootApplication
@RestController
public class Application {

	public static void main(String[] args) {
		SpringApplication springApplication = new SpringApplication(Application.class);
		springApplication.run(args);
	}
	
	@RequestMapping("/")
	@ResponseBody
	public String hello() {
		return "hello";
	}
}
