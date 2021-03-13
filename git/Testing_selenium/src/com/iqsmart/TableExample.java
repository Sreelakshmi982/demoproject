package com.iqsmart;

import java.util.Scanner;

public class TableExample {
	public static void main(String[] args) {
		System.out.println("Enter a number");
		int number = 0;
		try(Scanner scannerInput = new Scanner(System.in);) {
			number = scannerInput.nextInt();
		}
		int range;
		System.out.println(" The table is");
		for (range = 1; range <= 20; range++) {
			int mul = number * range;
			System.out.println(number + "X" + range + "=" + mul);
		}
	}

}