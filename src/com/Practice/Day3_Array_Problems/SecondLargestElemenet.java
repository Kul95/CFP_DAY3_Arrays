package com.Practice.Day3_Array_Problems;

public class SecondLargestElemenet {
    public static void main(String[] args) {
        int arr[] = {1, 5, 9, 6, 2, 4};
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println(arr[arr.length-2]);
    }
}
