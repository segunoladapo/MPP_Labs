package mum.mpp_lab.lab5;

import java.util.Date;

public final class PayCheck {
    private final Date payPeriod;
    private final double grossPay;
    private final String fical;
    private final String local;
    private final String medicare;
    private final String socialSecurity;

    public PayCheck(Date payPeriod, double grossPay, String fical, String local, String medicare, String socialSecurity){
        this.payPeriod = payPeriod;
        this.grossPay = grossPay;
        this.fical = fical;
        this.local = local;
        this.medicare = medicare;
        this.socialSecurity = socialSecurity;
    }
}
