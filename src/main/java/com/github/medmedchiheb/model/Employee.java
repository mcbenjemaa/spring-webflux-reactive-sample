package com.github.medmedchiheb.model;

import javax.persistence.Entity;

//@Entity
public class Employee {
	private String id;
	private String name;
	private String phone;
	private double salary;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public Employee() {
		super();
	}
	public Employee(String id, String name, String phone, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.phone = phone;
		this.salary = salary;
	}
	
	
	

}
