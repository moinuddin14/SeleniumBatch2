package com.java.basics;

import org.junit.Test;

public class StaticClass {
	
	public int i = 30;
	public String str = "Hello World!";
	public char c = 'A';
	public static int j = 40;
	
	public void testTwoMethod(){
		System.out.println("Inside the test Two method");
	}
	
	@Test
	public void testThreeMethod(){
		System.out.println("Inside the test Three method");
		System.out.println(StaticClass.j);
	}
	
	@Test
	public void testFourMethod(){
		StaticClass stClass = new StaticClass();
		System.out.println(stClass.i);
		System.out.println(stClass.str);
		//System.out.println(stClass.j);
		System.out.println(StaticClass.j);
	}

}
