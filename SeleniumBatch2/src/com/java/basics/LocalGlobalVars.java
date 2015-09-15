package com.java.basics;

public class LocalGlobalVars {

	public static int i = 30;
	
	public static void main(String[] args) {

		int i = 20;
		System.out.println(i);
		testOne();
	}

	public static void testOne(){
		
		System.out.println("Inside the method name testOne");
		System.out.println(i);
	}
	
}