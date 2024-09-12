package com.io.Java;

public class ReverseEachCharacter {
	public static void main(String[] args) {
		String s1 = "welcome to colan";
		String[] sp = s1.split(" ");
		String rev = "";
		for (int i = 0; i < sp.length; i++) {
			String s2 = sp[i];
			for (int j = s2.length() - 1; j >= 0; j--) {
				rev += s2.charAt(j);

			}
			rev += " ";
		
		}
		System.out.println(rev);
	}
}
