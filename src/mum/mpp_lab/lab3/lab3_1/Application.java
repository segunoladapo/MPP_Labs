package mum.mpp_lab.lab3.lab3_1;

import java.util.ArrayList;

public class Application {

    public static void main(String[] args) {
        /*
        Employee firstEmployee = new Employee(0001, "Bob", "MI", "Alex",
                "1999-12-12","1111-111", 2000);
        Employee secondEmployee = new Employee(0001, "James", "MI", "Tukur",
                "1994-12-12","1111-111", 4000);
        Department accountDepartment = new Department("Account Department", "Verill Hall");
        Position position = new Position(accountDepartment, "Head of Department", "HOD", firstEmployee);
        accountDepartment.addPosition(position);
        Company company = new Company("MUM_Company");
        company.addDepartment(accountDepartment);
        company.print();
        */

        Employee tom = new Employee(0001, "Tom", "MI", "Eny",
                "1999-12-12","1111-111", 2000);


        Employee sue = new Employee(0001, "Sue", "MI", "Kelly",
                "1999-12-12","1111-111", 2000);


        Employee marc = new Employee(0001, "Marc", "MI", "Macmillian",
                "1999-12-12","1111-111", 2000);

        Employee  bill = new Employee(0001, "Bill", "MI", "Carpenter",
                "1999-12-12","1111-111", 2000);

        Employee dan = new Employee(0001, "Dan", "MI", "Edward",
                "1999-12-12","1111-111", 2000);


        Employee peter = new Employee(0001, "Peter", "MI", "Frank",
                "1999-12-12","1111-111", 2000);


        Employee stan  = new Employee(0001, "Stan", "MI", "Peter",
                "1999-12-12","1111-111", 2000);
        Department salesDepartment = new Department("Sales Department", "Verill Hall");
        Company company = new Company("MUM Manufacturing Company");

        Position tomPOsition = new Position(salesDepartment, "Tom Position","Tom Position", tom);
        Position suePOsition = new Position(salesDepartment, "Sue Position","Sue Position", sue);
        Position marcPOsition = new Position(salesDepartment, "Marc Position","Marc Position", marc);
        Position billPOsition = new Position(salesDepartment, "Bill Position","Bill Position", bill);
        Position danPOsition = new Position(salesDepartment, "Dan Position","Dan Position", dan);
        Position peterPOsition = new Position(salesDepartment, "Peter Position","Peter Position", peter);
        Position stanPOsition = new Position(salesDepartment, "Head of Department","Head of Department", stan);

        billPOsition.setSuperior(peterPOsition);
        danPOsition.setSuperior(peterPOsition);
        tomPOsition.setSuperior(stanPOsition);
        suePOsition.setSuperior(stanPOsition);
        marcPOsition.setSuperior(stanPOsition);
        peterPOsition.setSuperior(peterPOsition);


        peterPOsition.addInferior(billPOsition);
        peterPOsition.addInferior(danPOsition);
        stanPOsition.addInferior(tomPOsition);
        stanPOsition.addInferior(suePOsition);
        stanPOsition.addInferior(marcPOsition);
        stanPOsition.addInferior(peterPOsition);


        salesDepartment.addPosition(stanPOsition);
        salesDepartment.addPosition(danPOsition);
        salesDepartment.addPosition(tomPOsition);
        salesDepartment.addPosition(suePOsition);
        salesDepartment.addPosition(marcPOsition);
        salesDepartment.addPosition(billPOsition);
        salesDepartment.addPosition(peterPOsition);

        //salesDepartment.printReportingHierarchy();
        company.addDepartment(salesDepartment);

        company.printReportingHierarchy();



    }
}
