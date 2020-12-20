//Q8. How can we make String upper case to lower case? *
package com.test.hackathon;

import java.util.Scanner;

public class StringUpToLower {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String Str;
		System.out.println("enter the String:");
		Scanner sc = new Scanner(System.in);
		Str = sc.next();
		System.out.println("The lower case of the String:  " + Str.toLowerCase());
	}
}
