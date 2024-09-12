package com.io.Java;

import java.util.Scanner;

public class Sumofthedigit {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int num = s.nextInt();
		int result = 0;
		int rem = 0;
		while (num > 0) {
			rem = num % 10;
			result = result + rem;
			num = num / 10;
		}
		System.out.println(result);
	}
}
