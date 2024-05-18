package File.Serialization;

import java.io.Serializable;

public class Employee implements Serializable {
    String name;
    int id;
    public Employee(String name, int id) {
        this.name = name;
        this.id = id;
    }
}
