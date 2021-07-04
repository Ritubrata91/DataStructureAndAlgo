package com.ritubrata.DataStructure;

import java.util.Iterator;
import java.util.PriorityQueue;

public class PriorityQueueExample {

	public static void main(final String args[]){
		final PriorityQueue<String> queue=new PriorityQueue<String>();
		/* It is only ordered/sorted in the sense that the first element is the least.
		In other word, it only cares about what is in the front of the queue,
		the rest are "ordered" when needed. */
		queue.add("Amit");
		queue.add("Vijay");
		queue.add("Karan");
		queue.add("Jai");
		queue.add("Rahul");

		System.out.println("head:"+queue.element()); //for retrieving head element, not removing ... it throws exception if queue is empty.
		System.out.println("*****************************************************");
		System.out.println("head:"+queue.peek());   //for retrieving head element, not removing... it returns null if queue is empty.
		System.out.println("*****************************************************");

		System.out.println("iterating the queue elements:");
		final Iterator<String> itr=queue.iterator();
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
		System.out.println("*****************************************************");
		queue.remove();  //for retrieving  and removing head element... it returns exception if queue is empty.
		queue.poll(); //for retrieving  and removing head element... it returns null if queue is empty.
		System.out.println("after removing two elements:");
		final Iterator<String> itr2=queue.iterator();
		while(itr2.hasNext()){
			System.out.println("*****************************************************");
			System.out.println(itr2.next());
		}
	}
}
