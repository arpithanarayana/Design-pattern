package com.te.builder;

public class EmployeeBuilder {
	private int id;
	private String name;
	public EmployeeBuilder() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public EmployeeBuilder id(int id) {
		this.id = id;
		return this;
	}
	
	public EmployeeBuilder name(String name) {
		this.name = name;
		return this;
	}
	
	public Employee build() {
		return new Employee(this.id, this.name);
	}
	
}
