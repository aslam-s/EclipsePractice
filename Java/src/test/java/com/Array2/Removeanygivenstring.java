package com.Array2;

public class Removeanygivenstring {
	public static void main(String[] args) {
		String s = "colan";
		String s1 = "";
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if (c == 'a') {
				continue;

			}
			System.out.println(c);
			s1 = s1 + c;
		}
		System.out.println(s1);
	}
}
