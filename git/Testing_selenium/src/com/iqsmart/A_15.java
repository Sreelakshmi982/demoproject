package com.iqsmart;

import java.util.Scanner;

public class A_15 {
	char character1;
	public static void main(String[] args) {
		System.out.println("enter ascii value");
		Scanner sc = new Scanner(System.in);
		int value = sc.nextInt();
		Ascii asciivalue2 = new Ascii();
		char c1 = asciivalue2.getascii(value);
		System.out.println(c1);
	}
}
class Ascii {
	public char getascii(int value) {
		char value1 =(char) value;
		return value1;
	}
}
