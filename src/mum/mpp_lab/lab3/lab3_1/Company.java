package mum.mpp_lab.lab3.lab3_1;

import java.util.ArrayList;
import java.util.List;

public class Company {
    private String name;
    private List<Department> departments;

    public Company(String name) {
        this.name = name;
        this.departments = new ArrayList<>();
    }

    public void print() {
        System.out.println("Department ->" + this.name);
        for (Department department : departments) {
            department.print();
        }
    }
}
