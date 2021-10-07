package com.perennial.lc;

public class Person {
	String name;
	String email;
	Vehicle v;
	
	public Person() {
		System.out.println("In person default const");
	}
	public Person(String name, String email, Vehicle v) {
		super();
		this.name = name;
		this.email = email;
		this.v = v;
	}
	public Vehicle getV() {
		return v;
	}
	public void setV(Vehicle v) {
		this.v = v;
	}
	
}
