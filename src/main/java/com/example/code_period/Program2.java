package com.example.code_period;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

//remove duplicate from string and return in same order
//op=> dabcefg
public class Program2 {
    static void main() {

        String str ="dabcadefg";

        str.chars().distinct().mapToObj(e->(char)e).forEach(System.out::print);

        Arrays.stream(str.split("")).distinct().forEach(System.out::print);

        String wo = Arrays.stream(str.split("")).distinct().collect(Collectors.joining());
        System.out.println(wo);

        Set set = new HashSet<>();
        String ch = Arrays.stream(str.split(""))
                .filter(e -> set.add(e)).collect(Collectors.joining());
        System.out.println(ch);

        String word = Arrays.stream(str.split("")).collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
                .entrySet().stream().distinct().map(e -> e.getKey())
                .collect(Collectors.joining());
        System.out.println(word);

    }
}
