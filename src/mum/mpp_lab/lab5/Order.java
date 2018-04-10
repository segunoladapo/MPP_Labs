package mum.mpp_lab.lab5;

import java.util.Date;

/**
 * Created by segun on 4/10/2018.
 */
public class Order {
    private int orderNo;
    private Date orderDate;
    private double orderAmount;

    public Order(int orderNo, Date orderDate, double orderAmount) {
        this.orderNo = orderNo;
        this.orderDate = orderDate;
        this.orderAmount = orderAmount;
    }

    public Date getOrderDate() {
        return (Date) orderDate.clone();
    }

    public int getOrderNo() {
        return orderNo;
    }

    public double getOrderAmount() {
        return orderAmount;
    }
}
