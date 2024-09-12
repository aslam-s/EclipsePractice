package com.Array2;

import java.util.Scanner;

public class vowelscharacter {
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		String s1 = s.next();
		// char[] ch = s1.toCharArray();

		for (int i = 0; i < s1.length(); i++) {
			// System.out.print(s1.charAt(i));
			char c = s1.charAt(i);

			if (c == 'a' || c == 'e' || c == 'o' || c == 'i' || c == 'u') {
				System.out.println(c);
			}
		}
	}

}
