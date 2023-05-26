package org.example.linkedlist;

import java.util.Arrays;
import java.util.LinkedList;

public class DuplicateRemove {
    public static void main(String[] args) {
        Integer arr[]={2,3,5,6,7,4,5};
        LinkedList<Integer>linkedList=new LinkedList<>(Arrays.asList(arr));
        System.out.println("1. Original LinkedList with duplicate values :");
        //linkedList.remove_Duplicate();
        System.out.println(":");
        linkedList.peekLast();
    }
}
