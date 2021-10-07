package com.perennialsys.demo;

import java.util.List;

public class Student {
	private int sid;
	private String sname;
	private Batch batch;
	private Address addr;
	//List<Integer> marks;
	public Student() {
		System.out.println("In default constructor");
	}
	/*
	 * public Student(int sid, String sname, Batch batch) { super(); this.sid = sid;
	 * this.sname = sname; this.batch = batch; }
	 */
	
	public int getSid() {
		return sid;
	}

	public Student(int sid, String sname, Batch batch, Address addr) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.batch = batch;
		this.addr = addr;
	}
	public Address getAddr() {
		return addr;
	}

	public void setAddr(Address addr) {
		this.addr = addr;
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
	}

	public void setBatch(Batch batch) {
		this.batch = batch;
	}

	@Override
	public String toString() {
		return "Student [sid=" + sid + ", sname=" + sname + ", batch=" + batch + ", addr=" + addr + "]";
	}

	
	/*
	 * @Override public String toString() { return "Student [sid=" + sid +
	 * ", sname=" + sname + ", batch=" + batch + "]"; }
	 * 
	 */
	/*
	 * @Override public String toString() { return "Student [sid=" + sid +
	 * ", sname=" + sname + "]"; }
	 */
}
