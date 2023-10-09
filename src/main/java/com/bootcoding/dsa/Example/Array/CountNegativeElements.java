package com.bootcoding.dsa.Example.Array;

public class CountNegativeElements {
    public static void main(String[] args) {
        int arr [] = {-2, - 4, -13, 45, 37, -53, 67, -23, 98, 41, -37, 87, 65, -30, 90, 100};
        int negativeCount = 0;

        for(int i = 0; i < arr.length; i++){
            if(arr[i] < 0){
                negativeCount ++ ;
            }
        }
        System.out.println("Total number of negative Elements are : " + negativeCount);
    }
}
