//Q19. WJP to display number of occurrence of all character *
package com.test.hackathon;

import java.util.Scanner;

public class CharOccurance {
	static void getOccuringChar(String str) {
		int count[] = new int[256];

		int len = str.length();
		for (int i = 0; i < len; i++)
			count[str.charAt(i)]++;
		char ch[] = new char[str.length()];
		for (int i = 0; i < len; i++) {
			ch[i] = str.charAt(i);
			int find = 0;
			for (int j = 0; j <= i; j++) {

				if (str.charAt(i) == ch[j])
					find++;
			}

			if (find == 1)
				System.out.println("Number of Occurrence of " + str.charAt(i) + " is:" + count[str.charAt(i)]);
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string: ");
		String str = sc.nextLine();
		getOccuringChar(str);
	}
}
