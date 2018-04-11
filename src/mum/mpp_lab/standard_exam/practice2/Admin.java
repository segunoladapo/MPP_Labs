package mum.mpp_lab.standard_exam.practice2;

public class Admin {
    //implement
    Department[] departments;

    public Admin(Department[] departments) {
        this.departments = departments;
    }

    public String hourlyCompanyMessage() {
        StringBuilder msgs = new StringBuilder();
        for (Department department : departments) {
            msgs.append(format(department.getName(), department.nextMessage()));
            msgs.append("\n");
        }
        return msgs.toString();
    }

    public String format(String name, String msg) {
        return name + ": " + msg;
    }
}
