package com.iqsmart;

import java.util.Scanner;

public class Array {
	public static void main(String[] args) {
		Scanner ScannerInput = new Scanner(System.in);
		System.out.println("enter array size:");
		int[] num = new int[ScannerInput.nextInt()];
		int index;
		for (index = 0; index < num.length; index++) {
			System.out.println("enter value for index: " + index);
			num[index] = ScannerInput.nextInt();
		}
		for (index = 0; index < num.length; index++) {
			System.out.println(num[index]);
		}
	}
}
