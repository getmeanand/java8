package com.eight.pipeline;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class EmployeeNames {

    public static void main(String[] args) {
        // TODO Print all the Employee names
        
        System.out.println(
        getEmployeeDetails().stream()
                            .map(Employee::getName)
                            .collect(Collectors.joining()));

    }
    
    private static  List<Employee> getEmployeeDetails() {
        return Arrays.asList(new Employee("Mahesh", 30),
                new Employee("Siva", 32),
                new Employee("Prabhu", 39));
    }

}
