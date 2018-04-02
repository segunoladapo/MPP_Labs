package mum.mpp_lab.lab1;

import java.util.ArrayList;

public class Student extends Person {
    private double gpa;
    private ArrayList<Course> courses;

    public Student(String name, String phone,int age, int gpa){
        this.setName(name);
        this.setPhone(phone);
        this.setAge(age);
        this.gpa = gpa;
    })
    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public ArrayList<Course> getCourses() {
        return courses;
    }

    public void setCourses(ArrayList<Course> courses) {
        this.courses = courses;
    }
}
