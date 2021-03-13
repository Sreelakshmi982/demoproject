package com.iqsmart;

import java.util.Scanner;

public class A_19 {
	public static void main(String[] args) {
		System.out.println("enter a string ");
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		StringBuilder strblr = new StringBuilder(str);
		System.out.println("The reverse stirng  :" +strblr.reverse());
		//System.out.println(strblr.reverse());
		
		if (str.equalsIgnoreCase(strblr.reverse().toString())) {
			System.out.println("string is palindrome");
		} else {
			System.out.println("string is not palindrome");
		}
	}

}
