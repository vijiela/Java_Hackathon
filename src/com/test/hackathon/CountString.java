//Q17. WJP to find total number of integers, uppercase and lowercase character in the give string 
package com.test.hackathon;

import java.util.Scanner;

public class CountString {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String with uppercase,Lowercase and number:  ");
		String str = sc.next();
		int upper = 0, lower = 0, number = 0;

		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (ch >= 'A' && ch <= 'Z')
				upper++;
			else if (ch >= 'a' && ch <= 'z')
				lower++;
			else if (ch >= '0' && ch <= '9')
				number++;

		}

		System.out.println("Lower case letters : " + lower);
		System.out.println("Upper case letters : " + upper);
		System.out.println("Number : " + number);
	}

}
