package com.wipro.strategy;

import com.wipro.strategy.behaviour.Flyable;
import com.wipro.strategy.behaviour.Quakable;

public abstract class Duck {
	protected Flyable flyable;
	protected Quakable quakable;

	/*
	 * Add this method back for demo at start public void quack() {
	 * System.out.println("Quack Quack"); }
	 */

	public void performFly() {
		this.flyable.fly();
	}

	public void performQuack() {
		this.quakable.quack();
	}

	public void swim() {
		System.out.println("Swimming");
	}

	/*
	 * Add this method back for demo at start public void fly() {
	 * System.out.println("Duck flying"); }
	 */

	public abstract void display();

}
