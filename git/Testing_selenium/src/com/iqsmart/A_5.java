package com.iqsmart;

import java.util.Scanner;

public class A_5 {
public static void main(String[] args) {
	System.out.println("enter a number");
	Scanner sc = new Scanner(System.in);
	int num = sc.nextInt();
	int factorial=1;
	for (int value =1; value<=num;value++) {
		
		factorial=factorial*value;
	}
		System.out.println("Factorial of a "+num+" number:"+factorial);
	
		
	
	
	
}


}
