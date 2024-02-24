package com.wipro.strategy.species;

import com.wipro.strategy.Duck;

public class RubberDuck extends Duck {

	@Override
	public void display() {
		System.out.println("Rubber Duck display");
	}

	@Override
	public void fly() {
		System.out.println("No fly");
	}

}
