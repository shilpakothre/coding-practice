package com.example.coding_practice.part1;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
//NeoSoft
public class Test3 {
    /*write a java program to read number of variable like this
    String str ="aaaaaaammdddddkkkkx";
    Map out = {x=1,m=2,k=4,d=5,a=7};*/
    static void main() {

        String str = "aaaaaaammdddddkkkkx";

      Map map=str
                .chars()
                .mapToObj(c -> (char)c)
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new,Collectors.counting()));

        System.out.println(map);
    }
}
