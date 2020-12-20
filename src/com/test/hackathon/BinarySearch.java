//Q25. Write a program for binary search. And 5 i/p has to take from user as binary elements. *
package com.test.hackathon;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {
	public static void main(String args[]) {
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
		System.out.println("Enter the Key element  :");
		int key = sc.nextInt();
		int result = Arrays.binarySearch(arr, key);
		if (result < 0)
			System.out.println("Element is not found!");
		else
			System.out.println("Element is found at index: " + result);
	}

}
