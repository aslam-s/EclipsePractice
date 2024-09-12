package com.Array2;

import java.util.Scanner;

public class countdifferentchracter {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		int digitcount = 0;
		int charcter = 0;
		int splcharc = 0;
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if (c >= 'a' && c < 'z' || c >= 'A' && c <= 'B') {
				charcter++;
			} else if (c >= '0' && c <= '9') {
				digitcount++;
			} else {
				splcharc++;
			}

		}
		System.out.println("digitcount is " + digitcount + "charcter is " + charcter + "splcharc is " + splcharc);
	}
}
