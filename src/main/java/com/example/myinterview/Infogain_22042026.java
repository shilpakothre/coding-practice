package com.example.myinterview;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/*
 given a class city having members-> name and population , group they by population as
 population less than 1lakh is small, between  1 to 10 lakh small, more than 10 lakh high.
 */
public class Infogain_22042026 {

     static void main(String[] args) {

         List<City> list = Arrays.asList(new City("Nagpur", 160000),
                 new City("Mumbai", 100000000),
                 new City("Pune", 47348332),
                 new City("Amravati", 30000),
                 new City("Nasik", 200000));

         list.stream().collect(Collectors.groupingBy(e -> {
             if (e.getPopulation() < 100000) {
                 return "small";
             } else if (e.population >= 100000 || e.getPopulation() <= 1000000) {
                 return "medium";
             } else {
                 return "high";
             }
         }, Collectors.toList()))
                         .entrySet().stream()
                         .forEach((map)->System.out.println(map.getKey()+" "+map.getValue()));
     }
}
class City{
    String name;
    Integer population;

    public Integer getPopulation() {
        return population;
    }

    public void setPopulation(Integer population) {
        this.population = population;
    }

    public City(String name, Integer population) {
        this.name = name;
        this.population = population;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return  name ;
    }
}