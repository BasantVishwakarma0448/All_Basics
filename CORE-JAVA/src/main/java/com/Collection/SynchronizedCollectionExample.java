package com.Collection;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class SynchronizedCollectionExample extends Thread {
	private static Map<String, Integer> map = Collections.synchronizedMap(new HashMap<String, Integer>());
	
	@Override
	public void run() {
		map.put("Four", 4);
	}

	public static void main(String[] args) {
		map.put("One", 1);
		map.put("Two", 2);
		map.put("Three", 3);
		map.put("Five", 5);

		SynchronizedCollectionExample s = new SynchronizedCollectionExample();

		s.start();

		for (Object obj : map.entrySet()) {
			System.out.println(obj);
		}
	}

}
