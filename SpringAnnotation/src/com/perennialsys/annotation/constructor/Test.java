package com.perennialsys.annotation.constructor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		//ApplicationContext ctx=new ClassPathXmlApplicationContext("spring.xml");
		AbstractApplicationContext ctx=new ClassPathXmlApplicationContext("spring.xml");
		
		
		Student obj1=ctx.getBean("s1",Student.class);
		System.out.println(obj1);
		
		ctx.close(); //when reference class is abstractApllContext  then only we call close()
		
	}

}
