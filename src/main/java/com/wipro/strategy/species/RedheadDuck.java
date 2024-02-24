package com.wipro.strategy.species;

import com.wipro.strategy.Duck;
import com.wipro.strategy.behaviour.Flyable;
import com.wipro.strategy.behaviour.Quakable;

public class RedheadDuck extends Duck { // implements Flyable {

	public RedheadDuck(Flyable flyable, Quakable quakable) {
		this.flyable = flyable;
		this.quakable = quakable;
	}

	@Override
	public void display() {
		System.out.println("Redhead Duck display");
	}

	/*
	 * @Override public void fly() { System.out.println("Duck flying"); }
	 */

}
