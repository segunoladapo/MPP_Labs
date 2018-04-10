package mum.mpp_lab.lab5;

import java.util.ArrayList;
import java.util.List;

public class Commissioned extends Employee {
    private List<Order> orders;

    public Commissioned(String employID) {
        super(employID);
        this.orders = new ArrayList<>();

    }

    public double calcGrossPay(DateRange dateRange) {
        double totalOrderAmount = 0.0;
        for (Order order : orders) {
            if (dateRange.isInRange(order.getOrderDate())) {
                totalOrderAmount += order.getOrderAmount();
            }
        }
        double grossPay = 7.0 / totalOrderAmount * 100;
        return grossPay;
    }

    public void addOrder(Order order) {
        orders.add(order);
    }
}

