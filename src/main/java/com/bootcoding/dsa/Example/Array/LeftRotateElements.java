package com.bootcoding.dsa.Example.Array;

import java.util.Arrays;
import java.util.Scanner;

public class LeftRotateElements {
     private int a[];
    public static void main(String[] args) {
        LeftRotateElements lr = new LeftRotateElements();
        lr.getElements();
        System.out.println("After Left rotate Array Elements Are :");
        lr.leftRotate();
    }

    public int[] leftRotate(){
        Scanner sct = new Scanner(System.in);
        System.out.println("Enter total no. of shifts : ");
        int x = sct.nextInt();
        int i, j;

        int temp = 0;
        for (i = 0; i < x; i++) {
            for (j = 0; j < a.length-1; j++) {
                temp = a[0];
                a[j] = a[j + 1];
            }
            a[j] = temp;
        }
        System.out.println(Arrays.toString(a));
        return a;
    }

    public int [] getElements() {
        int i,j;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Total Size of Array : ");
        int n = sc.nextInt();
        a = new int[n];

        for (i = 0; i < n; i++) {
            System.out.println("Enter array Elements "+ (i+1) + ":");
            a[i] = sc.nextInt();
        }
        System.out.println("Array Elements Are : ");
        System.out.println(Arrays.toString(a));
        return a;
    }
}