package com.Repil;

public class Main {

	
	/*Create a class named 'Main' with String variable 'name' and integer variable 'roll_no'. 

Creating an object of the class Main and assign value of 2 to roll_no and name as "John"

Your program should print the following:
Name is John and roll number is 2
	
	 */
	
	String name;
	int roll_no;
	
	public static void main (String[]args) {
		
		Main person=new Main();
		person.name="John";
		person.roll_no=2;
		
		System.out.println("Name is "+ person.name + " and roll number is "+ person.roll_no);
	}
	
	
	
}
