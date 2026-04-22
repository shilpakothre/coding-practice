package com.example.code_period;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.toList;

//divide array into  two list having one is even other is odd
public class Program7 {
    static void main() {

        int[] arr={1,2,3,4,5,6,7,8};

        List<List<Integer>> list = Arrays.stream(arr).boxed()
                .collect(Collectors.partitioningBy(e -> e % 2 == 0, toList()))
                .entrySet().stream()
                .map(x -> x.getValue())
                .collect(toList());

        System.out.println(list);
    }
}
