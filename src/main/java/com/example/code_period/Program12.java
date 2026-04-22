package com.example.code_period;

import java.util.*;
import java.util.stream.Collectors;

//group the number by range in which they belong.
//o/p : {0=[2,3],10=[10,14],20=[20,24],30=[30,34],40=[40.44],50=[50,54]}
public class Program12 {
    static void main() {
        int arr[]={2,3,10,14,20,24,30,34,40,44,50,54};


        Map<Integer, List<Integer>> list = Arrays.stream(arr).boxed().collect(Collectors.toList()).stream()
                .collect(Collectors.groupingBy(e -> e / 10 * 10, LinkedHashMap::new, Collectors.toList()));

        System.out.println(list);

    }
}
