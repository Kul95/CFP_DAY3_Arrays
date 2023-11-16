package com.Practice.Day3_Array_Problems;

public class LargestElementInAnArray {
    public static void main(String[] args) {
        int arr[]={1,6,3,8,9,4,5};
        int max=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        System.out.println(max);
    }
}
