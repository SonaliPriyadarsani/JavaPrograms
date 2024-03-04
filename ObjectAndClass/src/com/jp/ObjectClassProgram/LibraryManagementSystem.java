package com.jp.ObjectClassProgram;

public class LibraryManagementSystem {
	String title ;
	String author ;
	String isbn ;
	public void displayInfo()
	{
		System.out.println("Book Information");
		System.out.println("Title : " + title);
		System.out.println("Author : " + author);
		System.out.println("ISBN : " + isbn);
	}
}
