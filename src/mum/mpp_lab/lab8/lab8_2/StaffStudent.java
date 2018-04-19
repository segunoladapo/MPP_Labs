package mum.mpp_lab.lab8.lab8_2;


import java.util.ArrayList;
import java.util.Date;

public class StaffStudent extends Staff implements IStudent {

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
        student.addCourse(course);
        if (!firstCourseTracked) {
            startDate = new Date();
            firstCourseTracked = true;
        }

    }

    public ArrayList<Course> getCourses(){
        return student.getCourses();
    }

    public Date getStartDate() {
        if (startDate == null) {
            return null;
        }
        return (Date) startDate.clone();
    }

}
