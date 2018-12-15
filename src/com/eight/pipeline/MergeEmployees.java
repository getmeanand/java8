package com.eight.pipeline;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MergeEmployees {
    public static void main(String[] args) {
        // TODO: Merge all employees into a single list
        List<Employee> a = getEmployeeByDepartment().entrySet()
                                 .stream()
                                 .map(Map.Entry::getValue)
                                 .flatMap(List::stream)
                                 .collect(Collectors.toList());
        System.out.println(a);
    }
    
    private static  Map<String, List<Employee>> getEmployeeByDepartment() {
        return Stream.of(new Employee("Mahesh", 30, "Software Engineer", "SE"),
                new Employee("Siva", 32, "Managers", "MG"),
                new Employee("Prabhu", 39, "Software Engineer", "SE"))
                .collect(Collectors.groupingBy(Employee::getDepartId));
    }
}
