package com.bootcoding.dsa.Example.Array;

public class SeparateOddAndEvenElements {
    public static void main(String[] args) {

        int a[] = {11, 3, 15, 22, 46, 78, 98, 31, 33, 36, 48, 71, 74, 43, 58, 66};
        int evenElements[];

        System.out.println("Array For Even Elements : ");
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 == 0) {
                evenElements = new int[a.length];
                evenElements[i] = a[i];
                System.out.print(evenElements[i] + " ");
            }
        }

        System.out.println(" ");
        System.out.println("Array For Odd Elements :");
        for (int j = 0; j < a.length; j++){
            if (a[j] % 2 != 0){
                int oddElements[] = new int[a.length];
                oddElements[j] = a[j];
                System.out.print(oddElements[j] + " ");
            }
        }
    }
}