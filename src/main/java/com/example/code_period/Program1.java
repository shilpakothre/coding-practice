package com.example.code_period;

import java.util.Arrays;
import java.util.Comparator;

//find the word has highest length
public class Program1 {
    static void main() {
        String str ="I am learning stream API in Java" ;
        String word = Arrays.stream(str.split(" "))
                .sorted(Comparator.comparing(String::length).reversed())
                .findFirst().get();
        System.out.println(word);


        String w = Arrays.stream(str.split(" ")).max(Comparator.comparing(String::length)).get();
        System.out.println(w);
    }
}
