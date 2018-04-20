package mum.mpp_lab.standard_exam.practice1;

import java.util.List;

public class Admin {
    public static double computeUpdatedBalanceSum(List<Employee> list) {
        double totalComputedBalance = 0.0;
        for (Employee employee : list) {
            totalComputedBalance += employee.computeUpdatedBalanceSum();
        }
        return totalComputedBalance;
    }
}
