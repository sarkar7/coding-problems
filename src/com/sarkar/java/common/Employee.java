package com.sarkar.java.common;

import java.util.ArrayList;
import java.util.List;

public class Employee {

    private String name;
    private int age;
    private int salary;
    private boolean isMarried;

    public Employee(String name, int age, int salary, boolean isMarried) {
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.isMarried = isMarried;
    }

    public static List<Employee> getEmployees() {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("Sourabh", 29, 55000, false));
        employees.add(new Employee("Rahul", 28, 45000, false));
        employees.add(new Employee("Ram", 30, 55000, true));
        employees.add(new Employee("Abhay", 35, 70000, true));
        employees.add(new Employee("Ashish", 32, 60000, true));
        employees.add(new Employee("Dipayan", 30, 55000, false));
        employees.add(new Employee("Ajit", 36, 75000, true));
        return employees;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public boolean isMarried() {
        return isMarried;
    }

    public void setMarried(boolean isMarried) {
        this.isMarried = isMarried;
    }

    @Override
    public String toString() {
        return "Employee [name=" + name + ", age=" + age + ", salary=" + salary + ", isMarried=" + isMarried + "]";
    }

}
