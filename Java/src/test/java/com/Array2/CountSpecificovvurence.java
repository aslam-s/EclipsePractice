package com.Array2;

public class CountSpecificovvurence {
	public static void main(String[] args) {
		String s = "aslam";
		char c = 'a';
		int count = 0;
		for (int i = 0; i < s.length(); i++) {
			if (c == s.charAt(i)) {
				count++;
			}
		}
		System.out.println("given character is " + count + " times");
	}
}
