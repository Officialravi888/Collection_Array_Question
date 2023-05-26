package org.example.linkedlist;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.stream.IntStream;

public class MargeTwoArray {
    public static void main(String[] args) {
        int a[]={1, 3, 5, 7};
        int b[]={2, 4, 6};
      int[] m = IntStream.concat(IntStream.of(a),IntStream.of(b)).toArray();
        System.out.println(Arrays.toString(m));
    }
}
