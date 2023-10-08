package com.bootcoding.dsa.Example.Array;

public class SumOfEvenElements {
    public static void main(String[] args) {
        int a [] = {12, 14, 18, 19, 22, 25, 29, 30};
        int sum = 0;

        for(int i =0; i < a.length; i++){
            if(a[i]% 2 == 0){
                sum = sum + a[i];
            }
        }

        System.out.println("Sum Of Even Elements Of An Array = " + sum);
    }
}
