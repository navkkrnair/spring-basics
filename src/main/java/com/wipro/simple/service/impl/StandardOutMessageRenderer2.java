package com.wipro.simple.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.wipro.simple.service.MessageProvider;
import com.wipro.simple.service.MessageRenderer;

@Component("renderer")
public class StandardOutMessageRenderer2 implements MessageRenderer {
	private MessageProvider messageProvider;

	@Autowired
	public StandardOutMessageRenderer2(MessageProvider provider) {
		this.messageProvider = provider;
	}

	@Override
	public void setMessageProvider(MessageProvider provider) {
		this.messageProvider = provider;
	}

	@Override
	public MessageProvider getMessageProvider() {
		return this.messageProvider;
	}

	@Override
	public void render() {
		if (messageProvider == null) {
			throw new RuntimeException("You must set the property messageProvider of class: "
					+ StandardOutMessageRenderer2.class.getName());
		}
		System.out.println(messageProvider.getMessage());
	}

}
