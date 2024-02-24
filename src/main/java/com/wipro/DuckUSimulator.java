package com.wipro;

import com.wipro.strategy.Duck;
import com.wipro.strategy.species.MallardDuck;
import com.wipro.strategy.species.RedheadDuck;
import com.wipro.strategy.species.RubberDuck;

public class DuckUSimulator {
	public static void main(String[] args) {
		Duck mallard = new MallardDuck();
		Duck redhead = new RedheadDuck();
		Duck rubber = new RubberDuck();
		showDucks(mallard);
		showDucks(redhead);
		showDucks(rubber);

	}

	private static void showDucks(Duck duck) {
		duck.quack();
		duck.swim();
		duck.fly();
		duck.display();
		System.out.println("-----------------");
	}
}
