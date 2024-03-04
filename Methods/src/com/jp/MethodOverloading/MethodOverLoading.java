package com.jp.MethodOverloading;

public class MethodOverLoading {

	public static void main(String[] args) 
	{
		getTea();
		getTea(10);
		getTea("Ginger");
		getTea(5 , "Green");
	}

	private static void getTea(int quantity, String type) {
		System.out.println("Bill For " + quantity + " " + type + " Teas Is " + (quantity*10) + "RS");
	}

	private static void getTea(String type) {
		System.out.println("Bill for " + type +" Teas Is 15RS");
	}

	private static void getTea(int quantity) {
		System.out.println("Bill For " + quantity + " Teas Is " + (10*quantity) + "RS");
	}

	private static void getTea() {
		System.out.println("Bill For Tea Is 10rs");
	}
	
}
