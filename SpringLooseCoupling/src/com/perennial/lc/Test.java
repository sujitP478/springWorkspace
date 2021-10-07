package com.perennial.lc;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		AbstractApplicationContext ctx=new ClassPathXmlApplicationContext("spring.xml");
		Person p=ctx.getBean("person",Person.class);
		p.getV().move();
		
		ctx.close();
	}

}
