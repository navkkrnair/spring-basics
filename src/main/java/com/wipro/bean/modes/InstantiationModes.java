package com.wipro.bean.modes;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.wipro.bean.modes.service.ConcertLookup;
import com.wipro.bean.modes.service.impl.AbstractConcertLookup;

/*
 * . The prototype scope instructs Spring to instantiate a new instance of the bean every time a
bean instance is requested by the application
 */
public class InstantiationModes {
	public static void main(String[] args) {
		ApplicationContext ctx = new AnnotationConfigApplicationContext(ModesConfiguration.class);
		Singer singer1 = ctx.getBean(Singer.class);
		Singer singer2 = ctx.getBean(Singer.class);
		singer1.sing();
		var outcome = singer1 == singer2 ? "Both are Singleton" : "It's Prototype";
		System.out.println(outcome);

		Concert concert1 = ctx.getBean(Concert.class);
		Concert concert2 = ctx.getBean(Concert.class);
		outcome = concert1.getSinger() == concert2.getSinger() ? "Both are Singleton" : "It's Prototype";
		System.out.println(outcome);

		ConcertLookup concert3 = ctx.getBean(AbstractConcertLookup.class);
		ConcertLookup concert4 = ctx.getBean(AbstractConcertLookup.class);
		outcome = concert3.getMySinger() == concert4.getMySinger() ? "Both are Singleton" : "It's Prototype";
		System.out.println(outcome);
	}
}
