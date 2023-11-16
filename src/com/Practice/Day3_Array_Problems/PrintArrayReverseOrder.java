package com.Practice.Day3_Array_Problems;

public class PrintArrayReverseOrder {
    public static void main(String[] args) {
        int arr[]={1,6,5,3,8,7};
        for(int i=arr.length-1;i>=0;i--){
            System.out.print(arr[i]+" ");
        }
    }
}
