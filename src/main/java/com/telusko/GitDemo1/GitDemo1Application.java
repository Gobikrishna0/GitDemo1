package com.telusko.GitDemo1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class GitDemo1Application {

	public static void main(String[] args) {
		ApplicationContext context=SpringApplication.run(GitDemo1Application.class, args);
		System.out.println("Hello World");
	}

}
