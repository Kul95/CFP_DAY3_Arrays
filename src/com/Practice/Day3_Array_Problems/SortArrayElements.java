package com.Practice.Day3_Array_Problems;

public class SortArrayElements {
    public static void main(String[] args) {
        int arr[]={1,6,4,3,8,9,5,6};
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
