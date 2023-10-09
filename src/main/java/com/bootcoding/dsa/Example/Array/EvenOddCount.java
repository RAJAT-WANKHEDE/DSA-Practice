package com.bootcoding.dsa.Example.Array;

public class EvenOddCount {
    public static void main(String[] args) {

        int arr [] = {12, 13, 17, 20, 16, 27, 32, 38, 46, 59, 42, 52, 71};
        int evenCount = 0;
        int oddCount = 0;

        for(int i = 0; i < arr.length; i++){
            if(arr[i] % 2 == 0){
                evenCount ++;
            } else {
                oddCount ++;
            }
        }
        System.out.println("Total number of Even Elements in an Array are : " + evenCount);
        System.out.println("Total number of Odd Elements in an Array are : " + oddCount);

      //  for(int i = 0; i < arr.length; i++){
      //      if(arr[i] % 2 != 0){
      //          oddCount ++ ;
      //      }
       // }
      //  System.out.println("Total number of Odd Elements in an Array are : " + oddCount);
    }
}
