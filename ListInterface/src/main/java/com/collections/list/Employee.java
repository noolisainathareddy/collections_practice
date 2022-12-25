package com.collections.list;

public class Employee implements Comparable<Employee> {
     private String name;
     private Integer age;
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public Integer getAge() {
//        return age;
//    }
//
//    public void setAge(Integer age) {
//        this.age = age;
//    }
//
    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public Employee(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public int compareTo(Employee e){
        return this.age-e.age;
    }



}
