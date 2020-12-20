//Q28. WJP to find factorial of a number using recursion *
package com.test.hackathon;

import java.util.Scanner;

public class FactorialRecursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number to find Factorial :");
		long n = sc.nextLong();
		Fact(n);
		System.out.println("Factorial of " + n + " is " + Fact(n));

	}

	public static long Fact(long n) {
		if (n == 1)
			return 1;
		else
			return (n * Fact(n - 1));
	}
}
