package com.Practice.Day3_Array_Problems;

public class FriquencyOfArrayElements {
    public static void main(String[] args) {
        int arr[] = {1, 3, 2, 1, 3, 4, 3, 5, 4, 6, 5, 4};
        for (int i = 0; i < arr.length; i++) {
            int x = arr[i];
            int count = 0;
            if (x == -1) continue;
            for (int j = 0; j < arr.length; j++) {
                if (arr[j] == x) {
                    count++;
                    arr[j] = -1;
                }
            }
            System.out.println("Element | frequency");
            System.out.println(x+"     "+count);
        }
    }
}
