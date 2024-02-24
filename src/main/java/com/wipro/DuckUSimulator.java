package com.wipro;

import com.wipro.strategy.Duck;
import com.wipro.strategy.behaviour.Flyable;
import com.wipro.strategy.behaviour.Quakable;
import com.wipro.strategy.behaviour.impl.FlyNoWay;
import com.wipro.strategy.behaviour.impl.FlyWithWings;
import com.wipro.strategy.behaviour.impl.Squeak;
import com.wipro.strategy.species.MallardDuck;
import com.wipro.strategy.species.RedheadDuck;
import com.wipro.strategy.species.RubberDuck;

public class DuckUSimulator {
	public static void main(String[] args) {
		Flyable flyBehaviour = new FlyWithWings();
		Flyable noFly = new FlyNoWay();
		Quakable quackBehaviour = new Squeak();
		Duck mallard = new MallardDuck(flyBehaviour, quackBehaviour);
		Duck redhead = new RedheadDuck(flyBehaviour, quackBehaviour);
		Duck rubber = new RubberDuck(noFly, quackBehaviour);
		showDucks(mallard);
		showDucks(redhead);
		showDucks(rubber);

	}

	private static void showDucks(Duck duck) {
		duck.performQuack();
		duck.swim();
		duck.performFly();
		duck.display();
		System.out.println("-----------------");
	}
}
