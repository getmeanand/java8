package com.eight.pipeline;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class EmployeeYoungest {

    public static void main(String[] args) {
        // TODO: find the youngest employees
        
        List<Employee> input = getEmployeeDetails();
        
        
        System.out.println(input.stream().max(Comparator.comparing(Employee::getAge)));
        
    }

    private static  List<Employee> getEmployeeDetails() {
        return Arrays.asList(new Employee("Dinesh", 25),
                new Employee("Raju", 29),
                new Employee("Partha", 32));
    }
}
