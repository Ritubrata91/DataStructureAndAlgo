package com.ritubrata.DataStructure.Miscellanious;

import java.util.Deque;
import java.util.LinkedList;

public class DequeExample {
	public static void main(final String[] args){
		final Deque<String> deque = new LinkedList<String>();
		// Add at the last
		deque.add("Element 1 (Tail)");
		// Add at the first
		deque.addFirst("Element 2 (Head)");
		// Add at the last
		deque.addLast("Element 3 (Tail)");
		// Add at the first
		deque.push("Element 4 (Head)");
		// Add at the last
		deque.offer("Element 5 (Tail)");
		// Add at the first
		deque.offerFirst("Element 6 (Head)");

		System.out.println(deque + "\n");

		deque.removeFirst();
		deque.removeLast();
		System.out.println("Deque after removing first and last: "+ deque);
	}
}
