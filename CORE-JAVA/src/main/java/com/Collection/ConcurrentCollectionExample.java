package com.Collection;

import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentCollectionExample extends Thread{
	private static ConcurrentHashMap<String, Integer> c = new ConcurrentHashMap<String, Integer>();
	
	@Override
	public void run() {
		c.put("One", 1);
		super.run();
	}
	public static void main(String[] args) {
		c.put("Two", 2);
		c.put("Three", 3);
		c.put("Four", 4);
		
		
		ConcurrentCollectionExample t = new ConcurrentCollectionExample();
		t.start();
		
		
		for(Object o : c.entrySet()) {
			System.out.println(o);
		}
		
		//System.out.println(c);
		
	}

}
