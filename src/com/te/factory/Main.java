package com.te.factory;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the product name");
		String name = scan.next();
		
		Factory factory = FactoryInstance.getInstance(name);
		factory.production();
	}

}
