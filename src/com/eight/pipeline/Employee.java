package com.eight.pipeline;

public class Employee {
    private String name;
    private Integer age;
    private String departName;
    private String departId;

    public Employee(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public Employee(String name, Integer age, String departName, String departId) {
        this.name = name;
        this.age = age;
        this.departName = departName;
        this.departId = departId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getDepartName() {
        return departName;
    }

    public void setDepartName(String departName) {
        this.departName = departName;
    }

    public String getDepartId() {
        return departId;
    }

    public void setDepartId(String departId) {
        this.departId = departId;
    }

    @Override
    public String toString() {
        return "Employee [name=" + name + ", age=" + age + ", departName=" + departName + ", departId=" + departId
                + "]";
    }

}
