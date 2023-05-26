package org.example.linkedlist;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.stream.Collectors;

public class middlefindelement {
    public static void main(String[] args) {
        Integer arr[]={1,3,4,5,6,8,7};
        LinkedList<Integer>linkedList=new LinkedList<>(Arrays.asList(arr));
        Integer midel=linkedList.size()/2;
       Integer a=linkedList.stream().filter(integer -> linkedList.indexOf(integer)==midel).collect(Collectors.toList()).get(0);
        System.out.println(a);
    }
}
