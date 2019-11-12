package com.Repil;



public class Main2 {

	/*
	 * Create a Class Main that should be a template for the DogClass. 
In this class, you should specify the following attributes: breed, name, color, and following behaviors: bark(), run(), play().
Create 3 different objects of it: Husky, Bulldog, Labrador with specific attributes and behaviors.

The output of the program should be as following:
 
Husky can bark
Husky can run
Husky can play
Bulldog can bark
Bulldog can run
Bulldog can play
Labrador can bark
Labrador can run
Labrador can play
	 */

	String breed, name,color;

	
	public static void main(String[]args) {
	
		Dog1 d1 = new Dog1();

		d1.name = "Mila";
		d1.breed = "Huskey";
		d1.color = "Black";
		d1.run();
		d1.bark();
		d1.play();

		Dog1 d2= new Dog1();
		
		d2.name = "SUNNY";
		d2.breed = "bulldog";
		d2.color ="white" ;
		d2.run();
		d2.bark();
		d2.play();

		Dog1 d3 = new Dog1();
		
		d3.name = "Lola";
		d3.breed = "Labrador";
		d3.color = "black and white";
		d3.run();
		d3.bark();
		d3.play();
		
		
			}
		}
			

	

