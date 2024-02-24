package com.wipro.strategy.behaviour.impl;

import com.wipro.strategy.behaviour.Flyable;

public class FlyWithWings implements Flyable {
	@Override
	public void fly() {
		System.out.println("I fly with wings");
	}
}
