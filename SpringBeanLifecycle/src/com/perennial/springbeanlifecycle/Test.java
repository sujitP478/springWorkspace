package com.perennial.springbeanlifecycle;

import java.sql.SQLException;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) throws SQLException, ClassNotFoundException {
	AbstractApplicationContext ctx=new ClassPathXmlApplicationContext("lifecycle.xml");
	StudentDAO s1=ctx.getBean("studentDAO",StudentDAO.class);
	s1.fetchData();
	s1.deleteRecord(4);
	ctx.close();
	}

}
