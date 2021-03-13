package com.iqsmart;

import java.util.Scanner;

public class OddNumber {
	public static void main(String[] args) {
		System.out.println("enter first range number");
		Scanner sc = new Scanner(System.in);
		int first = sc.nextInt();
		System.out.println("enter second rane number");
		int second = sc.nextInt();
		int num;
		for (num = first; num > second; num--) {
			if (num % 2 == 1)
				System.out.println(num);
		}

	}
}