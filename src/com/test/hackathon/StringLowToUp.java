//Q9. How can we make String Lower case to Upper case? *
package com.test.hackathon;

import java.util.Scanner;

public class StringLowToUp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String Str;
		System.out.println("enter the String:");
		Scanner sc = new Scanner(System.in);
		Str = sc.next();
		System.out.println("The Upper case of the String:  " + Str.toUpperCase());

	}

}
