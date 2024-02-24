package com.wipro.simple.service.impl;

import org.springframework.stereotype.Component;

import com.wipro.simple.service.MessageProvider;

@Component
public class HelloWorldMessageProvider2 implements MessageProvider {
	@Override
	public String getMessage() {
		return "Hello World!";
	}

}
