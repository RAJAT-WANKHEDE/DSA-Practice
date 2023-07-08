package com.bootcoding.dsa.Example.Recursion;

public class Fibonaccii {

    public static  int getFib(int n) {
        if(n == 0) {
            return 0;
        }
        if(n == 1){
            return  1;
        }

        return getFib(n-1) + getFib(n-2);
    }

    public static void main(String[] args) {

        int result = getFib(13);
        System.out.println(result);
    }
}
