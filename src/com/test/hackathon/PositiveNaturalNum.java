//Q24. Write a program which inputs a positive natural number N and prints the possible consecutive number 
//combinations, which when added give N. INPUT: N = 9 OUTPUT: 4 + 5 2 + 3+ 4 *
package com.test.hackathon;

import java.util.Scanner;

public class PositiveNaturalNum {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number : ");
		int n = sc.nextInt();
		int sum = 0, c = 0, j = 0;
		for (int i = 1; i < n; i++) {
			sum = i;
			j = i + 1;
			while (sum < n) {
				sum = sum + j;
				j++;
			}
			if (sum == n) {
				for (int k = i; k < j; k++) {
					if (k == i)
						System.out.print(k);
					else
						System.out.print(" + " + k);
				}
				System.out.println();
			}
		}
	}

}
