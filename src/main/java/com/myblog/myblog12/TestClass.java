package com.myblog.myblog12;


import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class TestClass {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Ajay", "Arun", "Manoj", "Madhav", "Abhi");
        List<String> name = names.stream().filter(n -> n.startsWith("A")).collect(Collectors.toList());
        System.out.println(name);


    }



    }
