package com.myblog.myblog12;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class TestClass {
    public static void main(String[] args) {
        List<String> fruits = Arrays.asList("orange", "apple", "banana", "pineapple", "grapes");
        Consumer<String> val = fruit-> System.out.println(fruit);
        fruits.forEach(val);
    }
}
