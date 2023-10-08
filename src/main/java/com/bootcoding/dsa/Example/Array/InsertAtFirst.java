package com.bootcoding.dsa.Example.Array;

public class InsertAtFirst {
    public static void main(String[] args) {
        int arr[] = {10, 15 , 17 , 25, 30 , 45};
        int dummy [] = new int[arr.length + 1];

        for(int i = 0; i < arr.length ; i++){
            dummy[i + 1] = arr[i];

        }

        dummy[0] = 20;
        arr = dummy;

        for(int i = 0; i < arr.length ; i++){
            System.out.print(arr[i] + " ");
        }
    }

}
