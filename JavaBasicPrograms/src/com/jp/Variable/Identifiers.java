package com.jp.Variable;
public class Identifiers 
{
	String name ;
	int roolNo ;
	int mark ;
	
	
	public Identifiers(String name, int roolNo, int mark) {
		this.name = name;
		this.roolNo = roolNo;
		this.mark = mark;
	}
	void dispStuDetail()
	{
		System.out.println("Name : " + name + " , Roll No : " + roolNo + " , mark : " + mark);
	}

	public static void main(String[] args) 
	{
		//Creating Object Of The Class
		Identifiers std = new Identifiers("Sonali", 101, 80);
	
		//Calling The Methods
		std.dispStuDetail();
	}
}