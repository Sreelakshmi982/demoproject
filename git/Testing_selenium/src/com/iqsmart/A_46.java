package com.iqsmart;

public class A_46 {
public static void main(String[] args) {
	double dbvalue =99.876;
	System.out.println("double number is :" +dbvalue);
	String str = String.valueOf(dbvalue);
	System.out.println("by using split method");
	String [] str2 =str.split(".");
	for (String s : str2)
		System.out.println(s);
	System.out.println("by using substring method");
	int indexvalue = str.indexOf(".");
	System.out.println("The decimal part is :" +str.substring (indexvalue));
	System.out.println("the number before decimal :" +str.substring(0,indexvalue));
	

	
	
	}
}
