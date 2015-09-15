package com.java.basics;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ObjectClass {

	public int i = 20000;
	public String str = "Hello World";
	
	@Test
	public void testOneMethod(){
		System.out.println("Inside the test one method");
		int i = 10;
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"/resources/chromedriver.exe");
		WebDriver driver = new ChromeDriver(); 
		driver.get("http://yahoo.com");
	}
	
	@Test
	public void testTwoMethod(){
		System.out.println("Inside the test Two method");
	}
	
	@Test
	public void testThreeMethod(){
		System.out.println("Inside the test Three method");
	}
	
	@Test
	public void testFourMethod(){
		System.out.println("Inside the test Four method");
	}

}