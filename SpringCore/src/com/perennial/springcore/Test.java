package com.perennial.springcore;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		AbstractApplicationContext ctx=new ClassPathXmlApplicationContext("spring.xml");
		Car c1=ctx.getBean("car",Car.class);
		Engine e1=c1.getEngine();
		Engine e2=c1.getEngine();
		
		System.out.println(e1.hashCode());
		System.out.println(e2.hashCode());
		ctx.close();
	}

}
