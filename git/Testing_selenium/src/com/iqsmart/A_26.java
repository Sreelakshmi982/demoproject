package com.iqsmart;

import java.util.Scanner;

public class A_26 {
	public static void main(String[] args) {
		System.out.println("enter a string");
		Scanner sc = new Scanner(System.in);
		String str =sc.next();
		char[] strarray =str.toCharArray();
		for(char s1:strarray)
			{ 
			System.out.println(s1);
			}
	}

}
