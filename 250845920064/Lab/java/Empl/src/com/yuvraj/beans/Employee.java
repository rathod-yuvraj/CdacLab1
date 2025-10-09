package com.yuvraj.beans;

import java.util.Date;

public class Employee {
	private int empid;
	private String empName;
	private double salary;
	private Date joinDate;
	public Employee(int empid, String empName, double salary, Date joinDate) {
		super();
		this.empid = empid;
		this.empName = empName;
		this.salary = salary;
		this.joinDate = joinDate;
	}
	public Employee() {
		super();
	}
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public Date getJoinDate() {
		return joinDate;
	}
	public void setJoinDate(Date joinDate) {
		this.joinDate = joinDate;
	}
	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", empName=" + empName + ", salary=" + salary + ", joinDate=" + joinDate
				+ "]";
	}
	
	
	
	
	

}
