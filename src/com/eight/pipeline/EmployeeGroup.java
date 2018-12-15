package com.eight.pipeline;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class EmployeeGroup {

    public static void main(String[] args) {
        // TODO Group Employees based on their Department
        
        System.out.println(
                getEmployeeDetails().stream()
                                    .collect(Collectors.groupingBy(emp -> emp.getDepartId(),
                                            Collectors.counting()))
                );
    }

    private static  List<Employee> getEmployeeDetails() {
        return Arrays.asList(new Employee("Mahesh", 30, "Software Engineer", "SE"),
                new Employee("Siva", 32, "Managers", "MG"),
                new Employee("Prabhu", 39, "Software Engineer", "SE"));
    }
}
