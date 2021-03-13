package com.iqsmart;

import java.util.Scanner;

public class PolioChildren {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter array size");
		int numOfChildren = scanner.nextInt();
		int[] age = new int[numOfChildren];
		String[] names = new String[numOfChildren];

		int value;
		for (value = 0; value < numOfChildren; value++) {
			System.out.println("enter children details for ID: " + (value+1));
			System.out.println("Enter age of children");
			age[value] = scanner.nextInt();
			System.out.println("enter name of children");
			names[value] = scanner.next();

		}
		int p;
		
		for (p=0;p<numOfChildren;p++)
		{
			System.out.println(" Children ID" +(p+1));
			System.out.println(" age: " +age[p]);
			System.out.println(" name: " +names[p]);
		}
	}

}
