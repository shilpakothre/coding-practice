package com.example.myinterview;

import java.util.Arrays;

/*
* String[] num={"1","2","3","4"}
* convert this integer using stream
*
* */
public class byn_mellon_13052023_2 {
    static void main() {
        String[] num={"1","2","3","4"};
        int[] arr = Arrays.stream(num).mapToInt(Integer::parseInt).toArray();
        System.out.println(Arrays.toString(arr));
    }
}
