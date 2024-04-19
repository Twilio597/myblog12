package com.myblog.myblog12;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class TestClass {
    public static void main(String[] args) {
        List<String> numbers = Arrays.asList("Somu", "ranu", "Somu", "tinku", "vivek", "Somesh");
        List<String> data1 = numbers.stream().filter(s->s.startsWith("S")).collect(Collectors.toList());
        List<String> data2 = numbers.stream().filter(s->s.equals("Somu")).collect(Collectors.toList());
        List<String> data3 = numbers.stream().filter(s->s.endsWith("u")).collect(Collectors.toList());
        List<String> data4 = numbers.stream().filter(s->s.endsWith("k")).collect(Collectors.toList());
        System.out.println(data4);
        System.out.println(data1);
        System.out.println(data2);
        System.out.println(data3);
    }
}
