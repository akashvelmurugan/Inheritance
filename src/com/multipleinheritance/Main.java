package com.multipleinheritance;

interface One{
	void display();
interface Two {
	void display();
}
class Three implements One,Two{

	@Override
	public void display() {
		
	System.out.println("Display");
		
		
	}
}
public class Main extends Three{

	Main main= new Main();
	
	
}
}
