//Q13. Given a string print the reverse of the string.(Input: Java Code Output: edoC avaJ) *

package com.test.hackathon;

import java.util.Scanner;

public class ReverseString {
	public static void main(String args[]) {
		String s;

		Scanner readString = new Scanner(System.in);
		System.out.print("Enter a String: ");
		s = readString.nextLine();
		readString.close();

		for (int i = s.length(); i > 0; --i) {

			System.out.print(s.charAt(i - 1));

		}
	}
}