package com.wipro.app.profiles;

import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.GenericApplicationContext;

import com.wipro.app.profiles.model.Food;
import com.wipro.app.profiles.service.FoodProviderService;

public class Main {
	public static void main(String[] args) {
		GenericApplicationContext ctx = new AnnotationConfigApplicationContext(ProfilesConfigurer.class);

		FoodProviderService foodProviderService = ctx.getBean(FoodProviderService.class);
		List<Food> lunchSet = foodProviderService.provideLunchSet();
		for (Food food : lunchSet) {
			System.out.println("Food: " + food.getName());
		}
		ctx.close();

	}

}
