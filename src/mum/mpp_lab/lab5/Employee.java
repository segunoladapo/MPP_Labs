package mum.mpp_lab.lab5;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

public abstract class Employee {
    public static final double FICA = 23.0;
    public static final double STATE_TAX = 5.0;
    public static final double LOCAL = 1.0;
    public static final double MEDICARE = 3.0;
    public static final double SOCIAL_SECURITY = 7.5;

    private String empId;
    private List<PayCheck> payChecks;

    public Employee(String empId) {
        this.empId = empId;
        this.payChecks = new ArrayList<>();
    }

    public void print() {
        System.out.println(empId);
    }

    public PayCheck calcCompensation(int month, int year) {
        Date date = new Date(year, month, 1);
        DateRange dateRange = new DateRange(DateRange.getFirstDateOfMonth(date), DateRange.getLastDateOfMonth(date));
        double grossPay = calcGrossPay(dateRange);
        PayCheck payCheck = new PayCheck(grossPay, FICA, LOCAL, MEDICARE, SOCIAL_SECURITY, STATE_TAX, dateRange);
        return payCheck;
    }

    public abstract double calcGrossPay(DateRange dateRange);

}
