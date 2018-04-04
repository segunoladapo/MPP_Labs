package mum.mpp_lab.lab3.lab3_1;

import java.util.ArrayList;
import java.util.List;

public class Position {
    private Department department;
    private String description;
    private String title;
    private Employee employee;
    private List<Position> inferiors;

    public Position(Department department, String description, String title, Employee employee) {
        this.department = department;
        this.description = description;
        this.title = title;
        this.employee = employee;
        inferiors = new ArrayList<>();
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public double getSalary() {
        return employee.getSalary();
    }

    public void addInferior(Position position) {
        this.inferiors.add(position);
    }

    public void printDownLine() {
        System.out.println("Position -> " + title + " Description ->" + description + " Employee Name -> " +
                employee.getFirstName() + " " + employee.getLastName());
        for (Position inferiorPosition : inferiors) {
            inferiorPosition.printDownLine();
        }
    }

    public void print() {
        System.out.format("Position -> %s ", description);
        System.out.println();
        employee.print();
    }
}
