package com.Basics;

public class TwoDArray {

	public static void main(String[] args) {
		int[][] arr = new int[10][10];

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				arr[i][j] = (i + 1) * (j + 1);

				// for printing in horizontal
				 System.out.print(arr[i][j] + "\t");

				// for printing in vertical
				// System.out.println(arr[i][j] + "\t");
			}
			System.out.println(" ");
		}
	}

}
