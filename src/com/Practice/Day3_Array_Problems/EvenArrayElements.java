package com.Practice.Day3_Array_Problems;

public class EvenArrayElements {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7,8,9};
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2==0){
                System.out.print(arr[i]+" ");
            }
        }
    }
}