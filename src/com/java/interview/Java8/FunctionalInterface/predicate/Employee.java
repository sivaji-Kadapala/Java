package com.java.interview.Java8.FunctionalInterface.predicate;

import java.util.Objects;

public class Employee {
    private int id;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass () != o.getClass ()) return false;
        Employee employee = (Employee) o;
        return id == employee.id && Double.compare ( employee.salary , salary ) == 0 && Objects.equals ( name , employee.name ) && Objects.equals ( gender , employee.gender );
    }

    @Override
    public int hashCode() {
        return Objects.hash ( id , name , gender , salary );
    }

    private String name;

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    private String gender;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    private double salary;

}
