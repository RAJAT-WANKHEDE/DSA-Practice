package com.bootcoding.dsa.Example.Recursion;

public class PrintEvenNumbers {

    public static void main(String[] args) {

        getEvenNumbers(20);

    }

    public static  int getEvenNumbers(int n) {
        if (n == 0) {
            return 0 ;
        }

        if (n % 2 == 0) {
            System.out.println(n);
        }

        return getEvenNumbers(n - 1);


    }
}
