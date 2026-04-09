package com.example.drunken_engineer;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ConvertListToMap {
    static void main() {

        List<Employee> employeeList = new ArrayList<>();
        createEmployeeList(employeeList);
     //   System.out.println(employeeList);

        Map<String, List<Employee>> map = employeeList.stream()
                .collect(Collectors.groupingBy(Employee::getCity));

        map.forEach((k,v)-> System.out.println("City : "+k+" Employees :"+v));
    }

    private static void createEmployeeList(List<Employee> employeeList) {

        Employee e1 = new Employee();
        e1.setId("1");
        e1.setName("Shilpa");
        e1.setCity("Nagpur");

        Employee e2 = new Employee();
        e2.setId("1");
        e2.setName("Afrin");
        e2.setCity("Surat");

        Employee e3 = new Employee();
        e3.setId("1");
        e3.setName("Mayuri");
        e3.setCity("Nagpur");

        employeeList.add(e1);
        employeeList.add(e2);
        employeeList.add(e3);
    }
}
