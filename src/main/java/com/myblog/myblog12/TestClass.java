package com.myblog.myblog12;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class TestClass {
    public static void main(String[] args) {
        List<Integer> data = Arrays.asList(10, 20, 30, 40, 50, 90, 100);
        List<Integer> newData = data.stream().map(i -> i -5).collect(Collectors.toList());
        System.out.println(newData);
    }
}
