package com.perennialsys.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		//ApplicationContext ctx=new ClassPathXmlApplicationContext("spring.xml");
		AbstractApplicationContext ctx=new ClassPathXmlApplicationContext("spring.xml");
		
		/*
		 * Student obj1=(Student) ctx.getBean("s1"); Student
		 * obj2=ctx.getBean("s2",Student.class); //no need of downcasting
		 * System.out.println(obj1);
		 * 
		 * System.out.println(obj2);
		 */
		  
		/*
		 * Student obj3=ctx.getBean("s3",Student.class); System.out.println(obj3);
		 */
	
		/*
		 * Student obj4=ctx.getBean("s4",Student.class); System.out.println(obj4);
		 */
		
		Student obj5=ctx.getBean("s5",Student.class);
		System.out.println(obj5);
		
		ctx.close(); //when reference class is abstractApllContext  then only we call close()
		
	}

}
