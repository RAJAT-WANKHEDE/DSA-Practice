package com.bootcoding.dsa.Example.Array;

public class MaximumAndMinimumElementInArray {

    public static void main(String[] args) {
        int arr[] = {20, 23, 34, 39, 12, 24,87, 9, 5, 16, 11, 49, 65};
        int max = 0;
        int min = arr[0];

        System.out.println("Program For Maximum Elements In an Array :");
        for(int i =0 ; i < arr.length; i++ ){
            if ( arr[i] > max){
                max = arr[i];
            }
        }

        System.out.println(max);

        System.out.println("Program For Minimum Elements In an Array :");

        for(int i = 0; i < arr.length; i++){
            if(min > arr[i]){
                min = arr[i];
            }
        }

        System.out.println(min);
    }
}
