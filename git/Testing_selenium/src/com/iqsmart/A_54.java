package com.iqsmart;

public class A_54 {
	public static void main(String[] args) {
		String str = "Once upon a time there was a king who was very kind to his people";
		String checkstr = " ";
		String[] splitarray = str.split(checkstr);
		for (int index = 0; index < splitarray.length; index++) {
			System.out.print(splitarray[index]);
		}
	}

}
