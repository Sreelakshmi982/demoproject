package com.iqsmart;

import java.util.Scanner;

public class A_21 {
	public static void main(String[] args) {
		System.out.println("enter array size");
		Scanner sc = new Scanner(System.in);
		int size =sc.nextInt();
		int [] array1 = new int[size];
		//int[] age = new int[numOfChildren];
		for(int index =0;index<size;index++)
		{
			array1[index]=sc.nextInt();
			System.out.println("array elements" + +array1[index]);
			
	}
		

}
}