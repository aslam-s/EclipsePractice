package com.Array2;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the string 1");
		 String s1 = s.next();
		System.out.println("Enter the string 2");
		String s2 = s.next();
		char[] c1 = s1.toCharArray();
		char[] c2 = s2.toCharArray();
		Arrays.sort(c1);
		Arrays.sort(c2);
		if (Arrays.equals(c1, c2)) {
			System.out.println("Anagram");

		} else {
			System.out.println("Not anagram");
		}

	}
}
