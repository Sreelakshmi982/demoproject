package com.iqsmart;

import java.util.Scanner;

public class A_20 {
public static void main(String[] args) {
	System.out.println("enter a string");
	Scanner sc =new Scanner(System.in);
	String str1 =sc.next();
	System.out.println("enter second string");
	String str2=sc.next();
	if(str1.equals(str2))
	{
		System.out.println("strings are equal");}
		else {
			System.out.println("strings arre not equal");
	}
	
}
}
