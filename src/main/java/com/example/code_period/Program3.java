package com.example.code_period;

import java.util.Arrays;
import java.util.Comparator;

//find the word having 2nd (nth) highest length
public class Program3 {
    static void main() {
        String str ="I am learning stream API in Java" ;
        String word = Arrays.stream(str.split(" ")).sorted(Comparator.comparing(String::length).reversed())
                .skip(1).findFirst().get();

        System.out.println(word);

    }
}
