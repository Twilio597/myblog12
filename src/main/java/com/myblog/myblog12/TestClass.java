package com.myblog.myblog12;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class TestClass {
    public static void main(String[] args) {
        List<String> data = Arrays.asList("mike","somu","ranu","tinku","jack");
        List<String> newData = data.stream().map(s->s.toUpperCase()).collect(Collectors.toList());
        System.out.println(newData);
    }
}
