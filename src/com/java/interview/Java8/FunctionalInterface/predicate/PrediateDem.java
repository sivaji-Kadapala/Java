package com.java.interview.Java8.FunctionalInterface.predicate;

import java.util.function.Predicate;

public class PrediateDem {
    public static void main(String[] args) {
        Predicate<Integer> ageCheck=age->age>21;
        System.out.println (ageCheck.test ( 32 ));
        if(ageCheck.test ( 4)){
            System.out.println ("Eligible");
        }else {
            System.out.println ("Not Eligible");
        }
        Employee e1=new Employee ();
        e1.setId ( 111 );
        e1.setSalary ( 24000 );
        Predicate<Employee> empSalaryCheck=emp->emp.getSalary ()>25000;
        if(empSalaryCheck.test ( e1 )){
            System.out.println ("Above 25000");
        }else {
            System.out.println ("Below 25000");
        }
        Predicate<Employee> femaleCheck=emp->emp.getGender ().equalsIgnoreCase ( "female" );
        e1.setGender ( "FEMALE" );
        boolean result = empSalaryCheck.and ( femaleCheck ).test ( e1 );
        System.out.println (result);
        //salary>25000 or gender is female
        result=empSalaryCheck.or ( femaleCheck ).test ( e1 );
        System.out.println (result);
        //negate
        result=femaleCheck.negate ().test ( e1 );
        System.out.println (result);
        //req:Employee:have to validate other employees.
        //employee:equals method.
        Predicate<Employee> baseEmp=Predicate.isEqual ( e1 );
        Employee e2=new Employee ();
        e2.setId ( 112 );
        e2.setSalary ( 244000 );
        result=baseEmp.test ( e2);
        System.out.println (result);
    }


}
