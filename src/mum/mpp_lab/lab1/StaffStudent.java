package mum.mpp_lab.lab1;

public class StaffStudent extends Faculty {

    private Student student;

    public StaffStudent(String name, String phone, int age, int salary, int gpa) {
        super(name, phone, age, salary);
        this.student = new Student(name, phone, age, gpa);
    }

    public int getGps() {
        return student.getAge();
    }

}
