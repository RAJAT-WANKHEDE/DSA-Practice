package com.bootcoding.dsa.Example.Array;

public class InsertAtMiddle {
    public static void main(String[] args) {
        int arr[ ] = {10, 20 , 30 , 40 , 60 , 70 , 80 , 90 , 100};
        int dummy[] = new int[arr.length+1];
        int pos = 4;

        for (int i = 0; i< pos ; i++){
            dummy[i] = arr[i];
        }

        dummy[pos] = 50;

        for( int i = pos + 1 ; i < arr.length; i++){
            dummy[i] = arr[ i -1];
        }

        arr = dummy;

        for(int i = 0; i < arr.length ; i++){
            System.out.print(arr[i] + " ");
        }

    }
}
