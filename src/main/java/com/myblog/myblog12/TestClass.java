package com.myblog.myblog12;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class TestClass {
    public static void main(String[] args) {
        Consumer<Integer> result = number-> System.out.println(number);
        result.accept(100);
    }
}
