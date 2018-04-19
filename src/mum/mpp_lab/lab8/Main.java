package mum.mpp_lab.lab8;

import org.omg.CORBA.CODESET_INCOMPATIBLE;

import java.util.ArrayList;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {

    public static void main(String... args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee(0001, "Henry", "MI", "Kenethurky",
                "29-12-1998", "345-45-345", 34000));
        employees.add(new Employee(0002, "Ben", "MI", "Berthlomew",
                "29-12-1998", "345-45-345", 34000));
        employees.add(new Employee(0003, "Bruce", "MI", "Beauty",
                "29-12-1998", "345-45-345", 34000));
        //No of names that begin with letter B

       // Count the number of last names that begin with the letter  ‘B’.  Print out this number.
        long noOfemployeeWhoseSurnameStartsWithB = employees.stream()
                                                            .filter(employee -> employee.getLastName()
                                                            .startsWith("B"))
                                                            .count();

        //Print out all of the Employee objects whose last name begins with the letter  ‘B’  in sorted order.
        List<Employee> employeeWhoseSurnameStartsWithB = employees.stream()
                                                            .filter(employee -> employee.getLastName()
                                                            .startsWith("B"))
                                                            .sorted()
                                                            .collect(Collectors.toList());

        //Print out all of the Employee objects whose last name begins with the letter  ‘B’  and
        // change their first name and last name to be All capital letters.
                                                            employees.stream()
                                                            .filter(employee -> employee.getLastName()
                                                            .startsWith("B"))
                                                            .map(employee -> {
                                                                employee.setLastName(employee.getLastName().toUpperCase());
                                                                employee.setFirstName(employee.getFirstName().toUpperCase());
                                                                return employee;
                                                            }).forEach((e)->
                                                            {
                                                                        System.out.println(
                                                                        e.getLastName() + " " + e.getFirstName());
                                                            });


     //Print out all of the Employee objects whose last name begins with the letter  ‘B
        // and change their first name and last name to be All capital letters.
                                                                            employees.stream()
                                                                            .map(employee -> {
                                                                                        if(employee.getLastName().startsWith("B")){
                                                                                            employee.setLastName(employee.getLastName().toUpperCase());
                                                                                        }
                                                                                        return employee;
                                                                                }
                                                                                ).forEach((e)->
                                                                            {
                                                                                System.out.println(
                                                                                        e.getLastName() + " " + e.getFirstName());
                                                                            });
        //Use the  Collectors.joining  method to print out All Employee objects.
        String employeeStr = employees.stream()
                .map(Employee::toString)
                .collect(Collectors.joining());


        //)  Use the  Collectors.joining  method to print out All Employee objects,
        // and separate    each one with a delimeter of  “---\n---“
        String employeeStrWithDelimiter = employees.stream()
                .map(Employee::toString)
                .collect(Collectors.joining("\n"));

        //Print out all of the Employee objects’ last names, whose last name begins with the letter  ‘I’  in sorted order,
        // and get rid of all the duplicates.  Print out only the last names.

        employees.stream()
                .filter(e -> e.getLastName().startsWith("I"))
                .map(Employee::getLastName)
                .distinct()
                .sorted()
                .forEach(System.out::println);

        //Print out the average of all the salaries.
        IntSummaryStatistics summary = employees.stream().collect( Collectors.summarizingInt(e ->(int) e.getSalary()));
        System.out.println(summary.getAverage());

        //Use the  ‘reduce’  method to print out the total salary of all employees.
        double totalSalary = employees.stream()
                                    .map(Employee::getSalary)
                                    .reduce(0.0, (a , b) -> a + b);

        System.out.println(totalSalary);


        //Print out only the first names of all the employees.  Use the  ‘map’  method to accomplish this.
        employees.stream()
                .map(Employee::getFirstName)
                .forEach(System.out::println);


        //)  Create an infinite stream of even numbers (0, 2, 4, …)
        // and then, eventually print out only the first 20 even numbers from this stream.

        IntStream.iterate(2, i -> i * 2)
                .limit(40)
                .forEach(System.out::println);

    }


    //Implement  a method with the following signature and return type
    public int countWords(List<String> words, char c, char d, int len){
        return (int)
                 words
                .stream()
                .filter(word -> word.length() == len && word.contains(String.valueOf(c)) && !word.contains(String.valueOf(d)))
                .count();
    }
}
