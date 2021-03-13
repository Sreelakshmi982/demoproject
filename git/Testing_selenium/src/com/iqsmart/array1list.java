package com.iqsmart;

import java.util.ArrayList;
import java.util.Iterator;

public class array1list {
	public static void main(String[] args) {
		ArrayList list1 = new ArrayList();
		list1.add(12);
		list1.add(16);
		list1.add(19);
		list1.add(20);
		// System.out.println(list1.get(0));
		// for (int pos =0 ;pos<=list1.size()-1;pos++)
		// System.out.println(list1.get(pos));
		ArrayList list2 = new ArrayList();
		list2.add(50);
		list2.add(40);
		list2.add(12);
		list2.add(20);
		for (Object index : list2)
			System.out.println(index);
		list1.addAll(list2);
		for (Object pos : list1) {
			System.out.println(pos);
		}
		System.out.println("***************************");
		// if(list1.indexOf(12)== list1.lastIndexOf(12))
		// list1.remove(12);
		list1.removeAll(list2);
		for (Object pos1 : list1)
			System.out.println(pos1);
		System.out.println("***************************");
		/*
		 * Iterator itre = list1.iterator(); while(itre.hasNext()) {
		 * System.out.println(itre.next()); }
		 */
		list1.addAll(list2);
		for(Object pos2 : list1)
			System.out.println(pos2);
		
	
	}

}
