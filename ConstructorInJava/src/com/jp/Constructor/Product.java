package com.jp.Constructor;

public class Product {
	String pname ;
	int price ;
	int quantityInStock ;
	public Product(String pname, int price, int quantityInStock) {
		this.pname = pname;
		this.price = price;
		this.quantityInStock = quantityInStock;
	}
	public void displayProductInfo()
	{
		System.out.println();
	}
}
