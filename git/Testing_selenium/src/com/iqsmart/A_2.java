package com.iqsmart;

import java.util.Scanner;

public class A_2 {
	public static void main(String[] args) {
		System.out.println("Enter a number");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		if (num % 2 != 0) {
			System.out.println("number is odd");
		} else {
			System.out.println("number is even");
		}

	}

}
