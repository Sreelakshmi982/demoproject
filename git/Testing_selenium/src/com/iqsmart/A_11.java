package com.iqsmart;

import java.util.Scanner;
import java.util.regex.Matcher;

public class A_11 {
	public static void main(String[] args) {
		System.out.println(" finding alphabets from Alpha numeric string ");
		System.out.println("enter a string");
		Scanner sc = new Scanner(System.in);
		String str1 = sc.next();
		char[] chararray = str1.toCharArray();
		for (char str2 : chararray)
			System.out.println(str2);
		int count = 0;
		int count1=0;
		for (int index = 0; index < chararray.length; index++) {

			if (('a' <= (int) chararray[index] && 'z' >= (int) chararray[index])
					|| ('A' <= (int) chararray[index] && 'Z' >= (int) chararray[index])) {
				count++;
			}
		
		//System.out.println("the numbers in given string " + count);
		if(48<=chararray[index]&&57>=chararray[index]) {
		count1++;
		}
		}
		System.out.println("the alphabets in given string " + count);
		System.out.println("the numbers in given string " + count1);
	}
}
