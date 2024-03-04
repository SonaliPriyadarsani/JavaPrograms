package com.kn.ConstructorOverloading;
public class DogObject 
{
	public static void main(String[] args) 
	{
		Dog d1  = new Dog();
		d1.bark();
		d1.sleep();
		d1.eat();
		
		System.out.println();
		
		Dog d2  = new Dog("Lius");
		d2.bark();
		d2.sleep();
		d2.eat();
		
		System.out.println();
		
		Dog d3  = new Dog(6);
		d3.bark();
		d3.sleep();
		d3.eat();
		
		System.out.println();
		
		Dog d4  = new Dog("Ritu" , 8);
		d4.bark();
		d4.sleep();
		d4.eat();
		
		System.out.println();
		
		Dog d5  = new Dog("Moti" , "GP");
		d5.bark();
		d5.sleep();
		d5.eat();
		
		System.out.println();
		
		Dog d6  = new Dog(8 , "Niki");
		d6.bark();
		d6.sleep();
		d6.eat();
		
		System.out.println();
		
		Dog d7  = new Dog("Mitu" , 4 , "GP") ;
		d7.bark();
		d7.sleep();
		d7.eat();
		
		System.out.println();
		
		Dog d8  = new Dog(1 , "Mk" , "Blue");
		d8.bark();
		d8.sleep();
		d8.eat();
		
        System.out.println();
		
		Dog d9  = new Dog("Kiri" , "Hp" , 7);
		d9.bark();
		d9.sleep();
		d9.eat();
		
		System.out.println();
		
		Dog d10  = new Dog("Siku" , "Np" , "Red");
		d10.bark();
		d10.sleep();
		d10.eat();
		
        System.out.println();
		
		Dog d11  = new Dog("Sumi" , 8 , "Er" , "Blue");
		d11.bark();
		d11.sleep();
		d11.eat();
		
        System.out.println();
		
		Dog d12  = new Dog(4 ,"Numi" , "Russian" ,  "Black");
		d12.bark();
		d12.sleep();
		d12.eat();
		
        System.out.println();
		
		Dog d13  = new Dog("Voni" ,"Itili" , 1 ,  "White");
		d13.bark();
		d13.sleep();
		d13.eat();
		
        System.out.println();
		
		Dog d14  = new Dog("Ciki" , "Dius" ,  "Violet" , 3);
		d14.bark();
		d14.sleep();
		d14.eat();
	}
}