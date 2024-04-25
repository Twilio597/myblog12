package com.myblog.myblog12;


import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class TestClass {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
                new Employee("mike",30,"chennai"),
                new Employee("adam",25,"chennai"),
                new Employee("stallin",30,"mumbai"),
                new Employee("sam",34,"bangalore")
        );

        Map<Integer, List<Employee>> collect = employees.stream().collect(Collectors.groupingBy(e -> e.getAge()));
        for(Map.Entry<Integer,List<Employee>> entry:collect.entrySet()){
            Integer age = entry.getKey();
            List<Employee> employeesWithAge = entry.getValue();
            System.out.println("age:"+age+"---");

            for(Employee e:employeesWithAge){
                System.out.println(e.getName());
                System.out.println(e.getCity());
            }
        }

    }



    }
