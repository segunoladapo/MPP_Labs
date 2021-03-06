package mum.mpp_lab.lab5;

import java.util.Date;

public final class PayCheck {
    private final double grossPay;
    private final double fical;
    private final double local;
    private final double medicare;
    private final double socialSecurity;
    private final double state;
    private final DateRange payDate;

    public PayCheck(double grossPay, double fical, double local, double medicare,
                    double socialSecurity, double state, DateRange payDate) {
        this.grossPay = grossPay;
        this.fical = fical;
        this.local = local;
        this.medicare = medicare;
        this.socialSecurity = socialSecurity;
        this.state = state;
        this.payDate = payDate;
    }

    public void print() {
        payDate.toString();
    }

    public double getNetPay() {
        double netPay = grossPay - (((fical / 100) * grossPay) + ((local / 100) * grossPay) + ((medicare / 100) * grossPay) +
                ((socialSecurity / 100) * grossPay));
        return netPay;
    }
}
