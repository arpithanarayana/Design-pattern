package com.te.prototype;

public class EmployeeMain {
	public static void main(String[] args) {
		Employee employee1 = new Employee(101, "smith");
		Employee employee2 = null;
		try {
			employee2 = (Employee) employee1.clone();
		} catch(Exception e) {
			e.printStackTrace();
		}
		System.out.println(employee1);
		System.out.println(employee2);
	} 

}
