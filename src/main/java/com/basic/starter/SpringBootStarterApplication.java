package com.basic.starter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringBootStarterApplication {

	public static void main(String[] args) {
		ApplicationContext context =  SpringApplication.run(SpringBootStarterApplication.class, args);
		//print all the beans name
		for(String name : context.getBeanDefinitionNames()){
			System.out.println(name);
		}
	}

}
