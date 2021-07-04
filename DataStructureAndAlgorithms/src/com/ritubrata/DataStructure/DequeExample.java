package com.ritubrata.DataStructure;

import java.util.Deque;
import java.util.LinkedList;

public class DequeExample {
	public static void main(final String[] args){
		final Deque<String> deque = new LinkedList<String>();
		// Add at the last
		deque.add("Element 1 (Tail)");
		deque.addLast("Element 3 (Tail)");
		deque.offer("Element 5 (Tail)");

		// Add at the first
		deque.addFirst("Element 2 (Head)");
		deque.push("Element 4 (Head)"); //Pushes an element at the head of this deque if it is possible to do so immediately without violating capacity
		//restrictions, throwing an IllegalStateException if no space is currently available.
		deque.offerFirst("Element 6 (Head)");

		System.out.println(deque + "\n");

		System.out.println(deque.peek());  //Retrieves, but does not remove the head of the queue  or returns null if this deque is empty.
		System.out.println(deque.poll()); //Retrieves and remove the head of the queue  or returns null if this deque is empty.
		System.out.println(deque.pop()); //Removes and returns the first element of this deque.

		deque.removeFirst();
		deque.removeLast();

		System.out.println("Deque after removing first and last: "+ deque);
	}
}
