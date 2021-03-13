package com.iqsmart;

import java.util.ArrayList;
import java.util.function.Predicate;

public class A_arrayList {
	public static void main(String[] args) {
		ArrayList<Integer> arylist = new ArrayList();
		for (int index = 0; index <= 100; index++) {
			arylist.add(index);
//		System.out.println(arylist.add(index));
		}
		// arylist.add(9);
		// arylist.add(10);
		for (int i : arylist)
			System.out.println(i);
//		for (int index = 0; index <= 50; index++) {
//			arylist.remove(Integer.valueOf(index));
//		}
		arylist.removeIf(new Predicate<Integer>() {

			@Override
			public boolean test(Integer t) {
				return t<=50;
			}
		});

		arylist.removeIf(t -> t<=50);
		
		
		for (int i : arylist)
			System.out.println(i);
	}

}
