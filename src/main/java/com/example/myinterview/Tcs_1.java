package com.example.myinterview;

import java.util.Arrays;
import java.util.List;


/*
* write a program to get employee having salary more than 10000
* */
public class Tcs_1 {
    static void main() {
      List<Emp> list= Arrays.asList(new Emp("shilpa",50000000)
                ,new Emp("prerna",100000),
                new Emp("poonam",24900),
                new Emp("Akshaya",300043));

        list.stream().filter(e->e.getSalary()>100000).forEach(System.out::println);
    }
}
class Emp{
    String name;
    Integer salary;

    @Override
    public String toString() {
        return "Emp{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getSalary() {
        return salary;
    }

    public void setSalary(Integer salary) {
        this.salary = salary;
    }

    public Emp(String name, Integer salary) {
        this.name = name;
        this.salary = salary;
    }
}
