package mum.mpp_lab.lab5;

public class Salaried extends Employee {
    private double salary;

    public Salaried(String employID, double salary){
        super(employID);
        this.salary = salary;

    }

    public double calcGrossPay(DateRange dateRange) {
        return salary;
    }
}
