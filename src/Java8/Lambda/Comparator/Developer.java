package Java8.Lambda.Comparator;

import java.math.BigDecimal;

public class Developer {
    private String name;
    private BigDecimal salary;

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Developer{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                ", age=" + age +
                '}';
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = BigDecimal.valueOf(salary);
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Developer(String name, BigDecimal salary, Integer age) {
        this.name = name;
        this.salary = salary;
        this.age = age;
    }

    private Integer age;
}
