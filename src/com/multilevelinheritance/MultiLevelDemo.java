package com.multilevelinheritance;

import java.awt.CardLayout;
class vehicle {
	void ride(){

	}
}
class Car extends vehicle {
	void ride() {
		System.out.println("You Are Drive Car");
	}
}
class Bike extends vehicle{
	void ride() {
		System.out.println("You Are Drive Bike");
	}
}
class mechanic{
	void check(vehicle c){
		System.out.println("Checking");
		c.ride();
	}
}
public class MultiLevelDemo {
	public static void main(String[] args) {
		mechanic mechanic= new mechanic();
		Car c= new Car();
		mechanic.check(c);
		Bike bike = new Bike();
		mechanic.check(bike);
	}
}
