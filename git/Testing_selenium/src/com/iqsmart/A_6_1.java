package com.iqsmart;

import java.util.Scanner;

public class A_6_1 {
	public static void main(String[] args) {
		
		System.out.println("Prime Number Program");
		System.out.println("enter a number to get prime number with in a range");
		Scanner sc = new Scanner(System.in);
		int range = sc.nextInt();
		for(int i=0;i<=range;i++) {
			isPrimeNumber(i);
		}

	}

	private static void isPrimeNumber(int i) {
		int num = i;
		int count = 0;
		for (int n = 1; n <= num; n++) {
			if (num % n == 0) {
				count++;
			}
		}
		if (num == 1 || num == 0) {
			System.out.println(num + " neither prime nor composite");
		} else if (count > 2) {
			System.out.println(num + " not prime number");
		} else {
			System.out.println(num + " is prime number");
		}
	}

}
