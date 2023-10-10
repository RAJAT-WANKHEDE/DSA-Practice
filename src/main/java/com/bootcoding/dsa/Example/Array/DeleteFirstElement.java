package com.bootcoding.dsa.Example.Array;

public class DeleteFirstElement {
    public static void main(String[] args) {
        int a[] = {13, 34, 56, 47, 89, 90};
        int dummy[] = new int[a.length - 1];


        for (int i = 0; i < a.length - 1; i++) {
                dummy[i] = a[i + 1];
        }
        a = dummy;

        for(int i = 0; i < a.length; i++){
            System.out.print(a[i] + " ");
        }
    }
}
