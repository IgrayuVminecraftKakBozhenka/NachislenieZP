package com.example.NachislenieZP;

public final class EmployeeModel {
    private final String name;
    private final String post;
    private final int salary;

    public EmployeeModel(String name, String post, int salary) {
        this.name = name;
        this.post = post;
        this.salary = salary;
    }


    public String getName() {
        return name;
    }

    public String getPost() {
        return post;
    }

    public int getSalary() {
        return salary;
    }
}
