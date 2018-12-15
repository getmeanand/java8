package com.eight.pipeline;

import java.util.function.BiFunction;
import java.util.function.Function;

public class DynamicFunctionCall {

    public static void main(String[] args) {
        // TODO: get the department id or department name
        
        Employee input = new Employee("Ram", 25, "Computer Science", "CS");
        
        Function<Employee, String> getDeptName = Employee::getDepartName;
        BiFunction<Employee, String, String> sample = (a, b) -> a.getDepartId().concat(b);
        System.out.println("Print dept name");
        System.out.println(getDynamic(input, getDeptName));
        
        System.out.println("Print dept Id");
        System.out.println(getDynamic(input, Employee::getDepartId));
    }
    
    
    private static String getDynamic(Employee input, Function<Employee, String> target) {
        // many lines
        return target.apply(input);
    }

}
