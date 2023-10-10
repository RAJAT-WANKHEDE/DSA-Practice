package com.bootcoding.dsa.Example.Array;

public class AscendingOrderSort {
    public static void main(String[] args) {

        int arr[] = {13, 15, 45, 68, 34, 56, 98, 75, 43, 11};
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        for (int i = 0 ; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
}