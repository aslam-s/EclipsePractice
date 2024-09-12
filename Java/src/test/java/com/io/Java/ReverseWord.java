package com.io.Java;

public class ReverseWord {
	public static void main(String[] args) {
		String s1 = "welcome to colan";
		String[] sp = s1.split(" ");
		String rev = "";
		for (int i = sp.length - 1; i >= 0; i--) {
			System.out.println(sp[i]);
		}
	}
}
