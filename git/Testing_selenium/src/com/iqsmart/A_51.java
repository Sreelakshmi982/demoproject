package com.iqsmart;

import java.util.Scanner;

public class A_51 {
public static void main(String[] args) {
	System.out.println("enter a range");
	Scanner sc = new Scanner(System.in);
	int range =sc.nextInt();
	for(int index=2;index<range;index++)
	{
	int f=1;
	f=f+index;
	int f1=0;
	int f2;
	f2=f1+f;
	System.out.println(f2);
	}
}
}
