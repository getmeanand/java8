package com.eight.pipeline;

import java.util.Optional;

public class SetDepartment {

    public static void main(String[] args) {
        // TODO set department for the New Joinee
        
        Employee emp = null;// new Employee("Raja", 39);
        
        Optional.ofNullable(emp).ifPresent(e  -> {
            emp.setDepartName("Computer Science");
            emp.setDepartId("CS");
            System.out.println(emp);
        });
        
        System.out.println(
        Optional.ofNullable(emp)
                .map(e  -> {
                    emp.setDepartName("Computer Science");
                    emp.setDepartId("CS");
                    return e;
                })
                .map(e -> e.getDepartName()));
            
    }

}
