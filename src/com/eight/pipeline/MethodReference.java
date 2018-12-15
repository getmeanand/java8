package com.eight.pipeline;

import java.util.Optional;

public class MethodReference {
    
    public static void main(String[] args) {
        // just an improvement
        
        MethodReference mf = new MethodReference();
        
        System.out.println(
        Optional.ofNullable(mf.process("first part"))
                .map(in -> in.concat(" second part"))
                .orElse("default"));
    }
    
    public String referenceMethod(String input) {
        return Optional.ofNullable(input)
                       //.map(in -> in.toUpperCase()) // Calling a static method
                       .map(String::toUpperCase)
                       .orElse(input);
    }
    
    public String process(String input) {
        return Optional.ofNullable(input)
                       //.map(in -> referenceMethod(in)) // Calling a reference method
                       .map(this::referenceMethod)
                       .orElse(null);
    }
}
