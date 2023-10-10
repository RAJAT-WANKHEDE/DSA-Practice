package com.bootcoding.dsa.Example.Array;

public class DeleteLastElement {
    public static void main(String[] args) {
        int arr[] = {12, 13, 16, 19, 30, 56, 78, 99};
        int dummy[] = new int[arr.length - 1];

        for (int i = 0; i < arr.length - 1; i++){
            dummy[i] = arr[i];
        }
        arr = dummy;
        for (int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
