package com.iqsmart;

public class A_29 {
	public static void main(String[] args) {
		String str = "Hello world";
		String[] splitarray = str.split(" ");

		//for (String word : splitarray) {
		//	System.out.println(word);
			for (int index = 0; index < splitarray.length; index++) {

				// for (int index = word.length - 1; index >= 0; index--) {
				StringBuilder newaaray = new StringBuilder(splitarray[index]);
				System.out.print(newaaray.reverse() + " ");
			}

		

	}

}