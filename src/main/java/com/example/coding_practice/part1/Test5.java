package com.example.coding_practice.part1;

import java.util.*;
import java.util.stream.Collectors;

public class Test5 {
    static void main() {
        String[] strs = {"eat", "tea", "tan", "ate", "nat", "bat"};
     //   Collection<List<String>> result = Arrays.stream(strs).collect(Collectors.groupingBy(str-> Test5.getAnagram(str))).values();
    //    result.forEach(System.out::println);

        Map<String, List<String>> map = new HashMap<>();

        for (String str : strs) {
            char[] chars = str.toCharArray();
            Arrays.sort(chars);
            String key = new String(chars);

            map.putIfAbsent(key, new ArrayList<>());
            map.get(key).add(str);
        }

        List<List<String>> result = new ArrayList<>(map.values());
        System.out.println(result);


    }

     static String getAnagram(String str){
        char[] chars = str.toCharArray();
        Arrays.sort(chars);
        return new String(chars);
    }
}
