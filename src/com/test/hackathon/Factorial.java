package com.test.hackathon;

import java.util.Scanner;

//Q2. write a program to find factorial (Non Recursive) *
public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i, num;
		long fact = 1;
		System.out.println("enter the number");
		Scanner scanner = new Scanner(System.in);
		num = scanner.nextInt();
		scanner.close();
		for (i = 1; i <= num; i++) {
			fact = fact * i;
		}
		System.out.println("Factorial of " + num + " is " + fact);

	}

}
