package com.wipro.strategy.species;

import com.wipro.strategy.Duck;
import com.wipro.strategy.behaviour.Flyable;
import com.wipro.strategy.behaviour.Quakable;

public class MallardDuck extends Duck {// implements Flyable {
	public MallardDuck(Flyable flyable, Quakable quakable) {
		this.flyable = flyable;
		this.quakable = quakable;
	}

	@Override
	public void display() {
		System.out.println("Mallard Duck display");
	}

}
