package com.example.code_period;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.function.Function;
import java.util.stream.Collectors;

//In given string find first non-repeating character
public class Program11 {
    static void main() {
        String str="Hello world";

        String s = Arrays.stream(str.split("")).collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
                .entrySet().stream().filter(e -> e.getValue() == 1).map(e -> e.getKey())
                .findFirst().get();
        System.out.println(s);

        System.out.println(str.indexOf("e"));


    }
}
