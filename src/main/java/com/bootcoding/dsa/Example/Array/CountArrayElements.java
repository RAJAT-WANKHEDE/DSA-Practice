package com.bootcoding.dsa.Example.Array;

public class CountArrayElements {

    public static void main(String[] args) {

        int arr[] = {12, 13, 14, 15, 23, 28, 29, 37, 39, 45, 50};
        int count = 0;

        for(int i = 0; i < arr.length; i++){
            count ++;
        }

        System.out.println(" Total Array Elements are : " + count);

    }
}
