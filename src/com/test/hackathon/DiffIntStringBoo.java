//Q23. WJP to differentiate input as string, int or bool *

package com.test.hackathon;

public class DiffIntStringBoo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		show("java");
		show(1234);
		show(true);
	}

	public static void show(Object obj) {

		if (obj instanceof Integer) {
			System.out.println("The input value is Integer:" + (Integer) obj);
		} else if (obj instanceof String) {
			System.out.println("The input is string :" + (String) obj);
		} else if (obj instanceof Boolean) {
			System.out.println("the input is boolean :" + (Boolean) obj);
		}
	}

}
