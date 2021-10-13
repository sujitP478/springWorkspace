package com.perennial.annotations.jsr;

import javax.annotation.Resource;

public class Circle implements Shape {
	
	private Point center;
	
	@Override
	public void draw() {
		System.out.println("Drawing Circle.......");
		System.out.println();
	}

	public Point getCenter() {
		return center;
	}
	@Resource(name="pointC")
	public void setCenter(Point center) {
		this.center = center;
	}
	
}
