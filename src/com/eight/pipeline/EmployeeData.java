package com.eight.pipeline;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class EmployeeData {

    public static void main(String[] args) {
       /* List<String> input = Arrays.asList("B", "C", "A");
        System.out.println(input);
        Collections.sort(input);
        System.out.println(input);*/
        
        List<Employee> employee = getEmployeeDetails();
        System.out.println(employee);
        //Collections.sort(employee, (e1, e2) -> e1.getName().compareTo(e2.getName()));
        employee.sort(Comparator.comparing(Employee::getName).reversed()
                .thenComparing(Comparator.comparing(Employee::getAge)));
        System.out.println(employee);
        
        /*System.out.println(employee);
        Collections.sort(employee, (e1, e2) -> e1.getAge().compareTo(e2.getAge()));
        System.out.println(employee);*/
    }

    private static  List<Employee> getEmployeeDetails() {
        return Arrays.asList(new Employee("Ram", 10),
                new Employee("Raj", 12),
                new Employee("Raj", 9));
    }
}