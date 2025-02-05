package com.git_demo.git_demo;

import java.util.*;
import java.util.stream.Collectors;

class Details {
    private String name;
    private int age;
    private double salary;

    public Details(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getSalary() {
        return salary;
    }
}

public class EmployeeStreams {
    public static void main(String[] args) {
        List<Details> employees = new ArrayList<>(Arrays.asList(
            new Details("Manali", 28, 50000),
            new Details("Sumit", 35, 75000),
            new Details("Chandan", 40, 80000),
            new Details("Kapil", 25, 48000),
            new Details("Mayuri", 32, 70000)
        ));

        
        List<String> filteredEmployeeNames = employees.stream().filter(emp -> emp.getAge() > 30).map(Details::getName).collect(Collectors.toList());

        
        double avgSalary = employees.stream().filter(emp -> emp.getAge() > 30).mapToDouble(Details::getSalary).average().orElse(0.0);

        
        System.out.println("Employees older than 30: " + filteredEmployeeNames);
        System.out.println("Average salary of employees : " + avgSalary);
    }
}
