package mum.mpp_lab.lab7;

import mum.mpp_lab.lab3.lab3_1.Position;

import java.util.Objects;

public class Employee {
    private long employeeId;
    private String firstName;
    private String middleInitial;
    private String lastName;
    private String birthDate;
    private String ssn;
    private double salary;
    private Position position;

    public Employee(long employeeId, String firstName, String middleInitial, String lastName,
                    String birthDate, String ssn, double salary) {
        this.employeeId = employeeId;
        this.firstName = firstName;
        this.middleInitial = middleInitial;
        this.lastName = lastName;
        this.birthDate = birthDate;
        this.ssn = ssn;
        this.salary = salary;
    }

    public long getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(long employeeId) {
        this.employeeId = employeeId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleInitial() {
        return middleInitial;
    }

    public void setMiddleInitial(String middleInitial) {
        this.middleInitial = middleInitial;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public String getSsn() {
        return ssn;
    }

    public void setSsn(String ssn) {
        this.ssn = ssn;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }


    public void print() {
        System.out.format("Employee id {%d} Names {%s %s}", employeeId, firstName, lastName);
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }


    @Override
    public String toString() {
        return "[" + firstName + " " + lastName + " " + ssn + "]";
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null)
            return false;
        if (!(this.getClass() == obj.getClass()))
            return false;
        Employee secondEmployee = (Employee) obj;
        return Objects.equals(lastName, secondEmployee.getLastName()) &&
                Objects.equals(firstName, secondEmployee.getLastName()) &&
                Objects.equals(middleInitial, secondEmployee.getMiddleInitial()) &&
                Objects.equals(ssn, secondEmployee.getSsn()) &&
                Objects.equals(birthDate, secondEmployee.getBirthDate()) &&
                Objects.equals(employeeId, secondEmployee.getEmployeeId()) &&
                Objects.equals(salary, secondEmployee.getSalary()) &&
                Objects.equals(position, secondEmployee.getPosition());
    }

    @Override
    public int hashCode() {
        return Objects.hash(lastName, firstName, middleInitial, ssn,
                birthDate, employeeId, salary, position);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Employee employee = (Employee) super.clone();
        employee.salary = salary;
        employee.middleInitial = middleInitial;
        employee.ssn = ssn;
        employee.birthDate = birthDate;
        employee.position = position;
        employee.setLastName(lastName);
        employee.setMiddleInitial(middleInitial);
        employee.setEmployeeId(employeeId);
        return employee;
    }

}
