package com.ritubrata.DataStructure;

import java.util.ArrayList;
import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(final String[] args) {
		final LinkedListExample<Integer> integers = new LinkedListExample<Integer>();

		new LinkedList<>();

		new ArrayList<>();

		integers.addAtStart(5);
		integers.addAtStart(10);
		integers.addAtStart(2);
		integers.addAtStart(12);
		integers.addAtStart(19);
		integers.addAtStart(20);
		System.out.println(integers.length());
		System.out.println(integers.find(120));
	}

}
