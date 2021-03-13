package com.iqsmart;

import java.util.Date;
import java.util.Scanner;

public class A_16_17 {
public static void main(String[] args) {
	System.out.println("enter a string");
	Scanner sc = new Scanner(System.in);
	String str = sc.next();
	//String str1 = sc.next();
	System.out.println(str.toLowerCase());
	System.out.println(str.toUpperCase());
	Date date= new Date();
	System.out.println(date);
}
}
