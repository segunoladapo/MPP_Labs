package mum.mpp_lab.lab1;

import java.util.Date;

public class StaffStudent extends Faculty {

    private Student student;
    private Date startDate;
    private boolean firstCourseTracked;

    public StaffStudent(String name, String phone, int age, int salary, int gpa) {
        super(name, phone, age, salary);
        this.student = new Student(name, phone, age, gpa);
        firstCourseTracked = false;
    }

    public int getGpa() {
        return student.getAge();
    }

    public void addCourseToTake(Course course) {
        student.setCourses(course);
        if (firstCourseTracked == false) {
            startDate = new Date();
            firstCourseTracked = true;
        }

    }

    public Date getStartDate() {
        if (getStartDate() == null) {
            return null;
        }
        return (Date) getStartDate().clone();
    }

}
