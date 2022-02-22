package com.polymophism;

public class MethodOverLoading {
	private void studentName(String name) {
		System.out.println("STUDENT NAME :"+name);
	}
	public void studentId(int id) {
		System.out.println("STUDENT ID :"+id);
	}	
	private void studentAgeAndPhone(int age,long phone) {
		System.out.println("STUDENT AGE :"+age+" STUDENT PHONENUMBER : "+phone);
	}
	public void studentDepartment(String department) {
		System.out.println("STUDENT DEPARTMENT :"+department);
	}	
	public static void main(String[] args) {
		MethodOverLoading loading= new MethodOverLoading();
		loading.studentName("Saravana");
		loading.studentId(12345);
		loading.studentAgeAndPhone(20, 9876543210l);
		loading.studentDepartment("Computer Science");	
	}
}