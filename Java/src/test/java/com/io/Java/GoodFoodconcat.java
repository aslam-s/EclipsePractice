package com.io.Java;

public class GoodFoodconcat {
	public static void main(String[] args) {
		String s1 = "Good";
		String s2 = "Food";
		char[] c1 = s1.toCharArray();
		char[] c2 = s2.toCharArray();
		for (int i = 0; i < c2.length; i++) {
			System.out.print(c1[i] + "" + c2[i]);

		}
	}
}
