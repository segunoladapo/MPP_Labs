package mum.mpp_lab.lab5;

import java.util.ArrayList;
import java.util.List;
public class Application {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        Salaried salaried = new Salaried("0001", 34000);
        System.out.println(salaried.calcCompensation(3,2018).getNetPay());

    }
}
