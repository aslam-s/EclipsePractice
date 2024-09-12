package com.io.Java;

import java.util.Scanner;

public class GreatestThreeInt {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the first");
		int n1 = s.nextInt();
		System.out.println("Enter the sec");

		int n2 = s.nextInt();
		System.out.println("Enter the third");

		int n3 = s.nextInt();

		if (n1 > n2 && n1 > n3) {
			System.out.println("greatest  Integer " + n1);

		} else if (n2 > n1 && n2 > n3) {
			System.out.println("greatest  integer is " + n2);
		} else {
			System.out.println("greatest  integer is " + n3);
		}
	}
}
