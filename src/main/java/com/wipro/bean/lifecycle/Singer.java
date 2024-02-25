package com.wipro.bean.lifecycle;

import org.springframework.beans.factory.BeanCreationException;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

public class Singer implements InitializingBean, DisposableBean {
	private static final String DEFAULT_NAME = "Eric Clapton";
	private String name;
	private int age = Integer.MIN_VALUE;

	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("Initializing bean");
		if (name == null) {
			System.out.println("Using  default  name");
			name = DEFAULT_NAME;
		}

		if (age == Integer.MIN_VALUE) {
			throw new IllegalArgumentException("You must set the age property of any beans of type " + Singer.class);
		}
	}

	public String toString() {
		return "\tName: " + name + "\n\tAge: " + age;
	}

	public static void main(String... args) {
		ApplicationContext ctx = new AnnotationConfigApplicationContext(LifeCycleConfiguration.class);
		getBean("singerOne", ctx);
		getBean("singerTwo", ctx);
		getBean("singerThree", ctx);
		((AbstractApplicationContext) ctx).close();
		((AbstractApplicationContext) ctx).registerShutdownHook();
	}

	private static Singer getBean(String beanName, ApplicationContext ctx) {
		try {
			Singer bean = (Singer) ctx.getBean(beanName);
			System.out.println(bean);
			return bean;
		} catch (BeanCreationException ex) {
			System.out.println("An error occured in bean configuration: " + ex.getMessage());
			return null;
		}
	}

	@Override
	public void destroy() throws Exception {
		System.out.println("Bean is about to be destroyed");

	}

}