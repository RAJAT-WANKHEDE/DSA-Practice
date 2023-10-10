package com.bootcoding.dsa.Example.Array;

public class CountDuplicateElements {
    public static void main(String[] args) {
        int arr[] = {13, 25, 45, 39, 25, 78, 90, 13, 46, 39, 99};
        int count = 0;
        for (int i = 0; i < arr.length; i++){
            for(int j = i + 1; j < arr.length; j++){
               if ( arr[i] == arr[j]){
                   count++;
                   System.out.print(arr[i] + " ");
               }

            }
        }
        System.out.println(" ");
        System.out.println("Total Number of Duplicate Elements are : " + count);
    }
}
