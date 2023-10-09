package com.bootcoding.dsa.Example.Array;

public class SecondLargestElement {
    public static void main(String[] args) {
        int a [] = { 10, 9, 13, 65, 78, 97, 45, 87, 56, 24, 89};
        int temp;
        int i;
        for(i = 0; i < a.length; i++){
            for(int j = i +1 ; j < a.length; j++){
               if(a[i] > a[j]) {
                   temp = a[i];
                   a[i] = a[j];
                   a[j] = temp;
               }
            }


        }
        System.out.println(a[i - 2]);
    }
}
