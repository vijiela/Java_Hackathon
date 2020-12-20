//Q5. Given an array prints the unique numbers and also print the number of occurrences of duplicate numbers. *
package com.test.hackathon;

import java.util.Scanner;

public class ArrayUniqueDuplicate {

	public static void main(String[] args) {

		System.out.println("enter the array size:");
		int size;
		Scanner sc = new Scanner(System.in);
		size = sc.nextInt();
		int[] arr = new int[size];
		System.out.println("Enter Array elements");
		int i;
		for (i = 0; i < size; i++) {
			arr[i] = sc.nextInt();
		}
		int n = arr.length;

		printUnique(arr, n);
		duplicate(arr, n);

	}

	static void printUnique(int arr[], int n) {
		System.out.println("unique elements are: ");
		for (int i = 0; i < n; i++) {
			int j;
			for (j = 0; j < i; j++)
				if (arr[i] == arr[j])
					break;

			if (i == j)
				System.out.print(arr[i] + " ");
		}
	}

	public static void duplicate(int arr[], int n) {
		System.out.println("\n Duplicate elements in the array : ");
		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j])
					System.out.println(arr[j]);
			}

		}

	}
}
