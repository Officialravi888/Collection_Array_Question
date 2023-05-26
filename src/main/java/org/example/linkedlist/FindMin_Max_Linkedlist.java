package org.example.linkedlist;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.stream.Collectors;

public class FindMin_Max_Linkedlist {
    public static void main(String[] args) {
    Integer arr[] = {2, 3, 4, 6, 8, 9, 6};
    LinkedList<Integer> linkedList = new LinkedList<>(Arrays.asList(arr));
    Integer x= Collections.min(linkedList);
    Integer x1=Collections.max(linkedList);
        System.out.println(x);
        System.out.println(x1);
    }
}
