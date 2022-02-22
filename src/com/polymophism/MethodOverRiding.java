package com.polymophism;

public class MethodOverRiding extends Polymorpism{
@Override
public void mobile() {
System.out.println("Ram GB");
}
@Override
	public void mobileOs() {
System.out.println("Android 12");
}

	
	
	public static void main(String[] args) {
		MethodOverRiding methodOverRiding = new MethodOverRiding();
		methodOverRiding.mobile();
		methodOverRiding.mobileOs();
	}
}
