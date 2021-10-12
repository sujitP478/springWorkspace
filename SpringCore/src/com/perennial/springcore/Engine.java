package com.perennial.springcore;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Engine {
	private int eid;
	private String eType;
	Engine(){
		System.out.println("In Engine def const");
	}
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String geteType() {
		return eType;
	}
	public void seteType(String eType) {
		this.eType = eType;
	}
	@Override
	public String toString() {
		return "Engine [eid=" + eid + ", eType=" + eType + "]";
	}
	

}
