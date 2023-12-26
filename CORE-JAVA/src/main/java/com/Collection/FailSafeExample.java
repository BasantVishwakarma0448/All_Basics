package com.Collection;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Stack;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ConcurrentHashMap;

public class FailSafeExample {

	public static void main(String[] args) {
//		Stack s = new Stack();
//
//		s.add(1);
//		s.add(2);
//		s.add(3);
//
//		Iterator it = s.iterator();
//
//		s.add(4); // ConcurrentModificationException
//
//		while (it.hasNext()) {
//			System.out.println(it.next());
//		}

//		Stack s = new Stack();
//		s.add(1);
//		s.add(2);
//		s.add(3);
//
//		Enumeration e = s.elements();
//
//		s.add(5);
//
//		while (e.hasMoreElements()) {
//			System.out.println(e.nextElement());
//		}

//		ArrayBlockingQueue a = new ArrayBlockingQueue<>(5);
//
//		a.add(1);
//		a.add(3);
//		a.add(5);
//		a.add(3);
//
//		Iterator it = a.iterator();
//
//		a.add(4);
//
//		while (it.hasNext()) {
//			System.out.println(it.next());
//		}

		ConcurrentHashMap map = new ConcurrentHashMap<>();

		map.put(1, "Basant");
		map.put(2, "Ram");
		map.put(3, "Shyam");

		Iterator it = map.values().iterator();
		
		map.put(4, "Seeta");

		while (it.hasNext()) {
			System.out.println(it.next());
		}
	}

}
