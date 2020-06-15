package com.example.demo;

import org.springframework.boot.context.event.ApplicationStartedEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

//@Component
public class SampleListener implements ApplicationListener<ApplicationStartedEvent>{
	public void onApplicationEvent(ApplicationStartedEvent arg0) {
		System.out.println("=========================");
		System.out.println("Application is Stared");
		System.out.println("=========================");
	}
}
