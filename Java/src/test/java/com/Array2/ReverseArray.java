package com.Array2;

public class ReverseArray {
	public static void main(String[] args) {
		int[] num = { 4, 2, 8, 1, 6, 7, 3 };
		for (int i = 0; i < num.length; i++) {
			System.out.println(num[i] + " ");
		}
		System.out.println();
		for (int i = num.length - 1; i >= 0; i--) {
			System.out.print(num[i]);
		}
	}
}
