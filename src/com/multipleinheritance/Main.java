package com.multipleinheritance;

interface One{
	default void show() {
		System.out.println("One");
	}
}
interface Two extends One{
}
interface Three extends One{
}
public class Main implements Two,Three{
	public static void main(String[] args) {
	Main main = new Main();
	main.show();
	}
}
