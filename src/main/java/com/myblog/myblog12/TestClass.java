package com.myblog.myblog12;


import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class TestClass {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
                new Employee("Sam",30,"chennai"),
                new Employee("Adam",25,"Mumbai"),
                new Employee("Jack",32,"Bangalore"),
                new Employee("Stallin",34,"chennai")
                );

        List<Employee> emps = employees.stream().filter(emp -> emp.getAge() > 30).collect(Collectors.toList());

        for(Employee e: emps){
            System.out.println(e.getName());
            System.out.println(e.getCity());
            System.out.println(e.getAge());
        }

    }



    }
