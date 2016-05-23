package com.greet.service;

import java.net.URI;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@Service
public class GreetService {

  @HystrixCommand(fallbackMethod = "greetWorld")
  public String greet() {
    RestTemplate restTemplate = new RestTemplate();
    URI uri = URI.create("http://localhost:8092/hello?name=chandar");

    return restTemplate.getForObject(uri, String.class);
  }

  public String greetWorld() {
    return "Hello World";
  }

}