package com.example.coding_practice.part1;


import java.util.Arrays;
import java.util.Comparator;
// BC Consultant for JP Morgan
//find out shortest word in string using java8,  String str="this is shilpa";
public class Test4 {
    static void main() {

        String str="this is shilpa";

        String s = Arrays.stream(str.split(" ")).sorted(Comparator.comparing(String::length)).findFirst().get();

        System.out.printf("String:: "+s);
    }
}
