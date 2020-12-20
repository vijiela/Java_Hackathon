//Q4. Given an array of integers check the Palindrome of the series. 
package com.test.hackathon;

import java.util.Scanner;

public class ArrayPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter the array size:");
		int size, sI, eI;
		Scanner sc = new Scanner(System.in);
		size = sc.nextInt();
		int[] arr = new int[size];
		System.out.println("Enter Array elements");
		int i;
		for (i = 0; i < size; i++) {
			arr[i] = sc.nextInt();
		}

		palindrome(arr, size);
	}

	public static void palindrome(int arr[], int n) {

		int flag = 0;

		for (int i = 0; i <= n / 2 && n != 0; i++) {

			if (arr[i] != arr[n - i - 1]) {
				flag = 1;
				break;
			}
		}

		if (flag == 1)
			System.out.println("The array is not Palindrome");
		else
			System.out.println("The array is Palindrome");
	}

}