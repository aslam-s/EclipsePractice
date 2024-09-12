package com.io.Java;

public class ArrayReverse {
	public static void main(String[] args) {
		int arr[] = { 4, 8, 1, 5, 6, 3, 7, 9, 2 };
		for (int i = arr.length - 1; i >= 0; i--) {
			System.out.print(arr[i]);
		}
	}
}
