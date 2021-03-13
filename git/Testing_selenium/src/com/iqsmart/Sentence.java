package com.iqsmart;

public class Sentence {
public static void main(String[] args) {
	String str="Hi dear How are you.? When are you coming to India?";
	String checkstr =" ";
	String[] splitarray= str.split(checkstr);
	for(int index=0;index<splitarray.length;index++)
	{
		System.out.println(splitarray[index]);
		//StringBuilder newaaray = new StringBuilder(splitarray[index]);
		//System.out.println(newaaray.reverse());
		
	}
	
	//System.out.println(splitarray[]);
	//System.out.print(str.substring(2)); 
	System.out.println(str.indexOf("?"));
	//int pos=str.indexOf("?");
	System.out.println(str.substring(20));
	StringBuilder str1=new StringBuilder(str);
	System.out.println(str1.reverse());
	for(int index=0;index<splitarray.length;index++)
	{
		//System.out.println(splitarray[index]);
		StringBuilder newaaray = new StringBuilder(splitarray[index]);
		System.out.print(newaaray.reverse()+" ");
		
	}
	
	System.out.print( str.substring(46,51));
}
}
 