package com.exception;

import java.util.Scanner;

public class HandlesException {
	public static void main(String[] args) {
		System.out.println("enter the number");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		// Arithmetic Exception
		try {
			System.out.println(100 / num);
		} catch (ArithmeticException e) {
			System.out.println("invalid data");
		}
		System.out.println("completed");
		System.out.println("exited");
	}
}
