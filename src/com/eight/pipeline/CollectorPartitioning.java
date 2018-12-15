package com.eight.pipeline;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CollectorPartitioning {

    public static void main(String[] args) {
        List<String> list = Arrays.asList("coini", "double", "trip", "tesiiit");
        
        Map<Boolean, List<String>> partialResult = list.stream().collect(Collectors.partitioningBy(hasI -> hasI.contains("i")));
        
        System.out.println(partialResult.get(Boolean.TRUE)
                                        .stream()
                                        .map(count -> count.chars().filter(hasI -> hasI == 'i').count())
                                        .collect(Collectors.toList())
                                        );
        
        System.out.println(partialResult.get(Boolean.FALSE));
    }
}
