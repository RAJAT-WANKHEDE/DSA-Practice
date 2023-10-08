package com.bootcoding.dsa.Example.Array;

public class ReverseArray {
    public static void main(String[] args) {

        int a[] = {20, 30, 40, 50, 60};
        int left = 0;
        int right = a.length - 1;

        while(left < right){
            int temp = a[left];
            a[left] = a[right];
            a[right] = temp;
            left ++;
            right --;
        }

        for(int i = 0; i<a.length; i++){
            System.out.print(a[i] + " ");
        }

        System.out.println(" ");

        System.out.println("Element At given Index");
        System.out.println(a[0]);

    }
}
