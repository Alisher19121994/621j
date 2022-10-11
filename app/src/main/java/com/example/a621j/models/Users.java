package com.example.a621j.models;

public class Users {

    int age;
    double salary;
    long workH;
    boolean timeTable;

    public Users() {

    }

    public void setAge(String age) {
        this.age = Integer.parseInt(age);
    }

    public void setSalary(String salary) {
        this.salary = Double.parseDouble(salary);
    }

    public void setWorkH(String workH) {
        this.workH = Long.parseLong(workH);
    }

    public void setTimeTable(String timeTable) {
        this.timeTable = Boolean.parseBoolean(timeTable);
    }

    public Users(int age, double salary, long workH, boolean timeTable) {
        this.age = age;
        this.salary = salary;
        this.workH = workH;
        this.timeTable = timeTable;
    }
}
