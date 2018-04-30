package mum.mpp_lab.lab8.lab8_3;


import java.util.ArrayList;
import java.util.List;

public class Company {
    private String name;
    private List<Department> departments;

    public Company(String name) {
        this.name = name;
        this.departments = new ArrayList<>();
    }

    public void addDepartment(Department department) {
        this.departments.add(department);
    }

    public double getSalary() {
        double totalSalary = 0.0;
        for (Department department : departments) {
            totalSalary += department.getSalary();
        }
        return totalSalary;
    }

    public void printReportingHierarchy() {
        for (Department department : departments) {
            department.printReportingHierarchy();
        }
    }

    public void print() {
        System.out.println("Company -> " + this.name);
        for (Department department : departments) {
            department.print();
        }
    }

    public List<Department> getDepartments(){
        return this.departments;
    }
}
