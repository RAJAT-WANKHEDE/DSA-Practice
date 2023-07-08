package com.bootcoding.dsa.Example.Recursion;

public class PrintOddNumbers {

    public static void main(String[] args) {

        getOddNumbers(10);

    }

    public  static  int getOddNumbers(int n) {
        if( n == 0 ){
            return 0;
        }

          getOddNumbers(n -1);

        if (n % 2 != 0){
            System.out.println(n);
        }

        return getOddNumbers(n-1);

    }



}
