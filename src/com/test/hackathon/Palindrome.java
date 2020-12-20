//Write a program to check palindrome (MalayalaM) for both numbers and string? *
package com.test.hackathon;

import java.util.Scanner;

public class Palindrome {

	public static void main(String args[]) {
		String s, revStr;

		Scanner readString = new Scanner(System.in);
		System.out.print("Enter a String: ");
		s = readString.next();
		//readString.close();
		revStr = reverseString(s);

		if (s.isEmpty()) {
			System.out.println("blank string");

		} else {
			if (s.equalsIgnoreCase(revStr))

				System.out.println(s + " is a Palindrome");

			else
				System.out.println(s + " is not a Palindrome");
		}
		
		int num;
		System.out.println("Enter the number ");
		num= readString.nextInt();		
		 reverseNum(num);
	}

	public static String reverseString(String str) {

		String rev = new String();
		for (int i = str.length() - 1; i >= 0; --i) {
			rev = rev + str.charAt(i);
		}
		return rev;
	}
	public static int reverseNum(int n) {
	 int rem, rev= 0, temp;
	    	 
	        temp = n;	 
	        while( n != 0 )
	        {
	            rem= n % 10;
	            rev= rev * 10 + rem;
	            n=n/10;
	        }
	
	        if (temp == rev)
	            System.out.println(temp + " is a palindrome.");
	        else
	            System.out.println(temp + " is not a palindrome.");
			return temp;
	    }

}




