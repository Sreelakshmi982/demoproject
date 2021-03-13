package com.iqsmart;

import java.util.Scanner;

public class A_23 {
	public static void main(String[] args) {
		System.out.println("enter array size");
		Scanner sc =new Scanner(System.in);
		int size=sc.nextInt();
		int[] num = new int [size];
		for (int index=0;index<size;index++)
		{
			num[index]=sc.nextInt();
			//System.out.println(num[index]);
		}
		for (int index=0;index<size;index++)
		{
			for(int index1=index+1;index1<size;index1++)
			{
				int temp;
				if(num[index]>num[index1])
				{
					temp=num[index];
				num[index]=num[index1];
				num[index1]=temp;
				}
				
			}
		}
		System.out.println(" after sorting array elements are");
		for(int i1:num)
			System.out.println(i1);
	}

}
