package com.hybridinheritance;

class FirstClass{
	void methodFirstClass(){
	}
}
interface One{
	void methodInterface();
}
interface Two{
	void methodInterface();
}
class Three extends FirstClass implements One,Two{
	@Override
	void methodFirstClass() {
		System.out.println("Class Three");
	}
	@Override
	public void methodInterface() {
		System.out.println("INTERFACE");
	}
}
public class HybridInheritance extends Three{
public static void main(String[] args) {
	HybridInheritance hybridInheritance= new HybridInheritance();
	hybridInheritance.methodFirstClass();
	hybridInheritance.methodInterface();		
}
}
