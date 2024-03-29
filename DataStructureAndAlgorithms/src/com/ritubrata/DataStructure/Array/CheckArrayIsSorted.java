package com.ritubrata.DataStructure.Array;

public class CheckArrayIsSorted {
    static boolean isSorted(int[] arr, int n) {
        for (int i = 1; i < n; i++) {
            if (arr[i] < arr[i - 1])
                return false;
        }

        return true;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int n = 5;

        System.out.println(isSorted(arr, n));
    }
}
