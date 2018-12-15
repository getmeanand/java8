package com.eight.pipeline;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class EmployeeRemove {

    public static void main(String[] args) {
        // TODO: Remove an Employee from the collection
        
        List<Employee> input = getEmployeeDetails();
        String target = "Somu";

        System.out.println(input);
        
        /*for (Iterator iterator = input.iterator(); iterator.hasNext();) {
            Employee employee = (Employee) iterator.next();
            if(target.equals(employee.getName())) {
                iterator.remove();
            }
        }*/
        
        input.removeIf(employee -> target.equals(employee.getName()));
        System.out.println(input);
    }

    private static  List<Employee> getEmployeeDetails() {
        List<Employee> sample = new ArrayList<>();
        sample.add(new Employee("Suresh", 27));
        sample.add(new Employee("Melvin", 29));
        sample.add(new Employee("Somu", 30));
        sample.add(new Employee("Deepan", 31));
        return sample;
       /* return Arrays.asList(new Employee("Suresh", 27),
                new Employee("Melvin", 29),
                new Employee("Somu", 30),
                new Employee("Deepan", 31));*/
    }
}
