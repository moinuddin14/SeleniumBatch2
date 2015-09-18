package com.java.oops;

public class InheritanceChildClass extends InheritanceParentClass {

	public static void main(String[] args) {
		
	}
	
	//House - Lay a carpet, Central AC, Sealing, Solar Panel, Car Parking Space
	
	@Override
	public void houseMethod(){
		System.out.println("Inside Parent House Method");
		layACarpet();
		centralAC();
		solarPanel();
	}
	
	public void layACarpet(){
		System.out.println("Furnished the house with a new Carpet");
	}
	
	public void centralAC(){
		System.out.println("Installed a new AC System");
	}
	
	public void solarPanel(){
		System.out.println("Installed new Solar Panel");
	}
}