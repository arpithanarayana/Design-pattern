package com.te.factory;

public class ShoesProduct implements Factory{

	@Override
	public void production() {
		System.out.println("Shoes Production");
	}

}
