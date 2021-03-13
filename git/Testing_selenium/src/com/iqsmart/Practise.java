package com.iqsmart;

import java.util.Scanner;

public class Practise {
	public static void main(String[] args) {
		
		System.out.println("enter array size");
		Scanner sc=new Scanner(System.in);
	int size= sc.nextInt();	
	int []num=new int[size];
	int index;
	for(index=0;index<num.length;index++)
	{
		System.out.println("enter value for index value"+index);
		num[index]=sc.nextInt();
		
	}
	for (int pos =0;pos<num.length;pos++)
	{
		System.out.print(" " +num[pos]);
		
	}
	}

}
