package com.Collection;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueInterfaceExample {

	public static void main(String[] args) {
		Queue<Integer> a = new PriorityQueue<>();

		a.add(1);
		a.add(3);
		a.add(6);
		a.add(3);
		a.add(5);
		// a.add(null); //Null pointer Exception

		System.out.println(a); // FIFO- First In First Out

		Deque d = new ArrayDeque();
		d.add(1);
		d.add("Ram");
		d.add(6);
		d.add(3);
		d.add(5);
		// d.add(null);

		System.out.println(d);

	}

}