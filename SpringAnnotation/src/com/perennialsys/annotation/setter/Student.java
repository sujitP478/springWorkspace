package com.perennialsys.annotation.setter;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Student {
	private int sid;
	private String sname;
	private Batch batch;
	private Address addr;
	public Student() {
		System.out.println("In default constructor");
	}
	public Student(int sid, String sname, Batch batch, Address addr) {
		super();
		System.out.println("In Student 4 patam constr ");
		this.sid = sid;
		this.sname = sname;
		this.batch = batch;
		this.addr = addr;
	}
	@Autowired
	public void setAddr(Address addr) {
		System.out.println("In Addr setter");
		this.addr = addr;
	}

	@Autowired
	@Qualifier("b2")
	public void setBatch(Batch batch) {
		System.out.println("In Batch setter");
		this.batch = batch;
	}

	public Address getAddr() {
		return addr;
	}
	
	public void setSid(int sid) {
		this.sid = sid;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public Batch getBatch() {
		return batch;
	}public int getSid() {
		return sid;
	}
	
	@Override
	public String toString() {
		return "Student [sid=" + sid + ", sname=" + sname + ", batch=" + batch + ", addr=" + addr + "]";
	}

}
