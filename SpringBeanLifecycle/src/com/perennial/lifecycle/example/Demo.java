package com.perennial.lifecycle.example;

public class Demo {
	public void init() {
		System.out.println("Bean Instantiated init()");
	}
	public void destroy() {
		System.out.println("conatainer closed destroy()");
	}
}
