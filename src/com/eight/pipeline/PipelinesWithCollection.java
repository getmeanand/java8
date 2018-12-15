package com.eight.pipeline;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class PipelinesWithCollection {

    public static void main(String[] args) {
        // TODO: iterate the list of Strings
        // convert into lower case
        // collect
        // print

        List<String> alphas = Arrays.asList("A", "B", "C", "D", null);
        List<String> result = alphas.stream()
                                    .filter(nonNull -> Objects.nonNull(nonNull))
                                    .map(lower -> lower.toLowerCase())
                                    .collect(Collectors.toList());
        System.out.println(alphas);
        System.out.println(result);
    }
}
