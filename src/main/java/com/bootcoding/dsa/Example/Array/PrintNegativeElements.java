package com.bootcoding.dsa.Example.Array;

public class PrintNegativeElements {
    public static void main(String[] args) {

        int array [] = {12, -13, 14, -15, -45, 32, 33, -99, -44, 39, 50, -20, 67, -43, 10, -1, -3, 5 };

        System.out.println("Negative  Elements of an Array are : ");

        for(int i = 0; i < array.length; i++){
            if(array[i] < 0){
                System.out.print(array[i] + " ");
            }
        }
    }
}
