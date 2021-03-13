package com.iqsmart;

import java.util.Scanner;

public class A_10 {
	
	public static void main(String[] args) {
		System.out.println("enter a string ");
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		StringBuilder strblr = new StringBuilder(str);
		System.out.println("The reverse stirng  :" +strblr.reverse());
	
		
	}

}