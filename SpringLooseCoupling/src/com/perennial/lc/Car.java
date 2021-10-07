package com.perennial.lc;

public class Car implements Vehicle{

	public Car() {
		System.out.println("In car def cons");
	}
	@Override
	public void move() {
		System.out.println("Driving car");		
	}

}
