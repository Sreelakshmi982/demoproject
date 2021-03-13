package com.iqsmart;

import java.util.Scanner;

public class A_28 {
	public static void main(String[] args) {
		System.out.println("enter a string");
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		int count = 1;
		for (int index = 0; index < str.length() - 1; index++)

		{
			if ((str.charAt(index) == ' ') && (str.charAt(index + 1) != ' '))
				count++;
			System.out.print(str.charAt(index));

		}
		System.out.println(count);
	}

}
