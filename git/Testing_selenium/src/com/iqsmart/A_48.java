package com.iqsmart;

import java.util.Scanner;

public class A_48 {
	public static void main(String[] args) {
		System.out.println("enter first number");
		Scanner sc=new Scanner(System.in);
		int first =sc.nextInt();
		System.out.println("enter second number");
		int second =sc.nextInt();
		add a1=new add();
		int addresult=a1.getadd(first,second);
		//System.out.println(addresult);
		multiplication m1 =new multiplication();
		int mulresult = m1.getmul(first,second);
		//System.out.println(mulresult);
		AddandMul result2= new AddandMul();
		int r3=result2.getaddandmul(first,second);
		System.out.println(r3);
		
	}

}
class add{
	public int getadd(int a,int b) {
		//int a=0;
		//int b=0;
		int c=a+b;
		System.out.println(c);
		return c;
	}
	
}
class multiplication{
	public int getmul(int m1,int m2) {
		//int m1=0;
		//int m2=0;
		int mulresult =m1*m2;
		System.out.println(mulresult);
		return mulresult;
	}
}
class AddandMul{
	public int getaddandmul(int a,int b) {
		//int a=5;
		//int b=6;
		int add1=0;
		int mul1=0;
		if(a>b)
		{
			System.out.println(a+b);
		return add1;
		}
		else {
			System.out.println(a*b);
			return mul1;
		}
		
	}
}