package com.java.interview.Java8.MethodReference;

public class Employee {
    private int id;

    public Employee() {
        System.out.println ("Employee with no data");
    }
Employee (int id,String name){
    System.out.println ("Employee with  data");
        this.id=id;
        this.name=name;
}
    private String name;
    private String gender;
    private double salary;
//static method
    static  boolean validateEmpDetailes(Employee employee){
        if(employee.getId ()!=0&&employee.getName ()!=null)
            return  true;
            return false;

    }
    boolean validateEmpDetailes2(Employee employee){
        if(employee.getId ()!=0&&employee.getName ()!=null)
            return  true;
        return false;

    }
    boolean validSalary(){
        return this.getSalary ()>0?true:false;
    }
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

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
