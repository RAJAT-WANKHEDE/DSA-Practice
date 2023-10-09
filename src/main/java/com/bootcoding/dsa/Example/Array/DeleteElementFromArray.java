package com.bootcoding.dsa.Example.Array;

public class DeleteElementFromArray {
    public static void main(String[] args) {

        int arr[] = {13, 24, 35, 48, 59, 71, 90};
        int dummy[] = new int[arr.length - 1];
        int indexToRemove = 5;
        int j = 0;

        if (indexToRemove >= 0 && indexToRemove < arr.length) {
            for (int i = 0; i < arr.length; i++) {
               if( i != indexToRemove){
                   dummy[j] = arr[i];
                   j++;
               }
            }
        }

        else{
            System.out.println("Array Element not found");
        }

       // arr = dummy;

        System.out.println("This is Original Array");
        for (int i = 0; i < arr.length ; i++){
            System.out.print(arr[i] + " ");
        }

        System.out.println(" ");
        System.out.println("This is Updated Array");

        for (int i = 0; i < dummy.length; i++){
            System.out.print(dummy[i] + " ");
        }
    }
}
