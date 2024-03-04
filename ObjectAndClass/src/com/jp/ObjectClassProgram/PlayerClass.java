package com.jp.ObjectClassProgram;

public class PlayerClass {

	public static void main(String[] args) {
		Player p = new Player();
		p.name = "Virat" ;
		p.level = 5 ;
		p.healthPoints = 4 ;
		System.out.println(p.name);
		System.out.println(p.level);
		System.out.println(p.healthPoints);
		p.levelUp();

	}

}
