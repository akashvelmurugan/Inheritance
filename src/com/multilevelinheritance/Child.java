package com.multilevelinheritance;

public class Child extends Parent{
	public void employeeID() {
		System.out.println("12345");
	}
	public static void main(String[] args) {
		Child child= new Child();
		child.Company();
		child.employeeName();
		child.employeeID();
	}
}	
