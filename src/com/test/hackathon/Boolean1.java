package com.test.hackathon;
//Q1. Consider there is a 3 Boolean variable called a, b, c. 
//Check if at least two out of three Booleans are true *
public class Boolean1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean a = true,b = true,c = false;
		boolean d;
		
		d= a?(b||c):(b&&c);
		System.out.println(d);
		System.out.println((b||c));
		System.out.println(b&&c);
		
	}

}
