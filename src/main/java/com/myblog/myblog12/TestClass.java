package com.myblog.myblog12;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class TestClass {
    public static void main(String[] args) {
        Supplier<Integer> x = ()->new Random().nextInt(100);
        Integer y = x.get();
        System.out.println(y);
    }
}
