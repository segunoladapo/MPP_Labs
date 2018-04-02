package mum.mpp_lab.lab1;

public class Department {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addPerson(Person person){

    }

    public void addFaculty(Faculty faculty){

    }

    public void addStudent(Student student){

    }


    public static void main(String[] args) {
        Department dept = new Department();
        Person frankMoore = new Faculty("Frank Moore", "472-5921", 43, 10000);
        Person samHoward = new Faculty("Sam Howard", "472-7222", 55, 9500);
        Person johnDoodle = new Faculty("John Doodle", "472-6190", 39, 8600);

        dept.addPerson(frankMoore);
        dept.addFaculty(samHoward);
        dept.addFaculty(johnDoodle);


        // Create student objects
        Person johnDoe = new Student("John Doe", "472-1121", 22, 4.0);
        Person maryJones = new Student("Mary Jones", "472-7322", 32, 3.80);
        Person leeJohnson = new Student("Lee Johnson", "472-6009", 19, 3.65);

        dept.addPerson(johnDoe);
        dept.addStudent(maryJones);
        dept.addStudent(leeJohnson);

    }


}
