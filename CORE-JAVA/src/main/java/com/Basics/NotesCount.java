package com.Basics;

public class NotesCount {

	public static void main(String[] args) {
		int[] note = { 2000, 1000, 500, 100, 50, 20, 10, 5, 2, 1 };
		int t = 5467;
		int count = 0;

		for (int i = 0; i < note.length; i++) {
			count = t / note[i];

			if (count > 0) {
				System.out.println(note[i] + "  " + count);
				t = t % note[i];
			}
		}
	}

}
