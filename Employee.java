package com.company;

public class Employee {
    int Id;
    String Name;
    int Salary;

    public void setSalary(int salary) {
        Salary = salary;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getSalary() {
        return Salary;
    }
}
