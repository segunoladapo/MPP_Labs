package mum.mpp_lab.lab5;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by segun on 4/10/2018.
 */
public class Hourly extends Employee {
    private double hourlyWage;
    private int hoursPerWeek;
    private List<Order> orders;

    public Hourly(String empID, double hourlyWage, int hoursPerWeek) {
        super(empID);
        this.hourlyWage = hourlyWage;
        this.hoursPerWeek = hoursPerWeek;
        this.orders = new ArrayList<>();
    }

    public double calcGrossPay(DateRange dateRange) {
        return hourlyWage * hoursPerWeek;
    }
}
