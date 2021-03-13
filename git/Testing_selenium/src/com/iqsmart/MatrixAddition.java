package com.iqsmart;

public class MatrixAddition {
	public static void main(String[] args) {
		int matrixOne[][] = { { 1, 2 }, { 2, 3 } };
		int matrixTwo[][] = { { 1, 5 }, { 4, 2 } };
		int sum[][] = { { matrixOne[0][0] + matrixTwo[0][0], matrixOne[0][1] + matrixTwo[0][1] },
				{ matrixOne[1][0] + matrixTwo[1][0], matrixOne[1][1] + matrixTwo[1][1] }, };
		//System.out.println(sum.length);
		//System.out.print(sum[0][0]);
		//System.out.print(sum + "");
		//System.out.print(sum.toString() + "");
		//ystem.out.println();
		System.out.println(sum[0][0] + " " + sum[0][1] + " \n" + sum[1][0] + " " + sum[1][1]);
		System.out.println();
		System.out.println();
	}
}
