package com.wipro.app.profiles;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.wipro.app.profiles.service.FoodProviderService;

@Configuration
public class ProfilesConfigurer {

	@Bean
	@Profile("highschool")
	public FoodProviderService foodProviderHighSchool() {
		return new com.wipro.app.profiles.service.highschool.FoodProviderServiceImpl();
	}

	@Bean
	@Profile("kindergarten")
	public FoodProviderService foodProviderKindergarten() {
		return new com.wipro.app.profiles.service.kindergarten.FoodProviderServiceImpl();
	}

}
