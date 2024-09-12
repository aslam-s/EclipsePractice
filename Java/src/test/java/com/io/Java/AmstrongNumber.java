package com.io.Java;

import java.util.Scanner;

public class AmstrongNumber {
	// Amstrong Number 153=(1)3+(5)3+(3)3=153
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = sc.nextInt();
		int ams = 0;
		int rem = 0;
		int x = num;
		while (num > 0) {// 153 1>0,5>0,3>0{
			rem = num % 10; // 153%10=3
			ams = ams + (rem * rem * rem); //
			num = num / 10;
		}
		if (x == ams) {
			System.out.println("Amstrong");
		} else {
			System.out.println("Not Amstrong");
		}

	}

}
