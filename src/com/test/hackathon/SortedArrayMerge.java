//Q32. You are given two sorted arrays, A and B, and A has a large enough 
//bu#er at the end to hold B. Write a method to merge B into A in sorted order.

package com.test.hackathon;

import java.util.Scanner;

public class SortedArrayMerge {
	public static void main(String[] args) {
		System.out.println("enter the 1sr array size:");
		int size;
		Scanner sc = new Scanner(System.in);
		size = sc.nextInt();
		int[] arr1 = new int[size];
		System.out.println("Enter 1st sorted Array elements");
		int i1;
		for (i1 = 0; i1 < size; i1++) {
			arr1[i1] = sc.nextInt();
		}
		System.out.println("enter the 2nd array size:");
		int size2;
		// Scanner sc = new Scanner(System.in);
		size2 = sc.nextInt();
		int[] arr2 = new int[size2];
		System.out.println("Enter 2nd sorted Array elements");
		int j;
		for (j = 0; j < size2; j++) {
			arr2[j] = sc.nextInt();
		}

		int n1 = arr1.length;
		int n2 = arr2.length;

		int[] arr3 = new int[n1 + n2];

		mergeArrays(arr1, arr2, n1, n2, arr3);

		System.out.println("Array after merging");
		for (int i = 0; i < n1 + n2; i++)
			System.out.print(arr3[i] + " ");
	}

	// Merge arr1[0..n1-1] and arr2[0..n2-1]
	// into arr3[0..n1+n2-1]
	public static void mergeArrays(int[] arr1, int[] arr2, int n1, int n2, int[] arr3) {
		int i = 0, j = 0, k = 0;

		// Traverse both array
		while (i < n1 && j < n2) {
			// Check if current element of first
			// array is smaller than current element
			// of second array. If yes, store first
			// array element and increment first array
			// index. Otherwise do same with second array
			if (arr1[i] < arr2[j])
				arr3[k++] = arr1[i++];
			else
				arr3[k++] = arr2[j++];
		}

		// Store remaining elements of first array
		while (i < n1)
			arr3[k++] = arr1[i++];

		// Store remaining elements of second array
		while (j < n2)
			arr3[k++] = arr2[j++];
	}

}
