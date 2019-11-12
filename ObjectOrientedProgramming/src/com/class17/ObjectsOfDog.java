package com.class17;

public class ObjectsOfDog {

	public static void main(String[] args) {

		Dog Huskey = new Dog();

		Huskey.name = "Mila";
		Huskey.Age = 2;
		Huskey.Weight = 20;

		Huskey.runFast();
		Huskey.Hunt();
		Huskey.Sleepy();

		Dog Bulldog = new Dog();
		Bulldog.name = "Kevin";
		Bulldog.Age = 7;
		Bulldog.Weight = 78;

		Dog Labrador = new Dog();
		Labrador.name = "Lola";
		Labrador.Age = 5;
		Labrador.Weight = 30;
		Labrador.runFast();

	}

}
