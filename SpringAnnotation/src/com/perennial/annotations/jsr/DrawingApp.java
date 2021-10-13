package com.perennial.annotations.jsr;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DrawingApp {
	AbstractApplicationContext ctx=new ClassPathXmlApplicationContext("beans.xml");
	Shape s=ctx.getBean("circle",Shape.class);
	
}
