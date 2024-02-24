package com.wipro.strategy;

public abstract class Duck {

	public void quack() {
		System.out.println("Quack Quack");
	}

	public void swim() {
		System.out.println("Swimming");
	}

	public void fly() {
		System.out.println("Duck flying");
	}

	public abstract void display();

}
