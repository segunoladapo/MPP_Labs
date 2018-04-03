package mum.mpp_lab.lab1;

import java.util.ArrayList;
import java.util.List;

public class Department {
    private String name;
    private List<Person> persons;

    public Department() {
        persons = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addPerson(Person person) {
        persons.add(person);
    }

    public void addFaculty(Person faculty) {
        persons.add(faculty);
    }

    public void addStudent(Person student) {
        persons.add(student);
    }

    public double getTotalSalary() {
        double totalSalary = 0.0;
        for (Person person : persons) {
            if (person instanceof Staff) {
                //Safe to downcast
                totalSalary += ((Staff) person).getSalary();
            }
            if (person instanceof Faculty) {
                //Safe to downcast
                totalSalary += ((Faculty) person).getSalary();
            }
        }
        return totalSalary;
    }

    public void showAllMembers() {
        for (Person person : persons) {
            System.out.println(person.getName() + " " + person.getPhone() + " " + person.getAge());
        }
    }

    public void unitsPerFaculty() {
        for (Person person : persons) {
            if (person instanceof Faculty) {
                Faculty faculty = (Faculty) person;
                List<Course> courses = faculty.getCourses();
                int totalNumUnits = 0;
                for (Course course : courses) {
                    totalNumUnits += course.getUnits();
                }
                System.out.println(faculty.getName() + " Total Units: " + totalNumUnits);
            }
        }
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

        Course programming = new Course("CS201", "Programming 1", 4, (Faculty) johnDoodle);
        Course databases = new Course("CS360", "Databases", 3, (Faculty) samHoward);
        Course compilers = new Course("CS404", "Compilers", 4, (Faculty) johnDoodle);
        Course dataStructures = new Course("CS240", "Data structures", 2, (Faculty) johnDoodle);
        Course softwareEngr = new Course("CS301", "Software Engineering", 3, (Faculty) samHoward);
        Course advncdArchitecture = new Course("CS450", "Advanced Architecture", 5, (Faculty) frankMoore);

        ((Faculty) johnDoodle).setCourses(programming);
        ((Faculty) johnDoodle).setCourses(compilers);
        ((Faculty) johnDoodle).setCourses(dataStructures);

        ((Faculty) samHoward).setCourses(databases);
        ((Faculty) samHoward).setCourses(softwareEngr);

        ((Faculty) frankMoore).setCourses(advncdArchitecture);

        ((Student) johnDoe).setCourses(programming);
        ((Student) johnDoe).setCourses(databases);
        ((Student) johnDoe).setCourses(compilers);
        ((Student) johnDoe).setCourses(softwareEngr);

        ((Student) maryJones).setCourses(programming);
        ((Student) maryJones).setCourses(compilers);
        ((Student) maryJones).setCourses(advncdArchitecture);

        ((Student) leeJohnson).setCourses(programming);
        ((Student) leeJohnson).setCourses(databases);
        ((Student) leeJohnson).setCourses(dataStructures);
        ((Student) leeJohnson).setCourses(advncdArchitecture);

        System.out.println("Total Salary: " + dept.getTotalSalary());
        dept.showAllMembers();
        dept.unitsPerFaculty();

    }


}
