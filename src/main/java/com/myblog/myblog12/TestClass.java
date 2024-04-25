package com.myblog.myblog12;


import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class TestClass {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(10, 20, 12, 3, 15, 17,18,8,14);
        List<Integer> data = numbers.stream().filter(n1 -> n1 % 2 == 0).map(n2 -> n2 * n2).collect(Collectors.toList());
        System.out.println(data);


    }



    }
