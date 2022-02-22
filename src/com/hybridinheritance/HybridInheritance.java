package com.hybridinheritance;
class ClassA{
	public void print() {
		System.out.println("ClassA");
	}
	public interface InterfaceB{

		void diplay();
	}
	public interface InterfaceC{

		void diplay();
	}


}

public class HybridInheritance extends ClassA implements InterfaceB,InterfaceC{

	public void display() {
		System.out.println("method implemendetion");
	}








}
