package mum.mpp_lab.lab8;

import org.omg.CORBA.CODESET_INCOMPATIBLE;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

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

        long noOfemployeeWhoseSurnameStartsWithB = employees.stream()
                                                            .filter(employee -> employee.getLastName()
                                                            .startsWith("B"))
                                                            .count();

        List<Employee> employeeWhoseSurnameStartsWithB = employees.stream()
                                                            .filter(employee -> employee.getLastName()
                                                            .startsWith("B"))
                                                            .sorted()
                                                            .collect(Collectors.toList());
        List<Employee> changeEmployeeNamesToCapital =  employees.stream()
                                                            .filter(employee -> employee.getLastName()
                                                            .startsWith("B"))
                                                            .map(employee -> {
                                                                employee.setLastName(employee.getLastName().toUpperCase());
                                                                employee.setFirstName(employee.getFirstName().toUpperCase());
                                                                return employee;
                                                            })
                                                            .collect(Collectors.toList());


        List<Employee> allEmployeesWithOnlyLastNameBCapitalized = employees.stream()
                                                                            .map(employee -> {
                                                                                        if(employee.getLastName().startsWith("B")){
                                                                                            employee.setLastName(employee.getLastName().toUpperCase());
                                                                                        }
                                                                                        return employee;
                                                                                }
                                                                                ).collect(Collectors.toList());

        for(Employee employee : allEmployeesWithOnlyLastNameBCapitalized){
            System.out.println(employee.getLastName() + " " + employee.getFirstName());
        }
    }
}
