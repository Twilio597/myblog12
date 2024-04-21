package com.myblog.myblog12;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class TestClass {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(13, 20, 15, 23, 69, 100, 1, 55,69,55,100,20,1,13);
        List<Integer> distinctNumbers = numbers.stream().distinct().collect(Collectors.toList());
        System.out.println(distinctNumbers);
    }
}
