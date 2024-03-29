package com.ritubrata.DataStructure.Array;

public class ReverseArray {
	static void reverseArray(final int arr[]){
		int temp;
		int start =0;
		int end = arr.length-1;
		while (start < end){
			temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			start++;
			end--;
		}
	}
	static void printArray(final int arr[]){
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
	public static void main(final String args[]) {
		final int arr[] = {1, 2, 3, 4, 5, 6};
		printArray(arr);
		reverseArray(arr);
		System.out.print("Reversed array is \n");
		printArray(arr);
	}
}
