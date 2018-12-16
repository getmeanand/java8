package com.eight.pipeline;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class GenerateNumbers {

    public static void main(String[] args) {
        //TODO generating numbers
        List<String> nums = IntStream.rangeClosed(1, 9)
                                     .mapToObj(String::valueOf)
                                     .collect(Collectors.toList());
        List<String> alphas = IntStream.rangeClosed('A', 'Z')
                                       .mapToObj(i -> (char) i)
                                       .map(String::valueOf)
                                       .collect(Collectors.toList());
        
        System.out.println(nums);
        System.out.println(alphas);
        
        System.out.println(
        alphas.stream()
              .flatMap(a -> nums.stream().map(n -> a + n))
              .collect(Collectors.toList()));
    }

    public static boolean isPrime(int number) {
        return IntStream.rangeClosed(2, number / 2)
                        .noneMatch(iter -> number % iter == 0);
    }

}
