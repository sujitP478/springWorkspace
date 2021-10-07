package com.perennialsys.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		//ApplicationContext ctx=new ClassPathXmlApplicationContext("spring.xml");
		AbstractApplicationContext ctx=new ClassPathXmlApplicationContext("spring.xml");
		System.out.println("Container started");
		Student obj1=ctx.getBean("s1",Student.class);
		System.out.println(obj1.hashCode());
		Student obj2=ctx.getBean("s1",Student.class);
		System.out.println(obj2.hashCode());	
		ctx.close(); //when reference class is abstractApllContext  then only we call close()
		
	}

}

//Scope=singleton-----default scope type,immediately it creates an obj and only single instance
//scope=prototype-----lazy initialization, for every getBean it creates seperate instance
//if lazy-init=true then first it will start container then beans will be initialized