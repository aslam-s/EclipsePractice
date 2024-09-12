package com.Array2;

import java.util.Scanner;

public class PrimeNumber {
	public static void main(String[] args) {

		System.out.println("Welcome to Prime!\nPlease enter a number:");

		Scanner Scan = new Scanner(System.in);
		int number = Scan.nextInt();
		System.out.println(number);

		if (number % 1 == number && number % number == 1) {
			System.out.println(number + " is a prime num");
		}
	}
}
