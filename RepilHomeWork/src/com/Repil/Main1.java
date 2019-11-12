package com.Repil;

public class Main1 {


	String carColor, CarName;
	int ModelYear;

	public static void main(String[] args) {

		Main1 car1 = new Main1();
		car1.carColor = "Black";
		car1.CarName = "BMW";
		car1.ModelYear = 2019;

		Main1 car2 = new Main1();
		car2.carColor = "White";
		car2.CarName = "Toyota";
		car2.ModelYear = 2018;

		System.out.println("Car color is " + car1.carColor + " and car model year is " + car1.ModelYear
				+ " and car name is " + car1.CarName);
		System.out.println("Car color is " + car2.carColor + " and car model year is " + car2.ModelYear
				+ " and car name is " + car2.CarName);

	}

}
