package com.java.interview.Coding.pojo2;

public class Employee {
    private  int id;
    private String name;
    private int age;
    private String gender;
    private String department;
    private int YearOfJoining;

    public Employee(int id, String name, int age, String gender, String department, int yearOfJoining, double salary, String city) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.department = department;
        YearOfJoining = yearOfJoining;
        this.salary = salary;
        this.city = city;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    private double salary;
    private String city;
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



    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public int getYearOfJoining() {
        return YearOfJoining;
    }

    public void setYearOfJoining(int yearOfJoining) {
        YearOfJoining = yearOfJoining;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", department='" + department + '\'' +
                ", YearOfJoining=" + YearOfJoining +
                ", salary=" + salary +
                ", city='" + city + '\'' +
                '}';
    }
}