package com.example.code_period;

import java.util.Arrays;

//find the sum of unique elements
public class Program10 {
    static void main() {
        int[] arr={1,6,7,8,1,1,8,8,7};

        int s = Arrays.stream(arr).distinct().sum();
        System.out.println(s);
    }
}
