package com.te.singleton;

public class Employee {
	private int id;
	private String name;
	
	private Employee(int id, String name) {
		this.id = id;
		this.name = name;
	}
	
	public static Employee emp = null;
	
	public static Employee getInstance(int id, String name) {
		if(emp==null) {
			emp = new Employee(id, name);
		}
		return emp;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + "]";
	}
}
