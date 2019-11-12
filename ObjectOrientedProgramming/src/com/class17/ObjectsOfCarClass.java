package com.class17;

public class ObjectsOfCarClass {

	public static void main(String[] args) {
		//to create an Object Syntax is
		//className Variable= new className();
		
		
		
		Car car1=new Car();
		car1.make="Tesla";
		car1.color="Black";
		car1.year=2009;
		car1.wheels=4;
		car1.windows=4;
		car1.speed=200;
		
		car1.start();// calling method start from class car 
		car1.reverse();
		car1.accelerate();
		
		System.out.println("*****************");
		
	
		Car car2=new Car();
		car2.make="BMW";
		car2.color="Gray";
		car2.year=2019;
		car2.wheels=5;
		car2.windows=4;
		car2.speed=300;
		
		car2.drive();
		car2.accelerate();
		
	}
}
