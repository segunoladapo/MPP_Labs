package mum.mpp_lab.lab8.lab8_3;



import java.util.ArrayList;
import java.util.List;
import java.util.stream.DoubleStream;
import java.util.stream.Stream;

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

        Department marketingDepartment = new Department("Marketing Department", "Dreier Hall");

        Employee gary  = new Employee(0001, "Gary", "MI", "Hillary",
                "1999-12-12","1111-111", 2000);
        Employee anne  = new Employee(0001, "Anne", "MI", "Trump",
                "1999-12-12","1111-111", 2000);
        Position garyPosition = new Position(marketingDepartment, "Gary Position","Tom Position", gary);
        Position annePosition = new Position(marketingDepartment, "Head of Marking Department","Head of Marking Department", anne);
        garyPosition.setSuperior(annePosition);
        annePosition.addInferior(garyPosition);
        marketingDepartment.addPosition(garyPosition);
        marketingDepartment.addPosition(annePosition);

        company.addDepartment(marketingDepartment);

        Employee lyle  = new Employee(0001, "Lyle", "MI", "John",
                "1999-12-12","1111-111", 2000);
        //Position lylePosition = new Position(null, "Top Executive","Top Executive", lyle);

        //salesDepartment.addPosition(lylePosition);
        //marketingDepartment.addPosition(lylePosition);

        //annePosition.setSuperior(lylePosition);
        //stanPOsition.setSuperior(lylePosition);


       // company.printReportingHierarchy();
        printAllEmployeeInDepartmnt(company);





    }

    //Print out each department and the average salary for the department.
    public static void printDeprtmntAndAvgSalary(Company company){
        List<Department> departmentList = company.getDepartments();
        departmentList.forEach( departmnt ->
                            {
                                System.out.println("Department : " + departmnt.getName());
                                double avgSalary = departmnt.getPositions()
                                        .stream()
                                        .map(e-> e.getEmployee().getSalary())
                                        .reduce(0.0, (a , b )-> a + b)/ departmnt.getPositions().size();
                                System.out.println("Average salary is: " + avgSalary);

                            });

    }

    //Print out each department and the maximum salary for the department
    public static void printDeprtmntAndMaxSalary(Company company){
        List<Department> departmentList = company.getDepartments();
        departmentList.forEach( departmnt ->
        {
            System.out.println("Department : " + departmnt.getName());
             DoubleStream stream = departmnt.getPositions().stream()
                                                            .mapToDouble(e-> e.getEmployee().getSalary());
            System.out.println("Maximum salary is: " + stream.max().getAsDouble());
        });

    }

    //Print out each department and all of the employees who work at that department.

    public static void printAllEmployeeInDepartmnt(Company company){
        List<Department> departmentList = company.getDepartments();
        departmentList.forEach( departmnt ->
        {
            System.out.println("Department: " + departmnt.getName());
            departmnt.getPositions()
                    .forEach(position -> {
                        position.print();
                    });
        });
    }
}
