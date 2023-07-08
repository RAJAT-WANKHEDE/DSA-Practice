package com.bootcoding.dsa.Example.Recursion;

public class MinimumElement {

    public static  int minElement(int [] a , int min , int i){

        if (i == a.length-1){
            return min;
        }

     //   if (min > a[i]){
        //     min = a[i];
        //}

        min = Math.min(min , a[i]);
        return  minElement(a, min, ++i);
    }

    public static void main(String[] args) {

        int a[] = {4, 6, 9, 10};
        int result = minElement(a, a[0], 0);
        System.out.println(result);


    }

}
