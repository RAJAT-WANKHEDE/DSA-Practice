package com.bootcoding.dsa.Example.Array;

import java.util.Scanner;

public class ArrayInputExample {
    public static void main(String[] args) {


        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements you want to store : ");
        n = sc.nextInt();
        int arr[] = new int[n];

        System.out.println("Enters the Elements of an Array");

        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("Array Elements are : ");

        for(int i = 0; i < n; i ++){
            System.out.print(arr[i] + " ");
        }
    }
}
