package com.example.code_period;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

//rearrenged the element to form highest/lowest possible value.
//o/p: 54321/12345
public class Program9 {
    static void main() {
        int[] arr= {1,2,3,4,5};

         Arrays.stream(arr).boxed().sorted().forEach(System.out::print);
         Arrays.stream(arr).boxed().sorted(Collections.reverseOrder()).forEach(System.out::print);


    }
}
