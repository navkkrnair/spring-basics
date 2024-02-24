package com.wipro.simple.service.impl;

import com.wipro.simple.service.MessageProvider;
import com.wipro.simple.service.MessageRenderer;

public class StandardOutMessageRenderer implements MessageRenderer {
	private MessageProvider messageProvider;

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
					+ StandardOutMessageRenderer.class.getName());
		}
		System.out.println(messageProvider.getMessage());
	}

}
