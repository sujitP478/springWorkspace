package com.perennial.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.perennial.model.Employee;
import com.perennial.model.Pancard;

public class Test {

	public static void main(String[] args) {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("beans.xml");
		Employee e1=ctx.getBean("emp", Employee.class);
		System.out.println(e1);
		
	}

}
