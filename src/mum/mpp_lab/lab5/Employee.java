package mum.mpp_lab.lab5;

public abstract class Employee {
    private String empId;

    public Employee(String empId) {
        this.empId = empId;
    }

    public void print() {
    }

    public PayCheck calcCompensation(int month, int year) {
        return null;
    }

    public abstract void calcGrossPay(DateRange dateRange);

}
