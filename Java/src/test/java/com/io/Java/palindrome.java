package com.io.Java;

import java.util.Scanner;

public class palindrome {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String s1 = s.next();
		String rev = "";
		for (int i = s1.length() - 1; i >= 0; i--) {
			rev = rev + s1.charAt(i);
		}
		System.out.println(rev);
		if (s1.equals(rev)) {
			System.out.println("palindrome");

		} else {
			System.out.println("Not palindrome");
		}
	}
}
