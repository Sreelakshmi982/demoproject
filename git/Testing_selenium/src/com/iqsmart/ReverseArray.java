package com.iqsmart;

import java.util.ArrayList;
import java.util.ListIterator;

public class ReverseArray {
	public static void main(String[] args) {
		ArrayList<String> arylist = new ArrayList<>();
		arylist.add("s");
		arylist.add("r");
		arylist.add("i");
		ListIterator<String> list = arylist.listIterator(arylist.size());
		while (list.hasPrevious()) {
			System.out.println(list.previous());
		}
	}
}
