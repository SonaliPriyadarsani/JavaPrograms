package com.jp.ObjectClassProgram;

public class Player {
	String name ;
	int level ;
	int healthPoints ;
	public void levelUp()
	{
		level++ ;
		System.out.println(level);
	}
}
