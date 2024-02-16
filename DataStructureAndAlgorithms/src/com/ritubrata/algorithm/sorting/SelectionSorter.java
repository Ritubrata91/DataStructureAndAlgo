package com.ritubrata.algorithm.sorting;


public class SelectionSorter {

    public static void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            int tmp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = tmp;
        }
    }

    public static void main(String[] args) {
        int[] myIntArray = {4, 3, 7, 2, 11, 0};
        selectionSort(myIntArray);
		for (int j : myIntArray) System.out.println(j);
    }

}
