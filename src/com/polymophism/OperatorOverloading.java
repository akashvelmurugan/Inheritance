package com.polymophism;

public class OperatorOverloading {
	private void string(String string,String string2) {

		System.out.println(string+string2);
	}
	private void number(int i,int j) {
		System.out.println(i+j);
	}

	public static void main(String[] args) {
		OperatorOverloading operatorOverloading= new OperatorOverloading();
		operatorOverloading.string("java", "program");
		operatorOverloading.number(10, 20);
	}
}
