package com.iqsmart;

import java.util.Scanner;

public class StringOperations {
	public static void main(String[] args) {
		System.out.println("enter name");
		Scanner sc = new Scanner(System.in);
		String name2 = sc.next();
		String name1 = new String("srilu");
		// String nmae2 =new String ("SRILU");
		if (name1.compareTo(name2) == 0)
			System.out.println("name 1 and name 2 are same");
		else
			System.out.println("name 1and name2 are dfferent");

		System.out.println("******** substring ***********");
		String mainstr = "My name is, Sreelakshmi";
		String checkstr = "is";
		System.out.println("The substring is:" + mainstr.contains(checkstr));
		System.out.println("The substring is :"+mainstr.indexOf(checkstr));
		if(mainstr.indexOf(checkstr)!=-1) 
			System.out.println("checkstring present in mainstring");
			else
				System.out.println("checkstring is not present in mainstring");
		
		System.out.println("*******  substring using indexof*****");
		System.out.println(mainstr.substring(12));
		System.out.println(mainstr.indexOf(","));
		System.out.println(mainstr.substring(mainstr.indexOf(",")));
		System.out.println("*********substring using begin and  end index ******");
		int startindex=mainstr.indexOf(",")+1+1;
		int endindex=mainstr.indexOf(",")+13;
		System.out.println("The startindex:"+mainstr.indexOf(",")+1+1);
		System.out.println("The endindex:"+mainstr.indexOf(",")+13);
		System.out.println("The substring is :"+mainstr.substring(startindex, endindex));
		
		
		
		char[] chararray=mainstr.toCharArray();
		int i;
		for(i=startindex;i<endindex;i++)
		{
			System.out.print(chararray[i]);
		}
		String str1="          hai hello";
		System.out.println(str1);
		System.out.println(str1.trim());
		int pos;
		int count=0;
		for(pos=0;pos< chararray.length;pos++) {
			if(chararray[pos]=='e')
			count++;
		}
			System.out.println("The number of e is " +count);
		
	}

}