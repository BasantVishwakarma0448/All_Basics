package com.Basics;

public class Triangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 1; i <= 9; i++) {
			for (int j = 9 - i; j > 0; j--) {
				System.out.print("  ");
			}
			for (int k = i; k > 0; k--) {
				System.out.print("* ");
				//System.out.print(i + " ");
			}
			System.out.println();
		}

	}

}
