package mum.mpp_lab.lab1;

import java.util.ArrayList;

public class Faculty extends Person {
    private double salary;
    private ArrayList<Course> courses;

    public Faculty(String name, String phone,int age, int salary){
        this.setName(name);
        this.setPhone(phone);
        this.setAge(age);
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public ArrayList<Course> getCourses() {
        return courses;
    }

    public void setCourses(ArrayList<Course> courses) {
        this.courses = courses;
    }
}
