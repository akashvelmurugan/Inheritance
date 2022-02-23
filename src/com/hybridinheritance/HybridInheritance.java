package com.hybridinheritance;

class firstClass{
	void methodFirstClass(){

	}
}
interface One{
	void methodInterface();
}
interface two{
	void methodInterface();
}
class three extends firstClass implements One,two{
	@Override
	void methodFirstClass() {
		System.out.println("Class Three");
	}
	@Override
	public void methodInterface() {
		System.out.println("INTERFACE");
	}
}
public class HybridInheritance extends three{
public static void main(String[] args) {
	HybridInheritance hybridInheritance= new HybridInheritance();
	hybridInheritance.methodFirstClass();
	hybridInheritance.methodInterface();
	
	
	
	
	
}	
}
