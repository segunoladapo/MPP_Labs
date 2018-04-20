package mum.mpp_lab.standard_exam.practice1;

import java.util.ArrayList;
import java.util.List;

public class Employee {
    private String name;
    private List<Account> accounts;

    public Employee(String name) {
        this.name = name;
        accounts = new ArrayList<>();
    }

    public double computeUpdatedBalanceSum() {
        double totalBalance = 0.0;
        for (Account account : accounts) {
            totalBalance += account.computeUpdatedBalance();
        }
        return totalBalance;
    }

    public String getName() {
        return name;
    }

    public void addAccount(Account account) {
        this.accounts.add(account);
    }
}
