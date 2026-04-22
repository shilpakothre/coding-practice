package com.example.myinterview;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.stream.Collectors;

/*
* string str="google"
* g=2
* o=1
* l=1
* e=1
*
* */
public class lti_25052024_1 {
    static void main() {

        String str="google";
        Arrays.stream(str.split("")).collect(Collectors.groupingBy(e->e, LinkedHashMap::new,Collectors.counting()))
                .entrySet().stream().forEach(System.out::println);


    }
}
