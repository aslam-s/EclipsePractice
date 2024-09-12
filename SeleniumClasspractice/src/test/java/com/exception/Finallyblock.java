package com.exception;

import java.io.FileInputStream;

public class Finallyblock {
	public static void main(String[] args) {
		/*
		 * String s = null;// null pointer exception try {
		 * System.out.println(s.length()); } catch (Exception e) {
		 * System.out.println("Handled null ex"); System.out.println(e.getMessage()); }
		 * finally { System.out.println("you entered in to the finallly block"); }
		 * System.out.println("program finished");
		 */

		try {
			FileInputStream fin = new FileInputStream("txtse.txt");
		} catch (Exception e) {
			System.out.println("handle");
			System.out.println(e.getMessage());
		} finally {
			System.out.println("program done");
		}
	}
}
