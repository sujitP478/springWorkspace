package com.perennial.springcore;

import org.springframework.beans.factory.annotation.Lookup;
import org.springframework.stereotype.Component;

@Component
public class Car {
	private String modelName;
	private int cost;
	private Engine engine;
	

	@Lookup
	public Engine getEngine() {
		return engine;
	}
	
	Car(){
		System.out.println("In Car def cons");
	}
	public String getModelName() {
		return modelName;
	}
	public void setModelName(String modelName) {
		this.modelName = modelName;
	}
	public int getCost() {
		return cost;
	}
	public void setCost(int cost) {
		this.cost = cost;
	}
	public void setEngine(Engine engine) {
		this.engine = engine;
	}
	@Override
	public String toString() {
		return "Car [modelName=" + modelName + ", cost=" + cost + ", engine=" + engine + "]";
	}
	

}
