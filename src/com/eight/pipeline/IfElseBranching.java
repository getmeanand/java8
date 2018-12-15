package com.eight.pipeline;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class IfElseBranching {

    public static void main(String[] args) {
        // TODO: iterate list of string
        //       if string has 'i' count else return length
        //       collect
        //       print
        
        List<String> list = Arrays.asList("coin", "double", "trip", "test");
        Character checkChar = 'i';
        System.out.println(
        list.stream()
            .map(iCharCount -> iCharCount.contains("i") ? countOccurances(iCharCount, checkChar) : iCharCount.length())
            .collect(Collectors.toList()));
        
    }

    private static long countOccurances(String input, Character check) {
        return input.chars().filter(hasI -> hasI == check).count();
    }

}
