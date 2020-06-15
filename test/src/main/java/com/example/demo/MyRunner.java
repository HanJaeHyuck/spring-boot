package com.example.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class MyRunner implements ApplicationRunner{
	@Value("${vega2k.fullName}")
	private String name;
	@Value("${vega2k.age}")
	private int age;
	public void run(ApplicationArguments args) throws Exception {
		System.out.println("*****");
		System.out.println(name);
		System.out.println(age);
	}

}

