package com.iqsmart;

public class MatrixSubtraction {

	public static void main(String[] args) {
		int matrixOne[][] = { { 2, 1 }, { 4, 5 } };
		int matrixTwo[][] = { { 2, 3 }, { 6, 7 } };
		int matrixThree[][] = { { 8, 9 }, { 4, 5 } };
		int sub[][]= {
				{matrixOne[0][0]-matrixTwo[0][0]-matrixThree[0][0], matrixOne[0][1]-matrixTwo[0][1]-matrixThree[0][1]},
				{matrixOne[1][0]-matrixTwo[1][0]-matrixThree[1][0], matrixOne[1][1]-matrixTwo[1][1]-matrixThree[1][1]}
		};
		System.out.println(sub[0][0]+" "+sub[0][1]+"\n"+sub[1][0]+" "+sub[1][1]);

	}

}
