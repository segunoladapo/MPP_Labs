package mum.mpp_lab.standard_exam.practice1;

public class CheckingAccount extends Account {
    private double balance;
    private double monthlyFee;
    private String acctId;

    public CheckingAccount(String acctId, double fee, double startBalance) {
        this.balance = startBalance;
        this.acctId = acctId;
        this.monthlyFee = fee;
    }

    public String getAccountID() {
        return acctId;
    }

    public double getBalance() {
        return balance;
    }

    public double computeUpdatedBalance() {
        return balance - monthlyFee;
    }
}
