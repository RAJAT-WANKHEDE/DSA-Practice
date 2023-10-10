package com.bootcoding.dsa.Example.Array;

public class MergeTwoArray {
    public static void main(String[] args) {
        int a[] = {12, 13, 27, 35, 50};
        int b[] = {23, 56, 78, 90, 99, 55};

        int arr[] = new int[a.length + b.length];
        int n = a.length;
        int x = b.length;

        for (int i = 0; i < n; i++){
            arr[i] = a[i];
        }
        for (int i = 0; i < b.length; i++){
            arr[n + i] = b[i];
        }
        for (int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
