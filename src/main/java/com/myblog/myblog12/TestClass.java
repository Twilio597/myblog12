package com.myblog.myblog12;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class TestClass {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("somu", "ranu", "tinku", "jack");
        Consumer<String> val = name-> System.out.println(name);
        names.forEach(val);
    }
}
