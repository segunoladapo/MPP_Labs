package mum.mpp_lab.lab3.lab3_1;

public class Position {
    private Department department;
    private String description;
    private String title;
    private Employee employee;

    public Position(Department department, String description, String title, Employee employee) {
        this.department = department;
        this.description = description;
        this.title = title;
        this.employee = employee;
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

    public double getSalary(){
        return employee.getSalary();
    }

    public void print() {
        System.out.format("Position -> %s ", description);
        System.out.println();
        employee.print();
    }
}
