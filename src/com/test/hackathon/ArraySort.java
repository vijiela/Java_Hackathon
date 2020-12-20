//Q3. Given an array of integers, sort the integer values. *

package com.test.hackathon;

import java.util.Arrays;
import java.util.Scanner;

public class ArraySort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub:
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

		Arrays.sort(arr);
		System.out.println("the sorted array is:" + Arrays.toString(arr));

	}

}
