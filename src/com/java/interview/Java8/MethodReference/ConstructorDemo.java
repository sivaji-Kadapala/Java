package com.java.interview.Java8.MethodReference;

public class ConstructorDemo {
    public static void main(String[] args) {
        GetEmployeeInstance employeeInstance=Employee::new;
        Employee e=employeeInstance.getEmployee ( 1,"sivaji" );
        System.out.println (e.getId ()+"+"+e.getName ());
    }
}
