package org.example.linkedlist;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.stream.Collectors;

public class SwapToElement {
    public static void main(String[] args) {
        LinkedList<Integer>linkedList=new LinkedList<>(Arrays.asList(12,34));
        try{
            Collections.swap(linkedList,1,0);
        }catch (IndexOutOfBoundsException ex){
            System.out.println(ex);
        }
        //linkedList.stream().collect(Collectors.toList());
        System.out.println(":"+linkedList);
    }
}
