//Q16. Write a method that will remove given character from the String? 
package com.test.hackathon;

import java.util.Scanner;

public class CharRemoveString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the string :");
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		System.out.println("Enter the character to be removed: ");
		String ch = sc.next();
		String newStr = str.replace(ch, "");
		System.out.println(newStr);

	}

}
