package mum.mpp_lab.lab8.lab8_3;



import java.util.ArrayList;
import java.util.List;

public class Department {
    private String name;
    private String location;
    private List<Position> positions;
    private Company company;

    public Department(String name, String location) {
        this.setName(name);
        this.setLocation(location);
        this.positions = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public List<Position> getPositions() {
        return positions;
    }

    public void addPosition(Position position) {
        this.positions.add(position);
    }

    public double getSalary() {
        double totalSalary = 0.0;
        for (Position position : positions) {
            totalSalary += position.getSalary();
        }
        return totalSalary;
    }

    public void print() {
        System.out.println("Department -> " + this.name);
        for (Position position : positions) {
            position.print();
        }
    }

    public void printReportingHierarchy() {
        int level = 0;
        for (Position position : positions) {
            if(position.getSuperior() == null) {
                position.printDownLine(level);
            }
        }
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Department)) {
            return false;
        }
        Department department = (Department) obj;
        if (this.name.equals(department.getName())) {
            return true;
        }
        return false;
    }


    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }
}
