package com.iqmsoft.aop;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.iqmsoft.aop.service.HelloWorldService;

@Configuration
@EnableAutoConfiguration
@ComponentScan
public class SampleAopApplication implements CommandLineRunner {

	
	@Autowired
	private HelloWorldService helloWorldService;

	@Override
	public void run(String... args) {
		System.out.println(this.helloWorldService.getHelloMessage());
	}

	public static void main(String[] args) throws Exception {
		SpringApplication.run(SampleAopApplication.class, args);
	}
}
