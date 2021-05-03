package com.example.NachislenieZP.models;

public final class EmployeeModel {
    private long id;
    private String name;
    private String post;
    private int salary;

    public EmployeeModel(Long id,  String name, String post, int salary) {
        this.id = id;
        this.name = name;
        this.post = post;
        this.salary = salary;
    }

    public long getId() {
        return id;
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

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPost(String post) {
        this.post = post;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}
