package com.class17;

public class Computer {

	
	String make, color,brand,name;
	int year, wheels, windows, speed,screen,memory;
	Boolean hasKeyboard=true;
	public boolean keyboard;
	
	
	void coding() {
		System.out.println(this.name + "is coding ");
	}
	
	void WatchingMovies() {
		System.out.println("Computer has movies");
	}
	void PlayGames() {
		System.out.println("We r playing games in the computer");
	}
	
	///////////////////////////////////////////////////
	
	public static void main(String[] args) {
		
	
	Computer comp1=new Computer();
	comp1.brand="Apple";
	comp1.name="Macbook Pro";
	comp1.memory=879;
	
	// main method is always the starting point of the code execution.
	System.out.println(comp1.brand+comp1.name+ comp1.memory);
	comp1.WatchingMovies();
	comp1.PlayGames();
	
	
	
}}
