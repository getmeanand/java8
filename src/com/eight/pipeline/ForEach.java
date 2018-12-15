package com.eight.pipeline;

import java.util.Arrays;
import java.util.List;

public class ForEach {

    public static void main(String[] args) {
        // TODO: iterate a list
        //       count 'i'
        //       print
        
        List<String> list = Arrays.asList("coini", "double", "trip", "tesiiit");
        list.stream()
            .map(input -> countOccurances(input, 'i'))
            .forEach(count -> {
                System.out.println("Count of current element is : " + count);
            });
    }
    
    private static long countOccurances(String input, Character check) {
        return input.chars().filter(hasI -> hasI == check).count();
    }
}
