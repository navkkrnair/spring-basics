package com.wipro.factory.bean;

import java.security.MessageDigest;

import lombok.Setter;

public class MessageDigester {
	@Setter
	private MessageDigest digest1;
	@Setter
	private MessageDigest digest2;

	public void digest(String msg) {
		System.out.println("Using digest1");
		digest(msg, digest1);
		System.out.println("Using digest2");
		digest(msg, digest2);
	}

	private void digest(String msg, MessageDigest digest) {
		System.out.println("Using alogrithm: " + digest.getAlgorithm());
		digest.reset();
		byte[] bytes = msg.getBytes();
		byte[] out = digest.digest(bytes);
		System.out.println(out);
	}

}
