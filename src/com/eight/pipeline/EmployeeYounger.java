package com.eight.pipeline;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class EmployeeYounger {

    public static void main(String[] args) {
        // TODO: filter employees who all are less than 30
        
        List<Employee> input = getEmployeeDetails();
        Predicate<Employee> findYounger = e -> e.getAge() < 30;
        //Predicate<Employee> findElder = e -> e.getAge() >= 30;
        
        System.out.println(findEmployeeGroup(input, findYounger));
        
    }

    private static List<Employee> findEmployeeGroup(List<Employee> input, Predicate<Employee> empGroup) {
        return input.stream()
                    .filter(isYoung -> empGroup.test(isYoung))
                    .collect(Collectors.toList());
    }

    private static  List<Employee> getEmployeeDetails() {
        return Arrays.asList(new Employee("Dinesh", 25),
                new Employee("Raju", 29),
                new Employee("Partha", 32));
    }
}
