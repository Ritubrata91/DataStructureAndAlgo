package com.ritubrata.DataStructure.Array;

public class FindLargestElement {

    private static int find(int[] arr, int n){
        int max = arr[0];
        for(int i =1; i< arr.length; i++){
            if(arr[i]> max){
                max = arr[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] myIntArray = {4, 11, 7, 2, 11, 0};
        System.out.println(find(myIntArray, 6));
    }
}
