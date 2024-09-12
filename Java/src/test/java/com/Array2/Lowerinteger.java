package com.Array2;

import java.util.Scanner;

public class Lowerinteger {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the String");
		int n1 = s.nextInt();
		System.out.println("Enter the String");
		int n2 = s.nextInt();
		System.out.println("Enter the String");
		int n3 = s.nextInt();
		if (n1 < n2 && n1 < n3) {
			System.out.println("lowest integer is " + n1);
		} else if (n2 < n1 && n2 < n3) {
			System.out.println("lowest integer is " + n2);
		} else {
			System.out.println("lowest integer is " + n3);
		}
	}
}
