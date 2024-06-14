package com.te.singleton;

public class EmployeeMain {
	public static void main(String[] args) {
		Employee employee = Employee.getInstance(101, "king");
		System.out.println(employee);
		Employee employee2 = Employee.getInstance(102, "smith");
		System.out.println(employee2);
	}

}
