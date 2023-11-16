package com.Practice.Day3_Array_Problems;

public class SmallestElemenetArray {
    public static void main(String[] args) {
        int arr[]={1,6,3,8,9,4,5};
        int min=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]<min){
                min=arr[i];
            }
        }
        System.out.println(min);
    }
}
