package com.iqsmart;

import java.util.Scanner;

public class Denominations {
	public static void main(String[] args) {
		System.out.println("enter a positive number");
		Scanner number = new Scanner(System.in);
		int amount = number.nextInt();
		//int amount;
		//amount = number.nextInt();
		int[] currency = { 2000, 500, 200, 100, 20, 10, 5, 2, 1 };
		int index = 0;
		while (amount > 0) {
			int countQuotient;
			countQuotient = amount / currency[index];
			amount = amount % currency[index];
			System.out.println("no of " + currency[index] + " notes: " + countQuotient);
			index++;
		}
	}
}
