package com.bootcoding.dsa.Example.Array;

public class InsertAtLast {
    public static void main(String[] args) {
        int arr [] = {10, 20, 30 , 40, 50, 60, 70, 80 , 90 };
        int dummy [] = new int[arr.length + 1];

        for(int i = 0; i < arr.length; i++){
            dummy [i] = arr[i];
        }

        dummy[dummy.length - 1] = 100;
        arr = dummy;

        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
