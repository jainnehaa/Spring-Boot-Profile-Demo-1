package com.example.demo.components;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;

@Component
public class ProfileComponent {

	@Value("${message}")
	private String messageStr;
	
//	@Value("${testParam1}")
//	private String testParam1;
	
	@Value("${testParam2}")
	private String testParam2;
	
	@Value("${testParamDev}")
	private String testParamDev;
	
	@PostConstruct
	public void printMessage() {
		System.out.println("Message : " + messageStr);
//		System.out.println("Test Param 1: " + testParam1);
		System.out.println("Test Param 2: " + testParam2);
		System.out.println("Test Param Dev: " + testParamDev);
	}
}
