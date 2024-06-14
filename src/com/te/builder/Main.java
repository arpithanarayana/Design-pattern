package com.te.builder;

public class Main {
	public static void main(String[] args) {
		Employee employee = new Employee(101, "king");
		Employee employee2 = new EmployeeBuilder().id(102).name("smith").build();
		System.out.println(employee);
		System.out.println(employee2);
	}

}
