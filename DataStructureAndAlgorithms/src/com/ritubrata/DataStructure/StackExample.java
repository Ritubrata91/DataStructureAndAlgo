package com.ritubrata.DataStructure;

import java.util.Stack;

public class StackExample {

	public static void main(final String[] args)
	{
		//creating an instance of Stack class
		final Stack<Integer> stk= new Stack<>();
		// checking stack is empty or not
		boolean result = stk.empty();
		System.out.println("Is the stack empty? " + result);
		// pushing elements into stack
		stk.push(78);
		stk.push(113);
		stk.push(90);
		stk.push(120);
		//prints elements of the stack
		System.out.println("Elements in Stack: " + stk);
		result = stk.empty();
		System.out.println("Is the stack empty? " + result);

		System.out.println("First Peek results into : " + stk.peek()); //does not remove the element
		System.out.println("Second Peek results into : " + stk.peek());
		System.out.println("First Pop results into : " + stk.pop()); //remove the element
		System.out.println("Second Pop results into : " + stk.pop());

		stk.removeAllElements();
		result = stk.empty();
		System.out.println("Is the stack empty? " + result);
		System.out.println("Peek in empty stack results into : " + stk.peek()); //EmptyStackException
		System.out.println("Pop in empty stack results into : " + stk.pop());  //EmptyStackException

	}

}
