package com.bootcoding.dsa.Example.Array;

public class SumOfAllElements {

    public static void main(String[] args) {

        int arr[] = {5, 10, 14, 17, 20, 25};
        int sum = 0;

        for(int i = 0; i < arr.length; i++){
            sum = sum + arr[i];
            System.out.println(sum);
        }
        System.out.println("  ");
        System.out.println(" Sum Of All Elements In an Array is  = " + sum );


    }
}
