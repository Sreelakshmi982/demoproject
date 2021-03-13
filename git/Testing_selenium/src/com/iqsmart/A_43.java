package com.iqsmart;

import java.util.Scanner;

public class A_43 {
	public static void main(String[] args) {
		System.out.println("Enter a year");
		Scanner sc = new Scanner(System.in);
		int year =sc.nextInt();
		if(year%4==0||year%400==0)
		{
			System.out.println("It is a leap year:" +year);}
			else {
				System.out.println("not a leap year:" +year);}
		
	}

}
