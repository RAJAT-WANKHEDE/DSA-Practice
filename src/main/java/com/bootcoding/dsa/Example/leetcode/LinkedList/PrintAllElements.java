package com.bootcoding.dsa.Example.leetcode.LinkedList;

public class PrintAllElements {

    public static  void main (String [] args) {

    }
    public Node deleteMiddle(Node head) {
        int count = 0;
        Node current = head;



            while (current != null) {
                count++;
                current = current.Next;
            }

            int mid = count / 2;


            current = head;

            for (int i = 0; i < count; i++) {
                current = current.Next ;
            }
             return  current;
        }


    }





