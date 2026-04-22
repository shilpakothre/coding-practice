package com.example.code_period;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//create list that contains only numbers
public class Program13 {
    static void main() {
        String[] str={"abc","123","789","xyz"};

        List<Integer> list = Arrays.asList(str).stream().filter(e -> e.matches("[0-9]+"))
                .map(Integer::valueOf)
                .collect(Collectors.toList());
        System.out.println(list);
    }
}
