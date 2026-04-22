package com.example.myinterview;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/*
* str="This is and apple"
*
* split this in array and sort and store in list using stream
* */
public class byn_mellon_13052023_1 {

    static void main() {
        String str="This is an apple";
        List<String> list = Arrays.stream(str.split(" ")).sorted(String::compareToIgnoreCase).collect(Collectors.toList());
        System.out.println(list);
    }
}
