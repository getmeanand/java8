package com.eight.pipeline;

import java.util.Arrays;
import java.util.List;
import java.util.function.IntPredicate;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class MultipleSearch {

    public static void main(String[] args) {
        // TODO: find employees who are younger than 30
        //                      and name starts with 'S'
        
        Predicate<Employee> youngerEmp = emp -> emp.getAge() < 30;
        Predicate<Employee> nameStartsWithS = emp -> emp.getName().startsWith("S");
        
        IntPredicate a = i -> i < 1;
        
        System.out.println(
        getEmployeeDetails().stream()
                            .filter(emp -> youngerEmp.negate().and(nameStartsWithS.negate()).test(emp))
                            .collect(Collectors.toList()));
        
    }

    private static  List<Employee> getEmployeeDetails() {
        return Arrays.asList(new Employee("Mahesh", 30),
                new Employee("Siva", 23),
                new Employee("Ram", 29));
    }
}
