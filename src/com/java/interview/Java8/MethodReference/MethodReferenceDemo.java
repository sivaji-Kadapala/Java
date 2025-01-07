package com.java.interview.Java8.MethodReference;

import java.util.Arrays;

public class MethodReferenceDemo {
    public static void main(String[] args) {
        Employee employee=new Employee ();
        EmployeeValidation validation=employee::validateEmpDetailes2;
        EmployeeValidation validEmployee=Employee::validateEmpDetailes;
        Employee emp1=new Employee ();
        Employee emp2=new Employee ();
        emp2.setId ( 1 );
        emp2.setName ( "Sivaji" );
        emp2.setSalary ( 200 );
        System.out.println (validEmployee.isValidEmployee ( emp1 ));
        System.out.println (validEmployee.isValidEmployee ( emp2 ));
        System.out.println (validation.isValidEmployee ( emp1 ));
        System.out.println (validation.isValidEmployee ( emp2 ));
        EmployeeValidation salary=Employee::validSalary;
        System.out.println (salary.isValidEmployee ( emp2 ));
        String[] values= {"ax" , "cx" , "ex" , "bx"} ;
        Arrays.sort ( values,String::compareToIgnoreCase);
        for (String str:values
             ) {
            System.out.println (str);

        }
    }
}
