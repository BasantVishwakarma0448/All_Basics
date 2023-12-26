package com.Exception;

public class HierarchyExceptionExample {

	public static void main(String[] args) {
		String s = "Java";

		try {
			System.out.println(s.charAt(5));
		} catch (StringIndexOutOfBoundsException e) {
			System.out.println("StringIndexOutOfBounds...............");
		} catch (RuntimeException e) {
			System.out.println("RuntimeException...............");
		} catch (Exception e) {
			System.out.println("Exception...............");
		}
	}

}
