//Q6. WJP to perform ascending order Selection sort *

package com.test.hackathon;

import java.util.Arrays;
import java.util.Scanner;

public class SelectionsSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
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
		sort(arr);
		System.out.println("Selection sort Array valuse :"+Arrays.toString(arr));
	}

	public static void sort(int[] array) {
		int i, j, minValue, minIndex, temp = 0;
		for (i = 0; i < array.length; i++) {
			minValue = array[i];
			minIndex = i;
			for (j = i; j < array.length; j++) {
				if (array[j] < minValue) {
					minValue = array[j];
					minIndex = j;
				}
			}
			if (minValue < array[i]) {
				temp = array[i];
				array[i] = array[minIndex];
				array[minIndex] = temp;
			}
		}
	}

}
