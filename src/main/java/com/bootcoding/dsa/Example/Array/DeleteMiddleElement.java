package com.bootcoding.dsa.Example.Array;

public class DeleteMiddleElement {
    public static void main(String[] args) {
        int arr[] = {10, 30, 50, 76, 80, 90, 45, 98};
        int dummy[] = new int[arr.length - 1];
        int pos = 4;

        for (int i = 0; i < pos; i++) {
                dummy[i] = arr[i];
        }
        for (int i = pos + 1; i < arr.length; i++){
            dummy[i - 1] = arr[i];
        }
        arr = dummy;
        for (int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
