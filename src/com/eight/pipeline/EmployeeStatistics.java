package com.eight.pipeline;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class EmployeeStatistics {

    public static void main(String[] args) {
        // TODO find unique employee names
        System.out.println(
        getEmployeeDetails().stream()
                            .map(Employee::getName)
                            .distinct()
                            //.skip(2)  0   1 * 10  2*10
                            //.limit(4) 10  10      10
                            .collect(Collectors.toList()));
    }

    private static  List<Employee> getEmployeeDetails() {
        return Arrays.asList(new Employee("Mahesh", 30, "Software Engineer", "SE"),
                new Employee("Siva", 32, "Managers", "MG"),
                new Employee("Prabhu", 32, "Software Engineer", "SE"),
                new Employee("Ramesh", 32, "Managers", "MG"),
                new Employee("Siva", 32, "Software Engineer", "SE"),
                new Employee("Prabhu", 39, "Software Engineer", "SE"));
    }
}
