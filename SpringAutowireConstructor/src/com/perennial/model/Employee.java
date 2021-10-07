package com.perennial.model;

public class Employee {
	private int employeeId;
	private String employeeName;
	private String emailId;
	private Pancard pancard;
	public Employee(int employeeId, String employeeName, String emailId, Pancard pancard) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.emailId = emailId;
		this.pancard = pancard;
	}
	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", employeeName=" + employeeName + ", emailId=" + emailId
				+ ", pancard=" + pancard + "]";
	}

	

}
