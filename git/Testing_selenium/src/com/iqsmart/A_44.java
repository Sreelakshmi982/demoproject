package com.iqsmart;

import java.text.DecimalFormat;

public class A_44 {
	public static void main(String[] args) {
		//System.out.printf("%.4f",2.9); 
		DecimalFormat df = new DecimalFormat(".#####");
		String fomat = df.format(99.32547);
		System.out.println(fomat);
		
	}

}
