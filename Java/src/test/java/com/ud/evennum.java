package com.ud;

import java.util.Scanner;

public class evennum {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number");
		int s1 = s.nextInt();
		int even = 0;
		int other = 0;
		if (s1 % 2 == 0) {
			even++;
			System.out.println(even);
		} else {
			System.out.println(other);
		}
	}
}
