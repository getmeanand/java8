package com.eight.pipeline;

import java.util.Arrays;
import java.util.List;

public class EmployeeSearch {

    public static void main(String[] args) {
        // TODO: find the an employee
        
        String requiredPerson = "Mahessh";
        
        List<Employee> input = getEmployeeDetails();
        
        System.out.println(input.stream()
                                .filter(employee -> requiredPerson.equals(employee.getName()))
                                .findAny()
                                .orElseThrow()
                                        );
    }
    
    private static  List<Employee> getEmployeeDetails() {
        return Arrays.asList(new Employee("Mahesh", 30),
                new Employee("Siva", 32),
                new Employee("Prabhu", 39));
    }

}
