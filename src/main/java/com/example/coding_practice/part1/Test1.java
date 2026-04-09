package com.example.coding_practice.part1;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Test1 {
    static void main() {
        //write a program to find the shortest string in list.
        Arrays.asList("apple","banana","kiwi","orange","grape")
                .stream()
                .collect(Collectors.toMap(Function.identity(),String::length))
                .entrySet()
                .stream()
                .sorted(Comparator.comparingInt(Map.Entry::getValue))
                .map(Map.Entry::getKey)
                .findFirst()
                .ifPresent(System.out::println);

        Arrays.asList("apple","banana","kiwi","orange","grape")
                .stream()
                .min(Comparator.comparingInt(String::length))
                .ifPresent(System.out::println);



    }
}
