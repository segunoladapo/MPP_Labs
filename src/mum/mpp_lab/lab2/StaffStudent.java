package mum.mpp_lab.lab2;

import java.util.Date;

public class StaffStudent extends Staff {

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

    public void addCourse(Course course) {
        student.setCourses(course);
        if (!firstCourseTracked) {
            startDate = new Date();
            firstCourseTracked = true;
        }

    }

    public Date getStartDate() {
        if (startDate == null) {
            return null;
        }
        return (Date) startDate.clone();
    }

}
