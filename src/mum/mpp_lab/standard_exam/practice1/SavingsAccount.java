package mum.mpp_lab.standard_exam.practice1;

public class SavingsAccount extends Account {
    private double balance;
    private double interestRate;
    private String acctId;

    public SavingsAccount(String acctId, double interestRate, double startBalance) {
        this.balance = startBalance;
        this.acctId = acctId;
        this.interestRate = interestRate;
    }

    public String getAccountID() {
        return acctId;
    }

    public double getBalance() {
        return balance;
    }

    public double computeUpdatedBalance() {
        return balance + (interestRate * balance);
    }
}
