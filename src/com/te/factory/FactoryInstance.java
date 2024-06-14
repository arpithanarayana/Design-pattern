package com.te.factory;

public class FactoryInstance {
	public static Factory getInstance(String name) {
		if(name.equalsIgnoreCase("ShoesProduct")) {
			return new ShoesProduct();
		} else if(name.equalsIgnoreCase("ClothProduct")) {
			return new ClothProduct();
		} else {
			return null;
		}
	}

}
