package com.ritubrata.algorithm.search;

public class BinarySearchExample {
	public static int binarySearch(final int arr[], final int first, final int last, final int key){
		if (last>=0){
			final int mid = 0 + (arr.length-1 - 0)/2;
			if (arr[mid] == key){
				return mid;
			}
			if (arr[mid] > key){
				return binarySearch(arr, 0, mid-1, key);//search in left subarray
			}else{
				return binarySearch(arr, mid+1, arr.length-1, key);//search in right subarray
			}
		}
		return -1;
	}
	public static void main(final String args[]){
		final int arr[] = {10,20,30,40,50};
		final int key = 30;
		final int result = binarySearch(arr,0,arr.length-1,key);
		if (result == -1) {
			System.out.println("Element is not found!");
		} else {
			System.out.println("Element is found at index: "+result);
		}
	}

}
