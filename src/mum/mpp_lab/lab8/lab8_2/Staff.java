package mum.mpp_lab.lab8.lab8_2;


public class Staff extends Person {
    private double salary;

    public Staff(String name, String phone, int age, double salary) {
        this.setName(name);
        this.setPhone(phone);
        this.setAge(age);
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
