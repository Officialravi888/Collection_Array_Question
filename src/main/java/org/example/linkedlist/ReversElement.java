package org.example.linkedlist;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;

public class ReversElement {
    public static void main(String[] args) {
        LinkedList<Integer>linkedList=new LinkedList<>(Arrays.asList(1,2,3,4,5));
        Collections.reverse(linkedList);
        System.out.println(linkedList);
    }
}
