package com.bootcoding.dsa.Example.Array;

 public class CopyArrayInReverseOrder {
   /* public static void main(String[] args) {
        int a[] = {10, 20, 30, 40, 50};
        int n = a.length;
        int newArray[] =  new int[a.length];

        for (int i = n-1; i>= 0; i--){
            newArray[i] = a[i];

        }

        for (int i = n-1 ; i >= 0; i--) {
            System.out.println(newArray[i]);
        }
    }

}*/

     public static void main(String[] args) {
         int nums[] = {0, 1, 2, 0, 12, 4};

         for (int i = 0; i < nums.length; i++) {
             if (nums[i] == 0){
                 nums[i] = nums.length - 1;
             }
             System.out.println(nums[i]);
         }
     }
 }

