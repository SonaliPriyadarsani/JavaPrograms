package com.jp.ObjectClassProgram;

public class Book {

	public static void main(String[] args) {
		LibraryManagementSystem book = new LibraryManagementSystem();
		book.title ="Sample Book" ;
		book.author = "John Doe " ;
		book.isbn = "12345";
		book.displayInfo();

	}

}
