package com.example.myinterview;

import java.util.Arrays;
import java.util.Collections;

/*
* Find second max element using java 8 [1,2,4,8,8,6]
*
* */
public class lti_25052024_2 {
    static void main() {
        int[] arr={1,2,4,8,8,6};

        Integer secondLargeElement = Arrays.stream(arr).boxed().distinct()
                .sorted(Collections.reverseOrder()).skip(1).limit(1).findFirst().get();
        System.out.println(secondLargeElement);
    }
}
