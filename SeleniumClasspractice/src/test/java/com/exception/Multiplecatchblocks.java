package com.exception;

public class Multiplecatchblocks {
	public static void main(String[] args) {
		String s = null;// null pointer exception
		try {
			System.out.println(s.length());
		}
		/*
		 * catch (ArithmeticException e) { System.out.println("Handled A ex");
		 * System.out.println(e.getMessage()); } catch (NullPointerException e) {
		 * System.out.println("Handled null ex"); System.out.println(e.getMessage()); }
		 * catch (NumberFormatException e) { System.out.println("Handled number ex");
		 * System.out.println(e.getMessage()); }
		 */
		catch (Exception e) {
			System.out.println("Handled null ex");
			System.out.println(e.getMessage());
		}
		System.out.println("completed");
	}
}
