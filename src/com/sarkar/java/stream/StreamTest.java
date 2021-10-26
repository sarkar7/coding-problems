package com.sarkar.java.stream;

import com.sarkar.java.common.Employee;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamTest {

    public static void main(String[] args) {

        List<Employee> employees = Employee.getEmployees();

        // Filter
        employees.stream().filter(e -> e.getSalary() >= 60000).forEach(e -> System.out.println(e.getName()));
        System.out.println("**************");

        // Grouping
        Map<Integer, Long> counting = employees.stream()
                .collect(Collectors.groupingBy(Employee::getSalary, Collectors.counting()));

        counting.forEach((k, v) -> System.out.println(k + " - " + v));
        System.out.println("**************");

        // Sorting based on name
        employees.stream().sorted(Comparator.comparing(Employee::getName))
                .forEach(e -> System.out.println(e.getName()));
        System.out.println("**************");

        // Reverse Sorting based on name
        employees.stream().sorted(Comparator.comparing(Employee::getName).reversed())
                .forEach(e -> System.out.println(e.getName()));
        System.out.println("**************");

        // Calculating Average
        double avgSal = employees.stream().mapToDouble(Employee::getSalary).average().getAsDouble();
        System.out.println(avgSal);
        System.out.println("**************");


    }

}
