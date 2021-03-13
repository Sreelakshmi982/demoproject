package com.iqsmart;

import java.util.Scanner;

public class A_3 {
	public static void main(String[] args) {
		System.out.println("Enter a start range value");

		Scanner sc = new Scanner(System.in);
		int startRange = sc.nextInt();
		System.out.println("Enter a end range value");
		int endRange = sc.nextInt();
		for (int number = startRange; number <= endRange; number++) {

			if (number % 2 != 0) {
				System.out.println("odd numbers  are :" + number);
			}
		}

	}

}