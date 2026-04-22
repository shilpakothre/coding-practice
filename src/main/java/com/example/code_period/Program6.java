package com.example.code_period;

//Find the word having specific number of Vowels here 2

import java.util.Arrays;

public class Program6 {
    static void main() {

        String str ="I am learning stream API in Java" ;

        Arrays.stream(str.split(" "))
                .filter(e->e.replaceAll("[^aeiouAEIOU]","").length()==2)
                .forEach(System.out::println);
    }
}
