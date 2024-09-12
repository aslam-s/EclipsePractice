package com.io.Java;

import java.util.Iterator;

public class CountEachCharacter {
	public static void main(String[] args) {
		String s = "Aslam";
		String s1 = s.toLowerCase();
		char[] arr = s1.toCharArray();
		for (int i = 0; i < arr.length; i++) {
			char ch = arr[i];
			int count = 1;
			for (int j = i + 1; j < arr.length; j++) {
				if (ch == arr[j]) {
					count++;
					arr[j] = 0;

				}

			}
			System.out.println(ch + " " + " present" + count + "times");
		}

	}

}
