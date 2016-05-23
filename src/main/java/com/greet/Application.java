package com.greet;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.greet.service.GreetService;

@EnableCircuitBreaker
@RestController
@SpringBootApplication
@EnableAutoConfiguration
@ComponentScan("com.greet")
public class Application {

	@Autowired
	private GreetService greetService;

	  @RequestMapping("/greet")
	  public String toRead() {
	    return greetService.greet();
	  }

	  public static void main(String[] args) {
	    SpringApplication.run(Application.class, args);
	  }
}