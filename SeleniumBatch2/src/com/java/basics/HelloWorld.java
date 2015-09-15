package com.java.basics;

public class HelloWorld {

	public static void main(String[] args) {

		int[][] arr = new int[2][3];
		
		arr[0][0] = 10;
		arr[0][1] = 11;
		arr[0][2] = 12;
		
		arr[1][0] = 20;
		arr[1][1] = 21;
		arr[1][2] = 22;
		
		for(int i = 0;i<arr.length;i++){
			
			for(int j = 0;j<arr[0].length;j++){
				System.out.println(arr[i][j]);
			}
			
		}
 	}

}