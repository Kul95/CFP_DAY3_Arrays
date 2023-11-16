package com.Practice.Day3_Array_Problems;

public class DuplicateArrayElements {
    public static void main(String[] args) {
        int arr[]={1,3,5,8,4,6,5,3};
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    System.out.print(arr[i]+" ");
                }
            }
        }
    }
}
