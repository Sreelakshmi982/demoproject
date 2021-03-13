package com.iqsmart;

import java.util.Scanner;

public class A_8 {
	public static void main(String[] args) {
		System.out.println("Dynamic Arithmetic Operations Calculation");
		System.out.println("enter first number");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		System.out.println("enter second number");
		int b = sc.nextInt();
		System.out.println("enter arithmetic operation from (+,-,*,/)");
		String arithmeticOperations = sc.next();
		System.out.println("enter arthmetic operator");
		// String arithmeticOperations= "-";
		// String arithmeticOperations= "*";

		switch (arithmeticOperations) {
		case "+":
			System.out.println(a + b);
			break;
		case "-":
			System.out.println(a - b);
			break;
		case "*":
			System.out.println(a * b);
			break;
		case "/":
			System.out.println(a / b);
			break;

		default:
			System.out.println("no operation performed");
		}
	}
}