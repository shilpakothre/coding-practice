package com.example.myinterview;


import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/*
 * print repeated character like l:2 o:1
 * */

public class Accenture_1 {
    static void main() {
        String str="hello world";
        List<Map.Entry<String, Long>> map = Arrays.stream(str.split("")).collect(Collectors.groupingBy(e -> e, Collectors.counting()))
                .entrySet().stream().filter(e -> e.getValue() > 1).collect(Collectors.toList());
        System.out.println(map);
    }
}
