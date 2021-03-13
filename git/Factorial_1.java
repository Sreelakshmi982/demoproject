package com.iqsmart.other;

import java.util.Scanner;

public class Factorial_1 {
	public static void main(String[] args) {
		System.out.println("Enter a number");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		for (int factor = 1; factor <= num; factor++) {
			if (num % factor == 0) {
				System.out.println("factors are :" + factor);
				System.out.println("factors are :" + factor);
				System.out.println("factors are :" + factor);
			}
		}

	}
}


