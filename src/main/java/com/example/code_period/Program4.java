package com.example.code_period;

import java.util.Arrays;
import java.util.Comparator;

//Find the length of Second highest word in String.
public class Program4 {
    static void main() {

        String str ="I am learning streams API in Java" ;
        Integer w = Arrays.stream(str.split(" ")).map(e -> e.length()).sorted(Comparator.reverseOrder())
                .skip(1).findFirst().get();
        System.out.println(w);
    }
}
