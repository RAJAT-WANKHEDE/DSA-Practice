package com.bootcoding.dsa.Example.Recursion;

public class PrintNumbers {

    public static int printSum(int n){
        if(n == 1) {
            return 1;
        }

        return n + printSum(n-1);

    }

    public static void main(String[] args) {
        int getSum = printSum(10);

        System.out.println(getSum);
    }
}
