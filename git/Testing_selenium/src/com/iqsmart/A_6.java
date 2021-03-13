package com.iqsmart;

import java.util.Scanner;

public class A_6 {
	public static void main(String[] args) {
//		System.out.println("Enter a start range value");

		Scanner sc = new Scanner(System.in);
		// int startRange = sc.nextInt();
		// System.out.println("Enter a end range value");
		// int endRange = sc.nextInt();
		System.out.println("enter a range to identify prime numbers");
		int range = sc.nextInt();
		// for (int number1 = startRange; number1 <= endRange; number1++) {

		for(int rangeIncrementer = 1;rangeIncrementer<=range;rangeIncrementer++) {
			int number= rangeIncrementer;
			boolean isPrime = isPrimeNumber(number);
			if (isPrime) {
				System.out.println(number + " is a prime");
			} else {
				System.out.println(number + " is not a prime");
			}
		}

	}

	private static boolean isPrimeNumber(int givenNumber) {
		int count = 0;
		boolean isPrime = true;
		if(givenNumber == 0 || givenNumber == 1) {
			isPrime=false;
		}
		for (int incrementValue = 2; incrementValue <= givenNumber; incrementValue++) {

			if (givenNumber % incrementValue == 0) {
				count++;
			}
			if (count > 1) {
				isPrime = false;
				break;
			}
		}
		return isPrime;
	}

}