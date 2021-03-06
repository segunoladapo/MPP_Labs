package mum.mpp_lab.lab8.lab8_2;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Department {
    private String name;
    private List<Person> persons;

    public Department() {
        persons = new ArrayList<>();
    }

    public void addPerson(Person person) {
        persons.add(person);
    }

    public double getTotalSalary() {
/*
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
*/
        return persons.stream()
                .map(p ->{
                    if (p instanceof Staff) {
                        //Safe to downcast
                        return  ((Staff) p).getSalary();
                    }
                    if (p instanceof Faculty) {
                        //Safe to downcast
                        return  ((Faculty) p).getSalary();
                    }
                    return 0.0;
                }).reduce(0.0, (a,b) -> a + b);

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

    private static void findFacultyAndCourses(String facultyName, List<Person> persons) {
        /*
        for (Person person : persons) {
            if (person.getName().equals(facultyName)) {
                List<Course> courses = ((Faculty) person).getCourses();
                for (Course course : courses) {
                    for (Person student : persons) {
                        if (student instanceof IStudent) {
                            if (((Student) student).getCourses().contains(course)) {
                                System.out.println("Course " + course.getNumber() + " is offered by " +
                                        student.getName());
                            }
                        }
                    }
                }
            }

        }
        */
        persons.stream()
                .filter(p -> p.getName().equals(facultyName))
                .forEach(faculty -> {
                    ((Faculty) faculty).getCourses()
                            .forEach(c -> {
                                persons.forEach(p -> {
                                    if (p instanceof IStudent) {
                                        if (((Student) p).getCourses().contains(c)) {
                                            Student student = (Student) p;
                                            System.out.println("Course " + c.getNumber() + " is offered by " +
                                                    student.getName());
                                        }
                                    }
                                });
                            });
                });

    }

    public static void main(String[] args) throws IOException {
        Department dept = new Department();
        Person frankMoore = new Faculty("Frank Moore", "472-5921", 43, 10000);
        Person samHoward = new Faculty("Sam Howard", "472-7222", 55, 9500);
        Person johnDoodle = new Faculty("John Doodle", "472-6190", 39, 8600);

        dept.addPerson(frankMoore);
        dept.addPerson(samHoward);
        dept.addPerson(johnDoodle);


        // Create student objects
        Person johnDoe = new Student("John Doe", "472-1121", 22, 4.0);
        Person maryJones = new Student("Mary Jones", "472-7322", 32, 3.80);
        Person leeJohnson = new Student("Lee Johnson", "472-6009", 19, 3.65);

        dept.addPerson(johnDoe);
        dept.addPerson(maryJones);
        dept.addPerson(leeJohnson);

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

        ((Student) johnDoe).addCourse(programming);
        ((Student) johnDoe).addCourse(databases);
        ((Student) johnDoe).addCourse(compilers);
        ((Student) johnDoe).addCourse(softwareEngr);

        ((Student) maryJones).addCourse(programming);
        ((Student) maryJones).addCourse(compilers);
        ((Student) maryJones).addCourse(advncdArchitecture);

        ((Student) leeJohnson).addCourse(programming);
        ((Student) leeJohnson).addCourse(databases);
        ((Student) leeJohnson).addCourse(dataStructures);
        ((Student) leeJohnson).addCourse(advncdArchitecture);

        while (true) {
            putText("Enter first letter of ");
            putText("getTotalSalary, showAllMembers, unitsPerFaculty or quit : ");
            int choice = getChar();
            switch (choice) {
                case 'g':
                    double totsalary = dept.getTotalSalary();
                    putText("Total sum of all salaries is:");
                    putText(String.valueOf(totsalary) + "\n");
                    break;
                case 's':
                    dept.showAllMembers();
                    break;
                case 'u':
                    dept.unitsPerFaculty();
                    break;
                case 'p':
                    putText("Enter Faculty Member name");
                    String facultyName = getString();
                    findFacultyAndCourses(facultyName, dept.persons);
                    break;
                case 'q':
                    return;
                default:
                    putText("Invalid entry\n");
            }  // end switch
        }  // end while

    }

    private static void taskSelection() {

    }  // end main()

    public static void putText(String s) //writes string s to the screen
    {
        System.out.println(s);
    }

    // -------------------------------------------------------------
    public static String getString() throws IOException  //reads a string from the keyboard input
    {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        String s = br.readLine();
        return s;
    }

    // -------------------------------------------------------------
    public static char getChar() throws IOException //reads a character from the keyboard input
    {
        String s = getString();
        return s.charAt(0);
    }


}
